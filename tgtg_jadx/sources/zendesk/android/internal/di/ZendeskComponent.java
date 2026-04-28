package zendesk.android.internal.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import zendesk.android.events.internal.ZendeskEventDispatcher;
import zendesk.android.internal.di.ZendeskInitializedComponent;
import zendesk.android.settings.internal.SettingsRepository;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzendesk/android/internal/di/ZendeskComponent;", "", "Lzendesk/android/settings/internal/SettingsRepository;", "settingsRepository", "()Lzendesk/android/settings/internal/SettingsRepository;", "Lzendesk/android/events/internal/ZendeskEventDispatcher;", "zendeskEventDispatcher", "()Lzendesk/android/events/internal/ZendeskEventDispatcher;", "Lv80/b0;", "mainScope", "()Lv80/b0;", "Landroid/content/Context;", "context", "()Landroid/content/Context;", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "componentData", "()Lzendesk/android/internal/di/ZendeskComponentConfig;", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "provideProcessLifecycleEventObserver", "()Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Lzendesk/android/internal/di/ZendeskInitializedComponent$Builder;", "getZendeskInitializedComponent", "()Lzendesk/android/internal/di/ZendeskInitializedComponent$Builder;", "zendeskInitializedComponent", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ZendeskComponent {
    @NotNull
    ZendeskComponentConfig componentData();

    @NotNull
    Context context();

    @NotNull
    ZendeskInitializedComponent.Builder getZendeskInitializedComponent();

    @NotNull
    b0 mainScope();

    @NotNull
    ProcessLifecycleEventObserver provideProcessLifecycleEventObserver();

    @NotNull
    SettingsRepository settingsRepository();

    @NotNull
    ZendeskEventDispatcher zendeskEventDispatcher();
}
