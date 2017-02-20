package com.android.designpatterns.command;

import com.android.designpatterns.strategy.TranficCalculator;

/**
 * Created by user on 17-2-20.
 */

public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransformCommand transformCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }
    public void toLeft(){
        leftCommand.execute();
    }
    public void toRight(){
        rightCommand.execute();
    }
    public void fall(){
        fallCommand.execute();
    }
    public void transform(){
        transformCommand.execute();
    }
}
