package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.words.PrepositionsOfPlaceWords;

/**
 * Gleb Belyaev
 * 1/14/14.
 */
public class PrepositionsOfPlaceView extends ExerciseViewImpl {

    public PrepositionsOfPlaceView() {
        super(new PrepositionsOfPlaceWords());
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        frame.setTitle("Предлоги места");
        commandInfoLabel.setText("Введите предлог места на английском:");
        commandInfoLabel.setBounds(30, 35, 300, 20);
    }
}
