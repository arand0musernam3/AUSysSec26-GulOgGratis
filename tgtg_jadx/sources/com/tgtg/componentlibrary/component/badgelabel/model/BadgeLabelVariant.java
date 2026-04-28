package com.tgtg.componentlibrary.component.badgelabel.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;", "", "Base", "Positive", "Attention", "Accent", "Negative", "Unavailable", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeLabelVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BadgeLabelVariant[] $VALUES;
    public static final BadgeLabelVariant Accent;
    public static final BadgeLabelVariant Attention;
    public static final BadgeLabelVariant Base;
    public static final BadgeLabelVariant Negative;
    public static final BadgeLabelVariant Positive;
    public static final BadgeLabelVariant Unavailable;

    static {
        BadgeLabelVariant badgeLabelVariant = new BadgeLabelVariant("Base", 0);
        Base = badgeLabelVariant;
        BadgeLabelVariant badgeLabelVariant2 = new BadgeLabelVariant("Positive", 1);
        Positive = badgeLabelVariant2;
        BadgeLabelVariant badgeLabelVariant3 = new BadgeLabelVariant("Attention", 2);
        Attention = badgeLabelVariant3;
        BadgeLabelVariant badgeLabelVariant4 = new BadgeLabelVariant("Accent", 3);
        Accent = badgeLabelVariant4;
        BadgeLabelVariant badgeLabelVariant5 = new BadgeLabelVariant("Negative", 4);
        Negative = badgeLabelVariant5;
        BadgeLabelVariant badgeLabelVariant6 = new BadgeLabelVariant("Unavailable", 5);
        Unavailable = badgeLabelVariant6;
        BadgeLabelVariant[] badgeLabelVariantArr = {badgeLabelVariant, badgeLabelVariant2, badgeLabelVariant3, badgeLabelVariant4, badgeLabelVariant5, badgeLabelVariant6};
        $VALUES = badgeLabelVariantArr;
        $ENTRIES = new b(badgeLabelVariantArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static BadgeLabelVariant valueOf(String str) {
        return (BadgeLabelVariant) Enum.valueOf(BadgeLabelVariant.class, str);
    }

    public static BadgeLabelVariant[] values() {
        return (BadgeLabelVariant[]) $VALUES.clone();
    }
}
