package com.adyen.checkout.card.internal.analytics;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/card/internal/analytics/CardEvents;", "", "()V", "cardScannerAvailable", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "component", "", "cardScannerCancelled", "cardScannerFailure", "cardScannerPresented", "cardScannerSuccess", "cardScannerUnavailable", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardEvents {

    @NotNull
    public static final CardEvents INSTANCE = new CardEvents();

    private CardEvents() {
    }

    @NotNull
    public final AnalyticsEvent.Log cardScannerAvailable(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.CARD_SCANNER, "CardScannerAvailable", null, null, null, 455, null);
    }

    @NotNull
    public final AnalyticsEvent.Log cardScannerCancelled(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.CARD_SCANNER, "CardScannerCancelled", null, null, null, 455, null);
    }

    @NotNull
    public final AnalyticsEvent.Log cardScannerFailure(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.CARD_SCANNER, "CardScannerFailure", null, null, null, 455, null);
    }

    @NotNull
    public final AnalyticsEvent.Log cardScannerPresented(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.CARD_SCANNER, "CardScannerPresented", null, null, null, 455, null);
    }

    @NotNull
    public final AnalyticsEvent.Log cardScannerSuccess(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.CARD_SCANNER, "CardScannerSuccess", null, null, null, 455, null);
    }

    @NotNull
    public final AnalyticsEvent.Log cardScannerUnavailable(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.CARD_SCANNER, "CardScannerUnavailable", null, null, null, 455, null);
    }
}
