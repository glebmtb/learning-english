package ru.n5g.learningenglish.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Gleb Belyaev
 * 24.02.14
 */
public class NetWorkSynthesizerSound {
    private static final String PAGE_URL_FOR_ENG = "http://translate.google.com/translate_tts?tl=en&q=";
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:11.0) Gecko/20100101 Firefox/11.0";

    public static InputStream getSoundOnEngFromGoogleTranslate(String word) {
        try {
            URL url = new URL(PAGE_URL_FOR_ENG + word);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("User-Agent", USER_AGENT);
            connection.setDoInput(true);
            connection.connect();

            InputStream simple = cloneInputStream(connection.getInputStream());
            connection.disconnect();

            return simple;
        } catch (Exception ex) {
            throw new RuntimeException("ошибка синтезатор речи google", ex);
        }
    }

    private static InputStream cloneInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Fake code simulating the copy
        // You can generally do better with nio if you need...
        // And please, unlike me, do something about the Exceptions :D
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) > -1) {
            baos.write(buffer, 0, len);
        }
        baos.flush();

        return new ByteArrayInputStream(baos.toByteArray());
    }
}
