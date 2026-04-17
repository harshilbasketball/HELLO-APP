public class UC6 {
    public static void main(String[] args) {
        String result = "Hello-";

        for (String arg : args) {
            result += arg + " ";
        }

        if (result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }

        System.out.println(result);
    }
}
