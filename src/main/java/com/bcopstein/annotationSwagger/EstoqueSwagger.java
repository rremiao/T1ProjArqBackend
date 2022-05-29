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
@Operation(description = "API para Retornar estoque")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Retorno OK estoque encontradas"),
        @ApiResponse(responseCode = "404", description = "Nenhuma estoque encontrada"),
})
public @interface EstoqueSwagger {
}
