package middle_1.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
//        NestedOuter outer = new NestedOuter(); 바깥 클래스의 인스턴스가 없어도 정적 중첩 클래스 생성 가능
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        //nestedClass = class middle_1.nested.nested.NestedOuter$Nested 출력됨 (내부 클래스는 $로 표기)
        System.out.println("nestedClass = "+nested.getClass());
    }
}
