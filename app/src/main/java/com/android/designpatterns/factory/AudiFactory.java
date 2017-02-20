package com.android.designpatterns.factory;

/**
 * Created by user on 17-2-13.
 */

public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
