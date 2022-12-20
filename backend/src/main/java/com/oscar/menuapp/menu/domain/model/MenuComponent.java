package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.common.exception.InvalidOperationException;

import java.util.List;

public abstract class MenuComponent {
    public Currency getCurrency(){
        throw new InvalidOperationException();
    }
    public List<Title> getNames(){
        throw new InvalidOperationException();
    }
    public List<MenuComponent> getMenuComponents(){
        throw new InvalidOperationException();
    }
    public boolean isMenu(){
        throw new InvalidOperationException();
    }

    public ItemPrice getPrice(){
        throw new InvalidOperationException();
    }
    public Discount getDiscount(){
        throw new InvalidOperationException();
    }
}
