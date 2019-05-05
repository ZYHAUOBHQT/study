package com.zbq001_JavaBasics.CabiAhCf_Interface_20180725;

public interface Football extends Sports {
    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}