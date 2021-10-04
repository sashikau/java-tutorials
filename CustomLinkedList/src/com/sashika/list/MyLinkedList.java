package com.sashika.list;

/**
 * @author Sashika.Udana
 * @since 10/3/2021
 */
public class MyLinkedList
{
  private Node head;
  private int size;


  public void insert(int value)
  {
    Node newNode = new Node(value);
    if (head == null)
    {
      head = newNode;
    }
    else
    {
      Node last = head;

      while (last.getNext() != null)
      {
        last = last.getNext();
      }

      last.setNext(newNode);
    }
    size++;
  }

  public Node get(int index)
  {
    validateIndex(index);

    int currentIndex = 0;

    Node current = head;

    while (current != null)
    {
      if(currentIndex == index)
      {
        return current;
      }
      current = current.getNext();
      currentIndex++;
    }
    return null;
  }

  public int size()
  {
    return size;
  }

  public boolean contains(Node node)
  {
    Node current = head;

    while (current != null)
    {
      if(current.equals(node))
      {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  private void validateIndex(int givenIndex)
  {
    validateNegative(givenIndex);
    if (size <= givenIndex)
    {
      throw new IllegalArgumentException(
        "Index out of bound exception given index (" + givenIndex + ") must be less than list size (" + size+")");
    }
  }

  private void validateNegative(int index)
  {
    if(index<0)
    {
      throw new IllegalArgumentException("Index cannot be negative");
    }
  }

  public void printList()
  {
    Node current = head;

    while (current != null)
    {
      System.out.println(current.getValue());
      current = current.getNext();
    }
  }
}
