package zendesk.android.internal.di;

import android.content.Context;
import kotlin.Metadata;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import zendesk.android.settings.internal.SettingsApi;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lzendesk/android/internal/di/ZendeskModule;", "", "Landroid/content/Context;", "applicationContext", "Lv80/b0;", "mainScope", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "componentConfig", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleEventObserver", "<init>", "(Landroid/content/Context;Lv80/b0;Lzendesk/android/internal/di/ZendeskComponentConfig;Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;)V", "()Landroid/content/Context;", "componentData", "()Lzendesk/android/internal/di/ZendeskComponentConfig;", "()Lv80/b0;", "provideProcessLifecycleEventObserver", "()Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Loa0/o0;", "retrofit", "Lzendesk/android/settings/internal/SettingsApi;", "settingsApi", "(Loa0/o0;)Lzendesk/android/settings/internal/SettingsApi;", "Landroid/content/Context;", "getApplicationContext", "Lv80/b0;", "getMainScope", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "getComponentConfig", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "getProcessLifecycleEventObserver", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskModule {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final ZendeskComponentConfig componentConfig;

    @NotNull
    private final b0 mainScope;

    @NotNull
    private final ProcessLifecycleEventObserver processLifecycleEventObserver;

    public ZendeskModule(@NotNull Context context, @NotNull b0 b0Var, @NotNull ZendeskComponentConfig zendeskComponentConfig, @NotNull ProcessLifecycleEventObserver processLifecycleEventObserver) {
        context.getClass();
        b0Var.getClass();
        zendeskComponentConfig.getClass();
        processLifecycleEventObserver.getClass();
        this.applicationContext = context;
        this.mainScope = b0Var;
        this.componentConfig = zendeskComponentConfig;
        this.processLifecycleEventObserver = processLifecycleEventObserver;
    }

    @NotNull
    /* JADX INFO: renamed from: applicationContext, reason: from getter */
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @NotNull
    /* JADX INFO: renamed from: componentData, reason: from getter */
    public final ZendeskComponentConfig getComponentConfig() {
        return this.componentConfig;
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @NotNull
    public final ZendeskComponentConfig getComponentConfig() {
        return this.componentConfig;
    }

    @NotNull
    public final b0 getMainScope() {
        return this.mainScope;
    }

    @NotNull
    public final ProcessLifecycleEventObserver getProcessLifecycleEventObserver() {
        return this.processLifecycleEventObserver;
    }

    @NotNull
    public final b0 mainScope() {
        return this.mainScope;
    }

    @NotNull
    public final ProcessLifecycleEventObserver provideProcessLifecycleEventObserver() {
        return this.processLifecycleEventObserver;
    }

    @NotNull
    public final SettingsApi settingsApi(@NotNull o0 retrofit) {
        retrofit.getClass();
        Object objB = retrofit.b(SettingsApi.class);
        objB.getClass();
        return (SettingsApi) objB;
    }
}
