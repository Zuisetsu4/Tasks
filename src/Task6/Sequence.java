package Task6;

public class Sequence {
    double x;
    int n;
    double e;
    double sum = 0;
    double sum2 = 0;
    double sum3 = 0;
    public Sequence(double x, int n, double e) {
        this.x = x;
        this.n = n;
        this.e = e;
        double nextX = x;
        double currentX = 1;
        for (int i = 1; i < n + 1 || Math.abs(currentX) > e / 10; i++) {
            double a = nextX / i;
            if (Math.abs(a) > e / 10) {
                if (i % 2 == 1) {
                    sum3 += nextX / i;
                }
                else {
                    sum3 -= nextX / i;
                }
            }
            if (Math.abs(a) > e) {
                if (i % 2 == 1) {
                    sum2 += nextX / i;
                }
                else {
                    sum2 -= nextX / i;
                }
            }
            if (i < n + 1) {
                if (i % 2 == 1) {
                    sum += nextX / i;
                }
                else {
                    sum -= nextX / i;
                }
            }
            nextX *= x;
            currentX = nextX / i;
        }
    }
    public double getSum() {
        return sum;
    }
    public double getSum2() {
        return sum2;
    }
    public double getSum3() {
        return sum3;
    }
    public double getY() {
        return Math.log(1 + x);
    }
}
