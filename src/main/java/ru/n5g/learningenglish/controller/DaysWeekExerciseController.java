package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.DaysWeeks.getRandomDaysWeek;
import static ru.n5g.learningenglish.util.DaysWeeks.translateDaysWeek;


/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class DaysWeekExerciseController extends  ExerciseControllerAbs{

    private String daysWeek;

    public DaysWeekExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected String getRightAnswer() {
        return translateDaysWeek(daysWeek);
    }

    @Override
    protected String getNewQuestion() {
        daysWeek = getRandomDaysWeek();
        return daysWeek;
    }
}
