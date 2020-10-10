import javax.swing.JOptionPane;


public class validate{
    static int validate_integer(){
        int num = 0;
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert your number here"));
        }catch (Exception not_an_int){
            JOptionPane.showMessageDialog(null,"You've inserted the wrong number");
            num = 0;
        }
        return num;
    }
}

