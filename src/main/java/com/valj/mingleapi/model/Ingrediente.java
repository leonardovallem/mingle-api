package com.valj.mingleapi.model;

import com.mongodb.lang.NonNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ingredientes")
@Data
public class Ingrediente {
    @Id
    private String _id;
    @NonNull
    private String nome;
    @NonNull
    private String unidade;
}
