package com.oscar.menuapp.features.models.menu;

import java.util.List;

public interface MenuComponent {
    boolean isMenu();
    List<MenuComponent> getMenuComponents();
}
