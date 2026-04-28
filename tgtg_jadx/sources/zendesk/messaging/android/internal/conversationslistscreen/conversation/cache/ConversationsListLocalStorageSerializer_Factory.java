package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListLocalStorageSerializer_Factory implements c {
    private final c jsonProvider;

    private ConversationsListLocalStorageSerializer_Factory(c cVar) {
        this.jsonProvider = cVar;
    }

    public static ConversationsListLocalStorageSerializer_Factory create(c cVar) {
        return new ConversationsListLocalStorageSerializer_Factory(cVar);
    }

    public static ConversationsListLocalStorageSerializer newInstance(n90.c cVar) {
        return new ConversationsListLocalStorageSerializer(cVar);
    }

    @Override // t70.a
    public ConversationsListLocalStorageSerializer get() {
        return newInstance((n90.c) this.jsonProvider.get());
    }
}
