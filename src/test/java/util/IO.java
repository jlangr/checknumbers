package util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class IO {
   public static BufferedReader toBufferedReader(String s) {
      var stream = new ByteArrayInputStream(s.getBytes());
      return new BufferedReader(new InputStreamReader(stream));
   }
}
