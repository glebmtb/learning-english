package ru.n5g.learningenglish.util;

/**
 * @author Belyaev
 */
public class AbcSpeak {
    public void speakABC(final ABC abc) {
        String bip = abc.toString();
        PlayerMpr3.play("abc/" + bip);
    }
}
