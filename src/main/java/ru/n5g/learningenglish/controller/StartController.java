package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.AbcExerciseViewImpl;
import ru.n5g.learningenglish.view.StartView;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class StartController {
    private StartView startView;
    public StartController(StartView startView) {
        this.startView = startView;
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
        new AbcExerciseViewImpl();
    }

    /**
     * Диктовка цифр с 1 до 10
     */
    public void clickNumberFrom1To10Exercise() {

    }

    /**
     * Диктовка цифр с 1 до 1.999.999.999
     */
    public void clickNumberFrom1To1999999999Exercise() {

    }

    /**
     * Диктовка числительных с 1 до 31
     */
    public void clickNumberFrom1stTo31thExercise() {

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

    }

    /**
     * Диктовка названия месяцов
     */
    public void clickMonthExercise() {

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
}
