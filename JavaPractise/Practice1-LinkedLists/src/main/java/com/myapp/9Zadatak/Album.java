package com.myapp;

import java.util.LinkedList;

public class Album {

  //Ne moze da se uradi koje slicice fale jer fale informacije u zadatku
  LinkedList<Sticker> album;
  LinkedList<Sticker> dupes;

  public void showAlbum() {
    for (Sticker s : album) {
      System.out.println(s.toString());
    }
  }

  public void showDupes() {
    for (Sticker s : dupes) {
      System.out.println(s.toString());
    }
  }

  public void addStickers(Sticker[] box) {
    for (Sticker s : box) {

      if (album.contains(s)) {
        dupes.add(s);
        continue;
      }

      int i = 0;
      while (i < album.size()) {
        Sticker current = album.get(i);
        int cmp = current.rep.compareTo(s.rep);
        if (cmp > 0)
          break;
        if (cmp == 0 && current.num > s.num)
          break;
        i++;
      }
      album.add(i, s);
    }
  }

  public void exchangeStickers(Album a) {

    LinkedList<Sticker> toRemove = new LinkedList<>();

    for (Sticker s : dupes) {

      boolean otherHas = false;

      for (Sticker t : a.album) {
        if (t.rep.equals(s.rep) && t.num == s.num) {
          otherHas = true;
          break;
        }
      }

      if (!otherHas) {
        a.album.add(s);
        toRemove.add(s);
      }
    }

    dupes.removeAll(toRemove);

    a.exchangeStickersOneWay(this);
  }

  private void exchangeStickersOneWay(Album a) {

    LinkedList<Sticker> toRemove = new LinkedList<>();

    for (Sticker s : dupes) {

      boolean otherHas = false;

      for (Sticker t : a.album) {
        if (t.rep.equals(s.rep) && t.num == s.num) {
          otherHas = true;
          break;
        }
      }

      if (!otherHas) {
        a.album.add(s);
        toRemove.add(s);
      }
    }

    dupes.removeAll(toRemove);
  }

}
