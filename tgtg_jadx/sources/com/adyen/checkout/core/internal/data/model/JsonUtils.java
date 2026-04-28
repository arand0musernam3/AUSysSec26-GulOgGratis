package com.adyen.checkout.core.internal.data.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00072\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/JsonUtils;", "", "()V", "parseOptIntegerList", "", "", "jsonArray", "Lorg/json/JSONArray;", "parseOptStringList", "", "serializeOptIntegerList", "intList", "serializeOptStringList", "stringList", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/adyen/checkout/core/internal/data/model/JsonUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n774#2:206\n865#2,2:207\n1863#2,2:209\n1863#2,2:211\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/adyen/checkout/core/internal/data/model/JsonUtils\n*L\n156#1:206\n156#1:207,2\n156#1:209,2\n199#1:211,2\n*E\n"})
public final class JsonUtils {

    @NotNull
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    @Nullable
    public static final List<Integer> parseOptIntegerList(@Nullable JSONArray jsonArray) throws JSONException {
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!(jsonArray.opt(i11) instanceof Integer)) {
                throw new JSONException("type is not integer");
            }
            arrayList.add(Integer.valueOf(jsonArray.optInt(i11)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public static final List<String> parseOptStringList(@Nullable JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String strOptString = jsonArray.optString(i11, null);
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public static final JSONArray serializeOptIntegerList(@Nullable List<Integer> intList) {
        if (intList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = intList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Number) it.next()).intValue());
        }
        return jSONArray;
    }

    @Nullable
    public static final JSONArray serializeOptStringList(@Nullable List<String> stringList) {
        if (stringList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stringList) {
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }
}
