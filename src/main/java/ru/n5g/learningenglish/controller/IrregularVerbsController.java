package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.words.IrregularVerbsWords;
import ru.n5g.learningenglish.util.SmartRandom;
import ru.n5g.learningenglish.view.IrregularVerbsView;

/**
 * @author Gleb Belyaev
 */
public class IrregularVerbsController extends ExerciseControllerAbs {
    protected IrregularVerbsView view;
    protected String word;
    protected IrregularVerbsWords irregularVerbsWords;
    private boolean isRight = true;
    private SmartRandom<String, String[]> smartRandom;

    public IrregularVerbsController(IrregularVerbsView view) {
        super(view);
        this.view = view;
        irregularVerbsWords = new IrregularVerbsWords();
        smartRandom = new SmartRandom<String, String[]>(irregularVerbsWords);
    }

    public void clickVerify() {
        if (isEnteredAnswer) {
            return;
        }
        String[] enteredWords = view.getEnteredTexts();
        if (enteredWords[0] != null && !enteredWords[0].isEmpty()) {
            enteredWords[0] = enteredWords[0].trim().toLowerCase();
        }
        if (enteredWords[1] != null && !enteredWords[1].isEmpty()) {
            enteredWords[1] = enteredWords[1].trim().toLowerCase();
        }
        if (enteredWords[2] != null && !enteredWords[2].isEmpty()) {
            enteredWords[2] = enteredWords[2].trim().toLowerCase();
        }


        String rightWords[] = irregularVerbsWords.translate(word);
        boolean know = isRight;
        isRight = rightWords[0].equals(enteredWords[0]) && rightWords[1].equals(enteredWords[1]) && rightWords[2].equals(enteredWords[2]);
        view.setResultQuestion(isRight);
        if (isRight) {
            trueQuestions++;
            if (know)
                rightAnswer(word);
        } else {
            view.setRightAnswers(rightWords);
            wrongAnswer(word);
        }
        Mp3Player.play("irregularverbs/" + rightWords[0]);
        isEnteredAnswer = true;
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsIrregularVerbs;
    }

    @Override
    protected String getRightAnswer() {
        return null;  //не требуеться
    }

    @Override
    protected String getNewQuestion() {
        if (isRight)
            word = getRandom();
        return word;
    }

    private void rightAnswer(String word) {
        smartRandom.understand(word);
    }

    private String getRandom() {
        return smartRandom.getRandomWord();
    }

    private void wrongAnswer(String word) {
        smartRandom.repeat(word);
    }
}
