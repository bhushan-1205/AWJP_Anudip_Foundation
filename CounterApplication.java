import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApplication extends JFrame implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JButton button;

    public CounterApplication() {

       
        setTitle("Counter Application");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        button = new JButton("Click Me!");
        button.addActionListener(this);

        
        label = new JLabel("Count: 0");

        
        add(button);
        add(label);

        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new CounterApplication();
    }
}
