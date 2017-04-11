import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class CREForm3 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    public CREForm3(int x,int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = x;
                if(CRadioButton.isSelected())
                {
                    sum = sum +1;
                    idNumber = id;
                    JFrame cre4 = new JFrame("Question 4");
                    cre4.setContentPane(new CREForm4(sum,idNumber).panel1);
                    cre4.pack();
                    cre4.setVisible(true);
                }
                else
                {
                    JFrame cre4 = new JFrame("Question 4");
                    cre4.setContentPane(new CREForm4(sum,idNumber).panel1);
                    cre4.pack();
                    cre4.setVisible(true);
                }

            }
        });
    }
}
