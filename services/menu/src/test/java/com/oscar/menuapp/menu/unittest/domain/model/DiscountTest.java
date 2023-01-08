package com.oscar.menuapp.menu.unittest.domain.model;

import com.oscar.menuapp.menu.domain.exception.DiscountValueOutOfRangeException;
import com.oscar.menuapp.menu.domain.model.Discount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class DiscountTest {

    @Test void testGivenUserHasDiscountDataWhenUserCreateDiscountThenExceptionIsThrown(){
        assertDoesNotThrow(()->{
            new Discount(0.5f);
        }, "Discount out of range exception is not thrown.");
    }

    @Test
    public void testGivenUserHasNegativeDiscountDataWhenUserCreateDiscountThenExceptionIsThrown(){
        assertThrows(DiscountValueOutOfRangeException.class, ()->{
            new Discount(-0.2f);
        }, "Discount out of range exception is not thrown.");
    }

    @Test
    public void testGivenUserHasDiscountDataLargerThanOneWhenUserCreatesDiscountThenExceptionIsThrown(){
        assertThrows(DiscountValueOutOfRangeException.class, ()->{
            new Discount(1.2f);
        }, "Discount out of range exception is not thrown.");
    }
}
