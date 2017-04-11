import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class MathForm3 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;

    public MathForm3(int y,int id) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sum = y;
                idNumber = id;
                if(BRadioButton.isSelected())
                {
                    sum = sum + 1;
                    JFrame math4 = new JFrame("Question 4");
                    math4.setContentPane(new MathForm4(sum,idNumber).panel1);
                    math4.pack();
                    math4.setVisible(true);
                }
                else
                {
                    JFrame math4 = new JFrame("Question 4");
                    math4.setContentPane(new MathForm4(sum,idNumber).panel1);
                    math4.pack();
                    math4.setVisible(true);
                }


            }
        });
    }
}
