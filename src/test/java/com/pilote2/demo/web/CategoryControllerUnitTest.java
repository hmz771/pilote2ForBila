//package com.pilote2.demo.web;
////import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.securityContext;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
//
//import com.pilote2.demo.dtos.CategoryDto;
//import com.pilote2.demo.entities.Identity.User;
//import com.pilote2.demo.services.CategoryService;
//import net.minidev.json.JSONObject;
//import org.apache.catalina.security.SecurityConfig;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
////import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
//import org.springframework.security.web.FilterChainProxy;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.*;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
////@RunWith(SpringRunner.class)
////@WebMvcTest(CategoryController.class)
////@AutoConfigureMockMvc
//
//@WebMvcTest(CategoryController.class)
//class CategoryControllerUnitTest {
//
//    @Autowired
//    private static MockMvc mockMvc;
//
////    @BeforeEach
////    public void setup() {
////        mockMvc = MockMvcBuilders
////                .webAppContextSetup(context)
////                .apply(springSecurity())
////                .addFilter(springSecurityFilterChain)
////                .build();
////    }
////    @Autowired
////    private WebApplicationContext context;
////    @Mock
////    private FilterChainProxy springSecurityFilterChain;
//
//
//    @Test
//    @WithMockUser
//    public void getAllCategoriesAPI() throws Exception {
//        mockMvc.perform(get("/categories"))
//                .andExpect(status().isOk());
//
//    }
//    @MockBean
//    private CategoryService categoryService;
//    @Autowired
//    private ObjectMapper objectMapper;
//    @Test
////    @WithMockUser
//    public void createCategoryAPI() throws Exception {
//        CategoryDto categoryDto = new CategoryDto();
//        categoryDto.setCategoryid((long) 0);
//        categoryDto.setName("Ginger");
//        categoryDto.setDescription("Ginger");
//       // String inputJson =super.mapToJson(categoryDto);
//        String inputJsonr=objectMapper.writeValueAsString(categoryDto);
////        mockMvc.perform(post("/categoriesz").contentType(MediaType.APPLICATION_JSON)
////                .content(inputJson))
////                .andExpect(status().isCreated())
////                .andDo(print());
////        mockMvc.perform(post("/categoriesz").contentType(MediaType.APPLICATION_JSON)
////                .content(inputJson))
////                .andExpect(status().isCreated())
////                .andDo(print());
//
////        CategoryDto categoryDto = new CategoryDto();
////        given(categoryService.save(
////                Mockito.any(CategoryDto.class))).willReturn(categoryDto);
//
////        String uri = "/categories";
////        CategoryDto categoryDto = new CategoryDto();
////        categoryDto.setCategoryid((long) 0);
////        categoryDto.setName("Ginger");
////        categoryDto.setDescription("Ginger");
////        String inputJson =super.mapToJson(categoryDto);
////        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.put(uri)
////                .contentType(MediaType.APPLICATION_JSON_VALUE)
////                .content(inputJson))
////               // .andDo(print())
////                .andExpect(status().isOk());
////        int status = mvcResult.getResponse().getStatus();
////        assertEquals(201, status);
////        String content = mvcResult.getResponse().getContentAsString();
////        assertEquals(content, "categories is created successfully");
//
//
//
////        mockMvc.perform(post("/categories")
////                .contentType(MediaType.APPLICATION_JSON)
////                .content("{ Name: SAVINGS, Description: yyy }")
////                .accept(MediaType.APPLICATION_JSON))
////                .andExpect(status().isCreated())
////                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
////                .andExpect(header().string("Location", "/api/account/12345"))
////                .andExpect(jsonPath("$.accountId").value("12345"))
////                .andExpect(jsonPath("$.Name").value("SAVINGS"))
////                .andExpect(jsonPath("$.Description").value(5000));
////        CategoryDto categoryDto = new CategoryDto();
////        categoryDto.setCategoryid((long) 0);
////        categoryDto.setName("Ginger");
////        categoryDto.setDescription("Ginger");
////        String inputJson =super.mapToJson(categoryDto);
////        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
////                .post("/categoriesz").accept(MediaType.APPLICATION_JSON).content(inputJson);
////
////        ResultActions result = mockMvc.perform(request);
////
////
////        result.andExpect(MockMvcResultMatchers.status().isCreated());
//
//
//
//
//    }
//    @Test
//    public void updateProduct() throws Exception {
////        String uri = "/categories/1";
////        CategoryDto categoryDto = new CategoryDto();
////        categoryDto.setName("Ginger");
////        categoryDto.setDescription("Ginger");
////        String inputJson = super.mapToJson(categoryDto);
////        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
////                .contentType(MediaType.APPLICATION_JSON_VALUE)
////                .content(inputJson)).andReturn();
////
////        int status = mvcResult.getResponse().getStatus();
////        assertEquals(200, status);
////        String content = mvcResult.getResponse().getContentAsString();
////        assertEquals(content, "categories is updated successsfully");
//    }
//    @Test
//    public void deleteProduct() throws Exception {
////        String uri = "/categories/2";
////        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
////        int status = mvcResult.getResponse().getStatus();
////        assertEquals(200, status);
////        String content = mvcResult.getResponse().getContentAsString();
////        assertEquals(content, "categories is deleted successsfully");
//    }
//
//
//}