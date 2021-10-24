package com.valj.mingleapi.service;

import com.valj.mingleapi.model.Receita;
import com.valj.mingleapi.repository.ReceitaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReceitaService {
    private ReceitaRepository repository;

    public List<Receita> getAll() {
        return repository.findAll();
    }
}
