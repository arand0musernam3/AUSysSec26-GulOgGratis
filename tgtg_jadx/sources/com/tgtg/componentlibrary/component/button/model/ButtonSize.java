package com.tgtg.componentlibrary.component.button.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;", "", "Large", "Medium", "Small", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ButtonSize[] $VALUES;
    public static final ButtonSize Large;
    public static final ButtonSize Medium;
    public static final ButtonSize Small;

    static {
        ButtonSize buttonSize = new ButtonSize("Large", 0);
        Large = buttonSize;
        ButtonSize buttonSize2 = new ButtonSize("Medium", 1);
        Medium = buttonSize2;
        ButtonSize buttonSize3 = new ButtonSize("Small", 2);
        Small = buttonSize3;
        ButtonSize[] buttonSizeArr = {buttonSize, buttonSize2, buttonSize3};
        $VALUES = buttonSizeArr;
        $ENTRIES = new b(buttonSizeArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ButtonSize valueOf(String str) {
        return (ButtonSize) Enum.valueOf(ButtonSize.class, str);
    }

    public static ButtonSize[] values() {
        return (ButtonSize[]) $VALUES.clone();
    }
}
