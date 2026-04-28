package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.x;
import zendesk.conversationkit.android.internal.ConversationKitDispatchers;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/DefaultConversationKitDispatchers;", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultConversationKitDispatchers implements ConversationKitDispatchers {
    @Override // zendesk.conversationkit.android.internal.ConversationKitDispatchers
    @NotNull
    /* JADX INFO: renamed from: default */
    public x mo991default() {
        return ConversationKitDispatchers.DefaultImpls.m992default(this);
    }

    @Override // zendesk.conversationkit.android.internal.ConversationKitDispatchers
    @NotNull
    public x io() {
        return ConversationKitDispatchers.DefaultImpls.io(this);
    }

    @Override // zendesk.conversationkit.android.internal.ConversationKitDispatchers
    @NotNull
    public x main() {
        return ConversationKitDispatchers.DefaultImpls.main(this);
    }
}
