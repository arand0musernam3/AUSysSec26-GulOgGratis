package com.tgtg.componentlibrary.component.p000switch.model;

import com.braze.Constants;
import i4.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "", "Lz5/f;", "trackWidth", "trackHeight", "Li4/v0;", "trackShape", "trackOutlineWidth", "trackOutlinePadding", "Lcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;", "thumbGeometry", "<init>", "(FFLi4/v0;FFLcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3", "()Li4/v0;", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6", "()Lcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;", "copy-jIPmgWI", "(FFLi4/v0;FFLcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;)Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getTrackWidth-D9Ej5fM", "b", "getTrackHeight-D9Ej5fM", "c", "Li4/v0;", "getTrackShape", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getTrackOutlineWidth-D9Ej5fM", "e", "getTrackOutlinePadding-D9Ej5fM", "f", "Lcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;", "getThumbGeometry", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SwitchGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float trackWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float trackHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final v0 trackShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float trackOutlineWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float trackOutlinePadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final ThumbGeometry thumbGeometry;

    public SwitchGeometry(float f11, float f12, v0 v0Var, float f13, float f14, ThumbGeometry thumbGeometry, DefaultConstructorMarker defaultConstructorMarker) {
        v0Var.getClass();
        thumbGeometry.getClass();
        this.trackWidth = f11;
        this.trackHeight = f12;
        this.trackShape = v0Var;
        this.trackOutlineWidth = f13;
        this.trackOutlinePadding = f14;
        this.thumbGeometry = thumbGeometry;
    }

    /* JADX INFO: renamed from: copy-jIPmgWI$default, reason: not valid java name */
    public static /* synthetic */ SwitchGeometry m940copyjIPmgWI$default(SwitchGeometry switchGeometry, float f11, float f12, v0 v0Var, float f13, float f14, ThumbGeometry thumbGeometry, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = switchGeometry.trackWidth;
        }
        if ((i11 & 2) != 0) {
            f12 = switchGeometry.trackHeight;
        }
        if ((i11 & 4) != 0) {
            v0Var = switchGeometry.trackShape;
        }
        if ((i11 & 8) != 0) {
            f13 = switchGeometry.trackOutlineWidth;
        }
        if ((i11 & 16) != 0) {
            f14 = switchGeometry.trackOutlinePadding;
        }
        if ((i11 & 32) != 0) {
            thumbGeometry = switchGeometry.thumbGeometry;
        }
        float f15 = f14;
        ThumbGeometry thumbGeometry2 = thumbGeometry;
        return switchGeometry.m945copyjIPmgWI(f11, f12, v0Var, f13, f15, thumbGeometry2);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTrackWidth() {
        return this.trackWidth;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTrackHeight() {
        return this.trackHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final v0 getTrackShape() {
        return this.trackShape;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTrackOutlineWidth() {
        return this.trackOutlineWidth;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTrackOutlinePadding() {
        return this.trackOutlinePadding;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ThumbGeometry getThumbGeometry() {
        return this.thumbGeometry;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-jIPmgWI, reason: not valid java name */
    public final SwitchGeometry m945copyjIPmgWI(float trackWidth, float trackHeight, @NotNull v0 trackShape, float trackOutlineWidth, float trackOutlinePadding, @NotNull ThumbGeometry thumbGeometry) {
        trackShape.getClass();
        thumbGeometry.getClass();
        return new SwitchGeometry(trackWidth, trackHeight, trackShape, trackOutlineWidth, trackOutlinePadding, thumbGeometry, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchGeometry)) {
            return false;
        }
        SwitchGeometry switchGeometry = (SwitchGeometry) other;
        return f.c(this.trackWidth, switchGeometry.trackWidth) && f.c(this.trackHeight, switchGeometry.trackHeight) && Intrinsics.areEqual(this.trackShape, switchGeometry.trackShape) && f.c(this.trackOutlineWidth, switchGeometry.trackOutlineWidth) && f.c(this.trackOutlinePadding, switchGeometry.trackOutlinePadding) && Intrinsics.areEqual(this.thumbGeometry, switchGeometry.thumbGeometry);
    }

    @NotNull
    public final ThumbGeometry getThumbGeometry() {
        return this.thumbGeometry;
    }

    /* JADX INFO: renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m946getTrackHeightD9Ej5fM() {
        return this.trackHeight;
    }

    /* JADX INFO: renamed from: getTrackOutlinePadding-D9Ej5fM, reason: not valid java name */
    public final float m947getTrackOutlinePaddingD9Ej5fM() {
        return this.trackOutlinePadding;
    }

    /* JADX INFO: renamed from: getTrackOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m948getTrackOutlineWidthD9Ej5fM() {
        return this.trackOutlineWidth;
    }

    @NotNull
    public final v0 getTrackShape() {
        return this.trackShape;
    }

    /* JADX INFO: renamed from: getTrackWidth-D9Ej5fM, reason: not valid java name */
    public final float m949getTrackWidthD9Ej5fM() {
        return this.trackWidth;
    }

    public int hashCode() {
        return this.thumbGeometry.hashCode() + k.a(k.a((this.trackShape.hashCode() + k.a(Float.hashCode(this.trackWidth) * 31, this.trackHeight, 31)) * 31, this.trackOutlineWidth, 31), this.trackOutlinePadding, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.trackWidth);
        String strD2 = f.d(this.trackHeight);
        String strD3 = f.d(this.trackOutlineWidth);
        String strD4 = f.d(this.trackOutlinePadding);
        StringBuilder sbT = e0.f.t("SwitchGeometry(trackWidth=", strD, ", trackHeight=", strD2, ", trackShape=");
        sbT.append(this.trackShape);
        sbT.append(", trackOutlineWidth=");
        sbT.append(strD3);
        sbT.append(", trackOutlinePadding=");
        sbT.append(strD4);
        sbT.append(", thumbGeometry=");
        sbT.append(this.thumbGeometry);
        sbT.append(")");
        return sbT.toString();
    }
}
