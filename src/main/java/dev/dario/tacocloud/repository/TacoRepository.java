package dev.dario.tacocloud.repository;

import dev.dario.tacocloud.entity.Taco;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface TacoRepository
extends CassandraRepository<Taco, UUID> {
}
