package org.example.Lesson10.P4;
import org.example.Lesson10.P1.A;
import org.example.Lesson10.P1.P2.B;
import org.example.Lesson10.P1.P2.P3.C;
import org.example.Lesson10.P4.P5.*;

import java.sql.SQLOutput;

import static org.example.Lesson10.P1.P2.B.*;


public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);

        System.out.println(b1);




    }

}
