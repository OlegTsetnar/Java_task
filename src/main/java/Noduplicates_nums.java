public class Noduplicates_nums {
    public static void main(String[] args) {


        int num =122334455;

        String num1 = num+"";

        String alluniques = "";

        for (int i = 0; i < num1.length(); i++) {
            if(!alluniques.contains(""+num1.charAt(i))){

                alluniques+=""+num1.charAt(i);

            }
        }
        System.out.println(alluniques);

        int numNew = Integer.parseInt(alluniques);
        System.out.println(numNew);




    }
}
