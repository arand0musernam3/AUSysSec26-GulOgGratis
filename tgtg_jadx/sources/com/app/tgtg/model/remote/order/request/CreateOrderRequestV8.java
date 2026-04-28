package com.app.tgtg.model.remote.order.request;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ2\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010-R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u00103R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00100\u0012\u0004\b7\u0010/\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u00103¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8;", "Landroid/os/Parcelable;", "", "quantity", "", "deliveryAddressId", "deliveryOptionId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "setQuantity", "(I)V", "getQuantity$annotations", "()V", "Ljava/lang/String;", "getDeliveryAddressId", "setDeliveryAddressId", "(Ljava/lang/String;)V", "getDeliveryAddressId$annotations", "getDeliveryOptionId", "setDeliveryOptionId", "getDeliveryOptionId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CreateOrderRequestV8 implements Parcelable {

    @Nullable
    private String deliveryAddressId;

    @Nullable
    private String deliveryOptionId;
    private int quantity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CreateOrderRequestV8> CREATOR = new Creator();

    public /* synthetic */ CreateOrderRequestV8(int i11, int i12, String str, String str2, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, CreateOrderRequestV8$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.quantity = i12;
        this.deliveryAddressId = str;
        this.deliveryOptionId = str2;
    }

    public static /* synthetic */ CreateOrderRequestV8 copy$default(CreateOrderRequestV8 createOrderRequestV8, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = createOrderRequestV8.quantity;
        }
        if ((i12 & 2) != 0) {
            str = createOrderRequestV8.deliveryAddressId;
        }
        if ((i12 & 4) != 0) {
            str2 = createOrderRequestV8.deliveryOptionId;
        }
        return createOrderRequestV8.copy(i11, str, str2);
    }

    public static final /* synthetic */ void write$Self$app(CreateOrderRequestV8 self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.quantity, serialDesc);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.deliveryAddressId);
        output.r(serialDesc, 2, r1Var, self.deliveryOptionId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeliveryAddressId() {
        return this.deliveryAddressId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    @NotNull
    public final CreateOrderRequestV8 copy(int quantity, @Nullable String deliveryAddressId, @Nullable String deliveryOptionId) {
        return new CreateOrderRequestV8(quantity, deliveryAddressId, deliveryOptionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderRequestV8)) {
            return false;
        }
        CreateOrderRequestV8 createOrderRequestV8 = (CreateOrderRequestV8) other;
        return this.quantity == createOrderRequestV8.quantity && Intrinsics.areEqual(this.deliveryAddressId, createOrderRequestV8.deliveryAddressId) && Intrinsics.areEqual(this.deliveryOptionId, createOrderRequestV8.deliveryOptionId);
    }

    @Nullable
    public final String getDeliveryAddressId() {
        return this.deliveryAddressId;
    }

    @Nullable
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.quantity) * 31;
        String str = this.deliveryAddressId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryOptionId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDeliveryAddressId(@Nullable String str) {
        this.deliveryAddressId = str;
    }

    public final void setDeliveryOptionId(@Nullable String str) {
        this.deliveryOptionId = str;
    }

    public final void setQuantity(int i11) {
        this.quantity = i11;
    }

    @NotNull
    public String toString() {
        int i11 = this.quantity;
        String str = this.deliveryAddressId;
        String str2 = this.deliveryOptionId;
        StringBuilder sb2 = new StringBuilder("CreateOrderRequestV8(quantity=");
        sb2.append(i11);
        sb2.append(", deliveryAddressId=");
        sb2.append(str);
        sb2.append(", deliveryOptionId=");
        return k.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.quantity);
        dest.writeString(this.deliveryAddressId);
        dest.writeString(this.deliveryOptionId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/request/CreateOrderRequestV8;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateOrderRequestV8$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateOrderRequestV8> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateOrderRequestV8 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CreateOrderRequestV8(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateOrderRequestV8[] newArray(int i11) {
            return new CreateOrderRequestV8[i11];
        }
    }

    @g("delivery_address_id")
    public static /* synthetic */ void getDeliveryAddressId$annotations() {
    }

    @g("delivery_option_id")
    public static /* synthetic */ void getDeliveryOptionId$annotations() {
    }

    @g("item_count")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    public CreateOrderRequestV8(int i11, @Nullable String str, @Nullable String str2) {
        this.quantity = i11;
        this.deliveryAddressId = str;
        this.deliveryOptionId = str2;
    }
}
