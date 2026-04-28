package db0;

import com.app.tgtg.model.remote.item.requests.ExtendedPriceSpecificationsRequest;
import com.app.tgtg.model.remote.item.requests.ListItemRequest;
import com.app.tgtg.model.remote.item.requests.RecommendationsListRequest;
import com.app.tgtg.model.remote.item.requests.TrackingEventsRequest;
import com.app.tgtg.model.remote.manufacturer.request.BasketDeliveryOptionsRequest;
import com.app.tgtg.model.remote.manufacturer.request.BasketPaymentMethodsRequest;
import com.app.tgtg.model.remote.manufacturer.request.BasketPriceSpecificationsRequest;
import com.app.tgtg.model.remote.manufacturer.request.BasketRequest;
import com.app.tgtg.model.remote.manufacturer.request.CreateMultipleItemsOrderRequestV8;
import e.l;
import e.m;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.conversationkit.android.model.MessageType;
import zendesk.conversationkit.android.model.Participant;
import zendesk.conversationkit.android.model.RealtimeSettings;
import zendesk.conversationkit.android.model.User;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14864a;

    public /* synthetic */ c(int i11) {
        this.f14864a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14864a) {
            case 0:
                return MessageStatus.Failed._childSerializers$_anonymous_();
            case 1:
                return MessageStatus.Failed._childSerializers$_anonymous_$0();
            case 2:
                return MessageStatus.Failure._init_$_anonymous_();
            case 3:
                return MessageStatus.Pending._childSerializers$_anonymous_();
            case 4:
                return MessageStatus.Sent._childSerializers$_anonymous_();
            case 5:
                return MessageStatus.StatusType._init_$_anonymous_();
            case 6:
                return MessageType._init_$_anonymous_();
            case 7:
                return Participant._childSerializers$_anonymous_();
            case 8:
                return RealtimeSettings._childSerializers$_anonymous_();
            case 9:
                return User._childSerializers$_anonymous_();
            case 10:
                return Unit.f26487a;
            case 11:
                return ExtendedPriceSpecificationsRequest._childSerializers$_anonymous_();
            case 12:
                return ListItemRequest._childSerializers$_anonymous_();
            case 13:
                return ListItemRequest._childSerializers$_anonymous_$0();
            case 14:
                return ListItemRequest._childSerializers$_anonymous_$1();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return RecommendationsListRequest._childSerializers$_anonymous_();
            case 16:
                return TrackingEventsRequest._childSerializers$_anonymous_();
            case 17:
                return com.braze.models.outgoing.event.a.b();
            case 18:
                return com.braze.models.outgoing.event.a.a();
            case 19:
                return com.braze.models.outgoing.event.b.c();
            case 20:
                return UUID.randomUUID().toString();
            case 21:
                return Unit.f26487a;
            case 22:
                e0 e0Var = l.f15296a;
                return null;
            case 23:
                e0 e0Var2 = m.f15297a;
                return null;
            case 24:
                return Unit.f26487a;
            case 25:
                return BasketDeliveryOptionsRequest._childSerializers$_anonymous_();
            case 26:
                return BasketPaymentMethodsRequest._childSerializers$_anonymous_();
            case 27:
                return BasketPriceSpecificationsRequest._childSerializers$_anonymous_();
            case 28:
                return BasketRequest._childSerializers$_anonymous_();
            default:
                return CreateMultipleItemsOrderRequestV8._childSerializers$_anonymous_();
        }
    }
}
