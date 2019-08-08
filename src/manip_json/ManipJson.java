/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

package manip_json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author neo
 * @create 08/08/2019
 */
public class ManipJson {

  private GsonBuilder builder;
  private Gson gson;

  public String grava (List<Integer> lista) throws IOException {
    builder = new GsonBuilder();
    gson = builder.create();
    FileWriter writer = new FileWriter("json/pessoas.json");
    writer.write(gson.toJson(lista));
    writer.close();

    return gson.toJson(lista);
  }

  public String ler() throws FileNotFoundException {
    StringBuilder stringBuilder = new StringBuilder();
    GsonBuilder builder = new GsonBuilder();
    gson = builder.create();
    BufferedReader bufferedReader = new BufferedReader(new FileReader("json/pessoas.json"));

    Type listType = new TypeToken<ArrayList<Integer>>() {}.getType();

    List<Integer> lista = new Gson().fromJson(bufferedReader, listType);

    for (Iterator iterator = lista.iterator(); iterator.hasNext(); ) {
      stringBuilder.append((int) iterator.next());
      stringBuilder.append(" ");
    }
    return stringBuilder.toString();
  }
}
