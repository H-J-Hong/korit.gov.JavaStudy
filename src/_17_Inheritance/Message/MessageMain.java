package _17_Inheritance.Message;

public class MessageMain {
    public static void main(String[] args) {
        Message m1 = new Message("가나다라마바사");
        System.out.println(m1.makePreFix());
        System.out.println(m1.format());
        m1.print();

        Message sm1 = new SimpleMessage("가나다라마바사");
        System.out.println(sm1.makePreFix());
        System.out.println(sm1.format());
        sm1.print();

        Message fm1 = new FancyMessage("가나다라마바사");
        System.out.println(fm1.makePreFix());
        System.out.println(fm1.format());
        fm1.print();
    }
}
