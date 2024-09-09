public class Reduce {
    public static void main(String[] args) {
        int hundo = 100;
        int counter = 0;
        while (hundo > 0) {
            if (hundo % 2 == 0) {
                hundo = hundo / 2;
            }
            else {
                hundo--;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
