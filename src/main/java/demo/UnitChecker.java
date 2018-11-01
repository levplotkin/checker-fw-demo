package demo;

import org.checkerframework.checker.units.UnitsTools;
import org.checkerframework.checker.units.qual.Length;
import org.checkerframework.checker.units.qual.Time;
import org.checkerframework.checker.units.qual.kmPERh;
import org.checkerframework.checker.units.qual.mPERs;

public class UnitChecker {


    @Time
    private Float duration = 1F * UnitsTools.s;

    @Time
    private Float additionalTime = 1F * UnitsTools.s;

    @Time
    public Float addMoreTime() {
        return duration + additionalTime;
    }

// todo uncomment to get compilation error

/*
    @Length
    public Float calcLength() {
        @Length Float distance = 100F * UnitsTools.m;
        return distance * duration;
    }
*/


}
