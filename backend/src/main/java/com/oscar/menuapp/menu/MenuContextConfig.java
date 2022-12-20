package com.oscar.menuapp.menu;

import com.oscar.menuapp.menu.application.*;
import com.oscar.menuapp.menu.infrastructure.repository.MenuJdbcPostgresRepo;
import com.oscar.menuapp.menu.infrastructure.repository.MenuNoOperationRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuContextConfig {
    @Bean
    public MenuRepo menuRepo(MenuJdbcPostgresRepo menuRepo){
        return menuRepo;
    }

    @Bean
    public GetMenuPresenter getMenuPresenter(){
        return new GetMenuPresenter();
    }

    @Bean
    public GetMenuService getMenuService(MenuRepo menuRepo, GetMenuPresenter getMenuPresenter){
        return new GetMenuService(menuRepo, getMenuPresenter);
    }

    @Bean
    public CreateMenuService createMenuService(MenuRepo menuRepo){
        return new CreateMenuService(menuRepo);
    }
}
