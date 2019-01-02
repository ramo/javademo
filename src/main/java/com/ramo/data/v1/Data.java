package com.ramo.data.v1;

import java.io.Serializable;
import java.util.List;

public interface Data extends Serializable {

    String getProperty1();
    String getProperty3();
    List<SubData> getSubProperties();
}
