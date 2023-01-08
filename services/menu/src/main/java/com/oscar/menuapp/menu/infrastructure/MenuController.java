package com.oscar.menuapp.menu.infrastructure;

import com.oscar.menuapp.common.infrastructure.HttpCreatedResponseBuilder;
import com.oscar.menuapp.common.infrastructure.HttpOkResponseBuilder;
import com.oscar.menuapp.menu.application.GetMenuRequest;
import com.oscar.menuapp.menu.application.GetMenuService;
import com.oscar.menuapp.menu.application.viewmodel.MenuViewModel;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/menu")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MenuController {
    private GetMenuService getMenuService;

    @GetMapping("/{id}")
    public ResponseEntity<MenuViewModel> getMenu(
            @PathVariable @NotNull Long id
    ){
        var serviceRequest = new GetMenuRequest(id);
        var menuViewModel = getMenuService.execute(serviceRequest);
        return new HttpOkResponseBuilder<>(menuViewModel).buildResponse();
    }

    @PostMapping
    public ResponseEntity<?> createMenu(){
        return new HttpCreatedResponseBuilder<>(null)
                .buildResponse();
    }

    @PatchMapping
    public ResponseEntity<?> editMenu(){
        return new HttpOkResponseBuilder<>(null)
                .buildResponse();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMenu(@PathVariable @NotNull Long id){
        return new HttpOkResponseBuilder<>(null)
                .buildResponse();
    }
}
