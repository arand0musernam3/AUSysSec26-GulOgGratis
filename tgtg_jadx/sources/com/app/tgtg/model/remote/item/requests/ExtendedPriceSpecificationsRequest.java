package com.app.tgtg.model.remote.item.requests;

import db0.c;
import i90.a;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001e¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest;", "", "", "startingCounterItemQuantity", "maxItemQuantityCount", "", "deliveryOptionId", "Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationContext;", "context", "<init>", "(IILjava/lang/String;Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationContext;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIILjava/lang/String;Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationContext;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationContext;", "copy", "(IILjava/lang/String;Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationContext;)Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartingCounterItemQuantity", "getStartingCounterItemQuantity$annotations", "()V", "getMaxItemQuantityCount", "getMaxItemQuantityCount$annotations", "Ljava/lang/String;", "getDeliveryOptionId", "getDeliveryOptionId$annotations", "Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationContext;", "getContext", "getContext$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ExtendedPriceSpecificationsRequest {
    public static final int $stable = 0;

    @NotNull
    private final ExtendedPriceSpecificationContext context;

    @Nullable
    private final String deliveryOptionId;
    private final int maxItemQuantityCount;
    private final int startingCounterItemQuantity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, l.a(m.PUBLICATION, new c(11))};

    public /* synthetic */ ExtendedPriceSpecificationsRequest(int i11, int i12, int i13, String str, ExtendedPriceSpecificationContext extendedPriceSpecificationContext, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, ExtendedPriceSpecificationsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.startingCounterItemQuantity = i12;
        this.maxItemQuantityCount = i13;
        this.deliveryOptionId = str;
        this.context = extendedPriceSpecificationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        ExtendedPriceSpecificationContext[] extendedPriceSpecificationContextArrValues = ExtendedPriceSpecificationContext.values();
        extendedPriceSpecificationContextArrValues.getClass();
        return new a("com.app.tgtg.model.remote.item.requests.ExtendedPriceSpecificationContext", (Enum[]) extendedPriceSpecificationContextArrValues);
    }

    public static /* synthetic */ ExtendedPriceSpecificationsRequest copy$default(ExtendedPriceSpecificationsRequest extendedPriceSpecificationsRequest, int i11, int i12, String str, ExtendedPriceSpecificationContext extendedPriceSpecificationContext, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = extendedPriceSpecificationsRequest.startingCounterItemQuantity;
        }
        if ((i13 & 2) != 0) {
            i12 = extendedPriceSpecificationsRequest.maxItemQuantityCount;
        }
        if ((i13 & 4) != 0) {
            str = extendedPriceSpecificationsRequest.deliveryOptionId;
        }
        if ((i13 & 8) != 0) {
            extendedPriceSpecificationContext = extendedPriceSpecificationsRequest.context;
        }
        return extendedPriceSpecificationsRequest.copy(i11, i12, str, extendedPriceSpecificationContext);
    }

    public static final /* synthetic */ void write$Self$app(ExtendedPriceSpecificationsRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.m(0, self.startingCounterItemQuantity, serialDesc);
        output.m(1, self.maxItemQuantityCount, serialDesc);
        output.r(serialDesc, 2, r1.f29848a, self.deliveryOptionId);
        output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.context);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartingCounterItemQuantity() {
        return this.startingCounterItemQuantity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxItemQuantityCount() {
        return this.maxItemQuantityCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExtendedPriceSpecificationContext getContext() {
        return this.context;
    }

    @NotNull
    public final ExtendedPriceSpecificationsRequest copy(int startingCounterItemQuantity, int maxItemQuantityCount, @Nullable String deliveryOptionId, @NotNull ExtendedPriceSpecificationContext context) {
        context.getClass();
        return new ExtendedPriceSpecificationsRequest(startingCounterItemQuantity, maxItemQuantityCount, deliveryOptionId, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedPriceSpecificationsRequest)) {
            return false;
        }
        ExtendedPriceSpecificationsRequest extendedPriceSpecificationsRequest = (ExtendedPriceSpecificationsRequest) other;
        return this.startingCounterItemQuantity == extendedPriceSpecificationsRequest.startingCounterItemQuantity && this.maxItemQuantityCount == extendedPriceSpecificationsRequest.maxItemQuantityCount && Intrinsics.areEqual(this.deliveryOptionId, extendedPriceSpecificationsRequest.deliveryOptionId) && this.context == extendedPriceSpecificationsRequest.context;
    }

    @NotNull
    public final ExtendedPriceSpecificationContext getContext() {
        return this.context;
    }

    @Nullable
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    public final int getMaxItemQuantityCount() {
        return this.maxItemQuantityCount;
    }

    public final int getStartingCounterItemQuantity() {
        return this.startingCounterItemQuantity;
    }

    public int hashCode() {
        int iB = k.b(this.maxItemQuantityCount, Integer.hashCode(this.startingCounterItemQuantity) * 31, 31);
        String str = this.deliveryOptionId;
        return this.context.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.startingCounterItemQuantity;
        int i12 = this.maxItemQuantityCount;
        String str = this.deliveryOptionId;
        ExtendedPriceSpecificationContext extendedPriceSpecificationContext = this.context;
        StringBuilder sbR = k.r(i11, i12, "ExtendedPriceSpecificationsRequest(startingCounterItemQuantity=", ", maxItemQuantityCount=", ", deliveryOptionId=");
        sbR.append(str);
        sbR.append(", context=");
        sbR.append(extendedPriceSpecificationContext);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/ExtendedPriceSpecificationsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ExtendedPriceSpecificationsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("context")
    public static /* synthetic */ void getContext$annotations() {
    }

    @g("delivery_option_id")
    public static /* synthetic */ void getDeliveryOptionId$annotations() {
    }

    @g("max_item_quantity_count")
    public static /* synthetic */ void getMaxItemQuantityCount$annotations() {
    }

    @g("starting_counter_item_quantity")
    public static /* synthetic */ void getStartingCounterItemQuantity$annotations() {
    }

    public ExtendedPriceSpecificationsRequest(int i11, int i12, @Nullable String str, @NotNull ExtendedPriceSpecificationContext extendedPriceSpecificationContext) {
        extendedPriceSpecificationContext.getClass();
        this.startingCounterItemQuantity = i11;
        this.maxItemQuantityCount = i12;
        this.deliveryOptionId = str;
        this.context = extendedPriceSpecificationContext;
    }
}
