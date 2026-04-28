package xw;

import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.voucher.response.BasicDiscountVoucherList;
import com.app.tgtg.model.remote.voucher.response.BasicVoucherList;
import com.app.tgtg.model.remote.voucher.response.DiscountVoucherDetails;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.d3;
import m3.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import x60.e;
import x60.f;
import x60.k;
import x60.l;
import x60.m;
import x60.n;
import y3.c;
import y3.g;
import zendesk.android.internal.proactivemessaging.model.Campaign;
import zendesk.android.internal.proactivemessaging.model.Condition;
import zendesk.android.internal.proactivemessaging.model.Expression;
import zendesk.android.internal.proactivemessaging.model.Integration;
import zendesk.android.internal.proactivemessaging.model.IntegrationType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44498a;

    public /* synthetic */ a(int i11) {
        this.f44498a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44498a) {
            case 0:
                return DefaultInAppMessageHtmlFullViewFactory.createInAppMessageView$lambda$0();
            case 1:
                return DefaultInAppMessageHtmlViewFactory.createInAppMessageView$lambda$0();
            case 2:
                return DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$2$lambda$1();
            case 3:
                return DefaultInAppMessageSlideupViewFactory.createInAppMessageView$lambda$0();
            case 4:
                return new c(new LinkedHashMap());
            case 5:
                d3 d3Var = g.f45406a;
                return null;
            case 6:
                e0 e0Var = PantryThemeKt.f13343a;
                return x60.a.f43893f;
            case 7:
                e0 e0Var2 = PantryThemeKt.f13343a;
                return f.f43903v0;
            case 8:
                e0 e0Var3 = PantryThemeKt.f13343a;
                return k.f43976m;
            case 9:
                e0 e0Var4 = PantryThemeKt.f13343a;
                return x60.g.f43904c;
            case 10:
                e0 e0Var5 = PantryThemeKt.f13343a;
                return n.f44022b;
            case 11:
                e0 e0Var6 = PantryThemeKt.f13343a;
                return l.f43988q;
            case 12:
                e0 e0Var7 = PantryThemeKt.f13343a;
                return m.f44004s;
            case 13:
                e0 e0Var8 = PantryThemeKt.f13343a;
                return e.f43902z;
            case 14:
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Unit.f26487a;
            case 16:
                return Boolean.TRUE;
            case 17:
                return Campaign._childSerializers$_anonymous_();
            case 18:
                return Condition._childSerializers$_anonymous_();
            case 19:
                return Expression.ExpressionClass._childSerializers$_anonymous_();
            case 20:
                return Integration._childSerializers$_anonymous_();
            case 21:
                return IntegrationType._init_$_anonymous_();
            case 22:
                return Unit.f26487a;
            case 23:
                return Unit.f26487a;
            case 24:
                return Boolean.valueOf(ft.c.C());
            case 25:
                return BriefOrder._childSerializers$_anonymous_();
            case 26:
                return BasicDiscountVoucherList._childSerializers$_anonymous_();
            case 27:
                return BasicVoucherList._childSerializers$_anonymous_();
            case 28:
                return DiscountVoucherDetails._childSerializers$_anonymous_();
            default:
                return DiscountVoucherDetails._childSerializers$_anonymous_$0();
        }
    }
}
