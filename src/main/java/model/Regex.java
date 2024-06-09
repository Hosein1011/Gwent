package model;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public enum Regex {
    USERNAME("^[a-zA-Z0-9_]{3,15}$"),
    PASSWORD("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"),
    EMAIL("^[A-Za-z0-9+_.-]+@(.+)$");

    private Pattern pattern;

    Regex(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public Matcher getMatcher(String input) {
        return this.pattern.matcher(input);
    }
}
