public class StringCalculator {
    public int Add(String stringWithNumbersToSum) {
        if (stringWithNumbersToSum.equals(""))
            return 0;

        boolean isDelimiterDefined = stringWithNumbersToSum.startsWith("//;\n");

        String delimiter = ",";

        if (isDelimiterDefined) {
            stringWithNumbersToSum = stringWithNumbersToSum.replaceAll("//;\n", "");
            delimiter = ";";
        }

        stringWithNumbersToSum = stringWithNumbersToSum.replace("\n", delimiter);
        String[] numbersAsStringToSum = stringWithNumbersToSum.split(delimiter);

        int sumOfNumbers = 0;
        for (String numberAsString : numbersAsStringToSum) {
            sumOfNumbers += Integer.valueOf(numberAsString);
        }

        return sumOfNumbers;
    }
}
