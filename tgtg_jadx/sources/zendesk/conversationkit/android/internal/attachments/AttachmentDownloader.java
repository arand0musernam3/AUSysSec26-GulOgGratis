package zendesk.conversationkit.android.internal.attachments;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import ba0.g;
import com.braze.Constants;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import j4.s;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u00.d;
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
import zendesk.conversationkit.android.model.attachments.ProcessAttachmentStatus;
import zendesk.core.android.internal.FileKtxKt;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010,\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "", "Landroid/content/Context;", "context", "Lv80/b0;", "coroutineScope", "Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;", "attachmentsDownloadReceiver", "<init>", "(Landroid/content/Context;Lv80/b0;Lzendesk/conversationkit/android/internal/attachments/AttachmentsDownloadReceiver;)V", "", "fileName", "mediaUrl", "messageId", "conversationId", "constructFilename", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "mimeType", "authorizationHeader", "", "downloadFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J", "downloadId", "", "enqueueAttachmentDownload", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus;", "processAttachment$zendesk_conversationkit_conversationkit_android", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus;", "processAttachment", "Landroid/content/Context;", "Lv80/b0;", "Lx80/m;", "Lzendesk/conversationkit/android/internal/Action;", "_attachmentChannel", "Lx80/m;", "Ly80/i;", "attachmentChannel", "Ly80/i;", "getAttachmentChannel", "()Ly80/i;", "Landroid/app/DownloadManager;", "kotlin.jvm.PlatformType", "downloadManager", "Landroid/app/DownloadManager;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttachmentDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachmentDownloader.kt\nzendesk/conversationkit/android/internal/attachments/AttachmentDownloader\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,186:1\n29#2:187\n*S KotlinDebug\n*F\n+ 1 AttachmentDownloader.kt\nzendesk/conversationkit/android/internal/attachments/AttachmentDownloader\n*L\n130#1:187\n*E\n"})
public final class AttachmentDownloader {

    @NotNull
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final long DOWNLOAD_TIMEOUT = TimeConstants.ONE_MINUTE_DIFFERENCE;

    @NotNull
    private final m _attachmentChannel;

    @NotNull
    private final i attachmentChannel;

    @NotNull
    private final Context context;

