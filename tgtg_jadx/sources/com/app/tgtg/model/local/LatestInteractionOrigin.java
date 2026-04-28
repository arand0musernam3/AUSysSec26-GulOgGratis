package com.app.tgtg.model.local;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/local/LatestInteractionOrigin;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "SCREEN_ITEM", "SCREEN_BASKET", "SCREEN_DELIVERY", "SCREEN_RECOMMENDATION", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LatestInteractionOrigin {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LatestInteractionOrigin[] $VALUES;

    @NotNull
    private final String trackingValue;
    public static final LatestInteractionOrigin SCREEN_ITEM = new LatestInteractionOrigin("SCREEN_ITEM", 0, "Screen_Item");
    public static final LatestInteractionOrigin SCREEN_BASKET = new LatestInteractionOrigin("SCREEN_BASKET", 1, "Screen_Basket");
    public static final LatestInteractionOrigin SCREEN_DELIVERY = new LatestInteractionOrigin("SCREEN_DELIVERY", 2, "Screen_Delivery");
    public static final LatestInteractionOrigin SCREEN_RECOMMENDATION = new LatestInteractionOrigin("SCREEN_RECOMMENDATION", 3, "Screen_Recommendation");

    private static final /* synthetic */ LatestInteractionOrigin[] $values() {
        return new LatestInteractionOrigin[]{SCREEN_ITEM, SCREEN_BASKET, SCREEN_DELIVERY, SCREEN_RECOMMENDATION};
    }

    static {
        LatestInteractionOrigin[] latestInteractionOriginArr$values = $values();
        $VALUES = latestInteractionOriginArr$values;
        $ENTRIES = n.w(latestInteractionOriginArr$values);
    }

    private LatestInteractionOrigin(String str, int i11, String str2) {
        this.trackingValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LatestInteractionOrigin valueOf(String str) {
        return (LatestInteractionOrigin) Enum.valueOf(LatestInteractionOrigin.class, str);
    }

    public static LatestInteractionOrigin[] values() {
        return (LatestInteractionOrigin[]) $VALUES.clone();
    }

    @NotNull
    public final String getTrackingValue() {
        return this.trackingValue;
    }
}
