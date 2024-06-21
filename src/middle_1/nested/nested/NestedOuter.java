package middle_1.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버 변수에 접근 - 가능
            System.out.println(nestedInstanceValue);

            /**
             * 바깥 클래스의 인스턴스 멤버에 접근 - 불가능
             * Unlike inner class, a static nested class cannot access the member variables of the outer class.
             * It is because the static nested class doesn't require you to create an instance of the outer class.
             * 따라서 바깥 클래스에 대한 참조값이 없기 때문에 그렇다.
             */
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. * private도 접근 가능 *
            System.out.println(outClassValue);
        }
    }
}
