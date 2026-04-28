package com.app.tgtg.model.remote.manufacturer.request;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;", "", "<init>", "(Ljava/lang/String;I)V", "BASKET", "BASKET_SINGLE", "ITEM_DETAILS", "POST_PURCHASE", "DEFAULT", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecommendationScreenScenario {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RecommendationScreenScenario[] $VALUES;
    public static final RecommendationScreenScenario BASKET = new RecommendationScreenScenario("BASKET", 0);
    public static final RecommendationScreenScenario BASKET_SINGLE = new RecommendationScreenScenario("BASKET_SINGLE", 1);
    public static final RecommendationScreenScenario ITEM_DETAILS = new RecommendationScreenScenario("ITEM_DETAILS", 2);
    public static final RecommendationScreenScenario POST_PURCHASE = new RecommendationScreenScenario("POST_PURCHASE", 3);
    public static final RecommendationScreenScenario DEFAULT = new RecommendationScreenScenario("DEFAULT", 4);

    private static final /* synthetic */ RecommendationScreenScenario[] $values() {
        return new RecommendationScreenScenario[]{BASKET, BASKET_SINGLE, ITEM_DETAILS, POST_PURCHASE, DEFAULT};
    }

    static {
        RecommendationScreenScenario[] recommendationScreenScenarioArr$values = $values();
        $VALUES = recommendationScreenScenarioArr$values;
        $ENTRIES = n.w(recommendationScreenScenarioArr$values);
    }

    private RecommendationScreenScenario(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RecommendationScreenScenario valueOf(String str) {
        return (RecommendationScreenScenario) Enum.valueOf(RecommendationScreenScenario.class, str);
    }

    public static RecommendationScreenScenario[] values() {
        return (RecommendationScreenScenario[]) $VALUES.clone();
    }
}
