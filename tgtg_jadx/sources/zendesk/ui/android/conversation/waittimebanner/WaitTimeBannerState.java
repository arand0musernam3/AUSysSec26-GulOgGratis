package zendesk.ui.android.conversation.waittimebanner;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0017J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerState;", "", "type", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "backgroundColor", "", "onBackgroundColor", "focusedBorderColor", "<init>", "(Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;III)V", "getType$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "getBackgroundColor$zendesk_ui_ui_android", "()I", "getOnBackgroundColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WaitTimeBannerState {
    public static final int $stable = 0;
    private final int backgroundColor;
    private final int focusedBorderColor;
    private final int onBackgroundColor;

    @NotNull
    private final WaitTimeBannerType type;

    public /* synthetic */ WaitTimeBannerState(WaitTimeBannerType waitTimeBannerType, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? WaitTimeBannerType.Cleared.INSTANCE : waitTimeBannerType, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    public static /* synthetic */ WaitTimeBannerState copy$default(WaitTimeBannerState waitTimeBannerState, WaitTimeBannerType waitTimeBannerType, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            waitTimeBannerType = waitTimeBannerState.type;
        }
        if ((i14 & 2) != 0) {
            i11 = waitTimeBannerState.backgroundColor;
        }
        if ((i14 & 4) != 0) {
            i12 = waitTimeBannerState.onBackgroundColor;
        }
        if ((i14 & 8) != 0) {
            i13 = waitTimeBannerState.focusedBorderColor;
        }
        return waitTimeBannerState.copy(waitTimeBannerType, i11, i12, i13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final WaitTimeBannerType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getOnBackgroundColor() {
        return this.onBackgroundColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getFocusedBorderColor() {
        return this.focusedBorderColor;
    }

    @NotNull
    public final WaitTimeBannerState copy(@NotNull WaitTimeBannerType type, int backgroundColor, int onBackgroundColor, int focusedBorderColor) {
        type.getClass();
        return new WaitTimeBannerState(type, backgroundColor, onBackgroundColor, focusedBorderColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitTimeBannerState)) {
            return false;
        }
        WaitTimeBannerState waitTimeBannerState = (WaitTimeBannerState) other;
        return Intrinsics.areEqual(this.type, waitTimeBannerState.type) && this.backgroundColor == waitTimeBannerState.backgroundColor && this.onBackgroundColor == waitTimeBannerState.onBackgroundColor && this.focusedBorderColor == waitTimeBannerState.focusedBorderColor;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getFocusedBorderColor$zendesk_ui_ui_android() {
        return this.focusedBorderColor;
    }

    public final int getOnBackgroundColor$zendesk_ui_ui_android() {
        return this.onBackgroundColor;
    }

    @NotNull
    public final WaitTimeBannerType getType$zendesk_ui_ui_android() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.focusedBorderColor) + k.b(this.onBackgroundColor, k.b(this.backgroundColor, this.type.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "WaitTimeBannerState(type=" + this.type + ", backgroundColor=" + this.backgroundColor + ", onBackgroundColor=" + this.onBackgroundColor + ", focusedBorderColor=" + this.focusedBorderColor + ")";
    }

    public WaitTimeBannerState(@NotNull WaitTimeBannerType waitTimeBannerType, int i11, int i12, int i13) {
        waitTimeBannerType.getClass();
        this.type = waitTimeBannerType;
        this.backgroundColor = i11;
        this.onBackgroundColor = i12;
        this.focusedBorderColor = i13;
    }

    public WaitTimeBannerState() {
        this(null, 0, 0, 0, 15, null);
    }
}
