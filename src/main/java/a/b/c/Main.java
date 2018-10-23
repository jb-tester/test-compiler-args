package a.b.c;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ReadProps readProps = new ReadProps();
        try {
            readProps.displayProps();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