    @NotNull
    private final b0 coroutineScope;
    private final DownloadManager downloadManager;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.attachments.AttachmentDownloader$enqueueAttachmentDownload$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.attachments.AttachmentDownloader$enqueueAttachmentDownload$1", f = "AttachmentDownloader.kt", l = {158, 166}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ long $downloadId;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $messageId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j9, String str, String str2, String str3, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$downloadId = j9;
            this.$fileName = str;
            this.$messageId = str2;
            this.$conversationId = str3;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return AttachmentDownloader.this.new AnonymousClass1(this.$downloadId, this.$fileName, this.$messageId, this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            Cursor cursorQuery;
            AttachmentDownloader attachmentDownloader;
            long j9;
            String str;
            String str2;
            String str3;
            Closeable closeable;
            Throwable th2;
            Closeable closeable2;
            Closeable closeable3;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    g.M(obj);
                    long j11 = AttachmentDownloader.DOWNLOAD_TIMEOUT;
                    this.label = 1;
                    if (f0.o(j11, this) != aVar) {
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    closeable = (Closeable) this.L$0;
                    try {
                        g.M(obj);
                        closeable2 = closeable;
                        closeable3 = closeable2;
                        d.p(closeable3, null);
                        return Unit.f26487a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            d.p(closeable, th2);
                            throw th4;
                        }
                    }
                }
                g.M(obj);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                closeable3 = cursorQuery;
                if (zMoveToFirst) {
                    int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                    cursorQuery.close();
                    closeable3 = cursorQuery;
                    closeable3 = cursorQuery;
                    if (i12 != 8 && i12 != 2) {
                        attachmentDownloader.downloadManager.remove(j9);
                        m mVar = attachmentDownloader._attachmentChannel;
                        Action.UpdateDownloadStatusAction updateDownloadStatusAction = new Action.UpdateDownloadStatusAction(new DownloadAttachmentStatus.DownloadAttachmentFailed(str, str2, str3));
                        this.L$0 = cursorQuery;
                        this.label = 2;
                        if (mVar.f(updateDownloadStatusAction, this) != aVar) {
                            closeable2 = cursorQuery;
                            closeable3 = closeable2;
                        }
                        return aVar;
                    }
                }
                d.p(closeable3, null);
                return Unit.f26487a;
            } catch (Throwable th5) {
                closeable = cursorQuery;
                th2 = th5;
                throw th2;
            }
            cursorQuery = AttachmentDownloader.this.downloadManager.query(new DownloadManager.Query().setFilterById(this.$downloadId));
            attachmentDownloader = AttachmentDownloader.this;
            j9 = this.$downloadId;
            str = this.$fileName;
            str2 = this.$messageId;
            str3 = this.$conversationId;
        }
    }

    public AttachmentDownloader(@NotNull Context context, @NotNull b0 b0Var, @NotNull AttachmentsDownloadReceiver attachmentsDownloadReceiver) {
        context.getClass();
        b0Var.getClass();
        attachmentsDownloadReceiver.getClass();
        this.context = context;
        this.coroutineScope = b0Var;
        x80.i iVarA = cg.a(0, null, null, 7);
        this._attachmentChannel = iVarA;
        this.attachmentChannel = r.v(r.w(iVarA), attachmentsDownloadReceiver.getAttachmentChannel());
        this.downloadManager = (DownloadManager) context.getSystemService(DownloadManager.class);
    }

    private final String constructFilename(String fileName, String mediaUrl, String messageId, String conversationId) {
        String strConcat = ".".concat(StringsKt.X(fileName, "."));
        String strConcat2 = ".".concat(StringsKt.X(mediaUrl, "."));
        if (!Intrinsics.areEqual(strConcat, strConcat2)) {
            strConcat = strConcat2;
        }
        return k.m(StringsKt.b0(fileName, "."), s.k("_", messageId, "_", conversationId), strConcat);
    }

    private final long downloadFile(String url, String mimeType, String fileName, String authorizationHeader) {
        DownloadManager.Request destinationInExternalFilesDir = new DownloadManager.Request(Uri.parse(url)).setMimeType(mimeType).setAllowedNetworkTypes(3).setNotificationVisibility(2).setTitle(fileName).setDestinationInExternalFilesDir(this.context, Environment.DIRECTORY_DOCUMENTS, fileName);
        if (authorizationHeader != null) {
            destinationInExternalFilesDir.addRequestHeader("Authorization", authorizationHeader);
        }
        return this.downloadManager.enqueue(destinationInExternalFilesDir);
    }

    private final void enqueueAttachmentDownload(long downloadId, String fileName, String messageId, String conversationId) {
        f0.B(this.coroutineScope, null, null, new AnonymousClass1(downloadId, fileName, messageId, conversationId, null), 3);
    }

    @NotNull
    public final i getAttachmentChannel() {
        return this.attachmentChannel;
    }

    @NotNull
    public final ProcessAttachmentStatus processAttachment$zendesk_conversationkit_conversationkit_android(@NotNull String mediaUrl, @NotNull String fileName, @Nullable String authorizationHeader, @NotNull String messageId, @NotNull String conversationId) {
        mediaUrl.getClass();
        fileName.getClass();
        messageId.getClass();
        conversationId.getClass();
        String strConstructFilename = constructFilename(fileName, mediaUrl, messageId, conversationId);
        File fileDoesFileExistInSDKExternalStorage = FileKtxKt.doesFileExistInSDKExternalStorage(strConstructFilename, this.context);
        if (fileDoesFileExistInSDKExternalStorage != null) {
            return new ProcessAttachmentStatus.AttachmentAvailableInStorage(fileDoesFileExistInSDKExternalStorage);
        }
        Uri uri = Uri.parse(mediaUrl);
        uri.getClass();
        enqueueAttachmentDownload(downloadFile(mediaUrl, FileKtxKt.getMimeType(uri), strConstructFilename, authorizationHeader), fileName, messageId, conversationId);
        return ProcessAttachmentStatus.AttachmentToBeDownloaded.INSTANCE;
    }
}
