package com.tgtg.componentlibrary.component.button.model;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000fJj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u0010\u000f¨\u0006A"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/model/ButtonColors;", "", "Li4/v;", "containerColor", "contentColor", "containerColorHover", "contentColorHover", "containerColorPressed", "contentColorPressed", "containerColorDisabled", "contentColorDisabled", "focusRingColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "copy-5r9EGqc", "(JJJJJJJJJ)Lcom/tgtg/componentlibrary/component/button/model/ButtonColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getContainerColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getContainerColorHover-0d7_KjU", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getContentColorHover-0d7_KjU", "e", "getContainerColorPressed-0d7_KjU", "f", "getContentColorPressed-0d7_KjU", "g", "getContainerColorDisabled-0d7_KjU", "h", "getContentColorDisabled-0d7_KjU", "i", "getFocusRingColor-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ButtonColors {
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
    public final long focusRingColor;

    public ButtonColors(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this.containerColor = j9;
        this.contentColor = j11;
        this.containerColorHover = j12;
        this.contentColorHover = j13;
        this.containerColorPressed = j14;
        this.contentColorPressed = j15;
        this.containerColorDisabled = j16;
        this.contentColorDisabled = j17;
        this.focusRingColor = j18;
    }

    /* JADX INFO: renamed from: copy-5r9EGqc$default, reason: not valid java name */
    public static /* synthetic */ ButtonColors m613copy5r9EGqc$default(ButtonColors buttonColors, long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i11, Object obj) {
        long j19;
        long j21;
        long j22 = (i11 & 1) != 0 ? buttonColors.containerColor : j9;
        long j23 = (i11 & 2) != 0 ? buttonColors.contentColor : j11;
        long j24 = (i11 & 4) != 0 ? buttonColors.containerColorHover : j12;
        long j25 = (i11 & 8) != 0 ? buttonColors.contentColorHover : j13;
        long j26 = (i11 & 16) != 0 ? buttonColors.containerColorPressed : j14;
        long j27 = (i11 & 32) != 0 ? buttonColors.contentColorPressed : j15;
        long j28 = (i11 & 64) != 0 ? buttonColors.containerColorDisabled : j16;
        long j29 = j22;
        long j31 = (i11 & 128) != 0 ? buttonColors.contentColorDisabled : j17;
        if ((i11 & 256) != 0) {
            j21 = j31;
            j19 = buttonColors.focusRingColor;
        } else {
            j19 = j18;
            j21 = j31;
        }
        return buttonColors.m623copy5r9EGqc(j29, j23, j24, j25, j26, j27, j28, j21, j19);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
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
    public final long getFocusRingColor() {
        return this.focusRingColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-5r9EGqc, reason: not valid java name */
    public final ButtonColors m623copy5r9EGqc(long containerColor, long contentColor, long containerColorHover, long contentColorHover, long containerColorPressed, long contentColorPressed, long containerColorDisabled, long contentColorDisabled, long focusRingColor) {
        return new ButtonColors(containerColor, contentColor, containerColorHover, contentColorHover, containerColorPressed, contentColorPressed, containerColorDisabled, contentColorDisabled, focusRingColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) other;
        return v.c(this.containerColor, buttonColors.containerColor) && v.c(this.contentColor, buttonColors.contentColor) && v.c(this.containerColorHover, buttonColors.containerColorHover) && v.c(this.contentColorHover, buttonColors.contentColorHover) && v.c(this.containerColorPressed, buttonColors.containerColorPressed) && v.c(this.contentColorPressed, buttonColors.contentColorPressed) && v.c(this.containerColorDisabled, buttonColors.containerColorDisabled) && v.c(this.contentColorDisabled, buttonColors.contentColorDisabled) && v.c(this.focusRingColor, buttonColors.focusRingColor);
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m624getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContainerColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m625getContainerColorDisabled0d7_KjU() {
        return this.containerColorDisabled;
    }

    /* JADX INFO: renamed from: getContainerColorHover-0d7_KjU, reason: not valid java name */
    public final long m626getContainerColorHover0d7_KjU() {
        return this.containerColorHover;
    }

    /* JADX INFO: renamed from: getContainerColorPressed-0d7_KjU, reason: not valid java name */
    public final long m627getContainerColorPressed0d7_KjU() {
        return this.containerColorPressed;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m628getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getContentColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m629getContentColorDisabled0d7_KjU() {
        return this.contentColorDisabled;
    }

    /* JADX INFO: renamed from: getContentColorHover-0d7_KjU, reason: not valid java name */
    public final long m630getContentColorHover0d7_KjU() {
        return this.contentColorHover;
    }

    /* JADX INFO: renamed from: getContentColorPressed-0d7_KjU, reason: not valid java name */
    public final long m631getContentColorPressed0d7_KjU() {
        return this.contentColorPressed;
    }

    /* JADX INFO: renamed from: getFocusRingColor-0d7_KjU, reason: not valid java name */
    public final long m632getFocusRingColor0d7_KjU() {
        return this.focusRingColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.focusRingColor) + f.b(f.b(f.b(f.b(f.b(f.b(f.b(Long.hashCode(this.containerColor) * 31, 31, this.contentColor), 31, this.containerColorHover), 31, this.contentColorHover), 31, this.containerColorPressed), 31, this.contentColorPressed), 31, this.containerColorDisabled), 31, this.contentColorDisabled);
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
        String strI9 = v.i(this.focusRingColor);
        StringBuilder sbT = f.t("ButtonColors(containerColor=", strI, ", contentColor=", strI2, ", containerColorHover=");
        s.A(sbT, strI3, ", contentColorHover=", strI4, ", containerColorPressed=");
        s.A(sbT, strI5, ", contentColorPressed=", strI6, ", containerColorDisabled=");
        s.A(sbT, strI7, ", contentColorDisabled=", strI8, ", focusRingColor=");
        return k.p(sbT, strI9, ")");
    }
}
