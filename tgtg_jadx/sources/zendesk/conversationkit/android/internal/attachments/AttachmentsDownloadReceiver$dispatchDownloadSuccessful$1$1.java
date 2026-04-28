package zendesk.conversationkit.android.internal.attachments;

import ba0.g;
import com.braze.h2;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import x80.m;
import y70.a;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.model.attachments.DownloadAttachmentStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.conversationkit.android.internal.attachments.AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1", f = "AttachmentsDownloadReceiver.kt", l = {125}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ String $conversationId;
    final /* synthetic */ File $file;
    final /* synthetic */ String $filePath;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ AttachmentsDownloadReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1(AttachmentsDownloadReceiver attachmentsDownloadReceiver, File file, String str, String str2, String str3, c<? super AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1> cVar) {
        super(2, cVar);
        this.this$0 = attachmentsDownloadReceiver;
        this.$file = file;
        this.$filePath = str;
        this.$messageId = str2;
        this.$conversationId = str3;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1(this.this$0, this.$file, this.$filePath, this.$messageId, this.$conversationId, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            m mVar = this.this$0._attachmentChannel;
            Action.UpdateDownloadStatusAction updateDownloadStatusAction = new Action.UpdateDownloadStatusAction(new DownloadAttachmentStatus.DownloadAttachmentSuccess(this.$file, this.this$0.retrieveFilename(this.$filePath), this.$messageId, this.$conversationId));
            this.label = 1;
            if (mVar.f(updateDownloadStatusAction, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        return Unit.f26487a;
    }
}
