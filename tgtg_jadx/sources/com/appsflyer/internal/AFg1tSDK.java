package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1ySDK;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import u70.o;
import u70.p;
import u70.q;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEventDataCollectorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDataCollectorImpl.kt\ncom/appsflyer/internal/event_data/EventDataCollectorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,924:1\n1#2:925\n*E\n"})
public final class AFg1tSDK implements AFg1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFInAppEventType = 63402;
    private static char AFKeystoreWrapper = 61739;
    private static char AFLogger = 47673;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9525i = 1;
    private static char registerClient = 16862;
    private static int unregisterClient;

    @NotNull
    private final Context AFAdRevenueData;

    @NotNull
    private final u70.j AFInAppEventParameterName;

    @NotNull
    private final AFc1jSDK areAllFieldsValid;

    @NotNull
    private final AFg1uSDK component1;

    @NotNull
    private final AFh1uSDK component2;

    @NotNull
    private final AFc1kSDK component3;

    @NotNull
    private final AFi1xSDK component4;

    @NotNull
    private final AFg1zSDK copy;

    @NotNull
    private final u70.j copydefault;

    @NotNull
    private final AFc1gSDK equals;

    @NotNull
    private final AFj1oSDK getCurrencyIso4217Code;

    @NotNull
    private final AFi1lSDK getMediationNetwork;

    @NotNull
    private final String getMonetizationNetwork;

    @NotNull
    private final AFg1ySDK getRevenue;

    @NotNull
    private final AFc1fSDK hashCode;

    @NotNull
    private final AFf1kSDK toString;

    public AFg1tSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFg1ySDK aFg1ySDK, @NotNull AFj1oSDK aFj1oSDK, @NotNull AFg1uSDK aFg1uSDK, @NotNull AFh1uSDK aFh1uSDK, @NotNull AFc1jSDK aFc1jSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1xSDK aFi1xSDK, @NotNull AFf1kSDK aFf1kSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFg1zSDK aFg1zSDK, @NotNull AFc1gSDK aFc1gSDK) {
        str.getClass();
        context.getClass();
        aFi1lSDK.getClass();
        aFg1ySDK.getClass();
        aFj1oSDK.getClass();
        aFg1uSDK.getClass();
        aFh1uSDK.getClass();
        aFc1jSDK.getClass();
        aFc1kSDK.getClass();
        aFi1xSDK.getClass();
        aFf1kSDK.getClass();
        aFc1fSDK.getClass();
        aFg1zSDK.getClass();
        aFc1gSDK.getClass();
        this.getMonetizationNetwork = str;
        this.AFAdRevenueData = context;
        this.getMediationNetwork = aFi1lSDK;
        this.getRevenue = aFg1ySDK;
        this.getCurrencyIso4217Code = aFj1oSDK;
        this.component1 = aFg1uSDK;
        this.component2 = aFh1uSDK;
        this.areAllFieldsValid = aFc1jSDK;
        this.component3 = aFc1kSDK;
        this.component4 = aFi1xSDK;
        this.toString = aFf1kSDK;
        this.hashCode = aFc1fSDK;
        this.copy = aFg1zSDK;
        this.equals = aFc1gSDK;
        this.copydefault = u70.l.b(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1tSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFInAppEventParameterName = u70.l.b(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1tSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        if (getRevenue().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i11 = unregisterClient + 121;
            f9525i = i11 % 128;
            if (i11 % 2 != 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                throw null;
            }
        }
        String revenue = this.toString.getRevenue(this.areAllFieldsValid);
        if (revenue != null && revenue.length() != 0) {
            int i12 = unregisterClient + 105;
            f9525i = i12 % 128;
            if (i12 % 2 == 0) {
                map.put("imei", revenue);
                throw null;
            }
            map.put("imei", revenue);
        }
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            f9525i = (unregisterClient + 71) % 128;
            this.areAllFieldsValid.getMediationNetwork("androidIdCached", currencyIso4217Code);
            map.put("android_id", currencyIso4217Code);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1mSDK revenue2 = AFb1jSDK.getRevenue(this.AFAdRevenueData);
        if (revenue2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = revenue2.getCurrencyIso4217Code;
            bool.getClass();
            linkedHashMap.put("isManual", bool);
            String str2 = revenue2.getRevenue;
            str2.getClass();
            linkedHashMap.put("val", str2);
            Boolean bool2 = revenue2.getMonetizationNetwork;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        long j9;
        int i11 = unregisterClient + 69;
        f9525i = i11 % 128;
        if (i11 % 2 == 0) {
            map.getClass();
            j9 = this.component2.equals;
            if (j9 == 0) {
                return;
            }
        } else {
            map.getClass();
            j9 = this.component2.equals;
            if (j9 == 0) {
                return;
            }
        }
        unregisterClient = (f9525i + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        map.put("prev_session_dur", Long.valueOf(j9));
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, 381318277, -381318268, System.identityHashCode(this));
    }

    private final String AFKeystoreWrapper() {
        File file = (File) getCurrencyIso4217Code(new Object[]{getRevenue("ro.appsflyer.preinstall.path")}, -1713193942, 1713193943, (int) System.currentTimeMillis());
        if (getRevenue(file)) {
            int i11 = unregisterClient + 55;
            f9525i = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            file = (File) getCurrencyIso4217Code(new Object[]{getMediationNetwork("AF_PRE_INSTALL_PATH")}, -1713193942, 1713193943, (int) System.currentTimeMillis());
        }
        if (getRevenue(file)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            unregisterClient = (f9525i + 121) % 128;
        }
        if (getRevenue(file)) {
            file = (File) getCurrencyIso4217Code(new Object[]{"/etc/pre_install.appsflyer"}, -1713193942, 1713193943, (int) System.currentTimeMillis());
            f9525i = (unregisterClient + 111) % 128;
        }
        if (!getRevenue(file)) {
            String packageName = this.AFAdRevenueData.getPackageName();
            packageName.getClass();
            return (String) getCurrencyIso4217Code(new Object[]{file, packageName}, 1094427933, -1094427925, (int) System.currentTimeMillis());
        }
        int i12 = f9525i + 113;
        unregisterClient = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFLogger(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r5 = this;
            r6.getClass()
            com.appsflyer.internal.AFc1kSDK r0 = r5.component3
            java.lang.String r0 = r0.component1()
            com.appsflyer.internal.AFc1jSDK r1 = r5.areAllFieldsValid
            java.lang.String r1 = getMonetizationNetwork(r1, r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r4 != 0) goto L1b
            r4 = r2
            goto L1c
        L1b:
            r4 = r3
        L1c:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L29
            int r1 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r1 = r1 + 85
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r1
            goto L32
        L29:
            int r1 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r1 = r1 + 47
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r1
            r2 = r3
        L32:
            if (r4 != 0) goto L48
            int r1 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r1 = r1 + 23
            int r4 = r1 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L46
            r1 = 79
            int r1 = r1 / r3
            if (r2 == 0) goto L55
            goto L48
        L46:
            if (r2 == 0) goto L55
        L48:
            java.lang.String r1 = "af_latestchannel"
            r6.put(r1, r0)
            int r0 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r0 = r0 + 17
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r0
        L55:
            java.lang.String r0 = r5.component4()
            if (r0 == 0) goto L76
            int r1 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r1 = r1 + 25
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r1
            java.util.Locale r1 = java.util.Locale.getDefault()
            r1.getClass()
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "af_installstore"
            r6.put(r1, r0)
        L76:
            java.lang.String r0 = r5.equals()
            if (r0 == 0) goto L8f
            java.util.Locale r1 = java.util.Locale.getDefault()
            r1.getClass()
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "af_preinstall_name"
            r6.put(r1, r0)
        L8f:
            java.lang.String r0 = r5.component2()
            if (r0 == 0) goto La8
            java.util.Locale r1 = java.util.Locale.getDefault()
            r1.getClass()
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "af_currentstore"
            r6.put(r1, r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.AFLogger(java.util.Map):void");
    }

    private static void a(String str, int i11, Object[] objArr) {
        char[] charArray;
        int i12;
        if (str != null) {
            $10 = ($11 + 113) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1mSDK.getCurrencyIso4217Code = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i13 = aFk1mSDK.getCurrencyIso4217Code;
            if (i13 >= cArr.length) {
                String str2 = new String(cArr2, 0, i11);
                $11 = ($10 + 23) % 128;
                objArr[0] = str2;
                return;
            }
            int i14 = $10 + 51;
            $11 = i14 % 128;
            int i15 = 58224;
            if (i14 % 2 == 0) {
                cArr3[0] = cArr[i13];
                cArr3[1] = cArr[i13];
                i12 = 1;
            } else {
                cArr3[0] = cArr[i13];
                cArr3[1] = cArr[i13 + 1];
                i12 = 0;
            }
            while (i12 < 16) {
                $11 = ($10 + 31) % 128;
                char c3 = cArr3[1];
                char c7 = cArr3[0];
                char c8 = (char) (c3 - (((c7 + i15) ^ ((c7 << 4) + ((char) (((long) AFKeystoreWrapper) ^ (-8918198944764412327L))))) ^ ((c7 >>> 5) + ((char) (((long) registerClient) ^ (-8918198944764412327L))))));
                cArr3[1] = c8;
                cArr3[0] = (char) (c7 - (((c8 >>> 5) + ((char) (((long) AFLogger) ^ (-8918198944764412327L)))) ^ ((c8 + i15) ^ ((c8 << 4) + ((char) (((long) AFInAppEventType) ^ (-8918198944764412327L)))))));
                i15 -= 40503;
                i12++;
            }
            int i16 = aFk1mSDK.getCurrencyIso4217Code;
            cArr2[i16] = cArr3[0];
            cArr2[i16 + 1] = cArr3[1];
            aFk1mSDK.getCurrencyIso4217Code = i16 + 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void afInfoLog(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r3) {
        /*
            r2 = this;
            r3.getClass()
            com.appsflyer.internal.AFf1kSDK r0 = r2.toString
            java.lang.String r0 = r0.getMonetizationNetwork()
            if (r0 == 0) goto L20
            int r1 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r1 = r1 + 63
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r1
            int r1 = r0.length()
            if (r1 != 0) goto L1a
            goto L20
        L1a:
            java.lang.String r1 = "appsflyerKey"
            r3.put(r1, r0)
            goto L28
        L20:
            int r3 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r3 = r3 + 67
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r3
        L28:
            int r3 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r3 = r3 + 97
            int r0 = r3 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r0
            r0 = 2
            int r3 = r3 % r0
            if (r3 == 0) goto L36
            int r0 = r0 / 0
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.afInfoLog(java.util.Map):void");
    }

    @NotNull
    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + ExpiryDateInput.SEPARATOR + ((long) (blockCountLong / dPow));
        int i11 = f9525i + 3;
        unregisterClient = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 30 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        Map map = (Map) objArr[0];
        unregisterClient = (f9525i + 119) % 128;
        map.getClass();
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e5) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e5);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            unregisterClient = (f9525i + 69) % 128;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            int i11 = f9525i + 7;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 67 / 0;
            }
            return null;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r7 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r1 = new java.util.Properties();
        r3 = new java.io.InputStreamReader(new java.io.FileInputStream(r2), java.nio.charset.Charset.defaultCharset());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1.load(r3);
        com.appsflyer.AFLogger.afInfoLog("Found PreInstall property!");
        r7 = r1.getProperty(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r7.getMessage(), r7);
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r3 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r3.close();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r7.getMessage(), r7);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("PreInstall file wasn't found: " + r2.getAbsolutePath());
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r3 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r3 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        com.appsflyer.internal.AFg1tSDK.unregisterClient = (com.appsflyer.internal.AFg1tSDK.f9525i + 69) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r4 = (r4 + 5) % 128;
        com.appsflyer.internal.AFg1tSDK.f9525i = r4;
        r4 = r4 + 11;
        com.appsflyer.internal.AFg1tSDK.unregisterClient = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r4 % 2) == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e A[EXC_TOP_SPLITTER, PHI: r3
      0x006e: PHI (r3v10 java.io.InputStreamReader) = (r3v17 java.io.InputStreamReader), (r3v18 java.io.InputStreamReader) binds: [B:24:0x006c, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object component2(java.lang.Object[] r7) {
        /*
            java.lang.String r0 = "PreInstall file wasn't found: "
            r1 = 0
            r2 = r7[r1]
            java.io.File r2 = (java.io.File) r2
            r3 = 1
            r7 = r7[r3]
            java.lang.String r7 = (java.lang.String) r7
            int r3 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r3 = r3 + 43
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r4
            int r3 = r3 % 2
            r5 = 0
            if (r3 == 0) goto L1f
            r3 = 89
            int r3 = r3 / r1
            if (r2 != 0) goto L35
            goto L21
        L1f:
            if (r2 != 0) goto L35
        L21:
            int r4 = r4 + 5
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r4
            int r4 = r4 + 11
            int r7 = r4 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r7
            int r4 = r4 % 2
            if (r4 == 0) goto L34
            r7 = 33
            int r7 = r7 / r1
        L34:
            return r5
        L35:
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L63 java.io.FileNotFoundException -> L7d
            r1.load(r3)     // Catch: java.lang.Throwable -> L61 java.io.FileNotFoundException -> L7e
            java.lang.String r4 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch: java.lang.Throwable -> L61 java.io.FileNotFoundException -> L7e
            java.lang.String r7 = r1.getProperty(r7)     // Catch: java.lang.Throwable -> L61 java.io.FileNotFoundException -> L7e
            r3.close()     // Catch: java.lang.Throwable -> L58
            return r7
        L58:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
            return r7
        L61:
            r7 = move-exception
            goto L65
        L63:
            r7 = move-exception
            r3 = r5
        L65:
            java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Throwable -> L7b
            com.appsflyer.AFLogger.afErrorLog(r0, r7)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L94
        L6e:
            r3.close()     // Catch: java.lang.Throwable -> L72
            goto L94
        L72:
            r7 = move-exception
            java.lang.String r0 = r7.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r7)
            goto L94
        L7b:
            r7 = move-exception
            goto L95
        L7d:
            r3 = r5
        L7e:
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7b
            r1.append(r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            com.appsflyer.AFLogger.afDebugLog(r7)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L94
            goto L6e
        L94:
            return r5
        L95:
            if (r3 != 0) goto La0
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r0 = r0 + 69
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r0
            goto Lac
        La0:
            r3.close()     // Catch: java.lang.Throwable -> La4
            goto Lac
        La4:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
        Lac:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.component2(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i11 = unregisterClient + 93;
        f9525i = i11 % 128;
        if (i11 % 2 == 0) {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(aFg1tSDK.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
        map.getClass();
        map.put("is_pc", Boolean.valueOf(aFg1tSDK.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        unregisterClient = (f9525i + 33) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object component4(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            com.appsflyer.internal.AFg1tSDK r1 = (com.appsflyer.internal.AFg1tSDK) r1
            r2 = 1
            r6 = r6[r2]
            java.util.Map r6 = (java.util.Map) r6
            r6.getClass()
            com.appsflyer.AppsFlyerProperties r1 = r1.getRevenue()
            java.lang.String r3 = "sdkExtension"
            java.lang.String r1 = r1.getString(r3)
            if (r1 == 0) goto L41
            int r4 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r4 = r4 + 43
            int r5 = r4 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L2f
            int r4 = r1.length()
            r5 = 14
            int r5 = r5 / r0
            if (r4 != 0) goto L36
            goto L41
        L2f:
            int r0 = r1.length()
            if (r0 != 0) goto L36
            goto L41
        L36:
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r0 = r0 + 99
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r0
            r6.put(r3, r1)
        L41:
            int r6 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r6 = r6 + r2
            int r0 = r6 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r0
            int r6 = r6 % 2
            r0 = 0
            if (r6 == 0) goto L4e
            return r0
        L4e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.component4(java.lang.Object[]):java.lang.Object");
    }

    private static List<AFe1lSDK> copy() {
        f9525i = (unregisterClient + 115) % 128;
        List<AFe1lSDK> listH = d0.h(AFe1lSDK.CONVERSION, AFe1lSDK.LAUNCH, AFe1lSDK.INAPP, AFe1lSDK.MANUAL_PURCHASE_VALIDATION, AFe1lSDK.ARS_VALIDATE, AFe1lSDK.PURCHASE_VALIDATE, AFe1lSDK.ADREVENUE);
        int i11 = f9525i + 19;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            return listH;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void copydefault(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r3 = "AppsFlyerTimePassedSincePrevLaunch"
            if (r0 != 0) goto L29
            r9.getClass()
            com.appsflyer.internal.AFc1jSDK r0 = r8.areAllFieldsValid
            long r0 = r0.getMediationNetwork(r3, r1)
            long r4 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFc1jSDK r2 = r8.areAllFieldsValid
            r2.getRevenue(r3, r4)
            r2 = 1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L56
            goto L41
        L29:
            r9.getClass()
            com.appsflyer.internal.AFc1jSDK r0 = r8.areAllFieldsValid
            long r4 = r0.getMediationNetwork(r3, r1)
            long r6 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFc1jSDK r0 = r8.areAllFieldsValid
            r0.getRevenue(r3, r6)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L56
            r0 = r4
            r4 = r6
        L41:
            int r2 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r2 = r2 + 1
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r3
            int r2 = r2 % 2
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 != 0) goto L52
            long r0 = r0 ^ r4
            long r0 = r0 / r6
            goto L58
        L52:
            long r4 = r4 - r0
            long r0 = r4 / r6
            goto L58
        L56:
            r0 = -1
        L58:
            java.lang.String r2 = "timepassedsincelastlaunch"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.put(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.copydefault(java.util.Map):void");
    }

    private static void d(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{map}, -1939346047, 1939346058, (int) System.currentTimeMillis());
    }

    private void e(@NotNull Map<String, Object> map) {
        unregisterClient = (f9525i + 19) % 128;
        map.getClass();
        boolean revenue = AFf1bSDK.getRevenue(this.AFAdRevenueData);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + revenue);
        if (!revenue) {
            int i11 = f9525i + 29;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFf1bSDK.getMonetizationNetwork(this.areAllFieldsValid)));
        int i12 = f9525i + 81;
        unregisterClient = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 71 / 0;
        }
    }

    @Nullable
    private String equals() {
        unregisterClient = (f9525i + 9) % 128;
        String string = getRevenue().getString("preInstallName");
        if (string != null) {
            return string;
        }
        String revenue = this.areAllFieldsValid.getRevenue("preInstallName", (String) null);
        if (revenue != null) {
            f9525i = (unregisterClient + 43) % 128;
            getRevenue().set("preInstallName", revenue);
            f9525i = (unregisterClient + 21) % 128;
            return revenue;
        }
        String strAFKeystoreWrapper = AFKeystoreWrapper();
        if (strAFKeystoreWrapper == null) {
            strAFKeystoreWrapper = getMediationNetwork("AF_PRE_INSTALL_NAME");
        }
        if (strAFKeystoreWrapper != null) {
            this.areAllFieldsValid.getMediationNetwork("preInstallName", strAFKeystoreWrapper);
            getRevenue().set("preInstallName", strAFKeystoreWrapper);
        }
        return strAFKeystoreWrapper;
    }

    private void force(@NotNull Map<String, Object> map) {
        String currencyIso4217Code;
        map.getClass();
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            f9525i = (unregisterClient + 105) % 128;
            try {
                this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                currencyIso4217Code = this.component3.getCurrencyIso4217Code(this.AFAdRevenueData);
                unregisterClient = (f9525i + 113) % 128;
            } catch (Throwable unused) {
                currencyIso4217Code = null;
            }
            if (currencyIso4217Code != null) {
                int i11 = f9525i + 99;
                unregisterClient = i11 % 128;
                if (i11 % 2 == 0) {
                    map.put("fb", currencyIso4217Code);
                } else {
                    map.put("fb", currencyIso4217Code);
                    throw null;
                }
            }
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ((~(i11 | i12 | i13)) * (-301)) + (i12 * 302) + (i11 * (-300));
        int i15 = ~i12;
        switch ((((~((~i11) | i13)) | i15) * 301) + (((~(i15 | i13)) | (~((~i13) | i11))) * (-301)) + i14) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                Map map = (Map) objArr[0];
                AFh1sSDK aFh1sSDK = (AFh1sSDK) objArr[1];
                map.getClass();
                aFh1sSDK.getClass();
                String str = aFh1sSDK.areAllFieldsValid;
                if (str != null) {
                    map.put("eventName", str);
                    Map map2 = aFh1sSDK.getMediationNetwork;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    map.put("eventValue", new JSONObject(map2).toString());
                }
                return null;
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
                Map map3 = (Map) objArr[1];
                f9525i = (unregisterClient + 33) % 128;
                map3.getClass();
                String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(aFg1tSDK.component3.getCurrencyIso4217Code);
                if (currencyIso4217Code != null) {
                    map3.put("uid", currencyIso4217Code);
                    if (aFg1tSDK.component3.getCurrencyIso4217Code.getRevenue("CUSTOM_INSTALL_ID_APPLIED")) {
                        map3.put("custom_install_id", Boolean.TRUE);
                        unregisterClient = (f9525i + 9) % 128;
                    }
                }
                return null;
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                return getRevenue(objArr);
            case 7:
                return areAllFieldsValid(objArr);
            case 8:
                return component2(objArr);
            case 9:
                return component4(objArr);
            case 10:
                AFg1tSDK aFg1tSDK2 = (AFg1tSDK) objArr[0];
                Map map4 = (Map) objArr[1];
                String str2 = (String) objArr[2];
                map4.getClass();
                if (str2 != null && str2.length() != 0) {
                    unregisterClient = (f9525i + 95) % 128;
                    map4.put("referrer", str2);
                }
                String revenue = aFg1tSDK2.areAllFieldsValid.getRevenue("extraReferrers", (String) null);
                if (revenue != null) {
                    map4.put("extraReferrers", revenue);
                }
                String referrer = aFg1tSDK2.getRevenue().getReferrer(aFg1tSDK2.areAllFieldsValid);
                if (referrer != null && referrer.length() != 0 && map4.get("referrer") == null) {
                    map4.put("referrer", referrer);
                }
                unregisterClient = (f9525i + 43) % 128;
                return null;
            case 11:
                return component1(objArr);
            case 12:
                return component3(objArr);
            default:
                return AFAdRevenueData(objArr);
        }
    }

    private final void getRevenue(Map<String, Object> map, int i11) {
        unregisterClient = (f9525i + 71) % 128;
        try {
            if (this.component3.n_().versionCode > this.areAllFieldsValid.getCurrencyIso4217Code("versionCode", 0)) {
                this.areAllFieldsValid.AFAdRevenueData("versionCode", this.component3.n_().versionCode);
                f9525i = (unregisterClient + 63) % 128;
            }
            map.put("app_version_code", String.valueOf(this.component3.n_().versionCode));
            map.put("app_version_name", this.component3.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component3.getRevenue.getCurrencyIso4217Code.getApplicationInfo().targetSdkVersion));
            map.put("date1", ((SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this))).format(new Date(getMediationNetwork().longValue())));
            map.put("date2", ((SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this))).format(new Date(this.component3.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a("맜㰣䟶抶⊃瘜던몔ꃴ説둻䚈䠷虙\uf39b×", KeyEvent.keyCodeFromString("") + 15, objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this));
            simpleDateFormat.getClass();
            map.put(strIntern, AFAdRevenueData(simpleDateFormat, i11));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i11 = unregisterClient + 9;
        f9525i = i11 % 128;
        int i12 = i11 % 2;
        Context context = this.AFAdRevenueData;
        if (i12 == 0) {
            throw null;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i13 = unregisterClient + 115;
            f9525i = i13 % 128;
            if (i13 % 2 != 0 ? uiModeManager.getCurrentModeType() == 4 : uiModeManager.getCurrentModeType() == 2) {
                map.put("tv", Boolean.TRUE);
            }
        }
        int i14 = unregisterClient + 29;
        f9525i = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 98 / 0;
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        map.getClass();
        AFb1mSDK aFb1mSDKL_ = AFb1jSDK.l_(this.AFAdRevenueData.getContentResolver());
        if (aFb1mSDKL_ != null) {
            unregisterClient = (f9525i + 83) % 128;
            map.put("amazon_aid", aFb1mSDKL_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(aFb1mSDKL_.getMonetizationNetwork));
            unregisterClient = (f9525i + 71) % 128;
        }
    }

    private final boolean registerClient() {
        f9525i = (unregisterClient + 107) % 128;
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        f9525i = (unregisterClient + 69) % 128;
        if (getRevenue().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1tSDK.getMediationNetwork();
        return !AFa1tSDK.getRevenue(this.AFAdRevenueData);
    }

    private final void toString(Map<String, Object> map) {
        int i11 = f9525i + 13;
        unregisterClient = i11 % 128;
        int i12 = i11 % 2;
        Context context = this.AFAdRevenueData;
        if (i12 != 0) {
            AFg1pSDK.getCurrencyIso4217Code(context);
            throw null;
        }
        if (AFg1pSDK.getCurrencyIso4217Code(context)) {
            map.put("inst_app", Boolean.TRUE);
        }
        int i13 = f9525i + 1;
        unregisterClient = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        unregisterClient = (f9525i + 3) % 128;
        map.getClass();
        map.put("af_preinstalled", String.valueOf(this.component3.getMonetizationNetwork(this.AFAdRevenueData)));
        unregisterClient = (f9525i + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
    }

    private void w(@NotNull Map<String, Object> map) {
        map.getClass();
        if (this.areAllFieldsValid.getMonetizationNetwork("is_stop_tracking_used")) {
            int i11 = unregisterClient + 19;
            f9525i = i11 % 128;
            int i12 = i11 % 2;
            AFc1jSDK aFc1jSDK = this.areAllFieldsValid;
            if (i12 == 0) {
                map.put("istu", String.valueOf(aFc1jSDK.getRevenue("is_stop_tracking_used")));
                int i13 = 47 / 0;
            } else {
                map.put("istu", String.valueOf(aFc1jSDK.getRevenue("is_stop_tracking_used")));
            }
        }
        unregisterClient = (f9525i + 15) % 128;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(@NotNull AFh1sSDK aFh1sSDK) {
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        if (aFh1sSDK.AFAdRevenueData()) {
            unregisterClient = (f9525i + 111) % 128;
            String str = aFh1sSDK.component2;
            AFc1gSDK aFc1gSDK = this.equals;
            getMonetizationNetwork(aFh1sSDK, str, aFc1gSDK.AFAdRevenueData, aFc1gSDK.getMediationNetwork);
        } else if (!(aFh1sSDK instanceof AFh1iSDK)) {
            unregisterClient = (f9525i + 53) % 128;
            map.getClass();
            String str2 = aFh1sSDK.areAllFieldsValid;
            str2.getClass();
            getRevenue(map, str2);
        }
        AFe1lSDK aFe1lSDK = AFe1lSDK.CONVERSION;
        AFe1lSDK aFe1lSDK2 = AFe1lSDK.LAUNCH;
        if (d0.h(aFe1lSDK, aFe1lSDK2, AFe1lSDK.INAPP).contains(aFh1sSDK.getRevenue())) {
            int i11 = unregisterClient + 37;
            f9525i = i11 % 128;
            if (i11 % 2 == 0) {
                map.getClass();
                getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
                int i12 = 5 / 0;
            } else {
                map.getClass();
                getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
            }
        }
        if (d0.h(aFe1lSDK, aFe1lSDK2, AFe1lSDK.ATTR).contains(aFh1sSDK.getRevenue())) {
            unregisterClient = (f9525i + 43) % 128;
            map.getClass();
            copy(map);
        }
        map.getClass();
        afInfoLog(map);
        getCurrencyIso4217Code(new Object[]{map}, -1435534787, 1435534790, (int) System.currentTimeMillis());
        AFKeystoreWrapper(map);
        getCurrencyIso4217Code(new Object[]{this, map}, 381318277, -381318268, System.identityHashCode(this));
        getCurrencyIso4217Code(new Object[]{this, map}, -140518467, 140518471, System.identityHashCode(this));
        getMediationNetwork(map, aFh1sSDK.AFAdRevenueData());
        e(map);
        w(map);
        getCurrencyIso4217Code(new Object[]{map, aFh1sSDK}, 840096267, -840096265, (int) System.currentTimeMillis());
        map.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(@NotNull AFh1sSDK aFh1sSDK) {
        f9525i = (unregisterClient + 43) % 128;
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        map.getClass();
        getRevenue(map, aFh1sSDK.AFAdRevenueData());
        component1(map);
        getCurrencyIso4217Code(new Object[]{map}, -1939346047, 1939346058, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(map);
        AFAdRevenueData(map, this.equals.getCurrencyIso4217Code);
        i(map);
        map.put("cell", x0.e(new Pair("mcc", Integer.valueOf(this.AFAdRevenueData.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFAdRevenueData.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", areAllFieldsValid());
        int i11 = unregisterClient + 33;
        f9525i = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private final void copy(Map<String, Object> map) {
        int i11 = f9525i + 93;
        int i12 = i11 % 128;
        unregisterClient = i12;
        int i13 = i11 % 2;
        AFc1gSDK aFc1gSDK = this.equals;
        if (i13 == 0) {
            String str = aFc1gSDK.hashCode;
            if (str != null) {
                int i14 = i12 + 15;
                f9525i = i14 % 128;
                if (i14 % 2 != 0) {
                    map.put("net_token", str);
                    return;
                } else {
                    map.put("net_token", str);
                    throw null;
                }
            }
            return;
        }
        String str2 = aFc1gSDK.hashCode;
        throw null;
    }

    private static void registerClient(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{map}, -1435534787, 1435534790, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        int i11 = unregisterClient + 81;
        f9525i = i11 % 128;
        int i12 = i11 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1tSDK.AFInAppEventParameterName.getValue();
        if (i12 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        if (!getRevenue().isOtherSdkStringDisabled()) {
            int i11 = f9525i + 85;
            unregisterClient = i11 % 128;
            int i12 = i11 % 2;
            AFg1ySDK aFg1ySDK = this.getRevenue;
            if (i12 != 0) {
                map.put("batteryLevel", String.valueOf(aFg1ySDK.getMonetizationNetwork(this.AFAdRevenueData).getMonetizationNetwork));
                int i13 = 33 / 0;
            } else {
                map.put("batteryLevel", String.valueOf(aFg1ySDK.getMonetizationNetwork(this.AFAdRevenueData).getMonetizationNetwork));
            }
        }
        unregisterClient = (f9525i + 45) % 128;
    }

    @Nullable
    private String component4() {
        int i11 = f9525i + 37;
        unregisterClient = i11 % 128;
        int i12 = i11 % 2;
        AFc1jSDK aFc1jSDK = this.areAllFieldsValid;
        if (i12 == 0) {
            String revenue = aFc1jSDK.getRevenue("INSTALL_STORE", (String) null);
            if (revenue != null) {
                unregisterClient = (f9525i + 93) % 128;
                return revenue;
            }
            String strComponent2 = component2();
            if (strComponent2 != null) {
                this.areAllFieldsValid.getMediationNetwork("INSTALL_STORE", strComponent2);
            }
            return strComponent2;
        }
        aFc1jSDK.getRevenue("INSTALL_STORE", (String) null);
        throw null;
    }

    private void equals(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -2036410656, 2036410668, System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r0 r1
      0x003f: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v11 java.lang.String) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void component3(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r1
            int r0 = r0 % 2
            java.lang.String r1 = "onelinkVersion"
            java.lang.String r2 = "oneLinkSlug"
            if (r0 == 0) goto L2a
            r4.getClass()
            com.appsflyer.AppsFlyerProperties r0 = r3.getRevenue()
            java.lang.String r0 = r0.getString(r2)
            com.appsflyer.AppsFlyerProperties r2 = r3.getRevenue()
            java.lang.String r1 = r2.getString(r1)
            r2 = 79
            int r2 = r2 / 0
            if (r0 == 0) goto L4c
            goto L3f
        L2a:
            r4.getClass()
            com.appsflyer.AppsFlyerProperties r0 = r3.getRevenue()
            java.lang.String r0 = r0.getString(r2)
            com.appsflyer.AppsFlyerProperties r2 = r3.getRevenue()
            java.lang.String r1 = r2.getString(r1)
            if (r0 == 0) goto L4c
        L3f:
            java.lang.String r2 = "onelink_id"
            r4.put(r2, r0)
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r0 = r0 + 119
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r0
        L4c:
            if (r1 == 0) goto L53
            java.lang.String r0 = "onelink_ver"
            r4.put(r0, r1)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.component3(java.util.Map):void");
    }

    private final void component4(Map<String, Object> map) {
        AFg1ySDK.AFa1tSDK monetizationNetwork = this.getRevenue.getMonetizationNetwork(this.AFAdRevenueData);
        float f11 = monetizationNetwork.getMonetizationNetwork;
        String str = monetizationNetwork.AFAdRevenueData;
        map.put("btl", String.valueOf(f11));
        if (str != null) {
            f9525i = (unregisterClient + 1) % 128;
            map.put("btch", str);
        }
        int i11 = f9525i + 91;
        unregisterClient = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private boolean component3() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, 1014234818, -1014234818, System.identityHashCode(this))).booleanValue();
    }

    @SuppressLint({"HardwareIds"})
    private final String copydefault() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1753918154, 1753918160, System.identityHashCode(this));
    }

    private static void component1(@NotNull Map<String, Object> map) {
        unregisterClient = (f9525i + 41) % 128;
        map.getClass();
        Object[] objArr = new Object[1];
        a("\uf08a兙黴ꥱ蟩䓗", Color.blue(0) + 5, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        unregisterClient = (f9525i + 85) % 128;
    }

    private static long component1() {
        int i11 = f9525i + 39;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
        return SystemClock.elapsedRealtime() + System.currentTimeMillis();
    }

    @Nullable
    private String AFAdRevenueData() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        int i11 = unregisterClient + 75;
        f9525i = i11 % 128;
        int i12 = i11 % 2;
        Context context = this.AFAdRevenueData;
        if (i12 == 0) {
            AFj1pSDK.N_(context.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
            throw null;
        }
        String strN_ = AFj1pSDK.N_(context.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        int i13 = unregisterClient + 3;
        f9525i = i13 % 128;
        if (i13 % 2 != 0) {
            return strN_;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(@NotNull AFh1sSDK aFh1sSDK) {
        f9525i = (unregisterClient + 1) % 128;
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        map.getClass();
        map.put("open_referrer", aFh1sSDK.getMonetizationNetwork);
        String str = aFh1sSDK.equals;
        if (str != null) {
            int i11 = f9525i + 109;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 49 / 0;
                if (StringsKt.H(str)) {
                    return;
                }
            } else if (StringsKt.H(str)) {
                return;
            }
            f9525i = (unregisterClient + 117) % 128;
            map.put("af_web_referrer", aFh1sSDK.equals);
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        try {
            long jLongValue = getMediationNetwork().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i11 = f9525i + 95;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Exception e5) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            com.appsflyer.internal.AFg1tSDK r1 = (com.appsflyer.internal.AFg1tSDK) r1
            r2 = 1
            r3 = r8[r2]
            java.util.Map r3 = (java.util.Map) r3
            r4 = 2
            r5 = r8[r4]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 3
            r8 = r8[r6]
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r6 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r6 = r6 + 9
            int r7 = r6 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r7
            int r6 = r6 % r4
            java.lang.String r4 = "iaecounter"
            java.lang.String r7 = "counter"
            if (r6 == 0) goto L46
            r3.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.put(r7, r5)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.put(r4, r8)
            boolean r8 = r1.component3()
            r1 = 12
            int r1 = r1 / r0
            if (r8 != 0) goto L5f
            goto L5d
        L46:
            r3.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.put(r7, r5)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.put(r4, r8)
            boolean r8 = r1.component3()
            if (r8 != 0) goto L5f
        L5d:
            r0 = r2
            goto L67
        L5f:
            int r8 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r8 = r8 + 109
            int r8 = r8 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r8
        L67:
            java.lang.String r8 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "isFirstCall"
            r3.put(r0, r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFAdRevenueData(@org.jetbrains.annotations.NotNull java.text.SimpleDateFormat r8, int r9) {
        /*
            r7 = this;
            int r0 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "appsFlyerFirstInstall"
            if (r0 != 0) goto L1f
            r8.getClass()
            com.appsflyer.internal.AFc1jSDK r0 = r7.areAllFieldsValid
            java.lang.String r0 = r0.getRevenue(r2, r1)
            r1 = 94
            int r1 = r1 / 0
            if (r0 != 0) goto L4d
            goto L2a
        L1f:
            r8.getClass()
            com.appsflyer.internal.AFc1jSDK r0 = r7.areAllFieldsValid
            java.lang.String r0 = r0.getRevenue(r2, r1)
            if (r0 != 0) goto L4d
        L2a:
            r0 = 1
            if (r9 > r0) goto L3d
            java.lang.String r9 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r9)
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            java.lang.String r8 = r8.format(r9)
        L3b:
            r0 = r8
            goto L48
        L3d:
            int r8 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r8 = r8 + 109
            int r8 = r8 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r8
            java.lang.String r8 = ""
            goto L3b
        L48:
            com.appsflyer.internal.AFc1jSDK r8 = r7.areAllFieldsValid
            r8.getMediationNetwork(r2, r0)
        L4d:
            com.appsflyer.AFLogger r1 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r2 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r8 = "AppsFlyer: first launch date: "
            java.lang.String r3 = e0.f.k(r8, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            com.appsflyer.internal.AFg1hSDK.i$default(r1, r2, r3, r4, r5, r6)
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.AFAdRevenueData(java.text.SimpleDateFormat, int):java.lang.String");
    }

    @Nullable
    private String component2() {
        int i11 = unregisterClient + 63;
        f9525i = i11 % 128;
        if (i11 % 2 == 0) {
            String string = getRevenue().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i12 = 42 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = getRevenue().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        String mediationNetwork = getMediationNetwork("AF_STORE");
        unregisterClient = (f9525i + 73) % 128;
        return mediationNetwork;
    }

    private void component2(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        AFh1uSDK aFh1uSDK = this.component2;
        HashMap map2 = new HashMap(aFh1uSDK.getRevenue);
        aFh1uSDK.getRevenue.clear();
        aFh1uSDK.AFAdRevenueData.getCurrencyIso4217Code("gcd");
        if (!map2.isEmpty()) {
            int i11 = unregisterClient + 65;
            f9525i = i11 % 128;
            if (i11 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(map);
                monetizationNetwork.getClass();
                monetizationNetwork.put("gcd", map2);
            }
        }
        int i12 = f9525i + 3;
        unregisterClient = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private void getMonetizationNetwork(@NotNull AFh1sSDK aFh1sSDK, @Nullable String str, @Nullable String str2, @Nullable AFb1qSDK aFb1qSDK) {
        int i11 = unregisterClient + 117;
        f9525i = i11 % 128;
        if (i11 % 2 != 0) {
            aFh1sSDK.getClass();
            Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
            if (aFh1sSDK.getRevenue() == AFe1lSDK.CONVERSION) {
                map.getClass();
                areAllFieldsValid(map);
                hashCode(map);
                toString(map);
                AFa1zSDK.getCurrencyIso4217Code(this.hashCode, this.component3);
            }
            map.getClass();
            copydefault(map);
            component3(map);
            component2((Map<String, ? extends Object>) map);
            getMonetizationNetwork(map, str2);
            getCurrencyIso4217Code(new Object[]{this, map, str}, 2080605436, -2080605426, System.identityHashCode(this));
            AFInAppEventParameterName(map);
            if (aFb1qSDK != null) {
                f9525i = (unregisterClient + 15) % 128;
                aFb1qSDK.AFAdRevenueData(map);
                return;
            }
            return;
        }
        aFh1sSDK.getClass();
        Map<String, Object> map2 = aFh1sSDK.AFAdRevenueData;
        aFh1sSDK.getRevenue();
        AFe1lSDK aFe1lSDK = AFe1lSDK.RC_CDN;
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        int i11 = unregisterClient + 49;
        f9525i = i11 % 128;
        int i12 = i11 % 2;
        String revenue = aFg1tSDK.areAllFieldsValid.getRevenue("sentSuccessfully", (String) null);
        if (i12 != 0) {
            return Boolean.valueOf(Boolean.parseBoolean(revenue));
        }
        Boolean.parseBoolean(revenue);
        throw null;
    }

    private static File AFAdRevenueData(String str) {
        return (File) getCurrencyIso4217Code(new Object[]{str}, -1713193942, 1713193943, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -140518467, 140518471, System.identityHashCode(this));
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        int i11 = f9525i + 59;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            map.getClass();
            if (str != null) {
                int i12 = f9525i + 19;
                unregisterClient = i12 % 128;
                if (i12 % 2 == 0) {
                    map.put("phone", str);
                } else {
                    map.put("phone", str);
                    throw null;
                }
            }
            int i13 = unregisterClient + 57;
            f9525i = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 4 / 0;
                return;
            }
            return;
        }
        map.getClass();
        throw null;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        unregisterClient = (f9525i + 87) % 128;
        map.getClass();
        map.putAll(this.copy.getCurrencyIso4217Code());
        f9525i = (unregisterClient + 49) % 128;
    }

    private static String getMonetizationNetwork(AFc1jSDK aFc1jSDK, String str) {
        unregisterClient = (f9525i + 113) % 128;
        String revenue = aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
        if (revenue != null) {
            unregisterClient = (f9525i + 71) % 128;
            return revenue;
        }
        aFc1jSDK.getMediationNetwork("CACHED_CHANNEL", str);
        return str;
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull AFh1sSDK aFh1sSDK) {
        getCurrencyIso4217Code(new Object[]{map, aFh1sSDK}, 840096267, -840096265, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map, int i11, int i12) {
        getCurrencyIso4217Code(new Object[]{this, map, Integer.valueOf(i11), Integer.valueOf(i12)}, -2094417187, 2094417192, i11);
    }

    private final SimpleDateFormat getMonetizationNetwork() {
        return (SimpleDateFormat) getCurrencyIso4217Code(new Object[]{this}, 1763970142, -1763970135, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(@NotNull Map<String, Object> map) {
        String[] strArr;
        map.getClass();
        String string = getRevenue().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            int i11 = unregisterClient + 53;
            f9525i = i11 % 128;
            if (i11 % 2 == 0) {
                map.put(AppsFlyerProperties.APP_ID, string);
                int i12 = 8 / 0;
            } else {
                map.put(AppsFlyerProperties.APP_ID, string);
            }
        }
        String string2 = getRevenue().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                AFLogger.afWarnLog(sb2.toString());
            }
            map.put("currency", string2);
        }
        String string3 = getRevenue().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        String string4 = getRevenue().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = getRevenue().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            f9525i = (unregisterClient + 27) % 128;
            map.put("appUserId", string5);
        }
        String string6 = getRevenue().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        } else {
            unregisterClient = (f9525i + 111) % 128;
        }
        AFb1uSDK aFb1uSDK = this.equals.getMonetizationNetwork;
        if (aFb1uSDK == null || (strArr = aFb1uSDK.getRevenue) == null) {
            return;
        }
        map.put("sharing_filter", strArr);
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        Object pVar;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        int i11;
        Object obj;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        map.getClass();
        String str2 = this.equals.getRevenue;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                int i12 = f9525i + 101;
                unregisterClient = i12 % 128;
                if (i12 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    o oVar = q.f40850b;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    pVar = Unit.f26487a;
                    f9525i = (unregisterClient + 71) % 128;
                } catch (Throwable th2) {
                    o oVar2 = q.f40850b;
                    pVar = new p(th2);
                }
                Throwable thA = q.a(pVar);
                if (thA != null) {
                    int i13 = f9525i + 65;
                    unregisterClient = i13 % 128;
                    if (i13 % 2 != 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.GENERAL;
                        i11 = 36;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.GENERAL;
                        i11 = 120;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                    AFg1hSDK.e$default(aFLogger, aFg1cSDK, str, thA, z11, z12, z13, false, i11, obj);
                }
            }
        }
        this.equals.getRevenue = null;
        int i14 = f9525i + 19;
        unregisterClient = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(@NotNull Map<String, Object> map, @NotNull AFe1lSDK aFe1lSDK) {
        map.getClass();
        aFe1lSDK.getClass();
        if (copy().contains(aFe1lSDK)) {
            if (this.equals.getMonetizationNetwork()) {
                f9525i = (unregisterClient + 49) % 128;
                map.put("app_set_id", w0.b(new Pair("app_set_id_disabled", Boolean.TRUE)));
                if (this.equals.equals != null) {
                    AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                    return;
                }
                AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                int i11 = f9525i + 15;
                unregisterClient = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
            AFb1gSDK aFb1gSDK = this.equals.equals;
            if (aFb1gSDK != null) {
                unregisterClient = (f9525i + 111) % 128;
                map.put("app_set_id", x0.e(new Pair("scope", Integer.valueOf(aFb1gSDK.getCurrencyIso4217Code)), new Pair("id", aFb1gSDK.AFAdRevenueData)));
            }
        }
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, boolean z11) {
        map.getClass();
        map.put("platformextension", this.getMonetizationNetwork);
        if (z11) {
            int i11 = f9525i + 75;
            unregisterClient = i11 % 128;
            int i12 = i11 % 2;
            AFi1lSDK aFi1lSDK = this.getMediationNetwork;
            if (i12 == 0) {
                map.put("platform_extension_v2", aFi1lSDK.getRevenue());
            } else {
                map.put("platform_extension_v2", aFi1lSDK.getRevenue());
                throw null;
            }
        }
        int i13 = unregisterClient + 93;
        f9525i = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 23 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        AFi1wSDK aFi1wSDKAFAdRevenueData;
        map.getClass();
        AFi1pSDK aFi1pSDK = this.component4.getRevenue;
        if (aFi1pSDK != null) {
            f9525i = (unregisterClient + 29) % 128;
            aFi1wSDKAFAdRevenueData = aFi1pSDK.AFAdRevenueData();
        } else {
            aFi1wSDKAFAdRevenueData = null;
        }
        if (aFi1wSDKAFAdRevenueData != null) {
            unregisterClient = (f9525i + 121) % 128;
            map.put("network", aFi1wSDKAFAdRevenueData.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(aFi1wSDKAFAdRevenueData.getRevenue()));
            if (getRevenue().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i11 = unregisterClient + 47;
            f9525i = i11 % 128;
            int i12 = i11 % 2;
            String str = aFi1wSDKAFAdRevenueData.getCurrencyIso4217Code;
            if (i12 != 0) {
                if (str != null) {
                    map.put("operator", str);
                    unregisterClient = (f9525i + 61) % 128;
                }
                String str2 = aFi1wSDKAFAdRevenueData.getMonetizationNetwork;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @NotNull
    private Long getMediationNetwork() {
        int i11 = unregisterClient + 73;
        f9525i = i11 % 128;
        int i12 = i11 % 2;
        AFc1kSDK aFc1kSDK = this.component3;
        if (i12 != 0) {
            return Long.valueOf(aFc1kSDK.n_().firstInstallTime);
        }
        long j9 = aFc1kSDK.n_().firstInstallTime;
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        f9525i = (unregisterClient + 9) % 128;
        map.getClass();
        String revenue = AFa1zSDK.getRevenue();
        String currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
        if (revenue != null) {
            int i11 = f9525i;
            int i12 = i11 + 101;
            unregisterClient = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (currencyIso4217Code != null) {
                int i13 = i11 + 101;
                unregisterClient = i13 % 128;
                if (i13 % 2 == 0) {
                    if (Integer.parseInt(currencyIso4217Code) > 0) {
                        map.put("reinstallCounter", currencyIso4217Code);
                        map.put("originalAppsflyerId", revenue);
                    }
                } else {
                    Integer.parseInt(currencyIso4217Code);
                    throw null;
                }
            }
        }
        return null;
    }

    private void getRevenue(@NotNull Map<String, Object> map, boolean z11) {
        map.getClass();
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getRevenue("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getRevenue("ro.product.cpu.abi2"));
        map2.put("arch", getRevenue("os.arch"));
        map2.put("build_display_id", getRevenue("ro.build.display.id"));
        if (z11) {
            f9525i = (unregisterClient + 125) % 128;
            component4(map2);
            if (this.component3.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= 2) {
                int i11 = unregisterClient + 111;
                f9525i = i11 % 128;
                int i12 = i11 % 2;
                AFj1oSDK aFj1oSDK = this.getCurrencyIso4217Code;
                if (i12 == 0) {
                    map2.putAll(aFj1oSDK.AFAdRevenueData());
                    int i13 = 75 / 0;
                } else {
                    map2.putAll(aFj1oSDK.AFAdRevenueData());
                }
                f9525i = (unregisterClient + 15) % 128;
            }
        }
        map2.put("dim", this.component1.getMonetizationNetwork(this.AFAdRevenueData));
        map.put("deviceData", map2);
        int i14 = f9525i + 83;
        unregisterClient = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    private final String getMediationNetwork(String str) {
        unregisterClient = (f9525i + 53) % 128;
        String monetizationNetwork = this.component3.getMonetizationNetwork(str);
        f9525i = (unregisterClient + 33) % 128;
        return monetizationNetwork;
    }

    private static String getMediationNetwork(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, 1094427933, -1094427925, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1sSDK aFh1sSDK) {
        unregisterClient = (f9525i + 69) % 128;
        aFh1sSDK.getClass();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        map.getClass();
        getMonetizationNetwork(map);
        Map<String, Object> map2 = aFh1sSDK.AFAdRevenueData;
        map2.getClass();
        getRevenue(map2, aFh1sSDK.component1);
        Map<String, Object> map3 = aFh1sSDK.AFAdRevenueData;
        map3.getClass();
        AFLogger(map3);
        Map<String, Object> map4 = aFh1sSDK.AFAdRevenueData;
        map4.getClass();
        unregisterClient(map4);
        Map<String, Object> map5 = aFh1sSDK.AFAdRevenueData;
        map5.getClass();
        force(map5);
        Map<String, Object> map6 = aFh1sSDK.AFAdRevenueData;
        map6.getClass();
        AFe1lSDK revenue = aFh1sSDK.getRevenue();
        revenue.getClass();
        getRevenue(map6, revenue);
        int i11 = f9525i + 15;
        unregisterClient = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private final AppsFlyerProperties getRevenue() {
        f9525i = (unregisterClient + 63) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.copydefault.getValue();
        f9525i = (unregisterClient + 13) % 128;
        return appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(@NotNull AFh1sSDK aFh1sSDK) {
        aFh1sSDK.getClass();
        if (!this.component3.getMediationNetwork()) {
            int i11 = f9525i + 121;
            unregisterClient = i11 % 128;
            if (i11 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                monetizationNetwork.getClass();
                monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                int i12 = 49 / 0;
            } else {
                Map<String, Object> monetizationNetwork2 = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                monetizationNetwork2.getClass();
                monetizationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            }
        } else {
            AFh1rSDK aFh1rSDK = this.component3.getMediationNetwork.component2;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.getCurrencyIso4217Code;
            if (str != null && str.length() != 0) {
                aFh1sSDK.getMonetizationNetwork("gaidError", aFh1rSDK.getCurrencyIso4217Code);
            } else {
                f9525i = (unregisterClient + 59) % 128;
            }
            String str2 = aFh1rSDK.AFAdRevenueData;
            if (str2 != null && aFh1rSDK.getMediationNetwork != null) {
                aFh1sSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1sSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.getMediationNetwork));
                aFh1sSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getMonetizationNetwork));
            }
        }
        AFh1rSDK aFh1rSDK2 = this.component3.getMediationNetwork.component2;
        aFh1sSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1rSDK2 != null ? Intrinsics.areEqual(aFh1rSDK2.component2, Boolean.TRUE) : false));
        if (d0.h(AFe1lSDK.CONVERSION, AFe1lSDK.LAUNCH).contains(aFh1sSDK.getRevenue())) {
            int i13 = unregisterClient + 17;
            f9525i = i13 % 128;
            int i14 = i13 % 2;
            AFc1gSDK aFc1gSDK = this.equals;
            if (i14 != 0) {
                AFd1dSDK aFd1dSDK = aFc1gSDK.component3;
                if (aFd1dSDK != null) {
                    Map<String, Object> monetizationNetwork3 = AFa1tSDK.getMonetizationNetwork(aFh1sSDK.AFAdRevenueData);
                    monetizationNetwork3.getClass();
                    monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1dSDK.AFAdRevenueData));
                    return;
                }
                return;
            }
            AFd1dSDK aFd1dSDK2 = aFc1gSDK.component3;
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final long getCurrencyIso4217Code() {
        int i11 = unregisterClient + 121;
        f9525i = i11 % 128;
        if (i11 % 2 != 0) {
            return System.currentTimeMillis();
        }
        int i12 = 89 / 0;
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r6.length() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r6.length() == 0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getCurrencyIso4217Code(java.lang.String r6) {
        /*
            r5 = this;
            com.appsflyer.AppsFlyerProperties r0 = r5.getRevenue()
            java.lang.String r1 = "collectAndroidId"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 0
            if (r0 == 0) goto L77
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r3 = r0 + 125
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L20
            r3 = 86
            int r3 = r3 / r2
            if (r6 == 0) goto L3c
            goto L22
        L20:
            if (r6 == 0) goto L3c
        L22:
            int r0 = r0 + 51
            int r3 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L36
            int r0 = r6.length()
            r3 = 56
            int r3 = r3 / r2
            if (r0 != 0) goto L77
            goto L3c
        L36:
            int r0 = r6.length()
            if (r0 != 0) goto L77
        L3c:
            int r6 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r6 = r6 + 121
            int r0 = r6 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L53
            boolean r6 = r5.registerClient()
            r0 = 96
            int r0 = r0 / r2
            if (r6 == 0) goto L52
            goto L59
        L52:
            return r1
        L53:
            boolean r6 = r5.registerClient()
            if (r6 == 0) goto L76
        L59:
            java.lang.Object[] r6 = new java.lang.Object[]{r5}
            int r0 = java.lang.System.identityHashCode(r5)
            r1 = -1753918154(0xffffffff97755536, float:-7.927132E-25)
            r2 = 1753918160(0x688aaad0, float:5.2387E24)
            java.lang.Object r6 = getCurrencyIso4217Code(r6, r1, r2, r0)
            java.lang.String r6 = (java.lang.String) r6
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r0 = r0 + 63
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r0
            return r6
        L76:
            return r1
        L77:
            if (r6 == 0) goto L7a
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.getCurrencyIso4217Code(java.lang.String):java.lang.String");
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        int i11 = f9525i;
        int i12 = i11 + 105;
        unregisterClient = i12 % 128;
        try {
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
        if (i12 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i13 = i11 + 23;
            unregisterClient = i13 % 128;
            if (i13 % 2 == 0) {
                if (StringsKt.e0(str).toString().length() > 0) {
                    return new File(StringsKt.e0(str).toString());
                }
            } else {
                StringsKt.e0(str).toString().length();
                throw null;
            }
        }
        return null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 2080605436, -2080605426, System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: Exception -> 0x0026, PHI: r0
      0x0036: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v8 java.lang.String) binds: [B:16:0x0034, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0026, blocks: (B:5:0x0017, B:7:0x001f, B:19:0x0056, B:17:0x0036, B:15:0x002e), top: B:28:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getRevenue(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1tSDK.f9525i
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1tSDK.unregisterClient = r1
            int r0 = r0 % 2
            java.lang.String r1 = "prev_event_timestamp"
            r2 = 0
            java.lang.String r3 = "prev_event_name"
            if (r0 == 0) goto L28
            r9.getClass()
            r10.getClass()
            com.appsflyer.internal.AFc1jSDK r0 = r8.areAllFieldsValid     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = r0.getRevenue(r3, r2)     // Catch: java.lang.Exception -> L26
            r4 = 19
            int r4 = r4 / 0
            if (r0 == 0) goto L56
            goto L36
        L24:
            r9 = move-exception
            throw r9
        L26:
            r9 = move-exception
            goto L72
        L28:
            r9.getClass()
            r10.getClass()
            com.appsflyer.internal.AFc1jSDK r0 = r8.areAllFieldsValid     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = r0.getRevenue(r3, r2)     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L56
        L36:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L26
            r4.<init>()     // Catch: java.lang.Exception -> L26
            com.appsflyer.internal.AFc1jSDK r5 = r8.areAllFieldsValid     // Catch: java.lang.Exception -> L26
            r6 = -1
            long r5 = r5.getMediationNetwork(r1, r6)     // Catch: java.lang.Exception -> L26
            r4.put(r1, r5)     // Catch: java.lang.Exception -> L26
            r4.put(r3, r0)     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = "prev_event"
            r9.put(r0, r4)     // Catch: java.lang.Exception -> L26
            int r9 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r9 = r9 + 51
            int r9 = r9 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r9
        L56:
            com.appsflyer.internal.AFc1jSDK r9 = r8.areAllFieldsValid     // Catch: java.lang.Exception -> L26
            r9.getMediationNetwork(r3, r10)     // Catch: java.lang.Exception -> L26
            com.appsflyer.internal.AFc1jSDK r9 = r8.areAllFieldsValid     // Catch: java.lang.Exception -> L26
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L26
            r9.getRevenue(r1, r3)     // Catch: java.lang.Exception -> L26
            int r9 = com.appsflyer.internal.AFg1tSDK.unregisterClient
            int r9 = r9 + 15
            int r10 = r9 % 128
            com.appsflyer.internal.AFg1tSDK.f9525i = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L71
            return
        L71:
            throw r2
        L72:
            java.lang.String r10 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.getRevenue(java.util.Map, java.lang.String):void");
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        String revenue = aFg1tSDK.areAllFieldsValid.getRevenue("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(aFg1tSDK.AFAdRevenueData.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
        }
        if (revenue != null) {
            AFLogger.afDebugLog("use cached AndroidId: " + revenue);
            unregisterClient = (f9525i + 101) % 128;
            return revenue;
        }
        int i11 = unregisterClient + 125;
        f9525i = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static String getRevenue(@Nullable String str) {
        f9525i = (unregisterClient + 91) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            objInvoke.getClass();
            String str2 = (String) objInvoke;
            int i11 = unregisterClient + 31;
            f9525i = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 57 / 0;
            }
            return str2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private static boolean getRevenue(File file) {
        int i11 = unregisterClient + 113;
        f9525i = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (file != null && file.exists()) {
            return false;
        }
        f9525i = (unregisterClient + 35) % 128;
        return true;
    }
}
