package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Egg6 {

    private Needle7 needle;

    @Autowired
    public Egg6(Needle7 needle) { this.needle = needle; }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
