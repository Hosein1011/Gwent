package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Regex {
    USERNAME("^[a-zA-Z0-9_]+$"),
    EMAIL("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"),
    PASSWORD("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");

    final String regex;

    Regex(String regex) {
        this.regex = regex;
    }

    public Matcher getMatcher(String string) {
        return Pattern.compile(regex).matcher(string);
    }
}
