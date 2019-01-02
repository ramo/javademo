package com.ramo.test.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramo.data.core.CoreData;
import com.ramo.data.core.CoreDataImpl;
import com.ramo.data.v1.Data;
import com.ramo.data.v1.DataAdapter;
import com.ramo.data.v2.Data2;
import com.ramo.data.v2.DataAdapter2;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class DataTest {

    @Test
    public void testData() {
        try (InputStream is = ClassLoader.getSystemResourceAsStream("data.json")) {
            ObjectMapper om = new ObjectMapper();
            CoreData coreData = om.readValue(is, CoreDataImpl.class);

            // v1
            Data data = new DataAdapter(coreData);
            String json1 = om.writerWithDefaultPrettyPrinter().writeValueAsString(data);

            // v2
            Data2 data2 = new DataAdapter2(coreData);
            String json2 = om.writerWithDefaultPrettyPrinter().writeValueAsString(data2);

            System.out.println("========================================================");
            System.out.println(json1);
            System.out.println("========================================================");
            System.out.println(json2);
            System.out.println("========================================================");

            assertNotEquals(json1, json2);
            assertFalse(json1.contains("property2"));
            assertFalse(json2.contains("property1"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
