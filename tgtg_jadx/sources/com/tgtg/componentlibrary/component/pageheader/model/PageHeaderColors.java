package com.tgtg.componentlibrary.component.pageheader.model;

import com.braze.Constants;
import e0.f;
import i4.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\n¨\u0006("}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderColors;", "", "Li4/v;", "backgroundColor", "titleColor", "supportingTextColor", "iconColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "copy-jRlVdoo", "(JJJJ)Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getBackgroundColor-0d7_KjU", "b", "getTitleColor-0d7_KjU", "c", "getSupportingTextColor-0d7_KjU", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getIconColor-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PageHeaderColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long titleColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long supportingTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long iconColor;

    public PageHeaderColors(long j9, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this.backgroundColor = j9;
        this.titleColor = j11;
        this.supportingTextColor = j12;
        this.iconColor = j13;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ PageHeaderColors m885copyjRlVdoo$default(PageHeaderColors pageHeaderColors, long j9, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = pageHeaderColors.backgroundColor;
        }
        long j14 = j9;
        if ((i11 & 2) != 0) {
            j11 = pageHeaderColors.titleColor;
        }
        long j15 = j11;
        if ((i11 & 4) != 0) {
            j12 = pageHeaderColors.supportingTextColor;
        }
        return pageHeaderColors.m890copyjRlVdoo(j14, j15, j12, (i11 & 8) != 0 ? pageHeaderColors.iconColor : j13);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getSupportingTextColor() {
        return this.supportingTextColor;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final PageHeaderColors m890copyjRlVdoo(long backgroundColor, long titleColor, long supportingTextColor, long iconColor) {
        return new PageHeaderColors(backgroundColor, titleColor, supportingTextColor, iconColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageHeaderColors)) {
            return false;
        }
        PageHeaderColors pageHeaderColors = (PageHeaderColors) other;
        return v.c(this.backgroundColor, pageHeaderColors.backgroundColor) && v.c(this.titleColor, pageHeaderColors.titleColor) && v.c(this.supportingTextColor, pageHeaderColors.supportingTextColor) && v.c(this.iconColor, pageHeaderColors.iconColor);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m891getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m892getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: getSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m893getSupportingTextColor0d7_KjU() {
        return this.supportingTextColor;
    }

    /* JADX INFO: renamed from: getTitleColor-0d7_KjU, reason: not valid java name */
    public final long m894getTitleColor0d7_KjU() {
        return this.titleColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.iconColor) + f.b(f.b(Long.hashCode(this.backgroundColor) * 31, 31, this.titleColor), 31, this.supportingTextColor);
    }

    @NotNull
    public String toString() {
        String strI = v.i(this.backgroundColor);
        String strI2 = v.i(this.titleColor);
        return f.o(f.t("PageHeaderColors(backgroundColor=", strI, ", titleColor=", strI2, ", supportingTextColor="), v.i(this.supportingTextColor), ", iconColor=", v.i(this.iconColor), ")");
    }
}
