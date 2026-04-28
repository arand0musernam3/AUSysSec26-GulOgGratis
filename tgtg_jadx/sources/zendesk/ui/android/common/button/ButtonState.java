package zendesk.ui.android.common.button;

import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000f¨\u0006!"}, d2 = {"Lzendesk/ui/android/common/button/ButtonState;", "", TextBundle.TEXT_ENTRY, "", "isLoading", "", "backgroundColor", "", "textColor", "loadingColor", "isClickable", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getText", "()Ljava/lang/String;", "()Z", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor", "getLoadingColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lzendesk/ui/android/common/button/ButtonState;", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ButtonState {
    public static final int $stable = 0;

    @Nullable
    private final Integer backgroundColor;
    private final boolean isClickable;
    private final boolean isLoading;

    @Nullable
    private final Integer loadingColor;

    @NotNull
    private final String text;

    @Nullable
    private final Integer textColor;

    public /* synthetic */ ButtonState(String str, boolean z11, Integer num, Integer num2, Integer num3, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? true : z12);
    }

    public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, String str, boolean z11, Integer num, Integer num2, Integer num3, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonState.text;
        }
        if ((i11 & 2) != 0) {
            z11 = buttonState.isLoading;
        }
        if ((i11 & 4) != 0) {
            num = buttonState.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            num2 = buttonState.textColor;
        }
        if ((i11 & 16) != 0) {
            num3 = buttonState.loadingColor;
        }
        if ((i11 & 32) != 0) {
            z12 = buttonState.isClickable;
        }
        Integer num4 = num3;
        boolean z13 = z12;
        return buttonState.copy(str, z11, num, num2, num4, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getLoadingColor() {
        return this.loadingColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsClickable() {
        return this.isClickable;
    }

    @NotNull
    public final ButtonState copy(@NotNull String text, boolean isLoading, @Nullable Integer backgroundColor, @Nullable Integer textColor, @Nullable Integer loadingColor, boolean isClickable) {
        text.getClass();
        return new ButtonState(text, isLoading, backgroundColor, textColor, loadingColor, isClickable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonState)) {
            return false;
        }
        ButtonState buttonState = (ButtonState) other;
        return Intrinsics.areEqual(this.text, buttonState.text) && this.isLoading == buttonState.isLoading && Intrinsics.areEqual(this.backgroundColor, buttonState.backgroundColor) && Intrinsics.areEqual(this.textColor, buttonState.textColor) && Intrinsics.areEqual(this.loadingColor, buttonState.loadingColor) && this.isClickable == buttonState.isClickable;
    }

    @Nullable
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getLoadingColor() {
        return this.loadingColor;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iE = k.e(this.text.hashCode() * 31, 31, this.isLoading);
        Integer num = this.backgroundColor;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.loadingColor;
        return Boolean.hashCode(this.isClickable) + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final boolean isClickable() {
        return this.isClickable;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        boolean z11 = this.isLoading;
        Integer num = this.backgroundColor;
        Integer num2 = this.textColor;
        Integer num3 = this.loadingColor;
        boolean z12 = this.isClickable;
        StringBuilder sb2 = new StringBuilder("ButtonState(text=");
        sb2.append(str);
        sb2.append(", isLoading=");
        sb2.append(z11);
        sb2.append(", backgroundColor=");
        s.z(sb2, num, ", textColor=", num2, ", loadingColor=");
        sb2.append(num3);
        sb2.append(", isClickable=");
        sb2.append(z12);
        sb2.append(")");
        return sb2.toString();
    }

    public ButtonState(@NotNull String str, boolean z11, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, boolean z12) {
        str.getClass();
        this.text = str;
        this.isLoading = z11;
        this.backgroundColor = num;
        this.textColor = num2;
        this.loadingColor = num3;
        this.isClickable = z12;
    }

    public ButtonState() {
        this(null, false, null, null, null, false, 63, null);
    }
}
