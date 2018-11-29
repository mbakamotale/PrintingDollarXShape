package za.co.psy;

public class ProblemA003 {

    private int count = 0;
    private int num = 1;
    private Boolean isright = true;


    public void makeLetterX(int sizeOfX) {

        for (int j = 0; j <= 25; j++) {

            for (int a = 0; a < 7; a++) {

                for (int b = 0; b < sizeOfX; b++) {
                    condition(j,a, sizeOfX);
                }

                count++;
                System.out.print(count);

            }

            System.out.println();
            count = 0;
        }

    }

    private void condition(int j, int a, int sizeOfX) {
        if (j == 9 && isright || j == 20 && !isright) {
            System.out.print(num);
            isright = false;
            if (j == 20) {
                isright = true;
            }

            num++;

        } else if(j==7 && a ==3 && sizeOfX == 9){
            System.out.print("$");
           
        } else {
            System.out.print("=");
        }
    }
}
