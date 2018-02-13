package utils;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class OutputTest {

 protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

 @Before
 public void setUpStreams() {
  System.setOut(new PrintStream(output));
 }

 @After
 public void cleanUpStreams() {
  System.setOut(null);
 }
}