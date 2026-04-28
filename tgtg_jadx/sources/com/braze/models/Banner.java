package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\b\u0007\u0018\u0000 '2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001(BA\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0011R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/braze/models/Banner;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/IPropertiesObject;", "", "trackingId", "placementId", Banner.HTML, "", "isControl", "", "expirationTimestampSeconds", "isTestSend", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJZLorg/json/JSONObject;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/Banner;", "deepcopy", "isExpired", "()Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTrackingId", "getPlacementId", "getHtml", "Z", "J", "getExpirationTimestampSeconds", "()J", "Lorg/json/JSONObject;", "getProperties", "userId", "getUserId", "setUserId", "(Ljava/lang/String;)V", "Companion", "com/braze/models/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Banner implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final String BANNER_KEY = "banner";
    public static final a Companion = new a();
    public static final String EXPIRATION = "expires_at";
    public static final String HTML = "html";
    public static final String IS_CONTROL = "is_control";
    public static final String IS_TEST_SEND = "is_test_send";
    public static final String PLACEMENT_ID = "placement_id";
    public static final String TRACKING_ID = "id";
    private final long expirationTimestampSeconds;
    private final String html;
    private final boolean isControl;
    private final boolean isTestSend;
    private final String placementId;
    private final JSONObject properties;
    private final String trackingId;
    private String userId;

    public Banner(String str, String str2, String str3, boolean z11, long j9, boolean z12, JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        jSONObject.getClass();
        this.trackingId = str;
        this.placementId = str2;
        this.html = str3;
        this.isControl = z11;
        this.expirationTimestampSeconds = j9;
        this.isTestSend = z12;
        this.properties = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating Banner Json.";
    }

    public final Banner deepcopy$android_sdk_base_release() {
        return new Banner(this.trackingId, this.placementId, this.html, this.isControl, this.expirationTimestampSeconds, this.isTestSend, getProperties());
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getKey() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.trackingId);
            jSONObject2.put(PLACEMENT_ID, this.placementId);
            jSONObject2.put(HTML, this.html);
            jSONObject2.put("is_control", this.isControl);
            jSONObject2.put(EXPIRATION, this.expirationTimestampSeconds);
            jSONObject2.put("is_test_send", this.isTestSend);
            jSONObject2.put("properties", getProperties());
            jSONObject.put(BANNER_KEY, jSONObject2);
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.app.tgtg.model.remote.item.response.a(11), 4, (Object) null);
            return jSONObject;
        }
    }

    public final long getExpirationTimestampSeconds() {
        return this.expirationTimestampSeconds;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    @Override // com.braze.models.IPropertiesObject
    public JSONObject getProperties() {
        return this.properties;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isControl, reason: from getter */
    public final boolean getIsControl() {
        return this.isControl;
    }

    public final boolean isExpired() {
        long j9 = this.expirationTimestampSeconds;
        return j9 != -1 && j9 < DateTimeUtils.nowInSeconds();
    }

    /* JADX INFO: renamed from: isTestSend, reason: from getter */
    public final boolean getIsTestSend() {
        return this.isTestSend;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        String str = this.trackingId;
        String str2 = this.placementId;
        String str3 = this.html;
        boolean z11 = this.isControl;
        long j9 = this.expirationTimestampSeconds;
        boolean z12 = this.isTestSend;
        JSONObject properties = getProperties();
        StringBuilder sbT = e0.f.t("\n            Banner{\n            trackingId='", str, "'\n            placementId='", str2, "'\n            html='");
        r8.k.z(sbT, str3, "'\n            isControl=", z11, "\n            expirationTimestampSeconds=");
        sbT.append(j9);
        sbT.append("\n            isTestSend=");
        sbT.append(z12);
        sbT.append("\n            properties=");
        sbT.append(properties);
        sbT.append("\n            }\n        ");
        return s.c(sbT.toString());
    }
}
