/*
 * PKL 51 - Subseksi Data Entry
 */

package pkl51.error;

/**
 *
 * @author RN Hindarwan
 */
public class EntityException extends Exception {

    /**
     * Creates a new instance of <code>EntityException</code> without detail message.
     */
    public EntityException() {
    }


    /**
     * Constructs an instance of <code>EntityException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public EntityException(String msg) {
        super(msg);
    }
}
