package com.rdk.rps.player;

public class HumanPlayer implements Player {

    private final String name;

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


}
