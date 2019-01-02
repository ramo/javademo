package com.ramo.data.v2;

import com.ramo.data.core.CoreData;
import com.ramo.data.core.SubCoreData;

import java.util.List;
import java.util.stream.Collectors;

public class DataAdapter2 implements Data2 {

    private final CoreData coreData;

    public DataAdapter2(CoreData coreData) {
        this.coreData = coreData;
    }

    public String getProperty2() {
        return this.coreData.getProperty2();
    }

    public String getProperty4() {
        return this.coreData.getProperty4();
    }

    public List<SubData2> getSubProperties() {
        return this.coreData.getSubProperties().stream()
                .map(x -> new SubDataAdapter(x))
                .collect(Collectors.toList());
    }

    static class SubDataAdapter implements SubData2 {

        private final SubCoreData subData;

        public SubDataAdapter(SubCoreData subData) {
            this.subData = subData;
        }

        public String getProperty2() {
            return this.subData.getProperty2();
        }

        public String getProperty4() {
            return this.subData.getProperty4();
        }
    }
}
