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

    private JLabel counterRepetitionLabel;
    private JLabel correctAnswersTextStartLabel;
    private JLabel correctAnswersLabel;
    private JLabel correctAnswersTextFromLabel;
    private JLabel passedQuestionsLabel;
    private JLabel enteringLetterTextStartLabel;
    private JTextField enteringLetterText;
    private JLabel inputResultLabel;

    private JButton replaceButton;
    private JButton nextButton;


    public AbcExerciseViewImpl() {
        this.controller = new AbcExerciseController(this);
        initComponents();
    }

    /**
     * Портатип страницы
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

        counterRepetitionLabel = new JLabel();
        counterRepetitionLabel.setBounds(20, 15, 30, 20);
        counterRepetitionLabel.setVisible(false);

        correctAnswersTextStartLabel = new JLabel("Правельных ответов:");
        correctAnswersTextStartLabel.setBounds(120, 15, 140, 20);
        correctAnswersTextStartLabel.setVisible(false);

        correctAnswersLabel = new JLabel();
        correctAnswersLabel.setBounds(270, 15, 10, 20);
        correctAnswersLabel.setVisible(false);

        correctAnswersTextFromLabel = new JLabel("из:");
        correctAnswersTextFromLabel.setBounds(290, 15, 20, 20);
        correctAnswersTextFromLabel.setVisible(false);

        passedQuestionsLabel = new JLabel();
        passedQuestionsLabel.setBounds(320, 15, 10, 20);
        passedQuestionsLabel.setVisible(false);

        enteringLetterTextStartLabel = new JLabel("Введите букву которая прозвучала:");
        enteringLetterTextStartLabel.setBounds(25, 45, 235, 20);
        enteringLetterTextStartLabel.setVisible(false);

        enteringLetterText = new JTextField();
        enteringLetterText.setBounds(265, 45, 20, 20);
        enteringLetterText.setVisible(false);

        //24pic
        Icon inputResultIcon;
        inputResultIcon = new ImageIcon();
        inputResultLabel = new JLabel();
        inputResultLabel.setBounds(295, 42, 24, 24);
        inputResultLabel.setVisible(false);

        replaceButton = new JButton("Повторить");
        replaceButton.setBounds(20, 80, 110, 25);
        replaceButton.setVisible(false);

        nextButton = new JButton("Следующая буква");
        nextButton.setBounds(150, 80, 180, 25);
        nextButton.setVisible(false);

        JFrame frame = new JFrame("Диктовка английского алфовита");
        frame.setBounds(400, 400, 350, 150);
        frame.setLayout(null);

        frame.add(startButton);

        frame.add(counterRepetitionLabel);
        frame.add(correctAnswersTextStartLabel);
        frame.add(correctAnswersLabel);
        frame.add(correctAnswersTextFromLabel);
        frame.add(passedQuestionsLabel);
        frame.add(enteringLetterTextStartLabel);
        frame.add(enteringLetterText);
        frame.add(inputResultLabel);
        frame.add(replaceButton);
        frame.add(nextButton);

        frame.setVisible(true);
    }

    @Override
    public void setVisibleStartPage(boolean isVisible) {
        startButton.setVisible(isVisible);
    }

    @Override
    public void setVisibleLessonPage(boolean isVisible) {
        counterRepetitionLabel.setVisible(isVisible);
        correctAnswersTextStartLabel.setVisible(isVisible);
        correctAnswersLabel.setVisible(isVisible);
        correctAnswersTextFromLabel.setVisible(isVisible);
        passedQuestionsLabel.setVisible(isVisible);
        enteringLetterTextStartLabel.setVisible(isVisible);
        enteringLetterText.setVisible(isVisible);
        inputResultLabel.setVisible(isVisible);
        replaceButton.setVisible(isVisible);
        nextButton.setVisible(isVisible);

        if (isVisible)
            enteringLetterText.grabFocus();
    }

    @Override
    public void setCounterRepetition(String counterRepetition) {
        counterRepetitionLabel.setText(counterRepetition);
    }

    @Override
    public void setCorrectAnswers(String correctAnswers) {
        correctAnswersLabel.setText(correctAnswers);
    }

    @Override
    public void setPassedQuestions(String passedQuestions) {
        passedQuestionsLabel.setText(passedQuestions);
    }
}
