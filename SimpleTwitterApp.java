import javax.swing.*;

public class SimpleTwitterApp{
    JFrame frame = new JFrame();
    public SimpleTwitterApp(){
        frame.setTitle("シンプルなSNS");
        frame.setSize(400,300);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SimpleTwitterApp().frame.setVisible(true);
            }
        });
    }
}