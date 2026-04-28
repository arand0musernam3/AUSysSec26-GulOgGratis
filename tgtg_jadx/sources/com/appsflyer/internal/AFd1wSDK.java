package com.appsflyer.internal;

import a40.q;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 400809482;

    @NotNull
    private final u70.j AFAdRevenueData;

    @NotNull
    private final u70.j areAllFieldsValid;

    @NotNull
    private final String component1;

    @NotNull
    private final u70.j component2;

    @Nullable
    private AFd1xSDK.AFa1tSDK component3;

    @NotNull
    private final u70.j component4;

    @NotNull
    private final u70.j getCurrencyIso4217Code;

    @NotNull
    private AFd1zSDK getMediationNetwork;

    @NotNull
    private final u70.j getMonetizationNetwork;

    @NotNull
    private final u70.j getRevenue;

    public AFd1wSDK(@NotNull AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.getRevenue = u70.l.b(new Function0<AFf1mSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1mSDK invoke() {
                AFf1mSDK aFf1mSDKComponent3 = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).component3();
                aFf1mSDKComponent3.getClass();
                return aFf1mSDKComponent3;
            }
        });
        this.AFAdRevenueData = u70.l.b(new Function0<AFc1kSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFc1kSDK invoke() {
                AFc1kSDK aFc1kSDKAFAdRevenueData = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).AFAdRevenueData();
                aFc1kSDKAFAdRevenueData.getClass();
                return aFc1kSDKAFAdRevenueData;
            }
        });
        this.getCurrencyIso4217Code = u70.l.b(new Function0<AFc1jSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFc1jSDK invoke() {
                AFc1jSDK mediationNetwork = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).getMediationNetwork();
                mediationNetwork.getClass();
                return mediationNetwork;
            }
        });
        this.getMonetizationNetwork = u70.l.b(new Function0<AFf1kSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1kSDK invoke() {
                AFf1kSDK aFf1kSDKAFInAppEventParameterName = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).AFInAppEventParameterName();
                aFf1kSDKAFInAppEventParameterName.getClass();
                return aFf1kSDKAFInAppEventParameterName;
            }
        });
        this.component4 = u70.l.b(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1wSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService currencyIso4217Code = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).getCurrencyIso4217Code();
                currencyIso4217Code.getClass();
                return currencyIso4217Code;
            }
        });
        this.component1 = "6.18.0";
        this.component2 = u70.l.b(new Function0<AFd1ySDK>() { // from class: com.appsflyer.internal.AFd1wSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1ySDK invoke() {
                AFc1fSDK aFc1fSDKRegisterClient = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).registerClient();
                aFc1fSDKRegisterClient.getClass();
                return new AFd1ySDK(aFc1fSDKRegisterClient);
            }
        });
        this.areAllFieldsValid = u70.l.b(new Function0<AFd1uSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFd1uSDK invoke() {
                return new AFd1uSDK(AFd1wSDK.this.AFAdRevenueData());
            }
        });
    }

    private final Map<String, String> AFAdRevenueData(AFh1bSDK aFh1bSDK) {
        Object[] objArr = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 144, View.MeasureSpec.getMode(0) + 1, false, 5 - TextUtils.indexOf("", "", 0, 0), "�\ufffb\u000b\ufffa\u0007", objArr);
        Map<String, String> mapE = x0.e(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getRevenue.getCurrencyIso4217Code.getPackageName()), new Pair("p_ex", new AFa1vSDK().getRevenue()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component1), new Pair("uid", AFb1iSDK.getCurrencyIso4217Code(getMediationNetwork().getCurrencyIso4217Code)), new Pair("exc_config", aFh1bSDK.getMonetizationNetwork()));
        copy = (copydefault + 99) % 128;
        return mapE;
    }

    private static void a(int i11, int i12, boolean z11, int i13, String str, Object[] objArr) {
        $11 = ($10 + 29) % 128;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr2 = new char[i13];
        aFk1jSDK.getMonetizationNetwork = 0;
        while (true) {
            int i14 = aFk1jSDK.getMonetizationNetwork;
            if (i14 >= i13) {
                break;
            }
            $11 = ($10 + 97) % 128;
            char c3 = cArr[i14];
            aFk1jSDK.getMediationNetwork = c3;
            char c7 = (char) (c3 + i11);
            cArr2[i14] = c7;
            cArr2[i14] = (char) (c7 - ((int) (((long) equals) ^ 4333921468659523104L)));
            aFk1jSDK.getMonetizationNetwork = i14 + 1;
        }
        if (i12 > 0) {
            $11 = ($10 + 121) % 128;
            aFk1jSDK.AFAdRevenueData = i12;
            char[] cArr3 = new char[i13];
            System.arraycopy(cArr2, 0, cArr3, 0, i13);
            int i15 = aFk1jSDK.AFAdRevenueData;
            System.arraycopy(cArr3, 0, cArr2, i13 - i15, i15);
            int i16 = aFk1jSDK.AFAdRevenueData;
            System.arraycopy(cArr3, i16, cArr2, 0, i13 - i16);
        }
        if (z11) {
            char[] cArr4 = new char[i13];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i17 = aFk1jSDK.getMonetizationNetwork;
                if (i17 >= i13) {
                    break;
                }
                cArr4[i17] = cArr2[(i13 - i17) - 1];
                aFk1jSDK.getMonetizationNetwork = i17 + 1;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final AFc1jSDK areAllFieldsValid() {
        copydefault = (copy + 45) % 128;
        AFc1jSDK aFc1jSDK = (AFc1jSDK) this.getCurrencyIso4217Code.getValue();
        int i11 = copydefault + 81;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            return aFc1jSDK;
        }
        throw null;
    }

    private final AFf1kSDK component1() {
        copydefault = (copy + 11) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getMonetizationNetwork.getValue();
        int i11 = copydefault + 103;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final ExecutorService component2() {
        return (ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this));
    }

    private final AFh1bSDK component3() {
        return (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
    }

    @NotNull
    private AFd1vSDK component4() {
        AFd1vSDK aFd1vSDK;
        int i11 = copy + 119;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        u70.j jVar = this.areAllFieldsValid;
        if (i12 != 0) {
            aFd1vSDK = (AFd1vSDK) jVar.getValue();
            int i13 = 28 / 0;
        } else {
            aFd1vSDK = (AFd1vSDK) jVar.getValue();
        }
        int i14 = copy + 73;
        copydefault = i14 % 128;
        if (i14 % 2 == 0) {
            return aFd1vSDK;
        }
        throw null;
    }

    private final synchronized void copy() {
        boolean monetizationNetwork;
        try {
            copy = (copydefault + 39) % 128;
            AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
            if (aFh1bSDK != null) {
                if (aFh1bSDK.AFAdRevenueData == -1) {
                    areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_to_server_window");
                } else if (areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    copy = (copydefault + 57) % 128;
                    getCurrencyIso4217Code(aFh1bSDK);
                }
                monetizationNetwork = getMonetizationNetwork(aFh1bSDK);
            } else {
                monetizationNetwork = false;
            }
            AFd1xSDK.AFa1tSDK aFa1tSDK = this.component3;
            if (aFa1tSDK != null) {
                aFa1tSDK.onConfigurationChanged(monetizationNetwork);
                copydefault = (copy + 35) % 128;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void copydefault() {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.copydefault():void");
    }

    private final void equals() {
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
        if (aFh1bSDK != null) {
            copydefault = (copy + 69) % 128;
            if (!getMediationNetwork(aFh1bSDK)) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            String monetizationNetwork = component1().getMonetizationNetwork();
            if (monetizationNetwork != null) {
                String string = new JSONObject((Map) getCurrencyIso4217Code(new Object[]{AFAdRevenueData(aFh1bSDK), AFAdRevenueData().AFAdRevenueData()}, -1431128038, 1431128041, (int) System.currentTimeMillis())).toString();
                string.getClass();
                getCurrencyIso4217Code(string, monetizationNetwork);
                int i11 = copy + 33;
                copydefault = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 40 / 0;
                }
            }
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~((~i11) | i12);
        int i15 = (((~(i11 | i13)) | (~((~i12) | i11)) | i14) * 70) + ((~(i11 | i12 | i13)) * 70) + (((~(i12 | i13)) | i14) * (-140)) + (i12 * (-69)) + (i11 * 71);
        if (i15 == 1) {
            return AFAdRevenueData(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? i15 != 4 ? getCurrencyIso4217Code(objArr) : getRevenue(objArr) : getMonetizationNetwork(objArr);
        }
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFh1bSDK aFh1bSDK = (AFh1bSDK) objArr[1];
        long jCurrentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = aFd1wSDK.areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1bSDK.getMediationNetwork < jCurrentTimeMillis / 1000) {
            int i16 = copydefault + 117;
            copy = i16 % 128;
            return Boolean.valueOf(i16 % 2 == 0);
        }
        if (mediationNetwork != -1) {
            copy = (copydefault + 95) % 128;
            if (mediationNetwork >= jCurrentTimeMillis) {
                return Boolean.valueOf(aFd1wSDK.getRevenue(aFh1bSDK));
            }
        }
        return Boolean.FALSE;
    }

    private final boolean getMediationNetwork(AFh1bSDK aFh1bSDK) {
        int currencyIso4217Code;
        int i11 = copydefault + 109;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            System.currentTimeMillis();
            areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
            long j9 = aFh1bSDK.getMediationNetwork;
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1bSDK.getMediationNetwork < jCurrentTimeMillis / 1000) {
            copydefault = (copy + 47) % 128;
            return false;
        }
        if (mediationNetwork != -1 && mediationNetwork >= jCurrentTimeMillis && (currencyIso4217Code = areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_min", -1)) != -1) {
            copy = (copydefault + 71) % 128;
            if (AFAdRevenueData().getRevenue() >= currencyIso4217Code) {
                return getRevenue(aFh1bSDK);
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(@Nullable AFd1xSDK.AFa1tSDK aFa1tSDK) {
        int i11 = copy + 57;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            this.component3 = aFa1tSDK;
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 1));
            throw null;
        }
        this.component3 = aFa1tSDK;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 1));
        int i12 = copy + 121;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 69 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue() {
        copy = (copydefault + 47) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 0));
        copy = (copydefault + 51) % 128;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i11 = copy + 57;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        ExecutorService executorService = (ExecutorService) aFd1wSDK.component4.getValue();
        if (i12 != 0) {
            int i13 = 65 / 0;
        }
        return executorService;
    }

    private final boolean getRevenue(AFh1bSDK aFh1bSDK) {
        new AFd1rSDK();
        String str = this.component1;
        String str2 = aFh1bSDK.getMonetizationNetwork;
        str2.getClass();
        boolean revenue = AFd1rSDK.getRevenue(str, str2);
        copy = (copydefault + 107) % 128;
        return revenue;
    }

    private final AFf1mSDK getMonetizationNetwork() {
        copy = (copydefault + 45) % 128;
        AFf1mSDK aFf1mSDK = (AFf1mSDK) this.getRevenue.getValue();
        copy = (copydefault + 77) % 128;
        return aFf1mSDK;
    }

    public static final /* synthetic */ AFd1zSDK getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i11 = copy;
        copydefault = (i11 + 113) % 128;
        AFd1zSDK aFd1zSDK = aFd1wSDK.getMediationNetwork;
        int i12 = i11 + 33;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 90 / 0;
        }
        return aFd1zSDK;
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        copydefault = (copy + 71) % 128;
        Map mapE = x0.e(new Pair("deviceInfo", map), new Pair("excs", AFd1sSDK.getMediationNetwork((List<AFc1bSDK>) list)));
        int i11 = copy + 121;
        copydefault = i11 % 128;
        if (i11 % 2 == 0) {
            return mapE;
        }
        throw null;
    }

    private final boolean getMonetizationNetwork(AFh1bSDK aFh1bSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1bSDK}, 1535825086, -1535825084, System.identityHashCode(this))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 111) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.equals();
        int i11 = copy + 117;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private final AFc1kSDK getMediationNetwork() {
        copydefault = (copy + 31) % 128;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) this.AFAdRevenueData.getValue();
        int i11 = copydefault + 53;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 91 / 0;
        }
        return aFc1kSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMediationNetwork(@NotNull Throwable th2, @NotNull String str) {
        getCurrencyIso4217Code(new Object[]{this, th2, str}, 1429511836, -1429511836, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th2 = (Throwable) objArr[1];
        String str = (String) objArr[2];
        copy = (copydefault + 119) % 128;
        th2.getClass();
        str.getClass();
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{aFd1wSDK}, -1790300569, 1790300573, System.identityHashCode(aFd1wSDK))).execute(new q((Object) aFd1wSDK, (Object) th2, str, 10));
        int i11 = copydefault + 49;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 23 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getCurrencyIso4217Code() {
        copydefault = (copy + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 2));
        copy = (copydefault + 105) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 25) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.copy();
        copydefault = (copy + 59) % 128;
    }

    private final void getCurrencyIso4217Code(AFh1bSDK aFh1bSDK) {
        int i11;
        AFc1jSDK aFc1jSDKAreAllFieldsValid;
        int i12 = copydefault + 13;
        copy = i12 % 128;
        int i13 = i12 % 2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (i13 == 0) {
            i11 = aFh1bSDK.getCurrencyIso4217Code;
            long jCurrentTimeMillis = System.currentTimeMillis() | timeUnit.toMillis(aFh1bSDK.AFAdRevenueData);
            aFc1jSDKAreAllFieldsValid = areAllFieldsValid();
            aFc1jSDKAreAllFieldsValid.getRevenue("af_send_exc_to_server_window", jCurrentTimeMillis);
        } else {
            i11 = aFh1bSDK.getCurrencyIso4217Code;
            long millis = timeUnit.toMillis(aFh1bSDK.AFAdRevenueData) + System.currentTimeMillis();
            aFc1jSDKAreAllFieldsValid = areAllFieldsValid();
            aFc1jSDKAreAllFieldsValid.getRevenue("af_send_exc_to_server_window", millis);
        }
        aFc1jSDKAreAllFieldsValid.AFAdRevenueData("af_send_exc_min", i11);
        int i14 = copy + 117;
        copydefault = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 3 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r3
      0x0025: PHI (r3v6 com.appsflyer.internal.AFh1cSDK) = (r3v5 com.appsflyer.internal.AFh1cSDK), (r3v15 com.appsflyer.internal.AFh1cSDK) binds: [B:8:0x0023, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AFAdRevenueData(java.lang.Object[] r3) {
        /*
            r0 = 0
            r3 = r3[r0]
            com.appsflyer.internal.AFd1wSDK r3 = (com.appsflyer.internal.AFd1wSDK) r3
            int r1 = com.appsflyer.internal.AFd1wSDK.copy
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r2
            int r1 = r1 % 2
            com.appsflyer.internal.AFf1mSDK r3 = r3.getMonetizationNetwork()
            if (r1 == 0) goto L1f
            com.appsflyer.internal.AFf1pSDK r3 = r3.getCurrencyIso4217Code
            com.appsflyer.internal.AFh1cSDK r3 = r3.AFAdRevenueData
            r1 = 52
            int r1 = r1 / r0
            if (r3 == 0) goto L2c
            goto L25
        L1f:
            com.appsflyer.internal.AFf1pSDK r3 = r3.getCurrencyIso4217Code
            com.appsflyer.internal.AFh1cSDK r3 = r3.AFAdRevenueData
            if (r3 == 0) goto L2c
        L25:
            com.appsflyer.internal.AFh1aSDK r3 = r3.getMediationNetwork
            if (r3 == 0) goto L2c
            com.appsflyer.internal.AFh1bSDK r3 = r3.getCurrencyIso4217Code
            return r3
        L2c:
            int r3 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r3 = r3 + 99
            int r1 = r3 % 128
            com.appsflyer.internal.AFd1wSDK.copy = r1
            int r3 = r3 % 2
            r1 = 0
            if (r3 != 0) goto L3c
            r3 = 96
            int r3 = r3 / r0
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.AFAdRevenueData(java.lang.Object[]):java.lang.Object");
    }

    @NotNull
    public final AFc1aSDK AFAdRevenueData() {
        int i11 = copy + 43;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        u70.j jVar = this.component2;
        if (i12 != 0) {
            throw null;
        }
        AFc1aSDK aFc1aSDK = (AFc1aSDK) jVar.getValue();
        copy = (copydefault + 89) % 128;
        return aFc1aSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 85) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.copydefault();
        copy = (copydefault + 105) % 128;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        copydefault = (copy + 97) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        component4().getMediationNetwork(bytes, w0.b(new Pair("Authorization", AFj1jSDK.getCurrencyIso4217Code(str, str2))), 2000);
        int i11 = copydefault + 115;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1wSDK aFd1wSDK, Throwable th2, String str) {
        aFd1wSDK.getClass();
        th2.getClass();
        str.getClass();
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{aFd1wSDK}, 1447743159, -1447743158, System.identityHashCode(aFd1wSDK));
        if (aFh1bSDK != null) {
            copy = (copydefault + 35) % 128;
            if (aFd1wSDK.getMonetizationNetwork(aFh1bSDK)) {
                aFd1wSDK.AFAdRevenueData().getCurrencyIso4217Code(th2, str);
            }
        }
        copydefault = (copy + 7) % 128;
    }

    private static Map<String, Object> getCurrencyIso4217Code(Map<String, ? extends Object> map, List<AFc1bSDK> list) {
        return (Map) getCurrencyIso4217Code(new Object[]{map, list}, -1431128038, 1431128041, (int) System.currentTimeMillis());
    }
}
