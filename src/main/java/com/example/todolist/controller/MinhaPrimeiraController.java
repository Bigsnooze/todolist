package com.example.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("/minhaPrimeiraRota")
public class MinhaPrimeiraController {
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";

    }

    
}
   