package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.braze.h2;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1cSDK implements AFd1zSDK {
    private static final int getMonetizationNetwork = (int) 30000;
    private AFj1rSDK AFInAppEventParameterName;
    private AFe1vSDK AFInAppEventType;
    private AFc1vSDK AFKeystoreWrapper;
    private AFd1wSDK AFLogger;
    private AFg1zSDK AFLoggerLogLevel;
    private AFi1rSDK afDebugLog;
    private AFg1uSDK afErrorLog;
    private AFh1ySDK afErrorLogForExcManagerOnly;
    private AFa1oSDK afInfoLog;
    private AFh1wSDK afLogForce;
    private AFf1gSDK afRDLog;
    private AFi1nSDK afWarnLog;
    private AFc1kSDK areAllFieldsValid;
    private AFd1oSDK component1;
    private AFc1pSDK component2;
    private PurchaseHandler component3;
    private AFf1mSDK component4;
    private AFh1uSDK copy;
    private AFd1lSDK copydefault;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AFi1xSDK f9513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AFi1lSDK f9514e;
    private AFe1qSDK equals;
    private AFa1aSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFc1gSDK getLevel;
    private ExecutorService getMediationNetwork;
    private ScheduledExecutorService getRevenue;
    private AFg1vSDK hashCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AFj1kSDK f9515i;
    private AFf1kSDK registerClient;
    private AFj1oSDK toString;
    private AFg1ySDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AFa1gSDK f9516v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AFb1bSDK f9517w;
    private String afVerboseLog = null;
    public final AFc1fSDK AFAdRevenueData = new AFc1fSDK();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger AFAdRevenueData = new AtomicInteger();
        private final AtomicInteger getMediationNetwork = new AtomicInteger();

        public AFa1ySDK() {
            AFAdRevenueData.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i11 = AFAdRevenueData.get();
            int iIncrementAndGet = this.getMediationNetwork.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i11);
            sb2.append("-");
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    @NonNull
    private synchronized ScheduledExecutorService AFLoggerLogLevel() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = AFc1oSDK.getRevenue();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getRevenue;
    }

    @NonNull
    private synchronized AFg1zSDK AFPurchaseDetails() {
        try {
            if (this.AFLoggerLogLevel == null) {
                this.AFLoggerLogLevel = new AFg1zSDK(registerClient(), AFAdRevenueData());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLoggerLogLevel;
    }

    @NonNull
    private synchronized AFd1oSDK afRDLog() {
        try {
            if (this.component1 == null) {
                this.component1 = new AFd1oSDK(new AFd1jSDK(getMonetizationNetwork), getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component1;
    }

    @NonNull
    private String afWarnLog() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFa1vSDK().getRevenue();
        }
        return this.afVerboseLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: getLevel, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1wSDK afLogForce() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFd1wSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences o_() {
        Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
        if (context != null) {
            return (SharedPreferences) AFa1tSDK.getMonetizationNetwork(new Object[]{context}, 1469250199, -1469250196, (int) System.currentTimeMillis());
        }
        h2.b("Context must be set via setContext method before calling this dependency.");
        return null;
    }

    @NonNull
    private synchronized ExecutorService valueOf() {
        try {
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = AFc1oSDK.AFAdRevenueData();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getCurrencyIso4217Code;
    }

    @NonNull
    private synchronized AFj1kSDK values() {
        try {
            if (this.f9515i == null) {
                this.f9515i = new AFj1kSDK(AFAdRevenueData());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f9515i;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1kSDK AFAdRevenueData() {
        try {
            if (this.areAllFieldsValid == null) {
                AFc1fSDK aFc1fSDKRegisterClient = registerClient();
                AFc1jSDK mediationNetwork = getMediationNetwork();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1gSDK();
                }
                this.areAllFieldsValid = new AFc1kSDK(aFc1fSDKRegisterClient, mediationNetwork, this.getLevel, getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFf1kSDK AFInAppEventParameterName() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFf1kSDK(registerClient());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFe1vSDK AFInAppEventType() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFe1vSDK(AFAdRevenueData(), getMediationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1vSDK AFKeystoreWrapper() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFc1tSDK(registerClient(), getMediationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1lSDK AFLogger() {
        if (this.f9514e == null) {
            this.f9514e = new AFi1kSDK();
        }
        return this.f9514e;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFh1ySDK afDebugLog() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFg1bSDK(this);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFa1gSDK afErrorLog() {
        if (this.f9516v == null) {
            this.f9516v = new AFa1lSDK(getMediationNetwork());
        }
        return this.f9516v;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFh1wSDK afErrorLogForExcManagerOnly() {
        if (AFh1tSDK.getMediationNetwork() && this.afLogForce == null) {
            this.afLogForce = new AFh1vSDK(AFAdRevenueData(), copydefault());
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFb1bSDK afInfoLog() {
        if (this.f9517w == null) {
            ScheduledExecutorService scheduledExecutorServiceAFLoggerLogLevel = AFLoggerLogLevel();
            AFa1oSDK aFa1oSDKI = i();
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFi1oSDK();
            }
            this.f9517w = new AFb1aSDK(scheduledExecutorServiceAFLoggerLogLevel, aFa1oSDKI, this.afDebugLog);
        }
        return this.f9517w;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFb1hSDK afVerboseLog() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1gSDK();
        }
        return new AFb1cSDK(this.getLevel, registerClient(), AFInAppEventParameterName());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFg1vSDK areAllFieldsValid() {
        if (this.hashCode == null) {
            String strAfWarnLog = afWarnLog();
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            if (context == null) {
                h2.b("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            if (this.f9514e == null) {
                this.f9514e = new AFi1kSDK();
            }
            AFi1lSDK aFi1lSDK = this.f9514e;
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFg1wSDK();
            }
            AFg1ySDK aFg1ySDK = this.unregisterClient;
            if (this.toString == null) {
                Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                if (context2 == null) {
                    h2.b("Context must be set via setContext method before calling this dependency.");
                    return null;
                }
                this.toString = new AFj1mSDK(context2, valueOf());
            }
            AFj1oSDK aFj1oSDK = this.toString;
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFg1sSDK();
            }
            AFg1uSDK aFg1uSDK = this.afErrorLog;
            AFh1uSDK aFh1uSDKComponent2 = component2();
            AFc1jSDK mediationNetwork = getMediationNetwork();
            AFc1kSDK aFc1kSDKAFAdRevenueData = AFAdRevenueData();
            if (this.f9513d == null) {
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                if (context3 == null) {
                    h2.b("Context must be set via setContext method before calling this dependency.");
                    return null;
                }
                this.f9513d = new AFi1xSDK(context3);
            }
            AFi1xSDK aFi1xSDK = this.f9513d;
            AFf1kSDK aFf1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
            AFc1fSDK aFc1fSDKRegisterClient = registerClient();
            AFg1zSDK aFg1zSDKAFPurchaseDetails = AFPurchaseDetails();
            if (this.getLevel == null) {
                this.getLevel = new AFc1gSDK();
            }
            this.hashCode = new AFg1tSDK(strAfWarnLog, context, aFi1lSDK, aFg1ySDK, aFj1oSDK, aFg1uSDK, aFh1uSDKComponent2, mediationNetwork, aFc1kSDKAFAdRevenueData, aFi1xSDK, aFf1kSDKAFInAppEventParameterName, aFc1fSDKRegisterClient, aFg1zSDKAFPurchaseDetails, this.getLevel);
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized PurchaseHandler component1() {
        try {
            if (this.component3 == null) {
                this.component3 = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFh1uSDK component2() {
        try {
            if (this.copy == null) {
                this.copy = new AFh1uSDK(getMediationNetwork(), AFAdRevenueData());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFf1mSDK component3() {
        try {
            if (this.component4 == null) {
                AFf1pSDK aFf1pSDK = new AFf1pSDK(getMediationNetwork());
                AFc1kSDK aFc1kSDKAFAdRevenueData = AFAdRevenueData();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1gSDK();
                }
                AFf1oSDK aFf1oSDK = new AFf1oSDK(aFc1kSDKAFAdRevenueData, aFf1pSDK, this.getLevel);
                AFf1qSDK aFf1qSDK = new AFf1qSDK();
                AFc1kSDK aFc1kSDKAFAdRevenueData2 = AFAdRevenueData();
                AFf1kSDK aFf1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
                AFd1mSDK aFd1mSDK = new AFd1mSDK(afRDLog(), AFAdRevenueData(), AppsFlyerProperties.getInstance(), AFInAppEventType(), values(), AFInAppEventParameterName());
                AFe1qSDK aFe1qSDKEquals = equals();
                if (this.getLevel == null) {
                    this.getLevel = new AFc1gSDK();
                }
                this.component4 = new AFf1mSDK(aFf1qSDK, aFc1kSDKAFAdRevenueData2, aFf1kSDKAFInAppEventParameterName, aFf1pSDK, aFd1mSDK, aFf1oSDK, aFe1qSDKEquals, this.getLevel);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFj1oSDK component4() {
        if (this.toString == null) {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            if (context == null) {
                h2.b("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            this.toString = new AFj1mSDK(context, valueOf());
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFd1lSDK copy() {
        try {
            if (this.copydefault == null) {
                this.copydefault = new AFd1kSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFj1rSDK copydefault() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFj1rSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1xSDK d() {
        if (this.f9513d == null) {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            if (context == null) {
                h2.b("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            this.f9513d = new AFi1xSDK(context);
        }
        return this.f9513d;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFc1gSDK e() {
        if (this.getLevel == null) {
            this.getLevel = new AFc1gSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFe1qSDK equals() {
        try {
            if (this.equals == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1cSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1ySDK());
                threadPoolExecutor.setRejectedExecutionHandler(new h(0));
                this.equals = new AFe1qSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFf1gSDK force() {
        if (this.afRDLog == null) {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            if (context == null) {
                h2.b("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            AFf1dSDK aFf1dSDK = new AFf1dSDK(context, AppsFlyerProperties.getInstance());
            if (this.getLevel == null) {
                this.getLevel = new AFc1gSDK();
            }
            this.afRDLog = new AFf1eSDK(aFf1dSDK, this.getLevel, AppsFlyerProperties.getInstance());
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized ExecutorService getCurrencyIso4217Code() {
        try {
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = AFc1oSDK.getMonetizationNetwork();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFc1jSDK getMediationNetwork() {
        if (this.component2 == null) {
            this.component2 = new AFc1pSDK(new AFc1eSDK(new d(this, 1)));
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized ScheduledExecutorService getMonetizationNetwork() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = AFc1oSDK.getCurrencyIso4217Code();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1mSDK getRevenue() {
        return new AFd1mSDK(afRDLog(), AFAdRevenueData(), AppsFlyerProperties.getInstance(), AFInAppEventType(), values(), AFInAppEventParameterName());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFa1oSDK i() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFa1oSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1fSDK registerClient() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFa1aSDK unregisterClient() {
        try {
            if (this.force == null) {
                this.force = new AFa1bSDK(registerClient());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFi1nSDK v() {
        try {
            if (this.afWarnLog == null) {
                try {
                    Object[] objArr = {AFAdRevenueData(), registerClient(), AFInAppEventParameterName()};
                    Map map = AFi1gSDK.f9526d;
                    Object declaredConstructor = map.get(856866784);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1gSDK.getMediationNetwork((-16777179) - Color.rgb(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(AFc1kSDK.class, AFc1fSDK.class, AFf1kSDK.class);
                        map.put(856866784, declaredConstructor);
                    }
                    this.afWarnLog = (AFi1nSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th3.getMessage() != null ? th3.getMessage() : "", th3, false, false);
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1rSDK w() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFi1oSDK();
        }
        return this.afDebugLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e5) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e5);
            Thread.currentThread().interrupt();
        }
    }
}
