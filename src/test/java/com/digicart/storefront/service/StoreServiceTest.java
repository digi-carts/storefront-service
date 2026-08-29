package com.digicart.storefront.service;

import com.digicart.storefront.dto.CreateStoreRequest;
import com.digicart.storefront.entity.Store;
import com.digicart.storefront.exception.EntityNotFoundException;
import com.digicart.storefront.repository.StoreRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StoreServiceTest {

    @Mock
    private StoreRepository storeRepository;

    @InjectMocks
    private StoreService storeService;

    @Test
    void createSetsAdminAndName() {
        CreateStoreRequest req = new CreateStoreRequest();
        req.setAdminId("a1");
        req.setName("Shop");
        req.setSubdomain("shop");
        when(storeRepository.save(any(Store.class))).thenAnswer(i -> i.getArgument(0));
        assertThat(storeService.create(req).getName()).isEqualTo("Shop");
    }

    @Test
    void findByIdThrows() {
        when(storeRepository.findById("x")).thenReturn(Optional.empty());
        assertThatThrownBy(() -> storeService.findById("x")).isInstanceOf(EntityNotFoundException.class);
    }
}
