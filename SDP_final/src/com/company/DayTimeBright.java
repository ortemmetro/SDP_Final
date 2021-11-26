package com.company;

public class DayTimeBright extends LevelDecorator{
    public DayTimeBright(Level level) {
        super(level);
    }

    public String DayTime(){
        return "day time is noon!";
    }

    @Override
    public String generateLevel() {
        return super.generateLevel() + DayTime();
    }
}
