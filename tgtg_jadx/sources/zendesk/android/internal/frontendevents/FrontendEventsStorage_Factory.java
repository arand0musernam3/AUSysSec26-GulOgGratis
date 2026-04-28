package zendesk.android.internal.frontendevents;

import s70.c;
import v80.x;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class FrontendEventsStorage_Factory implements c {
    private final c persistenceDispatcherProvider;
    private final c storageProvider;

    private FrontendEventsStorage_Factory(c cVar, c cVar2) {
        this.storageProvider = cVar;
        this.persistenceDispatcherProvider = cVar2;
    }

    public static FrontendEventsStorage_Factory create(c cVar, c cVar2) {
        return new FrontendEventsStorage_Factory(cVar, cVar2);
    }

    public static FrontendEventsStorage newInstance(Storage storage, x xVar) {
        return new FrontendEventsStorage(storage, xVar);
    }

    @Override // t70.a
    public FrontendEventsStorage get() {
        return newInstance((Storage) this.storageProvider.get(), (x) this.persistenceDispatcherProvider.get());
    }
}
