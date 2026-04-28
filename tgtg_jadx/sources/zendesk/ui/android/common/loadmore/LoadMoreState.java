package zendesk.ui.android.common.loadmore;

import a80.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\u0019J3\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lzendesk/ui/android/common/loadmore/LoadMoreState;", "", "failedRetryText", "", "progressBarColor", "", "failedRetryTextColor", "status", "Lzendesk/ui/android/common/loadmore/LoadMoreState$LoadMoreStatus;", "<init>", "(Ljava/lang/String;IILzendesk/ui/android/common/loadmore/LoadMoreState$LoadMoreStatus;)V", "getFailedRetryText$zendesk_ui_ui_android", "()Ljava/lang/String;", "getProgressBarColor$zendesk_ui_ui_android", "()I", "getFailedRetryTextColor$zendesk_ui_ui_android", "getStatus$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/loadmore/LoadMoreState$LoadMoreStatus;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "LoadMoreStatus", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadMoreState {
    public static final int $stable = 0;

    @Nullable
    private final String failedRetryText;
    private final int failedRetryTextColor;
    private final int progressBarColor;

    @NotNull
    private final LoadMoreStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/ui/android/common/loadmore/LoadMoreState$LoadMoreStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "FAILED", "NONE", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadMoreStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LoadMoreStatus[] $VALUES;
        public static final LoadMoreStatus LOADING = new LoadMoreStatus("LOADING", 0);
        public static final LoadMoreStatus FAILED = new LoadMoreStatus("FAILED", 1);
        public static final LoadMoreStatus NONE = new LoadMoreStatus("NONE", 2);

        private static final /* synthetic */ LoadMoreStatus[] $values() {
            return new LoadMoreStatus[]{LOADING, FAILED, NONE};
        }

        static {
            LoadMoreStatus[] loadMoreStatusArr$values = $values();
            $VALUES = loadMoreStatusArr$values;
            $ENTRIES = n.w(loadMoreStatusArr$values);
        }

        private LoadMoreStatus(String str, int i11) {
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static LoadMoreStatus valueOf(String str) {
            return (LoadMoreStatus) Enum.valueOf(LoadMoreStatus.class, str);
        }

        public static LoadMoreStatus[] values() {
            return (LoadMoreStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LoadMoreState(String str, int i11, int i12, LoadMoreStatus loadMoreStatus, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? LoadMoreStatus.LOADING : loadMoreStatus);
    }

    public static /* synthetic */ LoadMoreState copy$default(LoadMoreState loadMoreState, String str, int i11, int i12, LoadMoreStatus loadMoreStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = loadMoreState.failedRetryText;
        }
        if ((i13 & 2) != 0) {
            i11 = loadMoreState.progressBarColor;
        }
        if ((i13 & 4) != 0) {
            i12 = loadMoreState.failedRetryTextColor;
        }
        if ((i13 & 8) != 0) {
            loadMoreStatus = loadMoreState.status;
        }
        return loadMoreState.copy(str, i11, i12, loadMoreStatus);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getFailedRetryText() {
        return this.failedRetryText;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getProgressBarColor() {
        return this.progressBarColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getFailedRetryTextColor() {
        return this.failedRetryTextColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final LoadMoreStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final LoadMoreState copy(@Nullable String failedRetryText, int progressBarColor, int failedRetryTextColor, @NotNull LoadMoreStatus status) {
        status.getClass();
        return new LoadMoreState(failedRetryText, progressBarColor, failedRetryTextColor, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadMoreState)) {
            return false;
        }
        LoadMoreState loadMoreState = (LoadMoreState) other;
        return Intrinsics.areEqual(this.failedRetryText, loadMoreState.failedRetryText) && this.progressBarColor == loadMoreState.progressBarColor && this.failedRetryTextColor == loadMoreState.failedRetryTextColor && this.status == loadMoreState.status;
    }

    @Nullable
    public final String getFailedRetryText$zendesk_ui_ui_android() {
        return this.failedRetryText;
    }

    public final int getFailedRetryTextColor$zendesk_ui_ui_android() {
        return this.failedRetryTextColor;
    }

    public final int getProgressBarColor$zendesk_ui_ui_android() {
        return this.progressBarColor;
    }

    @NotNull
    public final LoadMoreStatus getStatus$zendesk_ui_ui_android() {
        return this.status;
    }

    public int hashCode() {
        String str = this.failedRetryText;
        return this.status.hashCode() + k.b(this.failedRetryTextColor, k.b(this.progressBarColor, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "LoadMoreState(failedRetryText=" + this.failedRetryText + ", progressBarColor=" + this.progressBarColor + ", failedRetryTextColor=" + this.failedRetryTextColor + ", status=" + this.status + ")";
    }

    public LoadMoreState(@Nullable String str, int i11, int i12, @NotNull LoadMoreStatus loadMoreStatus) {
        loadMoreStatus.getClass();
        this.failedRetryText = str;
        this.progressBarColor = i11;
        this.failedRetryTextColor = i12;
        this.status = loadMoreStatus;
    }

    public LoadMoreState() {
        this(null, 0, 0, null, 15, null);
    }
}
