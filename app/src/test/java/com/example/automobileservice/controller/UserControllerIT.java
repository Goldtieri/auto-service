package com.example.automobileservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
class UserControllerIT extends BaseIT {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void initSingIn() throws Exception {
        mockMvc.perform(get("/users/signIn"))
                .andExpect(view().name("users/signIn"))
                .andExpect(status().isOk());
    }

}