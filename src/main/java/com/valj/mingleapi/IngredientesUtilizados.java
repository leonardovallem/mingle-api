package com.valj.mingleapi;

import com.valj.mingleapi.model.Ingrediente;
import lombok.Data;

@Data
public class IngredientesUtilizados {
    private Ingrediente ingrediente;
    private int quantidade;
    private String unidade;
}
