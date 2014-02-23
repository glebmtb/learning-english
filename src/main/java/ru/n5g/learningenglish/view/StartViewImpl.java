package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.StartController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Belyaev Gleb 11.12.13.
 */
public class StartViewImpl implements StartView {
    private final static int WIDTH_WINDOW = 305;
    private final static int HEIGHT_WINDOW = 645;
    private StartController controller;

    public StartViewImpl() throws HeadlessException {
        controller = new StartController(this);
        initComponents();
    }

    private void initComponents() {
        int yPosition = 0;
        int leftMargin = 10;
        int topMargin = 5;
        int widthButton = 272;
        int heightButton = 35;

        JButton allExercises = new JButton("Свои наборы");
        allExercises.setBounds(leftMargin, yPosition += 10, widthButton, heightButton);
        allExercises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickCustomerList();
            }
        });
        allExercises.setEnabled(false); //TODO

        JButton abcExercise = new JButton("Алфавит");
        abcExercise.setBounds(leftMargin, yPosition += heightButton + topMargin + 20, widthButton, heightButton);
        abcExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickAbcExercise();
            }
        });

        JButton numberFrom0To19Exercise = new JButton("Числа от 0 до 19");
        numberFrom0To19Exercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom0To19Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1To19Exercise();
            }
        });

        JButton numberFrom0To100Exercise = new JButton("Числа от 0 до 99");
        numberFrom0To100Exercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom0To100Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom0To100Exercise();
            }
        });

        JButton numberFrom1To1999999999Exercise = new JButton("Числа от 0 до 1,999,999,999");
        numberFrom1To1999999999Exercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom1To1999999999Exercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1To1999999999Exercise();
            }
        });

        JButton numberFrom1stTo31thExercise = new JButton("Числительные от 1st до 31th");
        numberFrom1stTo31thExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        numberFrom1stTo31thExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickNumberFrom1stTo31thExercise();
            }
        });

        JButton clockExercise = new JButton("Время");
        clockExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        clockExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickClockExercise();
            }
        });
        clockExercise.setEnabled(false); //TODO

        JButton timeDayExercise = new JButton("Время суток");
        timeDayExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        timeDayExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickTimeDayExercise();
            }
        });

        JButton daysWeekExercise = new JButton("Дни недели");
        daysWeekExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        daysWeekExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickDaysWeekExercise();
            }
        });

        JButton monthExercise = new JButton("Месяца");
        monthExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        monthExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickMonthExercise();
            }
        });

        JButton timesYearExercise = new JButton("Времена года");
        timesYearExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        timesYearExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickTimesYearExercise();
            }
        });

        JButton yearExercise = new JButton("Года");
        yearExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        yearExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickYearExercise();
            }
        });
        yearExercise.setEnabled(false); //TODO

        JButton irregularVerbsExercise = new JButton("Неправильные глаголы");
        irregularVerbsExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        irregularVerbsExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickIrregularVerbsExercise();
            }
        });

        JButton adverbsOfFrequencyExercise = new JButton("Наречия частотности");
        adverbsOfFrequencyExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        adverbsOfFrequencyExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickAdverbsOfFrequencyExercise();
            }
        });

        JButton questionWordsExercise = new JButton("Вопросительные слова");
        questionWordsExercise.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        questionWordsExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickQuestionWordsExercise();
            }
        });

        JButton prepositionsOfPlace = new JButton("Предлоги места");
        prepositionsOfPlace.setBounds(leftMargin, yPosition += heightButton + topMargin, widthButton, heightButton);
        prepositionsOfPlace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickPrepositionsOfPlace();
            }
        });

        JButton result = new JButton("Результаты");
        result.setBounds(leftMargin, yPosition += heightButton + topMargin + 20, 130, heightButton);
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickResult();
            }
        });
        result.setEnabled(false); //TODO

        JButton settings = new JButton("Настройки");
        settings.setBounds(136 + leftMargin + 6, yPosition, 130, heightButton);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clickSettings();
            }
        });
        settings.setEnabled(false); //TODO

        JFrame mainFrame = new JFrame("Изучение английского");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(400, 200, WIDTH_WINDOW, yPosition + heightButton + topMargin + 40);
        mainFrame.setLayout(null);

        mainFrame.add(allExercises);
        mainFrame.add(abcExercise);
        mainFrame.add(numberFrom0To19Exercise);
        mainFrame.add(numberFrom0To100Exercise);
        mainFrame.add(numberFrom1To1999999999Exercise);
        mainFrame.add(numberFrom1stTo31thExercise);
        mainFrame.add(clockExercise);
        mainFrame.add(timeDayExercise);
        mainFrame.add(daysWeekExercise);
        mainFrame.add(monthExercise);
        mainFrame.add(timesYearExercise);
        mainFrame.add(yearExercise);
        mainFrame.add(irregularVerbsExercise);
        mainFrame.add(adverbsOfFrequencyExercise);
        mainFrame.add(questionWordsExercise);
        mainFrame.add(prepositionsOfPlace);
        mainFrame.add(result);
        mainFrame.add(settings);

        mainFrame.setVisible(true);
    }

}
