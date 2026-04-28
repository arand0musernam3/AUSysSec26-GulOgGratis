package zendesk.conversationkit.android.internal;

import a90.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.p0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "", "Lv80/x;", "main", "()Lv80/x;", "default", "io", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationKitDispatchers {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public static x m992default(@NotNull ConversationKitDispatchers conversationKitDispatchers) {
            return p0.f42144a;
        }

        @NotNull
        public static x io(@NotNull ConversationKitDispatchers conversationKitDispatchers) {
            c90.f fVar = p0.f42144a;
            return c90.e.f7834b;
        }

        @NotNull
        public static x main(@NotNull ConversationKitDispatchers conversationKitDispatchers) {
            c90.f fVar = p0.f42144a;
            return p.f1044a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    x mo991default();

    @NotNull
    x io();

    @NotNull
    x main();
}
