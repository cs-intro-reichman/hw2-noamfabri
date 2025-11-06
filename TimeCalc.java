public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedMinutes = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60 + minutes + addedMinutes);
        int totalHours = (totalMinutes / 60);
        int newHours = (totalHours % 24);
        int newMinutes = (totalMinutes - (totalHours * 60));
        //when hours == 0
        if (newHours == 0) {
        System.out.println("0" + newHours + ":" + "0" + newMinutes);
        //when hours < 10 and minutes >= 10
        } else if (newHours < 10 &&  newMinutes >= 10) {
            System.out.println("0" + newHours + ":" + newMinutes);
        //when hours < 10 and minutes < 10    
        } else if ((newHours < 10 &&  newMinutes < 10)) {
               System.out.println("0" + newHours + ":" + "0" + newMinutes);
        //when hours > 10 and minutes < 10               
        } else if (newHours > 10 && newMinutes <= 10) {
            System.out.println(newHours + ":" + "0" + newMinutes);
        //when hours > 10 and minutes > 10
        } else if (newHours >= 10 && newMinutes >= 10) {
            System.out.println(newHours + ":" + newMinutes);
        }      
    }
}
