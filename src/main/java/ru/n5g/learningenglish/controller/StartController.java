package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.*;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class StartController {

    public StartController(StartView startView) {

    }

    /**
     * Все занятия
     */
    public void clickAllExercises() {

    }

    /**
     * Диктовка алфавита
     */
    public void clickAbcExercise() {
        new AbcExerciseView();
    }

    /**
     * Диктовка цифр с 1 до 10
     */
    public void clickNumberFrom0To100Exercise() {
        new NumberFrom0To100ExerciseView();
    }

    /**
     * Диктовка цифр с 1 до 1.999.999.999
     */
    public void clickNumberFrom1To1999999999Exercise() {
        new NumberFrom0ToMoreExerciseView();
    }

    /**
     * Диктовка числительных с 1 до 31
     */
    public void clickNumberFrom1stTo31thExercise() {
        new NumeralExerciseView();
    }

    /**
     * Диктовка времени
     */
    public void clickClockExercise() {

    }

    /**
     * Диктовка дней недели
     */
    public void clickDaysWeekExercise() {
        new DaysWeekExerciseView();
    }

    /**
     * Диктовка названия месяцов
     */
    public void clickMonthExercise() {
        new MonthExerciseView();
    }

    /**
     * Диктовка цифр года
     */
    public void clickYearExercise() {

    }

    /**
     * Показать результаты
     */
    public void clickResult() {

    }

    /**
     * Открыть настройки
     */
    public void clickSettings() {

    }

    /**
     * Времена года
     */
    public void clickTimesYearExercise() {
        new TimesYearExerciseView();
    }

    /**
     * Неправельные глаголы
     */
    public void clickIrregularVerbsExercise() {
        new IrregularVerbsView();
    }

    /**
     * время суток
     */
    public void clickTimeDayExercise() {
        new TimeDayExerciseView();
    }

    public void clickAdverbsOfFrequencyExercise() {
        new AdverbsOfFrequencyExerciseView();
    }

    public void clickQuestionWordsExercise() {
        new QuestionWordsView();
    }

    /**
     * числа от 0 до 19
     */
    public void clickNumberFrom1To19Exercise() {
        new NumberFrom0To19ExerciseView();
    }
}
