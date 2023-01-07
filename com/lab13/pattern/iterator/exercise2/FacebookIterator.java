package com.lab13.pattern.iterator.exercise2;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
        currentPosition = 0;
    }

    private void lazyInit() {
        if (cache == null)
            cache = facebook.socialGraphRequest(type);
    }

    @Override
    public Profile getNext() {
        if (hasMore())
            currentPosition++;
        return cache[currentPosition];
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length && cache[currentPosition] != null && !cache[currentPosition].getId().equals(profileId);

    }
}
