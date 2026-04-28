package com.adyen.checkout.core.internal.data.model;

import com.adyen.checkout.core.internal.data.model.ModelObject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007\u001a5\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00150\u0012\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0018H\u0087\b\u001a\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0012*\u00020\u0006H\u0002\u001a\f\u0010\u001d\u001a\u00020\u0003*\u00020\u001eH\u0007\u001a\f\u0010\u001d\u001a\u00020\u0003*\u00020\u0006H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"INDENTATION_SPACES", "", JsonUtilsKt.PARSING_ERROR, "", "getBooleanOrNull", "", "Lorg/json/JSONObject;", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "getDoubleOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "getIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getLongOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "getMapOrNull", "", "getStringOrNull", "jsonToMap", "T", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "modelSerializer", "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "optIntList", "", "optStringList", "toMap", "toStringPretty", "Lorg/json/JSONArray;", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JsonUtilsKt {
    private static final int INDENTATION_SPACES = 4;

    @NotNull
    private static final String PARSING_ERROR = "PARSING_ERROR";

    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Boolean.valueOf(jSONObject.getBoolean(str));
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.getDouble(str));
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(str));
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.getLong(str));
    }

    @Nullable
    public static final Map<String, String> getMapOrNull(@NotNull JSONObject jSONObject, @NotNull String str) throws JSONException {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        jSONObject2.getClass();
        return toMap(jSONObject2);
    }

    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static final /* synthetic */ <T extends ModelObject> Map<String, T> jsonToMap(JSONObject jSONObject, ModelObject.Serializer<T> serializer) throws JSONException {
        jSONObject.getClass();
        serializer.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != JSONObject.NULL) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    next.getClass();
                    linkedHashMap.put(next, ModelUtils.deserializeOpt((JSONObject) obj, serializer));
                }
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final List<Integer> optIntList(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        return JsonUtils.parseOptIntegerList(jSONObject.optJSONArray(str));
    }

    @Nullable
    public static final List<String> optStringList(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        return JsonUtils.parseOptStringList(jSONObject.optJSONArray(str));
    }

    private static final Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                next.getClass();
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String toStringPretty(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String string = jSONObject.toString(4);
            string.getClass();
            return string;
        } catch (JSONException unused) {
            return PARSING_ERROR;
        }
    }

    @NotNull
    public static final String toStringPretty(@NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        try {
            String string = jSONArray.toString(4);
            string.getClass();
            return string;
        } catch (JSONException unused) {
            return PARSING_ERROR;
        }
    }
}
