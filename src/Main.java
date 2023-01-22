public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача №1");
        int [] mass = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;

        double [] dab = {1.57, 7.654, 9.986};

        int [] gro = new int[10];
        gro[0] = 1;

    }
    public static void task2(){
        System.out.println("Задача №2");
        int [] mass = {1, 2, 3, 4, 5};
        for (int i = 0; i < mass.length; i++) {
            System.out.print(i);
            if (i != mass.length - 1){
                System.out.print(" , ");
            }
        }

    }
    public static void task3(){
        System.out.println("Задача №3");
        int [] mass1 = new int[3];
        {
            for (int i = mass1.length - 1; i >= 0; i--){
                mass1[i] = i + 1;
                System.out.println(mass1[i] + " ");
                if (i < mass1.length - 1) {
                    System.out.println(" , ");
                }
            }
            System.out.println();
            System.out.println("Второй массив");
            double[] mass2 = {1.57, 7.654, 9.986};
            for (int i = mass2.length - 1; i >= 0; i--) {
                System.out.println(mass1[i]);
                if (i < mass2.length - 1){
                    System.out.println(" , ");
                }
                
            }
        }

    }
}