package com.braze.storage;

import android.content.Context;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.storage.v0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u0 f10710e = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.braze.models.outgoing.h f10713d;

    public v0(Context context, String str, String str2) {
        context.getClass();
        this.f10711b = new BrazeConfigurationProvider(context);
        this.f10712c = new w0(context, str, str2);
    }

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.h hVar, boolean z11) throws Throwable {
        hVar.getClass();
        if (z11) {
            try {
                w0 w0Var = this.f10712c;
                int i11 = w0.f10727d;
                String str = "{}";
                w0Var.getClass();
                DataStoreKey dataStoreKey = DataStoreKey.CACHED_DEVICE;
                String string = w0Var.readString(dataStoreKey, "{}");
                if (string != null) {
                    str = string;
                }
                String string2 = JsonUtils.mergeJsonObjects(new JSONObject(str), hVar.getJsonObject()).toString();
                string2.getClass();
                this.f10712c.batchUpdate(kotlin.collections.x0.e(new Pair(dataStoreKey.getKey(), string2), new Pair(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), Boolean.FALSE), new Pair(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey(), Integer.valueOf(Build.VERSION.SDK_INT))), kotlin.collections.p0.f26531a);
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(12), 4, (Object) null);
            }
        }
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.p(11), 6, (Object) null);
        this.f10712c.writeData(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.TRUE);
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.h c() {
        JSONObject jSONObjectA;
        JSONObject jSONObject = new JSONObject();
        com.braze.models.outgoing.h hVar = this.f10713d;
        JSONObject jsonObject = hVar != null ? hVar.getJsonObject() : new JSONObject();
        try {
            w0 w0Var = this.f10712c;
            int i11 = w0.f10727d;
            String str = "{}";
            w0Var.getClass();
            String string = w0Var.readString(DataStoreKey.CACHED_DEVICE, "{}");
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(8), 4, (Object) null);
        }
        w0 w0Var2 = this.f10712c;
        int i12 = Build.VERSION.SDK_INT;
        w0Var2.getClass();
        Integer num = w0Var2.readInt(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION, Integer.valueOf(i12));
        int iIntValue = num != null ? num.intValue() : i12;
        u0 u0Var = f10710e;
        final boolean zA = u0Var.a(jSONObject, jsonObject, iIntValue, i12);
        w0 w0Var3 = this.f10712c;
        w0Var3.getClass();
        Boolean bool = w0Var3.readBoolean(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.FALSE);
        final boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (zBooleanValue || zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: lw.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v0.a(zBooleanValue, zA);
                }
            }, 7, (Object) null);
            jSONObjectA = u0Var.a(new JSONObject(), jsonObject);
        } else {
            jSONObjectA = u0Var.a(jSONObject, jsonObject);
        }
        if (jSONObjectA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.p(9), 7, (Object) null);
            return this.f10713d;
        }
        BrazeConfigurationProvider brazeConfigurationProvider = this.f10711b;
        brazeConfigurationProvider.getClass();
        String optionalString = null;
        String optionalString2 = null;
        String str2 = null;
        String optionalString3 = null;
        String optionalString4 = null;
        String optionalString5 = null;
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = null;
        String optionalString6 = null;
        Boolean boolValueOf3 = null;
        for (DeviceKey deviceKey : DeviceKey.getEntries()) {
            String key = deviceKey.getKey();
            switch (com.braze.models.outgoing.f.f10187a[deviceKey.ordinal()]) {
                case 1:
                    optionalString5 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 2:
                    optionalString2 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 3:
                    optionalString = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 4:
                    optionalString4 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 5:
                    String optionalString7 = JsonUtils.getOptionalString(jSONObjectA, key);
                    if (optionalString7 != null && !StringsKt.H(optionalString7)) {
                        str2 = optionalString7;
                    }
                    break;
                case 6:
                    optionalString3 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 7:
                    if (jSONObjectA.has(key)) {
                        boolValueOf = Boolean.valueOf(jSONObjectA.optBoolean(key, true));
                    }
                    break;
                case 8:
                    if (jSONObjectA.has(key)) {
                        boolValueOf2 = Boolean.valueOf(jSONObjectA.optBoolean(key, false));
                    }
                    break;
                case 9:
                    optionalString6 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 10:
                    if (jSONObjectA.has(key)) {
                        boolValueOf3 = Boolean.valueOf(jSONObjectA.optBoolean(key));
                    }
                    break;
                default:
                    e40.a.f();
                    return null;
            }
        }
        com.braze.models.outgoing.h hVar2 = new com.braze.models.outgoing.h(brazeConfigurationProvider, optionalString, optionalString2, str2, optionalString3, optionalString4, optionalString5, boolValueOf, boolValueOf2, optionalString6, boolValueOf3);
        if (zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.p(10), 6, (Object) null);
            hVar2.l = true;
        }
        return hVar2;
    }

    public static final String a(boolean z11, boolean z12) {
        return "Exporting the full device due to either: shouldSendFullDeviceOnNextExport: " + z11 + ", shouldReportPushPermissionsAsGranted: " + z12;
    }
}
