package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"})
public interface Car extends HasBrand, isMaintenance {

    // public abstract void drive();
    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }

}
