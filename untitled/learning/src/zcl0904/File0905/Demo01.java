package zcl0904.File0905;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {

        /*

        public File(String pathname) --说明：根据文件路径创建文件对象
        public File(String parent, String child) --说明：根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent, String child) --说明：根据父路径对应文件对象和子路径名字符串创建文件对象

        */
        //1. 根据字符串表示的路径，变成File对象
        String str = "C:\\Users\\zhouc\\OneDrive\\桌面\\FileTest.txt";
        File f1 = new File( str);
        System.out.println(f1);

        //2.父级路径：去了自己的路径---Eg:"C:\\Users\\zhouc\\OneDrive\\桌面"
        //子级路径：去了父级路径---Eg:"FileTest.txt"
        String parent = "C:\\Users\\zhouc\\OneDrive\\桌面";
        String child = "FileTest.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        //3. 把一个File表示的路径和String表示的路径进行拼接
        File parent2 = new File("C:\\Users\\zhouc\\OneDrive\\桌面");
        String child2 = "FileTest.txt";
        File f3 = new File(parent2, child2);
        System.out.println(f3);

    }
}
