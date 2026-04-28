package hb0;

import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.file.FileState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessageLogEntry.FileMessageContainer f21711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessageContent f21712e;

    public /* synthetic */ e(MessageContent messageContent, int i11, int i12, MessageLogEntry.FileMessageContainer fileMessageContainer, int i13) {
        this.f21708a = i13;
        this.f21712e = messageContent;
        this.f21709b = i11;
        this.f21710c = i12;
        this.f21711d = fileMessageContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21708a) {
            case 0:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileCell$lambda$5$lambda$4$lambda$2((MessageContent.File) this.f21712e, this.f21709b, this.f21710c, this.f21711d, (FileState) obj);
            default:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileUploadCell$lambda$9$lambda$8$lambda$6((MessageContent.FileUpload) this.f21712e, this.f21709b, this.f21710c, this.f21711d, (FileState) obj);
        }
    }
}
