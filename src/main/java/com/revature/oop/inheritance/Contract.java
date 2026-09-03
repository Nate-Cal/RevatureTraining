package com.revature.oop.inheritance;

public interface Contract {

    String airSpeedVelocityOfAnUnladenSwallow = "African or European?";

    public static final int num = 0;

    String returnAnswerToBridgeKeeperQuestion();

    static String returnAnswerInStaticForm () {
        return airSpeedVelocityOfAnUnladenSwallow;
    }

    default String returnAnswerDefaultVersion() {
        return Contract.airSpeedVelocityOfAnUnladenSwallow;
    }

}
