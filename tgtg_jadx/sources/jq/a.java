package jq;

import androidx.lifecycle.i1;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.FilterNoResultView;
import com.app.tgtg.model.remote.order.request.CreateMultiPaymentRequest;
import com.app.tgtg.model.remote.order.request.RatingCategory;
import com.app.tgtg.model.remote.order.response.CharityOrderHistoryResponse;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.app.tgtg.model.remote.order.response.OrdersData;
import com.app.tgtg.model.remote.order.response.PaymentResponse;
import com.app.tgtg.model.remote.payment.ExtendedPriceSpecification;
import com.app.tgtg.model.remote.payment.PaymentIcons;
import com.tgtg.componentlibrary.component.chip.type.choicechip.ComposableSingletons$PantryChoiceChipKt;
import k3.t;
import k9.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Reflection;
import kp.d;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.rest.model.ConversationFieldDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25362a;

    public /* synthetic */ a(int i11) {
        this.f25362a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25362a) {
            case 0:
                int i11 = b.f25363i;
                return Unit.f26487a;
            case 1:
                return CreateMultiPaymentRequest._childSerializers$_anonymous_();
            case 2:
                return CreateMultiPaymentRequest._childSerializers$_anonymous_$0();
            case 3:
                return RatingCategory._childSerializers$_anonymous_();
            case 4:
                Float fValueOf = Float.valueOf(0.0f);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                return new t(new t1.b(fValueOf, t1.c.f39389j, null, 12));
            case 5:
                return ConversationFieldDto._childSerializers$_anonymous_();
            case 6:
                return Unit.f26487a;
            case 7:
                return Unit.f26487a;
            case 8:
                int i12 = d.f26638j;
                return Unit.f26487a;
            case 9:
                int i13 = FilterNoResultView.f9287m;
                return Unit.f26487a;
            case 10:
                return CharityOrderHistoryResponse._childSerializers$_anonymous_();
            case 11:
                return CreateOrderResponse._childSerializers$_anonymous_();
            case 12:
                return OrdersData._childSerializers$_anonymous_();
            case 13:
                return PaymentResponse._childSerializers$_anonymous_();
            case 14:
                ComposableSingletons$PantryChoiceChipKt composableSingletons$PantryChoiceChipKt = ComposableSingletons$PantryChoiceChipKt.INSTANCE;
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ComposableSingletons$PantryChoiceChipKt composableSingletons$PantryChoiceChipKt2 = ComposableSingletons$PantryChoiceChipKt.INSTANCE;
                return Unit.f26487a;
            case 16:
                return Unit.f26487a;
            case 17:
                return Unit.f26487a;
            case 18:
                return Unit.f26487a;
            case 19:
                return Unit.f26487a;
            case 20:
                return new i1();
            case 21:
                y8.c cVar = new y8.c(0);
                cVar.a(Reflection.getOrCreateKotlinClass(l9.b.class), new f(6));
                return cVar.b();
            case 22:
                return Unit.f26487a;
            case 23:
                return Unit.f26487a;
            case 24:
                return Unit.f26487a;
            case 25:
                return ExtendedPriceSpecification._childSerializers$_anonymous_();
            case 26:
                return ExtendedPriceSpecification._childSerializers$_anonymous_$0();
            case 27:
                return ExtendedPriceSpecification._childSerializers$_anonymous_$1();
            case 28:
                return PaymentIcons._childSerializers$_anonymous_();
            default:
                return PaymentIcons._childSerializers$_anonymous_$0();
        }
    }
}
