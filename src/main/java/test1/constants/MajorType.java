package test1.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * created by ewang on 2017/12/10.
 */
public enum MajorType {
    SoftwareEngineering(1),
    CST(2), //Computer science and technology
    EIE(3) //Electrical and Information Engineering

    ;

    private final int value;

    private static Map<Integer, MajorType> valuesMap;

    static {
        valuesMap = new HashMap<Integer, MajorType>();
        for (MajorType t : values()) {
            MajorType exist = valuesMap.put(t.getValue(), t);
            if (exist != null) {
                throw new IllegalStateException("value冲突: " + exist + " " + t);
            }
        }
        valuesMap = Collections.unmodifiableMap(valuesMap);
    }

    MajorType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MajorType fromValue(Integer value) {
        return valuesMap.get(value);
    }
}