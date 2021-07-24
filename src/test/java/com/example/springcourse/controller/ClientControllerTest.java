package com.example.springcourse.controller;

import com.example.springcourse.models.Client;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Date;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Get list of Clients")
    void getClientsTest() throws Exception {
        mockMvc.perform(get("/getClients"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("Get client by id")
    void searchById() throws Exception {

        mockMvc.perform(get("/findById/{id}", 1))
                .andExpect(status().isOk());
    }


    @Test
    void createClients() throws Exception {
        Client client = new Client();
        client.setName("Paul");
        client.setEmail("paul@tcs.com");
        client.setLastName("velmar");
        client.setNumber("3124567890");
        client.setBirthDate(new Date(1993-7-12));
        String clientAsString = convertToString(client);

        mockMvc.perform(post("/createClient")
                .content(clientAsString)
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("velmar"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(status().isCreated());
    }

    public static String convertToString(final Object object){
        try {

            return new ObjectMapper().writeValueAsString(object);
        }
        catch (Exception e){
            throw  new RuntimeException(e);
        }

    }
}

