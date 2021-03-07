package net.parttimepolymath.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class ObjectMapperFactoryTest {

    @Test
    void getObjectMapper() {
        ObjectMapper instanceOne = ObjectMapperFactory.getObjectMapper();
        ObjectMapper instanceTwo = ObjectMapperFactory.getObjectMapper();
        assertNotNull(instanceOne);
        assertNotNull(instanceTwo);
        assertSame(instanceOne, instanceTwo);
    }
}