package com.app.tgtg.model.local;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/app/tgtg/model/local/LatestBasketInteraction;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "LOAD_BASKET_SCREEN", "ADD", "REMOVE", "SWIPE_TO_REMOVE", "FORCE_ADJUST", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LatestBasketInteraction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LatestBasketInteraction[] $VALUES;

    @NotNull
    private final String trackingValue;
    public static final LatestBasketInteraction LOAD_BASKET_SCREEN = new LatestBasketInteraction("LOAD_BASKET_SCREEN", 0, "Load_Basket_Screen");
    public static final LatestBasketInteraction ADD = new LatestBasketInteraction("ADD", 1, "Add");
    public static final LatestBasketInteraction REMOVE = new LatestBasketInteraction("REMOVE", 2, "Remove");
    public static final LatestBasketInteraction SWIPE_TO_REMOVE = new LatestBasketInteraction("SWIPE_TO_REMOVE", 3, "Swipe_To_Remove");
    public static final LatestBasketInteraction FORCE_ADJUST = new LatestBasketInteraction("FORCE_ADJUST", 4, "Force_Adjust");

    private static final /* synthetic */ LatestBasketInteraction[] $values() {
        return new LatestBasketInteraction[]{LOAD_BASKET_SCREEN, ADD, REMOVE, SWIPE_TO_REMOVE, FORCE_ADJUST};
    }

    static {
        LatestBasketInteraction[] latestBasketInteractionArr$values = $values();
        $VALUES = latestBasketInteractionArr$values;
        $ENTRIES = n.w(latestBasketInteractionArr$values);
    }

    private LatestBasketInteraction(String str, int i11, String str2) {
        this.trackingValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LatestBasketInteraction valueOf(String str) {
        return (LatestBasketInteraction) Enum.valueOf(LatestBasketInteraction.class, str);
    }

    public static LatestBasketInteraction[] values() {
        return (LatestBasketInteraction[]) $VALUES.clone();
    }

    @NotNull
    public final String getTrackingValue() {
        return this.trackingValue;
    }
}
