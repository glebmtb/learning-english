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
    private var isCheck = false
    private var lastResultCorrect = false

    init {
        currentQuestion = findNextQuestion()
    }

    private fun findNextQuestion(): LessonWord {
        if (isFinished()) {
            return currentQuestion
        }
        return lessonWords.nextRandom(exclude = currentQuestion)
    }

    //public api
    fun geInfinitiveWord() = currentQuestion.word.infinitive

    fun getAnswer() = listOf(
            currentQuestion.word.infinitive,
            currentQuestion.word.pastSimple,
            currentQuestion.word.pastParticiple
    ).toTypedArray()

    fun countWordsOnLesson() = lessonWords.size

    fun wordsLearned() = lessonWords.filter { it.isAnswered() }.size

    fun translateWord() = currentQuestion.word.translate

    fun isFinished() = lessonWords.none { it.isAnswered().not() }

    fun checkAnswer(infinitive: String?, pastSimple: String?, pastParticiple: String?): Boolean {
        val correct = currentQuestion.word.infinitive == infinitive
                && currentQuestion.word.pastSimple == pastSimple
                && currentQuestion.word.pastParticiple == pastParticiple

        if (isCheck.not()) {
            currentQuestion.doResult(correct)
            isCheck = true
            lastResultCorrect = correct
        }

        return correct
    }

    fun nextQuestion() {
        isCheck = false
        if (lastResultCorrect) {
            currentQuestion = findNextQuestion()
        }
    }
}

data class LessonWord(val word: IrregularVerbWord,
                      private var isAnswered: Boolean = false,
                      private var incorrectAnswerCount: Int = 0,
                      private var rightAnswered: Int = 0,
                      private var countAnswered: Int = 0) {

    fun isAnswered() = isAnswered
    fun countAnswered() = countAnswered

    private fun doRightAnswer() {
        rightAnswered++
        isAnswered = canAnswered()
    }

    private fun canAnswered(): Boolean {
        return when (incorrectAnswerCount) {
            0 -> rightAnswered > 0
            1 -> rightAnswered > 2
            2 -> rightAnswered > 3
            else -> rightAnswered > 5
        }
    }

    private fun doIncorrectAnswer() {
        rightAnswered = 0
        incorrectAnswerCount++
    }

    fun doResult(result: Boolean) {
        countAnswered++
        if (result) {
            doRightAnswer()
        } else {
            doIncorrectAnswer()
        }
    }
}

fun List<LessonWord>.nextRandom(exclude: LessonWord?): LessonWord {

    val notAnswered = (if (size > 1 && exclude != null) asSequence().filter { it != exclude } else this.asSequence())
            .filterNot { it.isAnswered() }.toList()

    val minV = notAnswered.minBy { it.countAnswered() }!!.countAnswered()
    val minL = notAnswered.asSequence().filter { it.countAnswered() == minV }.toList()
    return minL[Random().nextInt(minL.size)]
}