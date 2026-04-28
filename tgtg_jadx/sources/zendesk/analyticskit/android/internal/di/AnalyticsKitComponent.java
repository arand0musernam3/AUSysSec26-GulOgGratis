package zendesk.analyticskit.android.internal.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.analyticskit.android.model.AnalyticsSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@AnalyticsKitScope
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lzendesk/analyticskit/android/internal/di/AnalyticsKitComponent;", "", "analyticsKit", "Lzendesk/analyticskit/android/AnalyticsKit;", "Factory", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AnalyticsKitComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzendesk/analyticskit/android/internal/di/AnalyticsKitComponent$Factory;", "", "Landroid/content/Context;", "context", "Lzendesk/analyticskit/android/model/AnalyticsSettings;", "analyticsSettings", "Lv80/b0;", "coroutineScope", "Lzendesk/analyticskit/android/internal/di/AnalyticsKitComponent;", "create", "(Landroid/content/Context;Lzendesk/analyticskit/android/model/AnalyticsSettings;Lv80/b0;)Lzendesk/analyticskit/android/internal/di/AnalyticsKitComponent;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AnalyticsKitComponent create(@NotNull Context context, @NotNull AnalyticsSettings analyticsSettings, @NotNull b0 coroutineScope);
    }

    @NotNull
    AnalyticsKit analyticsKit();
}
