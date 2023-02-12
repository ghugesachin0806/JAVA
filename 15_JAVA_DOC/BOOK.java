

/**
 * @author Sachin Ghuge]
 * @version 2.0
 * @since 1990
 * 
 *  Class Book is used in library
 */

public class BOOK {

    /**
     * @value 10 default value
     */
    static int val = 90;

    /**
     * @value 10 default value
     */
    int temp =100;

    /**
     * Parameterized constructor
     * @param str Book name
     */
    public BOOK(String str) {

    }

    /**
     * Issue a book to a student
     * @param roll roll no. of a student
     * @throws Exception if book is not available throws a exception
     */
    public void issue(int roll) throws Exception {

    }

    /**
     * Check if book is available
     * @param str Book name
     * @return returning boolean
     */

    public boolean available(String str) {

        return true;
    }

    /**
     * Book id method
     * @param id passing book id
     * @return returning book name
     */
    public String getName(int id) {

        return "";
    }
}

