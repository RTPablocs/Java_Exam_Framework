import javax.swing.*;
import java.util.ArrayList;

public class exam_functions {
    static int calculate_median(ArrayList<Integer> median_number) {
        int sum = 0;
        for (Integer integer : median_number) {
            sum += integer;
        }
        JOptionPane.showMessageDialog(null, "Your median is equal to " + (sum / median_number.size()));
        return sum;
    }

    static ArrayList<Integer> extract_dividends(int num) {
        ArrayList<Integer> dividends = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            if ((num % i) == 0) {
                dividends.add(i);
            }

        }
        return(dividends);
    }


}