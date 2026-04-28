package zendesk.messaging.android.internal;

import com.braze.h2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/UnreadMessageCounter;", "", "<init>", "()V", "unreadMessageCounters", "", "", "", "resetConversationUnread", "", "conversationId", "reset", "getUnreadMessageCount", "update", "unreadCount", "increase", "getTotalUnreadMessageCount", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUnreadMessageCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnreadMessageCounter.kt\nzendesk/messaging/android/internal/UnreadMessageCounter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1#2:68\n2783#3,7:69\n*S KotlinDebug\n*F\n+ 1 UnreadMessageCounter.kt\nzendesk/messaging/android/internal/UnreadMessageCounter\n*L\n63#1:69,7\n*E\n"})
public final class UnreadMessageCounter {

    @NotNull
    public static final UnreadMessageCounter INSTANCE = new UnreadMessageCounter();

    @NotNull
    private static final Map<String, Integer> unreadMessageCounters = new LinkedHashMap();

    private UnreadMessageCounter() {
    }

    public final int getTotalUnreadMessageCount() {
        Collection<Integer> collectionValues = unreadMessageCounters.values();
        if (collectionValues.isEmpty()) {
            return 0;
        }
        Iterator<T> it = collectionValues.iterator();
        if (!it.hasNext()) {
            h2.a("Empty collection can't be reduced.");
            return 0;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public final int getUnreadMessageCount(@NotNull String conversationId) {
        conversationId.getClass();
        Integer num = unreadMessageCounters.get(conversationId);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final int increase(@NotNull String conversationId) {
        conversationId.getClass();
        return update(conversationId, getUnreadMessageCount(conversationId) + 1);
    }

    public final void reset() {
        unreadMessageCounters.clear();
    }

    public final void resetConversationUnread(@NotNull String conversationId) {
        conversationId.getClass();
        unreadMessageCounters.put(conversationId, 0);
    }

    public final int update(@NotNull String conversationId, int unreadCount) {
        conversationId.getClass();
        unreadMessageCounters.put(conversationId, Integer.valueOf(unreadCount));
        return unreadCount;
    }
}
