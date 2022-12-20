package com.oscar.menuapp.menu.infrastructure;

import com.oscar.menuapp.common.infrastructure.HttpOkResponseBuilder;
import com.oscar.menuapp.menu.application.GetMenuRequest;
import com.oscar.menuapp.menu.application.GetMenuService;
import com.oscar.menuapp.menu.application.viewmodel.MenuViewModel;
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
    public ResponseEntity<MenuViewModel> getMenu(
            @PathVariable @NotNull long id
    ){
        var serviceRequest = new GetMenuRequest(id);
        var menuViewModel = getMenuService.execute(serviceRequest);
        return new HttpOkResponseBuilder<>(menuViewModel).buildResponse();
    }
}
