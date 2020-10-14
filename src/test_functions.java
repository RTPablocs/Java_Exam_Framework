import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


class test_functions {

    @Test
    void calculate_median() {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(300, 240, 560, 4560, 103, 569, 234, 67, 10));
        functions.calculate_median(test);
    }

    @Test
    void extract_dividends() {
        int num = validate.validate_integer();
        Assertions.assertThrows(ArithmeticException.class, () -> functions.extract_dividends(num));

    }

    @Test
    void extract_digits() {
        functions.extract_digits(567903543);
    }

    @Test
    void validate_integer() {
        ArrayList<Integer> compare_numbers = new ArrayList<>();
        int cont = 0;
        do {
            int num = validate.validate_integer();
            compare_numbers.add(num);
            cont = JOptionPane.showConfirmDialog(null, "Do you want to continue? (Y/N)");
        } while (cont != 1);
        functions.compare_numbers(compare_numbers);
    }

    @Test
    void validate_char() {
        validate.validate_character();
    }
}