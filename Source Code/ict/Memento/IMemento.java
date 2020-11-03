package ict.Memento;

public interface IMemento<T> {

    public void setStatus(T object);
    public T getStatus();
}
