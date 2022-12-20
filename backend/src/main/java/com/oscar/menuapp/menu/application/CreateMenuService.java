package com.oscar.menuapp.menu.application;

import com.oscar.menuapp.menu.application.requestmodel.MenuRequestModelMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CreateMenuService {

    MenuRepo menuRepo;

    public void execute(CreateMenuRequest request){
        var menu = new MenuRequestModelMapper()
                .mapFrom(request.getMenu());
        menuRepo.save(menu);
    }
}
