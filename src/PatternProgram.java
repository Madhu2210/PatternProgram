public class PatternProgram {
    public static void main(String[] args) {
        int i, j, num, n = 7;
        for (i=0; i<n; i++) {
            num=1;
            for (j=0; j<=i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
