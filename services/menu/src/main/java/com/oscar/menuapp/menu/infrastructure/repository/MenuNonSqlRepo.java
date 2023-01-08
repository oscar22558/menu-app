package com.oscar.menuapp.menu.infrastructure.repository;

import com.oscar.menuapp.menu.application.MenuRepo;
import com.oscar.menuapp.menu.domain.model.*;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MenuNonSqlRepo implements MenuRepo {
    MenuSpringDataMongoDBRepo menuMongoRepo;

    @Override
    public MenuComponent findMenuById(long id) {
        return null;
    }

    @Override
    public MenuComponent save(MenuComponent menu) {
        return null;
    }

    @Override
    public boolean isMenuExist(long id) {
        return menuMongoRepo.findById(id).isPresent();
    }

    @Override
    public void deleteById(long id) {
        menuMongoRepo.deleteById(id);
    }
}
