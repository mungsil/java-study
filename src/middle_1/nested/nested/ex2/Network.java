package middle_1.nested.nested.ex2;

/**
 * ex1 리팩토링
 */

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // Network 클래스에서만 사용되는 클래스임을 드러내기 위해 private 중첩 클래스로 선언
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}
