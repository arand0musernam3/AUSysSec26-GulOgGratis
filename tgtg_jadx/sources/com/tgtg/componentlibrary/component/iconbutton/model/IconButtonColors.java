package com.tgtg.componentlibrary.component.iconbutton.model;

import com.braze.Constants;
import e0.f;
import i4.v;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0011J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0011J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0011J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0011J~\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010\u0011R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u0010\u0011R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010\u0011¨\u0006K"}, d2 = {"Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonColors;", "", "Li4/v;", "containerColor", "contentColor", "containerColorHover", "contentColorHover", "containerColorPressed", "contentColorPressed", "containerColorDisabled", "contentColorDisabled", "containerColorLoading", "contentColorLoading", "focusRingColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "component11-0d7_KjU", "component11", "copy-KpyCeHw", "(JJJJJJJJJJJ)Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getContainerColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getContainerColorHover-0d7_KjU", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getContentColorHover-0d7_KjU", "e", "getContainerColorPressed-0d7_KjU", "f", "getContentColorPressed-0d7_KjU", "g", "getContainerColorDisabled-0d7_KjU", "h", "getContentColorDisabled-0d7_KjU", "i", "getContainerColorLoading-0d7_KjU", "j", "getContentColorLoading-0d7_KjU", "k", "getFocusRingColor-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class IconButtonColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long containerColorHover;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long contentColorHover;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long containerColorPressed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long contentColorPressed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long containerColorDisabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long contentColorDisabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long containerColorLoading;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long contentColorLoading;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final long focusRingColor;

    public IconButtonColors(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this.containerColor = j9;
        this.contentColor = j11;
        this.containerColorHover = j12;
        this.contentColorHover = j13;
        this.containerColorPressed = j14;
        this.contentColorPressed = j15;
        this.containerColorDisabled = j16;
        this.contentColorDisabled = j17;
        this.containerColorLoading = j18;
        this.contentColorLoading = j19;
        this.focusRingColor = j21;
    }

    /* JADX INFO: renamed from: copy-KpyCeHw$default, reason: not valid java name */
    public static /* synthetic */ IconButtonColors m816copyKpyCeHw$default(IconButtonColors iconButtonColors, long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, int i11, Object obj) {
        long j22;
        long j23;
        long j24 = (i11 & 1) != 0 ? iconButtonColors.containerColor : j9;
        long j25 = (i11 & 2) != 0 ? iconButtonColors.contentColor : j11;
        long j26 = (i11 & 4) != 0 ? iconButtonColors.containerColorHover : j12;
        long j27 = (i11 & 8) != 0 ? iconButtonColors.contentColorHover : j13;
        long j28 = (i11 & 16) != 0 ? iconButtonColors.containerColorPressed : j14;
        long j29 = (i11 & 32) != 0 ? iconButtonColors.contentColorPressed : j15;
        long j31 = (i11 & 64) != 0 ? iconButtonColors.containerColorDisabled : j16;
        long j32 = j24;
        long j33 = (i11 & 128) != 0 ? iconButtonColors.contentColorDisabled : j17;
        long j34 = (i11 & 256) != 0 ? iconButtonColors.containerColorLoading : j18;
        long j35 = (i11 & 512) != 0 ? iconButtonColors.contentColorLoading : j19;
        if ((i11 & 1024) != 0) {
            j23 = j35;
            j22 = iconButtonColors.focusRingColor;
        } else {
            j22 = j21;
            j23 = j35;
        }
        return iconButtonColors.m828copyKpyCeHw(j32, j25, j26, j27, j28, j29, j31, j33, j34, j23, j22);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColorLoading() {
        return this.contentColorLoading;
    }

    /* JADX INFO: renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusRingColor() {
        return this.focusRingColor;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColorHover() {
        return this.containerColorHover;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColorHover() {
        return this.contentColorHover;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColorPressed() {
        return this.containerColorPressed;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColorPressed() {
        return this.contentColorPressed;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColorDisabled() {
        return this.containerColorDisabled;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColorDisabled() {
        return this.contentColorDisabled;
    }

    /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColorLoading() {
        return this.containerColorLoading;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-KpyCeHw, reason: not valid java name */
    public final IconButtonColors m828copyKpyCeHw(long containerColor, long contentColor, long containerColorHover, long contentColorHover, long containerColorPressed, long contentColorPressed, long containerColorDisabled, long contentColorDisabled, long containerColorLoading, long contentColorLoading, long focusRingColor) {
        return new IconButtonColors(containerColor, contentColor, containerColorHover, contentColorHover, containerColorPressed, contentColorPressed, containerColorDisabled, contentColorDisabled, containerColorLoading, contentColorLoading, focusRingColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) other;
        return v.c(this.containerColor, iconButtonColors.containerColor) && v.c(this.contentColor, iconButtonColors.contentColor) && v.c(this.containerColorHover, iconButtonColors.containerColorHover) && v.c(this.contentColorHover, iconButtonColors.contentColorHover) && v.c(this.containerColorPressed, iconButtonColors.containerColorPressed) && v.c(this.contentColorPressed, iconButtonColors.contentColorPressed) && v.c(this.containerColorDisabled, iconButtonColors.containerColorDisabled) && v.c(this.contentColorDisabled, iconButtonColors.contentColorDisabled) && v.c(this.containerColorLoading, iconButtonColors.containerColorLoading) && v.c(this.contentColorLoading, iconButtonColors.contentColorLoading) && v.c(this.focusRingColor, iconButtonColors.focusRingColor);
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m829getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContainerColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m830getContainerColorDisabled0d7_KjU() {
        return this.containerColorDisabled;
    }

    /* JADX INFO: renamed from: getContainerColorHover-0d7_KjU, reason: not valid java name */
    public final long m831getContainerColorHover0d7_KjU() {
        return this.containerColorHover;
    }

    /* JADX INFO: renamed from: getContainerColorLoading-0d7_KjU, reason: not valid java name */
    public final long m832getContainerColorLoading0d7_KjU() {
        return this.containerColorLoading;
    }

    /* JADX INFO: renamed from: getContainerColorPressed-0d7_KjU, reason: not valid java name */
    public final long m833getContainerColorPressed0d7_KjU() {
        return this.containerColorPressed;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m834getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getContentColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m835getContentColorDisabled0d7_KjU() {
        return this.contentColorDisabled;
    }

    /* JADX INFO: renamed from: getContentColorHover-0d7_KjU, reason: not valid java name */
    public final long m836getContentColorHover0d7_KjU() {
        return this.contentColorHover;
    }

    /* JADX INFO: renamed from: getContentColorLoading-0d7_KjU, reason: not valid java name */
    public final long m837getContentColorLoading0d7_KjU() {
        return this.contentColorLoading;
    }

    /* JADX INFO: renamed from: getContentColorPressed-0d7_KjU, reason: not valid java name */
    public final long m838getContentColorPressed0d7_KjU() {
        return this.contentColorPressed;
    }

    /* JADX INFO: renamed from: getFocusRingColor-0d7_KjU, reason: not valid java name */
    public final long m839getFocusRingColor0d7_KjU() {
        return this.focusRingColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.focusRingColor) + f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(Long.hashCode(this.containerColor) * 31, 31, this.contentColor), 31, this.containerColorHover), 31, this.contentColorHover), 31, this.containerColorPressed), 31, this.contentColorPressed), 31, this.containerColorDisabled), 31, this.contentColorDisabled), 31, this.containerColorLoading), 31, this.contentColorLoading);
    }

    @NotNull
    public String toString() {
        String strI = v.i(this.containerColor);
        String strI2 = v.i(this.contentColor);
        String strI3 = v.i(this.containerColorHover);
        String strI4 = v.i(this.contentColorHover);
        String strI5 = v.i(this.containerColorPressed);
        String strI6 = v.i(this.contentColorPressed);
        String strI7 = v.i(this.containerColorDisabled);
        String strI8 = v.i(this.contentColorDisabled);
        String strI9 = v.i(this.containerColorLoading);
        String strI10 = v.i(this.contentColorLoading);
        String strI11 = v.i(this.focusRingColor);
        StringBuilder sbT = f.t("IconButtonColors(containerColor=", strI, ", contentColor=", strI2, ", containerColorHover=");
        s.A(sbT, strI3, ", contentColorHover=", strI4, ", containerColorPressed=");
        s.A(sbT, strI5, ", contentColorPressed=", strI6, ", containerColorDisabled=");
        s.A(sbT, strI7, ", contentColorDisabled=", strI8, ", containerColorLoading=");
        s.A(sbT, strI9, ", contentColorLoading=", strI10, ", focusRingColor=");
        return k.p(sbT, strI11, ")");
    }
}
