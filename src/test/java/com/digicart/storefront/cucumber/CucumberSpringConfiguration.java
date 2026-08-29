package com.digicart.storefront.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import com.digicart.storefront.exception.GlobalExceptionHandler;
import com.digicart.storefront.controller.HealthController;
import com.digicart.storefront.controller.StoreController;
import com.digicart.storefront.service.StoreService;

@CucumberContextConfiguration
@WebMvcTest(controllers = { HealthController.class, StoreController.class })
@AutoConfigureMockMvc(addFilters = false)
@Import(GlobalExceptionHandler.class)
public class CucumberSpringConfiguration {
    @MockBean
    StoreService storeService;

}
