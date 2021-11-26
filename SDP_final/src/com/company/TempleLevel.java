package com.company;

public class TempleLevel extends LevelDecorator {
    public TempleLevel(Level level) {
        super(level);
    }

    public String TempleLandscape(){
        return "temple landscape, ";
    }

    @Override
    public String generateLevel() {
        return super.generateLevel() + TempleLandscape();
    }
}
