public class Counter {
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (new FizzBuzzChecker().isFizzBuzz(i)) {
                System.out.println("fizzbuzz");
            } else if (new FizzChecker().isFizz(i)) {
                System.out.println("fizz");
            } else if (new BuzzChecker().isBuzz(i)) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
