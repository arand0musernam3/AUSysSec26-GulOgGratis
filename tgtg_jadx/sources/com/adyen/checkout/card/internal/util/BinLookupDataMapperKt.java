package com.adyen.checkout.card.internal.util;

import com.adyen.checkout.card.BinLookupData;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toBinLookupData", "Lcom/adyen/checkout/card/BinLookupData;", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "card_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BinLookupDataMapperKt {
    @NotNull
    public static final BinLookupData toBinLookupData(@NotNull DetectedCardType detectedCardType) {
        detectedCardType.getClass();
        return new BinLookupData(detectedCardType.getCardBrand().getTxVariant(), detectedCardType.getPaymentMethodVariant(), detectedCardType.isReliable());
    }
}
