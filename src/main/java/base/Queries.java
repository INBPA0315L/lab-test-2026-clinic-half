package base;

import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * Defines queries for your {@link Repository} implementation.
 *
 * @param <T> the type of your top-level class
 * @param <U> the type of your static nested class
 * @param <V> the type of your enumerated class
 */
public interface Queries<T, U, V extends Enum<V>> {

    /**
     * Returns the number of doctors whose name starts with the given prefix (case-sensitive).
     *
     * @param prefix the prefix
     * @return the result
     */
    int query1(
            @NonNull String prefix);

    /**
     * Returns the sorted copy of the doctors using the {@link Comparable} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the on-call status of the <i>doctor</i> (ascending)
     *     <li> the room number of the <i>doctor</i> (descending)
     *     <li> the name of the <i>doctor</i> (ascending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>This task includes the implementation of the {@link Comparable} interface in your model class due to its nature.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query2();

    /**
     * Returns the sorted copy of the doctors using the {@link java.util.Comparator} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the room number of the <i>doctor</i> (descending)
     *     <li> the years of experience of the <i>doctor</i> (descending)
     *     <li> the name of the <i>doctor</i> (descending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>The {@link java.util.Comparator} interface must be implemented as a static nested class of your repository class.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query3();

    /**
     * Returns the first doctor that has the given department.
     * Returns <code>null</code> if no <i>doctor</i> matches the condition.
     *
     * @param department the department
     * @return the result
     */
    T query4(
            @NonNull V department);

    /**
     * Returns all the doctors that have the given department but do not have any patient with the given name.
     *
     * @param department the department
     * @param name the name of the patient
     * @return the result
     */
    List<T> query5(
            @NonNull V department,
            @NonNull String name);

    /**
     * Returns a dictionary that maps each doctor to the corresponding department.
     *
     * @return the result
     */
    Map<T, V> query6();
}
