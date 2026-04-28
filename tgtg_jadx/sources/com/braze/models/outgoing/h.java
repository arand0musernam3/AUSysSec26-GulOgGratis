package com.braze.models.outgoing;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements IPutIntoJson, m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f10188n = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f10189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f10196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f10197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f10199k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10200m;

    public h(BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        brazeConfigurationProvider.getClass();
        this.f10189a = brazeConfigurationProvider;
        this.f10190b = str;
        this.f10191c = str2;
        this.f10192d = str3;
        this.f10193e = str4;
        this.f10194f = str5;
        this.f10195g = str6;
        this.f10196h = bool;
        this.f10197i = bool2;
        this.f10198j = str7;
        this.f10199k = bool3;
        this.f10200m = true;
    }

    public static final String c() {
        return "Caught exception creating device Json.";
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            g gVar = f10188n;
            gVar.a(this.f10189a, jSONObject, DeviceKey.ANDROID_VERSION, this.f10190b);
            gVar.a(this.f10189a, jSONObject, DeviceKey.CARRIER, this.f10191c);
            gVar.a(this.f10189a, jSONObject, DeviceKey.BRAND, this.f10192d);
            gVar.a(this.f10189a, jSONObject, DeviceKey.MODEL, this.f10193e);
            gVar.a(this.f10189a, jSONObject, DeviceKey.LOCALE, this.f10194f);
            if (this.f10200m) {
                gVar.a(this.f10189a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f10196h);
            }
            gVar.a(this.f10189a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f10197i);
            gVar.a(this.f10189a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f10198j);
            Boolean bool = this.f10199k;
            if (bool != null) {
                gVar.a(this.f10189a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str = this.f10195g;
            if (str != null && !StringsKt.H(str)) {
                gVar.a(this.f10189a, jSONObject, DeviceKey.TIMEZONE, this.f10195g);
            }
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new cu.a(16), 4, (Object) null);
            return jSONObject;
        }
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return getJsonObject().length() == 0;
    }
}
