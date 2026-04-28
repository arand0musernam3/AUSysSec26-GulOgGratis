package com.app.tgtg.model.remote.manufacturer.request;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import db0.c;
import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010#JD\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010/\u0012\u0004\b3\u00104\u001a\u0004\b0\u0010!\"\u0004\b1\u00102R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00105\u0012\u0004\b9\u00104\u001a\u0004\b6\u0010#\"\u0004\b7\u00108R*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00105\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010#\"\u0004\b;\u00108R*\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00105\u0012\u0004\b?\u00104\u001a\u0004\b=\u0010#\"\u0004\b>\u00108¨\u0006B"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/manufacturer/request/BasketBriefItem;", "items", "", "deliveryAddressId", "deliveryOptionId", "countryId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "setItems", "(Ljava/util/List;)V", "getItems$annotations", "()V", "Ljava/lang/String;", "getDeliveryAddressId", "setDeliveryAddressId", "(Ljava/lang/String;)V", "getDeliveryAddressId$annotations", "getDeliveryOptionId", "setDeliveryOptionId", "getDeliveryOptionId$annotations", "getCountryId", "setCountryId", "getCountryId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CreateMultipleItemsOrderRequestV8 implements Parcelable {

    @Nullable
    private String countryId;

    @Nullable
    private String deliveryAddressId;

    @Nullable
    private String deliveryOptionId;

    @NotNull
    private List<BasketBriefItem> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CreateMultipleItemsOrderRequestV8> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new c(29)), null, null, null};

    public /* synthetic */ CreateMultipleItemsOrderRequestV8(int i11, List list, String str, String str2, String str3, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, CreateMultipleItemsOrderRequestV8$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.items = list;
        this.deliveryAddressId = str;
        this.deliveryOptionId = str2;
        this.countryId = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketBriefItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateMultipleItemsOrderRequestV8 copy$default(CreateMultipleItemsOrderRequestV8 createMultipleItemsOrderRequestV8, List list, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = createMultipleItemsOrderRequestV8.items;
        }
        if ((i11 & 2) != 0) {
            str = createMultipleItemsOrderRequestV8.deliveryAddressId;
        }
        if ((i11 & 4) != 0) {
            str2 = createMultipleItemsOrderRequestV8.deliveryOptionId;
        }
        if ((i11 & 8) != 0) {
            str3 = createMultipleItemsOrderRequestV8.countryId;
        }
        return createMultipleItemsOrderRequestV8.copy(list, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(CreateMultipleItemsOrderRequestV8 self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.items);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.deliveryAddressId);
        output.r(serialDesc, 2, r1Var, self.deliveryOptionId);
        output.r(serialDesc, 3, r1Var, self.countryId);
    }

    @NotNull
    public final List<BasketBriefItem> component1() {
        return this.items;
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final CreateMultipleItemsOrderRequestV8 copy(@NotNull List<BasketBriefItem> items, @Nullable String deliveryAddressId, @Nullable String deliveryOptionId, @Nullable String countryId) {
        items.getClass();
        return new CreateMultipleItemsOrderRequestV8(items, deliveryAddressId, deliveryOptionId, countryId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateMultipleItemsOrderRequestV8)) {
            return false;
        }
        CreateMultipleItemsOrderRequestV8 createMultipleItemsOrderRequestV8 = (CreateMultipleItemsOrderRequestV8) other;
        return Intrinsics.areEqual(this.items, createMultipleItemsOrderRequestV8.items) && Intrinsics.areEqual(this.deliveryAddressId, createMultipleItemsOrderRequestV8.deliveryAddressId) && Intrinsics.areEqual(this.deliveryOptionId, createMultipleItemsOrderRequestV8.deliveryOptionId) && Intrinsics.areEqual(this.countryId, createMultipleItemsOrderRequestV8.countryId);
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final String getDeliveryAddressId() {
        return this.deliveryAddressId;
    }

    @Nullable
    public final String getDeliveryOptionId() {
        return this.deliveryOptionId;
    }

    @NotNull
    public final List<BasketBriefItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.deliveryAddressId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryOptionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCountryId(@Nullable String str) {
        this.countryId = str;
    }

    public final void setDeliveryAddressId(@Nullable String str) {
        this.deliveryAddressId = str;
    }

    public final void setDeliveryOptionId(@Nullable String str) {
        this.deliveryOptionId = str;
    }

    public final void setItems(@NotNull List<BasketBriefItem> list) {
        list.getClass();
        this.items = list;
    }

    @NotNull
    public String toString() {
        List<BasketBriefItem> list = this.items;
        String str = this.deliveryAddressId;
        String str2 = this.deliveryOptionId;
        String str3 = this.countryId;
        StringBuilder sb2 = new StringBuilder("CreateMultipleItemsOrderRequestV8(items=");
        sb2.append(list);
        sb2.append(", deliveryAddressId=");
        sb2.append(str);
        sb2.append(", deliveryOptionId=");
        return f.o(sb2, str2, ", countryId=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.items, dest);
        while (itR.hasNext()) {
            ((BasketBriefItem) itR.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.deliveryAddressId);
        dest.writeString(this.deliveryOptionId);
        dest.writeString(this.countryId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/CreateMultipleItemsOrderRequestV8;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateMultipleItemsOrderRequestV8$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateMultipleItemsOrderRequestV8> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateMultipleItemsOrderRequestV8 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(BasketBriefItem.CREATOR, parcel, arrayList, iC, 1);
            }
            return new CreateMultipleItemsOrderRequestV8(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateMultipleItemsOrderRequestV8[] newArray(int i11) {
            return new CreateMultipleItemsOrderRequestV8[i11];
        }
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("delivery_address_id")
    public static /* synthetic */ void getDeliveryAddressId$annotations() {
    }

    @g("delivery_option_id")
    public static /* synthetic */ void getDeliveryOptionId$annotations() {
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    public CreateMultipleItemsOrderRequestV8(@NotNull List<BasketBriefItem> list, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        list.getClass();
        this.items = list;
        this.deliveryAddressId = str;
        this.deliveryOptionId = str2;
        this.countryId = str3;
    }
}
