package com.app.tgtg.model.remote.item.requests;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/RecommendationType;", "", "<init>", "(Ljava/lang/String;I)V", "USER_WEIGHTED", "ITEM_BASED_V2", "USER_BASED", "LOCATION_BASED", "ITEM_SOLD_OUT", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecommendationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RecommendationType[] $VALUES;
    public static final RecommendationType USER_WEIGHTED = new RecommendationType("USER_WEIGHTED", 0);
    public static final RecommendationType ITEM_BASED_V2 = new RecommendationType("ITEM_BASED_V2", 1);
    public static final RecommendationType USER_BASED = new RecommendationType("USER_BASED", 2);
    public static final RecommendationType LOCATION_BASED = new RecommendationType("LOCATION_BASED", 3);
    public static final RecommendationType ITEM_SOLD_OUT = new RecommendationType("ITEM_SOLD_OUT", 4);

    private static final /* synthetic */ RecommendationType[] $values() {
        return new RecommendationType[]{USER_WEIGHTED, ITEM_BASED_V2, USER_BASED, LOCATION_BASED, ITEM_SOLD_OUT};
    }

    static {
        RecommendationType[] recommendationTypeArr$values = $values();
        $VALUES = recommendationTypeArr$values;
        $ENTRIES = n.w(recommendationTypeArr$values);
    }

    private RecommendationType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RecommendationType valueOf(String str) {
        return (RecommendationType) Enum.valueOf(RecommendationType.class, str);
    }

    public static RecommendationType[] values() {
        return (RecommendationType[]) $VALUES.clone();
    }
}
