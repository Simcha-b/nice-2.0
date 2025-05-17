import java.util.Scanner;

public class Basic {
        static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // printName();
        // add(2,2);
        // average(3.2,4.256,4.366);
        // extract(123);
        // reversString("hello");
        // convertFromSeconds(35221);
        // convertDate(2, 8, 2024);
        // convertFromString("1548");
        // convertDoubleToInt();
        // convertCharToInt();
        // addDoubleAndInt(12.2,36);
        //  averageAndRound(98,92,65);
        // convertAscii();

    }
    public static void printName(){
        String name =  scan.nextLine();
        System.out.println("שלום, "+name);
    }

    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void average(double num1, double num2, double num3){
        double avg = (num1+num2+num3)/3.0;
        System.out.println(Math.floor(avg*100)/100);
    }

    public static void extract(int num){
        System.out.println(num/100);
        System.out.println((num/10)%10);
        System.out.println(num%10);
    }

    public static void reversString(String str){
        StringBuilder res = new StringBuilder(str);
        System.out.println(res.reverse().toString()); 
    }

    public static void convertFromSeconds(int sec){
        int hoers = sec/3600;
        int minutes = (sec/3600)%60;
        int seconds = sec%60;
        System.out.println(hoers+":"+minutes+":"+seconds);
    }

    public static void convertDate(int day, int month, int year) {
    String mon = "";
    switch (month) {
        case 1:
            mon = "ינואר";
            break;
        case 2:
            mon = "פברואר";
            break;
        case 3:
            mon = "מרץ";
            break;
        case 4:
            mon = "אפריל";
            break;
        case 5:
            mon = "מאי";
            break;
        case 6:
            mon = "יוני";
            break;
        case 7:
            mon = "יולי";
            break;
        case 8:
            mon = "אוגוסט";
            break;
        case 9:
            mon = "ספטמבר";
            break;
        case 10:
            mon = "אוקטובר";
            break;
        case 11:
            mon = "נובמבר";
            break;
        case 12:
            mon = "דצמבר";
            break;
        default:
            mon = "חודש לא חוקי";
    }

    System.out.println(day + " ב" + mon + ", " + year);
}

public static void convertFromString(String str){
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
       int num =  str.charAt(i)-'0';
       System.out.println(num);
       sum+=num;
    }
    double avg = (double) sum/str.length();
    System.out.println("sum: "+ sum);
    System.out.println("average: "+ avg);
}

public static void convertDoubleToInt(){
    double num = scan.nextDouble();
    System.out.println("double: "+ num);
    System.out.println("int: "+ " "+(int)num);
}

public static void convertCharToInt(){
char c = scan.next().charAt(0);
System.out.println("הקוד של התו "+c+"הוא "+(int)c);
}

public static void addDoubleAndInt(double num1, int num2){
    double add = num1+num2;
System.out.println("before: "+add);
System.out.println("after: "+(int)add);
}

public static void averageAndRound(double score1, double score2, double score3){
    double avg = score1+score2+score3/3.0;
    System.out.println("before: "+avg);
    System.out.println("after: "+(int)avg);
}

public static void convertAscii(){
    int num = scan.nextInt();
    System.out.println((char)num);
    System.out.println((char)(num+32));
}
 }