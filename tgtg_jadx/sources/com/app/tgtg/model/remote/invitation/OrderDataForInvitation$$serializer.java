package com.app.tgtg.model.remote.invitation;

import c50.w;
import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefItemInfo$$serializer;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.brief.BriefStoreInfo$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.StoreLocation$$serializer;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.order.OrderTypeSerializer;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import l90.b;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/invitation/OrderDataForInvitation.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderDataForInvitation$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderDataForInvitation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderDataForInvitation$$serializer orderDataForInvitation$$serializer = new OrderDataForInvitation$$serializer();
        INSTANCE = orderDataForInvitation$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.invitation.OrderDataForInvitation", orderDataForInvitation$$serializer, 6);
        e1Var.j("quantity", false);
        e1Var.j("store_info", false);
        e1Var.j("pickup_location", false);
        e1Var.j("item_info", false);
        e1Var.j("pickup_interval", false);
        e1Var.j("order_type", false);
        descriptor = e1Var;
    }

    private OrderDataForInvitation$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l0.f29821a, BriefStoreInfo$$serializer.INSTANCE, StoreLocation$$serializer.INSTANCE, BriefItemInfo$$serializer.INSTANCE, f0.B(PickupInterval$$serializer.INSTANCE), f0.B(OrderTypeSerializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final OrderDataForInvitation deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        int iQ = 0;
        BriefStoreInfo briefStoreInfo = null;
        StoreLocation storeLocation = null;
        BriefItemInfo briefItemInfo = null;
        PickupInterval pickupInterval = null;
        OrderType orderType = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    iQ = aVarC.q(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    briefStoreInfo = (BriefStoreInfo) aVarC.n(serialDescriptor, 1, BriefStoreInfo$$serializer.INSTANCE, briefStoreInfo);
                    i11 |= 2;
                    break;
                case 2:
                    storeLocation = (StoreLocation) aVarC.n(serialDescriptor, 2, StoreLocation$$serializer.INSTANCE, storeLocation);
                    i11 |= 4;
                    break;
                case 3:
                    briefItemInfo = (BriefItemInfo) aVarC.n(serialDescriptor, 3, BriefItemInfo$$serializer.INSTANCE, briefItemInfo);
                    i11 |= 8;
                    break;
                case 4:
                    pickupInterval = (PickupInterval) aVarC.m(serialDescriptor, 4, PickupInterval$$serializer.INSTANCE, pickupInterval);
                    i11 |= 16;
                    break;
                case 5:
                    orderType = (OrderType) aVarC.m(serialDescriptor, 5, OrderTypeSerializer.INSTANCE, orderType);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new OrderDataForInvitation(i11, iQ, briefStoreInfo, storeLocation, briefItemInfo, pickupInterval, orderType, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderDataForInvitation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        OrderDataForInvitation.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
