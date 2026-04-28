package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J2\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010.\u0012\u0004\b6\u00103\u001a\u0004\b4\u0010 \"\u0004\b5\u00101R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00107\u0012\u0004\b:\u00103\u001a\u0004\b\u0007\u0010$\"\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerRateableOrder;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "", "itemName", "", "isMultiItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerRateableOrder;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-awLnToY", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "copy-K7ZHW4I", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerRateableOrder;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId-awLnToY", "setOrderId-0aItd38", "(Ljava/lang/String;)V", "getOrderId-awLnToY$annotations", "()V", "getItemName", "setItemName", "getItemName$annotations", "Z", "setMultiItem", "(Z)V", "isMultiItem$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ManufacturerRateableOrder implements Parcelable {
    private boolean isMultiItem;

    @Nullable
    private String itemName;

    @Nullable
    private String orderId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ManufacturerRateableOrder> CREATOR = new Creator();

    private /* synthetic */ ManufacturerRateableOrder(int i11, String str, String str2, boolean z11, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str;
        }
        if ((i11 & 2) == 0) {
            this.itemName = null;
        } else {
            this.itemName = str2;
        }
        if ((i11 & 4) == 0) {
            this.isMultiItem = false;
        } else {
            this.isMultiItem = z11;
        }
    }

    /* JADX INFO: renamed from: copy-K7ZHW4I$default, reason: not valid java name */
    public static /* synthetic */ ManufacturerRateableOrder m394copyK7ZHW4I$default(ManufacturerRateableOrder manufacturerRateableOrder, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = manufacturerRateableOrder.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = manufacturerRateableOrder.itemName;
        }
        if ((i11 & 4) != 0) {
            z11 = manufacturerRateableOrder.isMultiItem;
        }
        return manufacturerRateableOrder.m397copyK7ZHW4I(str, str2, z11);
    }

    public static final /* synthetic */ void write$Self$app(ManufacturerRateableOrder self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.orderId != null) {
            OrderId$$serializer orderId$$serializer = OrderId$$serializer.INSTANCE;
            String str = self.orderId;
            output.r(serialDesc, 0, orderId$$serializer, str != null ? OrderId.m209boximpl(str) : null);
        }
        if (output.C(serialDesc) || self.itemName != null) {
            output.r(serialDesc, 1, r1.f29848a, self.itemName);
        }
        if (output.C(serialDesc) || self.isMultiItem) {
            output.p(serialDesc, 2, self.isMultiItem);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1-awLnToY, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMultiItem() {
        return this.isMultiItem;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-K7ZHW4I, reason: not valid java name */
    public final ManufacturerRateableOrder m397copyK7ZHW4I(@Nullable String orderId, @Nullable String itemName, boolean isMultiItem) {
        return new ManufacturerRateableOrder(orderId, itemName, isMultiItem, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder r5 = (com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder) r5
            java.lang.String r1 = r4.orderId
            java.lang.String r3 = r5.orderId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.OrderId.m213equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.itemName
            java.lang.String r3 = r5.itemName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.isMultiItem
            boolean r5 = r5.isMultiItem
            if (r1 == r5) goto L34
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.manufacturer.response.ManufacturerRateableOrder.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: getOrderId-awLnToY, reason: not valid java name */
    public final String m398getOrderIdawLnToY() {
        return this.orderId;
    }

    public int hashCode() {
        String str = this.orderId;
        int iM214hashCodeimpl = (str == null ? 0 : OrderId.m214hashCodeimpl(str)) * 31;
        String str2 = this.itemName;
        return Boolean.hashCode(this.isMultiItem) + ((iM214hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isMultiItem() {
        return this.isMultiItem;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setMultiItem(boolean z11) {
        this.isMultiItem = z11;
    }

    /* JADX INFO: renamed from: setOrderId-0aItd38, reason: not valid java name */
    public final void m399setOrderId0aItd38(@Nullable String str) {
        this.orderId = str;
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        return s.o(f.t("ManufacturerRateableOrder(orderId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : OrderId.m215toStringimpl(str), ", itemName=", this.itemName, ", isMultiItem="), this.isMultiItem, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.orderId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            OrderId.m216writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.itemName);
        dest.writeInt(this.isMultiItem ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerRateableOrder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerRateableOrder;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManufacturerRateableOrder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManufacturerRateableOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerRateableOrder createFromParcel(Parcel parcel) {
            parcel.getClass();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OrderId orderIdCreateFromParcel = parcel.readInt() == 0 ? null : OrderId.CREATOR.createFromParcel(parcel);
            return new ManufacturerRateableOrder(orderIdCreateFromParcel != null ? orderIdCreateFromParcel.m217unboximpl() : null, parcel.readString(), parcel.readInt() != 0, defaultConstructorMarker);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerRateableOrder[] newArray(int i11) {
            return new ManufacturerRateableOrder[i11];
        }
    }

    @g("item_name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @g("order_id")
    /* JADX INFO: renamed from: getOrderId-awLnToY$annotations, reason: not valid java name */
    public static /* synthetic */ void m395getOrderIdawLnToY$annotations() {
    }

    @g("is_multi_item")
    public static /* synthetic */ void isMultiItem$annotations() {
    }

    public /* synthetic */ ManufacturerRateableOrder(String str, String str2, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11);
    }

    public /* synthetic */ ManufacturerRateableOrder(int i11, String str, String str2, boolean z11, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, z11, m1Var);
    }

    private ManufacturerRateableOrder(String str, String str2, boolean z11) {
        this.orderId = str;
        this.itemName = str2;
        this.isMultiItem = z11;
    }

    public /* synthetic */ ManufacturerRateableOrder(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11, null);
    }
}
