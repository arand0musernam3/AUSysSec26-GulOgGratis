package zendesk.conversationkit.android;

import e40.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.ConversationKitResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"getOrThrow", "T", "Lzendesk/conversationkit/android/ConversationKitResult;", "(Lzendesk/conversationkit/android/ConversationKitResult;)Ljava/lang/Object;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConversationKitResultKt {
    public static final <T> T getOrThrow(@NotNull ConversationKitResult<? extends T> conversationKitResult) throws Throwable {
        conversationKitResult.getClass();
        if (conversationKitResult instanceof ConversationKitResult.Failure) {
            throw ((ConversationKitResult.Failure) conversationKitResult).getCause();
        }
        if (conversationKitResult instanceof ConversationKitResult.Success) {
            return (T) ((ConversationKitResult.Success) conversationKitResult).getValue();
        }
        a.f();
        return null;
    }
}
