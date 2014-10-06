package com.oliverlockwood.bikehelp.domain;

import java.net.URL;

/**
 * Bike Shop domain object.
 */
public class Shop {

    /**
     * Name of the bike shop.
     */
    private final String name;

    /**
     * Address, including newlines where appropriate (if available).
     */
    private final String address;

    /**
     * Website address (if available).
     */
    private final URL website;

    /**
     * Phone number (if available).
     */
    private final String phone;

    /**
     * Create a {@code Shop} from a {@code Builder}
     *
     * @param builder {@link Builder} from which to create the object
     */
    private Shop(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.website = builder.website;
        this.phone = builder.phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public URL getWebsite() {
        return website;
    }

    public String getPhone() {
        return phone;
    }

    /**
     * Builder class for building {@link Shop} objects.
     */
    public static class Builder {

        /**
         * @see Shop#name
         */
        private String name;

        /**
         * @see Shop#address
         */
        private String address;

        /**
         * @see Shop#website
         */
        private URL website;

        /**
         * @see Shop#phone
         */
        private String phone;

        /**
         * Set the name of the bike shop
         *
         * @param name name of the bike shop
         * @return this {@code Builder} for chaining
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set the address of the bike shop
         *
         * @param address address of the bike shop
         * @return this {@code Builder} for chaining
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Set the website of the bike shop
         *
         * @param website website of the bike shop
         * @return this {@code Builder} for chaining
         */
        public Builder website(URL website) {
            this.website = website;
            return this;
        }

        /**
         * Set the phone number of the bike shop
         *
         * @param phone phone number of the bike shop
         * @return this {@code Builder} for chaining
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Create a new {@code Shop}
         *
         * @return a {@link Shop} created from the properties of this builder.
         */
        public Shop build() {
            validate();
            return new Shop(this);
        }

        /**
         * Validate the integrity of the {@link Shop.Builder}
         */
        private void validate() {
            // TODO add validation in here
        }
    }
}
