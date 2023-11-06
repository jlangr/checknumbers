package tablature;

import java.util.ArrayList;
import java.util.List;

public class Tab {

   enum Notes {
      e,
      B,
      G,
      D,
      A,
      E
   }
   public List<Character> toNotes(String tab) {
      var lines = tab.split(System.lineSeparator());

      var e = lines[0];
      var b = lines[1];

      var notes = new ArrayList<Character>();

      for (int i = 1; i < lines[0].length(); i++) {
         if (e.charAt(i) != '-')
            notes.add('E');
         else if (b.charAt(i) != '-')
            notes.add('B');
      }


      return notes;
   }

}
