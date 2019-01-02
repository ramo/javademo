package com.ramo.data.core;

import java.util.Collections;
import java.util.List;

public class CoreDataImpl implements CoreData {

    private String property1;
    private String property2;
    private String property3;
    private String property4;
    private List<SubCoreData> subProperties;

    @Override
    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    @Override
    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    @Override
    public String getProperty3() {
        return property3;
    }

    public void setProperty3(String property3) {
        this.property3 = property3;
    }

    @Override
    public String getProperty4() {
        return property4;
    }

    public void setProperty4(String property4) {
        this.property4 = property4;
    }

    @Override
    public List<SubCoreData> getSubProperties() {
        return subProperties;
    }

    public void setSubProperties(List<SubCoreDataImpl> subProperties) {
        this.subProperties = Collections.unmodifiableList(subProperties);
    }


    public static class SubCoreDataImpl implements SubCoreData {

        private String property1;
        private String property2;
        private String property3;
        private String property4;

        @Override
        public String getProperty1() {
            return property1;
        }

        public void setProperty1(String property1) {
            this.property1 = property1;
        }

        @Override
        public String getProperty2() {
            return property2;
        }

        public void setProperty2(String property2) {
            this.property2 = property2;
        }

        @Override
        public String getProperty3() {
            return property3;
        }

        public void setProperty3(String property3) {
            this.property3 = property3;
        }

        @Override
        public String getProperty4() {
            return property4;
        }

        public void setProperty4(String property4) {
            this.property4 = property4;
        }
    }
 }
