package aw;

import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.widget.BaseCardView;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Card f4848b;

    public /* synthetic */ a(Card card, int i11) {
        this.f4847a = i11;
        this.f4848b = card;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4847a) {
            case 0:
                return Card.logClick$lambda$10(this.f4848b);
            case 1:
                return Card.logClick$lambda$11(this.f4848b);
            case 2:
                return Card.logClick$lambda$12(this.f4848b);
            case 3:
                return Card.logImpression$lambda$4(this.f4848b);
            case 4:
                return Card.logImpression$lambda$6(this.f4848b);
            case 5:
                return Card.logImpression$lambda$8(this.f4848b);
            case 6:
                return BrazeContentCardUtils.handleCardClick$lambda$3(this.f4848b);
            case 7:
                return BrazeContentCardUtils.handleCardClick$lambda$5(this.f4848b);
            case 8:
                return BrazeContentCardUtils.handleCardClick$lambda$6(this.f4848b);
            case 9:
                return BrazeContentCardUtils.handleCardClick$lambda$7(this.f4848b);
            case 10:
                return ContentCardAdapter.logImpression$lambda$8(this.f4848b);
            case 11:
                return ContentCardAdapter.logImpression$lambda$9(this.f4848b);
            case 12:
                return BaseCardView.handleCardClick$lambda$0(this.f4848b);
            case 13:
                return BaseCardView.handleCardClick$lambda$1(this.f4848b);
            case 14:
                return BaseCardView.handleCardClick$lambda$2(this.f4848b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BaseCardView.handleCardClick$lambda$3(this.f4848b);
            default:
                return BaseCardView.handleCardClick$lambda$4(this.f4848b);
        }
    }
}
