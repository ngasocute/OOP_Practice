import javax.swing.JFrame;

public class SwingDemo extends JFrame {
    public SwingDemo() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("Hello!"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
