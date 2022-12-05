package com.oscar.menuapp.features.features.menus;

import com.oscar.menuapp.features.viewmodels.MenuModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MenuController {
    private GetMenuService getMenuService;

    @GetMapping("/api/menu/{id}")
    public ResponseEntity<MenuModel> getMenu(
            @PathVariable @NotNull long id
    ){
        return getMenuService.getMenu(id).buildResponse();
    }
}
