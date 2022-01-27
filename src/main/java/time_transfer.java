public class time_transfer {

    public static void main(String[] args) {

        System.out.println(timeConversion("12:40:22AM"));
    }

    public static String timeConversion(String s) {

// 12:00:05PM - 12:00:05
// 12:00:00AM - 24:00:00
// 6:00:00PM - 18:00:00
// 6:00:00AM - 6:00:00
String time = "";
        if (s.equals("12:00:00PM")) {
           time = "12:00:00";
        } else if (s.equals("12:00:00AM")) {
         time =  "00:00:00";
        } else if (s.endsWith("AM")) {
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
            time =   s.replace("AM","");
            if (hour ==12){
          time = "00"+(s.substring(2,s.length()-2));
            }


        } else if (s.endsWith("PM") ) {

            int hour = Integer.parseInt(s.substring(0, 2));
            int digit_Time = 12+hour;

            time = digit_Time +s.substring(2,s.length()-2);

            if(hour ==12){
                time = "12"+(s.substring(2,s.length()-2));
            }


        }

return time;
    } }



