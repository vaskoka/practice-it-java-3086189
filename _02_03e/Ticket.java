package _02_03e;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }

  public String getDestination() {
    return destination;
  }

  public double getPrice() {
    return price;
  }

  public boolean isReturn() {
    return isReturn;
  }

}
