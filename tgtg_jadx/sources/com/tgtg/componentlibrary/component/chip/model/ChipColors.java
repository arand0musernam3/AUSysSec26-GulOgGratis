package com.tgtg.componentlibrary.component.chip.model;

import com.braze.Constants;
import e0.f;
import i4.v;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0010J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0010J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0010Jt\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010\u0010¨\u0006F"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;", "", "Li4/v;", "containerColor", "contentColor", "containerOverlayColorSelected", "contentColorSelected", "containerColorDisabled", "contentColorDisabled", "focusRingColor", "borderColor", "borderColorSelected", "borderColorDisabled", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "copy--K518z4", "(JJJJJJJJJJ)Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getContainerColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getContainerOverlayColorSelected-0d7_KjU", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getContentColorSelected-0d7_KjU", "e", "getContainerColorDisabled-0d7_KjU", "f", "getContentColorDisabled-0d7_KjU", "g", "getFocusRingColor-0d7_KjU", "h", "getBorderColor-0d7_KjU", "i", "getBorderColorSelected-0d7_KjU", "j", "getBorderColorDisabled-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ChipColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long containerOverlayColorSelected;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long contentColorSelected;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long containerColorDisabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long contentColorDisabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long focusRingColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long borderColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long borderColorSelected;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long borderColorDisabled;

    public ChipColors(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, DefaultConstructorMarker defaultConstructorMarker) {
        this.containerColor = j9;
        this.contentColor = j11;
        this.containerOverlayColorSelected = j12;
        this.contentColorSelected = j13;
        this.containerColorDisabled = j14;
        this.contentColorDisabled = j15;
        this.focusRingColor = j16;
        this.borderColor = j17;
        this.borderColorSelected = j18;
        this.borderColorDisabled = j19;
    }

    /* JADX INFO: renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m729copyK518z4$default(ChipColors chipColors, long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i11, Object obj) {
        long j21;
        long j22;
        long j23 = (i11 & 1) != 0 ? chipColors.containerColor : j9;
        long j24 = (i11 & 2) != 0 ? chipColors.contentColor : j11;
        long j25 = (i11 & 4) != 0 ? chipColors.containerOverlayColorSelected : j12;
        long j26 = (i11 & 8) != 0 ? chipColors.contentColorSelected : j13;
        long j27 = (i11 & 16) != 0 ? chipColors.containerColorDisabled : j14;
        long j28 = (i11 & 32) != 0 ? chipColors.contentColorDisabled : j15;
        long j29 = (i11 & 64) != 0 ? chipColors.focusRingColor : j16;
        long j31 = j23;
        long j32 = (i11 & 128) != 0 ? chipColors.borderColor : j17;
        long j33 = (i11 & 256) != 0 ? chipColors.borderColorSelected : j18;
        if ((i11 & 512) != 0) {
            j22 = j33;
            j21 = chipColors.borderColorDisabled;
        } else {
            j21 = j19;
            j22 = j33;
        }
        return chipColors.m740copyK518z4(j31, j24, j25, j26, j27, j28, j29, j32, j22, j21);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColorDisabled() {
        return this.borderColorDisabled;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerOverlayColorSelected() {
        return this.containerOverlayColorSelected;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColorSelected() {
        return this.contentColorSelected;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColorDisabled() {
        return this.containerColorDisabled;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColorDisabled() {
        return this.contentColorDisabled;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusRingColor() {
        return this.focusRingColor;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColorSelected() {
        return this.borderColorSelected;
    }

    @NotNull
    /* JADX INFO: renamed from: copy--K518z4, reason: not valid java name */
    public final ChipColors m740copyK518z4(long containerColor, long contentColor, long containerOverlayColorSelected, long contentColorSelected, long containerColorDisabled, long contentColorDisabled, long focusRingColor, long borderColor, long borderColorSelected, long borderColorDisabled) {
        return new ChipColors(containerColor, contentColor, containerOverlayColorSelected, contentColorSelected, containerColorDisabled, contentColorDisabled, focusRingColor, borderColor, borderColorSelected, borderColorDisabled, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) other;
        return v.c(this.containerColor, chipColors.containerColor) && v.c(this.contentColor, chipColors.contentColor) && v.c(this.containerOverlayColorSelected, chipColors.containerOverlayColorSelected) && v.c(this.contentColorSelected, chipColors.contentColorSelected) && v.c(this.containerColorDisabled, chipColors.containerColorDisabled) && v.c(this.contentColorDisabled, chipColors.contentColorDisabled) && v.c(this.focusRingColor, chipColors.focusRingColor) && v.c(this.borderColor, chipColors.borderColor) && v.c(this.borderColorSelected, chipColors.borderColorSelected) && v.c(this.borderColorDisabled, chipColors.borderColorDisabled);
    }

    /* JADX INFO: renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
    public final long m741getBorderColor0d7_KjU() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: getBorderColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m742getBorderColorDisabled0d7_KjU() {
        return this.borderColorDisabled;
    }

    /* JADX INFO: renamed from: getBorderColorSelected-0d7_KjU, reason: not valid java name */
    public final long m743getBorderColorSelected0d7_KjU() {
        return this.borderColorSelected;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m744getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContainerColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m745getContainerColorDisabled0d7_KjU() {
        return this.containerColorDisabled;
    }

    /* JADX INFO: renamed from: getContainerOverlayColorSelected-0d7_KjU, reason: not valid java name */
    public final long m746getContainerOverlayColorSelected0d7_KjU() {
        return this.containerOverlayColorSelected;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m747getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getContentColorDisabled-0d7_KjU, reason: not valid java name */
    public final long m748getContentColorDisabled0d7_KjU() {
        return this.contentColorDisabled;
    }

    /* JADX INFO: renamed from: getContentColorSelected-0d7_KjU, reason: not valid java name */
    public final long m749getContentColorSelected0d7_KjU() {
        return this.contentColorSelected;
    }

    /* JADX INFO: renamed from: getFocusRingColor-0d7_KjU, reason: not valid java name */
    public final long m750getFocusRingColor0d7_KjU() {
        return this.focusRingColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.borderColorDisabled) + f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(Long.hashCode(this.containerColor) * 31, 31, this.contentColor), 31, this.containerOverlayColorSelected), 31, this.contentColorSelected), 31, this.containerColorDisabled), 31, this.contentColorDisabled), 31, this.focusRingColor), 31, this.borderColor), 31, this.borderColorSelected);
    }

    @NotNull
    public String toString() {
        String strI = v.i(this.containerColor);
        String strI2 = v.i(this.contentColor);
        String strI3 = v.i(this.containerOverlayColorSelected);
        String strI4 = v.i(this.contentColorSelected);
        String strI5 = v.i(this.containerColorDisabled);
        String strI6 = v.i(this.contentColorDisabled);
        String strI7 = v.i(this.focusRingColor);
        String strI8 = v.i(this.borderColor);
        String strI9 = v.i(this.borderColorSelected);
        String strI10 = v.i(this.borderColorDisabled);
        StringBuilder sbT = f.t("ChipColors(containerColor=", strI, ", contentColor=", strI2, ", containerOverlayColorSelected=");
        s.A(sbT, strI3, ", contentColorSelected=", strI4, ", containerColorDisabled=");
        s.A(sbT, strI5, ", contentColorDisabled=", strI6, ", focusRingColor=");
        s.A(sbT, strI7, ", borderColor=", strI8, ", borderColorSelected=");
        return f.o(sbT, strI9, ", borderColorDisabled=", strI10, ")");
    }
}
