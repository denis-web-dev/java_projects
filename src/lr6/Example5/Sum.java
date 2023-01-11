package lr6.Example5;

public class Sum {
    // Нерекурсивный метод
    static int sum(int num)
    {
        int result = 0;
        for (int i = 1; i <= num; i++)
            result += (int)(Math.pow(i, 2));
        return result;
    }

    // Рекурсивный метод
    static int sumrekurs(int num)
    {
        if (num <= 1)
            return num;
        else
            return sumrekurs(num - 1) + num * num;
    }

}
