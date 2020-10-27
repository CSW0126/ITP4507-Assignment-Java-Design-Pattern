package ict.Memento;

public interface Memento<T> {
   public T getStatus();
   public void setStatus(T object);
}
