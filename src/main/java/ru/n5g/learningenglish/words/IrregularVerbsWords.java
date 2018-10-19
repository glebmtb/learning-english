package ru.n5g.learningenglish.words;

import java.util.*;

/**
 * Неправильные глаголы
 *
 * @author Gleb Belyaev
 */
public class IrregularVerbsWords extends WordsAbs<String, String[]> {

    protected Map<String, String[]> originalMap;

    public IrregularVerbsWords() {
        super();
        originalMap = new LinkedHashMap<String, String[]>(map);
    }

    protected Map<String, String[]> initializationWords() {
        Map<String, String[]> words = new LinkedHashMap<String, String[]>();
        words.put("быть", new String[]{"be", "was were", "been"});
        words.put("бить", new String[]{"beat", "beat", "beaten"});
        words.put("становиться", new String[]{"become", "became", "become"});
        words.put("начинать", new String[]{"begin", "began", "begun"});
        words.put("кровоточить", new String[]{"bleed", "bled", "bled"});
        words.put("дуть", new String[]{"blow", "blew", "blown"});
        words.put("ломать", new String[]{"break", "broke", "broken"});
        words.put("приносить", new String[]{"bring", "brought", "brought"});
        words.put("строить", new String[]{"build", "built", "built"});
        words.put("гореть", new String[]{"burn", "burnt", "burnt"});
        words.put("ворваться, разрываться, взрываться", new String[]{"burst", "burst", "burst"});
        words.put("покупать", new String[]{"buy", "bought", "bought"});
        words.put("предлагать цену", new String[]{"bid", "bid", "bid"});
        words.put("кусать", new String[]{"bite", "bit", "bitten"});
        words.put("ловить, хватать, успеть", new String[]{"catch", "caught", "caught"});
        words.put("выбирать", new String[]{"choose", "chose", "chosen"});
        words.put("приходить", new String[]{"come", "came", "come"});
        words.put("стоить", new String[]{"cost", "cost", "cost"});
        words.put("ползать", new String[]{"creep", "crept", "crept"});
        words.put("резать", new String[]{"cut", "cut", "cut"});
        words.put("делать", new String[]{"do", "did", "done"});
        words.put("рисовать, тащить", new String[]{"draw", "drew", "drawn"});
        words.put("мечтать, дремать", new String[]{"dream", "dreamt", "dreamt"});
        words.put("пить", new String[]{"drink", "drank", "drunk"});
        words.put("водить", new String[]{"drive", "drove", "driven"});
        words.put("есть", new String[]{"eat", "ate", "eaten"});
        words.put("падать", new String[]{"fall", "fell", "fallen"});
        words.put("кормить", new String[]{"feed", "fed", "fed"});
        words.put("чувствовать", new String[]{"feel", "felt", "felt"});
        words.put("бороться", new String[]{"fight", "fought", "fought"});
        words.put("находить", new String[]{"find", "found", "found"});
        words.put("соответствовать, подходить", new String[]{"fit", "fit", "fit"});
        words.put("летать", new String[]{"fly", "flew", "flown"});
        words.put("забывать", new String[]{"forget", "forgot", "forgotten"});
        words.put("прощать", new String[]{"forgive", "forgave", "forgiven"});
        words.put("замерзать", new String[]{"freeze", "froze", "frozen"});
        words.put("получать", new String[]{"get", "got", "got"});
        words.put("давать", new String[]{"give", "gave", "given"});
        words.put("идти", new String[]{"go", "went", "gone"});
        words.put("расти", new String[]{"grow", "grew", "grown"});
        words.put("вешать", new String[]{"hang", "hung", "hung"});
        words.put("иметь", new String[]{"have", "had", "had"});
        words.put("слышать", new String[]{"hear", "heard", "heard"});
        words.put("прятать", new String[]{"hide", "hid", "hidden"});
        words.put("попадать в цель", new String[]{"hit", "hit", "hit"});
        words.put("держать", new String[]{"hold", "held", "held"});
        words.put("ушибить", new String[]{"hurt", "hurt", "hurt"});
        words.put("содержать", new String[]{"keep", "keep", "keep"});
        words.put("стоять на коленях", new String[]{"kneel", "knelt", "knelt"});
        words.put("знать", new String[]{"know", "knew", "known"});
        words.put("класть", new String[]{"lay", "laid", "laid"});
        words.put("вести", new String[]{"lead", "led", "led"});
        words.put("наклоняться, опираться, прислоняться", new String[]{"lean", "leant", "leant"});
        words.put("учить", new String[]{"learn", "learnt", "learnt"});
        words.put("оставлять", new String[]{"leave", "left", "left"});
        words.put("занимать", new String[]{"lend", "lent", "lent"});
        words.put("позволять", new String[]{"let", "let", "let"});
        words.put("лежать", new String[]{"lie", "lay", "lain"});
        words.put("освещать", new String[]{"light", "lit", "lit"});
        words.put("терять", new String[]{"lose", "lost", "lost"});
        words.put("производить", new String[]{"make", "made", "made"});
        words.put("значить", new String[]{"mean", "meant", "meant"});
        words.put("встречать", new String[]{"meet", "met", "met"});
        words.put("ошибаться", new String[]{"mistake", "mistook", "mistaken"});
        words.put("платить", new String[]{"pay", "paid", "paid"});
        words.put("доказывать", new String[]{"prove", "proved", "proven"});
        words.put("положить", new String[]{"put", "put", "put"});
        words.put("выходить", new String[]{"quit", "quit", "quit"});
        words.put("читать", new String[]{"read", "read", "read"});
        words.put("ездить верхом", new String[]{"ride", "rode", "ridden"});
        words.put("звенеть", new String[]{"ring", "rang", "rung"});
        words.put("подниматься", new String[]{"rise", "rose", "risen"});
        words.put("бежать", new String[]{"run", "ran", "run"});
        words.put("сказать, говорить, утверждать", new String[]{"say", "said", "said"});
        words.put("видеть", new String[]{"see", "saw", "seen"});
        words.put("искать", new String[]{"seek", "sought", "sought"});
        words.put("продавать", new String[]{"sell", "sold", "sold"});
        words.put("посылать", new String[]{"send", "sent", "sent"});
        words.put("ставить", new String[]{"set", "set", "set"});
        words.put("шить", new String[]{"sew", "sewed", "sewn"});
        words.put("встряхивать", new String[]{"shake", "shook", "shaken"});
        words.put("показывать", new String[]{"show", "showed", "shown"});
        words.put("уменьшать", new String[]{"shrink", "shrank", "shrunk"});
        words.put("закрывать", new String[]{"shut", "shut", "shut"});
        words.put("петь", new String[]{"sing", "sang", "sung"});
        words.put("тонуть", new String[]{"sink", "sank sunk", "sunk"});
        words.put("сидеть", new String[]{"sit", "sat", "sat"});
        words.put("спать", new String[]{"sleep", "slept", "slept"});
        words.put("скользить", new String[]{"slide", "slid", "slid"});
        words.put("сеять", new String[]{"sow", "sowed", "sown"});
        words.put("говорить, выступать, разговаривать", new String[]{"speak", "spoke", "spoken"});
        words.put("произносить по буквам", new String[]{"spell", "spelt", "spelt"});
        words.put("тратить", new String[]{"spend", "spent", "spent"});
        words.put("проливать", new String[]{"spill", "spilt", "spilt"});
        words.put("портить", new String[]{"spoil", "spoilt", "spoilt"});
        words.put("расстилать", new String[]{"spread", "spread", "spread"});
        words.put("прыгать, вскочить, возникнуть", new String[]{"spring", "sprang", "sprung"});
        words.put("стоять", new String[]{"stand", "stood", "stood"});
        words.put("красть", new String[]{"steal", "stole", "stolen"});
        words.put("колоть", new String[]{"stick", "stuck", "stuck"});
        words.put("жалить", new String[]{"sting", "stung", "stung"});
        words.put("выметать", new String[]{"sweep", "swept", "swept"});
        words.put("разбухать", new String[]{"swell", "swelled", "swollen"});
        words.put("плавать", new String[]{"swim", "swam", "swum"});
        words.put("качать", new String[]{"swing", "swung", "swung"});
        words.put("брать, взять", new String[]{"take", "took", "taken"});
        words.put("учить, обучать", new String[]{"teach", "taught", "taught"});
        words.put("рвать", new String[]{"tear", "tore", "torn"});
        words.put("рассказывать", new String[]{"tell", "told", "told"});
        words.put("думать", new String[]{"think", "thought", "thought"});
        words.put("бросать", new String[]{"throw", "threw", "thrown"});
        words.put("понимать", new String[]{"understand", "understood", "understood"});
        words.put("предпринимать", new String[]{"undertake", "undertook", "undertaken"});
        words.put("просыпаться", new String[]{"wake", "woke", "woken"});
        words.put("носить", new String[]{"wear", "wore", "worn"});
        words.put("плакать", new String[]{"weep", "wept", "wept"});
        words.put("мочить", new String[]{"wet", "wet", "wet"});
        words.put("выигрывать", new String[]{"win", "won", "won"});
        words.put("извиваться", new String[]{"wind", "wound", "wound"});
        words.put("писать", new String[]{"write", "wrote", "written"});
        return words;
    }

    public void setIntervalWords(int startWord, int endWord) {
        map = new LinkedHashMap<String, String[]>();
        List<String> keys = new ArrayList<String>(originalMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            if (i >= startWord && i < endWord) {
                map.put(keys.get(i), originalMap.get(keys.get(i)));
            }
        }
    }

    @Override
    public boolean isSound() {
        return true;
    }

    @Override
    public String pathSound() {
        return "irregularverbs";
    }
}
