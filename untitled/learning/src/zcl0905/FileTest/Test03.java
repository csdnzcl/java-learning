package zcl0905.FileTest;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        //找到电脑中所有以avi结尾的电影（需要考虑子文件夹）
        File src = new File("D:\\");
        findAVI();
    }

    public static void findAVI() {
        File[] arr = File.listRoots();
        for (File file : arr) {
            findAVI(file);
        }
    }
    public static void findAVI(File file) {
        File[] files = file.listFiles();
        if(files == null) {
            return;
        }
        for (File file1 : files) {
            if(file1.isFile()) {
                String name = file1.getName();
                if(name.endsWith(".cpp")) {
                    System.out.println(file1);
                }
            }else {
                findAVI(file1);
            }
        }
    }
}
