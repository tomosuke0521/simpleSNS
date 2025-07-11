import javax.swing.*;
import java.awt.*;

public class SimpleTwitterApp{
    JFrame frame = new JFrame();
    private JTextField tweetInput = new JTextField();
    private JButton tweetButton = new JButton();

    public SimpleTwitterApp(){
        frame.setTitle("シンプルなSNS");
        frame.setSize(400,300);

        JPanel inputPanel = new JPanel(new BorderLayout());

        inputPanel.add(tweetInput,BorderLayout.CENTER);
        inputPanel.add(tweetButton,BorderLayout.EAST);

        frame.add(inputPanel,BorderLayout.NORTH);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SimpleTwitterApp().frame.setVisible(true);
            }
        });
    }
}