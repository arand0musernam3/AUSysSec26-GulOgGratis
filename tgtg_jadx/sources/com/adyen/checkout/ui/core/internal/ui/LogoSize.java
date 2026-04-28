package com.adyen.checkout.ui.core.internal.ui;

import a80.a;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/LogoSize;", "", "(Ljava/lang/String;I)V", "toString", "", "SMALL", "MEDIUM", "LARGE", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogoSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogoSize[] $VALUES;
    public static final LogoSize SMALL = new LogoSize("SMALL", 0);
    public static final LogoSize MEDIUM = new LogoSize("MEDIUM", 1);
    public static final LogoSize LARGE = new LogoSize("LARGE", 2);

    private static final /* synthetic */ LogoSize[] $values() {
        return new LogoSize[]{SMALL, MEDIUM, LARGE};
    }

    static {
        LogoSize[] logoSizeArr$values = $values();
        $VALUES = logoSizeArr$values;
        $ENTRIES = n.w(logoSizeArr$values);
    }

    private LogoSize(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LogoSize valueOf(String str) {
        return (LogoSize) Enum.valueOf(LogoSize.class, str);
    }

    public static LogoSize[] values() {
        return (LogoSize[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
