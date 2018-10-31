package ru.n5g.learningenglish.words

import java.util.LinkedHashMap


data class IrregularVerbWord(val index: Int, //позиция в словоре
                             val translate: String, //перевод
                             val infinitive: String, //неопределенная форма глагола
                             val pastSimple: String, //простое прошедшее время
                             val pastParticiple: String) //простое прошедшее время

class IrregularVerbsWords{
    val words = arrayListOf<IrregularVerbWord>()
    init {
        var indx = 0
        for ((t, v) in words()) {
            words.add(IrregularVerbWord(indx++, t, v[0], v[1], v[2]))
        }
    }

    fun getWords(indxStart: Int, indxEnd: Int): List<IrregularVerbWord> {
        return words.asSequence().filter { it.index in indxStart..indxEnd }.toList()
    }

    fun count() = words.size
}

fun words(): LinkedHashMap<String, Array<String>> {
    val words = LinkedHashMap<String, Array<String>>()
    words["быть"] = arrayOf("be", "was were", "been")
    words["бить"] = arrayOf("beat", "beat", "beaten")
    words["становиться"] = arrayOf("become", "became", "become")
    words["начинать"] = arrayOf("begin", "began", "begun")
    words["кровоточить"] = arrayOf("bleed", "bled", "bled")
    words["дуть"] = arrayOf("blow", "blew", "blown")
    words["ломать"] = arrayOf("break", "broke", "broken")
    words["приносить"] = arrayOf("bring", "brought", "brought")
    words["строить"] = arrayOf("build", "built", "built")
    words["гореть"] = arrayOf("burn", "burnt", "burnt")
    words["ворваться, разрываться, взрываться"] = arrayOf("burst", "burst", "burst")
    words["покупать"] = arrayOf("buy", "bought", "bought")
    words["предлагать цену"] = arrayOf("bid", "bid", "bid")
    words["кусать"] = arrayOf("bite", "bit", "bitten")
    words["ловить, хватать, успеть"] = arrayOf("catch", "caught", "caught")
    words["выбирать"] = arrayOf("choose", "chose", "chosen")
    words["приходить"] = arrayOf("come", "came", "come")
    words["стоить"] = arrayOf("cost", "cost", "cost")
    words["ползать"] = arrayOf("creep", "crept", "crept")
    words["резать"] = arrayOf("cut", "cut", "cut")
    words["делать"] = arrayOf("do", "did", "done")
    words["рисовать, тащить"] = arrayOf("draw", "drew", "drawn")
    words["мечтать, дремать"] = arrayOf("dream", "dreamt", "dreamt")
    words["пить"] = arrayOf("drink", "drank", "drunk")
    words["водить"] = arrayOf("drive", "drove", "driven")
    words["есть"] = arrayOf("eat", "ate", "eaten")
    words["падать"] = arrayOf("fall", "fell", "fallen")
    words["кормить"] = arrayOf("feed", "fed", "fed")
    words["чувствовать"] = arrayOf("feel", "felt", "felt")
    words["бороться"] = arrayOf("fight", "fought", "fought")
    words["находить"] = arrayOf("find", "found", "found")
    words["соответствовать, подходить"] = arrayOf("fit", "fit", "fit")
    words["летать"] = arrayOf("fly", "flew", "flown")
    words["забывать"] = arrayOf("forget", "forgot", "forgotten")
    words["прощать"] = arrayOf("forgive", "forgave", "forgiven")
    words["замерзать"] = arrayOf("freeze", "froze", "frozen")
    words["получать"] = arrayOf("get", "got", "got")
    words["давать"] = arrayOf("give", "gave", "given")
    words["идти"] = arrayOf("go", "went", "gone")
    words["расти"] = arrayOf("grow", "grew", "grown")
    words["вешать"] = arrayOf("hang", "hung", "hung")
    words["иметь"] = arrayOf("have", "had", "had")
    words["слышать"] = arrayOf("hear", "heard", "heard")
    words["прятать"] = arrayOf("hide", "hid", "hidden")
    words["попадать в цель"] = arrayOf("hit", "hit", "hit")
    words["держать"] = arrayOf("hold", "held", "held")
    words["ушибить"] = arrayOf("hurt", "hurt", "hurt")
    words["держать, хранить, беречь, иметь, содержать"] = arrayOf("keep", "kept", "kept")
    words["становиться на колени"] = arrayOf("kneel", "knelt", "knelt")
    words["знать"] = arrayOf("know", "knew", "known")
    words["класть, положить, покрывать"] = arrayOf("lay", "laid", "laid")
    words["вести за собой, сопровождать, руководить"] = arrayOf("lead", "led", "led")
    words["наклоняться, опираться, прислоняться"] = arrayOf("lean", "leant", "leant")
    words["учить"] = arrayOf("learn", "learnt", "learnt")
    words["оставлять"] = arrayOf("leave", "left", "left")
    words["одалживать, давать взаймы (в долг)"] = arrayOf("lend", "lent", "lent")
    words["позволять, разрешать"] = arrayOf("let", "let", "let")
    words["лежать"] = arrayOf("lie", "lay", "lain")
    words["освещать"] = arrayOf("light", "lit", "lit")
    words["терять, лишаться, утрачивать"] = arrayOf("lose", "lost", "lost")
    words["производить"] = arrayOf("make", "made", "made")
    words["значить"] = arrayOf("mean", "meant", "meant")
    words["встречать"] = arrayOf("meet", "met", "met")
    words["ошибаться"] = arrayOf("mistake", "mistook", "mistaken")
    words["платить"] = arrayOf("pay", "paid", "paid")
    words["доказывать, оказаться"] = arrayOf("prove", "proved", "proven")
    words["положить"] = arrayOf("put", "put", "put")
    words["выходить"] = arrayOf("quit", "quit", "quit")
    words["читать"] = arrayOf("read", "read", "read")
    words["ездить верхом"] = arrayOf("ride", "rode", "ridden")
    words["звенеть"] = arrayOf("ring", "rang", "rung")
    words["подниматься"] = arrayOf("rise", "rose", "risen")
    words["бежать"] = arrayOf("run", "ran", "run")
    words["сказать, говорить, утверждать"] = arrayOf("say", "said", "said")
    words["видеть"] = arrayOf("see", "saw", "seen")
    words["искать"] = arrayOf("seek", "sought", "sought")
    words["продавать"] = arrayOf("sell", "sold", "sold")
    words["посылать"] = arrayOf("send", "sent", "sent")
    words["ставить"] = arrayOf("set", "set", "set")
    words["шить"] = arrayOf("sew", "sewed", "sewn")
    words["встряхивать"] = arrayOf("shake", "shook", "shaken")
    words["показывать"] = arrayOf("show", "showed", "shown")
    words["уменьшать"] = arrayOf("shrink", "shrank", "shrunk")
    words["закрывать"] = arrayOf("shut", "shut", "shut")
    words["петь"] = arrayOf("sing", "sang", "sung")
    words["тонуть"] = arrayOf("sink", "sank sunk", "sunk")
    words["сидеть"] = arrayOf("sit", "sat", "sat")
    words["спать"] = arrayOf("sleep", "slept", "slept")
    words["скользить"] = arrayOf("slide", "slid", "slid")
    words["сеять"] = arrayOf("sow", "sowed", "sown")
    words["говорить, выступать, разговаривать"] = arrayOf("speak", "spoke", "spoken")
    words["произносить по буквам"] = arrayOf("spell", "spelt", "spelt")
    words["тратить"] = arrayOf("spend", "spent", "spent")
    words["проливать"] = arrayOf("spill", "spilt", "spilt")
    words["портить"] = arrayOf("spoil", "spoilt", "spoilt")
    words["расстилать"] = arrayOf("spread", "spread", "spread")
    words["прыгать, вскочить, возникнуть"] = arrayOf("spring", "sprang", "sprung")
    words["стоять"] = arrayOf("stand", "stood", "stood")
    words["красть"] = arrayOf("steal", "stole", "stolen")
    words["колоть"] = arrayOf("stick", "stuck", "stuck")
    words["жалить"] = arrayOf("sting", "stung", "stung")
    words["выметать"] = arrayOf("sweep", "swept", "swept")
    words["разбухать"] = arrayOf("swell", "swelled", "swollen")
    words["плавать"] = arrayOf("swim", "swam", "swum")
    words["качать"] = arrayOf("swing", "swung", "swung")
    words["брать, взять"] = arrayOf("take", "took", "taken")
    words["учить, обучать"] = arrayOf("teach", "taught", "taught")
    words["рвать"] = arrayOf("tear", "tore", "torn")
    words["рассказывать"] = arrayOf("tell", "told", "told")
    words["думать"] = arrayOf("think", "thought", "thought")
    words["бросать"] = arrayOf("throw", "threw", "thrown")
    words["понимать"] = arrayOf("understand", "understood", "understood")
    words["предпринимать"] = arrayOf("undertake", "undertook", "undertaken")
    words["просыпаться"] = arrayOf("wake", "woke", "woken")
    words["носить"] = arrayOf("wear", "wore", "worn")
    words["плакать"] = arrayOf("weep", "wept", "wept")
    words["мочить"] = arrayOf("wet", "wet", "wet")
    words["выигрывать"] = arrayOf("win", "won", "won")
    words["извиваться"] = arrayOf("wind", "wound", "wound")
    words["писать"] = arrayOf("write", "wrote", "written")
    return words
}
