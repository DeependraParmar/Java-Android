import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form{
    public static void main(String args[]){
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500,500);
    }
}

class MyFrame extends JFrame{
    JTextField t1 = new JTextField();
    JLabel l1 = new JLabel("Hello, ");
    JButton b1 = new JButton("Click me");
    

    MyFrame(){
        add(t1);
        add(l1);
        add(b1);

        t1.setBounds(50,50,100,30);
        l1.setBounds(50,100,100,40);
        b1.setBounds(500,500,100,40);

        new ActionListener() {
            public void actionPerformed(ActionEvent event){
                l1.setText("Hello, " + t1.getText());
            }
        };
    }

}
