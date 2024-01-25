package com.nestor.utilidades;

import org.json.XML;
import org.json.simple.JSONObject;

public class XmlUtils {

	public static String jsonToXml(String jsonString) {
        JSONObject jsonObject = new JSONObject();
        return XML.toString(jsonObject);
    }
}

