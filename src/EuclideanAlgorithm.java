import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Artem on 27.06.2017.
 */
public class EuclideanAlgorithm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sc.nextInt();
        System.out.println("Введите число б: ");
        int b = sc.nextInt();
        int c = 0, del = 0;
        int e = 0, v = 1, u = 0;
        System.out.println("NOD");
        int d = nod(a, b);
        ArrayList<Integer> massA = new ArrayList<Integer>();
        ArrayList<Integer> massB = new ArrayList<Integer>();
        ArrayList<Integer> massM = new ArrayList<Integer>();
        ArrayList<Integer> massDel = new ArrayList<Integer>();
        ArrayList<Integer> massU = new ArrayList<Integer>();
        ArrayList<Integer> massV = new ArrayList<Integer>();
        while (b > 0){
            c = a % b;
            del = a / b;
            massM.add(c);
            massDel.add(del);
            massA.add(a);
            a = b;
            massB.add(b);
            b = c;
        }
        System.out.println("");
        massA.add(a);
        for (int i = 0; i < massA.size(); i++) {
            System.out.print("A=   " + massA.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < massB.size(); i++) {
            System.out.print("B=   " + massB.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < massM.size(); i++) {
            System.out.print("MOD= " + massM.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < massDel.size(); i++) {
            System.out.print("a/b= " + massDel.get(i) + " ");
        }
        System.out.println("");
        for (int i = massA.size(); i > 0; i--){
            for (i = massB.size(); i > 0; i--){
                a = massA.get(i - 1);
                b = massB.get(i - 1);
                massU.add(u);
                v = (d - (a * u)) / b;
                massV.add(v);
                u = v;

            }
        }
        massU.add(0, 1);
        for (int i = massU.size(); i > 0; i--) {
            System.out.print("U=   " + massU.get(i - 1) + " ");
        }
        System.out.println("");
        massV.add(0, 0);
        for (int i = massV.size(); i > 0; i--) {
            System.out.print("V=  " + massV.get(i - 1) + " ");
        }

    }

    public static int nod(int a, int b){
        int min = 0;
        min = (a > b)? b: a;
        int d = 1;
        for (int i = 1; i <= min; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                d = i;
            }
        }
        System.out.println(d);
        return d;
    }
}