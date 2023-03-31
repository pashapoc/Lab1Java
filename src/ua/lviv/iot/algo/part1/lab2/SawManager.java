package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

import java.util.LinkedList;
import java.util.stream.Collectors;

@ToString
public class SawManager {
    public static void addSaw (final Saw gasSaw){
        saws.add(gasSaw);
    };
    static LinkedList <Saw> saws = new LinkedList <Saw> ();
    public static LinkedList<Saw> findSawByPowerQuantity(int power) {
        return saws.stream().filter((object) -> object.getPower() > power).collect(Collectors.toCollection(LinkedList::new));
    };
    public static LinkedList<Saw> findSawByWorkTime(double WorkInHours) {
        return saws.stream().filter((object) -> object.getWorkInHours() > WorkInHours).collect(Collectors.toCollection(LinkedList::new));
    };
    public static void main(String[] args) {
        Chainsaw chainsaw = new Chainsaw(1, 0.8, 0.1,"Husqvarna", 3000, 0.50, false);
        Chainsaw chainsaw1 = new Chainsaw(1.4, 0.7, 0.1,"Supretto", 2800, 0.60, false);
        ElectricSaw electricSaw = new ElectricSaw("Blades", 240, "Husqvarna", 3700, 1.20, false);
        ElectricSaw electricSaw1 = new ElectricSaw("Blades", 200, "Supretto", 2900, 1.60, false);
        Chainsaw gasSaw = new Chainsaw(2, 1.6, 0.4, "Husqvarna", 2600, 0.50, false);
        MiniRechargeableSaw miniRechargeableSaw = new MiniRechargeableSaw("Lithium Ion","Supretto", 550, 2, false);
        MiniRechargeableSaw miniRechargeableSaw1 = new MiniRechargeableSaw("Lithium Polymer","BLACK+DECKER", 700, 1.80, false);
        ReciprocatingSaw reciprocatingSaw = new ReciprocatingSaw("Break", "BLACK+DECKER", 1800, 1.20, false);
        ReciprocatingSaw reciprocatingSaw1 = new ReciprocatingSaw("Break", "Supretto", 2100, 1.10, false);
        saws.add(chainsaw);
        saws.add(chainsaw1);
        saws.add(electricSaw);
        saws.add(electricSaw1);
        saws.add(miniRechargeableSaw);
        saws.add(miniRechargeableSaw1);
        saws.add(reciprocatingSaw);
        saws.add(reciprocatingSaw1);
        saws.add(gasSaw);
        for (Saw object : saws) {
            System.out.println(object);
        }
        //saws.getFirst().cutWood(4.0);
        System.out.println(findSawByPowerQuantity(2000));
        System.out.println(findSawByWorkTime(0.70));
    }
}