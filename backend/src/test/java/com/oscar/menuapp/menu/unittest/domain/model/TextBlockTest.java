package com.oscar.menuapp.menu.unittest.domain.model;

import com.oscar.menuapp.menu.domain.model.TextBlock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TextBlockTest {
    @Test
    public void testGivenUserHasTextBlockDataWhenUserCreatesThenTextBlockIsCreate(){
        var text = "Baked Cheese and Fish Fillet Rice";
        var textBlock = new TextBlock(text);
        assertEquals(text, textBlock.getContent(), "Text not match.");
    }
}
