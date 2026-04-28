package zendesk.ui.android.conversation.conversationextension;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderRendering;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderState;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;
import zendesk.ui.android.conversations.LoadingIndicatorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationExtensionView f47836b;

    public /* synthetic */ b(ConversationExtensionView conversationExtensionView, int i11) {
        this.f47835a = i11;
        this.f47836b = conversationExtensionView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47835a) {
            case 0:
                return ConversationExtensionView.webViewJavaScriptApi$lambda$1(this.f47836b, (String) obj);
            case 1:
                return ConversationExtensionView.renderLoadingIndicatorView$lambda$9(this.f47836b, (LoadingIndicatorRendering) obj);
            case 2:
                return ConversationExtensionView.renderLoadingIndicatorView$lambda$9$lambda$8(this.f47836b, (LoadingIndicatorState) obj);
            case 3:
                return ConversationExtensionView.renderHeader$lambda$7(this.f47836b, (ConversationExtensionHeaderRendering) obj);
            case 4:
                return ConversationExtensionView.renderRetryErrorView$lambda$12(this.f47836b, (RetryErrorRendering) obj);
            case 5:
                return ConversationExtensionView.renderHeader$lambda$7$lambda$5(this.f47836b, (ConversationExtensionHeaderState) obj);
            default:
                return ConversationExtensionView.renderHeader$lambda$7$lambda$6(this.f47836b, (ConversationExtensionHeaderState.ButtonName) obj);
        }
    }
}
