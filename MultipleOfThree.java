//  print 1 to 50 between multiple of three use continus keywoard
public class MultipleOfThree {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 50) {
            if (count % 3 != 0) {
                count++;
                continue;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }
}
