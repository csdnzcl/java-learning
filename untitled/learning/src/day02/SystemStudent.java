package day02;
import java.util.Scanner;
import java.util.ArrayList;

public class SystemStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("-------------欢迎来到学生管理系统-----------------------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询学生");
            System.out.println("5. 退出学生");
            System.out.println("请输入你的选择:");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch(choice) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id = null;
        while(true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已经存在，请重新录入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生家庭地址");
        String address = sc.next();

        Student s = new Student(id,name, age, address);
        list.add(s);
        System.out.println("学生信息添加成功");

    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生id");
        String id = sc.next();
        int index = getIndex(list, id);;
        if(index >= 0){
            list.remove(index);
            System.out.println("id:"+id+"的学生删除成功");
        }else{
            System.out.println("id不存在，删除失败");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入要修改学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if(index == -1) {
            System.out.println("要修改的id:" + id + "不存在，请重新输入");
        }
        Student s = list.get(index);
        System.out.println("请输入要修改学生姓名");
        String newName = sc.next();
        s.setName(newName);
        System.out.println("请输入要修改学生年龄");
        int newAge = sc.nextInt();
        s.setAge(newAge);
        System.out.println("请输入要修改学生地址");
        String newAddress = sc.next();
        s.setAddress(newAddress);
    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        if(list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return ;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id){
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if(sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
