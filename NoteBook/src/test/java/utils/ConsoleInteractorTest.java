package utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleInteractorTest extends OutputTest {
    ConsoleInteractor consoleInteractor = new ConsoleInteractor();
    String string = new String("Test");

    @Test
    public void readCommand() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("Test".getBytes());
        System.setIn(in);
        Assert.assertEquals(this.string+"\r\n",consoleInteractor.readCommand());
    }

    @Test
    public void print() throws Exception {
        consoleInteractor.print(this.string);
        Assert.assertEquals(this.string+"\r\n", output.toString());
    }
}