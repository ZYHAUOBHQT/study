package com.zbq001_JavaBasics.CabiAhCf_Interface_20180725;

public interface Hockey extends Sports {
    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}