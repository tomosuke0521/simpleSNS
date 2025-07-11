import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class SimpleTwitterApp{
    JFrame frame = new JFrame();
    private JTextField tweetInput = new JTextField();
    private JButton tweetButton = new JButton();
    private JTextArea tweetDisplay = new JTextArea();

    public SimpleTwitterApp(){
        frame.setTitle("シンプルなSNS");
        frame.setSize(400,300);

        JPanel inputPanel = new JPanel(new BorderLayout());

        inputPanel.add(tweetInput,BorderLayout.CENTER);
        inputPanel.add(tweetButton,BorderLayout.EAST);

        tweetDisplay.setEditable(false);

        frame.add(inputPanel,BorderLayout.NORTH);
        frame.add(tweetDisplay,BorderLayout.CENTER);

        tweetButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String tweet = tweetInput.getText();
                if(!tweet.isEmpty()){
                    addTweet(tweet);
                    tweetInput.setText("");
                }
            }
        });

    }

    private void addTweet(String tweet){
        LocalDate timestamp = LocalDate.now();
        tweetDisplay.append(timestamp + ":" + tweet + "\n\n");
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SimpleTwitterApp().frame.setVisible(true);
            }
        });
    }
}