package com.company;

public class DayTimeNight extends LevelDecorator{
    public DayTimeNight(Level level) {
        super(level);
    }

    public String DayTime(){
        return "day time is night!";
    }

    @Override
    public String generateLevel() {
        return super.generateLevel() + DayTime();
    }
}
