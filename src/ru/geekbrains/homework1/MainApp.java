package ru.geekbrains.homework1;

public class MainApp
{
    public static void main(String[] args)
    {
        System.out.println(calculate(5f,5f,4f,3f));
        System.out.println(summa10to20(12, 30));
        plusMinus(10);
        System.out.println(minusPlus(10));
        hey("Андрей");
        year(2004);
    }

    byte val1 = 0;
    short val2 = 1;
    int val3 = 1000;
    long val4 = 500L;
    float val5 = 0.1f;
    double val6 = 120.45;
    char val7 = '*';
    boolean val8 = true;

    public static float calculate(float a, float b, float c, float d)
    {
        return a * (b + (c / d));
    }

    public static boolean summa10to20(int a1, int a2)
    {
        if ((a1 + a2) >= 10 && (a1 + a2) <= 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void plusMinus(int a)
    {
        if (a >= 0)
        {
            System.out.println("Число положительное");
        }
        else
        {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean minusPlus(int b)
    {
        if (b >= 0)
        {
            return false;
        }

        else
        {
            return true;
        }
    }

    public static void hey(String name)
    {
        System.out.println("Привет, " + name + "!");
    }

    public static void year(int god)
    {
        if ((god % 400) == 0 || ((god % 4) == 0 && (god % 100) != 0))
        {
            System.out.println("Год високосный");
        }
        else
        {
            System.out.println("Год не високосный");
        }
    }

}
