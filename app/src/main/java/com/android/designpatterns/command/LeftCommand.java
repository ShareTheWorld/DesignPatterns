package com.android.designpatterns.command;

import junit.framework.TestResult;

/**
 * Created by user on 17-2-20.
 */

public class LeftCommand implements Command {
    private TetrisMachine machine;
    public LeftCommand(TetrisMachine machine){
        this.machine=machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
