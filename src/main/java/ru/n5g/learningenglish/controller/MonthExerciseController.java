package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.Months.getRandomMonth;
import static ru.n5g.learningenglish.util.Months.translateMonth;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class MonthExerciseController extends ExerciseControllerAbs {

    private String month;


    public MonthExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsMonth;
    }

    @Override
    protected String getRightAnswer() {
        String translate = translateMonth(month);
        Mp3Player.play("month/" + translate);
        return translate;
    }

    @Override
    protected String getNewQuestion() {
        month = getRandomMonth();
        return month;
    }
}
