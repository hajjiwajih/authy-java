package com.authy.api;

import java.util.Map;

/**
 * Interface to represent objects as XML or Java's Map
 *
 * @author Authy Inc
 */
public interface Formattable {
    String toXML();

    Map<String, String> toMap();

    default String toJSON() {
        org.json.JSONObject json = new org.json.JSONObject();
        for (Map.Entry<String, String> entry : toMap().entrySet()) {
            json.put(entry.getKey(), entry.getValue());
        }

        return json.toString();
    }
}
