package com.revature.mocklng;

import com.revature.mocking.Content;
import com.revature.mocking.Display;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DisplayIT {

    public Display display;
    public Content content;

    @BeforeEach
    public void setup() {
        content = new Content();
        display = new Display(content);
    }

    @Test
    public void displayContentPositive() {
        String message = display.displayContent();
        Assertions.assertEquals("This is the content", message);
    }


}
