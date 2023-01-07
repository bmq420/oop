package com.lab10.exercise1;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRents() {
        long maxLength = 0;
        for (int i = 0; i < rents.length; i++) {
            if (rentLength((rents[i])) >= maxLength) {
                maxLength = rentLength(rents[i]);
            }
        }
        for (int i = 0; i < rents.length; i++) {
            if (maxLength == rentLength(rents[i])) {
                return rents[i];
            }
        }
        return null;
    }

    public long rentLength(Rent rent) {
        long diff = rent.getEnd().getTime() - rent.getBegin().getTime();
        return diff;
    }
}
