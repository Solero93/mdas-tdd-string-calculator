public class StringCalculator {
    public int Add(String given) {
        return given.equals("") ? 0 : Integer.valueOf(given);
    }
}
