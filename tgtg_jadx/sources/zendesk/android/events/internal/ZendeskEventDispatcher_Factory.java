package zendesk.android.events.internal;

import s70.c;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZendeskEventDispatcher_Factory implements c {
    private final c mainDispatcherProvider;

    private ZendeskEventDispatcher_Factory(c cVar) {
        this.mainDispatcherProvider = cVar;
    }

    public static ZendeskEventDispatcher_Factory create(c cVar) {
        return new ZendeskEventDispatcher_Factory(cVar);
    }

    public static ZendeskEventDispatcher newInstance(x xVar) {
        return new ZendeskEventDispatcher(xVar);
    }

    @Override // t70.a
    public ZendeskEventDispatcher get() {
        return newInstance((x) this.mainDispatcherProvider.get());
    }
}
