package zendesk.analyticskit.android;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import zendesk.analyticskit.android.internal.di.DaggerAnalyticsKitComponent;
import zendesk.analyticskit.android.model.AnalyticsSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzendesk/analyticskit/android/AnalyticsKitFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lzendesk/analyticskit/android/model/AnalyticsSettings;", "analyticsSettings", "Lv80/b0;", "coroutineScope", "Lzendesk/analyticskit/android/AnalyticsKit;", "create", "(Landroid/content/Context;Lzendesk/analyticskit/android/model/AnalyticsSettings;Lv80/b0;)Lzendesk/analyticskit/android/AnalyticsKit;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsKitFactory {

    @NotNull
    public static final AnalyticsKitFactory INSTANCE = new AnalyticsKitFactory();

    private AnalyticsKitFactory() {
    }

    @NotNull
    public final AnalyticsKit create(@NotNull Context context, @NotNull AnalyticsSettings analyticsSettings, @NotNull b0 coroutineScope) {
        context.getClass();
        analyticsSettings.getClass();
        coroutineScope.getClass();
        return DaggerAnalyticsKitComponent.factory().create(context, analyticsSettings, coroutineScope).analyticsKit();
    }
}
