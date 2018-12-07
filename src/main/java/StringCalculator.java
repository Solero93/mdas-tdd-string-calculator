public class StringCalculator {
    public int Add(String stringToCalculate) {
        if (stringToCalculate.equals(""))
            return 0;

        String[] stringToCalculateSplitByCommas = stringToCalculate.split(",");

        int sum = 0;
        for (String numberToSum : stringToCalculateSplitByCommas) {
            sum += Integer.valueOf(numberToSum);
        }

        return sum;
    }
}
