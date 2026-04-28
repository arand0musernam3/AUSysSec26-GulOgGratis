package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.ConversationKitResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzendesk/conversationkit/android/internal/ActionDispatcher;", "", "T", "Lzendesk/conversationkit/android/internal/Action;", "action", "Lzendesk/conversationkit/android/ConversationKitResult;", "dispatch", "(Lzendesk/conversationkit/android/internal/Action;Lx70/c;)Ljava/lang/Object;", "", "invalidate", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ActionDispatcher {
    @Nullable
    <T> Object dispatch(@NotNull Action action, @NotNull x70.c<? super ConversationKitResult<? extends T>> cVar);

    void invalidate();
}
