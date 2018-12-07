public class StringCalculator {
    public int Add(String given) {
        if (given.equals(""))
            return 0;

        int indexOfComma = given.indexOf(",");

        if (indexOfComma == -1)
            return Integer.valueOf(given);

        int firstNumber = Integer.valueOf(given.substring(0, indexOfComma));
        int secondNumber = Integer.valueOf(given.substring(indexOfComma+1));
        return firstNumber + secondNumber;
    }
}
