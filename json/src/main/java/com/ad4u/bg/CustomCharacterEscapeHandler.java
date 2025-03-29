package com.ad4u.bg;

import java.io.IOException;
import java.io.Writer;
import org.glassfish.jaxb.core.marshaller.CharacterEscapeHandler;

public class CustomCharacterEscapeHandler implements CharacterEscapeHandler {
  @Override
  public void escape(char[] chars, int start, int length, boolean isAttVal, Writer out)
      throws IOException {
    int limit = start + length;
    for (int i = start; i < limit; i++) {
      char c = chars[i];
      if ((c == '&'
          || (c == '<'
              && ((i + 3) < length)
              && (chars[i + 3] == 'C')
              && ((i + 4) < length)
              && (chars[i + 4] == 'D')
              && ((i + 5) < length)
              && (chars[i + 5] == 'A')
              && ((i + 6) < length)
              && (chars[i + 6] == 'T'))
          || c == '>'
          || (c == '\"' && isAttVal)
          || (c == '\'' && isAttVal))) {
        if (i != start) {
          out.write(chars, start, i - start);
        }
        start = i + 1;
        switch (chars[i]) {
          case '&':
            out.write("&amp;");
            break;

          case '<':
            out.write("<");
            break;

          case '>':
            out.write(">");
            break;

            //                    case '\"':
            //                        out.write(""");
            //                        break;
            //
            //                    case '\'':
            //                        out.write("'");
            //                        break;
        }
      }
    }
    if (start != limit) {
      out.write(chars, start, limit - start);
    }
  }
}
