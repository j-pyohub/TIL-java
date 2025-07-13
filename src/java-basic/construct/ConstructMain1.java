package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 생성자를 사용하면 필수값 입력을 보장할 수 있음. 버그 원천 차단
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
