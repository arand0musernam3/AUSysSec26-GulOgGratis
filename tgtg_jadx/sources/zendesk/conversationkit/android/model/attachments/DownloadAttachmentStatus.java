package zendesk.conversationkit.android.model.attachments;

import e0.f;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus;", "", "<init>", "()V", "DownloadAttachmentSuccess", "DownloadAttachmentFailed", "Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus$DownloadAttachmentFailed;", "Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus$DownloadAttachmentSuccess;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DownloadAttachmentStatus {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus$DownloadAttachmentFailed;", "Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus;", "fileName", "", "messageId", "conversationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getMessageId", "getConversationId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DownloadAttachmentFailed extends DownloadAttachmentStatus {

        @NotNull
        private final String conversationId;

        @NotNull
        private final String fileName;

        @NotNull
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadAttachmentFailed(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            a0.C(str, str2, str3);
            this.fileName = str;
            this.messageId = str2;
            this.conversationId = str3;
        }

        public static /* synthetic */ DownloadAttachmentFailed copy$default(DownloadAttachmentFailed downloadAttachmentFailed, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = downloadAttachmentFailed.fileName;
            }
            if ((i11 & 2) != 0) {
                str2 = downloadAttachmentFailed.messageId;
            }
            if ((i11 & 4) != 0) {
                str3 = downloadAttachmentFailed.conversationId;
            }
            return downloadAttachmentFailed.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final DownloadAttachmentFailed copy(@NotNull String fileName, @NotNull String messageId, @NotNull String conversationId) {
            fileName.getClass();
            messageId.getClass();
            conversationId.getClass();
            return new DownloadAttachmentFailed(fileName, messageId, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadAttachmentFailed)) {
                return false;
            }
            DownloadAttachmentFailed downloadAttachmentFailed = (DownloadAttachmentFailed) other;
            return Intrinsics.areEqual(this.fileName, downloadAttachmentFailed.fileName) && Intrinsics.areEqual(this.messageId, downloadAttachmentFailed.messageId) && Intrinsics.areEqual(this.conversationId, downloadAttachmentFailed.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + l1.b(this.fileName.hashCode() * 31, 31, this.messageId);
        }

        @NotNull
        public String toString() {
            String str = this.fileName;
            String str2 = this.messageId;
            return k.p(f.t("DownloadAttachmentFailed(fileName=", str, ", messageId=", str2, ", conversationId="), this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus$DownloadAttachmentSuccess;", "Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus;", "file", "Ljava/io/File;", "fileName", "", "messageId", "conversationId", "<init>", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getFileName", "()Ljava/lang/String;", "getMessageId", "getConversationId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DownloadAttachmentSuccess extends DownloadAttachmentStatus {

        @NotNull
        private final String conversationId;

        @NotNull
        private final File file;

        @NotNull
        private final String fileName;

        @NotNull
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadAttachmentSuccess(@NotNull File file, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            file.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.file = file;
            this.fileName = str;
            this.messageId = str2;
            this.conversationId = str3;
        }

        public static /* synthetic */ DownloadAttachmentSuccess copy$default(DownloadAttachmentSuccess downloadAttachmentSuccess, File file, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                file = downloadAttachmentSuccess.file;
            }
            if ((i11 & 2) != 0) {
                str = downloadAttachmentSuccess.fileName;
            }
            if ((i11 & 4) != 0) {
                str2 = downloadAttachmentSuccess.messageId;
            }
            if ((i11 & 8) != 0) {
                str3 = downloadAttachmentSuccess.conversationId;
            }
            return downloadAttachmentSuccess.copy(file, str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final DownloadAttachmentSuccess copy(@NotNull File file, @NotNull String fileName, @NotNull String messageId, @NotNull String conversationId) {
            file.getClass();
            fileName.getClass();
            messageId.getClass();
            conversationId.getClass();
            return new DownloadAttachmentSuccess(file, fileName, messageId, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadAttachmentSuccess)) {
                return false;
            }
            DownloadAttachmentSuccess downloadAttachmentSuccess = (DownloadAttachmentSuccess) other;
            return Intrinsics.areEqual(this.file, downloadAttachmentSuccess.file) && Intrinsics.areEqual(this.fileName, downloadAttachmentSuccess.fileName) && Intrinsics.areEqual(this.messageId, downloadAttachmentSuccess.messageId) && Intrinsics.areEqual(this.conversationId, downloadAttachmentSuccess.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + l1.b(l1.b(this.file.hashCode() * 31, 31, this.fileName), 31, this.messageId);
        }

        @NotNull
        public String toString() {
            File file = this.file;
            String str = this.fileName;
            String str2 = this.messageId;
            String str3 = this.conversationId;
            StringBuilder sb2 = new StringBuilder("DownloadAttachmentSuccess(file=");
            sb2.append(file);
            sb2.append(", fileName=");
            sb2.append(str);
            sb2.append(", messageId=");
            return f.o(sb2, str2, ", conversationId=", str3, ")");
        }
    }

    public /* synthetic */ DownloadAttachmentStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DownloadAttachmentStatus() {
    }
}
