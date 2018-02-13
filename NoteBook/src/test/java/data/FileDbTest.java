package data;

import org.junit.Test;


import static org.junit.Assert.*;

public class FileDbTest {

    @Test
    public void findAll() throws Exception {
        FileDb fileDb1 = new FileDb("C:\\Users\\User\\Polina\\HomeWork\\NoteBook\\src\\test\\java\\data\\test");
        String test = "Test";
        String test2 = "Hello";
        fileDb1.save(test);
        fileDb1.save(test2);
        Object[] arr = new Object[]{test,test2};
        assertEquals(arr, fileDb1.findAll());
    }
}