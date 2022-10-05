package com.devsuperior.bds02.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StandardError implements Serializable {
    //Essa é uma classe padrão de erro que tem os mesmos atributos de um erro que é retornado
    //quando fizemos uma requisição http
    private Instant timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}