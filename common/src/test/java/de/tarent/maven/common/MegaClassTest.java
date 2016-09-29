package de.tarent.maven.common;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MegaClassTest {
    private final MegaClass classToTest = new MegaClass();

    @Test
    public void doTheMagic() {
        final String input = "Servus Herr Apfel und Frau Otto";

        final String output = classToTest.doTheMagic(input);

        assertThat(output, is(equalTo("Servüß Herr Äpfel ünd Fräü Öttö")));
    }
}
