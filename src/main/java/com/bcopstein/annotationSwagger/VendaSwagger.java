package com.bcopstein.annotationSwagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Operation(description = "API para Venda")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Retorno OK vendas encontradas"),
        @ApiResponse(responseCode = "201", description = "Retorno CREATED para inserção de confirmação de venda"),
        @ApiResponse(responseCode = "201", description = "Retorno CREATED para inserção de subtotal de venda"),
        @ApiResponse(responseCode = "404", description = "Nenhuma campanha foi encontrada")
})
public @interface VendaSwagger {

}
