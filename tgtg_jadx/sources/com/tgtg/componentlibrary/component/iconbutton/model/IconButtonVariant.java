package com.tgtg.componentlibrary.component.iconbutton.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;", "", "Subtle", "IconOnly", "Accent", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IconButtonVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IconButtonVariant[] $VALUES;
    public static final IconButtonVariant Accent;
    public static final IconButtonVariant IconOnly;
    public static final IconButtonVariant Subtle;

    static {
        IconButtonVariant iconButtonVariant = new IconButtonVariant("Subtle", 0);
        Subtle = iconButtonVariant;
        IconButtonVariant iconButtonVariant2 = new IconButtonVariant("IconOnly", 1);
        IconOnly = iconButtonVariant2;
        IconButtonVariant iconButtonVariant3 = new IconButtonVariant("Accent", 2);
        Accent = iconButtonVariant3;
        IconButtonVariant[] iconButtonVariantArr = {iconButtonVariant, iconButtonVariant2, iconButtonVariant3};
        $VALUES = iconButtonVariantArr;
        $ENTRIES = new b(iconButtonVariantArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static IconButtonVariant valueOf(String str) {
        return (IconButtonVariant) Enum.valueOf(IconButtonVariant.class, str);
    }

    public static IconButtonVariant[] values() {
        return (IconButtonVariant[]) $VALUES.clone();
    }
}
