import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class EnglishForm {
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
            sum = sum+1;
            return sum;
        }
        else
            return sum;
    }

    public EnglishForm(int id) {


        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idNumber = id;
                JFrame eng2 = new JFrame("Question 2");
                eng2.setContentPane(new EnglishForm2(getSum(),idNumber).panel1);
                eng2.pack();
                eng2.setVisible(true);
            }
        });
    }
}
