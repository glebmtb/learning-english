package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.PlayerMpr3;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.TimeDays.getRandomTimeDay;
import static ru.n5g.learningenglish.util.TimeDays.translateTimeDay;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimeDayExerciseController extends ExerciseControllerAbs {
    private String timeDay;

    public TimeDayExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsTimeDay;
    }

    @Override
    protected String getRightAnswer() {
        String translate = translateTimeDay(timeDay);
        PlayerMpr3.play("timeday/" + translate);
        return translate;
    }

    @Override
    protected String getNewQuestion() {
        timeDay = getRandomTimeDay();
        return timeDay;
    }
}
