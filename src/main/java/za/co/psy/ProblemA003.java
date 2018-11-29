package za.co.psy;

public class ProblemA003 {

    public void MakeACross(int number) {
        int start = 0;
        int end = number - 1;
        for (int i = 0; i < number; i++) {
            System.out.print("==");
            for (int j = 0; j < number; j++) {
                System.out.print("==");
                if (start == end && j == i) {
                    System.out.print('$');
                } else if (start == j || end == j) {
                    System.out.print('$');
                } else {
                    System.out.print(' ');
                }
            }
            start++;
            end--;
            System.out.println("==");
        }

    }

}
