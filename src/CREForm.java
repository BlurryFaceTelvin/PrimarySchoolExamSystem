import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class CREForm {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int idNumber;
    public int getSum()
    {
        int sum = 0;
        if(BRadioButton.isSelected())
        {
            sum =sum +1;
            return sum;
        }
        else
            return sum;
    }
    public CREForm(int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idNumber = id;
                JFrame cre2 = new JFrame("Question 2");
                cre2.setContentPane(new CREForm2(getSum(),idNumber).panel1);
                cre2.pack();
                cre2.setVisible(true);
            }
        });
    }
}
