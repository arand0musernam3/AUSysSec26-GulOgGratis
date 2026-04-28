package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenViewModel f47665c;

    public /* synthetic */ d(String str, ConversationScreenViewModel conversationScreenViewModel, int i11) {
        this.f47663a = i11;
        this.f47664b = str;
        this.f47665c = conversationScreenViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47663a) {
            case 0:
                return ConversationScreenCoordinator.onFailedMessageClicked$lambda$8$lambda$7(this.f47664b, this.f47665c, (Message) obj);
            case 1:
                return ConversationScreenCoordinator.onComposerTextChanged$lambda$18$lambda$17(this.f47664b, this.f47665c, (String) obj);
            case 2:
                return ConversationScreenCoordinator.onLoadMoreMessages$lambda$27$lambda$26(this.f47664b, this.f47665c, ((Double) obj).doubleValue());
            default:
                return ConversationScreenCoordinator.onReplyActionSelectedProvider$lambda$5$lambda$4(this.f47664b, this.f47665c, (MessageAction.Reply) obj);
        }
    }
}
