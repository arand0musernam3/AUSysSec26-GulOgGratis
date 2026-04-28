package zendesk.ui.android.conversation.file;

import b3.i;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b#\u0010\u0016JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lzendesk/ui/android/conversation/file/FileState;", "", "fileName", "", "fileSize", "", "textColor", "", "iconColor", "backgroundColor", "backgroundDrawable", "<init>", "(Ljava/lang/String;JIIILjava/lang/Integer;)V", "getFileName$zendesk_ui_ui_android", "()Ljava/lang/String;", "getFileSize$zendesk_ui_ui_android", "()J", "getTextColor$zendesk_ui_ui_android", "()I", "getIconColor$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "getBackgroundDrawable$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;JIIILjava/lang/Integer;)Lzendesk/ui/android/conversation/file/FileState;", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FileState {
    public static final int $stable = 0;
    private final int backgroundColor;

    @Nullable
    private final Integer backgroundDrawable;

    @NotNull
    private final String fileName;
    private final long fileSize;
    private final int iconColor;
    private final int textColor;

    public /* synthetic */ FileState(String str, long j9, int i11, int i12, int i13, Integer num, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0L : j9, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? null : num);
    }

    public static /* synthetic */ FileState copy$default(FileState fileState, String str, long j9, int i11, int i12, int i13, Integer num, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = fileState.fileName;
        }
        if ((i14 & 2) != 0) {
            j9 = fileState.fileSize;
        }
        if ((i14 & 4) != 0) {
            i11 = fileState.textColor;
        }
        if ((i14 & 8) != 0) {
            i12 = fileState.iconColor;
        }
        if ((i14 & 16) != 0) {
            i13 = fileState.backgroundColor;
        }
        if ((i14 & 32) != 0) {
            num = fileState.backgroundDrawable;
        }
        return fileState.copy(str, j9, i11, i12, i13, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @NotNull
    public final FileState copy(@NotNull String fileName, long fileSize, int textColor, int iconColor, int backgroundColor, @Nullable Integer backgroundDrawable) {
        fileName.getClass();
        return new FileState(fileName, fileSize, textColor, iconColor, backgroundColor, backgroundDrawable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileState)) {
            return false;
        }
        FileState fileState = (FileState) other;
        return Intrinsics.areEqual(this.fileName, fileState.fileName) && this.fileSize == fileState.fileSize && this.textColor == fileState.textColor && this.iconColor == fileState.iconColor && this.backgroundColor == fileState.backgroundColor && Intrinsics.areEqual(this.backgroundDrawable, fileState.backgroundDrawable);
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getBackgroundDrawable$zendesk_ui_ui_android() {
        return this.backgroundDrawable;
    }

    @NotNull
    public final String getFileName$zendesk_ui_ui_android() {
        return this.fileName;
    }

    public final long getFileSize$zendesk_ui_ui_android() {
        return this.fileSize;
    }

    public final int getIconColor$zendesk_ui_ui_android() {
        return this.iconColor;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        int iB = k.b(this.backgroundColor, k.b(this.iconColor, k.b(this.textColor, f.b(this.fileName.hashCode() * 31, 31, this.fileSize), 31), 31), 31);
        Integer num = this.backgroundDrawable;
        return iB + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.fileName;
        long j9 = this.fileSize;
        int i11 = this.textColor;
        int i12 = this.iconColor;
        int i13 = this.backgroundColor;
        Integer num = this.backgroundDrawable;
        StringBuilder sbN = i.n(j9, "FileState(fileName=", str, ", fileSize=");
        sbN.append(", textColor=");
        sbN.append(i11);
        sbN.append(", iconColor=");
        sbN.append(i12);
        sbN.append(", backgroundColor=");
        sbN.append(i13);
        sbN.append(", backgroundDrawable=");
        sbN.append(num);
        sbN.append(")");
        return sbN.toString();
    }

    public FileState(@NotNull String str, long j9, int i11, int i12, int i13, @Nullable Integer num) {
        str.getClass();
        this.fileName = str;
        this.fileSize = j9;
        this.textColor = i11;
        this.iconColor = i12;
        this.backgroundColor = i13;
        this.backgroundDrawable = num;
    }

    public FileState() {
        this(null, 0L, 0, 0, 0, null, 63, null);
    }
}
