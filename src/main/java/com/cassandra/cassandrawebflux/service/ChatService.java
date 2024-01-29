package com.cassandra.cassandrawebflux.service;


import com.cassandra.cassandrawebflux.model.ChatMessage;
import org.objectweb.asm.tree.ModuleNode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ChatService {
    Flux<ChatMessage> findAll();
    Mono<ChatMessage> createChatMessage(ChatMessage message);
}
