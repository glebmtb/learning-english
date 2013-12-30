package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.util.StupidRandom;
import ru.n5g.learningenglish.util.WordRandom;
import ru.n5g.learningenglish.view.ExerciseView;
import ru.n5g.learningenglish.words.Words;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gleb Belyaev
 */
public class ExerciseControllerAbsImpl extends ExerciseControllerAbs {
    private Words<String, String> words;
    protected String rusWord;
    private WordRandom<String> random;
    private Map<String, Integer> studiedWordsMap;
    private int studiedWords;

    public ExerciseControllerAbsImpl(ExerciseView view, Words<String, String> words) {
        super(view);
        this.words = words;
        random = new StupidRandom<String>(words);
        studiedWordsMap = getStudiedWordsMap(words.getListRusWord());
    }

    @Override
    protected Integer getTotalQuestions() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected String getRightAnswer() {
        String engWord = words.translate(rusWord);
        if (words.isSound())
            Mp3Player.play(words.pathSound(), engWord);
        return engWord;
    }

    @Override
    protected String getNewQuestion() {
        rusWord = random.getRandomWord();
        return rusWord;
    }

    @Override
    protected void nextQuestion() {
        super.nextQuestion();
        view.setCounterRepetition(studiedWords + "/" + words.size());
    }

    @Override
    public void clickStart() {
        super.clickStart();
        studiedWords = 0;
    }

    private Map<String, Integer> getStudiedWordsMap(List<String> list) {
        Map<String, Integer> smartRandom = new HashMap<String, Integer>();
        for (String key : list) {
            smartRandom.put(key, 0);
        }
        return smartRandom;
    }
}
