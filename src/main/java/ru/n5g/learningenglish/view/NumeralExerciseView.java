package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.NumeralsWords;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class NumeralExerciseView extends ExerciseViewImpl {

    public NumeralExerciseView() {
        super(new NumeralsWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Диктовка числительных");
        commandInfoLabel.setText("Введите числительное на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
