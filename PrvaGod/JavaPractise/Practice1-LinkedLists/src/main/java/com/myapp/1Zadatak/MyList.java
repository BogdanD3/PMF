package com.myapp;

public class MyList {

  Node1 head;

  public void printList() {
    Node1 current = this.head;
    while (current != null) {
      System.out.print(current.val + ", ");
      current = current.next;
    }
  }

  public void addOne() {
    Node1 current = this.head;
    if (this.head == null)
      return;
    while (current.next != null) {
      Node1 newNode = new Node1(current.val - current.next.val);
      newNode.next = current.next;
      newNode.prev = current;
      current.next = newNode;
      current = newNode.next;
    }
  }

  public void addTwo(int k) {
    Node1 current = this.head;
    if (this.head == null)
      return;
    while (current != null) {
      if (current.val % k == 0) {
        Node1 newNode = new Node1(-1);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current = newNode.next;
      } else
        current = current.next;
    }
  }

  public void addThree(int a, int b) {
    Node1 current = this.head;
    if (this.head == null)
      return;
    while (current != null) {
      if (current.val > a && current.val < b) {
        Node1 newNode = new Node1(0);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current = newNode.next;
      } else
        current = current.next;
    }
  }

  public void addFour(int k, int v) {
    Node1 current = this.head;
    int l = 1;
    if (this.head == null)
      return;
    while (current != null) {
      if (l == k) {
        Node1 newNode = new Node1(v);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current = newNode.next;
        l = 1;
      } else {
        current = current.next;
        l++;
      }
    }
  }

  public void remove(int d, int k) {
    Node1 current = this.head;
    if (this.head == null)
      return;
    while (current != null) {
      if (Math.abs(current.val - d) < k) {
        Node1 nextNode = current.next;
        if (current.prev != null) {
          current.prev.next = current.next;
        } else {
          this.head = current.next;
        }
        if (current.next != null) {
          current.next.prev = current.prev;
        }
        current = nextNode;
      } else {
        current = current.next;
      }
    }
  }

  public void findMiddle() {
    Node1 slow = this.head;
    Node1 fast = this.head.next;
    int counter = 1;
    if (this.head == null) {
      System.out.println(0);
      return;
    } else if (this.head.next == null) {
      System.out.println(1);
      return;
    }
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      counter++;
    }
    System.out.println(counter + 1);
  }

  public void reorder(int k) {
    Node1 current = this.head;
    if (this.head == null || k == 1)
      return;
    int a = 1;
    while (current != null) {
      a = 1;
      Node1 start = current;
      while (a != k) {
        if (current == null)
          return;
        current = current.next;
        a++;
      }
      Node1 road = current.next;
      while (a != 1 && a != 0) {
        int tmp = start.val;
        start.val = current.val;
        current.val = tmp;
        start = start.next;
        current = current.prev;
        a -= 2;
      }
      current = road;
    }
  }

  public void reorder2(int x) {
    Node1 current = this.head;
    Node1 start = current;
    if (this.head == null)
      return;

    while (current != null) {
      while (start.val < x) {
        start = start.next;
        if (start == null)
          return;
      }
      current = start;
      while (current.val >= x) {
        current = current.next;
        if (current == null)
          return;
      }
      int tmp = start.val;
      start.val = current.val;
      current.val = tmp;
    }
  }

  public void sortList(boolean reverse) {
    if (head == null || head.next == null)
      return;

    Node1 current = head.next;
    while (current != null) {
      Node1 nextNode = current.next;
      Node1 prevNode = current.prev;

      while (prevNode != null && (!reverse && current.val < prevNode.val) || (reverse && current.val > prevNode.val)) {
        Node1 beforePrev = prevNode.prev;
        Node1 afterCurrent = current.next;

        current.prev = beforePrev;
        current.next = prevNode;
        prevNode.prev = current;
        prevNode.next = afterCurrent;

        if (beforePrev != null) {
          beforePrev.next = current;
        } else {
          head = current;
        }
        if (afterCurrent != null) {
          afterCurrent.prev = prevNode;
        }
        prevNode = current.prev;
      }
      current = nextNode;
    }
  }

  public void joinLists(MyList t) {
    if (t.head == null)
      return;
    if (this.head == null) {
      this.head = t.head;
      return;
    }

    this.sortList(false);
    t.sortList(false);

    Node1 p1 = this.head;
    Node1 p2 = t.head;
    Node1 newHead = null;
    Node1 last = null;

    if (p1.val < p2.val) {
      newHead = p1;
      p1 = p1.next;
    } else {
      newHead = p2;
      p2 = p2.next;
    }
    newHead.prev = null;
    last = newHead;

    while (p1 != null && p2 != null) {
      if (p1.val < p2.val) {
        last.next = p1;
        p1.prev = last;
        last = p1;
        p1 = p1.next;
      } else {
        last.next = p2;
        p2.prev = last;
        last = p2;
        p2 = p2.next;
      }
    }

    if (p1 != null) {
      last.next = p1;
      p1.prev = last;
    }
    if (p2 != null) {
      last.next = p2;
      p2.prev = last;
    }

    this.head = newHead;
  }
}
