package com.oliverlockwood.bikehelp.domain;

import org.junit.Test;

import java.net.URI;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Unit tests for the {@link Shop} class
 */
public class ShopTest {

    public static final String NAME = "Joe's bikes";
    public static final String ADDRESS = "12 The Street\nLondon W1 5JJ";
    public static final URI WEBSITE = URI.create("http://www.joesbikes.com");
    public static final String PHONE = "0990 60 90 60";

    @Test
    public void testGetters() {
        Shop shop = new Shop.Builder().name(NAME)
                                      .address(ADDRESS)
                                      .website(WEBSITE)
                                      .phone(PHONE)
                                      .build();
        assertThat(shop.getName(), is(NAME));
        assertThat(shop.getAddress(), is(ADDRESS));
        assertThat(shop.getWebsite(), is(WEBSITE));
        assertThat(shop.getPhone(), is(PHONE));
    }
}
