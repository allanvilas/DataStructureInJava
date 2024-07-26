package datastructure.dataStructureInterface;

public interface ILinearStructure<T> {
    int size();
    void clear();
    boolean isEmpty();
    void add(T value);
    boolean insert(T value,int index);
    Object get(int index);
    boolean set(T value,int index);
    Object getFirst();
    Object getLast();
    Object remove(int index);
    Object removeFirst();
    Object removeLast();
}
