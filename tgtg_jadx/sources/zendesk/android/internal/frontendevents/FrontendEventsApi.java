package zendesk.android.internal.frontendevents;

import kotlin.Metadata;
import kotlin.Unit;
import oa0.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.a;
import ra0.k;
import ra0.o;
import ra0.t;
import x70.c;
import zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveMessageAnalyticsEvent;
import zendesk.android.internal.frontendevents.pageviewevents.model.PageViewEventDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzendesk/android/internal/frontendevents/FrontendEventsApi;", "", "", "client", "Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto;", "pageViewEventDto", "Loa0/n0;", "", "sendPageViewEvent", "(Ljava/lang/String;Lzendesk/android/internal/frontendevents/pageviewevents/model/PageViewEventDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent;", "proactiveMessageAnalyticsEvent", "sendProactiveCampaignAnalyticsEvent", "(Ljava/lang/String;Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveMessageAnalyticsEvent;Lx70/c;)Ljava/lang/Object;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FrontendEventsApi {
    @k({"X-Zendesk-Api-Version:2021-01-01"})
    @o("/frontendevents/pv")
    @Nullable
    Object sendPageViewEvent(@t("client") @NotNull String str, @NotNull @a PageViewEventDto pageViewEventDto, @NotNull c<? super n0<Unit>> cVar);

    @o("/frontendevents/pca")
    @Nullable
    Object sendProactiveCampaignAnalyticsEvent(@t("client") @NotNull String str, @NotNull @a ProactiveMessageAnalyticsEvent proactiveMessageAnalyticsEvent, @NotNull c<? super Unit> cVar);
}
