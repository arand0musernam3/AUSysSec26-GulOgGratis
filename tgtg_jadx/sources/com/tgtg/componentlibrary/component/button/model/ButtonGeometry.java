package com.tgtg.componentlibrary.component.button.model;

import com.braze.Constants;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m5.u0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0015J\u0010\u0010)\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0015J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u0015J\u0092\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bD\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bF\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bH\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010=\u001a\u0004\bL\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010*R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010=\u001a\u0004\bV\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010=\u001a\u0004\bX\u0010\u0015¨\u0006Y"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/model/ButtonGeometry;", "", "Lz5/f;", "minHeight", "maxHeight", "minWidth", "maxWidth", "horizontalPadding", "verticalPadding", "gap", "cornerRadius", "Lm5/u0;", "textStyle", "iconSize", "Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "spinnerSize", "focusRingBorderSize", "focusRingPadding", "<init>", "(FFFFFFFFLm5/u0;FLcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8-D9Ej5fM", "component8", "component9", "()Lm5/u0;", "component10-D9Ej5fM", "component10", "component11", "()Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "component12-D9Ej5fM", "component12", "component13-D9Ej5fM", "component13", "copy-6-Oi4jA", "(FFFFFFFFLm5/u0;FLcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;FF)Lcom/tgtg/componentlibrary/component/button/model/ButtonGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getMinHeight-D9Ej5fM", "b", "getMaxHeight-D9Ej5fM", "c", "getMinWidth-D9Ej5fM", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getMaxWidth-D9Ej5fM", "e", "getHorizontalPadding-D9Ej5fM", "f", "getVerticalPadding-D9Ej5fM", "g", "getGap-D9Ej5fM", "h", "getCornerRadius-D9Ej5fM", "i", "Lm5/u0;", "getTextStyle", "j", "getIconSize-D9Ej5fM", "k", "Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "getSpinnerSize", "l", "getFocusRingBorderSize-D9Ej5fM", "m", "getFocusRingPadding-D9Ej5fM", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ButtonGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float minHeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float maxHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float minWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float maxWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float horizontalPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float verticalPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float gap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final u0 textStyle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final float iconSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final SpinnerSize spinnerSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final float focusRingBorderSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final float focusRingPadding;

    public /* synthetic */ ButtonGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, u0 u0Var, float f19, SpinnerSize spinnerSize, float f20, float f21, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, (i11 & 2) != 0 ? Float.NaN : f12, f13, (i11 & 8) != 0 ? Float.NaN : f14, f15, f16, f17, f18, u0Var, f19, spinnerSize, f20, f21, null);
    }

    /* JADX INFO: renamed from: copy-6-Oi4jA$default, reason: not valid java name */
    public static /* synthetic */ ButtonGeometry m633copy6Oi4jA$default(ButtonGeometry buttonGeometry, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, u0 u0Var, float f19, SpinnerSize spinnerSize, float f20, float f21, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = buttonGeometry.minHeight;
        }
        return buttonGeometry.m645copy6Oi4jA(f11, (i11 & 2) != 0 ? buttonGeometry.maxHeight : f12, (i11 & 4) != 0 ? buttonGeometry.minWidth : f13, (i11 & 8) != 0 ? buttonGeometry.maxWidth : f14, (i11 & 16) != 0 ? buttonGeometry.horizontalPadding : f15, (i11 & 32) != 0 ? buttonGeometry.verticalPadding : f16, (i11 & 64) != 0 ? buttonGeometry.gap : f17, (i11 & 128) != 0 ? buttonGeometry.cornerRadius : f18, (i11 & 256) != 0 ? buttonGeometry.textStyle : u0Var, (i11 & 512) != 0 ? buttonGeometry.iconSize : f19, (i11 & 1024) != 0 ? buttonGeometry.spinnerSize : spinnerSize, (i11 & NewHope.SENDB_BYTES) != 0 ? buttonGeometry.focusRingBorderSize : f20, (i11 & 4096) != 0 ? buttonGeometry.focusRingPadding : f21);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: component10-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SpinnerSize getSpinnerSize() {
        return this.spinnerSize;
    }

    /* JADX INFO: renamed from: component12-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingBorderSize() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: component13-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingPadding() {
        return this.focusRingPadding;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getGap() {
        return this.gap;
    }

    /* JADX INFO: renamed from: component8-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final u0 getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-6-Oi4jA, reason: not valid java name */
    public final ButtonGeometry m645copy6Oi4jA(float minHeight, float maxHeight, float minWidth, float maxWidth, float horizontalPadding, float verticalPadding, float gap, float cornerRadius, @NotNull u0 textStyle, float iconSize, @NotNull SpinnerSize spinnerSize, float focusRingBorderSize, float focusRingPadding) {
        textStyle.getClass();
        spinnerSize.getClass();
        return new ButtonGeometry(minHeight, maxHeight, minWidth, maxWidth, horizontalPadding, verticalPadding, gap, cornerRadius, textStyle, iconSize, spinnerSize, focusRingBorderSize, focusRingPadding, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonGeometry)) {
            return false;
        }
        ButtonGeometry buttonGeometry = (ButtonGeometry) other;
        return f.c(this.minHeight, buttonGeometry.minHeight) && f.c(this.maxHeight, buttonGeometry.maxHeight) && f.c(this.minWidth, buttonGeometry.minWidth) && f.c(this.maxWidth, buttonGeometry.maxWidth) && f.c(this.horizontalPadding, buttonGeometry.horizontalPadding) && f.c(this.verticalPadding, buttonGeometry.verticalPadding) && f.c(this.gap, buttonGeometry.gap) && f.c(this.cornerRadius, buttonGeometry.cornerRadius) && Intrinsics.areEqual(this.textStyle, buttonGeometry.textStyle) && f.c(this.iconSize, buttonGeometry.iconSize) && this.spinnerSize == buttonGeometry.spinnerSize && f.c(this.focusRingBorderSize, buttonGeometry.focusRingBorderSize) && f.c(this.focusRingPadding, buttonGeometry.focusRingPadding);
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m646getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getFocusRingBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m647getFocusRingBorderSizeD9Ej5fM() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: getFocusRingPadding-D9Ej5fM, reason: not valid java name */
    public final float m648getFocusRingPaddingD9Ej5fM() {
        return this.focusRingPadding;
    }

    /* JADX INFO: renamed from: getGap-D9Ej5fM, reason: not valid java name */
    public final float m649getGapD9Ej5fM() {
        return this.gap;
    }

    /* JADX INFO: renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m650getHorizontalPaddingD9Ej5fM() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m651getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m652getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m653getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m654getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m655getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @NotNull
    public final SpinnerSize getSpinnerSize() {
        return this.spinnerSize;
    }

    @NotNull
    public final u0 getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m656getVerticalPaddingD9Ej5fM() {
        return this.verticalPadding;
    }

    public int hashCode() {
        return Float.hashCode(this.focusRingPadding) + k.a((this.spinnerSize.hashCode() + k.a(l1.c(k.a(k.a(k.a(k.a(k.a(k.a(k.a(Float.hashCode(this.minHeight) * 31, this.maxHeight, 31), this.minWidth, 31), this.maxWidth, 31), this.horizontalPadding, 31), this.verticalPadding, 31), this.gap, 31), this.cornerRadius, 31), 31, this.textStyle), this.iconSize, 31)) * 31, this.focusRingBorderSize, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.minHeight);
        String strD2 = f.d(this.maxHeight);
        String strD3 = f.d(this.minWidth);
        String strD4 = f.d(this.maxWidth);
        String strD5 = f.d(this.horizontalPadding);
        String strD6 = f.d(this.verticalPadding);
        String strD7 = f.d(this.gap);
        String strD8 = f.d(this.cornerRadius);
        String strD9 = f.d(this.iconSize);
        String strD10 = f.d(this.focusRingBorderSize);
        String strD11 = f.d(this.focusRingPadding);
        StringBuilder sbT = e0.f.t("ButtonGeometry(minHeight=", strD, ", maxHeight=", strD2, ", minWidth=");
        s.A(sbT, strD3, ", maxWidth=", strD4, ", horizontalPadding=");
        s.A(sbT, strD5, ", verticalPadding=", strD6, ", gap=");
        s.A(sbT, strD7, ", cornerRadius=", strD8, ", textStyle=");
        sbT.append(this.textStyle);
        sbT.append(", iconSize=");
        sbT.append(strD9);
        sbT.append(", spinnerSize=");
        sbT.append(this.spinnerSize);
        sbT.append(", focusRingBorderSize=");
        sbT.append(strD10);
        sbT.append(", focusRingPadding=");
        return k.p(sbT, strD11, ")");
    }

    public ButtonGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, u0 u0Var, float f19, SpinnerSize spinnerSize, float f20, float f21, DefaultConstructorMarker defaultConstructorMarker) {
        u0Var.getClass();
        spinnerSize.getClass();
        this.minHeight = f11;
        this.maxHeight = f12;
        this.minWidth = f13;
        this.maxWidth = f14;
        this.horizontalPadding = f15;
        this.verticalPadding = f16;
        this.gap = f17;
        this.cornerRadius = f18;
        this.textStyle = u0Var;
        this.iconSize = f19;
        this.spinnerSize = spinnerSize;
        this.focusRingBorderSize = f20;
        this.focusRingPadding = f21;
    }
}
