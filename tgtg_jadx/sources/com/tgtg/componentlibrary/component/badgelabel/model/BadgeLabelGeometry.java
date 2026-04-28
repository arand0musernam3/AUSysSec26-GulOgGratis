package com.tgtg.componentlibrary.component.badgelabel.model;

import com.braze.Constants;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m5.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0012J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0012J~\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\bE\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010\u0012¨\u0006M"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelGeometry;", "", "Lz5/f;", "minWidth", "minHeight", "maxWidth", "maxHeight", "horizontalPadding", "verticalPadding", "gap", "cornerRadius", "Lm5/u0;", "textStyle", "iconSize", "borderWidth", "<init>", "(FFFFFFFFLm5/u0;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8-D9Ej5fM", "component8", "component9", "()Lm5/u0;", "component10-D9Ej5fM", "component10", "component11-D9Ej5fM", "component11", "copy-IYbLywE", "(FFFFFFFFLm5/u0;FF)Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getMinWidth-D9Ej5fM", "b", "getMinHeight-D9Ej5fM", "c", "getMaxWidth-D9Ej5fM", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getMaxHeight-D9Ej5fM", "e", "getHorizontalPadding-D9Ej5fM", "f", "getVerticalPadding-D9Ej5fM", "g", "getGap-D9Ej5fM", "h", "getCornerRadius-D9Ej5fM", "i", "Lm5/u0;", "getTextStyle", "j", "getIconSize-D9Ej5fM", "k", "getBorderWidth-D9Ej5fM", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BadgeLabelGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float minWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float minHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float maxWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float maxHeight;

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
    public final float borderWidth;

    public /* synthetic */ BadgeLabelGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, u0 u0Var, float f19, float f20, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, (i11 & 4) != 0 ? Float.NaN : f13, (i11 & 8) != 0 ? Float.NaN : f14, f15, f16, f17, f18, u0Var, f19, f20, null);
    }

    /* JADX INFO: renamed from: copy-IYbLywE$default, reason: not valid java name */
    public static /* synthetic */ BadgeLabelGeometry m585copyIYbLywE$default(BadgeLabelGeometry badgeLabelGeometry, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, u0 u0Var, float f19, float f20, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = badgeLabelGeometry.minWidth;
        }
        if ((i11 & 2) != 0) {
            f12 = badgeLabelGeometry.minHeight;
        }
        if ((i11 & 4) != 0) {
            f13 = badgeLabelGeometry.maxWidth;
        }
        if ((i11 & 8) != 0) {
            f14 = badgeLabelGeometry.maxHeight;
        }
        if ((i11 & 16) != 0) {
            f15 = badgeLabelGeometry.horizontalPadding;
        }
        if ((i11 & 32) != 0) {
            f16 = badgeLabelGeometry.verticalPadding;
        }
        if ((i11 & 64) != 0) {
            f17 = badgeLabelGeometry.gap;
        }
        if ((i11 & 128) != 0) {
            f18 = badgeLabelGeometry.cornerRadius;
        }
        if ((i11 & 256) != 0) {
            u0Var = badgeLabelGeometry.textStyle;
        }
        if ((i11 & 512) != 0) {
            f19 = badgeLabelGeometry.iconSize;
        }
        if ((i11 & 1024) != 0) {
            f20 = badgeLabelGeometry.borderWidth;
        }
        float f21 = f19;
        float f22 = f20;
        float f23 = f18;
        u0 u0Var2 = u0Var;
        float f24 = f16;
        float f25 = f17;
        float f26 = f15;
        float f27 = f13;
        return badgeLabelGeometry.m596copyIYbLywE(f11, f12, f27, f14, f26, f24, f25, f23, u0Var2, f21, f22);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: component10-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: component11-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
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
    /* JADX INFO: renamed from: copy-IYbLywE, reason: not valid java name */
    public final BadgeLabelGeometry m596copyIYbLywE(float minWidth, float minHeight, float maxWidth, float maxHeight, float horizontalPadding, float verticalPadding, float gap, float cornerRadius, @NotNull u0 textStyle, float iconSize, float borderWidth) {
        textStyle.getClass();
        return new BadgeLabelGeometry(minWidth, minHeight, maxWidth, maxHeight, horizontalPadding, verticalPadding, gap, cornerRadius, textStyle, iconSize, borderWidth, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeLabelGeometry)) {
            return false;
        }
        BadgeLabelGeometry badgeLabelGeometry = (BadgeLabelGeometry) other;
        return f.c(this.minWidth, badgeLabelGeometry.minWidth) && f.c(this.minHeight, badgeLabelGeometry.minHeight) && f.c(this.maxWidth, badgeLabelGeometry.maxWidth) && f.c(this.maxHeight, badgeLabelGeometry.maxHeight) && f.c(this.horizontalPadding, badgeLabelGeometry.horizontalPadding) && f.c(this.verticalPadding, badgeLabelGeometry.verticalPadding) && f.c(this.gap, badgeLabelGeometry.gap) && f.c(this.cornerRadius, badgeLabelGeometry.cornerRadius) && Intrinsics.areEqual(this.textStyle, badgeLabelGeometry.textStyle) && f.c(this.iconSize, badgeLabelGeometry.iconSize) && f.c(this.borderWidth, badgeLabelGeometry.borderWidth);
    }

    /* JADX INFO: renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m597getBorderWidthD9Ej5fM() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m598getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getGap-D9Ej5fM, reason: not valid java name */
    public final float m599getGapD9Ej5fM() {
        return this.gap;
    }

    /* JADX INFO: renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m600getHorizontalPaddingD9Ej5fM() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m601getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m602getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m603getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m604getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m605getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @NotNull
    public final u0 getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m606getVerticalPaddingD9Ej5fM() {
        return this.verticalPadding;
    }

    public int hashCode() {
        return Float.hashCode(this.borderWidth) + k.a(l1.c(k.a(k.a(k.a(k.a(k.a(k.a(k.a(Float.hashCode(this.minWidth) * 31, this.minHeight, 31), this.maxWidth, 31), this.maxHeight, 31), this.horizontalPadding, 31), this.verticalPadding, 31), this.gap, 31), this.cornerRadius, 31), 31, this.textStyle), this.iconSize, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.minWidth);
        String strD2 = f.d(this.minHeight);
        String strD3 = f.d(this.maxWidth);
        String strD4 = f.d(this.maxHeight);
        String strD5 = f.d(this.horizontalPadding);
        String strD6 = f.d(this.verticalPadding);
        String strD7 = f.d(this.gap);
        String strD8 = f.d(this.cornerRadius);
        String strD9 = f.d(this.iconSize);
        String strD10 = f.d(this.borderWidth);
        StringBuilder sbT = e0.f.t("BadgeLabelGeometry(minWidth=", strD, ", minHeight=", strD2, ", maxWidth=");
        s.A(sbT, strD3, ", maxHeight=", strD4, ", horizontalPadding=");
        s.A(sbT, strD5, ", verticalPadding=", strD6, ", gap=");
        s.A(sbT, strD7, ", cornerRadius=", strD8, ", textStyle=");
        sbT.append(this.textStyle);
        sbT.append(", iconSize=");
        sbT.append(strD9);
        sbT.append(", borderWidth=");
        return k.p(sbT, strD10, ")");
    }

    public BadgeLabelGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, u0 u0Var, float f19, float f20, DefaultConstructorMarker defaultConstructorMarker) {
        u0Var.getClass();
        this.minWidth = f11;
        this.minHeight = f12;
        this.maxWidth = f13;
        this.maxHeight = f14;
        this.horizontalPadding = f15;
        this.verticalPadding = f16;
        this.gap = f17;
        this.cornerRadius = f18;
        this.textStyle = u0Var;
        this.iconSize = f19;
        this.borderWidth = f20;
    }
}
