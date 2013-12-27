package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Belyaev
 *         <p/>
 *         Неправельные глаголы
 */
public class IrregularVerbs implements WordRandom<String>, WordTranslate<String[], String> {
    private Map<String, String[]> map;
    private SmartRandom<String, String[]> smartRandom;

    public IrregularVerbs() {
        map = getMap();
        smartRandom = new SmartRandom<String, String[]>(map);
    }

    protected Map<String, String[]> getMap() {
        Map<String, String[]> words = new HashMap<String, String[]>();
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
//        words.put("", new String[]{"", "", ""});
        return words;
    }

    @Override
    public String getRandom() {
        return smartRandom.getRandom();
    }

    @Override
    public String[] translate(String timesYear) {
        return map.get(timesYear);
    }

    public void rideAnswer(String word) {
        smartRandom.understand(word);
    }
}
