package data;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDbTest {
    ArrayDb arrayDb = new ArrayDb();
    String s = new String("Test");

    @Test
    public void save() throws Exception {
        arrayDb.save(s);
        Object[] results = arrayDb.findAll();
        assertEquals(results[0], s);
    }

    @Test
    public void findAll() throws Exception {
        String[] strings = new String[]{s};
        arrayDb.save(s);
        assertEquals(strings,arrayDb.findAll());
    }
}