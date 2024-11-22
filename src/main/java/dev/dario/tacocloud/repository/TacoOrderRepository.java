package dev.dario.tacocloud.repository;

import dev.dario.tacocloud.entity.TacoOrder;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface TacoOrderRepository extends CassandraRepository<TacoOrder, UUID> {
}
