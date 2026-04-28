package cg;

import com.app.tgtg.model.remote.item.response.AlternateRecommendedItemResponse;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.GroupMnuV2;
import com.app.tgtg.model.remote.item.response.HeroCarouselMnu;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7958a;

    public /* synthetic */ e(int i11) {
        this.f7958a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7958a) {
            case 0:
                return Unit.f26487a;
            case 1:
                return Unit.f26487a;
            case 2:
                return Unit.f26487a;
            case 3:
                return Unit.f26487a;
            case 4:
                return Unit.f26487a;
            case 5:
                h8.e eVar = cj.q.f8330j0;
                return new av.e();
            case 6:
                h8.e eVar2 = cj.q.f8330j0;
                return new av.e();
            case 7:
                return new av.e();
            case 8:
                return new androidx.lifecycle.o0();
            case 9:
                return new av.e();
            case 10:
                return AlternateRecommendedItemResponse._childSerializers$_anonymous_();
            case 11:
                return BaseItemMnuV2._childSerializers$_anonymous_();
            case 12:
                return BasicItem._childSerializers$_anonymous_();
            case 13:
                return BasicItem._init_$_anonymous_();
            case 14:
                return CategoryCarouselMnuV2._childSerializers$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return CateringItem._childSerializers$_anonymous_();
            case 16:
                return CateringItem._childSerializers$_anonymous_$0();
            case 17:
                return CharityItem._childSerializers$_anonymous_();
            case 18:
                return CharityItem._childSerializers$_anonymous_$0();
            case 19:
                return ElementMnuV2._init_$_anonymous_();
            case 20:
                return FlashSalesItem._childSerializers$_anonymous_();
            case 21:
                return FlashSalesItem._childSerializers$_anonymous_$0();
            case 22:
                return GroupMnuV2._childSerializers$_anonymous_();
            case 23:
                return HeroCarouselMnu._childSerializers$_anonymous_();
            case 24:
                return HeroComponentResponse._childSerializers$_anonymous_();
            case 25:
                return HighlightedItemCardsCarouselMnuV2._childSerializers$_anonymous_();
            case 26:
                return Item._childSerializers$_anonymous_();
            case 27:
                return Item._childSerializers$_anonymous_$0();
            case 28:
                return ItemCarouselMnu._childSerializers$_anonymous_();
            default:
                return ItemCarouselMnuV2._childSerializers$_anonymous_();
        }
    }
}
