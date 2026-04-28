package zendesk.ui.android.conversation.conversationextension;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationExtensionView f47834b;

    public /* synthetic */ a(ConversationExtensionView conversationExtensionView, int i11) {
        this.f47833a = i11;
        this.f47834b = conversationExtensionView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47833a) {
            case 0:
                return ConversationExtensionView.webViewJavaScriptApi$lambda$0(this.f47834b);
            default:
                return ConversationExtensionView.renderRetryErrorView$lambda$12$lambda$11(this.f47834b);
        }
    }
}
