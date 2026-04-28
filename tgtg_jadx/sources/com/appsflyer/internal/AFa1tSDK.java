package com.appsflyer.internal;

import a40.q;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.android.internal.DateKtxConstants;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static long AFInAppEventParameterName = 0;
    private static int AFLogger = 0;
    private static AFa1tSDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork = null;
    public static final String getMonetizationNetwork;
    private static int registerClient = 1;
    Application component3;
    private AFf1uSDK copy;
    private volatile SharedPreferences equals;
    private Map<Long, String> hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component4 = -1;
    long getRevenue = -1;
    private long component2 = 5000;
    boolean component1 = false;

    @NonNull
    private final AFc1cSDK copydefault = new AFc1cSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1tSDK$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMonetizationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMonetizationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        component4();
        getMonetizationNetwork = "374";
        AFAdRevenueData = "6.18";
        getMediationNetwork = null;
        areAllFieldsValid = new AFa1tSDK();
        AFLogger = (registerClient + 109) % 128;
    }

    public AFa1tSDK() {
        getRevenue().afDebugLog().getMediationNetwork();
        getRevenue().afDebugLog().AFAdRevenueData();
    }

    private static /* synthetic */ Object AFInAppEventParameterName(Object[] objArr) {
        String string;
        String str = (String) objArr[0];
        int i11 = AFLogger + 63;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i12 = 32 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
        }
        registerClient = (AFLogger + 83) % 128;
        return string;
    }

    private static /* synthetic */ Object AFInAppEventType(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i11 = registerClient + 19;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            aFa1tSDK.start(context, str, null);
            return null;
        }
        aFa1tSDK.start(context, str, null);
        throw null;
    }

    private static void a(String str, int i11, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 19) % 128;
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
            jArr[i12] = (((long) cArr[i12]) ^ (((long) i12) * ((long) aFk1qSDK.getMonetizationNetwork))) ^ (AFInAppEventParameterName ^ 4058599813193289363L);
            aFk1qSDK.getMediationNetwork = i12 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i13 = aFk1qSDK.getMediationNetwork;
            if (i13 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i14 = $11 + 17;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr2[i13] = (char) jArr[i13];
            } else {
                cArr2[i13] = (char) jArr[i13];
                i13++;
            }
            aFk1qSDK.getMediationNetwork = i13;
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Context context = (Context) objArr[2];
        int i11 = AFLogger + 115;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            aFa1tSDK.getMonetizationNetwork(context);
            AFd1zSDK revenue = aFa1tSDK.getRevenue();
            revenue.AFInAppEventParameterName().getRevenue(zBooleanValue);
            revenue.getCurrencyIso4217Code().submit(new f(revenue, 1));
            throw null;
        }
        aFa1tSDK.getMonetizationNetwork(context);
        AFd1zSDK revenue2 = aFa1tSDK.getRevenue();
        revenue2.AFInAppEventParameterName().getRevenue(zBooleanValue);
        revenue2.getCurrencyIso4217Code().submit(new f(revenue2, 1));
        if (zBooleanValue) {
            AFLogger = (registerClient + 111) % 128;
            revenue2.getMediationNetwork().getRevenue("is_stop_tracking_used", true);
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    private static void c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i11 = registerClient;
                int i12 = i11 + 63;
                AFLogger = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = applicationInfo.flags;
                    throw null;
                }
                if ((applicationInfo.flags & 32768) != 0) {
                    AFLogger = (i11 + 91) % 128;
                    if (Build.VERSION.SDK_INT >= 31) {
                        registerClient = (AFLogger + 79) % 128;
                        if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                            return;
                        }
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        int i14 = AFLogger + 9;
                        registerClient = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 61 / 0;
                            return;
                        }
                        return;
                    }
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                }
            }
            int i16 = registerClient + 73;
            AFLogger = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th2);
        }
    }

    @NonNull
    private AFj1zSDK[] component1() {
        AFLogger = (registerClient + 1) % 128;
        AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) getRevenue().copydefault().AFAdRevenueData.toArray(new AFj1zSDK[0]);
        int i11 = registerClient + 11;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return aFj1zSDKArr;
        }
        throw null;
    }

    private boolean component2() {
        String string;
        int i11 = registerClient + 41;
        AFLogger = i11 % 128;
        int i12 = i11 % 2;
        long j9 = this.component4;
        if (i12 == 0 ? j9 <= 0 : j9 <= 1) {
            if (isStopped()) {
                return false;
            }
            AFLogger = (registerClient + 41) % 128;
            AFLogger.afInfoLog("Sending first launch for this session!");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.component4;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
        String currencyIso4217Code = getCurrencyIso4217Code(simpleDateFormat, this.component4);
        String currencyIso4217Code2 = getCurrencyIso4217Code(simpleDateFormat, this.getRevenue);
        if (jCurrentTimeMillis >= this.component2 || isStopped()) {
            if (isStopped()) {
                return false;
            }
            StringBuilder sbT = e0.f.t("Last Launch attempt: ", currencyIso4217Code, ";\nLast successful Launch event: ", currencyIso4217Code2, ";\nSending launch (+");
            sbT.append(jCurrentTimeMillis);
            sbT.append(" ms)");
            AFLogger.afInfoLog(sbT.toString());
            return false;
        }
        int i13 = registerClient + 21;
        AFLogger = i13 % 128;
        if (i13 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[1] = currencyIso4217Code;
            objArr[1] = currencyIso4217Code2;
            objArr[3] = Long.valueOf(jCurrentTimeMillis);
            objArr[3] = Long.valueOf(this.component2);
            string = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr);
        } else {
            long j11 = this.component2;
            StringBuilder sbT2 = e0.f.t("Last Launch attempt: ", currencyIso4217Code, ";\nLast successful Launch event: ", currencyIso4217Code2, ";\nThis launch is blocked: ");
            sbT2.append(jCurrentTimeMillis);
            sbT2.append(" ms < ");
            sbT2.append(j11);
            sbT2.append(" ms");
            string = sbT2.toString();
        }
        AFLogger.afInfoLog(string);
        return true;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        Context context = (Context) objArr[0];
        registerClient = (AFLogger + 75) % 128;
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i11 = registerClient + 109;
                AFLogger = i11 % 128;
                if (i11 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    throw null;
                }
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                AFLogger = (registerClient + 95) % 128;
                if (!listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    AFLogger = (registerClient + 39) % 128;
                }
            }
            return null;
        } catch (Exception e5) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e5);
            return null;
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        AFh1sSDK monetizationNetwork = new AFh1nSDK().getMonetizationNetwork(aFa1tSDK.getRevenue().AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0));
        monetizationNetwork.component2 = str;
        if (str == null || str.length() <= 5 || !aFa1tSDK.getRevenue().copydefault().getCurrencyIso4217Code(monetizationNetwork)) {
            return null;
        }
        int i11 = AFLogger + 33;
        registerClient = i11 % 128;
        int i12 = i11 % 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (i12 == 0) {
            AFj1cSDK.getMonetizationNetwork(aFa1tSDK.getRevenue().getMonetizationNetwork(), new g(1, aFa1tSDK, monetizationNetwork), 5L, timeUnit);
            throw null;
        }
        AFj1cSDK.getMonetizationNetwork(aFa1tSDK.getRevenue().getMonetizationNetwork(), new g(1, aFa1tSDK, monetizationNetwork), 5L, timeUnit);
        AFLogger = (registerClient + 95) % 128;
        return null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        registerClient = (AFLogger + 95) % 128;
        aFa1tSDK.start(context, null);
        int i11 = registerClient + 105;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFLogger = (registerClient + 67) % 128;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1oSDK aFh1oSDK = new AFh1oSDK((Activity) context, aFa1tSDK.getRevenue().w());
        int i11 = AFLogger + 73;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return aFh1oSDK;
        }
        throw null;
    }

    public static SharedPreferences d_(Context context) {
        return (SharedPreferences) getMonetizationNetwork(new Object[]{context}, 1469250199, -1469250196, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void e_(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            r6.getMonetizationNetwork(r7)
            com.appsflyer.internal.AFd1zSDK r0 = r6.getRevenue()
            com.appsflyer.internal.AFa1oSDK r0 = r0.i()
            com.appsflyer.internal.AFd1zSDK r1 = r6.getRevenue()
            com.appsflyer.internal.AFc1jSDK r1 = r1.getMediationNetwork()
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L37
            int r4 = com.appsflyer.internal.AFa1tSDK.AFLogger
            int r4 = r4 + r2
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r4
            java.lang.String r4 = "android.intent.action.VIEW"
            java.lang.String r5 = r8.getAction()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L37
            android.net.Uri r4 = r8.getData()
            int r5 = com.appsflyer.internal.AFa1tSDK.AFLogger
            int r5 = r5 + 67
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r5
            goto L38
        L37:
            r4 = r3
        L38:
            r5 = 0
            if (r4 == 0) goto L4e
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L4e
            int r4 = com.appsflyer.internal.AFa1tSDK.AFLogger
            int r4 = r4 + 23
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r4
            goto L4f
        L4e:
            r2 = r5
        L4f:
            java.lang.String r4 = "ddl_sent"
            boolean r1 = r1.getRevenue(r4)
            if (r1 == 0) goto L72
            if (r2 != 0) goto L72
            int r7 = com.appsflyer.internal.AFa1tSDK.registerClient
            int r7 = r7 + 9
            int r8 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.AFLogger = r8
            int r7 = r7 % 2
            java.lang.String r8 = "No direct deep link"
            if (r7 == 0) goto L6e
            r0.AFAdRevenueData(r8, r3)
            r7 = 68
            int r7 = r7 / r5
            return
        L6e:
            r0.AFAdRevenueData(r8, r3)
            return
        L72:
            com.appsflyer.internal.AFd1zSDK r1 = r0.component4
            com.appsflyer.internal.AFa1gSDK r1 = r1.afErrorLog()
            com.appsflyer.internal.AFa1jSDK r1 = com.appsflyer.internal.AFa1jSDK.getMediationNetwork(r1)
            r0.f_(r1, r8, r7)
            int r7 = com.appsflyer.internal.AFa1tSDK.registerClient
            int r7 = r7 + 99
            int r8 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.AFLogger = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L8e
            r7 = 16
            int r7 = r7 / r5
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.e_(android.content.Context, android.content.Intent):void");
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        Boolean bool = (Boolean) objArr[1];
        boolean zBooleanValue = bool.booleanValue();
        registerClient = (AFLogger + 113) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(zBooleanValue)), true);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, bool}, 1660171217, -1660171210, (int) System.currentTimeMillis());
        int i11 = registerClient + 65;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 88 / 0;
        }
        return null;
    }

    private static void getCurrencyIso4217Code(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i11)));
                }
            } catch (JSONException e5) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e5);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (itKeys2.hasNext()) {
                int i12 = AFLogger + 27;
                registerClient = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    AFLogger = (registerClient + 89) % 128;
                    int i13 = 0;
                    while (i13 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i13) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i13) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        AFLogger = (registerClient + 105) % 128;
                        if (jSONArray2.getLong(i13) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i13++;
                        str = next;
                    }
                } catch (JSONException e11) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e11);
                }
            }
            break loop2;
        }
        if (str != null) {
            jSONObject.remove(str);
        }
        AFLogger = (registerClient + 37) % 128;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = ((i13 | i15 | (~(i16 | i11))) * 614) + (i12 * (-613)) + (i11 * 615);
        int i18 = ~i13;
        switch ((((~(i11 | i18 | i12)) | (~(i14 | i16 | i18))) * 614) + (((~(i14 | i18)) | i15 | (~(i18 | i12))) * (-1228)) + i17) {
            case 1:
                return getMonetizationNetwork(objArr);
            case 2:
                AFc1jSDK aFc1jSDK = (AFc1jSDK) objArr[0];
                String str = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int currencyIso4217Code = aFc1jSDK.getCurrencyIso4217Code(str, 0);
                if (zBooleanValue) {
                    int i19 = AFLogger + 21;
                    registerClient = i19 % 128;
                    currencyIso4217Code = i19 % 2 == 0 ? currencyIso4217Code + 81 : currencyIso4217Code + 1;
                    aFc1jSDK.AFAdRevenueData(str, currencyIso4217Code);
                    registerClient = (AFLogger + 9) % 128;
                }
                return Integer.valueOf(currencyIso4217Code);
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
                AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) objArr[1];
                Map map = (Map) objArr[2];
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = (AppsFlyerInAppPurchaseValidationCallback) objArr[3];
                AFe1qSDK aFe1qSDKEquals = aFa1tSDK.copydefault.equals();
                aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(new AFe1dSDK(aFa1tSDK.copydefault, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
                AFLogger = (registerClient + 69) % 128;
                return null;
            case 5:
                return getRevenue(objArr);
            case 6:
                return AFAdRevenueData(objArr);
            case 7:
                return getCurrencyIso4217Code(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return component1(objArr);
            case 10:
                return areAllFieldsValid(objArr);
            case 11:
                AFa1tSDK aFa1tSDK2 = (AFa1tSDK) objArr[0];
                String str2 = (String) objArr[1];
                int i21 = registerClient + 51;
                AFLogger = i21 % 128;
                if (i21 % 2 != 0) {
                    AFd1lSDK aFd1lSDKCopy = aFa1tSDK2.getRevenue().copy();
                    String[] strArr = new String[0];
                    strArr[0] = str2;
                    aFd1lSDKCopy.getMediationNetwork("setAndroidIdData", strArr);
                } else {
                    aFa1tSDK2.getRevenue().copy().getMediationNetwork("setAndroidIdData", str2);
                }
                aFa1tSDK2.getRevenue().e().getCurrencyIso4217Code = str2;
                return null;
            case 12:
                String str3 = (String) objArr[0];
                int i22 = AFLogger + 3;
                registerClient = i22 % 128;
                int i23 = i22 % 2;
                return Boolean.valueOf(AppsFlyerProperties.getInstance().getBoolean(str3, false));
            case 13:
                AFa1tSDK aFa1tSDK3 = (AFa1tSDK) objArr[0];
                AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
                int i24 = AFLogger + 53;
                registerClient = i24 % 128;
                if (i24 % 2 == 0) {
                    aFa1tSDK3.getRevenue().copy().getMediationNetwork("registerConversionListener", new String[1]);
                } else {
                    aFa1tSDK3.getRevenue().copy().getMediationNetwork("registerConversionListener", new String[0]);
                }
                aFa1tSDK3.getMonetizationNetwork(appsFlyerConversionListener);
                registerClient = (AFLogger + 23) % 128;
                return null;
            case 14:
                AFa1tSDK aFa1tSDK4 = (AFa1tSDK) objArr[0];
                Context context = (Context) objArr[1];
                Map<String, Object> map2 = (Map) objArr[2];
                PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
                registerClient = (AFLogger + 63) % 128;
                aFa1tSDK4.getMonetizationNetwork(context);
                PurchaseHandler purchaseHandlerComponent1 = aFa1tSDK4.getRevenue().component1();
                if (purchaseHandlerComponent1.getRevenue(map2, purchaseValidationCallback, "purchases")) {
                    AFe1eSDK aFe1eSDK = new AFe1eSDK(map2, purchaseValidationCallback, purchaseHandlerComponent1.getCurrencyIso4217Code);
                    AFe1qSDK aFe1qSDK = purchaseHandlerComponent1.AFAdRevenueData;
                    aFe1qSDK.getMonetizationNetwork.execute(aFe1qSDK.new AnonymousClass1(aFe1eSDK));
                }
                AFLogger = (registerClient + 79) % 128;
                return null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return component3(objArr);
            case 16:
                return component2(objArr);
            case 17:
                return equals(objArr);
            case 18:
                return copy(objArr);
            case 19:
                return hashCode(objArr);
            case 20:
                return toString(objArr);
            case 21:
                return copydefault(objArr);
            case 22:
                return registerClient(objArr);
            case 23:
                return AFInAppEventType(objArr);
            case 24:
                return AFInAppEventParameterName(objArr);
            default:
                AFa1tSDK aFa1tSDK5 = (AFa1tSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                AFLogger = (registerClient + 73) % 128;
                aFa1tSDK5.getMonetizationNetwork(context2);
                String currencyIso4217Code2 = aFa1tSDK5.getRevenue().AFAdRevenueData().getCurrencyIso4217Code(context2);
                AFLogger = (registerClient + 81) % 128;
                return currencyIso4217Code2;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        registerClient = (AFLogger + 101) % 128;
        if (aFa1tSDK.getRevenue().afVerboseLog().getCurrencyIso4217Code()) {
            aFa1tSDK.getRevenue().afVerboseLog().getMonetizationNetwork();
            AFLogger = (registerClient + 111) % 128;
        }
        AFi1xSDK aFi1xSDKD = aFa1tSDK.getRevenue().d();
        aFi1xSDKD.getRevenue = Build.VERSION.SDK_INT >= 31 ? new AFi1tSDK(aFi1xSDKD.getCurrencyIso4217Code) : new AFi1qSDK(aFi1xSDKD.getCurrencyIso4217Code);
        aFa1tSDK.getRevenue().AFInAppEventParameterName().AFAdRevenueData(aFa1tSDK.getRevenue().AFAdRevenueData());
        AFh1uSDK aFh1uSDKComponent2 = aFa1tSDK.getRevenue().component2();
        aFh1uSDKComponent2.component3 = System.currentTimeMillis();
        int currencyIso4217Code = aFh1uSDKComponent2.getMediationNetwork.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
        if (currencyIso4217Code == 1 && aFh1uSDKComponent2.AFAdRevenueData.getMonetizationNetwork("first_launch")) {
            aFh1uSDKComponent2.getCurrencyIso4217Code.putAll(aFh1uSDKComponent2.AFAdRevenueData("first_launch"));
        }
        if (currencyIso4217Code > 0) {
            registerClient = (AFLogger + 75) % 128;
            if (aFh1uSDKComponent2.AFAdRevenueData.getMonetizationNetwork("gcd")) {
                aFh1uSDKComponent2.getRevenue.putAll(aFh1uSDKComponent2.AFAdRevenueData("gcd"));
            }
        }
        aFh1uSDKComponent2.equals = aFh1uSDKComponent2.AFAdRevenueData.getMediationNetwork("prev_session_dur", 0L);
        aFa1tSDK.getRevenue().component3().AFAdRevenueData(aFa1tSDK.getMonetizationNetwork());
        aFa1tSDK.areAllFieldsValid();
        aFa1tSDK.getRevenue().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i11 = AFLogger + 105;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 26 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        registerClient = (AFLogger + 115) % 128;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i11 = registerClient + 5;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFLogger = (registerClient + 3) % 128;
        if (map != null) {
            aFa1tSDK.getRevenue().copy().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i11 = AFLogger + 97;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @NonNull
    public final Map<String, Object> AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        String str;
        Context context = getRevenue().registerClient().getCurrencyIso4217Code;
        AFc1jSDK mediationNetwork = getMediationNetwork(context);
        AFg1vSDK aFg1vSDKAreAllFieldsValid = getRevenue().areAllFieldsValid();
        boolean revenue = getRevenue().AFInAppEventParameterName().getRevenue();
        boolean zAFAdRevenueData = aFh1sSDK.AFAdRevenueData();
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("\ud96c\uf8bc髼볼常灓ቢ㖟ퟁ\ue9e3謆굀", ExpandableListView.getPackedPositionGroup(0L) + 8663, objArr);
        boolean z11 = false;
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (revenue) {
                AFLogger = (registerClient + 109) % 128;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (zAFAdRevenueData) {
                    int i11 = registerClient + 73;
                    AFLogger = i11 % 128;
                    str = "Launch";
                    if (i11 % 2 != 0) {
                        int i12 = 2 / 0;
                    }
                } else {
                    str = aFh1sSDK.areAllFieldsValid;
                }
                sb2.append(str);
                aFLogger.i(aFg1cSDK, sb2.toString(), true);
            }
            getMonetizationNetwork(new Object[]{context}, 847967095, -847967080, (int) System.currentTimeMillis());
            int mediationNetwork2 = getMediationNetwork(mediationNetwork, zAFAdRevenueData);
            if (aFh1sSDK.areAllFieldsValid != null) {
                AFLogger = (registerClient + 71) % 128;
                z11 = true;
            }
            int iAFAdRevenueData = AFAdRevenueData(mediationNetwork, z11);
            if (zAFAdRevenueData && mediationNetwork2 == 1) {
                registerClient = (AFLogger + 109) % 128;
                AppsFlyerProperties.getInstance().getMonetizationNetwork = true;
            }
            aFg1vSDKAreAllFieldsValid.getMonetizationNetwork(map, mediationNetwork2, iAFAdRevenueData);
            return map;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th2, true, true, true);
            return map;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = getRevenue().i().getMediationNetwork;
        if (!list.contains(listAsList)) {
            int i11 = AFLogger + 39;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                list.add(listAsList);
                throw null;
            }
            list.add(listAsList);
        }
        registerClient = (AFLogger + 23) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z11) {
        int i11 = registerClient + 93;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            AFd1lSDK aFd1lSDKCopy = getRevenue().copy();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z11);
            aFd1lSDKCopy.getMediationNetwork("anonymizeUser", strArr);
        } else {
            getRevenue().copy().getMediationNetwork("anonymizeUser", String.valueOf(z11));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z11);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        registerClient = (AFLogger + 27) % 128;
        AFa1oSDK aFa1oSDKI = getRevenue().i();
        aFa1oSDKI.getMonetizationNetwork = str;
        aFa1oSDKI.getCurrencyIso4217Code = map;
        registerClient = (AFLogger + 107) % 128;
    }

    public final void b_(Context context, Intent intent) {
        AFj1nSDK aFj1nSDK = new AFj1nSDK(intent);
        if (aFj1nSDK.getMediationNetwork("appsflyer_preinstall") != null) {
            int i11 = AFLogger + 9;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                getMediationNetwork(aFj1nSDK.getMediationNetwork("appsflyer_preinstall"));
                throw null;
            }
            getMediationNetwork(aFj1nSDK.getMediationNetwork("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String mediationNetwork = aFj1nSDK.getMediationNetwork("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(mediationNetwork)));
        if (mediationNetwork != null) {
            registerClient = (AFLogger + 75) % 128;
            getMediationNetwork(context).getMediationNetwork("referrer", mediationNetwork);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", mediationNetwork);
            appsFlyerProperties.getRevenue = mediationNetwork;
            if (AppsFlyerProperties.getInstance().getCurrencyIso4217Code()) {
                AFLogger = (registerClient + 69) % 128;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getCurrencyIso4217Code(context, AFh1xSDK.onReceive);
                getMonetizationNetwork(new Object[]{this, mediationNetwork}, -1378401160, 1378401168, System.identityHashCode(this));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i11 = AFLogger + 73;
        registerClient = i11 % 128;
        int i12 = i11 % 2;
        getRevenue().e().component1 = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z11) {
        AFLogger = (registerClient + 41) % 128;
        getRevenue().unregisterClient().getMonetizationNetwork(z11);
        int i11 = AFLogger + 63;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z11) {
        int i11 = AFLogger + 69;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z11));
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z11));
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(@NonNull Context context) {
        int i11 = AFLogger + 15;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            getRevenue().copy().getMediationNetwork("getAppsFlyerUID", new String[1]);
            if (context == null) {
                return null;
            }
        } else {
            getRevenue().copy().getMediationNetwork("getAppsFlyerUID", new String[0]);
            if (context == null) {
                return null;
            }
        }
        getMonetizationNetwork(context);
        String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(getRevenue().AFAdRevenueData().getCurrencyIso4217Code);
        registerClient = (AFLogger + 7) % 128;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) getMonetizationNetwork(new Object[]{this, context}, 1233339105, -1233339105, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i11 = registerClient + 75;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            getRevenue().AFInAppEventType().getCurrencyIso4217Code();
            throw null;
        }
        String currencyIso4217Code = getRevenue().AFInAppEventType().getCurrencyIso4217Code();
        int i12 = AFLogger + 55;
        registerClient = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 3 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) getMonetizationNetwork(new Object[]{this}, 595451129, -595451120, System.identityHashCode(this));
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        registerClient = (AFLogger + 103) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String revenue = getMediationNetwork(context).getRevenue("extraReferrers", (String) null);
            if (revenue == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(revenue);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(jCurrentTimeMillis);
                AFLogger = (registerClient + 105) % 128;
            }
            if (jSONObject.length() >= 4) {
                getCurrencyIso4217Code(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            getMediationNetwork(context).getMediationNetwork("extraReferrers", jSONObject.toString());
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e5);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i11 = (registerClient + 109) % 128;
            AFLogger = i11;
            registerClient = (i11 + 13) % 128;
            return string;
        }
        String strAFAdRevenueData = AFAdRevenueData(context, "AF_STORE");
        if (strAFAdRevenueData != null) {
            return strAFAdRevenueData;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getRevenue(com.appsflyer.internal.AFh1sSDK r11) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getRevenue(com.appsflyer.internal.AFh1sSDK):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        registerClient = (AFLogger + 95) % 128;
        getRevenue().copy().getMediationNetwork("getSdkVersion", new String[0]);
        String strAreAllFieldsValid = AFc1kSDK.areAllFieldsValid();
        int i11 = AFLogger + 53;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return strAreAllFieldsValid;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (this.toString) {
            registerClient = (AFLogger + 71) % 128;
            return this;
        }
        this.toString = true;
        getRevenue().AFInAppEventParameterName().getRevenue(str);
        if (context != null) {
            registerClient = (AFLogger + 27) % 128;
            getMonetizationNetwork(context);
            Application applicationO_ = AFj1pSDK.O_(context);
            if (applicationO_ == null) {
                return this;
            }
            registerClient = (AFLogger + 47) % 128;
            this.component3 = applicationO_;
            final int i11 = 0;
            getRevenue().getCurrencyIso4217Code().execute(new Runnable(this) { // from class: com.appsflyer.internal.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AFa1tSDK f9535b;

                {
                    this.f9535b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f9535b.equals();
                            break;
                        default:
                            this.f9535b.copy();
                            break;
                    }
                }
            });
            getRevenue().equals().getMediationNetwork.add(new AFa1ySDK());
            AFe1qSDK aFe1qSDKEquals = getRevenue().equals();
            aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(new AFe1jSDK(getRevenue())));
            getRevenue().afLogForce().getMonetizationNetwork(new a(this));
            AFj1rSDK aFj1rSDKCopydefault = getRevenue().copydefault();
            final int i12 = 1;
            Runnable runnable = new Runnable(this) { // from class: com.appsflyer.internal.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AFa1tSDK f9535b;

                {
                    this.f9535b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.f9535b.equals();
                            break;
                        default:
                            this.f9535b.copy();
                            break;
                    }
                }
            };
            AFi1aSDK aFi1aSDKAFAdRevenueData = aFj1rSDKCopydefault.AFAdRevenueData(runnable);
            Runnable currencyIso4217Code = aFj1rSDKCopydefault.getCurrencyIso4217Code(aFi1aSDKAFAdRevenueData, runnable);
            aFj1rSDKCopydefault.AFAdRevenueData.add(aFi1aSDKAFAdRevenueData);
            aFj1rSDKCopydefault.AFAdRevenueData.add(new AFj1uSDK(aFj1rSDKCopydefault.getCurrencyIso4217Code.AFAdRevenueData(), currencyIso4217Code));
            aFj1rSDKCopydefault.AFAdRevenueData.add(new AFi1eSDK(currencyIso4217Code, aFj1rSDKCopydefault.getCurrencyIso4217Code, new AFi1dSDK()));
            aFj1rSDKCopydefault.AFAdRevenueData.add(new AFj1sSDK(currencyIso4217Code, aFj1rSDKCopydefault.getCurrencyIso4217Code));
            aFj1rSDKCopydefault.AFAdRevenueData.add(new AFj1qSDK(aFj1rSDKCopydefault.getCurrencyIso4217Code.getCurrencyIso4217Code(), aFj1rSDKCopydefault.getCurrencyIso4217Code.AFAdRevenueData(), currencyIso4217Code));
            aFj1rSDKCopydefault.getRevenue(currencyIso4217Code);
            int i13 = 0;
            AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) aFj1rSDKCopydefault.AFAdRevenueData.toArray(new AFj1zSDK[0]);
            int length = aFj1zSDKArr.length;
            while (i13 < length) {
                int i14 = registerClient + 61;
                AFLogger = i14 % 128;
                if (i14 % 2 != 0) {
                    aFj1zSDKArr[i13].getMonetizationNetwork(aFj1rSDKCopydefault.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
                    i13 += 63;
                } else {
                    aFj1zSDKArr[i13].getMonetizationNetwork(aFj1rSDKCopydefault.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
                    i13++;
                }
            }
            if (!aFj1rSDKCopydefault.getCurrencyIso4217Code()) {
                aFj1rSDKCopydefault.getMediationNetwork(aFj1rSDKCopydefault.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code, currencyIso4217Code, aFj1rSDKCopydefault.getCurrencyIso4217Code);
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1lSDK aFd1lSDKCopy = getRevenue().copy();
        if (appsFlyerConversionListener == null) {
            registerClient = (AFLogger + 95) % 128;
            str2 = Address.ADDRESS_NULL_PLACEHOLDER;
        } else {
            str2 = "conversionDataListener";
        }
        aFd1lSDKCopy.getMediationNetwork("init", str, str2);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.18.0." + getMonetizationNetwork + ")");
        this.getCurrencyIso4217Code = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i11 = AFLogger + 11;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            getMonetizationNetwork(context);
            getRevenue().AFAdRevenueData().getMonetizationNetwork(context);
            throw null;
        }
        getMonetizationNetwork(context);
        boolean monetizationNetwork = getRevenue().AFAdRevenueData().getMonetizationNetwork(context);
        int i12 = AFLogger + 51;
        registerClient = i12 % 128;
        if (i12 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        boolean revenue;
        int i11 = registerClient + 99;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            revenue = getRevenue().AFInAppEventParameterName().getRevenue();
            int i12 = 48 / 0;
        } else {
            revenue = getRevenue().AFInAppEventParameterName().getRevenue();
        }
        int i13 = registerClient + 83;
        AFLogger = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 98 / 0;
        }
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        if (!this.toString) {
            AFAdRevenueData("logAdRevenue");
            int i11 = registerClient + 1;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger = (registerClient + 57) % 128;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
        } else if (getRevenue().AFInAppEventParameterName().getRevenue()) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else if (AFk1zSDK.getMediationNetwork(getRevenue().AFInAppEventParameterName().getMonetizationNetwork())) {
            getMonetizationNetwork(new Object[0], -1617966880, 1617966902, (int) System.currentTimeMillis());
        } else {
            getCurrencyIso4217Code(new AFh1qSDK(aFAdRevenueData, map));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMonetizationNetwork(context);
        AFh1lSDK aFh1lSDK = new AFh1lSDK();
        aFh1lSDK.areAllFieldsValid = str;
        aFh1lSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put(StatusResponseUtils.RESULT_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1lSDK.getCurrencyIso4217Code(mapSingletonMap);
        }
        aFh1lSDK.getMediationNetwork = map2;
        AFd1lSDK aFd1lSDKCopy = getRevenue().copy();
        Map map5 = aFh1lSDK.getMediationNetwork;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1lSDKCopy.getMediationNetwork("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1lSDK, (AFh1oSDK) getMonetizationNetwork(new Object[]{this, context}, -536448515, 536448536, System.identityHashCode(this)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d3, double d11) {
        getRevenue().copy().getMediationNetwork("logLocation", String.valueOf(d3), String.valueOf(d11));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d11));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d3));
        getMediationNetwork(context, AFInAppEventType.LOCATION_COORDINATES, map);
        AFLogger = (registerClient + 43) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        registerClient = (AFLogger + 113) % 128;
        getRevenue().copy().getMediationNetwork("logSession", new String[0]);
        getRevenue().copy().getMonetizationNetwork();
        getCurrencyIso4217Code(context, AFh1xSDK.logSession);
        getMediationNetwork(context, null, null);
        AFLogger = (registerClient + 39) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        AFLogger = (registerClient + 103) % 128;
        getRevenue().afInfoLog().getMediationNetwork();
        int i11 = registerClient + 19;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        AFLogger = (registerClient + 77) % 128;
        if (uri == null || uri.toString().isEmpty()) {
            AFa1oSDK aFa1oSDKI = getRevenue().i();
            StringBuilder sb2 = new StringBuilder("Link is \"");
            sb2.append(uri);
            sb2.append("\"");
            aFa1oSDKI.AFAdRevenueData(sb2.toString(), DeepLinkResult.Error.NETWORK);
            AFLogger = (registerClient + 87) % 128;
            return;
        }
        if (context != null) {
            getMonetizationNetwork(context);
            getRevenue().i().g_(AFa1jSDK.getMediationNetwork(getRevenue().afErrorLog()), Uri.parse(uri.toString()));
            return;
        }
        AFa1oSDK aFa1oSDKI2 = getRevenue().i();
        StringBuilder sb3 = new StringBuilder("Context is \"");
        sb3.append(context);
        sb3.append("\"");
        aFa1oSDKI2.AFAdRevenueData(sb3.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        if (intent == null) {
            getRevenue().i().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            AFLogger = (registerClient + 73) % 128;
        } else {
            if (context == null) {
                getRevenue().i().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            getMonetizationNetwork(applicationContext);
            getRevenue().getCurrencyIso4217Code().execute(new q(this, applicationContext, intent, 9));
            int i11 = registerClient + 115;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        getMonetizationNetwork(new Object[]{this, context, appsFlyerConversionListener}, 584622117, -584622104, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        com.appsflyer.internal.AFa1tSDK.getMediationNetwork = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        com.appsflyer.internal.AFa1tSDK.registerClient = (com.appsflyer.internal.AFa1tSDK.AFLogger + 99) % 128;
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerValidatorListener(android.content.Context r4, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r5) {
        /*
            r3 = this;
            int r4 = com.appsflyer.internal.AFa1tSDK.registerClient
            int r4 = r4 + 7
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFLogger = r0
            int r4 = r4 % 2
            java.lang.String r0 = "registerValidatorListener called"
            r1 = 0
            java.lang.String r2 = "registerValidatorListener"
            if (r4 == 0) goto L24
            com.appsflyer.internal.AFd1zSDK r4 = r3.getRevenue()
            com.appsflyer.internal.AFd1lSDK r4 = r4.copy()
            java.lang.String[] r1 = new java.lang.String[r1]
            r4.getMediationNetwork(r2, r1)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L44
            goto L36
        L24:
            com.appsflyer.internal.AFd1zSDK r4 = r3.getRevenue()
            com.appsflyer.internal.AFd1lSDK r4 = r4.copy()
            java.lang.String[] r1 = new java.lang.String[r1]
            r4.getMediationNetwork(r2, r1)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L44
        L36:
            int r4 = com.appsflyer.internal.AFa1tSDK.AFLogger
            int r4 = r4 + 99
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r4
            java.lang.String r4 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r4)
            return
        L44:
            com.appsflyer.internal.AFa1tSDK.getMediationNetwork = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getMonetizationNetwork(new Object[]{this, context, map, purchaseValidationCallback}, 1377152571, -1377152557, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFLogger = (registerClient + 17) % 128;
        getMonetizationNetwork(context);
        PurchaseHandler purchaseHandlerComponent1 = getRevenue().component1();
        if (purchaseHandlerComponent1.getRevenue(map, purchaseValidationCallback, "subscriptions")) {
            AFe1oSDK aFe1oSDK = new AFe1oSDK(map, purchaseValidationCallback, purchaseHandlerComponent1.getCurrencyIso4217Code);
            AFe1qSDK aFe1qSDK = purchaseHandlerComponent1.AFAdRevenueData;
            aFe1qSDK.getMonetizationNetwork.execute(aFe1qSDK.new AnonymousClass1(aFe1oSDK));
        }
        registerClient = (AFLogger + 45) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(android.app.Activity r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -123240693, 123240713, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        getMonetizationNetwork(new Object[]{this, str}, 2094756740, -2094756729, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFLogger = (registerClient + 111) % 128;
        getRevenue().copy().getMediationNetwork("setAppId", str);
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
        int i11 = registerClient + 37;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.registerClient
            int r0 = r0 + 91
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFLogger = r1
            int r0 = r0 % 2
            java.lang.String r1 = "oneLinkSlug"
            java.lang.String r2 = "setAppInviteOneLink = "
            java.lang.String r3 = "setAppInviteOneLink"
            if (r0 == 0) goto L2f
            com.appsflyer.internal.AFd1zSDK r0 = r5.getRevenue()
            com.appsflyer.internal.AFd1lSDK r0 = r0.copy()
            java.lang.String[] r4 = new java.lang.String[]{r6}
            r0.getMediationNetwork(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r6 == 0) goto L59
            goto L4b
        L2f:
            com.appsflyer.internal.AFd1zSDK r0 = r5.getRevenue()
            com.appsflyer.internal.AFd1lSDK r0 = r0.copy()
            java.lang.String[] r4 = new java.lang.String[]{r6}
            r0.getMediationNetwork(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r6 == 0) goto L59
        L4b:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L74
        L59:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r0.remove(r2)
        L74:
            getMediationNetwork(r1, r6)
            int r6 = com.appsflyer.internal.AFa1tSDK.AFLogger
            int r6 = r6 + 7
            int r0 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L84
            return
        L84:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z11) {
        registerClient = (AFLogger + 77) % 128;
        getRevenue().copy().getMediationNetwork("setCollectAndroidID", String.valueOf(z11));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z11));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z11));
        int i11 = registerClient + 47;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 16 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z11) {
        AFLogger = (registerClient + 85) % 128;
        getRevenue().copy().getMediationNetwork("setCollectIMEI", String.valueOf(z11));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z11));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z11));
        registerClient = (AFLogger + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z11) {
        AFLogger = (registerClient + 17) % 128;
        getRevenue().copy().getMediationNetwork("setCollectOaid", String.valueOf(z11));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z11));
        int i11 = AFLogger + 83;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 70 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        AFLogger = (registerClient + 107) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        getRevenue().e().areAllFieldsValid = appsFlyerConsent;
        registerClient = (AFLogger + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        getMonetizationNetwork(new Object[]{this, str}, -1615724461, 1615724462, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            int i11 = AFLogger + 17;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                getCurrencyIso4217Code();
                throw null;
            }
            if (!getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                registerClient = (AFLogger + 113) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getRevenue().getMediationNetwork());
            getCurrencyIso4217Code(context, AFh1xSDK.setCustomerIdAndLogSession);
            getRevenue().AFInAppEventParameterName().getMonetizationNetwork();
            if (referrer == null) {
                int i12 = registerClient + 57;
                AFLogger = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                referrer = "";
            }
            if (context instanceof Activity) {
                registerClient = (AFLogger + 31) % 128;
                ((Activity) context).getIntent();
            }
            getCurrencyIso4217Code(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        registerClient = (AFLogger + 101) % 128;
        getRevenue().copy().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, 1660171217, -1660171210, (int) System.currentTimeMillis());
        int i11 = registerClient + 35;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 50 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z11) {
        registerClient = (AFLogger + 7) % 128;
        setLogLevel(z11 ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
        int i11 = AFLogger + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 45 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDisableAdvertisingIdentifiers(boolean r4) {
        /*
            r3 = this;
            java.lang.String r0 = "setDisableAdvertisingIdentifiers: "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = 0
            if (r4 != 0) goto L1c
            int r1 = com.appsflyer.internal.AFa1tSDK.registerClient
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFLogger = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L1e
        L1c:
            r1 = r0
            goto L1f
        L1e:
            r1 = 1
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.appsflyer.internal.AFb1jSDK.getRevenue = r1
            com.appsflyer.internal.AFd1zSDK r1 = r3.getRevenue()
            com.appsflyer.internal.AFc1gSDK r2 = r1.e()
            r2.component4 = r4
            if (r4 == 0) goto L5c
            int r4 = com.appsflyer.internal.AFa1tSDK.registerClient
            int r4 = r4 + 29
            int r2 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFLogger = r2
            int r4 = r4 % 2
            r2 = 0
            if (r4 == 0) goto L48
            com.appsflyer.internal.AFc1gSDK r4 = r1.e()
            r4.component2 = r2
            r4 = 11
            int r4 = r4 / r0
            goto L4e
        L48:
            com.appsflyer.internal.AFc1gSDK r4 = r1.e()
            r4.component2 = r2
        L4e:
            int r4 = com.appsflyer.internal.AFa1tSDK.AFLogger
            int r4 = r4 + 15
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L5b
            return
        L5b:
            throw r2
        L5c:
            com.appsflyer.internal.AFe1qSDK r4 = r1.equals()
            com.appsflyer.internal.AFe1jSDK r0 = new com.appsflyer.internal.AFe1jSDK
            com.appsflyer.internal.AFd1zSDK r1 = r3.getRevenue()
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r4.getMonetizationNetwork
            com.appsflyer.internal.AFe1qSDK$1 r2 = new com.appsflyer.internal.AFe1qSDK$1
            r2.<init>(r0)
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setDisableAdvertisingIdentifiers(boolean):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z11) {
        AFLogger = (registerClient + 65) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z11)));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z11)}, 1660171217, -1660171210, (int) System.currentTimeMillis());
        int i11 = AFLogger + 65;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i11 = registerClient + 115;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            getRevenue().copy().getMediationNetwork("setExtension", str);
        } else {
            getRevenue().copy().getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        String strTrim;
        registerClient = (AFLogger + 91) % 128;
        if (AFk1zSDK.getRevenue(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        if (str != null) {
            strTrim = str.trim();
        } else {
            AFLogger = (registerClient + 15) % 128;
            strTrim = "";
        }
        AFe1vSDK.getMediationNetwork(new AFe1xSDK(strTrim, str2.trim()));
        AFLogger = (registerClient + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        registerClient = (AFLogger + 53) % 128;
        getRevenue().copy().getMediationNetwork("setImeiData", str);
        AFf1kSDK aFf1kSDKAFInAppEventParameterName = getRevenue().AFInAppEventParameterName();
        AFf1kSDK.getMonetizationNetwork(new Object[]{aFf1kSDKAFInAppEventParameterName, str}, 1176564115, -1176564113, System.identityHashCode(aFf1kSDKAFInAppEventParameterName));
        int i11 = registerClient + 7;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) {
        getRevenue().copy().getMediationNetwork("setInstallId", new String[0]);
        if (!this.toString) {
            int i11 = AFLogger + 61;
            registerClient = i11 % 128;
            if (i11 % 2 != 0) {
                AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
                return;
            } else {
                AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
                throw null;
            }
        }
        if (getRevenue().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            if (str != null) {
                AFb1iSDK.getCurrencyIso4217Code(str, getRevenue().getMediationNetwork());
                return;
            } else {
                registerClient = (AFLogger + 11) % 128;
                AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
                return;
            }
        }
        int i12 = AFLogger + 21;
        registerClient = i12 % 128;
        if (i12 % 2 != 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
        } else {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z11) {
        registerClient = (AFLogger + 97) % 128;
        getRevenue().copy().getMediationNetwork("setIsUpdate", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z11);
        int i11 = registerClient + 109;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        getMonetizationNetwork(new Object[]{this, logLevel}, -1560585851, 1560585867, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i11) {
        int i12 = registerClient + 107;
        AFLogger = i12 % 128;
        int i13 = i12 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (i13 == 0) {
            this.component2 = timeUnit.toMillis(i11);
        } else {
            this.component2 = timeUnit.toMillis(i11);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFLogger = (registerClient + 75) % 128;
        getRevenue().copy().getMediationNetwork("setOaidData", str);
        AFb1jSDK.getCurrencyIso4217Code = str;
        int i11 = registerClient + 65;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i11 = registerClient + 9;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = "setOneLinkCustomDomain " + Arrays.toString(strArr);
        }
        AFLogger.afDebugLog(str);
        getRevenue().i().component2 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i11 = AFLogger;
        registerClient = (i11 + 65) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        registerClient = (i11 + 83) % 128;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r5.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r5.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = new java.lang.StringBuilder("Setting partner data for ");
        r1.append(r4);
        r1.append(": ");
        r1.append(r5);
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = new org.json.JSONObject(r5).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r5 = new java.util.HashMap();
        r5.put(com.adyen.checkout.components.core.internal.util.StatusResponseUtils.RESULT_ERROR, "limit exceeded: ".concat(java.lang.String.valueOf(r1)));
        r0.getMediationNetwork.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        r0.getMonetizationNetwork.put(r4, r5);
        r0.getMediationNetwork.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPartnerData(@androidx.annotation.NonNull java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setPartnerData(java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i11 = registerClient + 83;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            getRevenue().e().AFAdRevenueData = AFj1jSDK.getCurrencyIso4217Code(str);
        } else {
            getRevenue().e().AFAdRevenueData = AFj1jSDK.getCurrencyIso4217Code(str);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i11 = registerClient + 9;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            getRevenue().AFLogger().getRevenue(pluginInfo);
            throw null;
        }
        Objects.requireNonNull(pluginInfo);
        getRevenue().AFLogger().getRevenue(pluginInfo);
        registerClient = (AFLogger + 45) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i11 = AFLogger + 57;
                registerClient = i11 % 128;
                if (i11 % 2 == 0) {
                    jSONObject.put("pid", str);
                    throw null;
                }
                jSONObject.put("pid", str);
            }
            if (str2 != null) {
                AFLogger = (registerClient + 59) % 128;
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger = (registerClient + 55) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFa1oSDK aFa1oSDKI = getRevenue().i();
        aFa1oSDKI.areAllFieldsValid.clear();
        aFa1oSDKI.areAllFieldsValid.addAll(Arrays.asList(strArr));
        registerClient = (AFLogger + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i11 = registerClient + 5;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners(strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i11 = AFLogger + 75;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        int i12 = AFLogger + 95;
        registerClient = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getRevenue().e().getMonetizationNetwork = new AFb1uSDK(strArr);
        int i11 = registerClient + 119;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getRevenue().copy().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i11 = 0;
        while (i11 < length) {
            String str2 = strArr[i11];
            if (AnonymousClass3.getMonetizationNetwork[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1jSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                AFLogger = (registerClient + 103) % 128;
                str = "plain_el_arr";
            }
            i11++;
            registerClient = (AFLogger + 1) % 128;
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (getRevenue().afInfoLog().getMonetizationNetwork()) {
            return;
        }
        if (!this.toString) {
            AFLogger = (registerClient + 47) % 128;
            AFAdRevenueData("start");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                AFLogger = (registerClient + 27) % 128;
                return;
            }
        }
        getMonetizationNetwork(context);
        final AFh1uSDK aFh1uSDKComponent2 = getRevenue().component2();
        aFh1uSDKComponent2.getRevenue(AFh1zSDK.AFAdRevenueData(context));
        if (this.component3 == null) {
            Application applicationO_ = AFj1pSDK.O_(context);
            if (applicationO_ == null) {
                return;
            }
            int i11 = registerClient + 87;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                this.component3 = applicationO_;
                throw null;
            }
            this.component3 = applicationO_;
        }
        getRevenue().copy().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, "Starting AppsFlyer: (v6.18.0." + str2 + ")");
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.i(aFg1cSDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(getRevenue().getMediationNetwork());
        if (!TextUtils.isEmpty(str)) {
            registerClient = (AFLogger + 95) % 128;
            getRevenue().AFInAppEventParameterName().getRevenue(str);
        } else if (TextUtils.isEmpty(getRevenue().AFInAppEventParameterName().getMonetizationNetwork())) {
            getMonetizationNetwork(new Object[0], -1617966880, 1617966902, (int) System.currentTimeMillis());
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        getRevenue().component3().AFAdRevenueData(getMonetizationNetwork());
        component3();
        c_(this.component3.getBaseContext(), this.copydefault.AFAdRevenueData().n_());
        getRevenue().unregisterClient().getCurrencyIso4217Code();
        this.copydefault.afInfoLog().getMonetizationNetwork(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.1
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getCurrencyIso4217Code() {
                Context context2 = AFa1tSDK.this.getRevenue().registerClient().getCurrencyIso4217Code;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1uSDK aFh1uSDK = aFh1uSDKComponent2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j9 = aFh1uSDK.component1;
                if (j9 != 0) {
                    long j11 = jCurrentTimeMillis - j9;
                    if (j11 > 0 && j11 < 1000) {
                        j11 = 1000;
                    }
                    long j12 = j11 / 1000;
                    aFh1uSDK.equals = j12;
                    aFh1uSDK.AFAdRevenueData.getRevenue("prev_session_dur", j12);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1tSDK.this.getRevenue().afLogForce().getCurrencyIso4217Code();
                AFd1lSDK aFd1lSDKCopy = AFa1tSDK.this.getRevenue().copy();
                if (aFd1lSDKCopy.component3()) {
                    aFd1lSDKCopy.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1lSDKCopy.q_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1lSDKCopy.getCurrencyIso4217Code();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1tSDK.this.getRevenue().component4().getMediationNetwork();
                AFa1tSDK.this.getRevenue().afErrorLog().getRevenue();
                AFh1wSDK aFh1wSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.getRevenue().afErrorLogForExcManagerOnly();
                if (aFh1wSDKAfErrorLogForExcManagerOnly != null) {
                    aFh1wSDKAfErrorLogForExcManagerOnly.getRevenue();
                }
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getMediationNetwork(@NonNull AFh1oSDK aFh1oSDK) {
                Intent intent;
                aFh1uSDKComponent2.getMonetizationNetwork();
                AFd1zSDK revenue = AFa1tSDK.this.getRevenue();
                revenue.component3().AFAdRevenueData(AFa1tSDK.this.getMonetizationNetwork());
                AFa1tSDK.this.component3();
                int currencyIso4217Code = revenue.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (currencyIso4217Code < 2) {
                    AFa1tSDK.this.getRevenue().component4().getMonetizationNetwork();
                }
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                if (aFh1oSDK != null) {
                    AFa1tSDK.this.getRevenue().i().f_(AFa1jSDK.getRevenue(aFh1mSDK), aFh1oSDK.getMonetizationNetwork, revenue.registerClient().getCurrencyIso4217Code);
                    AFh1wSDK aFh1wSDKAfErrorLogForExcManagerOnly = revenue.afErrorLogForExcManagerOnly();
                    if (aFh1wSDKAfErrorLogForExcManagerOnly != null && (intent = aFh1oSDK.getMonetizationNetwork) != null) {
                        aFh1wSDKAfErrorLogForExcManagerOnly.u_(intent, AFa1tSDK.this.getRevenue().i());
                    }
                }
                AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                aFh1mSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
                aFa1tSDK.getMonetizationNetwork(aFh1mSDK, aFh1oSDK);
            }
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z11, Context context) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z11), context}, -62521364, 62521374, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j9) {
        int i11 = AFLogger + 97;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            getRevenue().i().getRevenue = deepLinkListener;
            getRevenue().i().component3 = j9;
        } else {
            getRevenue().i().getRevenue = deepLinkListener;
            getRevenue().i().component3 = j9;
            int i12 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i11 = registerClient + 39;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            getRevenue().copy().getMediationNetwork("unregisterConversionListener", new String[1]);
        } else {
            getRevenue().copy().getMediationNetwork("unregisterConversionListener", new String[0]);
        }
        this.getCurrencyIso4217Code = null;
        registerClient = (AFLogger + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getMonetizationNetwork(context);
        AFf1bSDK aFf1bSDK = new AFf1bSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1xSDK monetizationNetwork = aFf1bSDK.getMonetizationNetwork();
        if (monetizationNetwork == null || !str.equals(monetizationNetwork.AFAdRevenueData)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z11 = monetizationNetwork == null || jCurrentTimeMillis - monetizationNetwork.getMonetizationNetwork > ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT;
            AFg1xSDK aFg1xSDK = new AFg1xSDK(str, jCurrentTimeMillis, !z11);
            aFf1bSDK.getCurrencyIso4217Code.getMediationNetwork("afUninstallToken", aFg1xSDK.AFAdRevenueData);
            aFf1bSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken_received_time", aFg1xSDK.getMonetizationNetwork);
            aFf1bSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken_queued", aFg1xSDK.getMediationNetwork);
            if (z11) {
                AFd1zSDK revenue = getMediationNetwork().getRevenue();
                AFf1sSDK aFf1sSDK = new AFf1sSDK(str, revenue);
                AFe1qSDK aFe1qSDKEquals = revenue.equals();
                aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFf1sSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String string;
        AFLogger = (registerClient + 7) % 128;
        AFd1lSDK aFd1lSDKCopy = getRevenue().copy();
        if (map == null) {
            string = "";
        } else {
            string = map.toString();
            registerClient = (AFLogger + 37) % 128;
        }
        aFd1lSDKCopy.getMediationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, string);
        if (!getRevenue().AFInAppEventParameterName().getRevenue()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sbT = e0.f.t("Validate in app called with parameters: ", str3, " ", str4, " ");
            sbT.append(str5);
            aFLogger.i(aFg1cSDK, sbT.toString());
            AFLogger = (registerClient + 115) % 128;
        }
        if (str != null && str4 != null && str2 != null && str5 != null) {
            registerClient = (AFLogger + 43) % 128;
            if (str3 != null) {
                new Thread(new com.appsflyer.internal.AFa1ySDK(context.getApplicationContext(), getRevenue().AFInAppEventParameterName().getMonetizationNetwork(), str, str2, str3, str4, str5, map)).start();
                return;
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i11 = AFLogger + 99;
            registerClient = i11 % 128;
            if (i11 % 2 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                int i12 = 71 / 0;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z11) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z11)}, -680096747, 680096764, System.identityHashCode(this));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public class AFa1ySDK implements AFe1tSDK {
        public AFa1ySDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getCurrencyIso4217Code() {
            AFa1tSDK.this.getRevenue(new AFh1pSDK());
            return Unit.f26487a;
        }

        private boolean getMonetizationNetwork() {
            return AFa1tSDK.this.getCurrencyIso4217Code != null;
        }

        @Override // com.appsflyer.internal.AFe1tSDK
        public final void getMediationNetwork(AFe1uSDK<?> aFe1uSDK, AFe1rSDK aFe1rSDK) {
            JSONObject jSONObjectAFAdRevenueData;
            AFg1xSDK monetizationNetwork;
            if (!(aFe1uSDK instanceof AFf1rSDK)) {
                if (!(aFe1uSDK instanceof AFg1nSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                    return;
                }
                AFg1qSDK aFg1qSDK = new AFg1qSDK(AFa1tSDK.this.getRevenue());
                AFe1qSDK aFe1qSDKEquals = AFa1tSDK.this.getRevenue().equals();
                aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFg1qSDK));
                return;
            }
            AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1uSDK;
            boolean z11 = aFe1uSDK instanceof AFf1tSDK;
            if (z11 && getMonetizationNetwork()) {
                AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1uSDK;
                if (aFf1tSDK.AFAdRevenueData == AFe1rSDK.SUCCESS || aFf1tSDK.getCurrencyIso4217Code == 1) {
                    AFg1nSDK aFg1nSDK = new AFg1nSDK(aFf1tSDK, AFa1tSDK.this.getRevenue().getMediationNetwork());
                    AFe1qSDK aFe1qSDKEquals2 = AFa1tSDK.this.getRevenue().equals();
                    aFe1qSDKEquals2.getMonetizationNetwork.execute(aFe1qSDKEquals2.new AnonymousClass1(aFg1nSDK));
                }
            }
            AFh1wSDK aFh1wSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.getRevenue().afErrorLogForExcManagerOnly();
            if (aFh1wSDKAfErrorLogForExcManagerOnly != null && z11) {
                aFh1wSDKAfErrorLogForExcManagerOnly.getCurrencyIso4217Code((AFf1tSDK) aFe1uSDK, new d(this, 0));
            }
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                aFa1tSDK.getMediationNetwork(aFa1tSDK.component3).getMediationNetwork("sentSuccessfully", "true");
                if (!(aFe1uSDK instanceof AFf1sSDK) && (monetizationNetwork = new AFf1bSDK(AFa1tSDK.this.component3).getMonetizationNetwork()) != null && monetizationNetwork.getMediationNetwork) {
                    String str = monetizationNetwork.AFAdRevenueData;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1zSDK revenue = AFa1tSDK.getMediationNetwork().getRevenue();
                    AFf1sSDK aFf1sSDK = new AFf1sSDK(str, revenue);
                    AFe1qSDK aFe1qSDKEquals3 = revenue.equals();
                    aFe1qSDKEquals3.getMonetizationNetwork.execute(aFe1qSDKEquals3.new AnonymousClass1(aFf1sSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1bSDK) aFf1rSDK).component4;
                if (responseNetwork != null && (jSONObjectAFAdRevenueData = AFa1qSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                    AFa1tSDK.this.component1 = jSONObjectAFAdRevenueData.optBoolean("send_background", false);
                }
                if (z11) {
                    AFa1tSDK.this.getRevenue = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1tSDK
        public final void getMonetizationNetwork(AFe1uSDK<?> aFe1uSDK) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        getRevenue(new AFh1pSDK());
        int i11 = AFLogger + 67;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        registerClient = (AFLogger + 7) % 128;
        String monetizationNetwork = aFa1tSDK.getRevenue().AFInAppEventType().getMonetizationNetwork();
        int i11 = registerClient + 93;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 19 / 0;
        }
        return monetizationNetwork;
    }

    private static void copydefault() {
        getMonetizationNetwork(new Object[0], -1617966880, 1617966902, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i11 = AFLogger + 107;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, 3000L);
            int i12 = AFLogger + 31;
            registerClient = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return;
        }
        subscribeForDeepLink(deepLinkListener, 3000L);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        getMonetizationNetwork(new Object[]{this}, -1455645768, 1455645787, System.identityHashCode(this));
    }

    private void areAllFieldsValid() {
        AFLogger = (registerClient + 117) % 128;
        try {
            final AFi1nSDK aFi1nSDKV = getRevenue().v();
            if (aFi1nSDKV == null) {
                return;
            }
            if (aFi1nSDKV.AFAdRevenueData()) {
                aFi1nSDKV.getMediationNetwork(new AFi1iSDK() { // from class: com.appsflyer.internal.b
                    @Override // com.appsflyer.internal.AFi1iSDK
                    public final void onRequestFinished() {
                        this.f9532a.getMonetizationNetwork(aFi1nSDKV);
                    }
                });
                return;
            }
            if (!aFi1nSDKV.getMediationNetwork()) {
                getRevenue(aFi1nSDKV);
            }
            int i11 = registerClient + 15;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th2);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th2)));
        }
    }

    public static void component4() {
        AFInAppEventParameterName = 8065615358880487326L;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        AFLogger = (registerClient + 101) % 128;
        getRevenue().copy().getMediationNetwork("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        registerClient = (AFLogger + 95) % 128;
    }

    public final void component3() {
        AFLogger = (registerClient + 15) % 128;
        if (AFe1fSDK.areAllFieldsValid()) {
            int i11 = AFLogger + 89;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        AFd1zSDK revenue = getRevenue();
        AFe1qSDK aFe1qSDKEquals = revenue.equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(new AFe1fSDK(revenue)));
    }

    public static AFa1tSDK getMediationNetwork() {
        int i11 = AFLogger + 115;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return areAllFieldsValid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) {
        registerClient = (AFLogger + 31) % 128;
        aFd1zSDK.AFKeystoreWrapper().getMonetizationNetwork();
        registerClient = (AFLogger + 95) % 128;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i11 = registerClient + 59;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
    }

    private void getMediationNetwork(Context context, String str, Map<String, Object> map) {
        AFh1lSDK aFh1lSDK = new AFh1lSDK();
        aFh1lSDK.areAllFieldsValid = str;
        aFh1lSDK.getMediationNetwork = map;
        getMonetizationNetwork(aFh1lSDK, (AFh1oSDK) getMonetizationNetwork(new Object[]{this, context}, -536448515, 536448536, System.identityHashCode(this)));
        int i11 = registerClient + 115;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        registerClient = (AFLogger + 79) % 128;
        getRevenue(aFh1sSDK);
        registerClient = (AFLogger + 111) % 128;
    }

    private void getMediationNetwork(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) && map.get("advertiserId") != null) {
            registerClient = (AFLogger + 117) % 128;
            try {
                if (AFk1zSDK.getMediationNetwork(getRevenue().e().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                AFf1kSDK aFf1kSDKAFInAppEventParameterName = getRevenue().AFInAppEventParameterName();
                if (!AFk1zSDK.getMediationNetwork((String) AFf1kSDK.getMonetizationNetwork(new Object[]{aFf1kSDKAFInAppEventParameterName}, -211782084, 211782085, System.identityHashCode(aFf1kSDKAFInAppEventParameterName))) || map.remove("imei") == null) {
                    return;
                }
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                return;
            } catch (Exception e5) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e5);
            }
        }
        int i11 = AFLogger + 119;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 73 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        getMonetizationNetwork(new Object[]{this, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback}, -1225547846, 1225547850, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        boolean z11 = false;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AFLogger.LogLevel logLevel = (AFLogger.LogLevel) objArr[1];
        AFLogger = (registerClient + 95) % 128;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            AFLogger = (registerClient + 117) % 128;
            z11 = true;
        }
        aFa1tSDK.getRevenue().copy().getMediationNetwork("log", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!z11) {
            int i11 = AFLogger + 121;
            registerClient = i11 % 128;
            if (i11 % 2 != 0) {
                aFa1tSDK.getRevenue().afDebugLog().AFAdRevenueData();
                return null;
            }
            aFa1tSDK.getRevenue().afDebugLog().AFAdRevenueData();
            throw null;
        }
        aFa1tSDK.getRevenue().afDebugLog().areAllFieldsValid();
        return null;
    }

    private static void getMediationNetwork(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                registerClient = (AFLogger + 113) % 128;
                getMediationNetwork("preInstallName", str);
            } else {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                registerClient = (AFLogger + 15) % 128;
            }
        } catch (JSONException e5) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e5);
        }
    }

    private static void component2(Context context) {
        getMonetizationNetwork(new Object[]{context}, 847967095, -847967080, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1tSDK mediationNetwork;
        SharedPreferences sharedPreferences;
        Context context = (Context) objArr[0];
        if (getMediationNetwork().equals == null) {
            int i11 = registerClient + 95;
            AFLogger = i11 % 128;
            StrictMode.ThreadPolicy threadPolicy = i11 % 2;
            try {
                if (threadPolicy != 0) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    mediationNetwork = getMediationNetwork();
                    sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    threadPolicy = threadPolicyAllowThreadDiskReads;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                    mediationNetwork = getMediationNetwork();
                    sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    threadPolicy = threadPolicyAllowThreadDiskReads2;
                }
                mediationNetwork.equals = sharedPreferences;
                registerClient = (AFLogger + 59) % 128;
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        return getMediationNetwork().equals;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        AFLogger = (registerClient + 57) % 128;
        logEvent(context, str, map, null);
        registerClient = (AFLogger + 103) % 128;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        AFLogger = (registerClient + 19) % 128;
        AppsFlyerProperties.getInstance().set(str, zBooleanValue);
        int i11 = registerClient + 5;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final AFc1jSDK getMediationNetwork(Context context) {
        int i11 = AFLogger + 119;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            getMonetizationNetwork(context);
            AFc1jSDK mediationNetwork = getRevenue().getMediationNetwork();
            registerClient = (AFLogger + 7) % 128;
            return mediationNetwork;
        }
        getMonetizationNetwork(context);
        getRevenue().getMediationNetwork();
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        int i11 = AFLogger + 53;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID);
            throw null;
        }
        if (getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) && AFAdRevenueData() == null) {
            AFLogger = (registerClient + 121) % 128;
            return true;
        }
        int i12 = AFLogger + 53;
        registerClient = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 27 / 0;
        }
        return false;
    }

    public static String AFAdRevenueData() {
        registerClient = (AFLogger + 61) % 128;
        String str = (String) getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_USER_ID}, -1072478610, 1072478634, (int) System.currentTimeMillis());
        int i11 = registerClient + 35;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 59 / 0;
        }
        return str;
    }

    private void getCurrencyIso4217Code(Context context, AFh1xSDK aFh1xSDK) {
        getMonetizationNetwork(context);
        AFh1uSDK aFh1uSDKComponent2 = getRevenue().component2();
        AFh1zSDK aFh1zSDKAFAdRevenueData = AFh1zSDK.AFAdRevenueData(context);
        if (aFh1uSDKComponent2.getMediationNetwork()) {
            AFLogger = (registerClient + 29) % 128;
            aFh1uSDKComponent2.getCurrencyIso4217Code.put("api_name", aFh1xSDK.toString());
            aFh1uSDKComponent2.getRevenue(aFh1zSDKAFAdRevenueData);
            AFLogger = (registerClient + 81) % 128;
        }
        aFh1uSDKComponent2.getMonetizationNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1nSDK aFf1nSDK) {
        AFLogger = (registerClient + 113) % 128;
        AFd1zSDK revenue = getRevenue();
        if (aFf1nSDK == AFf1nSDK.SUCCESS) {
            revenue.afLogForce().getRevenue();
            registerClient = (AFLogger + 105) % 128;
        }
        if (!revenue.copy().getRevenue()) {
            revenue.afDebugLog().getMonetizationNetwork();
        } else {
            revenue.afDebugLog().getMediationNetwork();
        }
    }

    public static int getMediationNetwork(AFc1jSDK aFc1jSDK, boolean z11) {
        int i11 = AFLogger + 17;
        registerClient = i11 % 128;
        int i12 = i11 % 2;
        Object[] objArr = {aFc1jSDK, "appsFlyerCount", Boolean.valueOf(z11)};
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        if (i12 == 0) {
            ((Integer) getMonetizationNetwork(objArr, -1820164421, 1820164423, iCurrentTimeMillis)).intValue();
            throw null;
        }
        int iIntValue = ((Integer) getMonetizationNetwork(objArr, -1820164421, 1820164423, iCurrentTimeMillis)).intValue();
        AFLogger = (registerClient + 71) % 128;
        return iIntValue;
    }

    private static String AFAdRevenueData(Activity activity) {
        Intent intent;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("af");
                    if (string != null) {
                        int i11 = AFLogger + 115;
                        registerClient = i11 % 128;
                        try {
                            if (i11 % 2 != 0) {
                                AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                            } else {
                                AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                                throw null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = string;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return str;
                        }
                    }
                    str = string;
                }
                AFLogger = (registerClient + 47) % 128;
                return str;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return str;
    }

    private static void getCurrencyIso4217Code(@NonNull AFh1sSDK aFh1sSDK, AFh1oSDK aFh1oSDK) {
        int i11 = registerClient;
        AFLogger = (i11 + 85) % 128;
        if (aFh1oSDK != null) {
            AFLogger = (i11 + 99) % 128;
            aFh1sSDK.getMonetizationNetwork = aFh1oSDK.getCurrencyIso4217Code;
            aFh1sSDK.equals = aFh1oSDK.AFAdRevenueData;
            AFLogger = (i11 + 33) % 128;
        }
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long j9) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        String str = simpleDateFormat.format(new Date(j9));
        int i11 = AFLogger + 9;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(Context context, String str) {
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        getMonetizationNetwork(context);
        aFh1mSDK.areAllFieldsValid = null;
        aFh1mSDK.getMediationNetwork = null;
        aFh1mSDK.component2 = str;
        aFh1mSDK.getMonetizationNetwork = null;
        getCurrencyIso4217Code(aFh1mSDK);
        registerClient = (AFLogger + 91) % 128;
    }

    private String AFAdRevenueData(Context context, String str) {
        if (context == null) {
            int i11 = AFLogger + 87;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 65 / 0;
            }
            return null;
        }
        getMonetizationNetwork(context);
        String monetizationNetwork = getRevenue().AFAdRevenueData().getMonetizationNetwork(str);
        int i13 = registerClient + 111;
        AFLogger = i13 % 128;
        if (i13 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        boolean z11;
        int i11 = registerClient + 95;
        int i12 = i11 % 128;
        AFLogger = i12;
        if (i11 % 2 == 0) {
            if (aFh1sSDK.areAllFieldsValid == null) {
                registerClient = (i12 + 35) % 128;
                z11 = true;
            } else {
                z11 = false;
            }
            if (getCurrencyIso4217Code()) {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            }
            if (z11) {
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                    if (component2()) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFh1sSDK.getCurrencyIso4217Code;
                        if (appsFlyerRequestListener != null) {
                            registerClient = (AFLogger + 25) % 128;
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            return;
                        }
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    registerClient = (AFLogger + 77) % 128;
                }
                this.component4 = System.currentTimeMillis();
            }
            getRevenue(aFh1sSDK);
            return;
        }
        String str = aFh1sSDK.areAllFieldsValid;
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFc1jSDK aFc1jSDK = (AFc1jSDK) objArr[0];
        String str = (String) objArr[1];
        int i11 = registerClient + 5;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            String revenue = aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
            if (revenue != null) {
                return revenue;
            }
            aFc1jSDK.getMediationNetwork("CACHED_CHANNEL", str);
            AFLogger = (registerClient + 41) % 128;
            return str;
        }
        aFc1jSDK.getRevenue("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static int AFAdRevenueData(AFc1jSDK aFc1jSDK, boolean z11) {
        registerClient = (AFLogger + 49) % 128;
        int iIntValue = ((Integer) getMonetizationNetwork(new Object[]{aFc1jSDK, "appsFlyerInAppEventCount", Boolean.valueOf(z11)}, -1820164421, 1820164423, (int) System.currentTimeMillis())).intValue();
        int i11 = AFLogger + 19;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 63 / 0;
        }
        return iIntValue;
    }

    private static void AFAdRevenueData(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb2.toString());
        int i11 = registerClient + 87;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static int AFAdRevenueData(AFc1jSDK aFc1jSDK, String str, boolean z11) {
        return ((Integer) getMonetizationNetwork(new Object[]{aFc1jSDK, str, Boolean.valueOf(z11)}, -1820164421, 1820164423, (int) System.currentTimeMillis())).intValue();
    }

    private static void AFAdRevenueData(String str, boolean z11) {
        getMonetizationNetwork(new Object[]{str, Boolean.valueOf(z11)}, 1660171217, -1660171210, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z11) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z11)}, -1121211786, 1121211791, System.identityHashCode(this));
    }

    public static String getCurrencyIso4217Code(AFc1jSDK aFc1jSDK, String str) {
        return (String) getMonetizationNetwork(new Object[]{aFc1jSDK, str}, -195097357, 195097363, (int) System.currentTimeMillis());
    }

    private AFh1oSDK getCurrencyIso4217Code(Context context) {
        return (AFh1oSDK) getMonetizationNetwork(new Object[]{this, context}, -536448515, 536448536, System.identityHashCode(this));
    }

    private static String getCurrencyIso4217Code(String str) {
        return (String) getMonetizationNetwork(new Object[]{str}, -1072478610, 1072478634, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, -1960394132, 1960394155, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        getMonetizationNetwork(new Object[]{this, context}, 614179736, -614179718, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        AFLogger = (registerClient + 11) % 128;
        if (zBooleanValue) {
            aFa1tSDK.getRevenue().afDebugLog().getCurrencyIso4217Code();
            int i11 = AFLogger + 27;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 52 / 0;
            }
            return null;
        }
        aFa1tSDK.getRevenue().afDebugLog().getRevenue();
        return null;
    }

    private void getRevenue(AFi1nSDK aFi1nSDK) {
        AFe1cSDK aFe1cSDK = new AFe1cSDK(aFi1nSDK, getRevenue().AFAdRevenueData(), getRevenue(), getRevenue().areAllFieldsValid(), getRevenue().registerClient());
        AFe1qSDK aFe1qSDKEquals = getRevenue().equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFe1cSDK));
        int i11 = registerClient + 105;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final AFd1zSDK getRevenue() {
        int i11 = (registerClient + 47) % 128;
        AFLogger = i11;
        AFc1cSDK aFc1cSDK = this.copydefault;
        int i12 = i11 + 97;
        registerClient = i12 % 128;
        if (i12 % 2 != 0) {
            return aFc1cSDK;
        }
        throw null;
    }

    public static boolean getRevenue(Context context) {
        registerClient = (AFLogger + 95) % 128;
        try {
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
        if (GoogleApiAvailability.f11044d.b(context, com.google.android.gms.common.a.f11047a) == 0) {
            return true;
        }
        registerClient = (AFLogger + 113) % 128;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e5) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e5);
            return false;
        }
    }

    private static boolean getRevenue(String str) {
        return ((Boolean) getMonetizationNetwork(new Object[]{str}, -970221310, 970221322, (int) System.currentTimeMillis())).booleanValue();
    }

    public final void getMonetizationNetwork(@NonNull Context context) {
        int i11 = AFLogger;
        registerClient = (i11 + 19) % 128;
        AFc1cSDK aFc1cSDK = this.copydefault;
        if (context != null) {
            AFc1fSDK aFc1fSDK = aFc1cSDK.AFAdRevenueData;
            if (context != null) {
                registerClient = (i11 + 57) % 128;
                aFc1fSDK.getCurrencyIso4217Code = context.getApplicationContext();
                registerClient = (AFLogger + 29) % 128;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:16:0x0029, B:15:0x001c, B:11:0x0017, B:7:0x0011), top: B:23:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.appsflyer.internal.AFf1uSDK getMonetizationNetwork() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = com.appsflyer.internal.AFa1tSDK.AFLogger     // Catch: java.lang.Throwable -> L18
            int r1 = r0 + 13
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r2     // Catch: java.lang.Throwable -> L18
            int r1 = r1 % 2
            com.appsflyer.internal.AFf1uSDK r2 = r3.copy
            if (r1 != 0) goto L1a
            r1 = 43
            int r1 = r1 / 0
            if (r2 != 0) goto L29
            goto L1c
        L16:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            goto L2d
        L1a:
            if (r2 != 0) goto L29
        L1c:
            com.appsflyer.internal.a r1 = new com.appsflyer.internal.a     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
            r3.copy = r1     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 45
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.registerClient = r0     // Catch: java.lang.Throwable -> L18
        L29:
            com.appsflyer.internal.AFf1uSDK r0 = r3.copy     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return r0
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork():com.appsflyer.internal.AFf1uSDK");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(AFi1nSDK aFi1nSDK) {
        int i11 = AFLogger + 17;
        registerClient = i11 % 128;
        int i12 = i11 % 2;
        getRevenue(aFi1nSDK);
        if (i12 == 0) {
            int i13 = 12 / 0;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        registerClient = (AFLogger + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        aFa1tSDK.getRevenue().copy().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i11 = registerClient + 17;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 93 / 0;
        }
        return null;
    }

    public final void getMonetizationNetwork(@NonNull AFh1sSDK aFh1sSDK, AFh1oSDK aFh1oSDK) {
        getCurrencyIso4217Code(aFh1sSDK, aFh1oSDK);
        if (getRevenue().AFInAppEventParameterName().getMonetizationNetwork() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1sSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                registerClient = (AFLogger + 31) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                AFLogger = (registerClient + 25) % 128;
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getRevenue().getMediationNetwork());
        if (referrer == null) {
            AFLogger = (registerClient + 17) % 128;
            referrer = "";
        }
        aFh1sSDK.component2 = referrer;
        getCurrencyIso4217Code(aFh1sSDK);
    }

    private void getMonetizationNetwork(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i11 = (registerClient + 31) % 128;
        AFLogger = i11;
        if (appsFlyerConversionListener != null) {
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
            return;
        }
        int i12 = i11 + 69;
        registerClient = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated
    public static Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        AFLogger = (registerClient + 67) % 128;
        if (map.containsKey("meta")) {
            int i11 = AFLogger + 73;
            registerClient = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return (Map) map.get("meta");
        }
        HashMap map2 = new HashMap();
        map.put("meta", map2);
        return map2;
    }

    private void getMonetizationNetwork(String str) {
        getMonetizationNetwork(new Object[]{this, str}, -1378401160, 1378401168, System.identityHashCode(this));
    }
}
