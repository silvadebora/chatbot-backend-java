package br.com.backend.chatbot.controllers;

import br.com.backend.chatbot.dto.MessageRequest;
import br.com.backend.chatbot.utils.FaqAnswers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @PostMapping
    public ResponseEntity<String> answerQuestion(@RequestBody MessageRequest request){
        FaqAnswers faqAnswers = new FaqAnswers();
        System.out.println(faqAnswers.getAnswers().get(0).getAnswer());
        return ResponseEntity.ok("certo");
    }
}
