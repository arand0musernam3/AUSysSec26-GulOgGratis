package zendesk.ui.android.conversations;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversations/LoadingIndicatorState;", "", "showLoadingIndicator", "", "indicatorColor", "", "<init>", "(ZI)V", "getShowLoadingIndicator", "()Z", "getIndicatorColor", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadingIndicatorState {
    public static final int $stable = 0;
    private final int indicatorColor;
    private final boolean showLoadingIndicator;

    public /* synthetic */ LoadingIndicatorState(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11);
    }

    public static /* synthetic */ LoadingIndicatorState copy$default(LoadingIndicatorState loadingIndicatorState, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = loadingIndicatorState.showLoadingIndicator;
        }
        if ((i12 & 2) != 0) {
            i11 = loadingIndicatorState.indicatorColor;
        }
        return loadingIndicatorState.copy(z11, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowLoadingIndicator() {
        return this.showLoadingIndicator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndicatorColor() {
        return this.indicatorColor;
    }

    @NotNull
    public final LoadingIndicatorState copy(boolean showLoadingIndicator, int indicatorColor) {
        return new LoadingIndicatorState(showLoadingIndicator, indicatorColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingIndicatorState)) {
            return false;
        }
        LoadingIndicatorState loadingIndicatorState = (LoadingIndicatorState) other;
        return this.showLoadingIndicator == loadingIndicatorState.showLoadingIndicator && this.indicatorColor == loadingIndicatorState.indicatorColor;
    }

    public final int getIndicatorColor() {
        return this.indicatorColor;
    }

    public final boolean getShowLoadingIndicator() {
        return this.showLoadingIndicator;
    }

    public int hashCode() {
        return Integer.hashCode(this.indicatorColor) + (Boolean.hashCode(this.showLoadingIndicator) * 31);
    }

    @NotNull
    public String toString() {
        return "LoadingIndicatorState(showLoadingIndicator=" + this.showLoadingIndicator + ", indicatorColor=" + this.indicatorColor + ")";
    }

    public LoadingIndicatorState(boolean z11, int i11) {
        this.showLoadingIndicator = z11;
        this.indicatorColor = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadingIndicatorState() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }
}
