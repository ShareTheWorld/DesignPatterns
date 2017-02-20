package com.android.designpatterns.command;

/**
 * Created by user on 17-2-20.
 */

public class Player {
    public static void main(String [] args){
        TetrisMachine machine=new TetrisMachine();

        LeftCommand leftCommand=new LeftCommand(machine);
        RightCommand rightCommand=new RightCommand(machine);
        FallCommand fallCommand=new FallCommand(machine);
        TransformCommand transformCommand=new TransformCommand(machine);

        Buttons buttons=new Buttons();

        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();
        


    }
}
