package cn;

import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8566a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.y f8567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Parcelable f8571f;

    public p(ym.y yVar, BaseItemMnuV2 baseItemMnuV2, int i11, int i12, TypedItemCardsCarouselMnu typedItemCardsCarouselMnu) {
        this.f8567b = yVar;
        this.f8571f = baseItemMnuV2;
        this.f8568c = i11;
        this.f8569d = i12;
        this.f8570e = typedItemCardsCarouselMnu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8566a) {
            case 0:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f8571f;
                ym.y yVar = this.f8567b;
                if (yVar != null) {
                    AdapterItemType adapterItemType = (AdapterItemType) this.f8570e;
                    String strM393getItemIdFvU5WIY = baseItemMnuV2.m393getItemIdFvU5WIY();
                    Integer numValueOf = Integer.valueOf(baseItemMnuV2.getAvailableStock());
                    Picture coverPicture = baseItemMnuV2.getCoverPicture();
                    ((ym.u) yVar).w(adapterItemType, new dn.o(new dn.n(strM393getItemIdFvU5WIY, numValueOf, coverPicture != null ? coverPicture.getPictureId() : null, baseItemMnuV2.getItemType()), null, this.f8568c, this.f8569d, baseItemMnuV2.getItemType() == ItemType.CATERING ? "CATERING" : null), null);
                }
                break;
            case 1:
                ym.y yVar2 = this.f8567b;
                if (yVar2 != null) {
                    ((ym.u) yVar2).w(AdapterItemType.SMALL_CARDS_CAROUSEL, new dn.o(new dn.n(((CategoryCard) this.f8570e).getId(), null, null, null), null, this.f8568c, this.f8569d, null), String.valueOf(((CategoryCarouselMnuV2) this.f8571f).getCardsType()));
                }
                break;
            default:
                BaseItemMnuV2 baseItemMnuV22 = (BaseItemMnuV2) this.f8571f;
                ym.y yVar3 = this.f8567b;
                if (yVar3 != null) {
                    AdapterItemType adapterItemType2 = AdapterItemType.TYPED_ITEM_CARDS_CAROUSEL;
                    String strM393getItemIdFvU5WIY2 = baseItemMnuV22.m393getItemIdFvU5WIY();
                    Integer numValueOf2 = Integer.valueOf(baseItemMnuV22.getAvailableStock());
                    Picture coverPicture2 = baseItemMnuV22.getCoverPicture();
                    ((ym.u) yVar3).w(adapterItemType2, new dn.o(new dn.n(strM393getItemIdFvU5WIY2, numValueOf2, coverPicture2 != null ? coverPicture2.getPictureId() : null, baseItemMnuV22.getItemType()), null, this.f8568c, this.f8569d, baseItemMnuV22.getItemType() == ItemType.CATERING ? "CATERING" : ((TypedItemCardsCarouselMnu) this.f8570e).getCarouselType()), null);
                }
                break;
        }
        return Unit.f26487a;
    }

    public p(ym.y yVar, CategoryCard categoryCard, int i11, int i12, CategoryCarouselMnuV2 categoryCarouselMnuV2) {
        this.f8567b = yVar;
        this.f8570e = categoryCard;
        this.f8568c = i11;
        this.f8569d = i12;
        this.f8571f = categoryCarouselMnuV2;
    }

    public p(ym.y yVar, AdapterItemType adapterItemType, BaseItemMnuV2 baseItemMnuV2, int i11, int i12) {
        this.f8567b = yVar;
        this.f8570e = adapterItemType;
        this.f8571f = baseItemMnuV2;
        this.f8568c = i11;
        this.f8569d = i12;
    }
}
