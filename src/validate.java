import javax.swing.JOptionPane;


public class validate {
    static int validate_integer() {
        int num = 0;
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert your integer here"));
        } catch (Exception not_an_int) {
            JOptionPane.showMessageDialog(null, "You've inserted the wrong number");
            num = 0;
        }
        return num;
    }

    static float validate_float() {
        float num = 0;
        try {
            num = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert"));
        } catch (Exception not_a_float) {
            JOptionPane.showMessageDialog(null, "That's not a float");
            num = 0;
        }
        return num;
    }

    static char validate_character() {
        String input;
        char letter;

        input = JOptionPane.showInputDialog(null, "Insert your Character here");

        letter = input.charAt(0);

       if (Character.toString(letter).matches("^[a-mA-M]?$")){

       } else {
           JOptionPane.showMessageDialog(null,"You haven't entered a valid character");
       }


        return letter;
    }
}

