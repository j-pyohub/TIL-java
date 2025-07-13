package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //생성자 없어서 자바가 기본 생성자 만듦

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = 80;
    }
}
