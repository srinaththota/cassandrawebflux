package com.cassandra.cassandrawebflux.handler;

import com.cassandra.cassandrawebflux.model.ChatMessage;
import com.cassandra.cassandrawebflux.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ChatHandler {
    @Autowired
    private ChatService chatService;

    public Mono<ServerResponse> createChatMessage(ServerRequest serverRequest){
        final Mono<ChatMessage> project = serverRequest.bodyToMono(ChatMessage.class);
        return project.flatMap(chatService::createChatMessage).flatMap(data->ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(data));
    }

    public Mono<ServerResponse> findAllChatMessages(ServerRequest serverRequest){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(chatService.findAll(),ChatMessage.class).log();
    }
}
