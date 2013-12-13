package ru.n5g.learningenglish.util;

import javazoom.jl.player.advanced.AdvancedPlayer;

import java.net.URL;
import java.util.concurrent.Executors;

/**
 * @author Belyaev
 */
public class AbcSpeak
{
    public void speakABC(final ABC abc)
    {
        String bip = abc.toString();
        PlayerMpr3.play(bip);
    }
}
