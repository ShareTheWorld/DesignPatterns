package com.android.designpatterns.command;

/**
 * Created by user on 17-2-20.
 */

public class TransformCommand implements Command{
    private TetrisMachine machine;
    public TransformCommand(TetrisMachine machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.transform();
    }
}
