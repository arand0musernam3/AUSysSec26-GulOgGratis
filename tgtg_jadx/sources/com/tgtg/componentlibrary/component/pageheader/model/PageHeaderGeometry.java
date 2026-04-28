package com.tgtg.componentlibrary.component.pageheader.model;

import com.braze.Constants;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m5.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010\u0013¨\u0006<"}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderGeometry;", "", "Lm5/u0;", "titleStyle", "subtitleStyle", "collapsedTitleStyle", "Lz5/f;", "iconSize", "titleTopPadding", "subtitleTopPadding", "tabsTopPadding", "trailingContentSpacedBy", "<init>", "(Lm5/u0;Lm5/u0;Lm5/u0;FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lm5/u0;", "component2", "component3", "component4-D9Ej5fM", "()F", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8-D9Ej5fM", "component8", "copy-LvyflJE", "(Lm5/u0;Lm5/u0;Lm5/u0;FFFFF)Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderGeometry;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "Lm5/u0;", "getTitleStyle", "b", "getSubtitleStyle", "c", "getCollapsedTitleStyle", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "F", "getIconSize-D9Ej5fM", "e", "getTitleTopPadding-D9Ej5fM", "f", "getSubtitleTopPadding-D9Ej5fM", "g", "getTabsTopPadding-D9Ej5fM", "h", "getTrailingContentSpacedBy-D9Ej5fM", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PageHeaderGeometry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final u0 titleStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final u0 subtitleStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final u0 collapsedTitleStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float iconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float titleTopPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float subtitleTopPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float tabsTopPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final float trailingContentSpacedBy;

    public PageHeaderGeometry(u0 u0Var, u0 u0Var2, u0 u0Var3, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        u0Var.getClass();
        u0Var2.getClass();
        u0Var3.getClass();
        this.titleStyle = u0Var;
        this.subtitleStyle = u0Var2;
        this.collapsedTitleStyle = u0Var3;
        this.iconSize = f11;
        this.titleTopPadding = f12;
        this.subtitleTopPadding = f13;
        this.tabsTopPadding = f14;
        this.trailingContentSpacedBy = f15;
    }

    /* JADX INFO: renamed from: copy-LvyflJE$default, reason: not valid java name */
    public static /* synthetic */ PageHeaderGeometry m895copyLvyflJE$default(PageHeaderGeometry pageHeaderGeometry, u0 u0Var, u0 u0Var2, u0 u0Var3, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            u0Var = pageHeaderGeometry.titleStyle;
        }
        if ((i11 & 2) != 0) {
            u0Var2 = pageHeaderGeometry.subtitleStyle;
        }
        if ((i11 & 4) != 0) {
            u0Var3 = pageHeaderGeometry.collapsedTitleStyle;
        }
        if ((i11 & 8) != 0) {
            f11 = pageHeaderGeometry.iconSize;
        }
        if ((i11 & 16) != 0) {
            f12 = pageHeaderGeometry.titleTopPadding;
        }
        if ((i11 & 32) != 0) {
            f13 = pageHeaderGeometry.subtitleTopPadding;
        }
        if ((i11 & 64) != 0) {
            f14 = pageHeaderGeometry.tabsTopPadding;
        }
        if ((i11 & 128) != 0) {
            f15 = pageHeaderGeometry.trailingContentSpacedBy;
        }
        float f16 = f14;
        float f17 = f15;
        float f18 = f12;
        float f19 = f13;
        return pageHeaderGeometry.m901copyLvyflJE(u0Var, u0Var2, u0Var3, f11, f18, f19, f16, f17);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final u0 getTitleStyle() {
        return this.titleStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final u0 getSubtitleStyle() {
        return this.subtitleStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final u0 getCollapsedTitleStyle() {
        return this.collapsedTitleStyle;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTitleTopPadding() {
        return this.titleTopPadding;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSubtitleTopPadding() {
        return this.subtitleTopPadding;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTabsTopPadding() {
        return this.tabsTopPadding;
    }

    /* JADX INFO: renamed from: component8-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTrailingContentSpacedBy() {
        return this.trailingContentSpacedBy;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-LvyflJE, reason: not valid java name */
    public final PageHeaderGeometry m901copyLvyflJE(@NotNull u0 titleStyle, @NotNull u0 subtitleStyle, @NotNull u0 collapsedTitleStyle, float iconSize, float titleTopPadding, float subtitleTopPadding, float tabsTopPadding, float trailingContentSpacedBy) {
        titleStyle.getClass();
        subtitleStyle.getClass();
        collapsedTitleStyle.getClass();
        return new PageHeaderGeometry(titleStyle, subtitleStyle, collapsedTitleStyle, iconSize, titleTopPadding, subtitleTopPadding, tabsTopPadding, trailingContentSpacedBy, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageHeaderGeometry)) {
            return false;
        }
        PageHeaderGeometry pageHeaderGeometry = (PageHeaderGeometry) other;
        return Intrinsics.areEqual(this.titleStyle, pageHeaderGeometry.titleStyle) && Intrinsics.areEqual(this.subtitleStyle, pageHeaderGeometry.subtitleStyle) && Intrinsics.areEqual(this.collapsedTitleStyle, pageHeaderGeometry.collapsedTitleStyle) && f.c(this.iconSize, pageHeaderGeometry.iconSize) && f.c(this.titleTopPadding, pageHeaderGeometry.titleTopPadding) && f.c(this.subtitleTopPadding, pageHeaderGeometry.subtitleTopPadding) && f.c(this.tabsTopPadding, pageHeaderGeometry.tabsTopPadding) && f.c(this.trailingContentSpacedBy, pageHeaderGeometry.trailingContentSpacedBy);
    }

    @NotNull
    public final u0 getCollapsedTitleStyle() {
        return this.collapsedTitleStyle;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m902getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    @NotNull
    public final u0 getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: getSubtitleTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m903getSubtitleTopPaddingD9Ej5fM() {
        return this.subtitleTopPadding;
    }

    /* JADX INFO: renamed from: getTabsTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m904getTabsTopPaddingD9Ej5fM() {
        return this.tabsTopPadding;
    }

    @NotNull
    public final u0 getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: getTitleTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m905getTitleTopPaddingD9Ej5fM() {
        return this.titleTopPadding;
    }

    /* JADX INFO: renamed from: getTrailingContentSpacedBy-D9Ej5fM, reason: not valid java name */
    public final float m906getTrailingContentSpacedByD9Ej5fM() {
        return this.trailingContentSpacedBy;
    }

    public int hashCode() {
        return Float.hashCode(this.trailingContentSpacedBy) + k.a(k.a(k.a(k.a(l1.c(l1.c(this.titleStyle.hashCode() * 31, 31, this.subtitleStyle), 31, this.collapsedTitleStyle), this.iconSize, 31), this.titleTopPadding, 31), this.subtitleTopPadding, 31), this.tabsTopPadding, 31);
    }

    @NotNull
    public String toString() {
        String strD = f.d(this.iconSize);
        String strD2 = f.d(this.titleTopPadding);
        String strD3 = f.d(this.subtitleTopPadding);
        String strD4 = f.d(this.tabsTopPadding);
        String strD5 = f.d(this.trailingContentSpacedBy);
        StringBuilder sb2 = new StringBuilder("PageHeaderGeometry(titleStyle=");
        sb2.append(this.titleStyle);
        sb2.append(", subtitleStyle=");
        sb2.append(this.subtitleStyle);
        sb2.append(", collapsedTitleStyle=");
        sb2.append(this.collapsedTitleStyle);
        sb2.append(", iconSize=");
        sb2.append(strD);
        sb2.append(", titleTopPadding=");
        s.A(sb2, strD2, ", subtitleTopPadding=", strD3, ", tabsTopPadding=");
        return e0.f.o(sb2, strD4, ", trailingContentSpacedBy=", strD5, ")");
    }
}
