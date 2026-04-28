package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenView f47707b;

    public /* synthetic */ s(ConversationScreenView conversationScreenView, int i11) {
        this.f47706a = i11;
        this.f47707b = conversationScreenView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47706a) {
            case 0:
                return ConversationScreenView.retryErrorViewRenderingUpdate$lambda$18$lambda$17(this.f47707b);
            case 1:
                return ConversationScreenView.postbackFailureBannerRenderingUpdate$lambda$21$lambda$20(this.f47707b);
            default:
                return ConversationScreenView.messageLogViewRenderingUpdate$lambda$9$lambda$8(this.f47707b);
        }
    }
}
