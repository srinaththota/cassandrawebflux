package com.cassandra.cassandrawebflux.service;

import com.cassandra.cassandrawebflux.model.ChatMessage;
import com.cassandra.cassandrawebflux.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ChatServiceImpl implements ChatService{

    @Autowired
    private ChatMessageRepository chatMessageRepository;
    @Override
    public Flux<ChatMessage> findAll() {
        return chatMessageRepository.findAll();
    }

    @Override
    public Mono<ChatMessage> createChatMessage(ChatMessage message) {
        return chatMessageRepository.save(message);
    }


}
