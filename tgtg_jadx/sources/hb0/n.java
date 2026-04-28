package hb0;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.delegates.MessagesDividerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.messagesdivider.MessagesDividerRendering;
import zendesk.ui.android.conversation.messagesdivider.MessagesDividerState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageLogEntry.MessagesDivider f21772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessagesDividerState f21773c;

    public /* synthetic */ n(MessageLogEntry.MessagesDivider messagesDivider, MessagesDividerState messagesDividerState, int i11) {
        this.f21771a = i11;
        this.f21772b = messagesDivider;
        this.f21773c = messagesDividerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21771a) {
            case 0:
                return MessagesDividerAdapterDelegate.ViewHolder.bind$lambda$1$lambda$0(this.f21772b, this.f21773c, (MessagesDividerState) obj);
            default:
                return MessagesDividerAdapterDelegate.ViewHolder.bind$lambda$1(this.f21772b, this.f21773c, (MessagesDividerRendering) obj);
        }
    }
}
