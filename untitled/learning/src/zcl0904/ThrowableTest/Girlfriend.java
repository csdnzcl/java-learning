package zcl0904.ThrowableTest;

public class Girlfriend {
    String name;
    int age;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException{
        int len = name.length();
        if(len < 2 || len > 10) {
            throw new NameFormatException(name + "长度不符合要求");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException{
        if(age < 18 || age > 30){
            throw new AgeOutOfBoundsException(age + "不在范围内");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
