package com.company;

public class LevelDecorator implements Level{

    Level level;

    public LevelDecorator(Level level) {
        this.level = level;
    }

    @Override
    public String generateLevel() {
        return level.generateLevel();
    }
}
