package javasyntax3;

public class PrePostIncrement {
    public static void main(String[] args) {
        int x = 1;
        x = (x++ + ++x);
        System.out.println(x);

        int y = 1;
        y = y++ + 1 + y;
        System.out.println(y); // та же логика - см. ниже

        int z = 1;
        z = (++z + z++);
        System.out.println(z); //4

        int z1 = 1;
        z1 = (++z1 + z1++);
        System.out.println(z1);

        int z2 = 1;
        z2 = (z2++ + z2);
        System.out.println(z2); //3
    }
}

/*
int x = 1;
x = x++ + ++x;
System.out.println(x);
//у ++ и -- приоритет ВЫШЕ чем у +
//сначала будет х++ (что ничего не даст, т.к. САМ х будет оставаться 1.) а вот уже...
= (1) + ++2
//++х (что дало бы раньше 2, станет 3, т.к. он изменился после), потом сумма 1+3, потом ++
 */


