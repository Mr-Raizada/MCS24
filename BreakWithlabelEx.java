public class BreakWithlabelEx {
    public static void main(String args[]) {
        int[][] arrayOfInts = { { 15, 25, 69 }, { 564, 544, 44 }, { 45, 44, 77, 88 } };
        int searchFor = 544;
        int i = 0;
        int j = 0;
        boolean foundIt = false;
        
        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) { // Corrected the inner loop condition
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println(searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
