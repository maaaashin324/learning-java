package ch04.exercises;

public class Triangle {
  public static void main(String[] args) {
    if (args.length == 0 || args.length > 1) {
      System.out.println("Usage: java Triangle <the number of heights>");
      return;
    }

    int height = Integer.parseInt(args[0]);

    int[][] triangle = new int[height][];

    for (int rowNumber = 0; rowNumber < height; rowNumber += 1) {
      triangle[rowNumber] = new int[rowNumber + 1];

      for (int columnNumber = 0; columnNumber < triangle[rowNumber].length; columnNumber += 1) {
        triangle[rowNumber][columnNumber] = columnNumber + rowNumber;

        String output = String.format("%d ", triangle[rowNumber][columnNumber]);
        System.out.print(output);
      }

      System.out.println();
    }
  }
}
