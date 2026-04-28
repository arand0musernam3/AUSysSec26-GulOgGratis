package com.adyen.checkout.card.internal.ui.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CVCVisibility;", "", "(Ljava/lang/String;I)V", "ALWAYS_SHOW", "HIDE_FIRST", "ALWAYS_HIDE", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CVCVisibility {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CVCVisibility[] $VALUES;
    public static final CVCVisibility ALWAYS_SHOW = new CVCVisibility("ALWAYS_SHOW", 0);
    public static final CVCVisibility HIDE_FIRST = new CVCVisibility("HIDE_FIRST", 1);
    public static final CVCVisibility ALWAYS_HIDE = new CVCVisibility("ALWAYS_HIDE", 2);

    private static final /* synthetic */ CVCVisibility[] $values() {
        return new CVCVisibility[]{ALWAYS_SHOW, HIDE_FIRST, ALWAYS_HIDE};
    }

    static {
        CVCVisibility[] cVCVisibilityArr$values = $values();
        $VALUES = cVCVisibilityArr$values;
        $ENTRIES = n.w(cVCVisibilityArr$values);
    }

    private CVCVisibility(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CVCVisibility valueOf(String str) {
        return (CVCVisibility) Enum.valueOf(CVCVisibility.class, str);
    }

    public static CVCVisibility[] values() {
        return (CVCVisibility[]) $VALUES.clone();
    }
}
