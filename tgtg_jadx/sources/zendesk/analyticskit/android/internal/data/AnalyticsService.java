package zendesk.analyticskit.android.internal.data;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.a;
import ra0.o;
import ra0.t;
import x70.c;
import zendesk.analyticskit.android.internal.model.AnalyticsEventsDto;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/analyticskit/android/internal/data/AnalyticsService;", "", "", Bayeux.KEY_CLIENT_ID, "Lzendesk/analyticskit/android/internal/model/AnalyticsEventsDto;", "events", "", "sendAnalyticsEvents", "(Ljava/lang/String;Lzendesk/analyticskit/android/internal/model/AnalyticsEventsDto;Lx70/c;)Ljava/lang/Object;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AnalyticsService {
    @o("/frontendevents/dl")
    @Nullable
    Object sendAnalyticsEvents(@t("client") @NotNull String str, @NotNull @a AnalyticsEventsDto analyticsEventsDto, @NotNull c<? super Unit> cVar);
}
