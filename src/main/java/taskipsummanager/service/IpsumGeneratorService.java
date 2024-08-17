//package com.taskipsum.service;
package taskipsummanager.service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class IpsumGeneratorService {

    private List<String> customWords = Arrays.asList("bacon", "eggs", "sausage", "ham", "pork", "steak");
    private List<String> fillerWords = Arrays.asList("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit");

    public String generateIpsum(int paragraphs, boolean startWithLorem) {
        return IntStream.range(0, paragraphs)
            .mapToObj(i -> generateParagraph(i == 0 && startWithLorem))
            .collect(Collectors.joining("\n\n"));
    }

    private String generateParagraph(boolean startWithLorem) {
        List<String> sentences = IntStream.range(0, randomInt(3, 6))
            .mapToObj(i -> generateSentence(i == 0 && startWithLorem))
            .collect(Collectors.toList());
        return String.join(" ", sentences);
    }

    private String generateSentence(boolean startWithLorem) {
        List<String> words = new ArrayList<>();
        if (startWithLorem) {
            words.addAll(Arrays.asList("Lorem", "ipsum", "dolor", "sit", "amet"));
        }
        int wordCount = randomInt(5, 15);
        for (int i = 0; i < wordCount; i++) {
            words.add(randomWord());
        }
        String sentence = String.join(" ", words);
        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1) + ".";
    }

    private String randomWord() {
        List<String> allWords = new ArrayList<>(customWords);
        allWords.addAll(fillerWords);
        return allWords.get(new Random().nextInt(allWords.size()));
    }

    private int randomInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public void setCustomWords(List<String> customWords) {
        this.customWords = customWords;
    }

    public void setFillerWords(List<String> fillerWords) {
        this.fillerWords = fillerWords;
    }

    public Object generateBaconIpsum() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateBaconIpsum'");
    }
}
