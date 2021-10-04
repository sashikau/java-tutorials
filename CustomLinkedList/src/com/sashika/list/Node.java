package com.sashika.list;

/**
 * @author Sashika.Udana
 * @since 10/3/2021
 */
public class Node
{
  private int value;
  private Node next;

  public Node(int value)
  {
    this.value = value;
  }

  public int getValue()
  {
    return value;
  }

  public void setValue(int value)
  {
    this.value = value;
  }

  Node getNext()
  {
    return next;
  }

  void setNext(Node next)
  {
    this.next = next;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Node node = (Node) o;

    return value == node.value;
  }

  @Override
  public int hashCode()
  {
    int result = value;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    return result;
  }
}
