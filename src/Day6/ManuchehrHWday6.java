package Day6;

public class ManuchehrHWday6 {
    public static void main(String[] args) {

//       Create 2 Strings and concat them to have EXELENTER SDET
        String a = "EXELENTER ";
        String b = "SDET";
        String c = a.concat(b);
        System.out.println("1) " + c);


//        Create 3 Strings and using concat method print UNITED STATES OF AMERICA
        String a1 = "UNITED ";
        String a2 = "STATES ";
        String a3 = "OF ";
        String a4 = "AMERICA";
        System.out.println("2) " + a1.concat(a2).concat(a3).concat(a4));


//         Create a String with your full name and get the length of your full name
        String Myfullname = "Manuchehr Saidov";
        int MyfullnameLength = Myfullname.length();
        System.out.println("3) MyfullnameLength = " + MyfullnameLength);


//        Create a String with the city you live and count the length
        String City = "Los Angeles";
        int CityLength = City.length();
        System.out.println("4) CityLength = " + CityLength);




    }

}
