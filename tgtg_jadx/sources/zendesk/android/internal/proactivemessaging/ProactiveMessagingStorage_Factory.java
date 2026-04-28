package zendesk.android.internal.proactivemessaging;

import s70.c;
import v80.x;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingStorage_Factory implements c {
    private final c persistenceDispatcherProvider;
    private final c storageProvider;

    private ProactiveMessagingStorage_Factory(c cVar, c cVar2) {
        this.storageProvider = cVar;
        this.persistenceDispatcherProvider = cVar2;
    }

    public static ProactiveMessagingStorage_Factory create(c cVar, c cVar2) {
        return new ProactiveMessagingStorage_Factory(cVar, cVar2);
    }

    public static ProactiveMessagingStorage newInstance(Storage storage, x xVar) {
        return new ProactiveMessagingStorage(storage, xVar);
    }

    @Override // t70.a
    public ProactiveMessagingStorage get() {
        return newInstance((Storage) this.storageProvider.get(), (x) this.persistenceDispatcherProvider.get());
    }
}
