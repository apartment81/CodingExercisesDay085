package ro.mirodone;

public class FindOutlier {


    int find(int[] integers) {

        int odd = 0;
        int even = 0;

        int oddNum = 0;
        int evenNum = 0;


        for (int integer : integers) {

            if (integer % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }

        if (odd < even) {
            for (int integer : integers) {

                if (integer % 2 != 0) {
                    oddNum = integer;
                }
            }
            return oddNum;
        } else {
            for (int integer : integers) {

                if (integer % 2 == 0) {
                    evenNum = integer;
                }
            }
            return evenNum;
        }
    }

}

