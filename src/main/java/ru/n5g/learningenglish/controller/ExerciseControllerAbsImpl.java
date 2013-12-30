package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.util.StupidRandom;
import ru.n5g.learningenglish.util.WordRandom;
import ru.n5g.learningenglish.view.ExerciseView;
import ru.n5g.learningenglish.words.Words;

/**
 * @author Gleb Belyaev
 */
public class ExerciseControllerAbsImpl extends ExerciseControllerAbs {
    private Words<String, String> words;
    protected String rusWord;
    private WordRandom<String> random;

    public ExerciseControllerAbsImpl(ExerciseView view, Words<String, String> words) {
        super(view);
        this.words = words;
        random = new StupidRandom<String>(words);
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsAdverbsOfFrequency;
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
}
