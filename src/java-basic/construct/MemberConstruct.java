package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 이름 = 클래스 이름 / 반환타입x
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grage = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
