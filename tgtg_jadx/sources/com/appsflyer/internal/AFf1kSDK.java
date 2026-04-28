package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1jSDK;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int toString = 1;

    @NonNull
    private final AFc1fSDK AFAdRevenueData;
    private volatile String component1;
    private volatile String getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private long getRevenue;
    private static char[] component3 = {28704, 28722, 28716, 28702, 28712, 28711, 28721, 28708, 28725};
    private static char areAllFieldsValid = 17880;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component4 = false;

    public AFf1kSDK(@NonNull AFc1fSDK aFc1fSDK) {
        this.AFAdRevenueData = aFc1fSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r12, java.lang.String r13, int r14, java.lang.Object[] r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.a(byte, java.lang.String, int, java.lang.Object[]):void");
    }

    private long component2() {
        int i11 = component2;
        long j9 = this.getRevenue;
        int i12 = i11 + 69;
        toString = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 56 / 0;
        }
        return j9;
    }

    private boolean component3() {
        int i11 = toString;
        component2 = (i11 + 119) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map == null) {
            return false;
        }
        component2 = (i11 + 83) % 128;
        if (map.isEmpty()) {
            return false;
        }
        toString = (component2 + 37) % 128;
        return true;
    }

    @NonNull
    private static AFf1jSDK component4() {
        AFf1jSDK aFf1jSDK = new AFf1jSDK();
        int i11 = toString + 43;
        component2 = i11 % 128;
        if (i11 % 2 == 0) {
            return aFf1jSDK;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            com.appsflyer.internal.AFh1sSDK r1 = (com.appsflyer.internal.AFh1sSDK) r1
            r2 = 1
            r7 = r7[r2]
            com.appsflyer.internal.AFc1kSDK r7 = (com.appsflyer.internal.AFc1kSDK) r7
            java.lang.String r3 = r7.AFAdRevenueData
            boolean r3 = com.appsflyer.internal.AFk1zSDK.getMediationNetwork(r3)
            if (r3 != 0) goto L1d
            java.lang.String r7 = r7.AFAdRevenueData
            int r3 = com.appsflyer.internal.AFf1kSDK.toString
            int r3 = r3 + 67
            int r3 = r3 % 128
            com.appsflyer.internal.AFf1kSDK.component2 = r3
            goto L3c
        L1d:
            java.lang.String r3 = "com.appsflyer.security.uuid"
            java.lang.String r3 = r7.getMonetizationNetwork(r3)
            boolean r4 = com.appsflyer.internal.AFk1zSDK.getMediationNetwork(r3)
            if (r4 == 0) goto L33
            int r7 = com.appsflyer.internal.AFf1kSDK.toString
            int r7 = r7 + 39
            int r7 = r7 % 128
            com.appsflyer.internal.AFf1kSDK.component2 = r7
            r7 = 0
            goto L3c
        L33:
            r4 = 8
            java.lang.String r3 = r3.substring(r0, r4)
            r7.AFAdRevenueData = r3
            r7 = r3
        L3c:
            if (r7 == 0) goto Lba
            int r3 = com.appsflyer.internal.AFf1kSDK.toString
            int r3 = r3 + 97
            int r3 = r3 % 128
            com.appsflyer.internal.AFf1kSDK.component2 = r3
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L4d
            goto Lba
        L4d:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.AFAdRevenueData     // Catch: java.lang.Exception -> Lad
            int r4 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch: java.lang.Exception -> Lad
            int r4 = r4 >> 16
            int r4 = 104 - r4
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> Lad
            java.lang.String r5 = "\u0002\u0003\u0005\u0006\u0005\u0001\u0001\u0004\u0006\u0002\u0000\b"
            r6 = 48
            char r6 = android.text.AndroidCharacter.getMirror(r6)     // Catch: java.lang.Exception -> Lad
            int r6 = 60 - r6
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lad
            a(r4, r5, r6, r2)     // Catch: java.lang.Exception -> Lad
            r2 = r2[r0]     // Catch: java.lang.Exception -> Lad
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lad
            java.lang.String r2 = r2.intern()     // Catch: java.lang.Exception -> Lad
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Exception -> Lad
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lad
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> Lad
            char[] r7 = r7.toCharArray()     // Catch: java.lang.Exception -> Lad
            r4 = 94
            long r2 = r2 % r4
            int r2 = (int) r2     // Catch: java.lang.Exception -> Lad
            int r2 = r2 + 33
        L85:
            int r3 = r7.length     // Catch: java.lang.Exception -> Lad
            if (r0 >= r3) goto L91
            char r3 = r7[r0]     // Catch: java.lang.Exception -> Lad
            r3 = r3 ^ r2
            char r3 = (char) r3     // Catch: java.lang.Exception -> Lad
            r7[r0] = r3     // Catch: java.lang.Exception -> Lad
            int r0 = r0 + 1
            goto L85
        L91:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Lad
            r0.<init>(r7)     // Catch: java.lang.Exception -> Lad
            java.nio.charset.Charset r7 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Exception -> Lad
            byte[] r7 = r0.getBytes(r7)     // Catch: java.lang.Exception -> Lad
            r0 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r0)     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "af-sdk-sbid"
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.getRevenue     // Catch: java.lang.Exception -> Lad
            r1.put(r0, r7)     // Catch: java.lang.Exception -> Lad
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lad
            return r7
        Lad:
            r7 = move-exception
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r2 = "Exception occurred while generating sbid "
            r0.e(r1, r2, r7)
        Lb7:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        Lba:
            int r7 = com.appsflyer.internal.AFf1kSDK.toString
            int r7 = r7 + 43
            int r7 = r7 % 128
            com.appsflyer.internal.AFf1kSDK.component2 = r7
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.getMediationNetwork(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i13;
        int i15 = ((i12 | i13) * 521) + (((~(i14 | i12)) | i11) * (-1042)) + (i12 * (-520)) + (i11 * 522);
        int i16 = ~i11;
        int i17 = (((~(i11 | i14 | i12)) | (~(i13 | i16)) | (~((~i12) | i16))) * 521) + i15;
        if (i17 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr);
        }
        AFf1kSDK aFf1kSDK = (AFf1kSDK) objArr[0];
        String str = (String) objArr[1];
        toString = (component2 + 35) % 128;
        aFf1kSDK.component1 = str;
        component2 = (toString + 3) % 128;
        return null;
    }

    public final void AFAdRevenueData(AFc1kSDK aFc1kSDK) {
        this.getRevenue = System.currentTimeMillis();
        this.getMonetizationNetwork = component4().getMediationNetwork(getMonetizationNetwork(aFc1kSDK), this.AFAdRevenueData.getCurrencyIso4217Code, new AFf1jSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFf1kSDK.3
            @Override // com.appsflyer.internal.AFf1jSDK.AFa1ySDK
            public final void getMonetizationNetwork(String str, Exception exc) {
                AFf1kSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = PaymentMethodTypes.UNKNOWN;
                }
                AFf1kSDK.this.areAllFieldsValid();
                AFf1kSDK.this.getMediationNetwork.put(StatusResponseUtils.RESULT_ERROR, message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }

            @Override // com.appsflyer.internal.AFf1jSDK.AFa1ySDK
            public final void getRevenue(@NonNull String str, @NonNull String str2) {
                AFf1kSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1kSDK.this.getMediationNetwork.put("signedData", str);
                AFf1kSDK.this.getMediationNetwork.put("signature", str2);
                AFf1kSDK.this.areAllFieldsValid();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }
        });
        component2 = (toString + 53) % 128;
    }

    public final void areAllFieldsValid() {
        int i11 = component2 + 17;
        toString = i11 % 128;
        this.getMediationNetwork.put("ttr", Long.valueOf(i11 % 2 == 0 ? System.currentTimeMillis() & this.getRevenue : System.currentTimeMillis() - this.getRevenue));
        this.getMediationNetwork.put("lvl_timestamp", Long.valueOf(component2()));
    }

    @NonNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        if (component3()) {
            component2 = (toString + 53) % 128;
            map.put("lvl", this.getMediationNetwork);
            component2 = (toString + 59) % 128;
            return map;
        }
        if (this.getMonetizationNetwork) {
            this.getMediationNetwork = new HashMap();
            areAllFieldsValid();
            this.getMediationNetwork.put(StatusResponseUtils.RESULT_ERROR, "pending LVL response");
            map.put("lvl", this.getMediationNetwork);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r2
      0x0032: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getRevenue(com.appsflyer.internal.AFc1jSDK r8) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.getRevenue(com.appsflyer.internal.AFc1jSDK):java.lang.String");
    }

    public final Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        AFc1hSDK aFc1hSDK = new AFc1hSDK(map, this.AFAdRevenueData.getCurrencyIso4217Code);
        int i11 = toString + 115;
        component2 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 33 / 0;
        }
        return aFc1hSDK;
    }

    public final String AFAdRevenueData() {
        return (String) getMonetizationNetwork(new Object[]{this}, -211782084, 211782085, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1kSDK aFf1kSDK = (AFf1kSDK) objArr[0];
        int i11 = component2 + 115;
        toString = i11 % 128;
        int i12 = i11 % 2;
        String str = aFf1kSDK.component1;
        if (i12 == 0) {
            throw null;
        }
        toString = (component2 + 113) % 128;
        return str;
    }

    public final void getCurrencyIso4217Code(@NonNull String str) {
        getMonetizationNetwork(new Object[]{this, str}, 1176564115, -1176564113, System.identityHashCode(this));
    }

    public final String getMonetizationNetwork() {
        int i11 = component2 + 3;
        toString = i11 % 128;
        int i12 = i11 % 2;
        String str = this.getCurrencyIso4217Code;
        if (i12 == 0) {
            int i13 = 56 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        try {
            new AFb1sSDK((AFh1sSDK) objArr[0], (byte[]) objArr[1]).afInfoLog();
            component2 = (toString + 97) % 128;
            return null;
        } catch (Exception e5) {
            AFLogger.INSTANCE.e(AFg1cSDK.SECURITY, "native: reflection init failed", e5, false, false, true);
            return null;
        }
    }

    private long getMonetizationNetwork(AFc1kSDK aFc1kSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1iSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code));
        sb2.append(component2());
        long jAFAdRevenueData = AFj1jSDK.AFAdRevenueData(AFj1jSDK.AFAdRevenueData(sb2.toString()));
        int i11 = component2 + 119;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            return jAFAdRevenueData;
        }
        throw null;
    }

    public static void getMonetizationNetwork(AFh1sSDK aFh1sSDK, byte[] bArr) {
        getMonetizationNetwork(new Object[]{aFh1sSDK, bArr}, -254860318, 254860321, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getMediationNetwork() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFf1kSDK.toString
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1kSDK.component2 = r1
            int r0 = r0 % 2
            boolean r1 = r3.getMonetizationNetwork
            r2 = 0
            if (r0 == 0) goto L15
            r0 = 51
            int r0 = r0 / r2
            if (r1 == 0) goto L2d
            goto L17
        L15:
            if (r1 == 0) goto L2d
        L17:
            boolean r0 = r3.component3()
            if (r0 != 0) goto L2d
            int r0 = com.appsflyer.internal.AFf1kSDK.component2
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1kSDK.toString = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L2b
            r0 = 1
            return r0
        L2b:
            r0 = 0
            throw r0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.getMediationNetwork():boolean");
    }

    private static boolean getMediationNetwork(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            toString = (component2 + 77) % 128;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AFa1tSDK.getMediationNetwork();
                return !AFa1tSDK.getRevenue(context);
            }
        }
        toString = (component2 + 75) % 128;
        return true;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFAdRevenueData.getCurrencyIso4217Code};
                Map map2 = AFa1kSDK.f9510i;
                Object declaredConstructor = map2.get(1656961623);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), AndroidCharacter.getMirror('0') - 11, 123 - (Process.myTid() >> 22))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(1656961623, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                component2 = (toString + 69) % 128;
                return map3;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th3, false, false, true);
            return new HashMap();
        }
    }

    public final boolean getRevenue() {
        toString = (component2 + 7) % 128;
        boolean z11 = this.component4;
        toString = (component2 + 111) % 128;
        return z11;
    }

    public final void getRevenue(boolean z11) {
        toString = (component2 + 87) % 128;
        this.component4 = z11;
        int i11 = component2 + 109;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public final void getRevenue(String str) {
        component2 = (toString + 93) % 128;
        this.getCurrencyIso4217Code = str;
        toString = (component2 + 5) % 128;
    }

    public static boolean getRevenue(AFh1sSDK aFh1sSDK, AFc1kSDK aFc1kSDK) {
        return ((Boolean) getMonetizationNetwork(new Object[]{aFh1sSDK, aFc1kSDK}, 2120438480, -2120438480, (int) System.currentTimeMillis())).booleanValue();
    }
}
