package com.braze.models.outgoing;

import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.n;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0006B\u001b\b\u0016\u0012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0003\u0010\nJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/braze/models/outgoing/BrazeProperties;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "<init>", "()V", "jsonObject", "(Lorg/json/JSONObject;)V", "", "", "map", "(Ljava/util/Map;)V", "", "doKeyValidation", "clean", "(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "key", "", "value", "addProperty", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/braze/models/outgoing/BrazeProperties;", "clone", "()Lcom/braze/models/outgoing/BrazeProperties;", "containsProperty", "(Ljava/lang/String;)Z", "removeProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "get", "forJsonPut", "()Lorg/json/JSONObject;", "propertiesJSONObject", "Lorg/json/JSONObject;", "", "getSize", "()I", "size", "isInvalid", "()Z", "", "getByteSize", "()J", "byteSize", "Companion", "com/braze/models/outgoing/d", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeProperties implements IPutIntoJson<JSONObject> {
    public static final d Companion = new d();
    private JSONObject propertiesJSONObject;

    public BrazeProperties(Map<String, ?> map) {
        map.getClass();
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, new JSONObject(e.a(map)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addProperty$lambda$0(String str) {
        return a0.p("Value type is not supported. Cannot add property ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addProperty$lambda$1() {
        return "Caught json exception trying to add property.";
    }

    private final JSONObject clean(JSONObject jsonObject, boolean doKeyValidation) throws JSONException {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            arrayList.add(next);
        }
        for (String str : arrayList) {
            if (!doKeyValidation || Companion.a(str)) {
                Object obj = jsonObject.get(str);
                if (obj instanceof Date) {
                    jsonObject.put(str, DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
                }
                if (obj instanceof JSONArray) {
                    jsonObject.put(str, e.a((JSONArray) obj));
                }
                if (obj instanceof JSONObject) {
                    jsonObject.put(str, clean((JSONObject) obj, false));
                }
            } else {
                jsonObject.remove(str);
            }
        }
        return jsonObject;
    }

    public static /* synthetic */ JSONObject clean$default(BrazeProperties brazeProperties, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return brazeProperties.clean(jSONObject, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clone$lambda$2() {
        return "Failed to clone BrazeProperties";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String get$lambda$3() {
        return "Caught json exception trying to get property.";
    }

    public static final boolean isValidKey(String str) {
        return Companion.a(str);
    }

    public final BrazeProperties addProperty(String key, Object value) {
        key.getClass();
        if (!Companion.a(key)) {
            return this;
        }
        try {
            if (value instanceof Long) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).longValue());
                return this;
            }
            if (value instanceof Integer) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).intValue());
                return this;
            }
            if (value instanceof Double) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).doubleValue());
                return this;
            }
            if (value instanceof Boolean) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Boolean) value).booleanValue());
                return this;
            }
            if (value instanceof Date) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null));
                return this;
            }
            if (value instanceof String) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength((String) value));
                return this;
            }
            if (value instanceof JSONArray) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), e.a((JSONArray) value));
                return this;
            }
            if (value instanceof JSONObject) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, (JSONObject) value, false, 2, null));
                return this;
            }
            if (value instanceof Map) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, new JSONObject(e.a((Map) value)), false, 2, null));
                return this;
            }
            if (value == null) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
                return this;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(key, 27), 6, (Object) null);
            return this;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new cu.a(11), 4, (Object) null);
            return this;
        }
    }

    public final BrazeProperties clone() {
        try {
            return new BrazeProperties(new JSONObject(getJsonObject().toString()));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new cu.a(12), 4, (Object) null);
            return null;
        }
    }

    public final boolean containsProperty(String key) {
        key.getClass();
        return this.propertiesJSONObject.has(key);
    }

    public final Object get(String key) {
        key.getClass();
        try {
            return this.propertiesJSONObject.get(key);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new cu.a(13), 4, (Object) null);
            return null;
        }
    }

    public final long getByteSize() {
        String string = this.propertiesJSONObject.toString();
        string.getClass();
        return StringUtils.getByteSize(string);
    }

    public final int getSize() {
        return this.propertiesJSONObject.length();
    }

    public final boolean isInvalid() {
        return getByteSize() > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES;
    }

    public final Object removeProperty(String key) {
        key.getClass();
        return this.propertiesJSONObject.remove(key);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonObject() {
        return this.propertiesJSONObject;
    }

    public BrazeProperties(JSONObject jSONObject) {
        jSONObject.getClass();
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, jSONObject, false, 2, null);
    }

    public BrazeProperties() {
        this.propertiesJSONObject = new JSONObject();
    }
}
