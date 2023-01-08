package com.oscar.menuapp.menu.application;

import com.oscar.menuapp.display.domain.model.DBModelId;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteMenuService {
    private MenuRepo menuRepo;

    public void execute(DeleteMenuRequest request){
        DBModelId menuId = request.getMenuId();
        if(menuId.isEmpty())
            throw new IllegalArgumentException();
        if(menuRepo.isMenuExist(menuId.getId()))
            menuRepo.deleteById(request.getMenuId().getId());
    }
}
