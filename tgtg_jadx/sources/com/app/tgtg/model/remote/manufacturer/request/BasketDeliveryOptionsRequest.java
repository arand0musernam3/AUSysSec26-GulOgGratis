package com.app.tgtg.model.remote.manufacturer.request;

import db0.c;
import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0019R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001c¨\u00061"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest;", "", "", "itemId", "userAddressId", "", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketBriefItem;", "basketBriefItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemId", "getItemId$annotations", "()V", "getUserAddressId", "getUserAddressId$annotations", "Ljava/util/List;", "getBasketBriefItems", "getBasketBriefItems$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BasketDeliveryOptionsRequest {

    @Nullable
    private final List<BasketBriefItem> basketBriefItems;

    @Nullable
    private final String itemId;

    @Nullable
    private final String userAddressId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new c(25))};

    public /* synthetic */ BasketDeliveryOptionsRequest(int i11, String str, String str2, List list, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, BasketDeliveryOptionsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.userAddressId = str2;
        this.basketBriefItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketBriefItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketDeliveryOptionsRequest copy$default(BasketDeliveryOptionsRequest basketDeliveryOptionsRequest, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = basketDeliveryOptionsRequest.itemId;
        }
        if ((i11 & 2) != 0) {
            str2 = basketDeliveryOptionsRequest.userAddressId;
        }
        if ((i11 & 4) != 0) {
            list = basketDeliveryOptionsRequest.basketBriefItems;
        }
        return basketDeliveryOptionsRequest.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$app(BasketDeliveryOptionsRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.itemId);
        output.r(serialDesc, 1, r1Var, self.userAddressId);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.basketBriefItems);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    @Nullable
    public final List<BasketBriefItem> component3() {
        return this.basketBriefItems;
    }

    @NotNull
    public final BasketDeliveryOptionsRequest copy(@Nullable String itemId, @Nullable String userAddressId, @Nullable List<BasketBriefItem> basketBriefItems) {
        return new BasketDeliveryOptionsRequest(itemId, userAddressId, basketBriefItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketDeliveryOptionsRequest)) {
            return false;
        }
        BasketDeliveryOptionsRequest basketDeliveryOptionsRequest = (BasketDeliveryOptionsRequest) other;
        return Intrinsics.areEqual(this.itemId, basketDeliveryOptionsRequest.itemId) && Intrinsics.areEqual(this.userAddressId, basketDeliveryOptionsRequest.userAddressId) && Intrinsics.areEqual(this.basketBriefItems, basketDeliveryOptionsRequest.basketBriefItems);
    }

    @Nullable
    public final List<BasketBriefItem> getBasketBriefItems() {
        return this.basketBriefItems;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    public int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userAddressId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BasketBriefItem> list = this.basketBriefItems;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String str2 = this.userAddressId;
        return f.p(f.t("BasketDeliveryOptionsRequest(itemId=", str, ", userAddressId=", str2, ", basketBriefItems="), this.basketBriefItems, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketDeliveryOptionsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketDeliveryOptionsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("basket_items")
    public static /* synthetic */ void getBasketBriefItems$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getItemId$annotations() {
    }

    @g("user_address_id")
    public static /* synthetic */ void getUserAddressId$annotations() {
    }

    public BasketDeliveryOptionsRequest(@Nullable String str, @Nullable String str2, @Nullable List<BasketBriefItem> list) {
        this.itemId = str;
        this.userAddressId = str2;
        this.basketBriefItems = list;
    }
}
