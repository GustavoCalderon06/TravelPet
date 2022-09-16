package data;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class textFileTest {

    @Test
    void leerArchivo()  {
        ArrayList<String> actual = textFile.leerArchivo("src/test/java/data/readerTest");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("hola");
        assertEquals(expected, actual);


    }
}