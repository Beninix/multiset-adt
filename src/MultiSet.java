/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);
    /**
     * Remove the given item from this multiset.
     *
     * @param item the item to remove
     */
    abstract void remove(Integer item);
    /**
     * Check if the given item is in the multiset.
     *
     * @param item the item to check
     */
    abstract boolean contains(Integer item);
    /**
     * Check if the multiset is empty.
     */
    abstract boolean is_empty(Integer item);
    /**
     * Count how many times the given element is in the multiset.
     */
    abstract int count();
    /**
     * Count how many elements are in the multiset.
     */
    abstract int size();
}
