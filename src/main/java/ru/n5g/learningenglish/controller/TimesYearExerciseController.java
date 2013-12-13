package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.TimesYears.getRandomTimesYear;
import static ru.n5g.learningenglish.util.TimesYears.translateTimesYear;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimesYearExerciseController extends ExerciseControllerAbs {
    private String timesYear;

    public TimesYearExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected String getRightAnswer() {
        return translateTimesYear(timesYear);
    }

    @Override
    protected String getNewQuestion() {
        timesYear = getRandomTimesYear();
        return timesYear;
    }
}
