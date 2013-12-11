package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.AbcExerciseController;
import ru.n5g.learningenglish.controller.StartController;

import javax.swing.*;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseViewImpl implements AbcExerciseView{
    private AbcExerciseController controller;


    public AbcExerciseViewImpl() {
        this.controller = new AbcExerciseController(this);
        initComponents();
    }

    private void initComponents() {
        JFrame frame = new JFrame("Диктовка английского алфовита");
        frame.setBounds(400, 400, 400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        controller.startLesson();
    }
}
