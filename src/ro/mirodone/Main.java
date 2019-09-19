package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        FindOutlier outlier = new FindOutlier();

        System.out.println(outlier.find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));
        System.out.println(outlier.find(new int[]{21, 41, 8, 1001, 41, 11, 26021, 361}));
        System.out.println(outlier.find(new int[]{2, 6, 6, -10, 3}));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.find(new int[]{2, 6, 6, -10, 3}));


    }
}
