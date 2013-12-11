package ru.n5g.learningenglish.util;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.IOException;
import java.net.URL;

/**
 * @author Belyaev
 */
public class AbcSpeak
{
    public void speakABC(ABC abc) throws IOException, JavaLayerException
    {
        String bip = abc.toString().toLowerCase().concat(".mp3");
        URL resource = getClass().getResource(bip);
        if (resource == null)
        {
            throw new RuntimeException("not found sample: " + bip);
        }
        AdvancedPlayer player;
        player = new AdvancedPlayer(resource.openStream());
        player.play();
    }
}
