package com.oscar.menuapp.features.models.menu;

import com.oscar.menuapp.features.exceptions.InvalidOperationException;

import java.util.List;

public abstract class MenuComponent {
    public Currency getCurrency(){
        throw new InvalidOperationException();
    }
    public List<MenuComponentName> getNames(){
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
