package hb0;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.textcell.TextCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellState;
import zendesk.ui.android.conversation.textcell.TextCellView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextCellView f21778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessageLogEntry.TextMessageContainer f21781e;

    public /* synthetic */ p(TextCellView textCellView, int i11, int i12, MessageLogEntry.TextMessageContainer textMessageContainer, int i13) {
        this.f21777a = i13;
        this.f21778b = textCellView;
        this.f21779c = i11;
        this.f21780d = i12;
        this.f21781e = textMessageContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21777a) {
            case 0:
                return TextMessageContainerAdapterDelegate.ViewHolder.createUnsupportedCell$lambda$21$lambda$20$lambda$19(this.f21778b, this.f21779c, this.f21780d, this.f21781e, (TextCellState) obj);
            default:
                return TextMessageContainerAdapterDelegate.ViewHolder.createUnsupportedCell$lambda$21$lambda$20(this.f21778b, this.f21779c, this.f21780d, this.f21781e, (TextCellRendering) obj);
        }
    }
}
