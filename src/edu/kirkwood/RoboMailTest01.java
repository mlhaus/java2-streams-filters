package edu.kirkwood;

import java.util.List;
import java.util.function.Predicate;

public class RoboMailTest01 {
    public static void main(String[] args) {
        List<Employee> pl = Employee.createShortList();
        RoboMail01 robo = new RoboMail01();


        System.out.println("\n=== RoboMail 01");
//        System.out.println("\n=== Sales Execs ===");
//        robo.mail(pl, salesExecutives); // Convert to stream and forEach
//        robo.text(pl, salesExecutives); // Convert to stream and forEach


        System.out.println("\n=== Sales Execs");
        Predicate<Employee> salesExecutives =
                p -> p.getRole().equals(Role.EXECUTIVE)
                        && p.getDept().equals("Sales");
        pl.stream()
                .filter(salesExecutives)
                .forEach(p -> robo.roboMail(p));

        pl.stream()
                .filter(salesExecutives)
                .forEach(p -> robo.roboText(p));

        System.out.println("\n=== Sales Execs");
        pl.stream()
                .filter(p -> p.getRole().equals(Role.EXECUTIVE))
                .filter(p -> p.getDept().equals("Sales"))
                .forEach(p -> robo.roboMail(p));

        System.out.println("\n=== All Sales 50+");
        Predicate<Employee> salesEmployeesOver50 =
                p -> p.getAge() >= 50 && p.getDept().equals("Sales");
        pl.stream()
                .filter(p -> p.getAge() >= 50)
                .filter(p -> p.getDept().equals("Sales"))
                .forEach(p -> robo.roboMail(p));

        System.out.println("\n=== Male Engineers Under 65 ===");
        pl.stream()
                .filter(p -> p.getGender().equals(Gender.MALE))
                .filter(p -> p.getDept().equals("Eng"))
                .filter(p -> p.getAge() < 65)
                .forEach(p -> robo.roboMail(p));
    }
}
