/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateImports {

  public static final List<String> minimalJavaTemplateImports;
  public static final List<String> defaultJavaTemplateImports;
  public static final List<String> defaultScalaTemplateImports;

  private static final List<String> defaultTemplateImports =
      Collections.unmodifiableList(
          Arrays.asList(
              "models._",
              "controllers._",
              "play.api.i18n._",
              "views.%format%._",
              "play.api.templates.PlayMagic._"));

  static {
    List<String> minimalJavaImports = new ArrayList<>(defaultTemplateImports);
    minimalJavaImports.add("java.lang._");
    minimalJavaImports.add("java.util._");
    minimalJavaImports.add("play.core.j.PlayMagicForJava._");
    minimalJavaImports.add("play.mvc._");
    minimalJavaImports.add("play.api.data.Field");
    minimalJavaTemplateImports = Collections.unmodifiableList(minimalJavaImports);

    List<String> defaultJavaImports = new ArrayList<>(minimalJavaTemplateImports);
    defaultJavaImports.add("play.data._");
    defaultJavaImports.add("play.core.j.PlayFormsMagicForJava._");
    defaultJavaTemplateImports = Collections.unmodifiableList(defaultJavaImports);

    List<String> scalaImports = new ArrayList<>(defaultTemplateImports);
    scalaImports.add("play.api.mvc._");
    scalaImports.add("play.api.data._");
    defaultScalaTemplateImports = Collections.unmodifiableList(scalaImports);
  }
}
