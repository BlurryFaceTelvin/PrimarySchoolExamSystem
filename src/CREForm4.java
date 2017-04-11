import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class CREForm4 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public CREForm4(int a,int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum =a;
                idNumber =id;
                if(DRadioButton.isSelected())
                {
                    sum = sum +1;
                    JFrame cre5 = new JFrame("Question 5");
                    cre5.setContentPane(new CREForm5(sum,idNumber).panel1);
                    cre5.pack();
                    cre5.setVisible(true);
                }
                else
                {
                    JFrame cre5 = new JFrame("Question 5");
                    cre5.setContentPane(new CREForm5(sum,idNumber).panel1);
                    cre5.pack();
                    cre5.setVisible(true);
                }

            }
        });
    }
}
