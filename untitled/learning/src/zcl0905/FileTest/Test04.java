package zcl0905.FileTest;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {

        /*'
        删除一个多级文件夹
         */
        File file = new File("D:\\javaFileTest\\TestDirectory");
        delete(file);
    }
    public static void delete(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                delete(f);
            }
        }
        file.delete();
    }
}
