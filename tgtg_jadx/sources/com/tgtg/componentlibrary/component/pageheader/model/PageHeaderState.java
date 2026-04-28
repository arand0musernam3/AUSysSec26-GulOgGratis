package com.tgtg.componentlibrary.component.pageheader.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "", "Full", "Collapsed", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PageHeaderState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PageHeaderState[] $VALUES;
    public static final PageHeaderState Collapsed;
    public static final PageHeaderState Full;

    static {
        PageHeaderState pageHeaderState = new PageHeaderState("Full", 0);
        Full = pageHeaderState;
        PageHeaderState pageHeaderState2 = new PageHeaderState("Collapsed", 1);
        Collapsed = pageHeaderState2;
        PageHeaderState[] pageHeaderStateArr = {pageHeaderState, pageHeaderState2};
        $VALUES = pageHeaderStateArr;
        $ENTRIES = new b(pageHeaderStateArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PageHeaderState valueOf(String str) {
        return (PageHeaderState) Enum.valueOf(PageHeaderState.class, str);
    }

    public static PageHeaderState[] values() {
        return (PageHeaderState[]) $VALUES.clone();
    }
}
