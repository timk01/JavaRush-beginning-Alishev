package javasyntax4;

import java.util.Objects;

public class EqualsAndHashCode {
    private String name = "безымянный кот";
    private int added;
    private A a;

    public void setName(String name) {
        this.name = name;
    }

    public void setAdded(int added) {
        this.added = added;
    }

    public String getName() {
        return name;
    }

    public int getAdded() {
        return added;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCode that = (EqualsAndHashCode) o;
        return added == that.added && Objects.equals(name, that.name) && Objects.equals(a, that.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, added, a);
    }

    public static void main(String[] args) {
        EqualsAndHashCode equalsAndHashCode1 = new EqualsAndHashCode();
        equalsAndHashCode1.setName("Barsik");
        equalsAndHashCode1.setAdded(123);
        equalsAndHashCode1.setA(new A());
        //equalsAndHashCode1 = null; //NPE

        EqualsAndHashCode equalsAndHashCode2 = new EqualsAndHashCode();
        equalsAndHashCode2.setName("Barsik");
        equalsAndHashCode2.setAdded(123);
        equalsAndHashCode2.setA(new A());

        //ОЧЕНЬ важно: переопределять соответствующие методы в классах (например А)

        System.out.println(equalsAndHashCode1.equals(equalsAndHashCode2));
        System.out.println(equalsAndHashCode1.hashCode() == equalsAndHashCode2.hashCode());


        String s1 = new String("Привет эксперты");
        String s2 = new String ("Привет эксперты");
        String s3 = "Привет эксперты";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode() == s3.hashCode());
    }
}

////https://srvaroa.github.io/jvm/java/openjdk/biased-locking/2017/01/30/hashCode.html
// все не так просто с хэшкодом

//https://javarush.com/groups/posts/2179-metodih-equals--hashcode-praktika-ispoljhzovanija
