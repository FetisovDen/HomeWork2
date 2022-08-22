public class Main {
    public static void main(String[] args) {


 // Задание 1

byte a = 1;
short b = 2;
int c = 3;
long d = 5L;
double e = 1.59;
float f = 1.67f;
char g = 'o';
boolean h = c > 2;

// Задание 2
double firstBoxerWeight = 78.2;
double secondBoxerWeight = 82.7;
double generalWeight = firstBoxerWeight + secondBoxerWeight;
System.out.println( "Общий вес: " + generalWeight + " кг");
double differenceWeight = secondBoxerWeight - firstBoxerWeight;
System.out.println("Разница: " + differenceWeight + " кг");

//Задание 3
byte bananas = 5;
byte milk = 2;
byte iceCream = 2;
byte agg = 4;

byte bananasWeight = 80;
byte milkWeight = 105;
byte iceCreamWeight = 100;
byte aggWeight = 70;

int allBananasWeight = bananas * bananasWeight;
int allMilkWeight = milk * milkWeight;
int allIceCreamWeight = iceCream * iceCreamWeight;
int allAggWeight = agg * aggWeight;

int breakfastWeight = allBananasWeight + allMilkWeight + allIceCreamWeight + allAggWeight;
System.out.println("Общий вес завтрака в граммах: " + breakfastWeight + " грамм");
int kg = 1000;
float breakfastWeightKg = breakfastWeight / (float)kg;
System.out.println("Общий вес завтрака в килограммах: " + breakfastWeightKg + " кг");

//Задание 4

byte  loseWeightKg = 7;
int system1Gr = 250;
int system2Gr = 500;
int daySystem1 = loseWeightKg * 1000 / system1Gr;
int daySystem2 = loseWeightKg * 1000 / system2Gr;
System.out.println("250 в день: " + daySystem1 + " дней");
System.out.println("500 в день: " + daySystem2 + " дней");
int dayAvg = (daySystem1 + daySystem2) / 2 ;

System.out.println("Среднее количество дней: " + dayAvg);

//Задание 5

int MashaEarn = 67760;
double MashaEarn2 = (MashaEarn / (double) 100 * (double) 10) + MashaEarn;
double MashaInYear1 = MashaEarn * 12;
double MashaInYear2 = MashaEarn2 * 12;
double MashaDifference = MashaInYear2 - MashaInYear1;
System.out.println("Маша теперь получает: " + MashaEarn2 + " рублей. Годовой доход вырос на: " + MashaDifference + " рублей");

int KristinaEarn = 76230;
double KristinaEarn2 = (KristinaEarn / (double) 100 * (double) 10) + KristinaEarn;
double KristinaInYear1 = KristinaEarn * 12;
double KristinaInYear2 = KristinaEarn2 * 12;
double KristinaDifference = KristinaInYear2 - KristinaInYear1;
System.out.println("Кристина теперь получает: " + KristinaEarn2 + " рублей. Годовой доход вырос на: " + KristinaDifference + " рублей");

int DenisEarn = 83690;
double DenisEarn2 = (DenisEarn / (double) 100 * (double) 10) + DenisEarn;
double DenisInYear1 = DenisEarn * 12;
double DenisInYear2 = DenisEarn2 * 12;
double DenisDifference = DenisInYear2 - DenisInYear1;
System.out.println("Маша теперь получает: " + DenisEarn2 + " рублей. Годовой доход вырос на: " + DenisDifference + " рублей");















    }
}
