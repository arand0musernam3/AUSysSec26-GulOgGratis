package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.file.FileRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13754f;

    public /* synthetic */ b3(c3 c3Var, int i11, z4.m1 m1Var, int i12, z4.w0 w0Var) {
        this.f13749a = 0;
        this.f13752d = c3Var;
        this.f13750b = i11;
        this.f13753e = m1Var;
        this.f13751c = i12;
        this.f13754f = w0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13749a) {
            case 0:
                c3 c3Var = (c3) this.f13752d;
                z4.m1 m1Var = (z4.m1) this.f13753e;
                z4.w0 w0Var = (z4.w0) this.f13754f;
                z4.l1.n((z4.l1) obj, m1Var, ((z5.j) c3Var.f13770p.invoke(new z5.l((((long) (this.f13750b - m1Var.f47183a)) << 32) | (((long) (this.f13751c - m1Var.f47184b)) & 4294967295L)), w0Var.getLayoutDirection())).f47280a);
                return Unit.f26487a;
            case 1:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileCell$lambda$5$lambda$4((MessageContent.File) this.f13752d, this.f13750b, this.f13751c, (MessageLogEntry.FileMessageContainer) this.f13753e, (Function1) this.f13754f, (FileRendering) obj);
            default:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileUploadCell$lambda$9$lambda$8((MessageContent.FileUpload) this.f13752d, this.f13750b, this.f13751c, (MessageLogEntry.FileMessageContainer) this.f13753e, (Function1) this.f13754f, (FileRendering) obj);
        }
    }

    public /* synthetic */ b3(MessageContent messageContent, int i11, int i12, MessageLogEntry.FileMessageContainer fileMessageContainer, Function1 function1, int i13) {
        this.f13749a = i13;
        this.f13752d = messageContent;
        this.f13750b = i11;
        this.f13751c = i12;
        this.f13753e = fileMessageContainer;
        this.f13754f = function1;
    }
}
