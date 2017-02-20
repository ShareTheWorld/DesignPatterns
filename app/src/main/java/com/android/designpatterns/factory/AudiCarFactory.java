package com.android.designpatterns.factory;

/**
 * Created by user on 17-2-13.
 */

public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car=null;
        try {
            car = (AudiCar) (Class.forName(clz.getName()).newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)car;
    }
}
