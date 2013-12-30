package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.util.StupidRandom;
import ru.n5g.learningenglish.util.WordRandom;
import ru.n5g.learningenglish.view.ExerciseView;
import ru.n5g.learningenglish.words.TimeDaysWords;
import ru.n5g.learningenglish.words.Words;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimeDayExerciseController extends ExerciseControllerAbs {
    private String timeDay;
    private WordRandom<String> stupidRandom;
    private Words<String, String> words;

    public TimeDayExerciseController(ExerciseView view) {
        super(view);
        words = new TimeDaysWords();
        stupidRandom = new StupidRandom<String>(words);
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsTimeDay;
    }

    @Override
    protected String getRightAnswer() {
        String translate = words.translate(timeDay);
        Mp3Player.play("timeday/" + translate);
        return translate;
    }

    @Override
    protected String getNewQuestion() {
        timeDay = stupidRandom.getRandomWord();
        return timeDay;
    }
}
