public class StringCalculator {
    public int Add(String stringWithNumbersToSum) {
        if (stringWithNumbersToSum.equals(""))
            return 0;

        stringWithNumbersToSum = stringWithNumbersToSum.replace("\n", ",");
        String[] numbersAsStringToSum = stringWithNumbersToSum.split(",");

        int sumOfNumbers = 0;
        for (String numberAsString : numbersAsStringToSum) {
            sumOfNumbers += Integer.valueOf(numberAsString);
        }

        return sumOfNumbers;
    }
}
