package zendesk.analyticskit.android.internal.storage;

import s70.c;
import v80.x;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsStorage_Factory implements c {
    private final c jsonProvider;
    private final c persistenceDispatcherProvider;
    private final c storageProvider;

    private AnalyticsStorage_Factory(c cVar, c cVar2, c cVar3) {
        this.storageProvider = cVar;
        this.persistenceDispatcherProvider = cVar2;
        this.jsonProvider = cVar3;
    }

    public static AnalyticsStorage_Factory create(c cVar, c cVar2, c cVar3) {
        return new AnalyticsStorage_Factory(cVar, cVar2, cVar3);
    }

    public static AnalyticsStorage newInstance(Storage storage, x xVar, n90.c cVar) {
        return new AnalyticsStorage(storage, xVar, cVar);
    }

    @Override // t70.a
    public AnalyticsStorage get() {
        return newInstance((Storage) this.storageProvider.get(), (x) this.persistenceDispatcherProvider.get(), (n90.c) this.jsonProvider.get());
    }
}
