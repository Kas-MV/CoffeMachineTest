package org.home.steps;

import cucumber.api.DataTable;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.То;
import org.home.steps.CoffeeMachine;
import org.junit.Assert;
import org.w3c.dom.ls.LSOutput;

import java.util.Map;

public class MySteps {
    private final CoffeeMachine coffeeMachine = new CoffeeMachine();


    @Пусть("^Пользователь добавляет в кофе (\\d+) грамм зёрен кофе$")
    public void addCoffeeToCoffeeMachine(int coffee) {
        coffeeMachine.addCoffeeSeeds(coffee);
        System.out.println("Пользователь добавил " + coffee + "грамм кофе");
    }

    @И("^Пользователь добавляет в кофемашину (\\d+) миллилитров воды$")
    public void addWaterInCoffeeMachine(int water) {
        coffeeMachine.addWater(water);
        System.out.println("Пользователь добавил " + water + "миллилитров воды");

    }

    @Когда("^Пользователь делает кружку с кофе$")
    public void userCoffee() {
        coffeeMachine.doOneCupOfCoffee();
        System.out.println("Пользователь делает кружку с кофе");
    }

    @То("^В кофемашине осталось (\\d+) грамм зёрен$")
    public void inCoffeeMachineGrammZeren(int coffee) {
        Assert.assertEquals(coffee, coffeeMachine.getCoffeeSeeds());
    }

    @То("^В кофемашине осталось (\\d+) миллилитров воды$")
    public void inCoffeeMachineGrammWater(int water) {
        Assert.assertEquals(water, coffeeMachine.getWater());
    }

    @Пусть("^Пользователь добавляет в кофемашину$")
    public void пользовательДобавляетВКофемашину(Map<String, Integer> map) {
        coffeeMachine.addCoffeeSeeds(map.get("coffee"));
        coffeeMachine.addWater(map.get("water"));
    }

    @И("^Пользователь говорит$")
    public void пользовательГоворит(String userText) {
        System.out.println(userText);
    }

    @То("^В кофемашине осталось$")
    public void вКофемашинеОсталось(Map<String, Integer> map) {
        int coffee = map.get("coffee");
        int water = map.get("water");
        Assert.assertEquals(coffee, coffeeMachine.getCoffeeSeeds());
        Assert.assertEquals(water, coffeeMachine.getWater());
    }
}
