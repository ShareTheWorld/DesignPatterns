package com.android.designpatterns.command;

/**
 * Created by user on 17-2-20.
 */

/**
 * Created by user on 17-2-20.
 */

public class FallCommand implements Command{
    private TetrisMachine machine;
    public FallCommand(TetrisMachine machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.fastToBottom();
    }
}
