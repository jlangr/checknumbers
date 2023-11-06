package tablature;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATab {
   @Test
   void convertsToNotes() {
      var tab = """
         E--
         B-0
         G--
         D--
         A--
         E--
         """;

      var notes = new Tab().toNotes(tab);

      assertEquals(asList('B'), notes);
   }

   @Test
   void convertsToMultipleNotesOnStrings() {
      var tab = """
         E--0-0
         B-0---
         G-----
         D-----
         A-----
         E-----
         """;

      var notes = new Tab().toNotes(tab);

      assertEquals(asList('B', 'E', 'E'), notes);
   }
}
