package zendesk.ui.android.conversation.carousel;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00062"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "", "navigationButtonColor", "", "navigationIconColor", "cardColor", "textColor", "margin", "inboundMessageColor", "actionTextColor", "actionDisabledTextColor", "focusedStateBorderColor", "showAvatar", "", "actionDisabledBackgroundColor", "actionBackgroundColor", "<init>", "(IIIIIIIIIZII)V", "getNavigationButtonColor", "()I", "getNavigationIconColor", "getCardColor", "getTextColor", "getMargin", "getInboundMessageColor", "getActionTextColor", "getActionDisabledTextColor", "getFocusedStateBorderColor", "getShowAvatar", "()Z", "getActionDisabledBackgroundColor", "getActionBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CarouselRendering {
    public static final int $stable = 0;
    private final int actionBackgroundColor;
    private final int actionDisabledBackgroundColor;
    private final int actionDisabledTextColor;
    private final int actionTextColor;
    private final int cardColor;
    private final int focusedStateBorderColor;
    private final int inboundMessageColor;
    private final int margin;
    private final int navigationButtonColor;
    private final int navigationIconColor;
    private final boolean showAvatar;
    private final int textColor;

    public /* synthetic */ CarouselRendering(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, int i21, int i22, int i23, DefaultConstructorMarker defaultConstructorMarker) {
        this((i23 & 1) != 0 ? 0 : i11, (i23 & 2) != 0 ? 0 : i12, (i23 & 4) != 0 ? 0 : i13, (i23 & 8) != 0 ? 0 : i14, (i23 & 16) != 0 ? 0 : i15, (i23 & 32) != 0 ? 0 : i16, (i23 & 64) != 0 ? 0 : i17, (i23 & 128) != 0 ? 0 : i18, (i23 & 256) != 0 ? 0 : i19, (i23 & 512) != 0 ? true : z11, (i23 & 1024) != 0 ? 0 : i21, (i23 & NewHope.SENDB_BYTES) != 0 ? 0 : i22);
    }

    public static /* synthetic */ CarouselRendering copy$default(CarouselRendering carouselRendering, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, int i21, int i22, int i23, Object obj) {
        if ((i23 & 1) != 0) {
            i11 = carouselRendering.navigationButtonColor;
        }
        if ((i23 & 2) != 0) {
            i12 = carouselRendering.navigationIconColor;
        }
        if ((i23 & 4) != 0) {
            i13 = carouselRendering.cardColor;
        }
        if ((i23 & 8) != 0) {
            i14 = carouselRendering.textColor;
        }
        if ((i23 & 16) != 0) {
            i15 = carouselRendering.margin;
        }
        if ((i23 & 32) != 0) {
            i16 = carouselRendering.inboundMessageColor;
        }
        if ((i23 & 64) != 0) {
            i17 = carouselRendering.actionTextColor;
        }
        if ((i23 & 128) != 0) {
            i18 = carouselRendering.actionDisabledTextColor;
        }
        if ((i23 & 256) != 0) {
            i19 = carouselRendering.focusedStateBorderColor;
        }
        if ((i23 & 512) != 0) {
            z11 = carouselRendering.showAvatar;
        }
        if ((i23 & 1024) != 0) {
            i21 = carouselRendering.actionDisabledBackgroundColor;
        }
        if ((i23 & NewHope.SENDB_BYTES) != 0) {
            i22 = carouselRendering.actionBackgroundColor;
        }
        int i24 = i21;
        int i25 = i22;
        int i26 = i19;
        boolean z12 = z11;
        int i27 = i17;
        int i28 = i18;
        int i29 = i15;
        int i31 = i16;
        return carouselRendering.copy(i11, i12, i13, i14, i29, i31, i27, i28, i26, z12, i24, i25);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNavigationButtonColor() {
        return this.navigationButtonColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getActionDisabledBackgroundColor() {
        return this.actionDisabledBackgroundColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getActionBackgroundColor() {
        return this.actionBackgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNavigationIconColor() {
        return this.navigationIconColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCardColor() {
        return this.cardColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getInboundMessageColor() {
        return this.inboundMessageColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getActionTextColor() {
        return this.actionTextColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getActionDisabledTextColor() {
        return this.actionDisabledTextColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    @NotNull
    public final CarouselRendering copy(int navigationButtonColor, int navigationIconColor, int cardColor, int textColor, int margin, int inboundMessageColor, int actionTextColor, int actionDisabledTextColor, int focusedStateBorderColor, boolean showAvatar, int actionDisabledBackgroundColor, int actionBackgroundColor) {
        return new CarouselRendering(navigationButtonColor, navigationIconColor, cardColor, textColor, margin, inboundMessageColor, actionTextColor, actionDisabledTextColor, focusedStateBorderColor, showAvatar, actionDisabledBackgroundColor, actionBackgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselRendering)) {
            return false;
        }
        CarouselRendering carouselRendering = (CarouselRendering) other;
        return this.navigationButtonColor == carouselRendering.navigationButtonColor && this.navigationIconColor == carouselRendering.navigationIconColor && this.cardColor == carouselRendering.cardColor && this.textColor == carouselRendering.textColor && this.margin == carouselRendering.margin && this.inboundMessageColor == carouselRendering.inboundMessageColor && this.actionTextColor == carouselRendering.actionTextColor && this.actionDisabledTextColor == carouselRendering.actionDisabledTextColor && this.focusedStateBorderColor == carouselRendering.focusedStateBorderColor && this.showAvatar == carouselRendering.showAvatar && this.actionDisabledBackgroundColor == carouselRendering.actionDisabledBackgroundColor && this.actionBackgroundColor == carouselRendering.actionBackgroundColor;
    }

    public final int getActionBackgroundColor() {
        return this.actionBackgroundColor;
    }

    public final int getActionDisabledBackgroundColor() {
        return this.actionDisabledBackgroundColor;
    }

    public final int getActionDisabledTextColor() {
        return this.actionDisabledTextColor;
    }

    public final int getActionTextColor() {
        return this.actionTextColor;
    }

    public final int getCardColor() {
        return this.cardColor;
    }

    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    public final int getInboundMessageColor() {
        return this.inboundMessageColor;
    }

    public final int getMargin() {
        return this.margin;
    }

    public final int getNavigationButtonColor() {
        return this.navigationButtonColor;
    }

    public final int getNavigationIconColor() {
        return this.navigationIconColor;
    }

    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.actionBackgroundColor) + k.b(this.actionDisabledBackgroundColor, k.e(k.b(this.focusedStateBorderColor, k.b(this.actionDisabledTextColor, k.b(this.actionTextColor, k.b(this.inboundMessageColor, k.b(this.margin, k.b(this.textColor, k.b(this.cardColor, k.b(this.navigationIconColor, Integer.hashCode(this.navigationButtonColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.showAvatar), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.navigationButtonColor;
        int i12 = this.navigationIconColor;
        int i13 = this.cardColor;
        int i14 = this.textColor;
        int i15 = this.margin;
        int i16 = this.inboundMessageColor;
        int i17 = this.actionTextColor;
        int i18 = this.actionDisabledTextColor;
        int i19 = this.focusedStateBorderColor;
        boolean z11 = this.showAvatar;
        int i21 = this.actionDisabledBackgroundColor;
        int i22 = this.actionBackgroundColor;
        StringBuilder sbR = k.r(i11, i12, "CarouselRendering(navigationButtonColor=", ", navigationIconColor=", ", cardColor=");
        f.C(sbR, i13, ", textColor=", i14, ", margin=");
        f.C(sbR, i15, ", inboundMessageColor=", i16, ", actionTextColor=");
        f.C(sbR, i17, ", actionDisabledTextColor=", i18, ", focusedStateBorderColor=");
        sbR.append(i19);
        sbR.append(", showAvatar=");
        sbR.append(z11);
        sbR.append(", actionDisabledBackgroundColor=");
        sbR.append(i21);
        sbR.append(", actionBackgroundColor=");
        sbR.append(i22);
        sbR.append(")");
        return sbR.toString();
    }

    public CarouselRendering(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, int i21, int i22) {
        this.navigationButtonColor = i11;
        this.navigationIconColor = i12;
        this.cardColor = i13;
        this.textColor = i14;
        this.margin = i15;
        this.inboundMessageColor = i16;
        this.actionTextColor = i17;
        this.actionDisabledTextColor = i18;
        this.focusedStateBorderColor = i19;
        this.showAvatar = z11;
        this.actionDisabledBackgroundColor = i21;
        this.actionBackgroundColor = i22;
    }

    public CarouselRendering() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 4095, null);
    }
}
