package com.braze.models;

import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;
import m90.m1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0007\u0018\u0000 X2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0002YZBk\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u0012\u0004\b5\u00106R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010 R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b=\u00106\u001a\u0004\b;\u0010<R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010<R \u0010\u000b\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010*R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010*R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010*R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bJ\u00106\u001a\u0004\bH\u0010IR \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bL\u00106\u001a\u0004\bK\u0010IR \u0010\u0011\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bN\u00106\u001a\u0004\bM\u0010IR \u0010\u0012\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bP\u00106\u001a\u0004\bO\u0010IR \u0010\u0013\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010@\u0012\u0004\bR\u00106\u001a\u0004\bQ\u0010*R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010:\u001a\u0004\bS\u0010<\"\u0004\bT\u0010UR\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010<¨\u0006["}, d2 = {"Lcom/braze/models/BrazeGeofence;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "jsonObject", "", "id", "", "latitude", "longitude", "", "radiusMeter", "cooldownEnterSeconds", "cooldownExitSeconds", "", "analyticsEnabledEnter", "analyticsEnabledExit", "enterEvents", "exitEvents", "notificationResponsivenessMs", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", "seen0", "distanceFromGeofenceRefresh", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;DDIIIZZZZIDLm90/m1;)V", "otherGeofence", "equivalentServerData", "(Lcom/braze/models/BrazeGeofence;)Z", "toString", "()Ljava/lang/String;", "forJsonPut", "()Lorg/json/JSONObject;", "other", "compareTo", "(Lcom/braze/models/BrazeGeofence;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/BrazeGeofence;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lorg/json/JSONObject;", "getJsonObject$annotations", "()V", "Ljava/lang/String;", "getId", "getId$annotations", "D", "getLatitude", "()D", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "I", "getRadiusMeter", "getRadiusMeter$annotations", "getCooldownEnterSeconds", "getCooldownEnterSeconds$annotations", "getCooldownExitSeconds", "getCooldownExitSeconds$annotations", "Z", "getAnalyticsEnabledEnter", "()Z", "getAnalyticsEnabledEnter$annotations", "getAnalyticsEnabledExit", "getAnalyticsEnabledExit$annotations", "getEnterEvents", "getEnterEvents$annotations", "getExitEvents", "getExitEvents$annotations", "getNotificationResponsivenessMs", "getNotificationResponsivenessMs$annotations", "getDistanceFromGeofenceRefresh", "setDistanceFromGeofenceRefresh", "(D)V", "getRadiusMeters", "radiusMeters", "Companion", "com/braze/models/d", "com/braze/models/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    public static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    public static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    public static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    public static final d Companion = new d();
    public static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    public static final String ENTER_EVENTS = "enter_events";
    public static final String EXIT_EVENTS = "exit_events";
    public static final String ID = "id";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    public static final String RADIUS_METERS = "radius";
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    /* JADX WARN: Illegal instructions before constructor call */
    public BrazeGeofence(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("id");
        string.getClass();
        this(jSONObject, string, jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"), jSONObject.getInt(RADIUS_METERS), jSONObject.getInt(COOLDOWN_ENTER_SECONDS), jSONObject.getInt(COOLDOWN_EXIT_SECONDS), jSONObject.getBoolean(ANALYTICS_ENABLED_ENTER), jSONObject.getBoolean(ANALYTICS_ENABLED_EXIT), jSONObject.optBoolean(ENTER_EVENTS, true), jSONObject.optBoolean(EXIT_EVENTS, true), jSONObject.optInt(NOTIFICATION_RESPONSIVENESS_MS, DEFAULT_NOTIFICATION_RESPONSIVENESS_MS));
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(BrazeGeofence self, l90.b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.z(serialDesc, 1, self.latitude);
        output.z(serialDesc, 2, self.longitude);
        output.m(3, self.radiusMeter, serialDesc);
        output.m(4, self.cooldownEnterSeconds, serialDesc);
        output.m(5, self.cooldownExitSeconds, serialDesc);
        output.p(serialDesc, 6, self.analyticsEnabledEnter);
        output.p(serialDesc, 7, self.analyticsEnabledExit);
        output.p(serialDesc, 8, self.enterEvents);
        output.p(serialDesc, 9, self.exitEvents);
        output.m(10, self.notificationResponsivenessMs, serialDesc);
        if (!output.C(serialDesc) && Double.compare(self.distanceFromGeofenceRefresh, -1.0d) == 0) {
            return;
        }
        output.z(serialDesc, 11, self.distanceFromGeofenceRefresh);
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        other.getClass();
        double d3 = this.distanceFromGeofenceRefresh;
        return (d3 != -1.0d && d3 < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BrazeGeofence.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        BrazeGeofence brazeGeofence = (BrazeGeofence) other;
        return Intrinsics.areEqual(this.id, brazeGeofence.id) && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public final boolean equivalentServerData(BrazeGeofence otherGeofence) {
        otherGeofence.getClass();
        try {
            return Intrinsics.areEqual(this, otherGeofence);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean getAnalyticsEnabledEnter() {
        return this.analyticsEnabledEnter;
    }

    public final boolean getAnalyticsEnabledExit() {
        return this.analyticsEnabledExit;
    }

    public final int getCooldownEnterSeconds() {
        return this.cooldownEnterSeconds;
    }

    public final int getCooldownExitSeconds() {
        return this.cooldownExitSeconds;
    }

    public final double getDistanceFromGeofenceRefresh() {
        return this.distanceFromGeofenceRefresh;
    }

    public final boolean getEnterEvents() {
        return this.enterEvents;
    }

    public final boolean getExitEvents() {
        return this.exitEvents;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getNotificationResponsivenessMs() {
        return this.notificationResponsivenessMs;
    }

    public final int getRadiusMeter() {
        return this.radiusMeter;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public int hashCode() {
        return Double.hashCode(getRadiusMeters()) + ((r8.k.e(r8.k.e(r8.k.e(r8.k.e((((((s.b(this.longitude, s.b(this.latitude, l1.b(this.jsonObject.hashCode() * 31, 31, this.id), 31), 31) + this.radiusMeter) * 31) + this.cooldownEnterSeconds) * 31) + this.cooldownExitSeconds) * 31, 31, this.analyticsEnabledEnter), 31, this.analyticsEnabledExit), 31, this.enterEvents), 31, this.exitEvents) + this.notificationResponsivenessMs) * 31);
    }

    public final void setDistanceFromGeofenceRefresh(double d3) {
        this.distanceFromGeofenceRefresh = d3;
    }

    public String toString() {
        String str = this.id;
        double d3 = this.latitude;
        double d11 = this.longitude;
        int i11 = this.radiusMeter;
        int i12 = this.cooldownEnterSeconds;
        int i13 = this.cooldownExitSeconds;
        boolean z11 = this.analyticsEnabledEnter;
        boolean z12 = this.analyticsEnabledExit;
        boolean z13 = this.enterEvents;
        boolean z14 = this.exitEvents;
        int i14 = this.notificationResponsivenessMs;
        double d12 = this.distanceFromGeofenceRefresh;
        StringBuilder sb2 = new StringBuilder("BrazeGeofence{id=");
        sb2.append(str);
        sb2.append(", \n            |latitude, longitude=(");
        sb2.append(d3);
        sb2.append(", ");
        sb2.append(d11);
        sb2.append("),\n            |radiusMeters=");
        e0.f.C(sb2, i11, ", \n            |cooldownEnterSeconds=", i12, ", \n            |cooldownExitSeconds=");
        sb2.append(i13);
        sb2.append(", \n            |analyticsEnabledEnter=");
        sb2.append(z11);
        sb2.append(", \n            |analyticsEnabledExit=");
        b3.i.C(sb2, z12, ", \n            |enterEvents=", z13, ", \n            |exitEvents=");
        sb2.append(z14);
        sb2.append(", \n            |notificationResponsivenessMs=");
        sb2.append(i14);
        sb2.append(", \n            |distanceFromGeofenceRefresh=");
        sb2.append(d12);
        sb2.append(" }\n            |\n        ");
        return kotlin.text.s.d(sb2.toString());
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @i90.g(ANALYTICS_ENABLED_ENTER)
    public static /* synthetic */ void getAnalyticsEnabledEnter$annotations() {
    }

    @i90.g(ANALYTICS_ENABLED_EXIT)
    public static /* synthetic */ void getAnalyticsEnabledExit$annotations() {
    }

    @i90.g(COOLDOWN_ENTER_SECONDS)
    public static /* synthetic */ void getCooldownEnterSeconds$annotations() {
    }

    @i90.g(COOLDOWN_EXIT_SECONDS)
    public static /* synthetic */ void getCooldownExitSeconds$annotations() {
    }

    @i90.g(ENTER_EVENTS)
    public static /* synthetic */ void getEnterEvents$annotations() {
    }

    @i90.g(EXIT_EVENTS)
    public static /* synthetic */ void getExitEvents$annotations() {
    }

    @i90.g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getJsonObject$annotations() {
    }

    @i90.g("latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @i90.g("longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @i90.g(NOTIFICATION_RESPONSIVENESS_MS)
    public static /* synthetic */ void getNotificationResponsivenessMs$annotations() {
    }

    @i90.g(RADIUS_METERS)
    public static /* synthetic */ void getRadiusMeter$annotations() {
    }

    public BrazeGeofence(JSONObject jSONObject, String str, double d3, double d11, int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, boolean z14, int i14) {
        jSONObject.getClass();
        str.getClass();
        this.jsonObject = jSONObject;
        this.id = str;
        this.latitude = d3;
        this.longitude = d11;
        this.radiusMeter = i11;
        this.cooldownEnterSeconds = i12;
        this.cooldownExitSeconds = i13;
        this.analyticsEnabledEnter = z11;
        this.analyticsEnabledExit = z12;
        this.enterEvents = z13;
        this.exitEvents = z14;
        this.notificationResponsivenessMs = i14;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public /* synthetic */ BrazeGeofence(JSONObject jSONObject, String str, double d3, double d11, int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, boolean z14, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? new JSONObject() : jSONObject, str, d3, d11, i11, i12, i13, z11, z12, z13, z14, i14);
    }

    public /* synthetic */ BrazeGeofence(int i11, String str, double d3, double d11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, double d12, m1 m1Var) {
        if (2047 == (i11 & 2047)) {
            this.jsonObject = new JSONObject();
            this.id = str;
            this.latitude = d3;
            this.longitude = d11;
            this.radiusMeter = i12;
            this.cooldownEnterSeconds = i13;
            this.cooldownExitSeconds = i14;
            this.analyticsEnabledEnter = z11;
            this.analyticsEnabledExit = z12;
            this.enterEvents = z13;
            this.exitEvents = z14;
            this.notificationResponsivenessMs = i15;
            this.distanceFromGeofenceRefresh = (i11 & NewHope.SENDB_BYTES) == 0 ? -1.0d : d12;
            return;
        }
        c1.j(i11, 2047, c.f10135a.getDescriptor());
        throw null;
    }
}
