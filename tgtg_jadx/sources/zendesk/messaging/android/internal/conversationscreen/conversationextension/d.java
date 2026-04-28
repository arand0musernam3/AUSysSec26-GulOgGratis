package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47662a;

    public /* synthetic */ d(int i11) {
        this.f47662a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47662a) {
            case 0:
                return ConversationExtensionBottomSheetFragment.AnonymousClass2.emit$lambda$0((ConversationExtensionRendering) obj);
            default:
                return ConversationExtensionBottomSheetFragment.defaultRendering$lambda$8$lambda$7((zendesk.ui.android.conversation.conversationextension.ConversationExtensionState) obj);
        }
    }
}
