package com.app.tgtg.model.remote.item.response;

import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.TagVariant;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.payment.Price;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/TestBaseItemMnuV2;", "", "<init>", "()V", "getItem", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TestBaseItemMnuV2 {
    public static final int $stable = 0;

    @NotNull
    public static final TestBaseItemMnuV2 INSTANCE = new TestBaseItemMnuV2();

    private TestBaseItemMnuV2() {
    }

    @NotNull
    public final BaseItemMnuV2 getItem() {
        return new BaseItemMnuV2(ItemId.m198constructorimpl("23"), ItemType.MANUFACTURER, "Potatoes", "Round & neat, grows your feet", new Price("DKK", 2, 10025), new Price("DKK", 2, 25000), 4, new Picture("https://images-test.tgtg.ninja/item/cover/204bb3f5-2139-468b-8e77-0828a1913857.png", (String) null, 2, (DefaultConstructorMarker) null), new ManufacturerItemProperties((Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, new Brand("Coca Coala", null), (Boolean) null, (Price) null, (Boolean) null, 959, (DefaultConstructorMarker) null), null, c0.c(new ItemTagInfo(ItemTag.SPECIAL_OFFER, "Special offer", (String) null, TagVariant.UNKNOWN, (String) null, (String) null, 52, (DefaultConstructorMarker) null)), null, 5, null, null, null, 57344, null);
    }
}
