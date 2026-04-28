package com.tgtg.componentlibrary.component.radiobutton.model;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\rJV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\r¨\u00067"}, d2 = {"Lcom/tgtg/componentlibrary/component/radiobutton/model/RadioButtonColors;", "", "Li4/v;", "selectedDotColor", "selectedBorderColor", "unselectedBorderColor", "focusedRingBorderColor", "disabledSelectedDotColor", "disabledSelectedBorderColor", "disabledUnselectedBorderColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "copy-4JmcsL4", "(JJJJJJJ)Lcom/tgtg/componentlibrary/component/radiobutton/model/RadioButtonColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getSelectedDotColor-0d7_KjU", "b", "getSelectedBorderColor-0d7_KjU", "c", "getUnselectedBorderColor-0d7_KjU", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getFocusedRingBorderColor-0d7_KjU", "e", "getDisabledSelectedDotColor-0d7_KjU", "f", "getDisabledSelectedBorderColor-0d7_KjU", "g", "getDisabledUnselectedBorderColor-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RadioButtonColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long selectedDotColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long selectedBorderColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long unselectedBorderColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long focusedRingBorderColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long disabledSelectedDotColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long disabledSelectedBorderColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long disabledUnselectedBorderColor;

    public RadioButtonColors(long j9, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this.selectedDotColor = j9;
        this.selectedBorderColor = j11;
        this.unselectedBorderColor = j12;
        this.focusedRingBorderColor = j13;
        this.disabledSelectedDotColor = j14;
        this.disabledSelectedBorderColor = j15;
        this.disabledUnselectedBorderColor = j16;
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDotColor() {
        return this.selectedDotColor;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedBorderColor() {
        return this.unselectedBorderColor;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedRingBorderColor() {
        return this.focusedRingBorderColor;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDotColor() {
        return this.disabledSelectedDotColor;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedBorderColor() {
        return this.disabledSelectedBorderColor;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUnselectedBorderColor() {
        return this.disabledUnselectedBorderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-4JmcsL4, reason: not valid java name */
    public final RadioButtonColors m919copy4JmcsL4(long selectedDotColor, long selectedBorderColor, long unselectedBorderColor, long focusedRingBorderColor, long disabledSelectedDotColor, long disabledSelectedBorderColor, long disabledUnselectedBorderColor) {
        return new RadioButtonColors(selectedDotColor, selectedBorderColor, unselectedBorderColor, focusedRingBorderColor, disabledSelectedDotColor, disabledSelectedBorderColor, disabledUnselectedBorderColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) other;
        return v.c(this.selectedDotColor, radioButtonColors.selectedDotColor) && v.c(this.selectedBorderColor, radioButtonColors.selectedBorderColor) && v.c(this.unselectedBorderColor, radioButtonColors.unselectedBorderColor) && v.c(this.focusedRingBorderColor, radioButtonColors.focusedRingBorderColor) && v.c(this.disabledSelectedDotColor, radioButtonColors.disabledSelectedDotColor) && v.c(this.disabledSelectedBorderColor, radioButtonColors.disabledSelectedBorderColor) && v.c(this.disabledUnselectedBorderColor, radioButtonColors.disabledUnselectedBorderColor);
    }

    /* JADX INFO: renamed from: getDisabledSelectedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m920getDisabledSelectedBorderColor0d7_KjU() {
        return this.disabledSelectedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDotColor-0d7_KjU, reason: not valid java name */
    public final long m921getDisabledSelectedDotColor0d7_KjU() {
        return this.disabledSelectedDotColor;
    }

    /* JADX INFO: renamed from: getDisabledUnselectedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m922getDisabledUnselectedBorderColor0d7_KjU() {
        return this.disabledUnselectedBorderColor;
    }

    /* JADX INFO: renamed from: getFocusedRingBorderColor-0d7_KjU, reason: not valid java name */
    public final long m923getFocusedRingBorderColor0d7_KjU() {
        return this.focusedRingBorderColor;
    }

    /* JADX INFO: renamed from: getSelectedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m924getSelectedBorderColor0d7_KjU() {
        return this.selectedBorderColor;
    }

    /* JADX INFO: renamed from: getSelectedDotColor-0d7_KjU, reason: not valid java name */
    public final long m925getSelectedDotColor0d7_KjU() {
        return this.selectedDotColor;
    }

    /* JADX INFO: renamed from: getUnselectedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m926getUnselectedBorderColor0d7_KjU() {
        return this.unselectedBorderColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.disabledUnselectedBorderColor) + f.b(f.b(f.b(f.b(f.b(Long.hashCode(this.selectedDotColor) * 31, 31, this.selectedBorderColor), 31, this.unselectedBorderColor), 31, this.focusedRingBorderColor), 31, this.disabledSelectedDotColor), 31, this.disabledSelectedBorderColor);
    }

    @NotNull
    public String toString() {
        String strI = v.i(this.selectedDotColor);
        String strI2 = v.i(this.selectedBorderColor);
        String strI3 = v.i(this.unselectedBorderColor);
        String strI4 = v.i(this.focusedRingBorderColor);
        String strI5 = v.i(this.disabledSelectedDotColor);
        String strI6 = v.i(this.disabledSelectedBorderColor);
        String strI7 = v.i(this.disabledUnselectedBorderColor);
        StringBuilder sbT = f.t("RadioButtonColors(selectedDotColor=", strI, ", selectedBorderColor=", strI2, ", unselectedBorderColor=");
        s.A(sbT, strI3, ", focusedRingBorderColor=", strI4, ", disabledSelectedDotColor=");
        s.A(sbT, strI5, ", disabledSelectedBorderColor=", strI6, ", disabledUnselectedBorderColor=");
        return k.p(sbT, strI7, ")");
    }
}
