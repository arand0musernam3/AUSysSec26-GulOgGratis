package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1oSDK {

    @NotNull
    private static final u70.j getRevenue = u70.l.b(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1oSDK.5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    @NotNull
    public static final ExecutorService AFAdRevenueData() {
        Object value = getRevenue.getValue();
        value.getClass();
        return (ExecutorService) value;
    }

    @NotNull
    public static final ScheduledExecutorService getCurrencyIso4217Code() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    @NotNull
    public static final ExecutorService getMonetizationNetwork() {
        AFc1qSDK aFc1qSDK = new AFc1qSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1qSDK.allowCoreThreadTimeOut(true);
        return aFc1qSDK;
    }

    @NotNull
    public static final ScheduledExecutorService getRevenue() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }
}
