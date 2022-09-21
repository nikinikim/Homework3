public class Main {
    public static void main(String[] args) {

        // Задание 1
        int a = 1234123412;
        byte b = 2;
        short c = 32000;
        long d = 372_036_854_775_807L;
        float e = 38.4578999f;
        double f = 34.777777777;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задание 2
        byte x = 67;
        short y = 569;
        int z = 27897;
        long v = 987678965549L;
        float u = 2.786f;
        double o = 27.12;
        boolean p = false;

        // Задание 3
        int classLP = 23;
        int classAS = 27;
        int classEA = 30;
        int sheets = 480;
        int totalStudents = classLP + classAS + classEA;
        int sheetsForEach = sheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги");

        // Задание 4
        byte machinePerf = 8;
        byte min = 20;
        short minInDay = 1440;
        int minIn3Days = minInDay * 3;
        long minInMonth = minInDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + 8 * min + " штук");
        System.out.println("За сутки машина произвела бутылок " + 8 * minInDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + 8 * minIn3Days + " штук");
        System.out.println("За месяц машина произвела бутылок " + 8 * minInMonth + " штук");

        // Задание 5
        byte cans = 120;
        byte whiteOnClass = 2;
        byte brownOnClass = 4;
        int cansOnClass = whiteOnClass + brownOnClass;
        int classes = cans / cansOnClass;
        System.out.print("Школа, где " + classes + " классов, нужно " + classes * whiteOnClass + " банок белой ");
        System.out.println("краски " + brownOnClass * classes + " банок коричневой краски");

        // Задание 6












    }
}