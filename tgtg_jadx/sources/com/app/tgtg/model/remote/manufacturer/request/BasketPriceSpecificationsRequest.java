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
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u0019¨\u00061"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest;", "", "", "countryId", "", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketBriefItem;", "basketItems", "userAddressId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "()V", "Ljava/util/List;", "getBasketItems", "getBasketItems$annotations", "getUserAddressId", "getUserAddressId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BasketPriceSpecificationsRequest {

    @NotNull
    private final List<BasketBriefItem> basketItems;

    @NotNull
    private final String countryId;

    @Nullable
    private final String userAddressId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new c(27)), null};

    public /* synthetic */ BasketPriceSpecificationsRequest(int i11, String str, List list, String str2, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, BasketPriceSpecificationsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.countryId = str;
        this.basketItems = list;
        this.userAddressId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketBriefItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketPriceSpecificationsRequest copy$default(BasketPriceSpecificationsRequest basketPriceSpecificationsRequest, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = basketPriceSpecificationsRequest.countryId;
        }
        if ((i11 & 2) != 0) {
            list = basketPriceSpecificationsRequest.basketItems;
        }
        if ((i11 & 4) != 0) {
            str2 = basketPriceSpecificationsRequest.userAddressId;
        }
        return basketPriceSpecificationsRequest.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$app(BasketPriceSpecificationsRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.countryId);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.basketItems);
        output.r(serialDesc, 2, r1.f29848a, self.userAddressId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final List<BasketBriefItem> component2() {
        return this.basketItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    @NotNull
    public final BasketPriceSpecificationsRequest copy(@NotNull String countryId, @NotNull List<BasketBriefItem> basketItems, @Nullable String userAddressId) {
        countryId.getClass();
        basketItems.getClass();
        return new BasketPriceSpecificationsRequest(countryId, basketItems, userAddressId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketPriceSpecificationsRequest)) {
            return false;
        }
        BasketPriceSpecificationsRequest basketPriceSpecificationsRequest = (BasketPriceSpecificationsRequest) other;
        return Intrinsics.areEqual(this.countryId, basketPriceSpecificationsRequest.countryId) && Intrinsics.areEqual(this.basketItems, basketPriceSpecificationsRequest.basketItems) && Intrinsics.areEqual(this.userAddressId, basketPriceSpecificationsRequest.userAddressId);
    }

    @NotNull
    public final List<BasketBriefItem> getBasketItems() {
        return this.basketItems;
    }

    @NotNull
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    public int hashCode() {
        int iC = f.c(this.basketItems, this.countryId.hashCode() * 31, 31);
        String str = this.userAddressId;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.countryId;
        List<BasketBriefItem> list = this.basketItems;
        String str2 = this.userAddressId;
        StringBuilder sb2 = new StringBuilder("BasketPriceSpecificationsRequest(countryId=");
        sb2.append(str);
        sb2.append(", basketItems=");
        sb2.append(list);
        sb2.append(", userAddressId=");
        return k.p(sb2, str2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketPriceSpecificationsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketPriceSpecificationsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("basket_items")
    public static /* synthetic */ void getBasketItems$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("user_address_id")
    public static /* synthetic */ void getUserAddressId$annotations() {
    }

    public BasketPriceSpecificationsRequest(@NotNull String str, @NotNull List<BasketBriefItem> list, @Nullable String str2) {
        str.getClass();
        list.getClass();
        this.countryId = str;
        this.basketItems = list;
        this.userAddressId = str2;
    }
}
