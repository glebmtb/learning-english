package ru.n5g.learningenglish;

import java.awt.*;
import javax.swing.*;


/**
 * @author Belyaev
 */
public class LearningEnglish {
  private final static int WIDTH_WINDOW = 300;
  private final static int HEIGHT_WINDOW = 585;

  public LearningEnglish() throws HeadlessException {
    initComponents();
  }

  private void initComponents() {
    int yPosition = 0;
    int leftMargin = 10;
    int widthButton = 272;
    int heightButton = 40;

    JButton allExercises = new JButton("Все упражнения по очереди");
    allExercises.setBounds(leftMargin, yPosition += 10, widthButton, heightButton);


    JButton abcExercise = new JButton("Алфавит");
    abcExercise.setBounds(leftMargin, yPosition += 80, widthButton, heightButton);

    JButton numberFrom1To10Exercise = new JButton("Числа N1-10");
    numberFrom1To10Exercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton numberFrom1To1999999999Exercise = new JButton("Числа N1-1,999,999,999");
    numberFrom1To1999999999Exercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton numberFrom1stTo31thExercise = new JButton("Числительные N1st-31th");
    numberFrom1stTo31thExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton clockExercise = new JButton("Время");
    clockExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton daysWeekExercise = new JButton("Дни недели");
    daysWeekExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton monthExercise = new JButton("Месяца");
    monthExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton yearExercise = new JButton("Года");
    yearExercise.setBounds(leftMargin, yPosition += 50, widthButton, heightButton);

    JButton result = new JButton("Результаты");
    result.setBounds(leftMargin, yPosition += 70, 130, heightButton);

    JButton settings = new JButton("Настройки");
    settings.setBounds(136 + leftMargin + 6, yPosition, 130, heightButton);

    JFrame mainFrame = new JFrame("Изучение английского");
    mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    mainFrame.setBounds(400, 200, WIDTH_WINDOW, HEIGHT_WINDOW);
    mainFrame.setLayout(null);

    mainFrame.add(allExercises);
    mainFrame.add(abcExercise);
    mainFrame.add(numberFrom1To10Exercise);
    mainFrame.add(numberFrom1To1999999999Exercise);
    mainFrame.add(numberFrom1stTo31thExercise);
    mainFrame.add(clockExercise);
    mainFrame.add(daysWeekExercise);
    mainFrame.add(monthExercise);
    mainFrame.add(yearExercise);
    mainFrame.add(result);
    mainFrame.add(settings);

    mainFrame.setVisible(true);
  }

  public static void main(String args[]) {
    new LearningEnglish();
  }
}




