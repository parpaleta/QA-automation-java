package work.lecture6;

public class ConstructionsIfElseSwitch {
    // 1
    int nr = 15;
    // 2
    float a = 10.5f;
    float b = 15.5f;
    float c = 44.5f;
    float ha = 5.0f;
    // 3
    float num = -5.6f;

    public static void main(String[] args){
        ConstructionsIfElseSwitch homework = new ConstructionsIfElseSwitch();
 // 1
        homework.getDayOfTheWeek(homework.nr);
//  2
        homework.calculatePerimOfTriangle(homework.a, homework.b, homework.c);
        homework.calculateAreaOfTriangle(homework.a, homework.ha);
//  3
        homework.findPositiveOrNegativeNumber(homework.num);
//  4
        homework.findTheLargestNumber(homework.a, homework.b, homework.c);
    }

    private void findTheLargestNumber(float a, float b, float c){
//  4
//  приема 3 подадени цифри и определя коя е най-голямата
        if ((a>b) && (a>c)) {
            System.out.println("The largest number is " + a);
        } else if ((b>a) && (b>c)) {
            System.out.println("The largest number is " + b);
        } else {
            System.out.println("The largest number is " + c);
        }

    }

    private void findPositiveOrNegativeNumber(float num){
//  3
//  чете цифра (или се приема като параметър на метод) и изписва в конзолата дали числото е положително или отрицателно
        String result = (num > 0 ? "The number you entered is positive." : "The number you entered is negative.");
        System.out.println(result);
    }

    private void calculatePerimOfTriangle(float a, float b, float c){
//   2 a
//   за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър
        float perim = a + b + c;
        System.out.println("The perimeter of the triangle is: " + perim + " cm");
    }

    private void calculateAreaOfTriangle(float a, float ha){
//   2 b
//   за подадени дължина и височина на правоъгълник, изкарват на конзолата неговoто лица
        float area = 0.5f * a * ha;
        System.out.println("The area of the triangle is: " + area + " cm2");
    }

    private void getDayOfTheWeek (int nrDay){
           /* 1
            чете цифра от 1 до 7 в конзолата (или се приема като параметър на метод) и на базата на това изписва в конзолата деня от седмицата във формат:
            You entered 1. So week day is Monday. */
        String daysName;
        switch (nrDay){
            case 1:
                daysName = "Monday";
                break;
            case 2:
                daysName = "Tuesday";
                break;
            case 3:
                daysName = "Wednesday";
                break;
            case 4:
                daysName = "Thursday";
                break;
            case 5:
                daysName = "Friday";
                break;
            case 6:
                daysName = "Saturday";
                break;
            case 7:
                daysName = "Sunday";
                break;
            default:
                daysName = "Unknown";
        }
        System.out.println("You entered " + nrDay + ". So week day is " + daysName + ".");
    }
}
