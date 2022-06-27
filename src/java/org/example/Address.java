// Generated with g9 DBimport.

package org.example;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {

    /** Primary key. */
    protected static final String PK = "addressNo";

    @Id
    @Column(unique=true, nullable=false)
    private long addressNo;
    @Column(length=50)
    private String homeAddress;
    @Column(length=10)
    private String postalCode;
    private LocalDateTime created;

    /** Default constructor. */
    public Address() {
        super();
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
     * Access method for homeAddress.
     *
     * @return the current value of homeAddress
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Setter method for homeAddress.
     *
     * @param aHomeAddress the new value for homeAddress
     */
    public void setHomeAddress(String aHomeAddress) {
        homeAddress = aHomeAddress;
    }

    /**
     * Access method for postalCode.
     *
     * @return the current value of postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter method for postalCode.
     *
     * @param aPostalCode the new value for postalCode
     */
    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
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
     * Compares the key for this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Address and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address that = (Address) other;
        if (this.getAddressNo() != that.getAddressNo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Address)) return false;
        return this.equalKeys(other) && ((Address)other).equalKeys(this);
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
        i = (int)(getAddressNo() ^ (getAddressNo()>>>32));
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
        StringBuffer sb = new StringBuffer("[Address |");
        sb.append(" addressNo=").append(getAddressNo());
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
        ret.put("addressNo", Long.valueOf(getAddressNo()));
        return ret;
    }

}
