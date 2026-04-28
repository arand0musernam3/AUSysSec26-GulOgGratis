package com.tgtg.componentlibrary.component.p000switch.model;

import com.braze.Constants;
import i4.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o4.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010¨\u0006'"}, d2 = {"Lcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;", "", "Li4/v0;", "thumbShape", "Lz5/f;", "thumbDiameter", "Lo4/d;", "thumbShadow", "<init>", "(Li4/v0;FLo4/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Li4/v0;", "component2-D9Ej5fM", "()F", "component2", "component3", "()Lo4/d;", "copy-lG28NQ4", "(Li4/v0;FLo4/d;)Lcom/tgtg/componentlibrary/component/switch/model/ThumbGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "Li4/v0;", "getThumbShape", "b", "F", "getThumbDiameter-D9Ej5fM", "c", "Lo4/d;", "getThumbShadow", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ThumbGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final v0 thumbShape;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float thumbDiameter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final d thumbShadow;

    public ThumbGeometry(v0 v0Var, float f11, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        v0Var.getClass();
        dVar.getClass();
        this.thumbShape = v0Var;
        this.thumbDiameter = f11;
        this.thumbShadow = dVar;
    }

    /* JADX INFO: renamed from: copy-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ ThumbGeometry m950copylG28NQ4$default(ThumbGeometry thumbGeometry, v0 v0Var, float f11, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            v0Var = thumbGeometry.thumbShape;
        }
        if ((i11 & 2) != 0) {
            f11 = thumbGeometry.thumbDiameter;
        }
        if ((i11 & 4) != 0) {
            dVar = thumbGeometry.thumbShadow;
        }
        return thumbGeometry.m952copylG28NQ4(v0Var, f11, dVar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final v0 getThumbShape() {
        return this.thumbShape;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getThumbDiameter() {
        return this.thumbDiameter;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final d getThumbShadow() {
        return this.thumbShadow;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-lG28NQ4, reason: not valid java name */
    public final ThumbGeometry m952copylG28NQ4(@NotNull v0 thumbShape, float thumbDiameter, @NotNull d thumbShadow) {
        thumbShape.getClass();
        thumbShadow.getClass();
        return new ThumbGeometry(thumbShape, thumbDiameter, thumbShadow, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbGeometry)) {
            return false;
        }
        ThumbGeometry thumbGeometry = (ThumbGeometry) other;
        return Intrinsics.areEqual(this.thumbShape, thumbGeometry.thumbShape) && f.c(this.thumbDiameter, thumbGeometry.thumbDiameter) && Intrinsics.areEqual(this.thumbShadow, thumbGeometry.thumbShadow);
    }

    /* JADX INFO: renamed from: getThumbDiameter-D9Ej5fM, reason: not valid java name */
    public final float m953getThumbDiameterD9Ej5fM() {
        return this.thumbDiameter;
    }

    @NotNull
    public final d getThumbShadow() {
        return this.thumbShadow;
    }

    @NotNull
    public final v0 getThumbShape() {
        return this.thumbShape;
    }

    public int hashCode() {
        return this.thumbShadow.hashCode() + k.a(this.thumbShape.hashCode() * 31, this.thumbDiameter, 31);
    }

    @NotNull
    public String toString() {
        return "ThumbGeometry(thumbShape=" + this.thumbShape + ", thumbDiameter=" + f.d(this.thumbDiameter) + ", thumbShadow=" + this.thumbShadow + ")";
    }
}
