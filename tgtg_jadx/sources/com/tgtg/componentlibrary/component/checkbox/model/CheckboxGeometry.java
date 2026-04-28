package com.tgtg.componentlibrary.component.checkbox.model;

import com.braze.Constants;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000eJ`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010\u000e¨\u0006<"}, d2 = {"Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxGeometry;", "", "Lz5/f;", "checkboxBorderSize", "checkboxBorderSizeDisabled", "checkboxSize", "checkboxIconSize", "checkboxCornerRadius", "checkboxPadding", "focusRingBorderSize", "focusRingCornerRadius", "<init>", "(FFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8-D9Ej5fM", "component8", "copy-ka4v4c8", "(FFFFFFFF)Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getCheckboxBorderSize-D9Ej5fM", "b", "getCheckboxBorderSizeDisabled-D9Ej5fM", "c", "getCheckboxSize-D9Ej5fM", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getCheckboxIconSize-D9Ej5fM", "e", "getCheckboxCornerRadius-D9Ej5fM", "f", "getCheckboxPadding-D9Ej5fM", "g", "getFocusRingBorderSize-D9Ej5fM", "h", "getFocusRingCornerRadius-D9Ej5fM", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CheckboxGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float checkboxBorderSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float checkboxBorderSizeDisabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float checkboxSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float checkboxIconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float checkboxCornerRadius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float checkboxPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float focusRingBorderSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final float focusRingCornerRadius;

    public CheckboxGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, DefaultConstructorMarker defaultConstructorMarker) {
        this.checkboxBorderSize = f11;
        this.checkboxBorderSizeDisabled = f12;
        this.checkboxSize = f13;
        this.checkboxIconSize = f14;
        this.checkboxCornerRadius = f15;
        this.checkboxPadding = f16;
        this.focusRingBorderSize = f17;
        this.focusRingCornerRadius = f18;
    }

    /* JADX INFO: renamed from: copy-ka4v4c8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxGeometry m700copyka4v4c8$default(CheckboxGeometry checkboxGeometry, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = checkboxGeometry.checkboxBorderSize;
        }
        if ((i11 & 2) != 0) {
            f12 = checkboxGeometry.checkboxBorderSizeDisabled;
        }
        if ((i11 & 4) != 0) {
            f13 = checkboxGeometry.checkboxSize;
        }
        if ((i11 & 8) != 0) {
            f14 = checkboxGeometry.checkboxIconSize;
        }
        if ((i11 & 16) != 0) {
            f15 = checkboxGeometry.checkboxCornerRadius;
        }
        if ((i11 & 32) != 0) {
            f16 = checkboxGeometry.checkboxPadding;
        }
        if ((i11 & 64) != 0) {
            f17 = checkboxGeometry.focusRingBorderSize;
        }
        if ((i11 & 128) != 0) {
            f18 = checkboxGeometry.focusRingCornerRadius;
        }
        float f19 = f17;
        float f20 = f18;
        float f21 = f15;
        float f22 = f16;
        return checkboxGeometry.m709copyka4v4c8(f11, f12, f13, f14, f21, f22, f19, f20);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCheckboxBorderSize() {
        return this.checkboxBorderSize;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCheckboxBorderSizeDisabled() {
        return this.checkboxBorderSizeDisabled;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCheckboxSize() {
        return this.checkboxSize;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCheckboxIconSize() {
        return this.checkboxIconSize;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCheckboxCornerRadius() {
        return this.checkboxCornerRadius;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCheckboxPadding() {
        return this.checkboxPadding;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingBorderSize() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: component8-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingCornerRadius() {
        return this.focusRingCornerRadius;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ka4v4c8, reason: not valid java name */
    public final CheckboxGeometry m709copyka4v4c8(float checkboxBorderSize, float checkboxBorderSizeDisabled, float checkboxSize, float checkboxIconSize, float checkboxCornerRadius, float checkboxPadding, float focusRingBorderSize, float focusRingCornerRadius) {
        return new CheckboxGeometry(checkboxBorderSize, checkboxBorderSizeDisabled, checkboxSize, checkboxIconSize, checkboxCornerRadius, checkboxPadding, focusRingBorderSize, focusRingCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxGeometry)) {
            return false;
        }
        CheckboxGeometry checkboxGeometry = (CheckboxGeometry) other;
        return f.c(this.checkboxBorderSize, checkboxGeometry.checkboxBorderSize) && f.c(this.checkboxBorderSizeDisabled, checkboxGeometry.checkboxBorderSizeDisabled) && f.c(this.checkboxSize, checkboxGeometry.checkboxSize) && f.c(this.checkboxIconSize, checkboxGeometry.checkboxIconSize) && f.c(this.checkboxCornerRadius, checkboxGeometry.checkboxCornerRadius) && f.c(this.checkboxPadding, checkboxGeometry.checkboxPadding) && f.c(this.focusRingBorderSize, checkboxGeometry.focusRingBorderSize) && f.c(this.focusRingCornerRadius, checkboxGeometry.focusRingCornerRadius);
    }

    /* JADX INFO: renamed from: getCheckboxBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m710getCheckboxBorderSizeD9Ej5fM() {
        return this.checkboxBorderSize;
    }

    /* JADX INFO: renamed from: getCheckboxBorderSizeDisabled-D9Ej5fM, reason: not valid java name */
    public final float m711getCheckboxBorderSizeDisabledD9Ej5fM() {
        return this.checkboxBorderSizeDisabled;
    }

    /* JADX INFO: renamed from: getCheckboxCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m712getCheckboxCornerRadiusD9Ej5fM() {
        return this.checkboxCornerRadius;
    }

    /* JADX INFO: renamed from: getCheckboxIconSize-D9Ej5fM, reason: not valid java name */
    public final float m713getCheckboxIconSizeD9Ej5fM() {
        return this.checkboxIconSize;
    }

    /* JADX INFO: renamed from: getCheckboxPadding-D9Ej5fM, reason: not valid java name */
    public final float m714getCheckboxPaddingD9Ej5fM() {
        return this.checkboxPadding;
    }

    /* JADX INFO: renamed from: getCheckboxSize-D9Ej5fM, reason: not valid java name */
    public final float m715getCheckboxSizeD9Ej5fM() {
        return this.checkboxSize;
    }

    /* JADX INFO: renamed from: getFocusRingBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m716getFocusRingBorderSizeD9Ej5fM() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: getFocusRingCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m717getFocusRingCornerRadiusD9Ej5fM() {
        return this.focusRingCornerRadius;
    }

    public int hashCode() {
        return Float.hashCode(this.focusRingCornerRadius) + k.a(k.a(k.a(k.a(k.a(k.a(Float.hashCode(this.checkboxBorderSize) * 31, this.checkboxBorderSizeDisabled, 31), this.checkboxSize, 31), this.checkboxIconSize, 31), this.checkboxCornerRadius, 31), this.checkboxPadding, 31), this.focusRingBorderSize, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.checkboxBorderSize);
        String strD2 = f.d(this.checkboxBorderSizeDisabled);
        String strD3 = f.d(this.checkboxSize);
        String strD4 = f.d(this.checkboxIconSize);
        String strD5 = f.d(this.checkboxCornerRadius);
        String strD6 = f.d(this.checkboxPadding);
        String strD7 = f.d(this.focusRingBorderSize);
        String strD8 = f.d(this.focusRingCornerRadius);
        StringBuilder sbT = e0.f.t("CheckboxGeometry(checkboxBorderSize=", strD, ", checkboxBorderSizeDisabled=", strD2, ", checkboxSize=");
        s.A(sbT, strD3, ", checkboxIconSize=", strD4, ", checkboxCornerRadius=");
        s.A(sbT, strD5, ", checkboxPadding=", strD6, ", focusRingBorderSize=");
        return e0.f.o(sbT, strD7, ", focusRingCornerRadius=", strD8, ")");
    }
}
