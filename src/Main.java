import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 300);   //設定寬，長
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //設定預設的關閉視窗
        frame.setVisible(true);    //視窗預設是不可見的
        System.out.println("hello");

    }
}

class Animal {
    public void dog() {
        System.out.print("im dog");
    }
}

class AnimalCAT {
    public void dda() {
        System.out.print("im dog");
    }
}