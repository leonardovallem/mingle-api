package com.valj.mingleapi.model;

import com.mongodb.lang.NonNull;
import com.valj.mingleapi.IngredientesUtilizados;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "receitas")
@Data
public class Receita {
    @Id
    private String _id;
    @NonNull
    private String nome;
    @NonNull
    private List<IngredientesUtilizados> ingredientes;
    @NonNull
    private List<String> preparo;
}
