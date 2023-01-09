package javasyntax4;

import java.util.Objects;

public class A {
    private String aString = "A String";

    public A(String aString) {
        this.aString = aString;
    }

    public A() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(aString, a.aString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aString);
    }
}
