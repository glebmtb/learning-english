package ru.n5g.learningenglish.util;

/**
 * @author Belyaev
 */
public class AbcSpeak {
    public void speakABC(final ABC abc) {
        String bip = abc.toString();
        Mp3Player.play("abc/" + bip);
    }
}
