package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenCoordinator f47667b;

    public /* synthetic */ e(ConversationScreenCoordinator conversationScreenCoordinator, int i11) {
        this.f47666a = i11;
        this.f47667b = conversationScreenCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47666a) {
            case 0:
                return ConversationScreenCoordinator.launchCamera$lambda$34$lambda$33(this.f47667b);
            case 1:
                return ConversationScreenCoordinator.onSeeLatestViewClicked$lambda$28(this.f47667b);
            case 2:
                return ConversationScreenCoordinator.onRetryLoadConversation$lambda$31(this.f47667b);
            case 3:
                return ConversationScreenCoordinator.onDeniedPermissionDismissed$lambda$24(this.f47667b);
            default:
                return ConversationScreenCoordinator.launchGallery$lambda$37$lambda$36(this.f47667b);
        }
    }
}
