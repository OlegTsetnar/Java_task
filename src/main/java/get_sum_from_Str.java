public class get_sum_from_Str {
    public static void main(String[] args) {
        String str = "qwesd123fgr654";
        int sum= 0;

        char[]ch1 = str.toCharArray();
        for (char each:ch1) {
            if(Character.isDigit(each)){
                sum+= Integer.valueOf(""+     each);
            }
        }


        System.out.println(sum);

    }
}
