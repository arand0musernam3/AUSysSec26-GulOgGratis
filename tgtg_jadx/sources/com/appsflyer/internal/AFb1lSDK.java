package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1bSDK;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class AFb1lSDK implements Application.ActivityLifecycleCallbacks {
    private volatile boolean AFAdRevenueData;

    @NotNull
    private final Runnable areAllFieldsValid;

    @Nullable
    private ScheduledFuture<?> component1;

    @NotNull
    final AFb1bSDK.AFa1zSDK getCurrencyIso4217Code;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    private final AFi1rSDK getMonetizationNetwork;

    @NotNull
    private final AFa1oSDK getRevenue;

    public AFb1lSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1oSDK aFa1oSDK, @NotNull AFi1rSDK aFi1rSDK, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK) {
        scheduledExecutorService.getClass();
        aFa1oSDK.getClass();
        aFi1rSDK.getClass();
        aFa1zSDK.getClass();
        this.getMediationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getMonetizationNetwork = aFi1rSDK;
        this.getCurrencyIso4217Code = aFa1zSDK;
        this.areAllFieldsValid = new f(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK, AFh1oSDK aFh1oSDK) {
        Object pVar;
        aFb1lSDK.getClass();
        aFh1oSDK.getClass();
        try {
            o oVar = q.f40850b;
            aFb1lSDK.getCurrencyIso4217Code.getMediationNetwork(aFh1oSDK);
            pVar = Unit.f26487a;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        Throwable thA = q.a(pVar);
        if (thA != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", thA, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        activity.getClass();
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.AFAdRevenueData) {
            aFa1oSDK.AFAdRevenueData = intent;
        }
        this.getMonetizationNetwork.getCurrencyIso4217Code(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        if (this.AFAdRevenueData) {
            ScheduledExecutorService scheduledExecutorService = this.getMediationNetwork;
            Runnable runnable = this.areAllFieldsValid;
            AFb1bSDK.Companion aFa1vSDK = AFb1bSDK.INSTANCE;
            this.component1 = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.getRevenue(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        if (!this.AFAdRevenueData) {
            this.AFAdRevenueData = true;
            this.getMediationNetwork.execute(new g(0, this, new AFh1oSDK(activity, this.getMonetizationNetwork)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component1;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK) {
        Object pVar;
        aFb1lSDK.getClass();
        aFb1lSDK.AFAdRevenueData = false;
        try {
            o oVar = q.f40850b;
            aFb1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code();
            pVar = Unit.f26487a;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        Throwable thA = q.a(pVar);
        if (thA != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", thA);
        }
    }
}
