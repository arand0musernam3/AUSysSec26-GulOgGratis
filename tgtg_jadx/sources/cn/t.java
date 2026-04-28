package cn;

import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym.y f8585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f8586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8588d;

    public t(ym.y yVar, BaseItemMnuV2 baseItemMnuV2, int i11, int i12) {
        this.f8585a = yVar;
        this.f8586b = baseItemMnuV2;
        this.f8587c = i11;
        this.f8588d = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ym.y yVar = this.f8585a;
        if (yVar != null) {
            AdapterItemType adapterItemType = AdapterItemType.ITEM_CARDS_CAROUSEL;
            BaseItemMnuV2 baseItemMnuV2 = this.f8586b;
            String strM393getItemIdFvU5WIY = baseItemMnuV2.m393getItemIdFvU5WIY();
            Integer numValueOf = Integer.valueOf(baseItemMnuV2.getAvailableStock());
            Picture coverPicture = baseItemMnuV2.getCoverPicture();
            ((ym.u) yVar).w(adapterItemType, new dn.o(new dn.n(strM393getItemIdFvU5WIY, numValueOf, coverPicture != null ? coverPicture.getPictureId() : null, baseItemMnuV2.getItemType()), null, this.f8587c, this.f8588d, baseItemMnuV2.getItemType() == ItemType.CATERING ? "CATERING" : null), null);
        }
        return Unit.f26487a;
    }
}
