package zendesk.ui.android.common.retryerror;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0017J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/common/retryerror/RetryErrorState;", "", "retryMessageText", "", "retryMessageTextColor", "", "retryButtonText", "retryButtonTextColor", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getRetryMessageText$zendesk_ui_ui_android", "()Ljava/lang/String;", "getRetryMessageTextColor$zendesk_ui_ui_android", "()I", "getRetryButtonText$zendesk_ui_ui_android", "getRetryButtonTextColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RetryErrorState {
    public static final int $stable = 0;

    @NotNull
    private final String retryButtonText;
    private final int retryButtonTextColor;

    @NotNull
    private final String retryMessageText;
    private final int retryMessageTextColor;

    public /* synthetic */ RetryErrorState(String str, int i11, String str2, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? 0 : i12);
    }

    public static /* synthetic */ RetryErrorState copy$default(RetryErrorState retryErrorState, String str, int i11, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = retryErrorState.retryMessageText;
        }
        if ((i13 & 2) != 0) {
            i11 = retryErrorState.retryMessageTextColor;
        }
        if ((i13 & 4) != 0) {
            str2 = retryErrorState.retryButtonText;
        }
        if ((i13 & 8) != 0) {
            i12 = retryErrorState.retryButtonTextColor;
        }
        return retryErrorState.copy(str, i11, str2, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getRetryMessageText() {
        return this.retryMessageText;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getRetryMessageTextColor() {
        return this.retryMessageTextColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final String getRetryButtonText() {
        return this.retryButtonText;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getRetryButtonTextColor() {
        return this.retryButtonTextColor;
    }

    @NotNull
    public final RetryErrorState copy(@NotNull String retryMessageText, int retryMessageTextColor, @NotNull String retryButtonText, int retryButtonTextColor) {
        retryMessageText.getClass();
        retryButtonText.getClass();
        return new RetryErrorState(retryMessageText, retryMessageTextColor, retryButtonText, retryButtonTextColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryErrorState)) {
            return false;
        }
        RetryErrorState retryErrorState = (RetryErrorState) other;
        return Intrinsics.areEqual(this.retryMessageText, retryErrorState.retryMessageText) && this.retryMessageTextColor == retryErrorState.retryMessageTextColor && Intrinsics.areEqual(this.retryButtonText, retryErrorState.retryButtonText) && this.retryButtonTextColor == retryErrorState.retryButtonTextColor;
    }

    @NotNull
    public final String getRetryButtonText$zendesk_ui_ui_android() {
        return this.retryButtonText;
    }

    public final int getRetryButtonTextColor$zendesk_ui_ui_android() {
        return this.retryButtonTextColor;
    }

    @NotNull
    public final String getRetryMessageText$zendesk_ui_ui_android() {
        return this.retryMessageText;
    }

    public final int getRetryMessageTextColor$zendesk_ui_ui_android() {
        return this.retryMessageTextColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.retryButtonTextColor) + l1.b(k.b(this.retryMessageTextColor, this.retryMessageText.hashCode() * 31, 31), 31, this.retryButtonText);
    }

    @NotNull
    public String toString() {
        return "RetryErrorState(retryMessageText=" + this.retryMessageText + ", retryMessageTextColor=" + this.retryMessageTextColor + ", retryButtonText=" + this.retryButtonText + ", retryButtonTextColor=" + this.retryButtonTextColor + ")";
    }

    public RetryErrorState(@NotNull String str, int i11, @NotNull String str2, int i12) {
        str.getClass();
        str2.getClass();
        this.retryMessageText = str;
        this.retryMessageTextColor = i11;
        this.retryButtonText = str2;
        this.retryButtonTextColor = i12;
    }

    public RetryErrorState() {
        this(null, 0, null, 0, 15, null);
    }
}
