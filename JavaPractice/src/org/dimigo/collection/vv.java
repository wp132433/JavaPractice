package org.dimigo.collection;

import java.io.*;

/**
 * Created by WOF on 2015. 11. 2..
 */
public class vv {
    public static void main(String[] args) throws IOException {
        String path = "/Volumes/WOF/Documents/Pabix/Projects/Tap/Tap";
        File folder = new File(path);

        int result = getLinesFromFolder(folder);

        System.out.println(result);
    }

    public static int getLinesFromFolder(File folder) throws IOException {
        int result = 0;

        for(File file : folder.listFiles()) {
            if(file.isDirectory())
                result += getLinesFromFolder(file);
            else
                result += getLinesFromFile(file);

        }

        return result;
    }

    public static int getLinesFromFile(File file) throws IOException {
        String file_name = file.getName();
        String extension = file_name.substring(file_name.length()-2, file_name.length());
        if( !(extension.equals(".m") || extension.equals(".h")) )
            return 0;

        BufferedReader br = new BufferedReader(new FileReader(file));

        int result = 0;

        while(br.readLine() != null)
            result += 1;

        return result;
    }
}
