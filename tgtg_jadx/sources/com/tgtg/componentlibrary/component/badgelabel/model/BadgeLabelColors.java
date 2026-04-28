package com.tgtg.componentlibrary.component.badgelabel.model;

import com.braze.Constants;
import e0.f;
import i4.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\t¨\u0006#"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelColors;", "", "Li4/v;", "containerColor", "contentColor", "borderColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getContainerColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getBorderColor-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BadgeLabelColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long borderColor;

    public BadgeLabelColors(long j9, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this.containerColor = j9;
        this.contentColor = j11;
        this.borderColor = j12;
    }

    /* JADX INFO: renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ BadgeLabelColors m577copyysEtTa8$default(BadgeLabelColors badgeLabelColors, long j9, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = badgeLabelColors.containerColor;
        }
        long j13 = j9;
        if ((i11 & 2) != 0) {
            j11 = badgeLabelColors.contentColor;
        }
        long j14 = j11;
        if ((i11 & 4) != 0) {
            j12 = badgeLabelColors.borderColor;
        }
        return badgeLabelColors.m581copyysEtTa8(j13, j14, j12);
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
    public final long getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ysEtTa8, reason: not valid java name */
    public final BadgeLabelColors m581copyysEtTa8(long containerColor, long contentColor, long borderColor) {
        return new BadgeLabelColors(containerColor, contentColor, borderColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeLabelColors)) {
            return false;
        }
        BadgeLabelColors badgeLabelColors = (BadgeLabelColors) other;
        return v.c(this.containerColor, badgeLabelColors.containerColor) && v.c(this.contentColor, badgeLabelColors.contentColor) && v.c(this.borderColor, badgeLabelColors.borderColor);
    }

    /* JADX INFO: renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
    public final long m582getBorderColor0d7_KjU() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m583getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m584getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.borderColor) + f.b(Long.hashCode(this.containerColor) * 31, 31, this.contentColor);
    }

    @NotNull
    public String toString() {
        String strI = v.i(this.containerColor);
        String strI2 = v.i(this.contentColor);
        return k.p(f.t("BadgeLabelColors(containerColor=", strI, ", contentColor=", strI2, ", borderColor="), v.i(this.borderColor), ")");
    }
}
