package ru.n5g.learningenglish.util;

import javazoom.jl.player.advanced.AdvancedPlayer;

import java.net.URL;
import java.util.concurrent.Executors;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class Mp3Player {
    public static void play(final String fileName) {
        Executors.newCachedThreadPool().submit(new Runnable() {
            @Override
            public void run() {
                String fileMp3 = fileName.toLowerCase().concat(".mp3");
                String packageMp3 = "/ru/n5g/learningenglish/mp3/";
                URL resource = getClass().getResource(packageMp3 + fileMp3);
                if (resource == null) {
                    throw new RuntimeException("not found sample: " + fileMp3);
                }
                AdvancedPlayer player;
                try {
                    player = new AdvancedPlayer(resource.openStream());
                    player.play();
                } catch (Exception ignore) {

                }
            }
        });
    }

    public static void play(String path, String fileName) {
        play(path + "/" + fileName);
    }
}
