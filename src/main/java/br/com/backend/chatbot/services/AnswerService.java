package br.com.backend.chatbot.services;

import br.com.backend.chatbot.domain.FaqAnswer;
import br.com.backend.chatbot.utils.FaqAnswers;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AnswerService {

    private FaqAnswers faqAnswers = new FaqAnswers();

    public String getAnswer(String message){
        String[] words = message.toLowerCase().split("\\s+");
        List wordsList = Arrays.asList(words);
        for(FaqAnswer answer : faqAnswers.getAnswers()){
            for(String keyword: answer.getKeywords()){
                if(wordsList.contains(keyword)){
                    return answer.getAnswer();
                }
            }

        }
        return faqAnswers.getDefaultAnswer();
    }
}
