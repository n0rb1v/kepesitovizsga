package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (char item : input.toCharArray()) {
            if (Character.isDigit(item)) {
                sum += Integer.parseInt(String.valueOf(item));
            }
        }
        return sum;
    }
}
