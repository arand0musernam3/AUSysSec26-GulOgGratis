package com.tgtg.componentlibrary.component.iconbutton.model;

import com.braze.Constants;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000eJV\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u000e¨\u00069"}, d2 = {"Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonGeometry;", "", "Lz5/f;", "height", "width", "cornerRadius", "iconSize", "Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "spinnerSize", "focusRingBorderSize", "focusRingPadding", "<init>", "(FFFFLcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5", "()Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "copy-DBFDt5E", "(FFFFLcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;FF)Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getHeight-D9Ej5fM", "b", "getWidth-D9Ej5fM", "c", "getCornerRadius-D9Ej5fM", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getIconSize-D9Ej5fM", "e", "Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "getSpinnerSize", "f", "getFocusRingBorderSize-D9Ej5fM", "g", "getFocusRingPadding-D9Ej5fM", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class IconButtonGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float height;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float iconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final SpinnerSize spinnerSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float focusRingBorderSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float focusRingPadding;

    public IconButtonGeometry(float f11, float f12, float f13, float f14, SpinnerSize spinnerSize, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        spinnerSize.getClass();
        this.height = f11;
        this.width = f12;
        this.cornerRadius = f13;
        this.iconSize = f14;
        this.spinnerSize = spinnerSize;
        this.focusRingBorderSize = f15;
        this.focusRingPadding = f16;
    }

    /* JADX INFO: renamed from: copy-DBFDt5E$default, reason: not valid java name */
    public static /* synthetic */ IconButtonGeometry m840copyDBFDt5E$default(IconButtonGeometry iconButtonGeometry, float f11, float f12, float f13, float f14, SpinnerSize spinnerSize, float f15, float f16, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = iconButtonGeometry.height;
        }
        if ((i11 & 2) != 0) {
            f12 = iconButtonGeometry.width;
        }
        if ((i11 & 4) != 0) {
            f13 = iconButtonGeometry.cornerRadius;
        }
        if ((i11 & 8) != 0) {
            f14 = iconButtonGeometry.iconSize;
        }
        if ((i11 & 16) != 0) {
            spinnerSize = iconButtonGeometry.spinnerSize;
        }
        if ((i11 & 32) != 0) {
            f15 = iconButtonGeometry.focusRingBorderSize;
        }
        if ((i11 & 64) != 0) {
            f16 = iconButtonGeometry.focusRingPadding;
        }
        float f17 = f15;
        float f18 = f16;
        SpinnerSize spinnerSize2 = spinnerSize;
        float f19 = f13;
        return iconButtonGeometry.m847copyDBFDt5E(f11, f12, f19, f14, spinnerSize2, f17, f18);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SpinnerSize getSpinnerSize() {
        return this.spinnerSize;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingBorderSize() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingPadding() {
        return this.focusRingPadding;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-DBFDt5E, reason: not valid java name */
    public final IconButtonGeometry m847copyDBFDt5E(float height, float width, float cornerRadius, float iconSize, @NotNull SpinnerSize spinnerSize, float focusRingBorderSize, float focusRingPadding) {
        spinnerSize.getClass();
        return new IconButtonGeometry(height, width, cornerRadius, iconSize, spinnerSize, focusRingBorderSize, focusRingPadding, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonGeometry)) {
            return false;
        }
        IconButtonGeometry iconButtonGeometry = (IconButtonGeometry) other;
        return f.c(this.height, iconButtonGeometry.height) && f.c(this.width, iconButtonGeometry.width) && f.c(this.cornerRadius, iconButtonGeometry.cornerRadius) && f.c(this.iconSize, iconButtonGeometry.iconSize) && this.spinnerSize == iconButtonGeometry.spinnerSize && f.c(this.focusRingBorderSize, iconButtonGeometry.focusRingBorderSize) && f.c(this.focusRingPadding, iconButtonGeometry.focusRingPadding);
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m848getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getFocusRingBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m849getFocusRingBorderSizeD9Ej5fM() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: getFocusRingPadding-D9Ej5fM, reason: not valid java name */
    public final float m850getFocusRingPaddingD9Ej5fM() {
        return this.focusRingPadding;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m851getHeightD9Ej5fM() {
        return this.height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m852getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    @NotNull
    public final SpinnerSize getSpinnerSize() {
        return this.spinnerSize;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m853getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return Float.hashCode(this.focusRingPadding) + k.a((this.spinnerSize.hashCode() + k.a(k.a(k.a(Float.hashCode(this.height) * 31, this.width, 31), this.cornerRadius, 31), this.iconSize, 31)) * 31, this.focusRingBorderSize, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.height);
        String strD2 = f.d(this.width);
        String strD3 = f.d(this.cornerRadius);
        String strD4 = f.d(this.iconSize);
        String strD5 = f.d(this.focusRingBorderSize);
        String strD6 = f.d(this.focusRingPadding);
        StringBuilder sbT = e0.f.t("IconButtonGeometry(height=", strD, ", width=", strD2, ", cornerRadius=");
        s.A(sbT, strD3, ", iconSize=", strD4, ", spinnerSize=");
        sbT.append(this.spinnerSize);
        sbT.append(", focusRingBorderSize=");
        sbT.append(strD5);
        sbT.append(", focusRingPadding=");
        return k.p(sbT, strD6, ")");
    }
}
