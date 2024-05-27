package br.com.backend.chatbot.domain;

import java.util.List;


public class FaqAnswer {

    private List<String> keywords;
    private String answer;

    public FaqAnswer() {

    }

    public FaqAnswer(List<String> keywords, String answer) {
        this.keywords = keywords;
        this.answer = answer;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
