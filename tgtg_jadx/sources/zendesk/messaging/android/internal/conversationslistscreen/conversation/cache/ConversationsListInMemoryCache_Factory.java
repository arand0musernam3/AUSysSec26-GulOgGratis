package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListInMemoryCache_Factory implements c {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class InstanceHolder {
        static final ConversationsListInMemoryCache_Factory INSTANCE = new ConversationsListInMemoryCache_Factory();

        private InstanceHolder() {
        }
    }

    public static ConversationsListInMemoryCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ConversationsListInMemoryCache newInstance() {
        return new ConversationsListInMemoryCache();
    }

    @Override // t70.a
    public ConversationsListInMemoryCache get() {
        return newInstance();
    }
}
