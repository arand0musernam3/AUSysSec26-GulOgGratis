package com.tgtg.componentlibrary.component.chip.impl;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m3.c3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/impl/ChipAnimations;", "", "Lm3/c3;", "Li4/v;", "containerColor", "contentColor", "borderColor", "<init>", "(Lm3/c3;Lm3/c3;Lm3/c3;)V", "component1", "()Lm3/c3;", "component2", "component3", "copy", "(Lm3/c3;Lm3/c3;Lm3/c3;)Lcom/tgtg/componentlibrary/component/chip/impl/ChipAnimations;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "Lm3/c3;", "getContainerColor", "b", "getContentColor", "c", "getBorderColor", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ChipAnimations {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final c3 containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final c3 contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final c3 borderColor;

    public ChipAnimations(@NotNull c3 c3Var, @NotNull c3 c3Var2, @NotNull c3 c3Var3) {
        c3Var.getClass();
        c3Var2.getClass();
        c3Var3.getClass();
        this.containerColor = c3Var;
        this.contentColor = c3Var2;
        this.borderColor = c3Var3;
    }

    public static /* synthetic */ ChipAnimations copy$default(ChipAnimations chipAnimations, c3 c3Var, c3 c3Var2, c3 c3Var3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c3Var = chipAnimations.containerColor;
        }
        if ((i11 & 2) != 0) {
            c3Var2 = chipAnimations.contentColor;
        }
        if ((i11 & 4) != 0) {
            c3Var3 = chipAnimations.borderColor;
        }
        return chipAnimations.copy(c3Var, c3Var2, c3Var3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final c3 getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final c3 getContentColor() {
        return this.contentColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final c3 getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final ChipAnimations copy(@NotNull c3 containerColor, @NotNull c3 contentColor, @NotNull c3 borderColor) {
        containerColor.getClass();
        contentColor.getClass();
        borderColor.getClass();
        return new ChipAnimations(containerColor, contentColor, borderColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipAnimations)) {
            return false;
        }
        ChipAnimations chipAnimations = (ChipAnimations) other;
        return Intrinsics.areEqual(this.containerColor, chipAnimations.containerColor) && Intrinsics.areEqual(this.contentColor, chipAnimations.contentColor) && Intrinsics.areEqual(this.borderColor, chipAnimations.borderColor);
    }

    @NotNull
    public final c3 getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final c3 getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final c3 getContentColor() {
        return this.contentColor;
    }

    public int hashCode() {
        return this.borderColor.hashCode() + ((this.contentColor.hashCode() + (this.containerColor.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ChipAnimations(containerColor=" + this.containerColor + ", contentColor=" + this.contentColor + ", borderColor=" + this.borderColor + ")";
    }
}
