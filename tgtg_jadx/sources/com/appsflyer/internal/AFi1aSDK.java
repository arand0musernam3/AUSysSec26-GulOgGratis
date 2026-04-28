package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1zSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AFi1aSDK extends AFi1hSDK {
    public final Map<String, Object> getMediationNetwork;

    @NonNull
    final ExecutorService getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1aSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public class AnonymousClass4 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass4(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i11) {
            AFi1aSDK.this.getRevenue(installReferrerClient, context, i11);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i11) {
            ExecutorService executorService = AFi1aSDK.this.getMonetizationNetwork;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9550a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i11);
                }
            });
        }
    }

    public AFi1aSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFc1kSDK aFc1kSDK) {
        super("store", "google", aFc1kSDK, runnable);
        this.getMediationNetwork = new HashMap();
        this.getMonetizationNetwork = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Context context) {
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1zSDK.AnonymousClass3());
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
            installReferrerClientBuild.startConnection(new AnonymousClass4(installReferrerClientBuild, context));
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th2);
        }
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(@NonNull Context context) {
        if (getRevenue(context)) {
            this.getMonetizationNetwork.execute(new g(2, this, context));
        }
    }

    public final void getRevenue(InstallReferrerClient installReferrerClient, Context context, int i11) {
        this.getMediationNetwork.put("code", String.valueOf(i11));
        Pair<Long, String> pairAFAdRevenueData = AFj1pSDK.AFAdRevenueData(context, "com.android.vending");
        this.getCurrencyIso4217Code.put("api_ver", pairAFAdRevenueData.f26485a);
        this.getCurrencyIso4217Code.put("api_ver_name", pairAFAdRevenueData.f26486b);
        if (i11 == -1) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getCurrencyIso4217Code.put("response", "SERVICE_DISCONNECTED");
        } else if (i11 == 0) {
            this.getCurrencyIso4217Code.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                aFLogger.d(aFg1cSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMediationNetwork.put("val", installReferrer2);
                        this.getCurrencyIso4217Code.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMediationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getCurrencyIso4217Code.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMediationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getCurrencyIso4217Code.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMediationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e5) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e5);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "some method not exist", e11, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.getCurrencyIso4217Code.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getMediationNetwork.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th2) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th2.getMessage());
                aFLogger2.w(aFg1cSDK2, sb2.toString());
                this.getMediationNetwork.put("err", th2.getMessage());
                aFLogger2.e(aFg1cSDK2, "Failed to get install referrer", th2, false, false);
            }
        } else if (i11 == 1) {
            this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
        } else if (i11 == 2) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i11 != 3) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getCurrencyIso4217Code.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
        getCurrencyIso4217Code();
    }

    private boolean getRevenue(@NonNull Context context) {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            if (AFj1pSDK.getRevenue(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e5) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e5);
            AFLogger.INSTANCE.v(AFg1cSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }
}
