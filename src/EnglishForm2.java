import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class EnglishForm2 {
    public JPanel panel1;
    private JButton nextButton;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    int sum,idNumber;

    public EnglishForm2(int x,int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = x;
                idNumber = id;
                if(CRadioButton.isSelected())
                {
                    sum = sum+1;
                    JFrame eng3 = new JFrame("Question 3");
                    eng3.setContentPane(new EnglishForm3(sum,idNumber).panel1);
                    eng3.pack();
                    eng3.setVisible(true);
                }
                else
                {
                    JFrame eng3 = new JFrame("Question 3");
                    eng3.setContentPane(new EnglishForm3(sum,idNumber).panel1);
                    eng3.pack();
                    eng3.setVisible(true);
                }

            }
        });
    }
}
