package org.dimigo.io;

import java.io.*;
import java.net.URL;

/**
 * Created by WOF on 2015. 10. 22..
 */
public class SaveImageFromUrl {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String image_url = "http://pabix.esy.es/pabix/pabix.png";

        try {
            InputStream is = getInStreamByURL(new URL(image_url));

            fileWrite(is, new File("target.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - start);
    }

    static InputStream getInStreamByURL(URL url) throws IOException {
        return url.openStream();
    }

    static void fileWrite(InputStream is, File target) throws IOException {
        FileOutputStream fos = new FileOutputStream(target);
        byte[] buffer = new byte[1024];
        int size = 0;

        while( ( size = is.read(buffer) ) != -1 )
            fos.write(buffer, 0, size);
    }
}
