import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IntroScreen extends JFrame implements ActionListener
{
    private JButton play;
    private JButton quit;
    public JPanel panel = new JPanel();
//    public JFrame window = new JFrame(


    public IntroScreen()
    {
        setSize(700, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setTitle("APCSA Project");
        JLabel jtext = new JLabel("Made by Jack and David");
        jtext.setForeground(Color.yellow);

        play = new JButton("Play");
        play.setBounds(200, 400, 100, 70);
        quit = new JButton("Quit");
        quit.setBounds(350, 400, 100, 70);
        play.addActionListener(this);
        quit.addActionListener(this);
        panel.add(jtext);
        panel.add(play);
        panel.add(quit);

        this.getContentPane().add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics graphics)
    {
        ImageIcon imageIcon = new ImageIcon("images//space.jpg");
        graphics.drawImage(imageIcon.getImage(), 0, 0, null);
  graphics.setColor(Color.yellow);
//        graphics.setFont(new Font("TimesRoman", Font.PLAIN, 20));
//        graphics.drawString("Made by Jack and David", 250,50);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == quit)
        {
            JOptionPane.showMessageDialog(null, "You died!");
            System.exit(0);
        }
        else if(e.getSource() == play)
        {
            Level1 level1 = new Level1();
        }
    }
}