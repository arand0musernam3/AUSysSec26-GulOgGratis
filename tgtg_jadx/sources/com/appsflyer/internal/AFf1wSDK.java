package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nResolveDdlTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,278:1\n1#2:279\n1#2:290\n1603#3,9:280\n1855#3:289\n1856#3:291\n1612#3:292\n1855#3,2:296\n3792#4:293\n4307#4,2:294\n*S KotlinDebug\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n*L\n104#1:290\n104#1:280,9\n104#1:289\n104#1:291\n104#1:292\n202#1:296,2\n197#1:293\n197#1:294,2\n*E\n"})
public final class AFf1wSDK extends AFe1bSDK<AFa1mSDK> {
    private int AFInAppEventParameterName;
    private int AFInAppEventType;

    @NotNull
    private final List<AFj1zSDK> AFKeystoreWrapper;

    @NotNull
    private final CountDownLatch AFLogger;

    @NotNull
    private final AFa1pSDK component2;

    @NotNull
    private final AFj1rSDK copy;

    @NotNull
    private final AFa1oSDK copydefault;

    @NotNull
    private final AFc1gSDK equals;

    @NotNull
    private final AFc1kSDK hashCode;
    private int registerClient;

    @NotNull
    private final AFh1uSDK toString;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFe1rSDK.values().length];
            try {
                iArr[AFe1rSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1rSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
            int[] iArr2 = new int[AFj1zSDK.AFa1ySDK.values().length];
            try {
                iArr2[AFj1zSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1zSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMediationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1wSDK(@NotNull AFa1pSDK aFa1pSDK, @NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.DLSDK, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        aFa1pSDK.getClass();
        aFd1zSDK.getClass();
        this.component2 = aFa1pSDK;
        this.AFLogger = new CountDownLatch(1);
        this.AFKeystoreWrapper = new ArrayList();
        AFc1kSDK aFc1kSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        aFc1kSDKAFAdRevenueData.getClass();
        this.hashCode = aFc1kSDKAFAdRevenueData;
        AFc1gSDK aFc1gSDKE = aFd1zSDK.e();
        aFc1gSDKE.getClass();
        this.equals = aFc1gSDKE;
        AFa1oSDK aFa1oSDKI = aFd1zSDK.i();
        aFa1oSDKI.getClass();
        this.copydefault = aFa1oSDKI;
        AFh1uSDK aFh1uSDKComponent2 = aFd1zSDK.component2();
        aFh1uSDKComponent2.getClass();
        this.toString = aFh1uSDKComponent2;
        AFj1rSDK aFj1rSDKCopydefault = aFd1zSDK.copydefault();
        aFj1rSDKCopydefault.getClass();
        this.copy = aFj1rSDKCopydefault;
        AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) aFj1rSDKCopydefault.AFAdRevenueData.toArray(new AFj1zSDK[0]);
        aFj1zSDKArr.getClass();
        ArrayList<AFj1zSDK> arrayList = new ArrayList();
        for (AFj1zSDK aFj1zSDK : aFj1zSDKArr) {
            if (aFj1zSDK != null && aFj1zSDK.component2 != AFj1zSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFj1zSDK);
            }
        }
        this.registerClient = arrayList.size();
        for (final AFj1zSDK aFj1zSDK2 : arrayList) {
            AFj1zSDK.AFa1ySDK aFa1ySDK = aFj1zSDK2.component2;
            int i11 = aFa1ySDK == null ? -1 : AFa1tSDK.getMediationNetwork[aFa1ySDK.ordinal()];
            if (i11 == 1) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1zSDK2.getCurrencyIso4217Code.get("source") + " referrer collected earlier", false, 4, null);
                AFAdRevenueData(aFj1zSDK2);
            } else if (i11 == 2) {
                aFj1zSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.k
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1wSDK.AFAdRevenueData(aFj1zSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final void AFAdRevenueData(AFj1zSDK aFj1zSDK) {
        if (getRevenue(aFj1zSDK)) {
            this.AFKeystoreWrapper.add(aFj1zSDK);
            this.AFLogger.countDown();
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1zSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i11 = this.AFInAppEventParameterName + 1;
            this.AFInAppEventParameterName = i11;
            if (i11 == this.registerClient) {
                this.AFLogger.countDown();
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.registerClient && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    @NotNull
    public final AFe1rSDK getMediationNetwork() {
        AFe1rSDK mediationNetwork;
        AFe1rSDK aFe1rSDK = AFe1rSDK.FAILURE;
        try {
            mediationNetwork = super.getMediationNetwork();
            mediationNetwork.getClass();
        } catch (Exception e5) {
            e = e5;
        }
        try {
            AFh1uSDK aFh1uSDK = this.toString;
            int i11 = this.AFInAppEventType;
            if (i11 <= 0 || i11 > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
            } else {
                int i12 = i11 - 1;
                aFh1uSDK.component2[i12] = System.currentTimeMillis();
                long j9 = aFh1uSDK.areAllFieldsValid[i12];
                if (j9 != 0) {
                    long[] jArr = aFh1uSDK.component4;
                    jArr[i12] = aFh1uSDK.component2[i12] - j9;
                    aFh1uSDK.getMonetizationNetwork.put("net", jArr);
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i12);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
            }
            int i13 = AFa1tSDK.getCurrencyIso4217Code[mediationNetwork.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    return mediationNetwork;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
                AFg1hSDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.toString.getMediationNetwork(deepLinkResult, this.copydefault.component3);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult);
                return mediationNetwork;
            }
            ResponseNetwork responseNetwork2 = ((AFe1bSDK) this).component4;
            responseNetwork2.getClass();
            Object body = responseNetwork2.getBody();
            body.getClass();
            AFa1mSDK aFa1mSDK = (AFa1mSDK) body;
            DeepLink deepLink = aFa1mSDK.AFAdRevenueData;
            if (deepLink != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                this.toString.getMediationNetwork(deepLinkResult2, this.copydefault.component3);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult2);
                return mediationNetwork;
            }
            if (this.AFInAppEventType > 1 || !aFa1mSDK.getGetMonetizationNetwork() || !equals()) {
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.toString.getMediationNetwork(deepLinkResult3, this.copydefault.component3);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult3);
                return mediationNetwork;
            }
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
            this.AFLogger.await();
            AFh1uSDK aFh1uSDK2 = this.toString;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = aFh1uSDK2.component2[0];
            if (j11 != 0) {
                aFh1uSDK2.getMonetizationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j11));
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (this.AFInAppEventParameterName != this.registerClient) {
                return getMediationNetwork();
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.toString.getMediationNetwork(deepLinkResult4, this.copydefault.component3);
            this.copydefault.getCurrencyIso4217Code(deepLinkResult4);
            return AFe1rSDK.SUCCESS;
        } catch (Exception e11) {
            e = e11;
            aFe1rSDK = mediationNetwork;
            Throwable cause = e.getCause();
            if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                if (cause instanceof IOException) {
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.toString.getMediationNetwork(deepLinkResult5, this.copydefault.component3);
                    this.copydefault.getCurrencyIso4217Code(deepLinkResult5);
                    return aFe1rSDK;
                }
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, b3.i.l("Unexpected Exception: ", e), false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.toString.getMediationNetwork(deepLinkResult6, this.copydefault.component3);
                this.copydefault.getCurrencyIso4217Code(deepLinkResult6);
                return aFe1rSDK;
            }
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFInAppEventType + " attempt(s) within " + this.copydefault.component3 + " milliseconds", false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.toString.getMediationNetwork(deepLinkResult7, this.copydefault.component3);
            this.copydefault.getCurrencyIso4217Code(deepLinkResult7);
            return AFe1rSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    @Override // com.appsflyer.internal.AFe1bSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1fSDK<com.appsflyer.internal.AFa1mSDK> getRevenue(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1wSDK.getRevenue(java.lang.String):com.appsflyer.internal.AFd1fSDK");
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFj1zSDK aFj1zSDK, AFf1wSDK aFf1wSDK, Observable observable, Object obj) {
        aFf1wSDK.getClass();
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1zSDK.getCurrencyIso4217Code.get("source") + " referrer collected via observer", false, 4, null);
        observable.getClass();
        aFf1wSDK.AFAdRevenueData((AFj1zSDK) observable);
    }

    private static Map<String, String> AFAdRevenueData(AFb1mSDK aFb1mSDK) {
        String str;
        if (aFb1mSDK == null || (str = aFb1mSDK.getRevenue) == null) {
            return null;
        }
        Boolean bool = aFb1mSDK.getMonetizationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return x0.e(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return this.copydefault.component3;
    }

    private static boolean getRevenue(AFj1zSDK aFj1zSDK) {
        Object obj = aFj1zSDK.getCurrencyIso4217Code.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < 86400000) {
                return true;
            }
        }
        return false;
    }
}
