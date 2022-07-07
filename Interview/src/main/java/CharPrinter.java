public class CharPrinter {
    public static void main(String[] args) {
      String example = "ToGalaxy and more";
        for (int i = 0; i <= example.length() - 1 ; i++) {
            if (example.charAt(i) != ' ') {
                System.out.println(example.charAt(i));
            } else {
                break;
            }
        }
    }
}
