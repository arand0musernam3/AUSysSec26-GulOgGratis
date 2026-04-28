package com.tgtg.componentlibrary.component.button.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;", "", "Primary", "Subtle", "TextTransparent", "Accent", "Negative", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ButtonVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ButtonVariant[] $VALUES;
    public static final ButtonVariant Accent;
    public static final ButtonVariant Negative;
    public static final ButtonVariant Primary;
    public static final ButtonVariant Subtle;
    public static final ButtonVariant TextTransparent;

    static {
        ButtonVariant buttonVariant = new ButtonVariant("Primary", 0);
        Primary = buttonVariant;
        ButtonVariant buttonVariant2 = new ButtonVariant("Subtle", 1);
        Subtle = buttonVariant2;
        ButtonVariant buttonVariant3 = new ButtonVariant("TextTransparent", 2);
        TextTransparent = buttonVariant3;
        ButtonVariant buttonVariant4 = new ButtonVariant("Accent", 3);
        Accent = buttonVariant4;
        ButtonVariant buttonVariant5 = new ButtonVariant("Negative", 4);
        Negative = buttonVariant5;
        ButtonVariant[] buttonVariantArr = {buttonVariant, buttonVariant2, buttonVariant3, buttonVariant4, buttonVariant5};
        $VALUES = buttonVariantArr;
        $ENTRIES = new b(buttonVariantArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ButtonVariant valueOf(String str) {
        return (ButtonVariant) Enum.valueOf(ButtonVariant.class, str);
    }

    public static ButtonVariant[] values() {
        return (ButtonVariant[]) $VALUES.clone();
    }
}
