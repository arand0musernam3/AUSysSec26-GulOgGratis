package zendesk.analyticskit.android;

import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import zendesk.analyticskit.android.model.AnalyticsEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/analyticskit/android/AnalyticsKit;", "", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "analyticsEvent", "", "process", "(Lzendesk/analyticskit/android/model/AnalyticsEvent;Lx70/c;)Ljava/lang/Object;", "", FeatureFlag.ENABLED, "enableInternalAnalytics", "(ZLx70/c;)Ljava/lang/Object;", "isInternalAnalyticsEnabled", "(Lx70/c;)Ljava/lang/Object;", "", "getCurrentSessionId", "()Ljava/lang/String;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AnalyticsKit {
    @Nullable
    Object enableInternalAnalytics(boolean z11, @NotNull c<? super Unit> cVar);

    @NotNull
    String getCurrentSessionId();

    @Nullable
    Object isInternalAnalyticsEnabled(@NotNull c<? super Boolean> cVar);

    @Nullable
    Object process(@NotNull AnalyticsEvent analyticsEvent, @NotNull c<? super Unit> cVar);
}
