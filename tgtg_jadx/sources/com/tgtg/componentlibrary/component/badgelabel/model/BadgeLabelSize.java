package com.tgtg.componentlibrary.component.badgelabel.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;", "", "Medium", "Small", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeLabelSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BadgeLabelSize[] $VALUES;
    public static final BadgeLabelSize Medium;
    public static final BadgeLabelSize Small;

    static {
        BadgeLabelSize badgeLabelSize = new BadgeLabelSize("Medium", 0);
        Medium = badgeLabelSize;
        BadgeLabelSize badgeLabelSize2 = new BadgeLabelSize("Small", 1);
        Small = badgeLabelSize2;
        BadgeLabelSize[] badgeLabelSizeArr = {badgeLabelSize, badgeLabelSize2};
        $VALUES = badgeLabelSizeArr;
        $ENTRIES = new b(badgeLabelSizeArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static BadgeLabelSize valueOf(String str) {
        return (BadgeLabelSize) Enum.valueOf(BadgeLabelSize.class, str);
    }

    public static BadgeLabelSize[] values() {
        return (BadgeLabelSize[]) $VALUES.clone();
    }
}
