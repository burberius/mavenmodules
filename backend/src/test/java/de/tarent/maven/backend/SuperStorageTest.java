package de.tarent.maven.backend;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SuperStorageTest {
    private final SuperStorage classToTest = new SuperStorage("src/test/resources");

    @Test
    public void getLine() {
        assertThat(classToTest.getSize(), is(equalTo(9)));
        assertThat(classToTest.getLine(), is(equalTo("I'm not a mistake!")));
    }
}
