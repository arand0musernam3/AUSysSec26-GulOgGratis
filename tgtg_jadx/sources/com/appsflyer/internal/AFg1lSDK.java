package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1lSDK {
    public static JSONObject getCurrencyIso4217Code(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Map<String, Object> getMediationNetwork(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object mediationNetwork = jSONObject.get(next);
            if (mediationNetwork instanceof JSONArray) {
                mediationNetwork = getRevenue((JSONArray) mediationNetwork);
            } else if (mediationNetwork instanceof JSONObject) {
                mediationNetwork = getMediationNetwork((JSONObject) mediationNetwork);
            }
            map.put(next, mediationNetwork);
        }
        return map;
    }

    public static JSONObject getMonetizationNetwork(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getRevenue(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object getRevenue(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getRevenue(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? getMonetizationNetwork((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < length; i11++) {
                jSONArray2.put(getRevenue(Array.get(obj, i11)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    private static List<Object> getRevenue(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            Object mediationNetwork = jSONArray.get(i11);
            if (mediationNetwork instanceof JSONArray) {
                mediationNetwork = getRevenue((JSONArray) mediationNetwork);
            } else if (mediationNetwork instanceof JSONObject) {
                mediationNetwork = getMediationNetwork((JSONObject) mediationNetwork);
            }
            arrayList.add(mediationNetwork);
        }
        return arrayList;
    }
}
