package com.tgtg.componentlibrary.component.chip.model;

import com.braze.Constants;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m5.u0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001aJ\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001aJ\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001aJ\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001aJ\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001aJ\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\u001aJ\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010\u001aJ\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\u001aJ\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010\u001aJ\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010?JÐ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\bR\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\bV\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\bX\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010O\u001a\u0004\b\\\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010)R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010O\u001a\u0004\ba\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010O\u001a\u0004\bc\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010O\u001a\u0004\be\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010O\u001a\u0004\bg\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010O\u001a\u0004\bi\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010O\u001a\u0004\bk\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010O\u001a\u0004\bo\u0010\u001aR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010O\u001a\u0004\bq\u0010\u001aR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010O\u001a\u0004\bs\u0010\u001aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010?¨\u0006w"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/model/ChipGeometry;", "", "Lz5/f;", "minWidth", "minWidthWithAvatar", "minHeight", "horizontalPadding", "verticalPadding", "gap", "cornerRadius", "Lm5/u0;", "textStyle", "iconSize", "avatarRightPadding", "startPaddingWithAvatar", "endPaddingWithAvatar", "topPaddingWithAvatar", "bottomPaddingWithAvatar", "borderSize", "borderSizeSelected", "focusRingBorderSize", "focusRingPadding", "closeIconSize", "<init>", "(FFFFFFFLm5/u0;FFFFFFFFFFLz5/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8", "()Lm5/u0;", "component9-D9Ej5fM", "component9", "component10-D9Ej5fM", "component10", "component11-D9Ej5fM", "component11", "component12-D9Ej5fM", "component12", "component13-D9Ej5fM", "component13", "component14-D9Ej5fM", "component14", "component15-D9Ej5fM", "component15", "component16-D9Ej5fM", "component16", "component17-D9Ej5fM", "component17", "component18-D9Ej5fM", "component18", "component19-lTKBWiU", "()Lz5/f;", "component19", "copy-Sj8uilk", "(FFFFFFFLm5/u0;FFFFFFFFFFLz5/f;)Lcom/tgtg/componentlibrary/component/chip/model/ChipGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "F", "getMinWidth-D9Ej5fM", "b", "getMinWidthWithAvatar-D9Ej5fM", "c", "getMinHeight-D9Ej5fM", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getHorizontalPadding-D9Ej5fM", "e", "getVerticalPadding-D9Ej5fM", "f", "getGap-D9Ej5fM", "g", "getCornerRadius-D9Ej5fM", "h", "Lm5/u0;", "getTextStyle", "i", "getIconSize-D9Ej5fM", "j", "getAvatarRightPadding-D9Ej5fM", "k", "getStartPaddingWithAvatar-D9Ej5fM", "l", "getEndPaddingWithAvatar-D9Ej5fM", "m", "getTopPaddingWithAvatar-D9Ej5fM", Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, "getBottomPaddingWithAvatar-D9Ej5fM", "o", "getBorderSize-D9Ej5fM", Constants.BRAZE_PUSH_PRIORITY_KEY, "getBorderSizeSelected-D9Ej5fM", "q", "getFocusRingBorderSize-D9Ej5fM", "r", "getFocusRingPadding-D9Ej5fM", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lz5/f;", "getCloseIconSize-lTKBWiU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ChipGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float minWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float minWidthWithAvatar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float minHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float horizontalPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float verticalPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float gap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final u0 textStyle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final float iconSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final float avatarRightPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final float startPaddingWithAvatar;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final float endPaddingWithAvatar;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final float topPaddingWithAvatar;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final float bottomPaddingWithAvatar;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final float borderSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final float borderSizeSelected;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final float focusRingBorderSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final float focusRingPadding;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final f closeIconSize;

    public /* synthetic */ ChipGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, u0 u0Var, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15, f16, f17, u0Var, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, (i11 & 262144) != 0 ? null : fVar, null);
    }

    /* JADX INFO: renamed from: copy-Sj8uilk$default, reason: not valid java name */
    public static /* synthetic */ ChipGeometry m751copySj8uilk$default(ChipGeometry chipGeometry, float f11, float f12, float f13, float f14, float f15, float f16, float f17, u0 u0Var, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, f fVar, int i11, Object obj) {
        f fVar2;
        float f28;
        float f29 = (i11 & 1) != 0 ? chipGeometry.minWidth : f11;
        float f31 = (i11 & 2) != 0 ? chipGeometry.minWidthWithAvatar : f12;
        float f32 = (i11 & 4) != 0 ? chipGeometry.minHeight : f13;
        float f33 = (i11 & 8) != 0 ? chipGeometry.horizontalPadding : f14;
        float f34 = (i11 & 16) != 0 ? chipGeometry.verticalPadding : f15;
        float f35 = (i11 & 32) != 0 ? chipGeometry.gap : f16;
        float f36 = (i11 & 64) != 0 ? chipGeometry.cornerRadius : f17;
        u0 u0Var2 = (i11 & 128) != 0 ? chipGeometry.textStyle : u0Var;
        float f37 = (i11 & 256) != 0 ? chipGeometry.iconSize : f18;
        float f38 = (i11 & 512) != 0 ? chipGeometry.avatarRightPadding : f19;
        float f39 = (i11 & 1024) != 0 ? chipGeometry.startPaddingWithAvatar : f20;
        float f40 = (i11 & NewHope.SENDB_BYTES) != 0 ? chipGeometry.endPaddingWithAvatar : f21;
        float f41 = (i11 & 4096) != 0 ? chipGeometry.topPaddingWithAvatar : f22;
        float f42 = (i11 & 8192) != 0 ? chipGeometry.bottomPaddingWithAvatar : f23;
        float f43 = f29;
        float f44 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? chipGeometry.borderSize : f24;
        float f45 = (i11 & 32768) != 0 ? chipGeometry.borderSizeSelected : f25;
        float f46 = (i11 & 65536) != 0 ? chipGeometry.focusRingBorderSize : f26;
        float f47 = (i11 & 131072) != 0 ? chipGeometry.focusRingPadding : f27;
        if ((i11 & 262144) != 0) {
            f28 = f47;
            fVar2 = chipGeometry.closeIconSize;
        } else {
            fVar2 = fVar;
            f28 = f47;
        }
        return chipGeometry.m770copySj8uilk(f43, f31, f32, f33, f34, f35, f36, u0Var2, f37, f38, f39, f40, f41, f42, f44, f45, f46, f28, fVar2);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: component10-D9Ej5fM, reason: not valid java name and from getter */
    public final float getAvatarRightPadding() {
        return this.avatarRightPadding;
    }

    /* JADX INFO: renamed from: component11-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartPaddingWithAvatar() {
        return this.startPaddingWithAvatar;
    }

    /* JADX INFO: renamed from: component12-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndPaddingWithAvatar() {
        return this.endPaddingWithAvatar;
    }

    /* JADX INFO: renamed from: component13-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopPaddingWithAvatar() {
        return this.topPaddingWithAvatar;
    }

    /* JADX INFO: renamed from: component14-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomPaddingWithAvatar() {
        return this.bottomPaddingWithAvatar;
    }

    /* JADX INFO: renamed from: component15-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderSize() {
        return this.borderSize;
    }

    /* JADX INFO: renamed from: component16-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderSizeSelected() {
        return this.borderSizeSelected;
    }

    /* JADX INFO: renamed from: component17-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingBorderSize() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: component18-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFocusRingPadding() {
        return this.focusRingPadding;
    }

    @Nullable
    /* JADX INFO: renamed from: component19-lTKBWiU, reason: not valid java name and from getter */
    public final f getCloseIconSize() {
        return this.closeIconSize;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidthWithAvatar() {
        return this.minWidthWithAvatar;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getGap() {
        return this.gap;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final u0 getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: component9-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Sj8uilk, reason: not valid java name */
    public final ChipGeometry m770copySj8uilk(float minWidth, float minWidthWithAvatar, float minHeight, float horizontalPadding, float verticalPadding, float gap, float cornerRadius, @NotNull u0 textStyle, float iconSize, float avatarRightPadding, float startPaddingWithAvatar, float endPaddingWithAvatar, float topPaddingWithAvatar, float bottomPaddingWithAvatar, float borderSize, float borderSizeSelected, float focusRingBorderSize, float focusRingPadding, @Nullable f closeIconSize) {
        textStyle.getClass();
        return new ChipGeometry(minWidth, minWidthWithAvatar, minHeight, horizontalPadding, verticalPadding, gap, cornerRadius, textStyle, iconSize, avatarRightPadding, startPaddingWithAvatar, endPaddingWithAvatar, topPaddingWithAvatar, bottomPaddingWithAvatar, borderSize, borderSizeSelected, focusRingBorderSize, focusRingPadding, closeIconSize, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipGeometry)) {
            return false;
        }
        ChipGeometry chipGeometry = (ChipGeometry) other;
        return f.c(this.minWidth, chipGeometry.minWidth) && f.c(this.minWidthWithAvatar, chipGeometry.minWidthWithAvatar) && f.c(this.minHeight, chipGeometry.minHeight) && f.c(this.horizontalPadding, chipGeometry.horizontalPadding) && f.c(this.verticalPadding, chipGeometry.verticalPadding) && f.c(this.gap, chipGeometry.gap) && f.c(this.cornerRadius, chipGeometry.cornerRadius) && Intrinsics.areEqual(this.textStyle, chipGeometry.textStyle) && f.c(this.iconSize, chipGeometry.iconSize) && f.c(this.avatarRightPadding, chipGeometry.avatarRightPadding) && f.c(this.startPaddingWithAvatar, chipGeometry.startPaddingWithAvatar) && f.c(this.endPaddingWithAvatar, chipGeometry.endPaddingWithAvatar) && f.c(this.topPaddingWithAvatar, chipGeometry.topPaddingWithAvatar) && f.c(this.bottomPaddingWithAvatar, chipGeometry.bottomPaddingWithAvatar) && f.c(this.borderSize, chipGeometry.borderSize) && f.c(this.borderSizeSelected, chipGeometry.borderSizeSelected) && f.c(this.focusRingBorderSize, chipGeometry.focusRingBorderSize) && f.c(this.focusRingPadding, chipGeometry.focusRingPadding) && Intrinsics.areEqual(this.closeIconSize, chipGeometry.closeIconSize);
    }

    /* JADX INFO: renamed from: getAvatarRightPadding-D9Ej5fM, reason: not valid java name */
    public final float m771getAvatarRightPaddingD9Ej5fM() {
        return this.avatarRightPadding;
    }

    /* JADX INFO: renamed from: getBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m772getBorderSizeD9Ej5fM() {
        return this.borderSize;
    }

    /* JADX INFO: renamed from: getBorderSizeSelected-D9Ej5fM, reason: not valid java name */
    public final float m773getBorderSizeSelectedD9Ej5fM() {
        return this.borderSizeSelected;
    }

    /* JADX INFO: renamed from: getBottomPaddingWithAvatar-D9Ej5fM, reason: not valid java name */
    public final float m774getBottomPaddingWithAvatarD9Ej5fM() {
        return this.bottomPaddingWithAvatar;
    }

    @Nullable
    /* JADX INFO: renamed from: getCloseIconSize-lTKBWiU, reason: not valid java name */
    public final f m775getCloseIconSizelTKBWiU() {
        return this.closeIconSize;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m776getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getEndPaddingWithAvatar-D9Ej5fM, reason: not valid java name */
    public final float m777getEndPaddingWithAvatarD9Ej5fM() {
        return this.endPaddingWithAvatar;
    }

    /* JADX INFO: renamed from: getFocusRingBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m778getFocusRingBorderSizeD9Ej5fM() {
        return this.focusRingBorderSize;
    }

    /* JADX INFO: renamed from: getFocusRingPadding-D9Ej5fM, reason: not valid java name */
    public final float m779getFocusRingPaddingD9Ej5fM() {
        return this.focusRingPadding;
    }

    /* JADX INFO: renamed from: getGap-D9Ej5fM, reason: not valid java name */
    public final float m780getGapD9Ej5fM() {
        return this.gap;
    }

    /* JADX INFO: renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m781getHorizontalPaddingD9Ej5fM() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m782getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m783getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m784getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: getMinWidthWithAvatar-D9Ej5fM, reason: not valid java name */
    public final float m785getMinWidthWithAvatarD9Ej5fM() {
        return this.minWidthWithAvatar;
    }

    /* JADX INFO: renamed from: getStartPaddingWithAvatar-D9Ej5fM, reason: not valid java name */
    public final float m786getStartPaddingWithAvatarD9Ej5fM() {
        return this.startPaddingWithAvatar;
    }

    @NotNull
    public final u0 getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: getTopPaddingWithAvatar-D9Ej5fM, reason: not valid java name */
    public final float m787getTopPaddingWithAvatarD9Ej5fM() {
        return this.topPaddingWithAvatar;
    }

    /* JADX INFO: renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m788getVerticalPaddingD9Ej5fM() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int iA = k.a(k.a(k.a(k.a(k.a(k.a(k.a(k.a(k.a(k.a(l1.c(k.a(k.a(k.a(k.a(k.a(k.a(Float.hashCode(this.minWidth) * 31, this.minWidthWithAvatar, 31), this.minHeight, 31), this.horizontalPadding, 31), this.verticalPadding, 31), this.gap, 31), this.cornerRadius, 31), 31, this.textStyle), this.iconSize, 31), this.avatarRightPadding, 31), this.startPaddingWithAvatar, 31), this.endPaddingWithAvatar, 31), this.topPaddingWithAvatar, 31), this.bottomPaddingWithAvatar, 31), this.borderSize, 31), this.borderSizeSelected, 31), this.focusRingBorderSize, 31), this.focusRingPadding, 31);
        f fVar = this.closeIconSize;
        return iA + (fVar == null ? 0 : Float.hashCode(fVar.f47277a));
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.minWidth);
        String strD2 = f.d(this.minWidthWithAvatar);
        String strD3 = f.d(this.minHeight);
        String strD4 = f.d(this.horizontalPadding);
        String strD5 = f.d(this.verticalPadding);
        String strD6 = f.d(this.gap);
        String strD7 = f.d(this.cornerRadius);
        String strD8 = f.d(this.iconSize);
        String strD9 = f.d(this.avatarRightPadding);
        String strD10 = f.d(this.startPaddingWithAvatar);
        String strD11 = f.d(this.endPaddingWithAvatar);
        String strD12 = f.d(this.topPaddingWithAvatar);
        String strD13 = f.d(this.bottomPaddingWithAvatar);
        String strD14 = f.d(this.borderSize);
        String strD15 = f.d(this.borderSizeSelected);
        String strD16 = f.d(this.focusRingBorderSize);
        String strD17 = f.d(this.focusRingPadding);
        StringBuilder sbT = e0.f.t("ChipGeometry(minWidth=", strD, ", minWidthWithAvatar=", strD2, ", minHeight=");
        s.A(sbT, strD3, ", horizontalPadding=", strD4, ", verticalPadding=");
        s.A(sbT, strD5, ", gap=", strD6, ", cornerRadius=");
        sbT.append(strD7);
        sbT.append(", textStyle=");
        sbT.append(this.textStyle);
        sbT.append(", iconSize=");
        s.A(sbT, strD8, ", avatarRightPadding=", strD9, ", startPaddingWithAvatar=");
        s.A(sbT, strD10, ", endPaddingWithAvatar=", strD11, ", topPaddingWithAvatar=");
        s.A(sbT, strD12, ", bottomPaddingWithAvatar=", strD13, ", borderSize=");
        s.A(sbT, strD14, ", borderSizeSelected=", strD15, ", focusRingBorderSize=");
        s.A(sbT, strD16, ", focusRingPadding=", strD17, ", closeIconSize=");
        sbT.append(this.closeIconSize);
        sbT.append(")");
        return sbT.toString();
    }

    public ChipGeometry(float f11, float f12, float f13, float f14, float f15, float f16, float f17, u0 u0Var, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        u0Var.getClass();
        this.minWidth = f11;
        this.minWidthWithAvatar = f12;
        this.minHeight = f13;
        this.horizontalPadding = f14;
        this.verticalPadding = f15;
        this.gap = f16;
        this.cornerRadius = f17;
        this.textStyle = u0Var;
        this.iconSize = f18;
        this.avatarRightPadding = f19;
        this.startPaddingWithAvatar = f20;
        this.endPaddingWithAvatar = f21;
        this.topPaddingWithAvatar = f22;
        this.bottomPaddingWithAvatar = f23;
        this.borderSize = f24;
        this.borderSizeSelected = f25;
        this.focusRingBorderSize = f26;
        this.focusRingPadding = f27;
        this.closeIconSize = fVar;
    }
}
