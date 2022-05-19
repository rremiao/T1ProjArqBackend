package com.bcopstein.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;
import com.bcopstein.business.entity.Produto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/vendas")
public class VendaController {
  private final List<Produto> produtos;
  private final List<String> vendasEfetuadas;
  private final Map<String,Integer> cacheFrete; 

  public VendaController() {
    // Cria cache frete
    cacheFrete = new HashMap<>();
    // Cria e carrega o estoque
    produtos = new ArrayList<>();
    produtos.add(new Produto(10, "Geladeira", 2500.0, 10, "ata", "A"));
    produtos.add(new Produto(20, "Fogao", 1200.0, 0, "ata", "A"));
    produtos.add(new Produto(30, "Lava louça", 4300.0, 7, "ata", "A"));
    produtos.add(new Produto(40, "Lava roupa", 3350.0, 11, "ata", "A"));
    produtos.add(new Produto(50, "Aspirador de pó", 780.0, 22, "ata", "A"));

    // Cria a lista de vendas efetuadas
    vendasEfetuadas = new ArrayList<>();
  }

  @PostMapping("/confirmacao")
  @CrossOrigin(origins = "*")
  public boolean confirmaVenda(@RequestBody final List<ItemCarrinhoDTO> itens) {

    ArrayList<Produto> listaProdutos = new ArrayList<>();
    ArrayList<Integer> listaQtdades = new ArrayList<>();

    for (ItemCarrinhoDTO item : itens) {
      final Produto produto =
          produtos.stream().filter(p -> p.getCodigo() == item.getCodigo()).findAny().orElse(null);

      if (produto == null) {
        return false;
      }

      listaQtdades.add(item.getQuantidade());
      listaProdutos.add(produto);
    }

    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < listaProdutos.size(); i++) {
      final Produto produto = listaProdutos.get(i);
      final int qtdade = listaQtdades.get(i);
      produto.saidaDeProduto(qtdade);

      builder.append(produto.getCodigo());
      builder.append(" ");
      builder.append(produto.getDescricao());
      builder.append(" ");
      builder.append(qtdade);
      builder.append("\n");
    }

    vendasEfetuadas.add(builder.toString());
    return true;
  }

  @PostMapping("/subtotal")
  @CrossOrigin(origins = "*")
  public PrecosDTO calculaSubtotal(@RequestBody final ParamSubtotal_DTO param) {
    Integer subtotal = 0;
    Integer imposto = 0;
    PrecosDTO response = new PrecosDTO();

    System.out.println(param.getEndereco());

    // Verifica se o endereço é invalido
    if (param.getEndereco() == null || 
        param.getEndereco().isEmpty() ||
        param.getEndereco().isBlank()){
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Endereco invalido");
    }
    // Verifica se o endereço já está na cache
    if (!cacheFrete.keySet().contains(param.getEndereco())){
      // Calcula o frete 
      cacheFrete.put(param.getEndereco(),25);
    }

    for (final ItemCarrinhoDTO it : param.getItens()) {
      // Procurar o produto pelo código
      final Produto prod =
          produtos.stream().filter(p -> p.getCodigo() == it.getCodigo()).findAny().orElse(null);

      if (prod != null) {
        subtotal += (int) (prod.getPreco() * it.getQuantidade());
      } else {
        throw new IllegalArgumentException("Codigo invalido");
      }
    }
    imposto = (int) (subtotal * 0.1);
    double frete = cacheFrete.get(param.getEndereco());
    response.withSubtotal(subtotal)
            .withImposto(imposto)
            .withFrete(frete)
            .withTotal(subtotal + imposto + frete);

    return response;
  }}