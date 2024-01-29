package com.cassandra.cassandrawebflux.repository;

import com.cassandra.cassandrawebflux.model.ChatKey;
import com.cassandra.cassandrawebflux.model.ChatMessage;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface ChatMessageRepository extends ReactiveCassandraRepository<ChatMessage, ChatKey> {
}
