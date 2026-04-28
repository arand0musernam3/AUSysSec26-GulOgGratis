package g60;

import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.badge.BadgeCollection$$serializer;
import com.app.tgtg.model.remote.mapService.request.FilteredBy;
import com.braze.push.support.HtmlUtils;
import gd.k;
import gd.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.d3;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.guidekit.android.internal.rest.model.ArticleDto;
import zendesk.guidekit.android.internal.rest.model.AttachmentDto;
import zendesk.guidekit.android.internal.rest.model.AttachmentResponseDto;
import zendesk.guidekit.android.internal.rest.model.BrandsDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20061a;

    public /* synthetic */ d(int i11) {
        this.f20061a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20061a) {
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
                return Unit.f26487a;
            case 6:
                return Unit.f26487a;
            case 7:
                return Unit.f26487a;
            case 8:
                return Unit.f26487a;
            case 9:
                return Unit.f26487a;
            case 10:
                return Unit.f26487a;
            case 11:
                return ArticleDto._childSerializers$_anonymous_();
            case 12:
                return ArticleDto._childSerializers$_anonymous_$0();
            case 13:
                return ArticleDto._childSerializers$_anonymous_$1();
            case 14:
                return AttachmentDto._childSerializers$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return AttachmentDto._childSerializers$_anonymous_$0();
            case 16:
                return AttachmentResponseDto._childSerializers$_anonymous_();
            case 17:
                return BrandsDto._childSerializers$_anonymous_();
            case 18:
                d3 d3Var = p.f20399a;
                return gd.b.f20362a;
            case 19:
                return k.f20391a;
            case 20:
                return new m90.d(BadgeCollection$$serializer.INSTANCE, 0);
            case 21:
                return Float.valueOf(d70.b.d(125));
            case 22:
                int i11 = DiscoverSheetView.f9147q;
                return Unit.f26487a;
            case 23:
                int i12 = CharityOrderActivity.f9162o;
                return Unit.f26487a;
            case 24:
                int i13 = CharityOrderActivity.f9162o;
                return Unit.f26487a;
            case 25:
                return FilteredBy._childSerializers$_anonymous_();
            case 26:
                return FilteredBy._childSerializers$_anonymous_$0();
            case 27:
                return FilteredBy._childSerializers$_anonymous_$1();
            case 28:
                return HtmlUtils.getHtmlSpannedTextIfEnabled$lambda$0();
            default:
                l80.e.f27503a.getClass();
                return Integer.valueOf(l80.e.f27504b.c(2147418112) + 65536);
        }
    }
}
