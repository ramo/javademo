package com.ramo.data.v2;


import java.io.Serializable;
import java.util.List;

public interface Data2 extends Serializable {

    String getProperty2();
    String getProperty4();
    List<SubData2> getSubProperties();
}
