package br.com.backend.chatbot.controllers;

import br.com.backend.chatbot.dto.MessageRequest;
import br.com.backend.chatbot.dto.MessageResponse;
import br.com.backend.chatbot.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private AnswerService service;

    @PostMapping
    public ResponseEntity<MessageResponse> answerQuestion(@RequestBody MessageRequest request){
        String answer = this.service.getAnswer(request.message());
        return ResponseEntity.ok(new MessageResponse(answer));
    }
}
