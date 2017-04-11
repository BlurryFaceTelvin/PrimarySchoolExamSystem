import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BlurryFace on 3/29/2017.
 */
public class MathForm2 {
    public JPanel panel1;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JRadioButton DRadioButton;
    private JButton nextButton;
    int sum,idNumber;
    //mutator method

    public MathForm2(int x,int id) {


        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                sum = x;
                idNumber = id;
                if(CRadioButton.isSelected())
                {
                    sum = sum +1;
                    JFrame math3 = new JFrame("Question 3");
                    math3.setContentPane(new MathForm3(sum,idNumber).panel1);
                    math3.pack();
                    math3.setVisible(true);
                }
                else
                {

                    JFrame math3 = new JFrame("Question 3");
                    math3.setContentPane(new MathForm3(sum,idNumber).panel1);
                    math3.pack();
                    math3.setVisible(true);
                }




            }
        });
    }
}
