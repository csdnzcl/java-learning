package zcl0904.File0905;

import java.io.File;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        /*
        创建和删除：
        public boolean createNewFile()---创建一个新的空的文件
        public boolean mkdir()-----------创建单级文件夹
        public boolean mkdirs()----------创建多级文件夹
        public boolean delete()----------删除文件、空文件夹---不走回收站

        获取并遍历：
        public File[] listFiles()-----获取当前路径下所有内容
         */

        //1. createNewFile()
        //细节1；文件不存在，创建成功，返回True，否则，返回false
        //细节2：如果父级路径不存在，方法会有异常IOException
        //细节三：创建的一定是文件，如果没后缀名，则创建一个没有后缀的文件
        File f1 = new File("D:\\javaFileTest//b.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);

        //2. mkdir()--------只能创建单机文件夹----舍弃，使用mkdirs()即可
        File f2 = new File("D:\\javaFileTest\\TestDirectory");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        //3. mkdirs()---------创建单级 / 多级文件夹

       /* //4. delete()---------删除文件、空文件夹---不走回收站---有内容文件夹，则删除失败
        boolean b3 = f1.delete();
        System.out.println(b3);*/

        //public File[] listFiles()-----获取当前路径下所有内容
        //路径不存在/File表示的路径是文件时，返回null
        //当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
        //包含隐藏文件夹
        //路径需要权限才能访问文件夹时，返回null
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        //File[] listFiles()
        File f = new File("D:\\javaFileTest");

        File[] arr = f.listFiles();
        for (File file : arr) {
            if(file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }


    }
}

//创建和删除