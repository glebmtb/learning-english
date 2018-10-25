package ru.n5g.learningenglish.service

import ru.n5g.learningenglish.words.IrregularVerbWord
import ru.n5g.learningenglish.words.IrregularVerbsWords
import java.util.*


class IrregularVerbsService {
    private val words = IrregularVerbsWords()

    fun sizeDictionary() = words.count()

    fun start(indxStart: Int, indxEnd: Int): Lesson {
        val st = if (indxStart < 1) 1 else indxStart
        val en = if (indxEnd > words.count()) words.count() else indxEnd

        return Lesson(words.getWords(st - 1, en - 1))
    }
}

class Lesson(words: List<IrregularVerbWord>) {
    private val lessonWords = words.map { LessonWord(it) }
    private var currentQuestion: LessonWord

    init {
        currentQuestion = findNextQuestion()
    }

    private fun findNextQuestion(): LessonWord {
        if (isFinished()) {
            return currentQuestion
        }

        while (true) {
            val word = lessonWords[Random().nextInt(lessonWords.size)]
            if (!word.answered) {
                return word
            }
        }
    }

    //public api
    fun geInfinitiveWord() = currentQuestion.word.translate

    fun getAnswer() = listOf(
            currentQuestion.word.infinitive,
            currentQuestion.word.pastSimple,
            currentQuestion.word.pastParticiple
    ).toTypedArray()

    fun countWordsOnLesson() = lessonWords.size

    fun wordsLearned() = lessonWords.filter { it.answered }.size

    fun translateWord() = currentQuestion.word.translate

    fun isFinished() = lessonWords.none { it.answered.not() }

    fun checkAnswer(infinitive: String?, pastSimple: String?, pastParticiple: String?): Boolean {
        val correct = currentQuestion.word.infinitive == infinitive
                && currentQuestion.word.pastSimple == pastSimple
                && currentQuestion.word.pastParticiple == pastParticiple

        if (correct) {
            currentQuestion.answered = correct
        }

        return correct
    }

    fun nextQuestion() {
        currentQuestion = findNextQuestion()
    }
}

data class LessonWord(val word: IrregularVerbWord,
                      var answered: Boolean = false)