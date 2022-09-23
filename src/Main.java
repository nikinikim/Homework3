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
        double bananas = 400;
        double milk = 210;
        double iceCream = 200;
        double eggs = 280;
        double breakfastWeight = (bananas + milk + eggs + iceCream) / 1000;
        System.out.println("Вес завтрака = " + breakfastWeight + " кг");

        // Задание 7
        double needToLose = 7;
        double firstPlan = 0.25;
        double secondPlan = 0.5;
        double firstPlanDays = needToLose / firstPlan;
        double secondPlanDays = needToLose / secondPlan;
        double averagePlanDays = (firstPlanDays + secondPlanDays) / 2;
        System.out.println(firstPlanDays + " уйдет на похудение, если спортсмен будет терять по 250 грамм");
        System.out.println(secondPlanDays + " уйдет на похудение, если спортсмен будет терять по 500 грамм");
        System.out.println(averagePlanDays + " дней потребуется в среднем, чтобы добиться результата похудения");

        // Задание 8
        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeCristina = 76230;
        double newIncomeMasha = (incomeMasha + (incomeMasha * 0.1));
        double newIncomeDenis = (incomeDenis + (incomeDenis * 0.1));
        double newIncomeCristina = (incomeCristina + (incomeCristina * 0.1));
        double newDifIncomeMasha = ((newIncomeMasha - incomeMasha) * 12);
        double newDifIncomeDenis = ((newIncomeDenis - incomeDenis) * 12);
        double newDifIncomeCristina = ((newIncomeCristina - incomeCristina) * 12);
        System.out.print("Маша теперь получает " + newIncomeMasha + " рублей. Годовой доход вырос на ");
        System.out.println(newDifIncomeMasha + " рублей");
        System.out.print("Денис теперь получает " + newIncomeDenis + " рублей. Годовой доход вырос на ");
        System.out.println(newDifIncomeDenis + " рублей");
        System.out.print("Кристина теперь получает " + newIncomeCristina + " рублей. Годовой доход вырос на ");
        System.out.println(newDifIncomeCristina + " рублей");









    }
}