package edu.kirkwood;

import java.util.List;
import java.util.function.Predicate;

public class RoboMailTest01 {
    public static void main(String[] args) {
        List<Employee> pl = Employee.getShortList();
        RoboMail01 robo = new RoboMail01();

        Predicate<Employee> salesExecutives =
                p -> p.getRole().equals(Role.EXECUTIVE)
                && p.getDept().equals("Sales");

        Predicate<Employee> salesEmployeesOver50 =
                p -> p.getAge() >= 50 && p.getDept().equals("Sales");

        System.out.println("\n=== RoboMail 01");
        System.out.println("\n=== Sales Execs ===");
//        robo.mail(pl, salesExecutives); // Convert to stream and forEach
//        robo.text(pl, salesExecutives); // Convert to stream and forEach
        pl.stream()
                .filter(salesExecutives)
//                .forEach(t -> robo.roboMail(t));
                .forEach(robo::roboMail);
        pl.stream()
                .filter(t -> t.getDept().equals("Sales"))
                .filter(t -> t.getRole().equals(Role.EXECUTIVE))
                .forEach(p -> robo.roboMail(p));
        pl.stream()
                .filter(salesExecutives)
//                .forEach(t -> robo.roboText(t));
                .forEach(robo::roboText);

        System.out.println("\n=== All Sales ===");
//        robo.mail(pl, salesEmployeesOver50); // Convert to stream and forEach
//        robo.text(pl, salesEmployeesOver50); // Convert to stream and forEach
        pl.stream()
                .filter(salesEmployeesOver50)
//                .forEach(t -> robo.roboMail(t));
                .forEach(robo::roboMail);
        pl.stream()
                .filter(t -> t.getDept().equals("Sales"))
                .filter(t -> t.getAge() > 50)
                .forEach(p -> robo.roboMail(p));
        pl.stream()
                .filter(salesEmployeesOver50)
//                .forEach(t -> robo.roboText(t));
                .forEach(robo::roboText);

        System.out.println("\n=== Male Engineers Under 65 ===");
        pl.stream()
                .filter(t -> t.getGender().equals(Gender.MALE))
                .filter(t -> t.getDept().equals("Engineering"))
                .filter(t -> t.getAge() < 65)
                .forEach(p -> robo.roboMail(p));
    }
}
