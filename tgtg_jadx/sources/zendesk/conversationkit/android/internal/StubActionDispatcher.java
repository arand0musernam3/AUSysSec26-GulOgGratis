package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"Lzendesk/conversationkit/android/internal/StubActionDispatcher;", "Lzendesk/conversationkit/android/internal/ActionDispatcher;", "<init>", "()V", "T", "Lzendesk/conversationkit/android/internal/Action;", "action", "Lzendesk/conversationkit/android/ConversationKitResult;", "dispatch", "(Lzendesk/conversationkit/android/internal/Action;Lx70/c;)Ljava/lang/Object;", "", "invalidate", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StubActionDispatcher implements ActionDispatcher {
    @Override // zendesk.conversationkit.android.internal.ActionDispatcher
    @Nullable
    public <T> Object dispatch(@NotNull Action action, @NotNull x70.c<? super ConversationKitResult<? extends T>> cVar) {
        return new ConversationKitResult.Success(Unit.f26487a);
    }

    @Override // zendesk.conversationkit.android.internal.ActionDispatcher
    public void invalidate() {
        Logger.d("StubActionDispatcher", "Invalidating stub action dispatcher", new Object[0]);
    }
}
