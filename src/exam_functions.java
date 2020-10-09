import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

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
        return (dividends);
    }


    static ArrayList<Integer> extract_digits(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num = num / 10;
        }
        Collections.sort(digits);
        return (digits);
    }

    static int multiply_from_even_digits(ArrayList<Integer> digits) {
        int product = 1; //Initialized to 1 because the product, and isn't possible to swap variable value
        for (Integer digit : digits) {
            if ((digit % 2) == 0) {
                product *= digit;
            }
        }
        JOptionPane.showMessageDialog(null, "Your result is: " + product);
        return product;
    }

    static int multiply_from_odd_digits(ArrayList<Integer> digits) {
        int product = 1; //Initialized to 1 because the product, and isn't possible to swap variable value
        for (Integer digit : digits) {
            if ((digit % 2) != 0) {
                product *= digit;
            }
        }
        return product;
    }

    static int sum_before_num(int end_num) {
        boolean kill_switch = false;
        int result = 0, num = 0;
        while (!kill_switch) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the number"));
            if (num == end_num) {
                kill_switch = true;
            }
            result += num;
        }
        JOptionPane.showMessageDialog(null, "Result is: " + result);
        return result;
    }
}