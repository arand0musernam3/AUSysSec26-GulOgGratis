package com.appsflyer.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1sSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventType = 0;
    private static long AFKeystoreWrapper = -7016867683534703567L;
    private static int AFLogger = 1;
    private final AFc1fSDK copy;
    private final AFg1vSDK copydefault;
    private final String hashCode;
    private final AFc1kSDK toString;

    public AFf1sSDK(@NonNull String str, @NonNull AFd1zSDK aFd1zSDK) {
        super(new AFf1aSDK(), aFd1zSDK, str);
        this.toString = aFd1zSDK.AFAdRevenueData();
        this.copy = aFd1zSDK.registerClient();
        this.hashCode = str;
        this.copydefault = aFd1zSDK.areAllFieldsValid();
    }

    private static void a(String str, int i11, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        aFk1qSDK.getMonetizationNetwork = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i12 = aFk1qSDK.getMediationNetwork;
            if (i12 >= cArr.length) {
                break;
            }
            $11 = ($10 + 45) % 128;
            jArr[i12] = (((long) cArr[i12]) ^ (((long) i12) * ((long) aFk1qSDK.getMonetizationNetwork))) ^ (AFKeystoreWrapper ^ 4058599813193289363L);
            aFk1qSDK.getMediationNetwork = i12 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i13 = aFk1qSDK.getMediationNetwork;
            if (i13 >= cArr.length) {
                break;
            }
            $10 = ($11 + 1) % 128;
            cArr2[i13] = (char) jArr[i13];
            aFk1qSDK.getMediationNetwork = i13 + 1;
        }
        String str2 = new String(cArr2);
        int i14 = $11 + 7;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private void copydefault() {
        AFAdRevenueData(new Object[]{this}, 2011239149, -2011239149, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1sSDK aFf1sSDK = (AFf1sSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        int i11 = AFLogger + 13;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 != 0) {
            ApplicationInfo applicationInfo = aFf1sSDK.toString.n_().applicationInfo;
            throw null;
        }
        ApplicationInfo applicationInfo2 = aFf1sSDK.toString.n_().applicationInfo;
        if (applicationInfo2 == null) {
            AFInAppEventType = (AFLogger + 15) % 128;
            return "";
        }
        String string = packageManager.getApplicationLabel(applicationInfo2).toString();
        AFInAppEventType = (AFLogger + 59) % 128;
        return string;
    }

    @NonNull
    private String s_(PackageManager packageManager) {
        return (String) AFAdRevenueData(new Object[]{this, packageManager}, -1805871763, 1805871764, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r2.getCurrencyIso4217Code() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r9.getMonetizationNetwork("app_version_code", java.lang.Integer.toString(r8.toString.n_().versionCode));
        r9.getMonetizationNetwork("app_version_name", r8.toString.n_().versionName);
        r9.getMonetizationNetwork("app_name", (java.lang.String) AFAdRevenueData(new java.lang.Object[]{r8, r0.getPackageManager()}, -1805871763, 1805871764, java.lang.System.identityHashCode(r8)));
        r9.getMonetizationNetwork("installDate", com.appsflyer.internal.AFa1tSDK.getCurrencyIso4217Code(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r8.toString.n_().firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
        com.braze.h2.b("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0176, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0177, code lost:
    
        com.braze.h2.b("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFAdRevenueData(com.appsflyer.internal.AFh1sSDK r9) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1sSDK.AFAdRevenueData(com.appsflyer.internal.AFh1sSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void component3(AFh1sSDK aFh1sSDK) {
        AFInAppEventType = (AFLogger + 31) % 128;
        String monetizationNetwork = this.toString.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            int i11 = AFInAppEventType + 91;
            AFLogger = i11 % 128;
            if (i11 % 2 == 0) {
                aFh1sSDK.getMonetizationNetwork("advertiserId", monetizationNetwork);
                throw null;
            }
            aFh1sSDK.getMonetizationNetwork("advertiserId", monetizationNetwork);
        }
        AFLogger = (AFInAppEventType + 29) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        int i11 = (AFInAppEventType + 7) % 128;
        AFLogger = i11;
        int i12 = i11 + 85;
        AFInAppEventType = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        AFLogger = (AFInAppEventType + 115) % 128;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        AFLogger = (AFInAppEventType + 61) % 128;
        super.getMonetizationNetwork();
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            AFInAppEventType = (AFLogger + 97) % 128;
            if (responseNetwork.isSuccessful()) {
                AFLogger = (AFInAppEventType + 47) % 128;
                AFAdRevenueData(new Object[]{this}, 2011239149, -2011239149, System.identityHashCode(this));
            }
        }
        AFInAppEventType = (AFLogger + 95) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getRevenue(AFh1sSDK aFh1sSDK) {
        AFInAppEventType = (AFLogger + 19) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        AFLogger = (AFInAppEventType + 7) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        AFInAppEventType = (AFLogger + 125) % 128;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~((~i11) | (~i12));
        int i15 = ~i13;
        int i16 = ((i14 | (~(i15 | i11 | i12))) * (-828)) + (i12 * 829) + (i11 * 829);
        int i17 = i11 | i12;
        if (((~i17) * 828) + ((i17 | i15) * (-828)) + i16 != 1) {
            AFf1sSDK aFf1sSDK = (AFf1sSDK) objArr[0];
            int i18 = AFInAppEventType + 9;
            AFLogger = i18 % 128;
            int i19 = i18 % 2;
            ((AFf1rSDK) aFf1sSDK).component2.getRevenue("sentRegisterRequestToAF", true);
            AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
            AFInAppEventType = (AFLogger + 5) % 128;
            return null;
        }
        return getMediationNetwork(objArr);
    }
}
