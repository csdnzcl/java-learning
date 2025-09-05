package zcl0905.FileTest;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        /*
        需求：
            定义一个方法找某一个文件夹中，是否有以avi结尾的电影
         */
        File file = new File("D:\\javaFileTest");
        System.out.println(haveAVI(file));

    }

    public static boolean haveAVI(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
