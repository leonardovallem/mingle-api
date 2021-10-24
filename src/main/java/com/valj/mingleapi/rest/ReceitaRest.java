package com.valj.mingleapi.rest;

import com.valj.mingleapi.model.Receita;
import com.valj.mingleapi.service.ReceitaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/receitas")
@AllArgsConstructor
public class ReceitaRest {
    private ReceitaService service;

    @GetMapping
    public ResponseEntity<List<Receita>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
