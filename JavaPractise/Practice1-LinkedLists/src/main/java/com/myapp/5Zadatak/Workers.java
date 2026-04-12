package com.myapp;

public class Workers {

  Node head;

  public void addWorker(Worker worker) {
    Node newNode = new Node(worker);
    newNode.next = head;
    if (head != null)
      head.prev = newNode;
    head = newNode;
  }

  public void listWorkers() {
    Node current = head;
    while (current != null) {
      System.out.println(current.val.getName() + ", ");
      current = current.next;
    }
  }

  public void removeWorker(String id) {
    if (head == null)
      return;

    while (head != null && head.val.getId().equals(id)) {
      head = head.next;
      if (head != null)
        head.prev = null;
    }

    Node current = head;
    while (current != null) {
      if (current.val.getId().equals(id)) {
        Node prev = current.prev;
        Node next = current.next;
        if (prev != null)
          prev.next = next;
        if (next != null)
          next.prev = prev;
        current = next;
      } else
        current = current.next;
    }
  }

  private boolean inWork(Worker worker, Date d) {
    Job[] list = worker.getJobs();
    for (Job job : list) {
      if (job.getStart().compareTo(d) <= 0 && job.getEnd().compareTo(d) >= 0)
        return true;
    }
    return false;
  }

  public void didWork(Date d) {
    Node current = head;
    if (head == null)
      return;

    while (current != null) {
      if (inWork(current.val, d)) {
        System.out.println("Ime: " + current.val.getName() + "i maticni: " + current.val.getId());
      }
      current = current.next;
    }
  }

}
