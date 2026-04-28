package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import s70.c;
import v80.x;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListLocalStorageIOImpl_Factory implements c {
    private final c persistenceDispatcherProvider;
    private final c storageProvider;

    private ConversationsListLocalStorageIOImpl_Factory(c cVar, c cVar2) {
        this.persistenceDispatcherProvider = cVar;
        this.storageProvider = cVar2;
    }

    public static ConversationsListLocalStorageIOImpl_Factory create(c cVar, c cVar2) {
        return new ConversationsListLocalStorageIOImpl_Factory(cVar, cVar2);
    }

    public static ConversationsListLocalStorageIOImpl newInstance(x xVar, Storage storage) {
        return new ConversationsListLocalStorageIOImpl(xVar, storage);
    }

    @Override // t70.a
    public ConversationsListLocalStorageIOImpl get() {
        return newInstance((x) this.persistenceDispatcherProvider.get(), (Storage) this.storageProvider.get());
    }
}
