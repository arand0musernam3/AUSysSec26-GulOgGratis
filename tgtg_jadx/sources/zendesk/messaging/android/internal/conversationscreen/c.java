package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationFragment f47653b;

    public /* synthetic */ c(ConversationFragment conversationFragment, int i11) {
        this.f47652a = i11;
        this.f47653b = conversationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47652a) {
            case 0:
                return ConversationFragment.onCopyTextAction$lambda$5(this.f47653b, (String) obj);
            case 1:
                return ConversationFragment.onAttachButtonClicked$lambda$6(this.f47653b, ((Integer) obj).intValue());
            case 2:
                return ConversationFragment.onBackButtonClickedHandler$lambda$7(this.f47653b, (String) obj);
            default:
                return ConversationFragment.setupAttachmentIntentLauncher$lambda$10(this.f47653b, (List) obj);
        }
    }
}
