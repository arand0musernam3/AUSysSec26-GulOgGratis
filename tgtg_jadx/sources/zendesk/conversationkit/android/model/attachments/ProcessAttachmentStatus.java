package zendesk.conversationkit.android.model.attachments;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus;", "", "<init>", "()V", "AttachmentAvailableInStorage", "AttachmentToBeDownloaded", "Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus$AttachmentAvailableInStorage;", "Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus$AttachmentToBeDownloaded;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ProcessAttachmentStatus {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus$AttachmentAvailableInStorage;", "Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus;", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AttachmentAvailableInStorage extends ProcessAttachmentStatus {

        @NotNull
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttachmentAvailableInStorage(@NotNull File file) {
            super(null);
            file.getClass();
            this.file = file;
        }

        public static /* synthetic */ AttachmentAvailableInStorage copy$default(AttachmentAvailableInStorage attachmentAvailableInStorage, File file, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                file = attachmentAvailableInStorage.file;
            }
            return attachmentAvailableInStorage.copy(file);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @NotNull
        public final AttachmentAvailableInStorage copy(@NotNull File file) {
            file.getClass();
            return new AttachmentAvailableInStorage(file);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttachmentAvailableInStorage) && Intrinsics.areEqual(this.file, ((AttachmentAvailableInStorage) other).file);
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        @NotNull
        public String toString() {
            return "AttachmentAvailableInStorage(file=" + this.file + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus$AttachmentToBeDownloaded;", "Lzendesk/conversationkit/android/model/attachments/ProcessAttachmentStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AttachmentToBeDownloaded extends ProcessAttachmentStatus {

        @NotNull
        public static final AttachmentToBeDownloaded INSTANCE = new AttachmentToBeDownloaded();

        private AttachmentToBeDownloaded() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AttachmentToBeDownloaded);
        }

        public int hashCode() {
            return -227429599;
        }

        @NotNull
        public String toString() {
            return "AttachmentToBeDownloaded";
        }
    }

    public /* synthetic */ ProcessAttachmentStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProcessAttachmentStatus() {
    }
}
