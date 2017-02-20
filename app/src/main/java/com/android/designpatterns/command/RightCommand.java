package com.android.designpatterns.command;

/**
 * Created by user on 17-2-20.
 */

public class RightCommand implements Command{
    private TetrisMachine machine;
    public RightCommand(TetrisMachine machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
