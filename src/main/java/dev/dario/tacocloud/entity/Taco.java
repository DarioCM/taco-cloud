package dev.dario.tacocloud.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Table("tacos")
public class Taco {

    @PrimaryKey
    private UUID id = UUID.randomUUID();

    private String name; // Taco name

    private Instant createdAt = Instant.now(); // Creation timestamp

    private List<String> ingredients; // List of ingredient IDs
}
