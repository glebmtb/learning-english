package ru.n5g.learningenglish.util;

import javazoom.jl.player.advanced.AdvancedPlayer;

import java.net.URL;

/**
 * @author Belyaev
 */
public class AbcSpeak
{
    public void speakABC(ABC abc)
    {
        String bip = abc.toString().toLowerCase().concat(".mp3");
        String packageMp3="/ru/n5g/learningenglish/mp3/";
        URL resource = getClass().getResource(packageMp3+bip);
        if (resource == null)
        {
            throw new RuntimeException("not found sample: " + bip);
        }
        AdvancedPlayer player;
        try {
            player = new AdvancedPlayer(resource.openStream());
            player.play();
        } catch (Exception ignore) {

        }
    }
}
