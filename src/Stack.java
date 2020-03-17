
public interface Stack<T> {
    public void push(T t) throws PilaVaciaException, PilaLlenaException;
    public T pop() throws PilaVaciaException;
    public int size();
}