package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.Mp3Player;
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
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsTimesYear;
    }

    @Override
    protected String getRightAnswer() {
        String translate = translateTimesYear(timesYear);
        Mp3Player.play("timesyear/" + translate);
        return translate;
    }

    @Override
    protected String getNewQuestion() {
        timesYear = getRandomTimesYear();
        return timesYear;
    }
}
