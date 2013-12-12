package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.NumberFrom0To20ExerciseController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0To20ExerciseViewImpl implements NumberFrom0To20ExerciseView {
    private NumberFrom0To20ExerciseController controller;

    private JButton startButton;
    private JLabel resultTestTextLabel;
    private JLabel resultTestLabel;

    private JLabel counterRepetitionLabel;
    private JLabel correctAnswersTextStartLabel;
    private JLabel correctAnswersLabel;
    private JLabel correctAnswersTextFromLabel;
    private JLabel passedQuestionsLabel;

    private JLabel commandInfoLabel;
    private JLabel textForInputLabel;
    private JLabel rightAnswerLabel;
    private JTextField inputFieldResponse;
    private JLabel inputResultLabel;

    private JButton verifyButton;
    private JButton nextButton;

    public NumberFrom0To20ExerciseViewImpl() {
        controller = new NumberFrom0To20ExerciseController(this);
        initComponents();
    }

    /**
     * Протатип
     * http://joxi.ru/TaypUv3JTJDAIVQRmQs
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
        startButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    controller.clickStart();
                }
            }
        });

        resultTestTextLabel = new JLabel("Ваше результат:");
        resultTestTextLabel.setBounds(30, 125, 110, 20);
        resultTestTextLabel.setVisible(false);

        resultTestLabel = new JLabel();
        resultTestLabel.setBounds(140, 125, 200, 20);
        resultTestLabel.setVisible(false);

        counterRepetitionLabel = new JLabel();
        counterRepetitionLabel.setBounds(20, 15, 40, 20);
        counterRepetitionLabel.setVisible(false);

        correctAnswersTextStartLabel = new JLabel("Правельных ответов:");
        correctAnswersTextStartLabel.setBounds(120, 15, 140, 20);
        correctAnswersTextStartLabel.setVisible(false);

        correctAnswersLabel = new JLabel();
        correctAnswersLabel.setBounds(260, 15, 30, 20);
        correctAnswersLabel.setVisible(false);

        correctAnswersTextFromLabel = new JLabel("из:");
        correctAnswersTextFromLabel.setBounds(290, 15, 20, 20);
        correctAnswersTextFromLabel.setVisible(false);

        passedQuestionsLabel = new JLabel();
        passedQuestionsLabel.setBounds(310, 15, 30, 20);
        passedQuestionsLabel.setVisible(false);

        commandInfoLabel = new JLabel("Введите цифру на английском языке:");
        commandInfoLabel.setBounds(30, 35, 250, 20);
        commandInfoLabel.setVisible(false);

        textForInputLabel = new JLabel();
        textForInputLabel.setBounds(30, 55, 250, 20);
        textForInputLabel.setVisible(false);

        rightAnswerLabel = new JLabel();
        rightAnswerLabel.setBounds(30, 80, 250, 20);
        rightAnswerLabel.setVisible(false);

        inputFieldResponse = new JTextField();
        inputFieldResponse.setBounds(30, 100, 250, 20);
        inputFieldResponse.setVisible(false);
        inputFieldResponse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickEnterInInputField();
            }
        });

        inputResultLabel = new JLabel();
        inputResultLabel.setBounds(295, 98, 24, 24);
        inputResultLabel.setVisible(false);

        verifyButton = new JButton("Проверить");
        verifyButton.setBounds(20, 135, 110, 25);
        verifyButton.setVisible(false);
        verifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickVerify();
            }
        });

        nextButton = new JButton("Следующая цифра");
        nextButton.setBounds(150, 135, 180, 25);
        nextButton.setVisible(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNext();
            }
        });

        JFrame frame = new JFrame("Диктовка цифр");
        frame.setBounds(400, 400, 360, 210);
        frame.setLayout(null);

        frame.add(startButton);
        frame.add(resultTestTextLabel);
        frame.add(resultTestLabel);
        frame.add(counterRepetitionLabel);
        frame.add(correctAnswersTextStartLabel);
        frame.add(correctAnswersLabel);
        frame.add(correctAnswersTextFromLabel);
        frame.add(passedQuestionsLabel);
        frame.add(commandInfoLabel);
        frame.add(rightAnswerLabel);
        frame.add(textForInputLabel);
        frame.add(inputFieldResponse);
        frame.add(inputResultLabel);
        frame.add(verifyButton);
        frame.add(nextButton);

        frame.setVisible(true);
    }

    @Override
    public void setVisibleStartPage(boolean isVisible) {
        startButton.setVisible(isVisible);
        resultTestTextLabel.setVisible(isVisible);
        resultTestLabel.setVisible(isVisible);
        if (isVisible)
            startButton.grabFocus();
    }

    @Override
    public void setVisibleLessonPage(boolean isVisible) {
        counterRepetitionLabel.setVisible(isVisible);
        correctAnswersTextStartLabel.setVisible(isVisible);
        correctAnswersLabel.setVisible(isVisible);
        correctAnswersTextFromLabel.setVisible(isVisible);
        passedQuestionsLabel.setVisible(isVisible);
        commandInfoLabel.setVisible(isVisible);
        rightAnswerLabel.setVisible(isVisible);
        textForInputLabel.setVisible(isVisible);
        inputFieldResponse.setVisible(isVisible);
        inputResultLabel.setVisible(isVisible);
        verifyButton.setVisible(isVisible);
        nextButton.setVisible(isVisible);
        if (isVisible)
            inputFieldResponse.grabFocus();
    }

    @Override
    public void setCounterRepetition(String counterRepetition) {
        counterRepetitionLabel.setText(counterRepetition);
    }

    @Override
    public void setTrueQuestions(String correctAnswers) {
        correctAnswersLabel.setText(correctAnswers);
    }

    @Override
    public void setPassedQuestions(String passedQuestions) {
        passedQuestionsLabel.setText(passedQuestions);
    }

    @Override
    public void setResultQuestion(boolean isSuccessfully) {
        String packageIco = "/ru/n5g/learningenglish/ico/";
        URL iconFile;
        if (isSuccessfully) {
            iconFile = getClass().getResource(packageIco + "yes.png");
        } else {
            iconFile = getClass().getResource(packageIco + "no.png");
        }
        Icon inputResultIcon;
        inputResultIcon = new ImageIcon(iconFile.getFile());
        inputResultLabel.setIcon(inputResultIcon);
    }

    @Override
    public void clearInformantsResultQuestion() {
        inputFieldResponse.setText("");
        rightAnswerLabel.setText("");
        inputResultLabel.setIcon(null);
    }

    @Override
    public String getEnteredText() {
        return inputFieldResponse.getText();
    }

    @Override
    public void setTextForInput(String textForInput) {
        textForInputLabel.setText(textForInput);
    }

    @Override
    public void setRightAnswer(String rightAnswer) {
        rightAnswerLabel.setText(rightAnswer);
    }

    @Override
    public void setResultTest(String resultTest) {
        resultTestLabel.setText(resultTest);
    }
}
