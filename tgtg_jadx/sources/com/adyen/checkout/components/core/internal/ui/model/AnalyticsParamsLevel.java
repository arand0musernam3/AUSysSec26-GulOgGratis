package com.adyen.checkout.components.core.internal.ui.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority", "()I", "INITIAL", "ALL", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsParamsLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnalyticsParamsLevel[] $VALUES;
    private final int priority;
    public static final AnalyticsParamsLevel INITIAL = new AnalyticsParamsLevel("INITIAL", 0, 1);
    public static final AnalyticsParamsLevel ALL = new AnalyticsParamsLevel("ALL", 1, 2);

    private static final /* synthetic */ AnalyticsParamsLevel[] $values() {
        return new AnalyticsParamsLevel[]{INITIAL, ALL};
    }

    static {
        AnalyticsParamsLevel[] analyticsParamsLevelArr$values = $values();
        $VALUES = analyticsParamsLevelArr$values;
        $ENTRIES = n.w(analyticsParamsLevelArr$values);
    }

    private AnalyticsParamsLevel(String str, int i11, int i12) {
        this.priority = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsParamsLevel valueOf(String str) {
        return (AnalyticsParamsLevel) Enum.valueOf(AnalyticsParamsLevel.class, str);
    }

    public static AnalyticsParamsLevel[] values() {
        return (AnalyticsParamsLevel[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
