package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.ExerciseControllerAbsImpl;
import ru.n5g.learningenglish.util.RandomAndTranslate;
import ru.n5g.learningenglish.words.Words;

import javax.swing.*;

/**
 * @author Belyaev
 */
public class ExerciseViewImpl extends ExerciseViewAbs {
    protected ExerciseControllerAbsImpl controller;
    protected JLabel studiedLabel;


    public ExerciseViewImpl(Words<String, String> words) {
        controller = new ExerciseControllerAbsImpl(this, words);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        studiedLabel = new JLabel("Изучено:");
        studiedLabel.setBounds(20, 15, 55, 20);
        studiedLabel.setVisible(false);
        frame.add(studiedLabel);

        counterRepetitionLabel.setBounds(73, 15, 60, 20);
    }

    @Override
    protected void clickNext() {
        controller.clickNext();
    }

    @Override
    protected void clickVerify() {
        controller.clickVerify();
    }

    @Override
    protected void clickEnterInInputField() {
        controller.clickEnterInInputField();
    }

    @Override
    protected void clickStart() {
        controller.clickStart();
    }

    @Override
    public void setVisibleLessonPage(boolean isVisible) {
        super.setVisibleLessonPage(isVisible);
        studiedLabel.setVisible(isVisible);
    }
}
