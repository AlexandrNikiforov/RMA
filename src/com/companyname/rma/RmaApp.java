package com.companyname.rma;

import com.companyname.rma.domain.Position;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class RmaApp {

    public static final String APP_NAME = "Recruitment Management Application";

    public static void main(String[] args) {
        Position position = new Position(1, "Java developer");
        position.doSomething();

        double pi = PI;
        int abs = abs(-10);
        System.out.println(abs);

    }
}
