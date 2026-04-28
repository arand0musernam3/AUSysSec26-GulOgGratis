package zendesk.android.internal.frontendevents.pageviewevents;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import zendesk.android.ZendeskResult;
import zendesk.android.internal.ZendeskError;
import zendesk.android.pageviewevents.PageView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzendesk/android/internal/frontendevents/pageviewevents/NotInitializedPageViewEvents;", "Lzendesk/android/internal/frontendevents/pageviewevents/PageViewEvents;", "<init>", "()V", "Lzendesk/android/pageviewevents/PageView;", "pageView", "Lzendesk/android/ZendeskResult;", "", "", "sendPageViewEvent", "(Lzendesk/android/pageviewevents/PageView;Lx70/c;)Ljava/lang/Object;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotInitializedPageViewEvents implements PageViewEvents {

    @NotNull
    public static final NotInitializedPageViewEvents INSTANCE = new NotInitializedPageViewEvents();

    private NotInitializedPageViewEvents() {
    }

    @Override // zendesk.android.internal.frontendevents.pageviewevents.PageViewEvents
    @Nullable
    public Object sendPageViewEvent(@NotNull PageView pageView, @NotNull c<? super ZendeskResult<Unit, ? extends Throwable>> cVar) {
        return new ZendeskResult.Failure(ZendeskError.NotInitialized.INSTANCE);
    }
}
