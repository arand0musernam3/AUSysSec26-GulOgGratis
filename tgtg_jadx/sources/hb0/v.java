package hb0;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.delegates.TypingIndicatorContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.typingindicatorcell.TypingIndicatorCellRendering;
import zendesk.ui.android.conversation.typingindicatorcell.TypingIndicatorCellState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessagingTheme f21832b;

    public /* synthetic */ v(MessagingTheme messagingTheme, int i11) {
        this.f21831a = i11;
        this.f21832b = messagingTheme;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21831a) {
            case 0:
                return TypingIndicatorContainerAdapterDelegate.ViewHolder.createTypingIndicatorCell$lambda$3$lambda$2$lambda$1(this.f21832b, (TypingIndicatorCellState) obj);
            default:
                return TypingIndicatorContainerAdapterDelegate.ViewHolder.createTypingIndicatorCell$lambda$3$lambda$2(this.f21832b, (TypingIndicatorCellRendering) obj);
        }
    }
}
