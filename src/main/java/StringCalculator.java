import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    private static final String DELIMITER_BEGIN = "//";
    private static final String DELIMITER_END = "\n";
    private static final String DEFAULT_DELIMITER = ",";

    public int Add(String stringWithNumbersToSum) {
        if (stringWithNumbersToSum.equals(""))
            return 0;

        String delimiter = DEFAULT_DELIMITER;

        boolean delimiterIsDefined = stringWithNumbersToSum.startsWith(DELIMITER_BEGIN);

        if (delimiterIsDefined) {
            stringWithNumbersToSum = stringWithNumbersToSum.replaceFirst(DELIMITER_BEGIN, "");
            int indexOfFirstNewLine = stringWithNumbersToSum.indexOf(DELIMITER_END);

            delimiter = stringWithNumbersToSum.substring(0, indexOfFirstNewLine);
            stringWithNumbersToSum = stringWithNumbersToSum.substring(indexOfFirstNewLine+1);
        }

        stringWithNumbersToSum = stringWithNumbersToSum.replace("\n", DEFAULT_DELIMITER);
        stringWithNumbersToSum = stringWithNumbersToSum.replace(delimiter, DEFAULT_DELIMITER);

        List<String> splitStringWithNumbers = Arrays.asList(stringWithNumbersToSum.split(DEFAULT_DELIMITER));
        List<Integer> numbersToAdd = splitStringWithNumbers.stream().map(Integer::valueOf).collect(Collectors.toList());

        return numbersToAdd.stream().reduce(0, Integer::sum);
    }
}
