package com.app.tgtg.model.remote.item.requests;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/SortingType;", "", "<init>", "(Ljava/lang/String;I)V", "RELEVANCE", "DISTANCE", "RANDOMIZED", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SortingType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SortingType[] $VALUES;
    public static final SortingType RELEVANCE = new SortingType("RELEVANCE", 0);
    public static final SortingType DISTANCE = new SortingType("DISTANCE", 1);
    public static final SortingType RANDOMIZED = new SortingType("RANDOMIZED", 2);

    private static final /* synthetic */ SortingType[] $values() {
        return new SortingType[]{RELEVANCE, DISTANCE, RANDOMIZED};
    }

    static {
        SortingType[] sortingTypeArr$values = $values();
        $VALUES = sortingTypeArr$values;
        $ENTRIES = n.w(sortingTypeArr$values);
    }

    private SortingType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SortingType valueOf(String str) {
        return (SortingType) Enum.valueOf(SortingType.class, str);
    }

    public static SortingType[] values() {
        return (SortingType[]) $VALUES.clone();
    }
}
