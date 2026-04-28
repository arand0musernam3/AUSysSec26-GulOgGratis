package com.tgtg.componentlibrary.component.pageheader.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderVariant;", "", "Global", "Page", "Modal", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PageHeaderVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PageHeaderVariant[] $VALUES;
    public static final PageHeaderVariant Global;
    public static final PageHeaderVariant Modal;
    public static final PageHeaderVariant Page;

    static {
        PageHeaderVariant pageHeaderVariant = new PageHeaderVariant("Global", 0);
        Global = pageHeaderVariant;
        PageHeaderVariant pageHeaderVariant2 = new PageHeaderVariant("Page", 1);
        Page = pageHeaderVariant2;
        PageHeaderVariant pageHeaderVariant3 = new PageHeaderVariant("Modal", 2);
        Modal = pageHeaderVariant3;
        PageHeaderVariant[] pageHeaderVariantArr = {pageHeaderVariant, pageHeaderVariant2, pageHeaderVariant3};
        $VALUES = pageHeaderVariantArr;
        $ENTRIES = new b(pageHeaderVariantArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PageHeaderVariant valueOf(String str) {
        return (PageHeaderVariant) Enum.valueOf(PageHeaderVariant.class, str);
    }

    public static PageHeaderVariant[] values() {
        return (PageHeaderVariant[]) $VALUES.clone();
    }
}
