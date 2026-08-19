package com.digicart.storefront.cucumber;

import com.digicart.storefront.entity.Store;
import com.digicart.storefront.service.StoreService;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.when;

public class StoreStepDefinitions {
    @Autowired
    StoreService storeService;

    @Before
    public void stubs() {
        when(storeService.findAll()).thenReturn(List.of(new Store()));
    }
}
