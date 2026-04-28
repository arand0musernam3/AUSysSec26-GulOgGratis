package zendesk.ui.android.common.buttonbanner;

import android.text.Spanned;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b$J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b(\u0010\u0017J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0012\u0010+\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b,\u0010\u001aJ\u0012\u0010-\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b.\u0010\u001aJ\u0012\u0010/\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b0\u0010\u001aJ\u0010\u00101\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b4Jx\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006;"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;", "", "viewType", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerViewType;", TextBundle.TEXT_ENTRY, "", "isVisible", "", "textColor", "", "iconColor", "backgroundColor", "buttonsBackgroundColor", "styledText", "Landroid/text/Spanned;", "shouldAnimate", "<init>", "(Lzendesk/ui/android/common/buttonbanner/ButtonBannerViewType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/text/Spanned;Z)V", "getViewType$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/buttonbanner/ButtonBannerViewType;", "getText$zendesk_ui_ui_android", "()Ljava/lang/String;", "isVisible$zendesk_ui_ui_android", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTextColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconColor$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "getButtonsBackgroundColor$zendesk_ui_ui_android", "getStyledText$zendesk_ui_ui_android", "()Landroid/text/Spanned;", "getShouldAnimate$zendesk_ui_ui_android", "()Z", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "copy", "(Lzendesk/ui/android/common/buttonbanner/ButtonBannerViewType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/text/Spanned;Z)Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ButtonBannerState {
    public static final int $stable = 8;

    @Nullable
    private final Integer backgroundColor;

    @Nullable
    private final Integer buttonsBackgroundColor;

    @Nullable
    private final Integer iconColor;

    @Nullable
    private final Boolean isVisible;
    private final boolean shouldAnimate;

    @Nullable
    private final Spanned styledText;

    @Nullable
    private final String text;

    @Nullable
    private final Integer textColor;

    @Nullable
    private final ButtonBannerViewType viewType;

    public /* synthetic */ ButtonBannerState(ButtonBannerViewType buttonBannerViewType, String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Spanned spanned, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : buttonBannerViewType, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : num4, (i11 & 128) != 0 ? null : spanned, (i11 & 256) != 0 ? false : z11);
    }

    public static /* synthetic */ ButtonBannerState copy$default(ButtonBannerState buttonBannerState, ButtonBannerViewType buttonBannerViewType, String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Spanned spanned, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonBannerViewType = buttonBannerState.viewType;
        }
        if ((i11 & 2) != 0) {
            str = buttonBannerState.text;
        }
        if ((i11 & 4) != 0) {
            bool = buttonBannerState.isVisible;
        }
        if ((i11 & 8) != 0) {
            num = buttonBannerState.textColor;
        }
        if ((i11 & 16) != 0) {
            num2 = buttonBannerState.iconColor;
        }
        if ((i11 & 32) != 0) {
            num3 = buttonBannerState.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            num4 = buttonBannerState.buttonsBackgroundColor;
        }
        if ((i11 & 128) != 0) {
            spanned = buttonBannerState.styledText;
        }
        if ((i11 & 256) != 0) {
            z11 = buttonBannerState.shouldAnimate;
        }
        Spanned spanned2 = spanned;
        boolean z12 = z11;
        Integer num5 = num3;
        Integer num6 = num4;
        Integer num7 = num2;
        Boolean bool2 = bool;
        return buttonBannerState.copy(buttonBannerViewType, str, bool2, num, num7, num5, num6, spanned2, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final ButtonBannerViewType getViewType() {
        return this.viewType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final Integer getIconColor() {
        return this.iconColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final Integer getButtonsBackgroundColor() {
        return this.buttonsBackgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final Spanned getStyledText() {
        return this.styledText;
    }

    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    @NotNull
    public final ButtonBannerState copy(@Nullable ButtonBannerViewType viewType, @Nullable String text, @Nullable Boolean isVisible, @Nullable Integer textColor, @Nullable Integer iconColor, @Nullable Integer backgroundColor, @Nullable Integer buttonsBackgroundColor, @Nullable Spanned styledText, boolean shouldAnimate) {
        return new ButtonBannerState(viewType, text, isVisible, textColor, iconColor, backgroundColor, buttonsBackgroundColor, styledText, shouldAnimate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBannerState)) {
            return false;
        }
        ButtonBannerState buttonBannerState = (ButtonBannerState) other;
        return this.viewType == buttonBannerState.viewType && Intrinsics.areEqual(this.text, buttonBannerState.text) && Intrinsics.areEqual(this.isVisible, buttonBannerState.isVisible) && Intrinsics.areEqual(this.textColor, buttonBannerState.textColor) && Intrinsics.areEqual(this.iconColor, buttonBannerState.iconColor) && Intrinsics.areEqual(this.backgroundColor, buttonBannerState.backgroundColor) && Intrinsics.areEqual(this.buttonsBackgroundColor, buttonBannerState.buttonsBackgroundColor) && Intrinsics.areEqual(this.styledText, buttonBannerState.styledText) && this.shouldAnimate == buttonBannerState.shouldAnimate;
    }

    @Nullable
    public final Integer getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getButtonsBackgroundColor$zendesk_ui_ui_android() {
        return this.buttonsBackgroundColor;
    }

    @Nullable
    public final Integer getIconColor$zendesk_ui_ui_android() {
        return this.iconColor;
    }

    public final boolean getShouldAnimate$zendesk_ui_ui_android() {
        return this.shouldAnimate;
    }

    @Nullable
    public final Spanned getStyledText$zendesk_ui_ui_android() {
        return this.styledText;
    }

    @Nullable
    public final String getText$zendesk_ui_ui_android() {
        return this.text;
    }

    @Nullable
    public final Integer getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    @Nullable
    public final ButtonBannerViewType getViewType$zendesk_ui_ui_android() {
        return this.viewType;
    }

    public int hashCode() {
        ButtonBannerViewType buttonBannerViewType = this.viewType;
        int iHashCode = (buttonBannerViewType == null ? 0 : buttonBannerViewType.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isVisible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.textColor;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.iconColor;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.backgroundColor;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.buttonsBackgroundColor;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Spanned spanned = this.styledText;
        return Boolean.hashCode(this.shouldAnimate) + ((iHashCode7 + (spanned != null ? spanned.hashCode() : 0)) * 31);
    }

    @Nullable
    public final Boolean isVisible$zendesk_ui_ui_android() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        ButtonBannerViewType buttonBannerViewType = this.viewType;
        String str = this.text;
        Boolean bool = this.isVisible;
        Integer num = this.textColor;
        Integer num2 = this.iconColor;
        Integer num3 = this.backgroundColor;
        Integer num4 = this.buttonsBackgroundColor;
        Spanned spanned = this.styledText;
        boolean z11 = this.shouldAnimate;
        StringBuilder sb2 = new StringBuilder("ButtonBannerState(viewType=");
        sb2.append(buttonBannerViewType);
        sb2.append(", text=");
        sb2.append(str);
        sb2.append(", isVisible=");
        sb2.append(bool);
        sb2.append(", textColor=");
        sb2.append(num);
        sb2.append(", iconColor=");
        s.z(sb2, num2, ", backgroundColor=", num3, ", buttonsBackgroundColor=");
        sb2.append(num4);
        sb2.append(", styledText=");
        sb2.append((Object) spanned);
        sb2.append(", shouldAnimate=");
        return s.o(sb2, z11, ")");
    }

    public ButtonBannerState(@Nullable ButtonBannerViewType buttonBannerViewType, @Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Spanned spanned, boolean z11) {
        this.viewType = buttonBannerViewType;
        this.text = str;
        this.isVisible = bool;
        this.textColor = num;
        this.iconColor = num2;
        this.backgroundColor = num3;
        this.buttonsBackgroundColor = num4;
        this.styledText = spanned;
        this.shouldAnimate = z11;
    }

    public ButtonBannerState() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }
}
