package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.common.exception.InvalidOperationException;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

@EqualsAndHashCode
public abstract class MenuComponent {
    public TextBlock getTitle(){
        throw new InvalidOperationException();
    }

    public TextBlock getSubTitle(){
        throw new InvalidOperationException();
    }

    public Price getPrice(){
        throw new InvalidOperationException();
    }

    public AvailableTime getAvailableTime(){
        throw new InvalidOperationException();
    }

    public TextBlock getSpecialNote(){
        throw new InvalidOperationException();
    }

    public Locale getLocale(){
        throw new InvalidOperationException();
    }

    public List<MenuComponent> getMenuComponents(){
        throw new InvalidOperationException();
    }
    public boolean isMenu(){
        throw new InvalidOperationException();
    }

    public boolean isNotMenu(){
        return !isMenu();
    }
}
