import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
        run(args, false);
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        int res;
        if (!test) {
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }
        for (int i = 0; i < args.length; i++) {
            try {
                listInt.add(Integer.parseInt(args[i]));
            } catch (Exception e) {

                System.out.println(args[i] + " cannot be translate in integer");
                return -1;
            }
            
        }

        res = sum(listInt);
        if (test) {
            return res;
        }

        System.out.println("Sum of odd elements : " + res);
        System.out.println("END!");

        return 0;
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
