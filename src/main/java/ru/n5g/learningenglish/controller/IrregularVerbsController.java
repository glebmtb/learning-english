package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.Mp3Player;
import ru.n5g.learningenglish.util.StupidRandom;
import ru.n5g.learningenglish.util.WordRandom;
import ru.n5g.learningenglish.view.IrregularVerbsView;
import ru.n5g.learningenglish.words.IrregularVerbsWords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gleb Belyaev
 */
public class IrregularVerbsController extends ExerciseControllerAbs {
    protected IrregularVerbsView view;
    protected String word;
    protected IrregularVerbsWords irregularVerbsWords;
    private boolean isRight = true;
    private WordRandom<String> random;
    private final int REPEAT_COUNT = 2;
    private Map<String, Integer> studiedWordsMap;
    private int studiedWords;

    public IrregularVerbsController(IrregularVerbsView view) {
        super(view);
        this.view = view;
        irregularVerbsWords = new IrregularVerbsWords();
        random = new StupidRandom<String>(irregularVerbsWords);
        studiedWordsMap = getStudiedWordsMap(irregularVerbsWords.getListRusWord());
    }

    private Map<String, Integer> getStudiedWordsMap(List<String> listRusWord) {
        Map<String, Integer> smartRandom = new HashMap<String, Integer>();
        for (String key : listRusWord) {
            smartRandom.put(key, 0);
        }
        return smartRandom;
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
        return currentQuestion;
    }

    @Override
    protected void nextQuestion() {
        super.nextQuestion();
        view.setCounterRepetition(studiedWords + "/" + irregularVerbsWords.size());
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

        int countRight = studiedWordsMap.get(word) + 1;
        if (countRight == REPEAT_COUNT) {
            studiedWords++;
        }
        studiedWordsMap.put(word, countRight);
    }

    private String getRandom() {
        String rusWord;
        while (true) {
            rusWord = random.getRandomWord();
            int countRight = studiedWordsMap.get(rusWord);
            boolean isNotRepetition = studiedWords == irregularVerbsWords.size() - 1 || !rusWord.equals(this.word);
            if (countRight < REPEAT_COUNT && isNotRepetition) {
                break;
            }
        }
        return rusWord;
    }

    private void wrongAnswer(String word) {
        studiedWordsMap.put(word, 0);
    }

    @Override
    protected boolean isFinish() {
        return irregularVerbsWords.size() == studiedWords;
    }
}
