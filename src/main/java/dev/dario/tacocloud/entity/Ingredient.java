package dev.dario.tacocloud.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("ingredients")
public class Ingredient {

    @PrimaryKey
    private String id; // Ingredient ID (e.g., FLTO, GRBF)

    private String name; // Ingredient name

    private String type; // Ingredient type (WRAP, PROTEIN, etc.)
}
