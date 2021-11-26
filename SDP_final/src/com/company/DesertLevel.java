package com.company;

public class DesertLevel extends LevelDecorator{

    public DesertLevel(Level level) {
        super(level);
    }
    public String DesertLandscape(){
        return "desert landscape, ";
    }
    @Override
    public String generateLevel() {
        return super.generateLevel() + DesertLandscape();
    }
}
