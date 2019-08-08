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

package code;

/**
 * @author neo
 * @create 08/08/2019
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import manip_json.ManipJson;

public class Main {

  /**
   * Método Main responsável por persistir dados em um arquivo .json.
   * Ao receber a inserção de dados por meio de uma Lista, o arquivo .json é
   * indentado pela biblioteca GSON e, em seguida, persistida pelo FileWrite.
   * Desta forma, pode-se adicionar dados, sempre ao final do arquivo, quando
   * bem entender.
   *
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    ManipJson mp = new ManipJson();
    List<Integer> lista = new ArrayList<Integer>();

    lista.add(1);
    lista.add(6);
    lista.add(3);
    lista.add(9);
    lista.add(13);
    lista.add(23);

    System.out.println(mp.grava(lista));

    System.out.println(mp);
  }
}