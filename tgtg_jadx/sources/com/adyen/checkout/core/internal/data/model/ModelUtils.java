package com.adyen.checkout.core.internal.data.model;

import com.adyen.checkout.core.exception.BadModelException;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bH\u0007¢\u0006\u0002\u0010\fJ1\u0010\r\u001a\u0004\u0018\u0001H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH\u0007¢\u0006\u0002\u0010\u0010J2\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0012\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH\u0007J\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J1\u0010\u0016\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u0001H\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH\u0007¢\u0006\u0002\u0010\u0018J2\u0010\u0019\u001a\u0004\u0018\u00010\u0014\"\b\b\u0000\u0010\u0006*\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH\u0007J8\u0010\u001b\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0018\u00010\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/ModelUtils;", "", "()V", "SERIALIZER_FIELD_NAME", "", "deserializeModel", "T", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "jsonObject", "Lorg/json/JSONObject;", "modelClass", "Ljava/lang/Class;", "(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "deserializeOpt", "serializer", "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "(Lorg/json/JSONObject;Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "deserializeOptList", "", "jsonArray", "Lorg/json/JSONArray;", "readModelSerializer", "serializeOpt", "modelObject", "(Lcom/adyen/checkout/core/internal/data/model/ModelObject;Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;)Lorg/json/JSONObject;", "serializeOptList", "modelList", "serializeOptMap", "map", "", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelUtils.kt\ncom/adyen/checkout/core/internal/data/model/ModelUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1863#2,2:143\n*S KotlinDebug\n*F\n+ 1 ModelUtils.kt\ncom/adyen/checkout/core/internal/data/model/ModelUtils\n*L\n113#1:143,2\n*E\n"})
public final class ModelUtils {

    @NotNull
    public static final ModelUtils INSTANCE = new ModelUtils();

    @NotNull
    public static final String SERIALIZER_FIELD_NAME = "SERIALIZER";

    private ModelUtils() {
    }

    @NotNull
    public static final <T extends ModelObject> T deserializeModel(@NotNull JSONObject jsonObject, @NotNull Class<T> modelClass) {
        jsonObject.getClass();
        modelClass.getClass();
        ModelObject.Serializer<?> modelSerializer = INSTANCE.readModelSerializer(modelClass);
        modelSerializer.getClass();
        return (T) modelSerializer.deserialize(jsonObject);
    }

    @Nullable
    public static final <T extends ModelObject> T deserializeOpt(@Nullable JSONObject jsonObject, @NotNull ModelObject.Serializer<T> serializer) {
        serializer.getClass();
        if (jsonObject == null) {
            return null;
        }
        return (T) serializer.deserialize(jsonObject);
    }

    @Nullable
    public static final <T extends ModelObject> List<T> deserializeOptList(@Nullable JSONArray jsonArray, @NotNull ModelObject.Serializer<T> serializer) {
        serializer.getClass();
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(serializer.deserialize(jSONObjectOptJSONObject));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final ModelObject.Serializer<?> readModelSerializer(Class<?> modelClass) {
        try {
            Field field = modelClass.getField(SERIALIZER_FIELD_NAME);
            if ((field.getModifiers() & 8) == 0) {
                throw new BadModelException(modelClass, null);
            }
            if (!ModelObject.Serializer.class.isAssignableFrom(field.getType())) {
                throw new BadModelException(modelClass, null);
            }
            Object obj = field.get(null);
            obj.getClass();
            return (ModelObject.Serializer) obj;
        } catch (IllegalAccessException e5) {
            throw new BadModelException(modelClass, e5);
        } catch (NoSuchFieldException e11) {
            throw new BadModelException(modelClass, e11);
        }
    }

    @Nullable
    public static final <T extends ModelObject> JSONObject serializeOpt(@Nullable T modelObject, @NotNull ModelObject.Serializer<T> serializer) {
        serializer.getClass();
        if (modelObject == null) {
            return null;
        }
        return serializer.serialize(modelObject);
    }

    @Nullable
    public static final <T extends ModelObject> JSONArray serializeOptList(@Nullable List<? extends T> modelList, @NotNull ModelObject.Serializer<T> serializer) {
        serializer.getClass();
        if (modelList == null || modelList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends T> it = modelList.iterator();
        while (it.hasNext()) {
            jSONArray.put(serializer.serialize(it.next()));
        }
        return jSONArray;
    }

    @Nullable
    public final <T extends ModelObject> JSONObject serializeOptMap(@Nullable Map<String, ? extends T> map, @NotNull ModelObject.Serializer<T> serializer) throws JSONException {
        serializer.getClass();
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            ModelObject modelObject = (ModelObject) entry.getValue();
            if (modelObject != null) {
                jSONObject.put(str, serializer.serialize(modelObject));
            }
        }
        return jSONObject;
    }
}
