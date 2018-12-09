import java.util.regex.Pattern;

public class StringCalculator {
    public int Add(String stringWithNumbersToSum) {
        if (stringWithNumbersToSum.equals(""))
            return 0;

        boolean isDelimiterDefined = stringWithNumbersToSum.startsWith("//");

        String delimiter = ",";

        if (isDelimiterDefined) {
            stringWithNumbersToSum = stringWithNumbersToSum.replaceFirst("//", "");
            int indexOfFirstNewLine = stringWithNumbersToSum.indexOf("\n");
            delimiter = stringWithNumbersToSum.substring(0, indexOfFirstNewLine);
            stringWithNumbersToSum = stringWithNumbersToSum.substring(indexOfFirstNewLine+1);
        }

        stringWithNumbersToSum = stringWithNumbersToSum.replace("\n", delimiter);
        String[] numbersAsStringToSum = stringWithNumbersToSum.split(Pattern.quote(delimiter));

        int sumOfNumbers = 0;
        for (String numberAsString : numbersAsStringToSum) {
            sumOfNumbers += Integer.valueOf(numberAsString);
        }

        return sumOfNumbers;
    }
}
