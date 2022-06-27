// Generated with g9 DBimport.

package org.example;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {

    /** Primary key. */
    protected static final String PK = "ID";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int ID;
    @Column(nullable=false)
    private long addressNo;
    @Column(length=50)
    private String email;
    @Column(length=50)
    private String name;
    private LocalDateTime created;
    private String FOREIGN;

    /** Default constructor. */
    public Customer() {
        super();
    }

    /**
     * Access method for ID.
     *
     * @return the current value of ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Setter method for ID.
     *
     * @param aID the new value for ID
     */
    public void setID(int aID) {
        ID = aID;
    }

    /**
     * Access method for addressNo.
     *
     * @return the current value of addressNo
     */
    public long getAddressNo() {
        return addressNo;
    }

    /**
     * Setter method for addressNo.
     *
     * @param aAddressNo the new value for addressNo
     */
    public void setAddressNo(long aAddressNo) {
        addressNo = aAddressNo;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for created.
     *
     * @return the current value of created
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Setter method for created.
     *
     * @param aCreated the new value for created
     */
    public void setCreated(LocalDateTime aCreated) {
        created = aCreated;
    }

    /**
     * Access method for FOREIGN.
     *
     * @return the current value of FOREIGN
     */
    public String getFOREIGN() {
        return FOREIGN;
    }

    /**
     * Setter method for FOREIGN.
     *
     * @param aFOREIGN the new value for FOREIGN
     */
    public void setFOREIGN(String aFOREIGN) {
        FOREIGN = aFOREIGN;
    }

    /**
     * Compares the key for this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Customer and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer that = (Customer) other;
        if (this.getID() != that.getID()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Customer)) return false;
        return this.equalKeys(other) && ((Customer)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getID();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Customer |");
        sb.append(" ID=").append(getID());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("ID", Integer.valueOf(getID()));
        return ret;
    }

}
