import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class classworkapp  extends  JFrame{
    private JPanel mainPanel;
    private JTextField emailText;
    private JButton subscribeBtn;
    private JLabel outputLbl;

    public  classworkapp(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();

        subscribeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               String emailin = emailText.getText();
            if (emailin.equals("")) {
                outputLbl.setText("please enter e-mail address u fool");
                }else {
                outputLbl.setText("signed up with : " + emailin );
                emailText.setText("");
            }
                }
             // System.out.println(emailText.getText());




            }
       );
    }

    public  static void  main(String[] args){

        Distances page = new Distances("Distances");
      //  classworkapp page = new classworkapp();
        page.setVisible(true);
    }

}
