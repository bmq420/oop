package com.lab13.pattern.iterator.exercise2;

public class Facebook implements SocialNetwork {
    private Profile[] friends;
    private Profile[] coworkers;
    private int friendPosition;
    private int coworkerPosition;
    private final int SIZE = 100;

    public Facebook() {
        friends = new Profile[SIZE];
        coworkers = new Profile[SIZE];
        friendPosition = 0;
        coworkerPosition = 0;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    public Profile[] socialGraphRequest(String type) {
        if (type.equals("friends")) {
            return friends;
        } else if (type.equals("coworkers")){
            return coworkers;
        }
        return null;
    }

    public void add(Profile profile, String type) {
        if (type.equals("friends")) {
            friends[friendPosition++] = profile;
        } else if (type.equals("coworkers")){
            coworkers[coworkerPosition++] = profile;
        }
    }
}
