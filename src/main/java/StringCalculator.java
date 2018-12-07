public class StringCalculator {
    public int Add(String stringToCalculate) {
        if (stringToCalculate.equals(""))
            return 0;

        String[] stringToCalculateSplitByCommas = stringToCalculate.split(",");

        int sumOfNumbersAsString = 0;
        for (String numberAsStringToSum : stringToCalculateSplitByCommas) {
            sumOfNumbersAsString += Integer.valueOf(numberAsStringToSum);
        }

        return sumOfNumbersAsString;
    }
}
