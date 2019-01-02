package com.ramo.data.core;

import java.io.Serializable;
import java.util.List;

public interface CoreData extends Serializable {

    String getProperty1();
    String getProperty2();
    String getProperty3();
    String getProperty4();
    List<SubCoreData> getSubProperties();
}
