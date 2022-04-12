package ru.nsu.fit.oop.task_2_1_3.sprite;

import ru.nsu.fit.oop.task_2_1_3.skin.Skin;
import ru.nsu.fit.oop.task_2_1_3.sprite.Sprite;

public class Tail extends Sprite {
    private final Skin tail;

    public Tail(Skin tail) {
        this.tail = tail;
    }

    public void updateTailImage(Sprite previousFlake) {
        if (getPositionY() == previousFlake.getPositionY()) {
            if (getPositionX() < previousFlake.getPositionX()) {
                setImage(tail.getSkin());
                return;
            }
            if (getPositionX() > previousFlake.getPositionX()) {
                setImage(tail.getRotatedSkin(180));
                return;
            }
        }
        if (getPositionY() > previousFlake.getPositionY()) {
            setImage(tail.getRotatedSkin(270));
            return;
        }
        setImage(tail.getRotatedSkin(90));
    }
}
