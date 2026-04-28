package com.adyen.checkout.card.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardNumberUtils;", "", "()V", "formatCardNumber", "", "unformattedString", "maskPartsLengths", "", "", "separator", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardNumberUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberUtils.kt\ncom/adyen/checkout/card/internal/util/CardNumberUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,20:1\n1#2:21\n1133#3,4:22\n*S KotlinDebug\n*F\n+ 1 CardNumberUtils.kt\ncom/adyen/checkout/card/internal/util/CardNumberUtils\n*L\n15#1:22,4\n*E\n"})
public final class CardNumberUtils {

    @NotNull
    public static final CardNumberUtils INSTANCE = new CardNumberUtils();

    private CardNumberUtils() {
    }

    @NotNull
    public final String formatCardNumber(@NotNull String unformattedString, @NotNull List<Integer> maskPartsLengths, @NotNull String separator) {
        StringBuilder sb2;
        unformattedString.getClass();
        maskPartsLengths.getClass();
        separator.getClass();
        int size = maskPartsLengths.size();
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            i12++;
            List listM0 = CollectionsKt.m0(maskPartsLengths, i12);
            listM0.getClass();
            Iterator it = listM0.iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                iIntValue += ((Number) it.next()).intValue();
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        String string = "";
        int i13 = 0;
        while (i11 < unformattedString.length()) {
            char cCharAt = unformattedString.charAt(i11);
            int i14 = i13 + 1;
            if (arrayList.contains(Integer.valueOf(i13))) {
                sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(separator);
            } else {
                sb2 = new StringBuilder();
                sb2.append(string);
            }
            sb2.append(cCharAt);
            string = sb2.toString();
            i11++;
            i13 = i14;
        }
        return string;
    }
}
