package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogRendering;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogState;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerState;
import zendesk.ui.android.conversation.composer.MessageComposerRendering;
import zendesk.ui.android.conversation.composer.MessageComposerState;
import zendesk.ui.android.conversation.header.ConversationHeaderRendering;
import zendesk.ui.android.conversation.header.ConversationHeaderState;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerRendering;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerState;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenView f47702b;

    public /* synthetic */ q(ConversationScreenView conversationScreenView, int i11) {
        this.f47701a = i11;
        this.f47702b = conversationScreenView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47701a) {
            case 0:
                return ConversationScreenView.conversationHeaderRenderingUpdate$lambda$1(this.f47702b, (ConversationHeaderRendering) obj);
            case 1:
                return ConversationScreenView.connectionBannerRenderingUpdate$lambda$3$lambda$2(this.f47702b, (ConnectionBannerState) obj);
            case 2:
                return ConversationScreenView.conversationHeaderRenderingUpdate$lambda$1$lambda$0(this.f47702b, (ConversationHeaderState) obj);
            case 3:
                return ConversationScreenView.waitTimeBannerViewRenderingUpdate$lambda$23$lambda$22(this.f47702b, (WaitTimeBannerState) obj);
            case 4:
                return ConversationScreenView.messageLogViewRenderingUpdate$lambda$9$lambda$4(this.f47702b, (MessageLogState) obj);
            case 5:
                return ConversationScreenView.messageLogViewRenderingUpdate$lambda$9$lambda$6(this.f47702b, ((Boolean) obj).booleanValue());
            case 6:
                return ConversationScreenView.connectionBannerRenderingUpdate$lambda$3(this.f47702b, (ConnectionBannerRendering) obj);
            case 7:
                return ConversationScreenView.messageComposerRenderingUpdate$lambda$11$lambda$10(this.f47702b, (MessageComposerState) obj);
            case 8:
                return ConversationScreenView.messageLogViewRenderingUpdate$lambda$9(this.f47702b, (MessageLogRendering) obj);
            case 9:
                return ConversationScreenView.messageComposerRenderingUpdate$lambda$11(this.f47702b, (MessageComposerRendering) obj);
            case 10:
                return ConversationScreenView.loadingIndicatorRenderingUpdate$lambda$15(this.f47702b, (LoadingIndicatorRendering) obj);
            default:
                return ConversationScreenView.waitTimeBannerViewRenderingUpdate$lambda$23(this.f47702b, (WaitTimeBannerRendering) obj);
        }
    }
}
