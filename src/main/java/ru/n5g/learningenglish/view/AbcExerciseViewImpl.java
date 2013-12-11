package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.AbcExerciseController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseViewImpl implements AbcExerciseView {
    private AbcExerciseController controller;
    private JButton startButton;

    public AbcExerciseViewImpl() {
        this.controller = new AbcExerciseController(this);
        initComponents();
    }

    /**
     * http://joxi.ru/qymoUv3JTJC-IcBiTYw
     */
    private void initComponents() {


        startButton = new JButton("Начать");
        startButton.setBounds(75, 30, 200, 40);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickStart();
            }
        });

        JFrame frame = new JFrame("Диктовка английского алфовита");
        frame.setBounds(400, 400, 350, 150);
        frame.setLayout(null);
        frame.add(startButton);
        frame.setVisible(true);

    }

    @Override
    public void setVisibleButtonStart(boolean isVisible) {
        startButton.setVisible(isVisible);
    }
}
