package b3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z4.l1;
import z4.m1;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.imagecell.ImageCellState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5622a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5627f;

    public /* synthetic */ o(m1 m1Var, int i11, m1 m1Var2, int i12, int i13) {
        this.f5626e = m1Var;
        this.f5623b = i11;
        this.f5627f = m1Var2;
        this.f5624c = i12;
        this.f5625d = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5622a) {
            case 0:
                m1 m1Var = (m1) this.f5626e;
                m1 m1Var2 = (m1) this.f5627f;
                l1 l1Var = (l1) obj;
                l1.o(l1Var, m1Var, 0, this.f5623b);
                l1.o(l1Var, m1Var2, this.f5624c, this.f5625d);
                return Unit.f26487a;
            default:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileImageUploadCell$lambda$13$lambda$12$lambda$10((MessageContent.FileUpload) this.f5626e, (MessageLogEntry.FileMessageContainer) this.f5627f, this.f5623b, this.f5624c, this.f5625d, (ImageCellState) obj);
        }
    }

    public /* synthetic */ o(MessageContent.FileUpload fileUpload, MessageLogEntry.FileMessageContainer fileMessageContainer, int i11, int i12, int i13) {
        this.f5626e = fileUpload;
        this.f5627f = fileMessageContainer;
        this.f5623b = i11;
        this.f5624c = i12;
        this.f5625d = i13;
    }
}
