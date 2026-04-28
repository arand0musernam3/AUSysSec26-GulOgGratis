package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionLoadingState;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationExtensionBottomSheetFragment f47657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationExtensionState f47658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConversationExtensionLoadingState f47659d;

    public /* synthetic */ b(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, ConversationExtensionState conversationExtensionState, ConversationExtensionLoadingState conversationExtensionLoadingState, int i11) {
        this.f47656a = i11;
        this.f47657b = conversationExtensionBottomSheetFragment;
        this.f47658c = conversationExtensionState;
        this.f47659d = conversationExtensionLoadingState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47656a) {
            case 0:
                return ConversationExtensionBottomSheetFragment.renderState$lambda$10(this.f47657b, this.f47658c, this.f47659d, (ConversationExtensionRendering) obj);
            default:
                return ConversationExtensionBottomSheetFragment.renderState$lambda$10$lambda$9(this.f47657b, this.f47658c, this.f47659d, (zendesk.ui.android.conversation.conversationextension.ConversationExtensionState) obj);
        }
    }
}
