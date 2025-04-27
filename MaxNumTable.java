import java.util.*;

public class MaxNumTable {
    public static int maxnumOnTable(int []bag) {
        HashSet<Integer> table = new HashSet<>();
        int max = 0;

        for(int i=0; i<bag.length; i++) {
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else {
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bag[] = new int[n];
        for(int i=0; i<n; i++) {
            bag[i] = sc.nextInt();
        }

        System.out.println(maxnumOnTable(bag));
    }
}