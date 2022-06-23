public class MyThread extends Thread {
    private int numberOfThred;

    public MyThread(int num) {
        this.numberOfThred = num;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("MyThread number :" + getNumberOfThred() + " -the number with the largest number of divisors is: " + numMaxDivisors());
        long end = System.currentTimeMillis();
        System.out.println("The time for the thread number-" + numberOfThred + " is: " + (end - start));
    }

    public int numMaxDivisors() {
        int maxNum = 0;
        int result = 0;
        for (int i = 1; i <= 100000; i++) {
            int temp = numOfDivisors(i);
            if (temp > maxNum) {
                maxNum = temp;
                result = i;
            }
        }
        return result;
    }

    public int numOfDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfThred() {
        return numberOfThred;
    }
}
