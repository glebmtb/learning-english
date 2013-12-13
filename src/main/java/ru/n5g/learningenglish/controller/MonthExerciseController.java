package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.Months;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.Months.getRandomMonth;
import static ru.n5g.learningenglish.util.Months.translateMonth;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class MonthExerciseController extends ExerciseControllerAbs {

    private String month;


    //TODO прикрутить звук после ответа
    //http://englishon-line.narod.ru/grammatika-spravochnik24.html

    public MonthExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected String getRightAnswer() {
        return translateMonth(month);
    }

    @Override
    protected String getNewQuestion() {
        month = getRandomMonth();
        return month;
    }
}
