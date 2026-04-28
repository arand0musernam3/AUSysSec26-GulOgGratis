package com.adyen.checkout.card.internal.data.api;

import com.adyen.checkout.core.CardBrand;
import com.braze.h2;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JK\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/card/internal/data/api/DetectCardTypeRepository;", "", "", "cardNumber", "publicKey", "", "Lcom/adyen/checkout/core/CardBrand;", "supportedCardBrands", "clientKey", "Lv80/b0;", "coroutineScope", "type", "", "detectCardType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lv80/b0;Ljava/lang/String;)V", "Ly80/i;", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "getDetectedCardTypesFlow", "()Ly80/i;", "detectedCardTypesFlow", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DetectCardTypeRepository {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void detectCardType$default(DetectCardTypeRepository detectCardTypeRepository, String str, String str2, List list, String str3, b0 b0Var, String str4, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: detectCardType");
                return;
            }
            if ((i11 & 32) != 0) {
                str4 = null;
            }
            detectCardTypeRepository.detectCardType(str, str2, list, str3, b0Var, str4);
        }
    }

    void detectCardType(@NotNull String cardNumber, @Nullable String publicKey, @NotNull List<CardBrand> supportedCardBrands, @NotNull String clientKey, @NotNull b0 coroutineScope, @Nullable String type);

    @NotNull
    i getDetectedCardTypesFlow();
}
