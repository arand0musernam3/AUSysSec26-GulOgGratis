package com.adyen.checkout.card.internal.util;

import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.model.CardBrandItem;
import com.adyen.checkout.card.internal.ui.model.DualBrandData;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.Environment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002JD\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J-\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0000¢\u0006\u0002\b\u0015J\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/card/internal/util/DualBrandedCardHandler;", "", "environment", "Lcom/adyen/checkout/core/Environment;", "(Lcom/adyen/checkout/core/Environment;)V", "findSelectedCardType", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "detectedCardTypes", "", "selectedBrand", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "getSelectedCardBrand", "isSelectable", "", "brandOptions", "Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;", "isDualBrandedFlow", "mapToCardBrandItemList", "processDetectedCardTypes", "Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;", "processDetectedCardTypes$card_release", "mapToCardBrandItem", "isSelected", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDualBrandedCardHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DualBrandedCardHandler.kt\ncom/adyen/checkout/card/internal/util/DualBrandedCardHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n774#2:113\n865#2,2:114\n1755#2,3:116\n774#2:120\n865#2,2:121\n774#2:123\n865#2,2:124\n1567#2:126\n1598#2,4:127\n1557#2:131\n1628#2,3:132\n1#3:119\n*S KotlinDebug\n*F\n+ 1 DualBrandedCardHandler.kt\ncom/adyen/checkout/card/internal/util/DualBrandedCardHandler\n*L\n50#1:113\n50#1:114,2\n50#1:116,3\n77#1:120\n77#1:121,2\n85#1:123\n85#1:124,2\n86#1:126\n86#1:127,4\n109#1:131\n109#1:132,3\n*E\n"})
public final class DualBrandedCardHandler {

    @NotNull
    private static final List<String> SUPPORTED_CARD_BRANDS;

    @NotNull
    private final Environment environment;

    static {
        List listH = d0.h(CardType.CARTEBANCAIRE, CardType.BCMC, CardType.DANKORT);
        ArrayList arrayList = new ArrayList(e0.o(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardType) it.next()).getTxVariant());
        }
        SUPPORTED_CARD_BRANDS = arrayList;
    }

    public DualBrandedCardHandler(@NotNull Environment environment) {
        environment.getClass();
        this.environment = environment;
    }

    private final DetectedCardType findSelectedCardType(List<DetectedCardType> detectedCardTypes, CardBrand selectedBrand) {
        Object obj;
        Iterator<T> it = detectedCardTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((DetectedCardType) next).getCardBrand().getTxVariant(), selectedBrand != null ? selectedBrand.getTxVariant() : null)) {
                obj = next;
                break;
            }
        }
        return (DetectedCardType) obj;
    }

    private final CardBrand getSelectedCardBrand(boolean isSelectable, List<DetectedCardType> detectedCardTypes, CardBrand selectedBrand, List<CardBrandItem> brandOptions) {
        CardBrand cardBrand;
        if (isSelectable) {
            DetectedCardType detectedCardTypeFindSelectedCardType = findSelectedCardType(detectedCardTypes, selectedBrand);
            if (detectedCardTypeFindSelectedCardType != null && (cardBrand = detectedCardTypeFindSelectedCardType.getCardBrand()) != null) {
                return cardBrand;
            }
            CardBrandItem cardBrandItem = (CardBrandItem) CollectionsKt.firstOrNull(brandOptions);
            if (cardBrandItem != null) {
                return cardBrandItem.getBrand();
            }
        }
        return null;
    }

    private final boolean isDualBrandedFlow(List<DetectedCardType> detectedCardTypes) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : detectedCardTypes) {
            DetectedCardType detectedCardType = (DetectedCardType) obj;
            if (detectedCardType.isSupported() && detectedCardType.isReliable()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }

    private final boolean isSelectable(List<DetectedCardType> detectedCardTypes) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : detectedCardTypes) {
            DetectedCardType detectedCardType = (DetectedCardType) obj;
            if (detectedCardType.isSupported() && detectedCardType.isReliable()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (SUPPORTED_CARD_BRANDS.contains(((DetectedCardType) it.next()).getCardBrand().getTxVariant())) {
                return true;
            }
        }
        return false;
    }

    private final CardBrandItem mapToCardBrandItem(DetectedCardType detectedCardType, boolean z11) {
        String localizedBrand = detectedCardType.getLocalizedBrand();
        if (localizedBrand == null) {
            localizedBrand = detectedCardType.getCardBrand().getTxVariant();
        }
        return new CardBrandItem(localizedBrand, detectedCardType.getCardBrand(), z11, this.environment);
    }

    private final List<CardBrandItem> mapToCardBrandItemList(List<DetectedCardType> detectedCardTypes, CardBrand selectedBrand, boolean isSelectable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : detectedCardTypes) {
            DetectedCardType detectedCardType = (DetectedCardType) obj;
            if (detectedCardType.isSupported() && detectedCardType.isReliable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            DetectedCardType detectedCardType2 = (DetectedCardType) obj2;
            arrayList2.add(selectedBrand == null ? mapToCardBrandItem(detectedCardType2, isSelectable && i11 == 0) : mapToCardBrandItem(detectedCardType2, isSelectable && Intrinsics.areEqual(detectedCardType2.getCardBrand().getTxVariant(), selectedBrand.getTxVariant())));
            i11 = i12;
        }
        return arrayList2;
    }

    @Nullable
    public final DualBrandData processDetectedCardTypes$card_release(@NotNull List<DetectedCardType> detectedCardTypes, @Nullable CardBrand selectedBrand) {
        detectedCardTypes.getClass();
        if (!isDualBrandedFlow(detectedCardTypes)) {
            return null;
        }
        boolean zIsSelectable = isSelectable(detectedCardTypes);
        List<CardBrandItem> listMapToCardBrandItemList = mapToCardBrandItemList(detectedCardTypes, selectedBrand, zIsSelectable);
        return new DualBrandData(getSelectedCardBrand(zIsSelectable, detectedCardTypes, selectedBrand, listMapToCardBrandItemList), listMapToCardBrandItemList, zIsSelectable);
    }
}
