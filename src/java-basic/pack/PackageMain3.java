package pack;


import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {

        User userA = new User(); //이름이 겹치면 자주 사용하는 것을 import
        pack.b.User userB = new pack.b.User(); //자주 사용 안 하는 것을 전체 경롤 적음

    }
}
