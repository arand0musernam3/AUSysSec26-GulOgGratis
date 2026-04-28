package zendesk.messaging.android.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.VisibleScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/VisibleScreenTracker;", "", "<init>", "()V", "visibleScreens", "", "Lzendesk/messaging/android/internal/VisibleScreen;", "setShownScreen", "", "screen", "setShownScreen$zendesk_messaging_messaging_android", "setHiddenScreen", "setHiddenScreen$zendesk_messaging_messaging_android", "getVisibleScreens", "", "getVisibleScreens$zendesk_messaging_messaging_android", "clearVisibleScreens", "clearVisibleScreens$zendesk_messaging_messaging_android", "hasVisibleScreen", "", "hasVisibleScreen$zendesk_messaging_messaging_android", "isConversationVisibleOnScreen", "conversationId", "", "isConversationVisibleOnScreen$zendesk_messaging_messaging_android", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisibleScreenTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibleScreenTracker.kt\nzendesk/messaging/android/internal/VisibleScreenTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1761#2,3:80\n*S KotlinDebug\n*F\n+ 1 VisibleScreenTracker.kt\nzendesk/messaging/android/internal/VisibleScreenTracker\n*L\n52#1:80,3\n*E\n"})
public final class VisibleScreenTracker {

    @NotNull
    public static final VisibleScreenTracker INSTANCE = new VisibleScreenTracker();

    @NotNull
    private static final Set<VisibleScreen> visibleScreens = new LinkedHashSet();

    private VisibleScreenTracker() {
    }

    public final void clearVisibleScreens$zendesk_messaging_messaging_android() {
        visibleScreens.clear();
    }

    @NotNull
    public final Set<VisibleScreen> getVisibleScreens$zendesk_messaging_messaging_android() {
        return visibleScreens;
    }

    public final boolean hasVisibleScreen$zendesk_messaging_messaging_android() {
        return !visibleScreens.isEmpty();
    }

    public final boolean isConversationVisibleOnScreen$zendesk_messaging_messaging_android(@NotNull String conversationId) {
        conversationId.getClass();
        ArrayList arrayListB = k0.B(getVisibleScreens$zendesk_messaging_messaging_android(), VisibleScreen.ConversationScreen.class);
        if (arrayListB.isEmpty()) {
            return false;
        }
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((VisibleScreen.ConversationScreen) it.next()).getConversationId(), conversationId)) {
                return true;
            }
        }
        return false;
    }

    public final void setHiddenScreen$zendesk_messaging_messaging_android(@NotNull VisibleScreen screen) {
        screen.getClass();
        visibleScreens.remove(screen);
    }

    public final void setShownScreen$zendesk_messaging_messaging_android(@NotNull VisibleScreen screen) {
        screen.getClass();
        Set<VisibleScreen> set = visibleScreens;
        set.remove(screen);
        set.add(screen);
    }
}
