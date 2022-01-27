public class all_unique_numbers {
    public static void main(String[] args) {

       int num = 123423457;
String num1 = ""+num;
String unique = "";
        for (int i = 0; i < num1.length(); i++){
            int count =0;
            for (int j = 0; j <num1.length() ; j++) {
                if (num1.charAt(i)==num1.charAt(j)){
                    count++;

                }
            }
            if (count==1){
                unique+=""+num1.charAt(i);
            }

        }

        System.out.println(unique);
int UniqueNumber = Integer.valueOf(unique);
        System.out.println(UniqueNumber);

    }
}
