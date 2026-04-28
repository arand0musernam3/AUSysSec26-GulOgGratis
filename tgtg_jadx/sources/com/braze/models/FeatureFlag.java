package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;
import m90.m1;
import m90.r1;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ?2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0002@AB-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÀ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b(\u0010\u0019J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u00102\u0012\u0004\b9\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010\u0019R\u001b\u0010\f\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0014¨\u0006B"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/IPropertiesObject;", "", "id", "", FeatureFlag.ENABLED, "propertiesJson", "trackingString", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "properties", "(Ljava/lang/String;ZLorg/json/JSONObject;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "component1", "()Ljava/lang/String;", "component2", "()Z", "component4$android_sdk_base_release", "component4", "copy$android_sdk_base_release", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "copy", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component3", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/FeatureFlag;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getEnabled", "getEnabled$annotations", "getPropertiesJson$annotations", "getTrackingString$android_sdk_base_release", "getTrackingString$android_sdk_base_release$annotations", "properties$delegate", "Lu70/j;", "getProperties", "Companion", "com/braze/models/j", "com/braze/models/i", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeatureFlag implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final j Companion = new j();
    public static final String ENABLED = "enabled";
    public static final String ID = "id";
    public static final String TRACKING_STRING = "fts";
    private final boolean enabled;
    private final String id;

    /* JADX INFO: renamed from: properties$delegate, reason: from kotlin metadata */
    private final u70.j properties;
    private final String propertiesJson;
    private final String trackingString;

    public /* synthetic */ FeatureFlag(int i11, String str, boolean z11, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, i.f10155a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.enabled = z11;
        this.propertiesJson = str2;
        if ((i11 & 8) == 0) {
            this.trackingString = null;
        } else {
            this.trackingString = str3;
        }
        this.properties = u70.l.b(new r(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject _init_$lambda$4(FeatureFlag featureFlag) {
        try {
            return StringsKt.H(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r(featureFlag, 1), 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$4$lambda$3(FeatureFlag featureFlag) {
        return e0.f.k("Failed to parse properties JSON: ", featureFlag.propertiesJson);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getPropertiesJson() {
        return this.propertiesJson;
    }

    public static /* synthetic */ FeatureFlag copy$android_sdk_base_release$default(FeatureFlag featureFlag, String str, boolean z11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureFlag.id;
        }
        if ((i11 & 2) != 0) {
            z11 = featureFlag.enabled;
        }
        if ((i11 & 4) != 0) {
            str2 = featureFlag.propertiesJson;
        }
        if ((i11 & 8) != 0) {
            str3 = featureFlag.trackingString;
        }
        return featureFlag.copy$android_sdk_base_release(str, z11, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$2() {
        return "Caught exception creating FeatureFlag Json.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject properties_delegate$lambda$1(FeatureFlag featureFlag) {
        try {
            return StringsKt.H(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r(featureFlag, 0), 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String properties_delegate$lambda$1$lambda$0(FeatureFlag featureFlag) {
        return e0.f.k("Failed to parse properties JSON: ", featureFlag.propertiesJson);
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(FeatureFlag self, l90.b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.enabled);
        output.q(serialDesc, 2, self.propertiesJson);
        if (!output.C(serialDesc) && self.trackingString == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.trackingString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4$android_sdk_base_release, reason: from getter */
    public final String getTrackingString() {
        return this.trackingString;
    }

    public final FeatureFlag copy$android_sdk_base_release(String id2, boolean enabled, String propertiesJson, String trackingString) {
        id2.getClass();
        propertiesJson.getClass();
        return new FeatureFlag(id2, enabled, propertiesJson, trackingString);
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(getProperties()), this.trackingString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.areEqual(this.id, featureFlag.id) && this.enabled == featureFlag.enabled && Intrinsics.areEqual(this.propertiesJson, featureFlag.propertiesJson) && Intrinsics.areEqual(this.trackingString, featureFlag.trackingString);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(ENABLED, this.enabled);
            jSONObject.put("properties", getProperties());
            jSONObject.put(TRACKING_STRING, this.trackingString);
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.app.tgtg.model.remote.item.response.a(12), 4, (Object) null);
            return jSONObject;
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.braze.models.IPropertiesObject
    public JSONObject getProperties() {
        return (JSONObject) this.properties.getValue();
    }

    public final String getTrackingString$android_sdk_base_release() {
        return this.trackingString;
    }

    public int hashCode() {
        int iB = l1.b(r8.k.e(this.id.hashCode() * 31, 31, this.enabled), 31, this.propertiesJson);
        String str = this.trackingString;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        boolean z11 = this.enabled;
        String str2 = this.propertiesJson;
        String str3 = this.trackingString;
        StringBuilder sb2 = new StringBuilder("FeatureFlag(id=");
        sb2.append(str);
        sb2.append(", enabled=");
        sb2.append(z11);
        sb2.append(", propertiesJson=");
        return e0.f.o(sb2, str2, ", trackingString=", str3, ")");
    }

    @i90.g(ENABLED)
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @i90.g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @i90.g("properties")
    private static /* synthetic */ void getPropertiesJson$annotations() {
    }

    @i90.g(TRACKING_STRING)
    public static /* synthetic */ void getTrackingString$android_sdk_base_release$annotations() {
    }

    public FeatureFlag(String str, boolean z11, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.enabled = z11;
        this.propertiesJson = str2;
        this.trackingString = str3;
        this.properties = u70.l.b(new r(this, 2));
    }

    public /* synthetic */ FeatureFlag(String str, boolean z11, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, str2, (i11 & 8) != 0 ? null : str3);
    }

    public /* synthetic */ FeatureFlag(String str, boolean z11, JSONObject jSONObject, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, jSONObject, (i11 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureFlag(String str, boolean z11, JSONObject jSONObject, String str2) {
        str.getClass();
        jSONObject.getClass();
        String string = jSONObject.toString();
        string.getClass();
        this(str, z11, string, str2);
    }
}
