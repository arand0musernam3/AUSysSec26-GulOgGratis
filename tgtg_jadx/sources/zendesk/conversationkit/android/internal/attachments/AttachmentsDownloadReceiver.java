package zendesk.conversationkit.android.internal.attachments;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import ba0.g;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import x70.c;
import x80.m;
import y70.a;
import y80.i;
import y80.r;
import z70.e;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.model.attachments.DownloadAttachmentStatus;
import zendesk.core.android.internal.FileKtxKt;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;", "Landroid/content/BroadcastReceiver;", "Lv80/b0;", "coroutineScope", "<init>", "(Lv80/b0;)V", "", "downloadId", "Landroid/content/Context;", "context", "", "handleDownloadingFileByStatus", "(JLandroid/content/Context;)V", "", "filePath", "messageId", "conversationId", "dispatchDownloadFailed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "dispatchDownloadSuccessful", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "retrieveFilename", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "registerAttachmentsReceiver$zendesk_conversationkit_conversationkit_android", "(Landroid/content/Context;)V", "registerAttachmentsReceiver", "unregisterAttachmentsReceiver$zendesk_conversationkit_conversationkit_android", "unregisterAttachmentsReceiver", "Lv80/b0;", "Landroid/app/DownloadManager;", "downloadManager", "Landroid/app/DownloadManager;", "", "isReceiverRegistered", "Z", "Lx80/m;", "Lzendesk/conversationkit/android/internal/Action;", "_attachmentChannel", "Lx80/m;", "Ly80/i;", "attachmentChannel", "Ly80/i;", "getAttachmentChannel", "()Ly80/i;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentsDownloadReceiver extends BroadcastReceiver {

    @NotNull
    private static final String LOG_TAG = "AttachmentsDownloadReceiver";

    @NotNull
    private final m _attachmentChannel;

    @NotNull
    private final i attachmentChannel;

    @NotNull
    private final b0 coroutineScope;
    private DownloadManager downloadManager;
    private boolean isReceiverRegistered;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.attachments.AttachmentsDownloadReceiver$dispatchDownloadFailed$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.attachments.AttachmentsDownloadReceiver$dispatchDownloadFailed$1", f = "AttachmentsDownloadReceiver.kt", l = {105}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $filePath;
        final /* synthetic */ String $messageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$filePath = str;
            this.$messageId = str2;
            this.$conversationId = str3;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return AttachmentsDownloadReceiver.this.new AnonymousClass1(this.$filePath, this.$messageId, this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = AttachmentsDownloadReceiver.this._attachmentChannel;
                Action.UpdateDownloadStatusAction updateDownloadStatusAction = new Action.UpdateDownloadStatusAction(new DownloadAttachmentStatus.DownloadAttachmentFailed(AttachmentsDownloadReceiver.this.retrieveFilename(this.$filePath), this.$messageId, this.$conversationId));
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

    public AttachmentsDownloadReceiver(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.coroutineScope = b0Var;
        x80.i iVarA = cg.a(0, null, null, 7);
        this._attachmentChannel = iVarA;
        this.attachmentChannel = r.w(iVarA);
    }

    private final void dispatchDownloadFailed(String filePath, String messageId, String conversationId) {
        f0.B(this.coroutineScope, null, null, new AnonymousClass1(filePath, messageId, conversationId, null), 3);
    }

    private final void dispatchDownloadSuccessful(String filePath, String messageId, String conversationId, Context context) {
        File fileDoesFileExistInSDKExternalStorage = FileKtxKt.doesFileExistInSDKExternalStorage(filePath, context);
        if (fileDoesFileExistInSDKExternalStorage != null) {
            f0.B(this.coroutineScope, null, null, new AttachmentsDownloadReceiver$dispatchDownloadSuccessful$1$1(this, fileDoesFileExistInSDKExternalStorage, filePath, messageId, conversationId, null), 3);
        }
    }

    private final void handleDownloadingFileByStatus(long downloadId, Context context) throws IOException {
        DownloadManager downloadManager = this.downloadManager;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadManager");
            downloadManager = null;
        }
        Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(downloadId));
        try {
            if (cursorQuery.moveToFirst()) {
                int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndex(MessageBundle.TITLE_ENTRY));
                cursorQuery.close();
                string.getClass();
                String strX = StringsKt.X(StringsKt.b0(string, "_"), "_");
                String strB0 = StringsKt.b0(StringsKt.X(string, "_"), ".");
                if (i11 == 8) {
                    dispatchDownloadSuccessful(string, strX, strB0, context);
                } else {
                    dispatchDownloadFailed(string, strX, strB0);
                }
            }
            cursorQuery.close();
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveFilename(String filePath) {
        return StringsKt.b0(StringsKt.b0(filePath, "_"), "_").concat(".".concat(StringsKt.X(filePath, ".")));
    }

    @NotNull
    public final i getAttachmentChannel() {
        return this.attachmentChannel;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) throws IOException {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) DownloadManager.class);
        systemService.getClass();
        this.downloadManager = (DownloadManager) systemService;
        if (intent != null) {
            handleDownloadingFileByStatus(intent.getLongExtra("extra_download_id", -1L), context);
        }
    }

    public final void registerAttachmentsReceiver$zendesk_conversationkit_conversationkit_android(@NotNull Context context) {
        context.getClass();
        if (this.isReceiverRegistered) {
            return;
        }
        androidx.core.app.e.j(context, this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        this.isReceiverRegistered = true;
    }

    public final void unregisterAttachmentsReceiver$zendesk_conversationkit_conversationkit_android(@NotNull Context context) {
        context.getClass();
        if (this.isReceiverRegistered) {
            try {
                context.unregisterReceiver(this);
                this.isReceiverRegistered = false;
            } catch (IllegalArgumentException e5) {
                Logger.e(LOG_TAG, "Failed to unregister AttachmentsDownloadReceiver", e5, new Object[0]);
            }
        }
    }
}
