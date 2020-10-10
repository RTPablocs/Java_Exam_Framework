import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class test_functions {

    @Test
    void calculate_median() {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(300,240,560,4560,103,569,234,67,10));
        functions.calculate_median(test);
    }

    @Test
    void extract_dividends() {
       Assertions.assertThrows(ArithmeticException.class, () -> functions.extract_dividends(567933456));

    }

    @Test
    void extract_digits() {
        functions.extract_digits(567903543);
    }

    @Test
    void multiply_from_even_digits() {

    }

    @Test
    void multiply_from_odd_digits() {
    }

    @Test
    void sum_before_num() {
    }

    @Test
    @DisplayName("It must be an Integer")
    void validate_int() throws Exception{
        validate.validate_integer();
    }
}