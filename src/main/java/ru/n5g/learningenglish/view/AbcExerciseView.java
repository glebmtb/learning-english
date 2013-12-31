package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.AbcExerciseController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseView implements ExerciseView {
    private AbcExerciseController controller;

    private JButton startButton;
    private JLabel resultTestTextLabel;
    private JLabel resultTestLabel;

    private JLabel counterRepetitionLabel;
    private JLabel correctAnswersTextStartLabel;
    private JLabel correctAnswersLabel;
    private JLabel correctAnswersTextFromLabel;
    private JLabel passedQuestionsLabel;
    private JLabel enteringLetterTextStartLabel;
    private JTextField enteringLetterText;
    private JLabel rightAnswerLabel;
    private JLabel inputResultLabel;

    private JButton replaceButton;
    private JButton nextButton;


    public AbcExerciseView() {
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
        startButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    controller.clickStart();
                }
            }
        });

        resultTestTextLabel = new JLabel("Ваше результат:");
        resultTestTextLabel.setBounds(30, 80, 110, 20);
        resultTestTextLabel.setVisible(false);

        resultTestLabel = new JLabel();
        resultTestLabel.setBounds(140, 80, 200, 20);
        resultTestLabel.setVisible(false);

        counterRepetitionLabel = new JLabel();
        counterRepetitionLabel.setBounds(20, 15, 40, 20);
        counterRepetitionLabel.setVisible(false);

        correctAnswersTextStartLabel = new JLabel("Правильных ответов:");
        correctAnswersTextStartLabel.setBounds(120, 15, 140, 20);
        correctAnswersTextStartLabel.setVisible(false);

        correctAnswersLabel = new JLabel();
        correctAnswersLabel.setBounds(255, 15, 30, 20);
        correctAnswersLabel.setVisible(false);

        correctAnswersTextFromLabel = new JLabel("из:");
        correctAnswersTextFromLabel.setBounds(270, 15, 20, 20);
        correctAnswersTextFromLabel.setVisible(false);

        passedQuestionsLabel = new JLabel();
        passedQuestionsLabel.setBounds(290, 15, 30, 20);
        passedQuestionsLabel.setVisible(false);

        enteringLetterTextStartLabel = new JLabel("Введите букву которая прозвучала:");
        enteringLetterTextStartLabel.setBounds(25, 45, 235, 20);
        enteringLetterTextStartLabel.setVisible(false);

        enteringLetterText = new JTextField();
        enteringLetterText.setBounds(240, 45, 20, 20);
        enteringLetterText.setVisible(false);
        enteringLetterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickNext();
            }
        });
        enteringLetterText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                controller.enteredSymbol();
            }
        });

        rightAnswerLabel = new JLabel();
        rightAnswerLabel.setBounds(265, 45, 20, 20);
        rightAnswerLabel.setVisible(false);

        inputResultLabel = new JLabel();
        inputResultLabel.setBounds(295, 42, 24, 24);
        inputResultLabel.setVisible(false);

        replaceButton = new JButton("Повторить");
        replaceButton.setBounds(20, 80, 110, 25);
        replaceButton.setVisible(false);
        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickReplace();
                enteringLetterText.grabFocus();
            }
        });

        nextButton = new JButton("Следующая буква");
        nextButton.setBounds(150, 80, 180, 25);
        nextButton.setVisible(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.clickNext();
                enteringLetterText.grabFocus();
            }
        });

        JFrame frame = new JFrame("Диктовка английского алфовита");
        frame.setBounds(400, 400, 350, 150);
        frame.setLayout(null);

        frame.add(startButton);
        frame.add(resultTestTextLabel);
        frame.add(resultTestLabel);
        frame.add(counterRepetitionLabel);
        frame.add(correctAnswersTextStartLabel);
        frame.add(correctAnswersLabel);
        frame.add(correctAnswersTextFromLabel);
        frame.add(passedQuestionsLabel);
        frame.add(enteringLetterTextStartLabel);
        frame.add(enteringLetterText);
        frame.add(rightAnswerLabel);
        frame.add(inputResultLabel);
        frame.add(replaceButton);
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
        enteringLetterTextStartLabel.setVisible(isVisible);
        enteringLetterText.setVisible(isVisible);
        rightAnswerLabel.setVisible(isVisible);
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
        inputResultIcon = new ImageIcon(iconFile);
        inputResultLabel.setIcon(inputResultIcon);
    }

    @Override
    public void clearInformantsResultQuestion() {
        inputResultLabel.setIcon(null);
        enteringLetterText.setText("");
    }

    @Override
    public String getEnteredText() {
        String word = enteringLetterText.getText();
        String symbol = "none";
        if (word != null && !word.isEmpty()) {
            symbol = String.valueOf(word.charAt(0)).toUpperCase();
        }
        return symbol;
    }

    @Override
    public void setRightAnswer(String rightAnswer) {
        rightAnswerLabel.setText(rightAnswer);
    }

    @Override
    public void setResultTest(String resultTest) {
        resultTestLabel.setText(resultTest);
    }

    @Override
    public void setTextForInput(String textForInput) {

    }
}
