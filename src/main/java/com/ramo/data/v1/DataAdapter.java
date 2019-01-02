package com.ramo.data.v1;

import com.ramo.data.core.CoreData;
import com.ramo.data.core.SubCoreData;

import java.util.List;
import java.util.stream.Collectors;

public class DataAdapter implements Data {

    private final CoreData coreData;

    public DataAdapter(CoreData coreData) {
        this.coreData = coreData;
    }

    public String getProperty1() {
        return this.coreData.getProperty1();
    }

    public String getProperty3() {
        return this.coreData.getProperty3();
    }

    public List<SubData> getSubProperties() {
        return this.coreData.getSubProperties().stream()
                .map(x -> new SubDataAdapter(x))
                .collect(Collectors.toList());
    }

    static class SubDataAdapter implements SubData {

        private final SubCoreData subData;

        public SubDataAdapter(SubCoreData subData) {
            this.subData = subData;
        }

        public String getProperty1() {
            return this.subData.getProperty1();
        }

        public String getProperty3() {
            return this.subData.getProperty3();
        }
    }
}
