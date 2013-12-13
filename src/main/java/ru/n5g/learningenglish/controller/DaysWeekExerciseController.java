package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.PlayerMpr3;
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
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsDaysWeek;
    }

    @Override
    protected String getRightAnswer() {
        String translate = translateDaysWeek(daysWeek);
        PlayerMpr3.play("daysweek/" + translate);
        return translate;
    }

    @Override
    protected String getNewQuestion() {
        daysWeek = getRandomDaysWeek();
        return daysWeek;
    }
}
