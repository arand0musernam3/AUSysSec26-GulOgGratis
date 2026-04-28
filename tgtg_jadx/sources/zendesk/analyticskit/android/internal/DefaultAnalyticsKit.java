package zendesk.analyticskit.android.internal;

import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.analyticskit.android.internal.data.AnalyticsRepository;
import zendesk.analyticskit.android.model.AnalyticsEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/analyticskit/android/internal/DefaultAnalyticsKit;", "Lzendesk/analyticskit/android/AnalyticsKit;", "Lzendesk/analyticskit/android/internal/data/AnalyticsRepository;", "analyticsRepository", "<init>", "(Lzendesk/analyticskit/android/internal/data/AnalyticsRepository;)V", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "analyticsEvent", "", "process", "(Lzendesk/analyticskit/android/model/AnalyticsEvent;Lx70/c;)Ljava/lang/Object;", "", FeatureFlag.ENABLED, "enableInternalAnalytics", "(ZLx70/c;)Ljava/lang/Object;", "isInternalAnalyticsEnabled", "(Lx70/c;)Ljava/lang/Object;", "", "getCurrentSessionId", "()Ljava/lang/String;", "Lzendesk/analyticskit/android/internal/data/AnalyticsRepository;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultAnalyticsKit implements AnalyticsKit {

    @NotNull
    private final AnalyticsRepository analyticsRepository;

    public DefaultAnalyticsKit(@NotNull AnalyticsRepository analyticsRepository) {
        analyticsRepository.getClass();
        this.analyticsRepository = analyticsRepository;
        analyticsRepository.processAllAnalyticsEvents();
    }

    @Override // zendesk.analyticskit.android.AnalyticsKit
    @Nullable
    public Object enableInternalAnalytics(boolean z11, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objEnableInternalAnalytics = this.analyticsRepository.enableInternalAnalytics(z11, cVar);
        return objEnableInternalAnalytics == a.COROUTINE_SUSPENDED ? objEnableInternalAnalytics : Unit.f26487a;
    }

    @Override // zendesk.analyticskit.android.AnalyticsKit
    @NotNull
    public String getCurrentSessionId() {
        return this.analyticsRepository.getSuid();
    }

    @Override // zendesk.analyticskit.android.AnalyticsKit
    @Nullable
    public Object isInternalAnalyticsEnabled(@NotNull c<? super Boolean> cVar) {
        return this.analyticsRepository.isInternalAnalyticsEnabled(cVar);
    }

    @Override // zendesk.analyticskit.android.AnalyticsKit
    @Nullable
    public Object process(@NotNull AnalyticsEvent analyticsEvent, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objProcess = this.analyticsRepository.process(analyticsEvent, cVar);
        return objProcess == a.COROUTINE_SUSPENDED ? objProcess : Unit.f26487a;
    }
}
