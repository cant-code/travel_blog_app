package com.example.travelblog;

import java.util.Objects;

public class Author {

    private String name;
    private String avatar;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(avatar, author.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avatar);
    }

    public String getName() {
        return this.name;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarUrl() {
        return BlogHttpClient.BASE_URL + BlogHttpClient.PATH + getAvatar();
    }
}
