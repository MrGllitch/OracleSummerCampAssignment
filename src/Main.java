public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            StringBuilder outcome = new StringBuilder();
            if (i % 2 == 0) {
                outcome.append("Baz");
            }
            if (i % 5 == 0) {
                outcome.append("inga!");
            }
            if (outcome.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(outcome);
            }
        }
    }
}