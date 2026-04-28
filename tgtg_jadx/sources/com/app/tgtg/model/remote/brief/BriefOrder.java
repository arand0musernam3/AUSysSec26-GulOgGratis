package com.app.tgtg.model.remote.brief;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderStateSerializer;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.order.OrderTypeSerializer;
import e0.f;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import xw.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 }2\u00020\u0001:\u0002}~B\u0091\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB§\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b)\u0010(J\u001d\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001e¢\u0006\u0004\b.\u0010/J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u00101J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u00101J\u0012\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bD\u00101J\u0012\u0010E\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bE\u00101J\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bH\u0010IJ´\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bM\u00101J'\u0010U\u001a\u00020-2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0001¢\u0006\u0004\bS\u0010TR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010V\u0012\u0004\b[\u0010Y\u001a\u0004\bZ\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u0012\u0004\b^\u0010Y\u001a\u0004\b]\u00106R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010_\u0012\u0004\ba\u0010Y\u001a\u0004\b`\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010b\u0012\u0004\bd\u0010Y\u001a\u0004\bc\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010e\u0012\u0004\bg\u0010Y\u001a\u0004\bf\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010h\u0012\u0004\bj\u0010Y\u001a\u0004\bi\u0010>R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010k\u0012\u0004\bm\u0010Y\u001a\u0004\bl\u0010@R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010n\u0012\u0004\bp\u0010Y\u001a\u0004\bo\u0010BR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010V\u0012\u0004\br\u0010Y\u001a\u0004\bq\u00101R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010V\u0012\u0004\bt\u0010Y\u001a\u0004\bs\u00101R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010V\u0012\u0004\bv\u0010Y\u001a\u0004\bu\u00101R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010w\u0012\u0004\bx\u0010Y\u001a\u0004\b\u0019\u0010GR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010y\u001a\u0004\bz\u0010I\"\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefOrder;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/UserId;", "userId", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "Lcom/app/tgtg/model/remote/order/OrderState;", "orderState", "Lcom/app/tgtg/model/remote/order/OrderType;", "orderType", "Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;", "briefRatingInfo", "Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "briefStoreInfo", "Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "briefItemInfo", "Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;", "briefRefundOrCancelInfo", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "timeInterval", "", "lastUpdatedAtUtc", "timeOfPurchase", "invitationId", "", "isMultiItem", "Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;", "changeState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderState;Lcom/app/tgtg/model/remote/order/OrderType;Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;Lcom/app/tgtg/model/remote/item/PickupInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderState;Lcom/app/tgtg/model/remote/order/OrderType;Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;Lcom/app/tgtg/model/remote/item/PickupInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-4FZwupo", "()Ljava/lang/String;", "component1", "component2-reIZeYA", "component2", "component3", "()Lcom/app/tgtg/model/remote/order/OrderState;", "component4", "()Lcom/app/tgtg/model/remote/order/OrderType;", "component5", "()Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;", "component6", "()Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "component7", "()Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "component8", "()Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;", "component9", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component10", "component11", "component12", "component13", "()Ljava/lang/Boolean;", "component14", "()Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;", "copy-FvkW4ME", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderState;Lcom/app/tgtg/model/remote/order/OrderType;Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;Lcom/app/tgtg/model/remote/item/PickupInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;)Lcom/app/tgtg/model/remote/brief/BriefOrder;", "copy", "toString", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/brief/BriefOrder;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUserId-4FZwupo", "getUserId-4FZwupo$annotations", "()V", "getOrderId-reIZeYA", "getOrderId-reIZeYA$annotations", "Lcom/app/tgtg/model/remote/order/OrderState;", "getOrderState", "getOrderState$annotations", "Lcom/app/tgtg/model/remote/order/OrderType;", "getOrderType", "getOrderType$annotations", "Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;", "getBriefRatingInfo", "getBriefRatingInfo$annotations", "Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "getBriefStoreInfo", "getBriefStoreInfo$annotations", "Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "getBriefItemInfo", "getBriefItemInfo$annotations", "Lcom/app/tgtg/model/remote/brief/BriefRefundOrCancelInfo;", "getBriefRefundOrCancelInfo", "getBriefRefundOrCancelInfo$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getTimeInterval", "getTimeInterval$annotations", "getLastUpdatedAtUtc", "getLastUpdatedAtUtc$annotations", "getTimeOfPurchase", "getTimeOfPurchase$annotations", "getInvitationId", "getInvitationId$annotations", "Ljava/lang/Boolean;", "isMultiItem$annotations", "Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;", "getChangeState", "setChangeState", "(Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;)V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BriefOrder implements Parcelable {

    @Nullable
    private final BriefItemInfo briefItemInfo;

    @Nullable
    private final BriefRatingInfo briefRatingInfo;

    @Nullable
    private final BriefRefundOrCancelInfo briefRefundOrCancelInfo;

    @Nullable
    private final BriefStoreInfo briefStoreInfo;

    @NotNull
    private BriefOrderChangeState changeState;

    @Nullable
    private final String invitationId;

    @Nullable
    private final Boolean isMultiItem;

    @Nullable
    private final String lastUpdatedAtUtc;

    @NotNull
    private final String orderId;

    @Nullable
    private final OrderState orderState;

    @Nullable
    private final OrderType orderType;

    @Nullable
    private final PickupInterval timeInterval;

    @Nullable
    private final String timeOfPurchase;

    @Nullable
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BriefOrder> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new a(25))};

    private /* synthetic */ BriefOrder(int i11, String str, String str2, OrderState orderState, OrderType orderType, BriefRatingInfo briefRatingInfo, BriefStoreInfo briefStoreInfo, BriefItemInfo briefItemInfo, BriefRefundOrCancelInfo briefRefundOrCancelInfo, PickupInterval pickupInterval, String str3, String str4, String str5, Boolean bool, BriefOrderChangeState briefOrderChangeState, m1 m1Var) {
        if (8191 != (i11 & 8191)) {
            c1.j(i11, 8191, BriefOrder$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.orderId = str2;
        this.orderState = orderState;
        this.orderType = orderType;
        this.briefRatingInfo = briefRatingInfo;
        this.briefStoreInfo = briefStoreInfo;
        this.briefItemInfo = briefItemInfo;
        this.briefRefundOrCancelInfo = briefRefundOrCancelInfo;
        this.timeInterval = pickupInterval;
        this.lastUpdatedAtUtc = str3;
        this.timeOfPurchase = str4;
        this.invitationId = str5;
        this.isMultiItem = bool;
        this.changeState = (i11 & 8192) == 0 ? BriefOrderChangeState.NO_CHANGE : briefOrderChangeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        BriefOrderChangeState[] briefOrderChangeStateArrValues = BriefOrderChangeState.values();
        briefOrderChangeStateArrValues.getClass();
        return new i90.a("com.app.tgtg.model.remote.brief.BriefOrderChangeState", (Enum[]) briefOrderChangeStateArrValues);
    }

    public static final /* synthetic */ void write$Self$app(BriefOrder self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        String str = self.userId;
        output.r(serialDesc, 0, userId$$serializer, str != null ? UserId.m286boximpl(str) : null);
        output.i(serialDesc, 1, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(self.orderId));
        output.r(serialDesc, 2, OrderStateSerializer.INSTANCE, self.orderState);
        output.r(serialDesc, 3, OrderTypeSerializer.INSTANCE, self.orderType);
        output.r(serialDesc, 4, BriefRatingInfo$$serializer.INSTANCE, self.briefRatingInfo);
        output.r(serialDesc, 5, BriefStoreInfo$$serializer.INSTANCE, self.briefStoreInfo);
        output.r(serialDesc, 6, BriefItemInfo$$serializer.INSTANCE, self.briefItemInfo);
        output.r(serialDesc, 7, BriefRefundOrCancelInfo$$serializer.INSTANCE, self.briefRefundOrCancelInfo);
        output.r(serialDesc, 8, PickupInterval$$serializer.INSTANCE, self.timeInterval);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 9, r1Var, self.lastUpdatedAtUtc);
        output.r(serialDesc, 10, r1Var, self.timeOfPurchase);
        output.r(serialDesc, 11, r1Var, self.invitationId);
        output.r(serialDesc, 12, g.f29797a, self.isMultiItem);
        if (!output.C(serialDesc) && self.changeState == BriefOrderChangeState.NO_CHANGE) {
            return;
        }
        output.i(serialDesc, 13, (KSerializer) jVarArr[13].getValue(), self.changeState);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-4FZwupo, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLastUpdatedAtUtc() {
        return this.lastUpdatedAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTimeOfPurchase() {
        return this.timeOfPurchase;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getInvitationId() {
        return this.invitationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsMultiItem() {
        return this.isMultiItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BriefOrderChangeState getChangeState() {
        return this.changeState;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-reIZeYA, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BriefRatingInfo getBriefRatingInfo() {
        return this.briefRatingInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BriefStoreInfo getBriefStoreInfo() {
        return this.briefStoreInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BriefItemInfo getBriefItemInfo() {
        return this.briefItemInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BriefRefundOrCancelInfo getBriefRefundOrCancelInfo() {
        return this.briefRefundOrCancelInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PickupInterval getTimeInterval() {
        return this.timeInterval;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-FvkW4ME, reason: not valid java name */
    public final BriefOrder m320copyFvkW4ME(@Nullable String userId, @NotNull String orderId, @Nullable OrderState orderState, @Nullable OrderType orderType, @Nullable BriefRatingInfo briefRatingInfo, @Nullable BriefStoreInfo briefStoreInfo, @Nullable BriefItemInfo briefItemInfo, @Nullable BriefRefundOrCancelInfo briefRefundOrCancelInfo, @Nullable PickupInterval timeInterval, @Nullable String lastUpdatedAtUtc, @Nullable String timeOfPurchase, @Nullable String invitationId, @Nullable Boolean isMultiItem, @NotNull BriefOrderChangeState changeState) {
        orderId.getClass();
        changeState.getClass();
        return new BriefOrder(userId, orderId, orderState, orderType, briefRatingInfo, briefStoreInfo, briefItemInfo, briefRefundOrCancelInfo, timeInterval, lastUpdatedAtUtc, timeOfPurchase, invitationId, isMultiItem, changeState, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.app.tgtg.model.remote.brief.BriefOrder
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r4.userId
            com.app.tgtg.model.remote.brief.BriefOrder r5 = (com.app.tgtg.model.remote.brief.BriefOrder) r5
            java.lang.String r2 = r5.userId
            r3 = 1
            if (r0 != 0) goto L15
            if (r2 != 0) goto L13
            r0 = r3
            goto L1c
        L13:
            r0 = r1
            goto L1c
        L15:
            if (r2 != 0) goto L18
            goto L13
        L18:
            boolean r0 = com.app.tgtg.model.remote.UserId.m290equalsimpl0(r0, r2)
        L1c:
            if (r0 != 0) goto L1f
            return r1
        L1f:
            java.lang.String r0 = r4.orderId
            java.lang.String r2 = r5.orderId
            boolean r0 = com.app.tgtg.model.remote.OrderId.m213equalsimpl0(r0, r2)
            if (r0 != 0) goto L2a
            return r1
        L2a:
            com.app.tgtg.model.remote.order.OrderState r0 = r4.orderState
            com.app.tgtg.model.remote.order.OrderState r2 = r5.orderState
            if (r0 == r2) goto L31
            return r1
        L31:
            com.app.tgtg.model.remote.order.OrderType r0 = r4.orderType
            com.app.tgtg.model.remote.order.OrderType r2 = r5.orderType
            if (r0 == r2) goto L38
            return r1
        L38:
            com.app.tgtg.model.remote.brief.BriefRatingInfo r0 = r4.briefRatingInfo
            com.app.tgtg.model.remote.brief.BriefRatingInfo r2 = r5.briefRatingInfo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L43
            return r1
        L43:
            com.app.tgtg.model.remote.brief.BriefStoreInfo r0 = r4.briefStoreInfo
            com.app.tgtg.model.remote.brief.BriefStoreInfo r2 = r5.briefStoreInfo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L4e
            return r1
        L4e:
            com.app.tgtg.model.remote.brief.BriefItemInfo r0 = r4.briefItemInfo
            com.app.tgtg.model.remote.brief.BriefItemInfo r2 = r5.briefItemInfo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L59
            return r1
        L59:
            com.app.tgtg.model.remote.brief.BriefRefundOrCancelInfo r0 = r4.briefRefundOrCancelInfo
            com.app.tgtg.model.remote.brief.BriefRefundOrCancelInfo r2 = r5.briefRefundOrCancelInfo
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L64
            return r1
        L64:
            com.app.tgtg.model.remote.item.PickupInterval r0 = r4.timeInterval
            com.app.tgtg.model.remote.item.PickupInterval r2 = r5.timeInterval
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L6f
            return r1
        L6f:
            java.lang.String r0 = r4.lastUpdatedAtUtc
            java.lang.String r2 = r5.lastUpdatedAtUtc
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L7a
            return r1
        L7a:
            java.lang.String r0 = r4.timeOfPurchase
            java.lang.String r5 = r5.timeOfPurchase
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r5 != 0) goto L85
            return r1
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.brief.BriefOrder.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final BriefItemInfo getBriefItemInfo() {
        return this.briefItemInfo;
    }

    @Nullable
    public final BriefRatingInfo getBriefRatingInfo() {
        return this.briefRatingInfo;
    }

    @Nullable
    public final BriefRefundOrCancelInfo getBriefRefundOrCancelInfo() {
        return this.briefRefundOrCancelInfo;
    }

    @Nullable
    public final BriefStoreInfo getBriefStoreInfo() {
        return this.briefStoreInfo;
    }

    @NotNull
    public final BriefOrderChangeState getChangeState() {
        return this.changeState;
    }

    @Nullable
    public final String getInvitationId() {
        return this.invitationId;
    }

    @Nullable
    public final String getLastUpdatedAtUtc() {
        return this.lastUpdatedAtUtc;
    }

    @NotNull
    /* JADX INFO: renamed from: getOrderId-reIZeYA, reason: not valid java name */
    public final String m321getOrderIdreIZeYA() {
        return this.orderId;
    }

    @Nullable
    public final OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final PickupInterval getTimeInterval() {
        return this.timeInterval;
    }

    @Nullable
    public final String getTimeOfPurchase() {
        return this.timeOfPurchase;
    }

    @Nullable
    /* JADX INFO: renamed from: getUserId-4FZwupo, reason: not valid java name */
    public final String m322getUserId4FZwupo() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iM214hashCodeimpl = OrderId.m214hashCodeimpl(this.orderId) + (str != null ? UserId.m291hashCodeimpl(str) : 0);
        OrderState orderState = this.orderState;
        int iHashCode = iM214hashCodeimpl + (orderState != null ? orderState.hashCode() : 0);
        OrderType orderType = this.orderType;
        int iHashCode2 = iHashCode + (orderType != null ? orderType.hashCode() : 0);
        BriefRatingInfo briefRatingInfo = this.briefRatingInfo;
        int iHashCode3 = iHashCode2 + (briefRatingInfo != null ? briefRatingInfo.hashCode() : 0);
        BriefStoreInfo briefStoreInfo = this.briefStoreInfo;
        int iHashCode4 = iHashCode3 + (briefStoreInfo != null ? briefStoreInfo.hashCode() : 0);
        BriefItemInfo briefItemInfo = this.briefItemInfo;
        int iHashCode5 = iHashCode4 + (briefItemInfo != null ? briefItemInfo.hashCode() : 0);
        BriefRefundOrCancelInfo briefRefundOrCancelInfo = this.briefRefundOrCancelInfo;
        int iHashCode6 = iHashCode5 + (briefRefundOrCancelInfo != null ? briefRefundOrCancelInfo.hashCode() : 0);
        PickupInterval pickupInterval = this.timeInterval;
        int iHashCode7 = iHashCode6 + (pickupInterval != null ? pickupInterval.hashCode() : 0);
        String str2 = this.lastUpdatedAtUtc;
        int iHashCode8 = iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        String str3 = this.timeOfPurchase;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMultiItem() {
        return this.isMultiItem;
    }

    public final void setChangeState(@NotNull BriefOrderChangeState briefOrderChangeState) {
        briefOrderChangeState.getClass();
        this.changeState = briefOrderChangeState;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String strM292toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : UserId.m292toStringimpl(str);
        String strM215toStringimpl = OrderId.m215toStringimpl(this.orderId);
        OrderState orderState = this.orderState;
        OrderType orderType = this.orderType;
        BriefRatingInfo briefRatingInfo = this.briefRatingInfo;
        BriefStoreInfo briefStoreInfo = this.briefStoreInfo;
        BriefItemInfo briefItemInfo = this.briefItemInfo;
        BriefRefundOrCancelInfo briefRefundOrCancelInfo = this.briefRefundOrCancelInfo;
        PickupInterval pickupInterval = this.timeInterval;
        String str2 = this.lastUpdatedAtUtc;
        String str3 = this.timeOfPurchase;
        String str4 = this.invitationId;
        Boolean bool = this.isMultiItem;
        BriefOrderChangeState briefOrderChangeState = this.changeState;
        StringBuilder sbT = f.t("BriefOrder(userId=", strM292toStringimpl, ", orderId=", strM215toStringimpl, ", orderState=");
        sbT.append(orderState);
        sbT.append(", orderType=");
        sbT.append(orderType);
        sbT.append(", briefRatingInfo=");
        sbT.append(briefRatingInfo);
        sbT.append(", briefStoreInfo=");
        sbT.append(briefStoreInfo);
        sbT.append(", briefItemInfo=");
        sbT.append(briefItemInfo);
        sbT.append(", briefRefundOrCancelInfo=");
        sbT.append(briefRefundOrCancelInfo);
        sbT.append(", timeInterval=");
        sbT.append(pickupInterval);
        sbT.append(", lastUpdatedAtUtc=");
        sbT.append(str2);
        sbT.append(", timeOfPurchase=");
        s.A(sbT, str3, ", invitationId=", str4, ", isMultiItem=");
        sbT.append(bool);
        sbT.append(", changeState=");
        sbT.append(briefOrderChangeState);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.userId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            UserId.m293writeToParcelimpl(str, dest, flags);
        }
        OrderId.m216writeToParcelimpl(this.orderId, dest, flags);
        OrderState orderState = this.orderState;
        if (orderState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(orderState.name());
        }
        OrderType orderType = this.orderType;
        if (orderType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(orderType.name());
        }
        BriefRatingInfo briefRatingInfo = this.briefRatingInfo;
        if (briefRatingInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            briefRatingInfo.writeToParcel(dest, flags);
        }
        BriefStoreInfo briefStoreInfo = this.briefStoreInfo;
        if (briefStoreInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            briefStoreInfo.writeToParcel(dest, flags);
        }
        BriefItemInfo briefItemInfo = this.briefItemInfo;
        if (briefItemInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            briefItemInfo.writeToParcel(dest, flags);
        }
        BriefRefundOrCancelInfo briefRefundOrCancelInfo = this.briefRefundOrCancelInfo;
        if (briefRefundOrCancelInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            briefRefundOrCancelInfo.writeToParcel(dest, flags);
        }
        PickupInterval pickupInterval = this.timeInterval;
        if (pickupInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupInterval.writeToParcel(dest, flags);
        }
        dest.writeString(this.lastUpdatedAtUtc);
        dest.writeString(this.timeOfPurchase);
        dest.writeString(this.invitationId);
        Boolean bool = this.isMultiItem;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        dest.writeString(this.changeState.name());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0005J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefOrder$Companion;", "", "<init>", "()V", "orderToBriefOrder", "Lcom/app/tgtg/model/remote/brief/BriefOrder;", "userId", "Lcom/app/tgtg/model/remote/UserId;", "order", "Lcom/app/tgtg/model/remote/order/Order;", "orderToBriefOrder-ao2lPlI", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/order/Order;)Lcom/app/tgtg/model/remote/brief/BriefOrder;", "getTestBriefOrder", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final BriefOrder getTestBriefOrder() {
            String strM287constructorimpl = UserId.m287constructorimpl("64277573066122016");
            String strM210constructorimpl = OrderId.m210constructorimpl("mb6qzr4ep6xv0");
            OrderState orderState = OrderState.CANCELLED;
            OrderType orderType = OrderType.MAGICBAG;
            Boolean bool = Boolean.FALSE;
            Integer num = null;
            String str = "bounty06@tgtg.io";
            String str2 = "DK";
            String str3 = "";
            return new BriefOrder(strM287constructorimpl, strM210constructorimpl, orderState, orderType, new BriefRatingInfo(bool, num, 2, (DefaultConstructorMarker) (null == true ? 1 : 0)), new BriefStoreInfo(StoreId.m270constructorimpl("220046"), str, str2, str3, "Europe/Copenhagen", null), new BriefItemInfo(ItemId.m198constructorimpl("240053"), "🥨 Pretzels", "", null == true ? 1 : 0), new BriefRefundOrCancelInfo(PaymentState.RESERVATION_LIFTED, CancellingEntity.ADMIN, "2024-09-17T10:34:14Z", 14), new PickupInterval("2024-09-16T22:14:55Z", "2024-09-17T21:59:00Z"), "2024-09-17T10:34:16Z", "2024-09-17T10:33:10Z", null == true ? 1 : 0, bool, BriefOrderChangeState.CANCELLED, null);
        }

        @NotNull
        /* JADX INFO: renamed from: orderToBriefOrder-ao2lPlI, reason: not valid java name */
        public final BriefOrder m323orderToBriefOrderao2lPlI(@Nullable String userId, @NotNull Order order) {
            order.getClass();
            BriefRatingInfo briefRatingInfo = new BriefRatingInfo(Boolean.valueOf(order.getCanBeRated()), order.getOverallRating());
            String strM431getStoreIdQ2NXY1A = order.m431getStoreIdQ2NXY1A();
            String storeNameAndBranch = order.getStoreNameAndBranch();
            Picture storeLogo = order.getStoreLogo();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BriefStoreInfo briefStoreInfo = new BriefStoreInfo(strM431getStoreIdQ2NXY1A, storeNameAndBranch, null, storeLogo != null ? storeLogo.getCurrentUrl() : null, order.getStoreTimeZone(), null);
            String strM428getItemIdRWxzYZM = order.m428getItemIdRWxzYZM();
            String itemName = order.getItemName();
            Picture itemLogo = order.getItemLogo();
            return new BriefOrder(userId, order.m429getOrderIdreIZeYA(), order.getState(), order.getOrderType(), briefRatingInfo, briefStoreInfo, new BriefItemInfo(strM428getItemIdRWxzYZM, itemName, itemLogo != null ? itemLogo.getCurrentUrl() : null, defaultConstructorMarker), new BriefRefundOrCancelInfo(order.getPaymentState(), order.getCancellingEntity(), order.getCancelledOrRefundedAtUtc(), Integer.valueOf(order.getExpectedBankDays())), order.getPickupInterval(), null, null, null, order.isMultiItem(), BriefOrderChangeState.NO_CHANGE, null);
        }

        @NotNull
        public final KSerializer serializer() {
            return BriefOrder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BriefOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefOrder createFromParcel(Parcel parcel) {
            parcel.getClass();
            UserId userIdCreateFromParcel = parcel.readInt() == 0 ? null : UserId.CREATOR.createFromParcel(parcel);
            String strM294unboximpl = userIdCreateFromParcel != null ? userIdCreateFromParcel.m294unboximpl() : null;
            String strM217unboximpl = OrderId.CREATOR.createFromParcel(parcel).m217unboximpl();
            OrderState orderStateValueOf = parcel.readInt() == 0 ? null : OrderState.valueOf(parcel.readString());
            OrderType orderTypeValueOf = parcel.readInt() == 0 ? null : OrderType.valueOf(parcel.readString());
            BriefRatingInfo briefRatingInfoCreateFromParcel = parcel.readInt() == 0 ? null : BriefRatingInfo.CREATOR.createFromParcel(parcel);
            BriefStoreInfo briefStoreInfoCreateFromParcel = parcel.readInt() == 0 ? null : BriefStoreInfo.CREATOR.createFromParcel(parcel);
            BriefItemInfo briefItemInfoCreateFromParcel = parcel.readInt() == 0 ? null : BriefItemInfo.CREATOR.createFromParcel(parcel);
            BriefRefundOrCancelInfo briefRefundOrCancelInfoCreateFromParcel = parcel.readInt() == 0 ? null : BriefRefundOrCancelInfo.CREATOR.createFromParcel(parcel);
            PickupInterval pickupIntervalCreateFromParcel = parcel.readInt() == 0 ? null : PickupInterval.CREATOR.createFromParcel(parcel);
            String str = strM294unboximpl;
            OrderType orderType = orderTypeValueOf;
            String string = parcel.readString();
            OrderState orderState = orderStateValueOf;
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BriefOrder(str, strM217unboximpl, orderState, orderType, briefRatingInfoCreateFromParcel, briefStoreInfoCreateFromParcel, briefItemInfoCreateFromParcel, briefRefundOrCancelInfoCreateFromParcel, pickupIntervalCreateFromParcel, string, string2, string3, boolValueOf, BriefOrderChangeState.valueOf(parcel.readString()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefOrder[] newArray(int i11) {
            return new BriefOrder[i11];
        }
    }

    @i90.g("item_info")
    public static /* synthetic */ void getBriefItemInfo$annotations() {
    }

    @i90.g("rating_info")
    public static /* synthetic */ void getBriefRatingInfo$annotations() {
    }

    @i90.g("refund_or_cancel_info")
    public static /* synthetic */ void getBriefRefundOrCancelInfo$annotations() {
    }

    @i90.g("store_info")
    public static /* synthetic */ void getBriefStoreInfo$annotations() {
    }

    @i90.g("invitation_id")
    public static /* synthetic */ void getInvitationId$annotations() {
    }

    @i90.g("last_updated_at_utc")
    public static /* synthetic */ void getLastUpdatedAtUtc$annotations() {
    }

    @i90.g("order_id")
    /* JADX INFO: renamed from: getOrderId-reIZeYA$annotations, reason: not valid java name */
    public static /* synthetic */ void m316getOrderIdreIZeYA$annotations() {
    }

    @i90.g("order_state")
    public static /* synthetic */ void getOrderState$annotations() {
    }

    @i90.g("order_type")
    public static /* synthetic */ void getOrderType$annotations() {
    }

    @i90.g("pickup_window")
    public static /* synthetic */ void getTimeInterval$annotations() {
    }

    @i90.g("time_of_purchase_utc")
    public static /* synthetic */ void getTimeOfPurchase$annotations() {
    }

    @i90.g("user_id")
    /* JADX INFO: renamed from: getUserId-4FZwupo$annotations, reason: not valid java name */
    public static /* synthetic */ void m317getUserId4FZwupo$annotations() {
    }

    @i90.g("is_multi_item")
    public static /* synthetic */ void isMultiItem$annotations() {
    }

    public /* synthetic */ BriefOrder(String str, String str2, OrderState orderState, OrderType orderType, BriefRatingInfo briefRatingInfo, BriefStoreInfo briefStoreInfo, BriefItemInfo briefItemInfo, BriefRefundOrCancelInfo briefRefundOrCancelInfo, PickupInterval pickupInterval, String str3, String str4, String str5, Boolean bool, BriefOrderChangeState briefOrderChangeState, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, orderState, orderType, briefRatingInfo, briefStoreInfo, briefItemInfo, briefRefundOrCancelInfo, pickupInterval, str3, str4, str5, bool, briefOrderChangeState);
    }

    public /* synthetic */ BriefOrder(int i11, String str, String str2, OrderState orderState, OrderType orderType, BriefRatingInfo briefRatingInfo, BriefStoreInfo briefStoreInfo, BriefItemInfo briefItemInfo, BriefRefundOrCancelInfo briefRefundOrCancelInfo, PickupInterval pickupInterval, String str3, String str4, String str5, Boolean bool, BriefOrderChangeState briefOrderChangeState, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, orderState, orderType, briefRatingInfo, briefStoreInfo, briefItemInfo, briefRefundOrCancelInfo, pickupInterval, str3, str4, str5, bool, briefOrderChangeState, m1Var);
    }

    private BriefOrder(String str, String str2, OrderState orderState, OrderType orderType, BriefRatingInfo briefRatingInfo, BriefStoreInfo briefStoreInfo, BriefItemInfo briefItemInfo, BriefRefundOrCancelInfo briefRefundOrCancelInfo, PickupInterval pickupInterval, String str3, String str4, String str5, Boolean bool, BriefOrderChangeState briefOrderChangeState) {
        str2.getClass();
        briefOrderChangeState.getClass();
        this.userId = str;
        this.orderId = str2;
        this.orderState = orderState;
        this.orderType = orderType;
        this.briefRatingInfo = briefRatingInfo;
        this.briefStoreInfo = briefStoreInfo;
        this.briefItemInfo = briefItemInfo;
        this.briefRefundOrCancelInfo = briefRefundOrCancelInfo;
        this.timeInterval = pickupInterval;
        this.lastUpdatedAtUtc = str3;
        this.timeOfPurchase = str4;
        this.invitationId = str5;
        this.isMultiItem = bool;
        this.changeState = briefOrderChangeState;
    }

    public /* synthetic */ BriefOrder(String str, String str2, OrderState orderState, OrderType orderType, BriefRatingInfo briefRatingInfo, BriefStoreInfo briefStoreInfo, BriefItemInfo briefItemInfo, BriefRefundOrCancelInfo briefRefundOrCancelInfo, PickupInterval pickupInterval, String str3, String str4, String str5, Boolean bool, BriefOrderChangeState briefOrderChangeState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, orderState, orderType, briefRatingInfo, briefStoreInfo, briefItemInfo, briefRefundOrCancelInfo, pickupInterval, str3, str4, str5, bool, (i11 & 8192) != 0 ? BriefOrderChangeState.NO_CHANGE : briefOrderChangeState, null);
    }
}
