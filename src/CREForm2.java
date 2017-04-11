import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class CREForm2 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public CREForm2(int y,int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = y;
                idNumber = id;
                if(BRadioButton.isSelected())
                {
                    sum = sum+1;
                    JFrame cre3 = new JFrame("Question 3");
                    cre3.setContentPane(new CREForm3(sum,idNumber).panel1);
                    cre3.pack();
                    cre3.setVisible(true);


                }
                else
                {
                    JFrame cre3 = new JFrame("Question 3");
                    cre3.setContentPane(new CREForm3(sum,idNumber).panel1);
                    cre3.pack();
                    cre3.setVisible(true);
                }

            }
        });
    }
}
