package zendesk.ui.android.conversation.typingindicatorcell;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\u000e\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/typingindicatorcell/TypingIndicatorCellState;", "", "backgroundColor", "", "dotColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDotColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/typingindicatorcell/TypingIndicatorCellState;", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TypingIndicatorCellState {
    public static final int $stable = 0;

    @Nullable
    private final Integer backgroundColor;

    @Nullable
    private final Integer dotColor;

    public /* synthetic */ TypingIndicatorCellState(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
    }

    public static /* synthetic */ TypingIndicatorCellState copy$default(TypingIndicatorCellState typingIndicatorCellState, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = typingIndicatorCellState.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            num2 = typingIndicatorCellState.dotColor;
        }
        return typingIndicatorCellState.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final Integer getDotColor() {
        return this.dotColor;
    }

    @NotNull
    public final TypingIndicatorCellState copy(@Nullable Integer backgroundColor, @Nullable Integer dotColor) {
        return new TypingIndicatorCellState(backgroundColor, dotColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingIndicatorCellState)) {
            return false;
        }
        TypingIndicatorCellState typingIndicatorCellState = (TypingIndicatorCellState) other;
        return Intrinsics.areEqual(this.backgroundColor, typingIndicatorCellState.backgroundColor) && Intrinsics.areEqual(this.dotColor, typingIndicatorCellState.dotColor);
    }

    @Nullable
    public final Integer getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getDotColor$zendesk_ui_ui_android() {
        return this.dotColor;
    }

    public int hashCode() {
        Integer num = this.backgroundColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.dotColor;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TypingIndicatorCellState(backgroundColor=" + this.backgroundColor + ", dotColor=" + this.dotColor + ")";
    }

    public TypingIndicatorCellState(@Nullable Integer num, @Nullable Integer num2) {
        this.backgroundColor = num;
        this.dotColor = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TypingIndicatorCellState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
