package com.sz21c.mock.constructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedConstruction;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MainTest {

    @Test
    void test_getName() {
        // given
        MockedConstruction<Profile> profile = mockConstruction(Profile.class, (mock, context) -> {
            when(mock.getName()).thenReturn("Joe");
        });

        // when
        Main main = new Main();
        String result = main.getName();

        // then
        assertEquals("Joe is a good guy", result);
    }

    @Test
    void test_getBusinessName() {
        // given
        MockedConstruction<Profile> profile = mockConstruction(Profile.class, (mock, context) -> {
            when(mock.getName()).thenReturn("Joe");
        });

        MockedConstruction<BusinessCard> businessCard = mockConstruction(BusinessCard.class, (mock, context) -> {
            when(mock.getBusinessName()).thenReturn("Joe Anderton");
        });

        // when
        Main main = new Main();
        String result = main.getBusinessName();

        // then
        assertEquals("Joe Anderton", result);
    }

    @Test
    void test_getNameFromProfile() {
        // given
        MockedConstruction<BusinessCard> businessCard = mockConstruction(BusinessCard.class, (mock, context) -> {
            Profile mockedProfile = mock(Profile.class);
            when(mockedProfile.getName()).thenReturn("Joe");
            when(mock.getProfile()).thenReturn(mockedProfile);
        });

        // when
        Main main = new Main();
        String result = main.getNameFromProfile();

        // then
        assertEquals("Joe", result);
    }
}