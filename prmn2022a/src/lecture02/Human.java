package lecture02;

public class Human {

    String name;
    int age;

    public Human(String name,int age) {
        this.name = name;
        this.age = age;
    }

    void print(){

        String a;

        if(age<=18){
            a = "生徒";
        }else if(age<23){
            a = "学生";
        }else{
            a = "";
        }
        System.out.println(a+" "+name+" "+age+"歳です。");

    }
}
