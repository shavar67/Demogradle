
public class IsPowerOfFour {


    public int Square(int num) {

        return (int) Math.floor(Math.sqrt(num));
    }

    int isPowerOfFour(long n) {
        int count = 0;
        for (int i = 2; i <= 32; i = i + 2) {
            if (n == 1 << i) {
                count++;
                break;
            }
        }
        return count == 1 ? 1 : 0;


    }


}

