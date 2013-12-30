package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.TimesYearsWords;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimesYearExerciseView extends ExerciseViewImpl {

    public TimesYearExerciseView() {
        super(new TimesYearsWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка название времен года");
        commandInfoLabel.setText("Введите название времени года на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
