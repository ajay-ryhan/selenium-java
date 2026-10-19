package Codes;

public class AddTwoMatrix {

    public static void main(String[] args) {

        int rows, columns;
        int first[][] = {{1, 3}, {5, 10}, {6, 8}};

        int second[][] = {{2, 1}, {5, 4}, {4, 2}};

        rows = first.length;
        columns = first[0].length;

        System.out.print(rows  + "\n");
        System.out.print(columns + "\n");

        int sum[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                sum[i][j] = first[i][j] + second[i][j];

                System.out.print(sum[i][j] + "\t");
            }

            System.out.println();
        }
    }
}