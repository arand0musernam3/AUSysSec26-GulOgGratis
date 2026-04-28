package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFd1kSDK implements AFd1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static int copydefault = 1;
    private static final int getRevenue;
    private static long hashCode;
    private static int toString;
    private final AFd1zSDK component4;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMediationNetwork = true;

    @NonNull
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component2 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component1 = false;

    static {
        component2();
        getRevenue = 98166;
        toString = (copydefault + 75) % 128;
    }

    public AFd1kSDK(AFd1zSDK aFd1zSDK) {
        this.component4 = aFd1zSDK;
    }

    private synchronized void AFAdRevenueData(String str, String str2, String... strArr) {
        String string;
        try {
            if (copy()) {
                copydefault = (toString + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                if (this.getMonetizationNetwork < 98304) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strJoin = TextUtils.join(", ", strArr);
                        if (str != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jCurrentTimeMillis);
                            sb2.append(" ");
                            sb2.append(Thread.currentThread().getId());
                            sb2.append(" _/AppsFlyer_6.18.0 [");
                            sb2.append(str);
                            sb2.append("] ");
                            sb2.append(str2);
                            sb2.append(" ");
                            sb2.append(strJoin);
                            string = sb2.toString();
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(jCurrentTimeMillis);
                            sb3.append(" ");
                            sb3.append(Thread.currentThread().getId());
                            sb3.append(" ");
                            sb3.append(str2);
                            sb3.append("/AppsFlyer_6.18.0 ");
                            sb3.append(strJoin);
                            string = sb3.toString();
                        }
                        int length = this.getMonetizationNetwork + (string.length() << 1);
                        int i11 = getRevenue;
                        boolean z11 = false;
                        if (length > i11) {
                            copydefault = (toString + 25) % 128;
                            string = string.substring(0, (i11 - this.getMonetizationNetwork) / 2);
                            z11 = true;
                        }
                        this.getCurrencyIso4217Code.add(string);
                        this.getMonetizationNetwork += string.length() << 1;
                        if (z11) {
                            int i12 = copydefault + 1;
                            toString = i12 % 128;
                            int i13 = i12 % 2;
                            List<String> list = this.getCurrencyIso4217Code;
                            if (i13 != 0) {
                                list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                                this.getMonetizationNetwork >>= 1297;
                            } else {
                                list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                                this.getMonetizationNetwork += 138;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } finally {
        }
    }

    private void AFInAppEventParameterName() {
        copydefault = (toString + 101) % 128;
        this.component4.getMediationNetwork().getCurrencyIso4217Code("participantInProxy");
        toString = (copydefault + 3) % 128;
    }

    private boolean AFInAppEventType() {
        int i11 = copydefault + 49;
        toString = i11 % 128;
        int i12 = i11 % 2;
        AFd1zSDK aFd1zSDK = this.component4;
        if (i12 != 0) {
            aFd1zSDK.getMediationNetwork().getRevenue("participantInProxy");
            throw null;
        }
        boolean revenue = aFd1zSDK.getMediationNetwork().getRevenue("participantInProxy");
        int i13 = copydefault + 71;
        toString = i13 % 128;
        if (i13 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private static void a(int i11, int i12, char c3, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        long[] jArr = new long[i11];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i13 = aFk1kSDK.getMediationNetwork;
            if (i13 >= i11) {
                break;
            }
            int i14 = $10;
            $11 = (i14 + 85) % 128;
            jArr[i13] = (((long) ((char) (((long) component3[i12 + i13]) ^ 5211070536272185776L))) ^ (((long) i13) * (5211070536272185776L ^ hashCode))) ^ ((long) c3);
            aFk1kSDK.getMediationNetwork = i13 + 1;
            $11 = (i14 + 121) % 128;
        }
        char[] cArr = new char[i11];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i15 = aFk1kSDK.getMediationNetwork;
            if (i15 >= i11) {
                objArr[0] = new String(cArr);
                return;
            } else {
                cArr[i15] = (char) jArr[i15];
                aFk1kSDK.getMediationNetwork = i15 + 1;
            }
        }
    }

    private synchronized void areAllFieldsValid() {
        int i11 = toString;
        copydefault = (i11 + 113) % 128;
        if (this.component1) {
            copydefault = (i11 + 69) % 128;
            return;
        }
        this.component1 = true;
        try {
            AFAdRevenueData("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th2, true, true, true);
        }
    }

    private float component1() {
        copydefault = (toString + 51) % 128;
        float fNextFloat = this.areAllFieldsValid.nextFloat();
        int i11 = toString + 21;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return fNextFloat;
        }
        throw null;
    }

    public static void component2() {
        component3 = new char[]{62651, 61828, 65254, 64314, 57345};
        hashCode = 266560491673881759L;
    }

    private static String component4() {
        int i11 = copydefault + 107;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 13 / 0;
        }
        return "6.18.0";
    }

    private boolean copy() {
        if (!this.component2) {
            return false;
        }
        int i11 = toString;
        copydefault = (i11 + 119) % 128;
        if (this.getMediationNetwork) {
            return true;
        }
        int i12 = i11 + 5;
        copydefault = i12 % 128;
        int i13 = i12 % 2;
        boolean z11 = this.component1;
        if (i13 != 0) {
            return z11;
        }
        throw null;
    }

    @NonNull
    private synchronized Map<String, Object> copydefault() {
        toString = (copydefault + 91) % 128;
        this.AFAdRevenueData.put(Bayeux.KEY_DATA, this.getCurrencyIso4217Code);
        equals();
        Map<String, Object> map = this.AFAdRevenueData;
        int i11 = toString + 111;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return map;
        }
        int i12 = 89 / 0;
        return map;
    }

    private synchronized void equals() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (toString + 41) % 128;
    }

    private boolean getCurrencyIso4217Code(@NonNull AFi1zSDK aFi1zSDK, AFi1zSDK aFi1zSDK2) {
        boolean revenue;
        int i11 = toString + 73;
        copydefault = i11 % 128;
        if (i11 % 2 == 0) {
            aFi1zSDK.equals(aFi1zSDK2);
            throw null;
        }
        if (aFi1zSDK.equals(aFi1zSDK2)) {
            revenue = AFInAppEventType();
        } else {
            revenue = getRevenue(aFi1zSDK.AFAdRevenueData);
            AFAdRevenueData(revenue);
        }
        int i12 = toString + 9;
        copydefault = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 63 / 0;
        }
        return revenue;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        int i11 = copydefault + 107;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            aFd1kSDK.getRevenue(getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.AFAdRevenueData), getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.getMonetizationNetwork));
            throw null;
        }
        boolean revenue = aFd1kSDK.getRevenue(getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.AFAdRevenueData), getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.getMonetizationNetwork));
        if (revenue) {
            aFd1kSDK.areAllFieldsValid();
            copydefault = (toString + 73) % 128;
        } else {
            aFd1kSDK.getMediationNetwork();
            aFd1kSDK.AFAdRevenueData();
        }
        return Boolean.valueOf(revenue);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:7:0x0051, B:16:0x006f, B:20:0x0081, B:31:0x00ab), top: B:39:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getMonetizationNetwork(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb8
            r1 = 0
            int r2 = android.view.View.MeasureSpec.getMode(r1)     // Catch: java.lang.Throwable -> Lb8
            int r2 = r2 + 5
            int r3 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch: java.lang.Throwable -> Lb8
            int r3 = r3 >> 16
            int r4 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch: java.lang.Throwable -> Lb8
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lb8
            r5 = 64874(0xfd6a, float:9.0908E-41)
            int r4 = r4 + r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> Lb8
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb8
            a(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb8
            r1 = r5[r1]     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lb8
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb8
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "platform"
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "platform_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb8
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            r0 = 0
            if (r7 == 0) goto L6d
            int r1 = r7.length()     // Catch: java.lang.Throwable -> Lb8
            if (r1 <= 0) goto L6d
            int r1 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.appsflyer.internal.AFd1kSDK.copydefault = r2     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 % 2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.AFAdRevenueData
            if (r1 == 0) goto L65
            java.lang.String r1 = "advertiserId"
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> Lb8
            goto L6d
        L65:
            java.lang.String r8 = "advertiserId"
            r2.put(r8, r7)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        L6b:
            r7 = move-exception
            goto Lb4
        L6d:
            if (r8 == 0) goto L9c
            int r7 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + 15
            int r1 = r7 % 128
            com.appsflyer.internal.AFd1kSDK.copydefault = r1     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 % 2
            if (r7 == 0) goto L9b
            int r7 = r8.length()     // Catch: java.lang.Throwable -> Lb8
            if (r7 <= 0) goto L9c
            int r7 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + 75
            int r1 = r7 % 128
            com.appsflyer.internal.AFd1kSDK.copydefault = r1     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 % 2
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.AFAdRevenueData
            if (r7 == 0) goto L95
            java.lang.String r7 = "imei"
            r1.put(r7, r8)     // Catch: java.lang.Throwable -> Lb8
            goto L9c
        L95:
            java.lang.String r7 = "imei"
            r1.put(r7, r8)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        L9b:
            throw r0     // Catch: java.lang.Throwable -> Lb8
        L9c:
            if (r9 == 0) goto Lb6
            int r7 = r9.length()     // Catch: java.lang.Throwable -> Lb8
            if (r7 <= 0) goto Lb6
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "android_id"
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> Lb8
            int r7 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + 89
            int r7 = r7 % 128
            com.appsflyer.internal.AFd1kSDK.copydefault = r7     // Catch: java.lang.Throwable -> L6b
            goto Lb6
        Lb4:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            throw r7
        Lb6:
            monitor-exit(r6)
            return
        Lb8:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getMonetizationNetwork(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:6:0x000f, B:11:0x0022, B:13:0x0028, B:15:0x0031, B:17:0x0037, B:19:0x0040, B:21:0x0046, B:9:0x001b), top: B:36:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getRevenue(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1kSDK.copydefault = r1     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 % 2
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.AFAdRevenueData
            if (r0 != 0) goto L1b
            java.lang.String r0 = "sdk_version"
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L61
            r3 = 68
            int r3 = r3 / 0
            if (r4 == 0) goto L2f
            goto L22
        L1b:
            java.lang.String r0 = "sdk_version"
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L2f
        L22:
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L61
            if (r3 <= 0) goto L2f
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "devkey"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L61
        L2f:
            if (r5 == 0) goto L3e
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L61
            if (r3 <= 0) goto L3e
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "originalAppsFlyerId"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L61
        L3e:
            if (r6 == 0) goto L4d
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L61
            if (r3 <= 0) goto L4d
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "uid"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L61
        L4d:
            int r3 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.appsflyer.internal.AFd1kSDK.copydefault = r4     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 % 2
            if (r3 == 0) goto L5b
            monitor-exit(r2)
            return
        L5b:
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L5d
        L5d:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r3 = move-exception
            goto L63
        L61:
            monitor-exit(r2)
            return
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getRevenue(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final boolean component3() {
        int i11 = (toString + 79) % 128;
        copydefault = i11;
        boolean z11 = this.component1;
        int i12 = i11 + 41;
        toString = i12 % 128;
        if (i12 % 2 == 0) {
            return z11;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void q_(String str, PackageManager packageManager) {
        copydefault = (toString + 9) % 128;
        try {
            AFd1nSDK aFd1nSDKAFAdRevenueData = this.component4.getRevenue().AFAdRevenueData(getMediationNetwork(str), this.component4.AFInAppEventParameterName().getMonetizationNetwork());
            if (aFd1nSDKAFAdRevenueData == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.component4.getCurrencyIso4217Code().execute(new f(aFd1nSDKAFAdRevenueData, 2));
                copydefault = (toString + 103) % 128;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        String str = (String) objArr[1];
        String[] strArr = (String[]) objArr[2];
        toString = (copydefault + 91) % 128;
        aFd1kSDK.AFAdRevenueData("public_api_call", str, strArr);
        int i11 = copydefault + 65;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final synchronized void getCurrencyIso4217Code() {
        try {
            int i11 = copydefault + 31;
            toString = i11 % 128;
            int i12 = i11 % 2;
            Map<String, Object> map = this.AFAdRevenueData;
            if (i12 != 0) {
                map.clear();
                this.getCurrencyIso4217Code.clear();
                this.getMonetizationNetwork = 1;
            } else {
                map.clear();
                this.getCurrencyIso4217Code.clear();
                this.getMonetizationNetwork = 0;
            }
            copydefault = (toString + 49) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getCurrencyIso4217Code(Throwable th2) {
        AFAdRevenueData(new Object[]{this, th2}, 1500974607, -1500974606, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getRevenue(String str, int i11, String str2) {
        toString = (copydefault + 107) % 128;
        AFAdRevenueData("server_response", str, String.valueOf(i11), str2);
        int i12 = copydefault + 41;
        toString = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i11 = copydefault + 113;
        int i12 = i11 % 128;
        toString = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        copydefault = (i12 + 97) % 128;
        for (int i13 = 1; i13 < stackTraceElementArr.length; i13++) {
            toString = (copydefault + 9) % 128;
            strArr[i13] = stackTraceElementArr[i13].toString();
        }
        return strArr;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMediationNetwork(String str, String str2) {
        int i11 = toString + 107;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            AFAdRevenueData((String) null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        AFAdRevenueData((String) null, str, strArr);
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final synchronized void getMediationNetwork() {
        try {
            int i11 = copydefault + 17;
            toString = i11 % 128;
            if (i11 % 2 != 0) {
                this.getMediationNetwork = false;
            } else {
                this.getMediationNetwork = false;
            }
            getCurrencyIso4217Code();
            equals();
            toString = (copydefault + 17) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean getRevenue(AFi1zSDK aFi1zSDK, AFi1zSDK aFi1zSDK2) {
        if (aFi1zSDK == null) {
            AFInAppEventParameterName();
            return false;
        }
        if (!aFi1zSDK.getMonetizationNetwork()) {
            toString = (copydefault + 71) % 128;
            return false;
        }
        if (this.component4.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= aFi1zSDK.getCurrencyIso4217Code) {
            int i11 = toString + 63;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                if (!getCurrencyIso4217Code(aFi1zSDK, aFi1zSDK2)) {
                    return false;
                }
                if (getMonetizationNetwork(aFi1zSDK.getMonetizationNetwork)) {
                    return getRevenue(aFi1zSDK.getRevenue);
                }
                return false;
            }
        }
        copydefault = (toString + 17) % 128;
        return false;
    }

    private Map<String, Object> getMediationNetwork(String str) {
        toString = (copydefault + 113) % 128;
        AFAdRevenueData(str, this.component4.AFInAppEventParameterName(), this.component4.e());
        Map<String, Object> mapCopydefault = copydefault();
        int i11 = toString + 103;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return mapCopydefault;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMediationNetwork(String str, String... strArr) {
        AFAdRevenueData(new Object[]{this, str, strArr}, 1230732210, -1230732210, System.identityHashCode(this));
    }

    private static boolean getRevenue(String str) {
        if (AFk1zSDK.getRevenue(str)) {
            toString = (copydefault + 73) % 128;
            return true;
        }
        new AFd1rSDK();
        return AFd1rSDK.getRevenue(component4(), str);
    }

    private boolean getRevenue(float f11) {
        double d3 = f11;
        if (d3 < 1.0d) {
            return d3 > 0.0d && component1() <= f11;
        }
        int i11 = copydefault + 47;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static AFi1zSDK getRevenue(AFh1cSDK aFh1cSDK) {
        if (aFh1cSDK != null) {
            int i11 = toString + 89;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                AFh1aSDK aFh1aSDK = aFh1cSDK.getMediationNetwork;
                if (aFh1aSDK != null) {
                    return aFh1aSDK.AFAdRevenueData;
                }
            } else {
                AFh1aSDK aFh1aSDK2 = aFh1cSDK.getMediationNetwork;
                throw null;
            }
        }
        int i12 = copydefault + 77;
        toString = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 30 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final boolean getRevenue() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 2123307937, -2123307935, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMonetizationNetwork(String str, String str2) {
        toString = (copydefault + 99) % 128;
        AFAdRevenueData("server_request", str, str2);
        int i11 = copydefault + 105;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private boolean getMonetizationNetwork(String str) {
        copydefault = (toString + 85) % 128;
        if (AFk1zSDK.getRevenue(str)) {
            return true;
        }
        boolean zEquals = str.equals(this.component4.AFAdRevenueData().n_().versionName);
        int i11 = toString + 71;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMonetizationNetwork() {
        AFAdRevenueData(new Object[]{this}, -1717475168, 1717475171, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final synchronized void AFAdRevenueData() {
        if (!this.component1) {
            int i11 = (toString + 89) % 128;
            copydefault = i11;
            if (!this.getMediationNetwork) {
                toString = (i11 + 99) % 128;
                return;
            }
        }
        this.component1 = false;
        this.getMediationNetwork = false;
        try {
            AFAdRevenueData("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th2, true, true, true);
        }
    }

    private synchronized void AFAdRevenueData(String str, String str2, String str3, String str4) {
        int i11 = toString + 113;
        copydefault = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                if (str != null && str.length() > 0) {
                    int i12 = toString + 57;
                    copydefault = i12 % 128;
                    int i13 = i12 % 2;
                    Map<String, Object> map = this.AFAdRevenueData;
                    if (i13 == 0) {
                        map.put("app_id", str);
                        throw null;
                    }
                    map.put("app_id", str);
                }
                if (str2 != null) {
                    int i14 = toString + 41;
                    copydefault = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 41 / 0;
                        if (str2.length() > 0) {
                            this.AFAdRevenueData.put("app_version", str2);
                        }
                    } else if (str2.length() > 0) {
                        this.AFAdRevenueData.put("app_version", str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.AFAdRevenueData.put("channel", str3);
                }
                if (str4 != null) {
                    toString = (copydefault + 51) % 128;
                    if (str4.length() > 0) {
                        this.AFAdRevenueData.put("preInstall", str4);
                        copydefault = (toString + 3) % 128;
                    }
                }
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i11, int i12, int i13) {
        String message;
        int i14 = ~i13;
        int i15 = (((~((~i11) | i12)) | (~(i12 | i14))) * 560) + ((~(i13 | (~i12) | i11)) * (-560)) + ((~(i14 | i11)) * (-560)) + (i12 * 561) + (i11 * (-559));
        if (i15 != 1) {
            if (i15 == 2) {
                return getMediationNetwork(objArr);
            }
            if (i15 != 3) {
                return getCurrencyIso4217Code(objArr);
            }
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            int i16 = copydefault + 29;
            toString = i16 % 128;
            int i17 = i16 % 2;
            aFd1kSDK.component2 = false;
            return null;
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        Throwable th2 = (Throwable) objArr[1];
        copydefault = (toString + 49) % 128;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        if (cause == null) {
            copydefault = (toString + 35) % 128;
            message = th2.getMessage();
        } else {
            message = cause.getMessage();
        }
        aFd1kSDK2.AFAdRevenueData("exception", simpleName, getRevenue(message, cause == null ? th2.getStackTrace() : cause.getStackTrace()));
        return null;
    }

    private synchronized void AFAdRevenueData(String str, AFf1kSDK aFf1kSDK, AFc1gSDK aFc1gSDK) {
        toString = (copydefault + 37) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.AFAdRevenueData.clear();
        if (string != null) {
            try {
                this.AFAdRevenueData.putAll(AFg1lSDK.getMediationNetwork(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            getMonetizationNetwork(this.component4.AFAdRevenueData().getMonetizationNetwork(), (String) AFf1kSDK.getMonetizationNetwork(new Object[]{aFf1kSDK}, -211782084, 211782085, System.identityHashCode(aFf1kSDK)), aFc1gSDK.getCurrencyIso4217Code);
            StringBuilder sb2 = new StringBuilder("6.18.0.");
            sb2.append(AFa1tSDK.getMonetizationNetwork);
            getRevenue(sb2.toString(), this.component4.AFInAppEventParameterName().getMonetizationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1iSDK.getCurrencyIso4217Code(this.component4.AFAdRevenueData().getCurrencyIso4217Code));
            try {
                int i11 = this.component4.AFAdRevenueData().n_().versionCode;
                AFAdRevenueData(str, String.valueOf(i11), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFAdRevenueData).toString());
            toString = (copydefault + 117) % 128;
        }
        this.AFAdRevenueData.put("launch_counter", String.valueOf(this.component4.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0)));
        copydefault = (toString + 71) % 128;
    }

    private void AFAdRevenueData(boolean z11) {
        copydefault = (toString + 23) % 128;
        this.component4.getMediationNetwork().getRevenue("participantInProxy", z11);
        int i11 = copydefault + 29;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }
}
