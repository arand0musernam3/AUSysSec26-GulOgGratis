package com.tgtg.componentlibrary.component.radiobutton.model;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000b¨\u0006-"}, d2 = {"Lcom/tgtg/componentlibrary/component/radiobutton/model/RadioButtonGeometry;", "", "Lz5/f;", "radioButtonDiameter", "radioButtonBorderSize", "radioButtonBorderPadding", "radioButtonBorderSizeDisabled", "radioButtonCheckSize", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "copy-RyVG9vg", "(FFFFF)Lcom/tgtg/componentlibrary/component/radiobutton/model/RadioButtonGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getRadioButtonDiameter-D9Ej5fM", "b", "getRadioButtonBorderSize-D9Ej5fM", "c", "getRadioButtonBorderPadding-D9Ej5fM", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getRadioButtonBorderSizeDisabled-D9Ej5fM", "e", "getRadioButtonCheckSize-D9Ej5fM", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RadioButtonGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float radioButtonDiameter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float radioButtonBorderSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float radioButtonBorderPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float radioButtonBorderSizeDisabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float radioButtonCheckSize;

    public RadioButtonGeometry(float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this.radioButtonDiameter = f11;
        this.radioButtonBorderSize = f12;
        this.radioButtonBorderPadding = f13;
        this.radioButtonBorderSizeDisabled = f14;
        this.radioButtonCheckSize = f15;
    }

    /* JADX INFO: renamed from: copy-RyVG9vg$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonGeometry m927copyRyVG9vg$default(RadioButtonGeometry radioButtonGeometry, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = radioButtonGeometry.radioButtonDiameter;
        }
        if ((i11 & 2) != 0) {
            f12 = radioButtonGeometry.radioButtonBorderSize;
        }
        if ((i11 & 4) != 0) {
            f13 = radioButtonGeometry.radioButtonBorderPadding;
        }
        if ((i11 & 8) != 0) {
            f14 = radioButtonGeometry.radioButtonBorderSizeDisabled;
        }
        if ((i11 & 16) != 0) {
            f15 = radioButtonGeometry.radioButtonCheckSize;
        }
        float f16 = f15;
        float f17 = f13;
        return radioButtonGeometry.m933copyRyVG9vg(f11, f12, f17, f14, f16);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadioButtonDiameter() {
        return this.radioButtonDiameter;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadioButtonBorderSize() {
        return this.radioButtonBorderSize;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadioButtonBorderPadding() {
        return this.radioButtonBorderPadding;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadioButtonBorderSizeDisabled() {
        return this.radioButtonBorderSizeDisabled;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadioButtonCheckSize() {
        return this.radioButtonCheckSize;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RyVG9vg, reason: not valid java name */
    public final RadioButtonGeometry m933copyRyVG9vg(float radioButtonDiameter, float radioButtonBorderSize, float radioButtonBorderPadding, float radioButtonBorderSizeDisabled, float radioButtonCheckSize) {
        return new RadioButtonGeometry(radioButtonDiameter, radioButtonBorderSize, radioButtonBorderPadding, radioButtonBorderSizeDisabled, radioButtonCheckSize, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioButtonGeometry)) {
            return false;
        }
        RadioButtonGeometry radioButtonGeometry = (RadioButtonGeometry) other;
        return f.c(this.radioButtonDiameter, radioButtonGeometry.radioButtonDiameter) && f.c(this.radioButtonBorderSize, radioButtonGeometry.radioButtonBorderSize) && f.c(this.radioButtonBorderPadding, radioButtonGeometry.radioButtonBorderPadding) && f.c(this.radioButtonBorderSizeDisabled, radioButtonGeometry.radioButtonBorderSizeDisabled) && f.c(this.radioButtonCheckSize, radioButtonGeometry.radioButtonCheckSize);
    }

    /* JADX INFO: renamed from: getRadioButtonBorderPadding-D9Ej5fM, reason: not valid java name */
    public final float m934getRadioButtonBorderPaddingD9Ej5fM() {
        return this.radioButtonBorderPadding;
    }

    /* JADX INFO: renamed from: getRadioButtonBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m935getRadioButtonBorderSizeD9Ej5fM() {
        return this.radioButtonBorderSize;
    }

    /* JADX INFO: renamed from: getRadioButtonBorderSizeDisabled-D9Ej5fM, reason: not valid java name */
    public final float m936getRadioButtonBorderSizeDisabledD9Ej5fM() {
        return this.radioButtonBorderSizeDisabled;
    }

    /* JADX INFO: renamed from: getRadioButtonCheckSize-D9Ej5fM, reason: not valid java name */
    public final float m937getRadioButtonCheckSizeD9Ej5fM() {
        return this.radioButtonCheckSize;
    }

    /* JADX INFO: renamed from: getRadioButtonDiameter-D9Ej5fM, reason: not valid java name */
    public final float m938getRadioButtonDiameterD9Ej5fM() {
        return this.radioButtonDiameter;
    }

    public int hashCode() {
        return Float.hashCode(this.radioButtonCheckSize) + k.a(k.a(k.a(Float.hashCode(this.radioButtonDiameter) * 31, this.radioButtonBorderSize, 31), this.radioButtonBorderPadding, 31), this.radioButtonBorderSizeDisabled, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.radioButtonDiameter);
        String strD2 = f.d(this.radioButtonBorderSize);
        String strD3 = f.d(this.radioButtonBorderPadding);
        String strD4 = f.d(this.radioButtonBorderSizeDisabled);
        String strD5 = f.d(this.radioButtonCheckSize);
        StringBuilder sbT = e0.f.t("RadioButtonGeometry(radioButtonDiameter=", strD, ", radioButtonBorderSize=", strD2, ", radioButtonBorderPadding=");
        s.A(sbT, strD3, ", radioButtonBorderSizeDisabled=", strD4, ", radioButtonCheckSize=");
        return k.p(sbT, strD5, ")");
    }
}
