package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationFragment f47650b;

    public /* synthetic */ a(ConversationFragment conversationFragment, int i11) {
        this.f47649a = i11;
        this.f47650b = conversationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47649a) {
            case 0:
                return ConversationFragment.attachmentIntents_delegate$lambda$0(this.f47650b);
            case 1:
                return ConversationFragment.onDeniedPermissionActionClicked$lambda$9(this.f47650b);
            default:
                return ConversationFragment.setupAttachmentIntentLauncher$lambda$11(this.f47650b);
        }
    }
}
