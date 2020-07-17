package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Defensable, Attackable {
    private String name;
    public AbstractRobot(String name) {
        this.name = name;
    }

    protected AbstractRobot() {
    }

    public String getName() {
        return name;
    }

    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = (int) (Math.random()*4) + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.ARM;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = (int) (Math.random()*4) + 1;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.HEAD;
        }
        return defendedBodyPart;
    }
}
