public class StringCalculator {
    public int Add(String given) {
        if (given.equals(""))
            return 0;

        try {
            return Integer.valueOf(given);
        } catch (Exception e) {
            int indexOfComma = given.indexOf(",");
            int firstNumber = Integer.valueOf(given.substring(0, indexOfComma));
            int secondNumber = Integer.valueOf(given.substring(indexOfComma+1));

            return firstNumber + secondNumber;
        }
    }
}
