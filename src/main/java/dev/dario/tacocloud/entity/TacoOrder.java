package dev.dario.tacocloud.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Table("orders")
public class TacoOrder {

    @PrimaryKey
    private UUID id = UUID.randomUUID();

    private Instant placedAt = Instant.now(); // Order placement timestamp

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;

    private String ccNumber; // Credit card number
    private String ccExpiration; // Credit card expiration date
    private String ccCVV; // Credit card CVV

    private List<UUID> tacos = new ArrayList<>(); // List of taco IDs

    public void addTaco(Taco taco) {
        this.tacos.add(taco.getId()); // Add the Taco's UUID
    }
}
