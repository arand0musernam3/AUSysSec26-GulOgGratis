package com.app.tgtg.model.remote.voucher.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.voucher.AddVoucherState;
import com.app.tgtg.model.remote.voucher.AddVoucherStateEnumSerializer;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.BasicVoucherSerializer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J>\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010(¨\u0006C"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/AddNewVoucherResponse;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/voucher/AddVoucherState;", "state", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "type", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "voucher", "Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "discountResponse", "<init>", "(Lcom/app/tgtg/model/remote/voucher/AddVoucherState;Lcom/app/tgtg/model/remote/voucher/response/VoucherType;Lcom/app/tgtg/model/remote/voucher/BasicVoucher;Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/voucher/AddVoucherState;Lcom/app/tgtg/model/remote/voucher/response/VoucherType;Lcom/app/tgtg/model/remote/voucher/BasicVoucher;Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/response/AddNewVoucherResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/voucher/AddVoucherState;", "component2", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "component3", "()Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "component4", "()Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "copy", "(Lcom/app/tgtg/model/remote/voucher/AddVoucherState;Lcom/app/tgtg/model/remote/voucher/response/VoucherType;Lcom/app/tgtg/model/remote/voucher/BasicVoucher;Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;)Lcom/app/tgtg/model/remote/voucher/response/AddNewVoucherResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/voucher/AddVoucherState;", "getState", "getState$annotations", "()V", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "getType", "getType$annotations", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "getVoucher", "getVoucher$annotations", "Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "getDiscountResponse", "getDiscountResponse$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddNewVoucherResponse implements Parcelable {

    @Nullable
    private final DiscountVoucherDetails discountResponse;

    @NotNull
    private final AddVoucherState state;

    @Nullable
    private final VoucherType type;

    @Nullable
    private final BasicVoucher voucher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AddNewVoucherResponse> CREATOR = new Creator();

    public /* synthetic */ AddNewVoucherResponse(int i11, AddVoucherState addVoucherState, VoucherType voucherType, BasicVoucher basicVoucher, DiscountVoucherDetails discountVoucherDetails, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, AddNewVoucherResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.state = addVoucherState;
        this.type = voucherType;
        this.voucher = basicVoucher;
        this.discountResponse = discountVoucherDetails;
    }

    public static /* synthetic */ AddNewVoucherResponse copy$default(AddNewVoucherResponse addNewVoucherResponse, AddVoucherState addVoucherState, VoucherType voucherType, BasicVoucher basicVoucher, DiscountVoucherDetails discountVoucherDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addVoucherState = addNewVoucherResponse.state;
        }
        if ((i11 & 2) != 0) {
            voucherType = addNewVoucherResponse.type;
        }
        if ((i11 & 4) != 0) {
            basicVoucher = addNewVoucherResponse.voucher;
        }
        if ((i11 & 8) != 0) {
            discountVoucherDetails = addNewVoucherResponse.discountResponse;
        }
        return addNewVoucherResponse.copy(addVoucherState, voucherType, basicVoucher, discountVoucherDetails);
    }

    public static final /* synthetic */ void write$Self$app(AddNewVoucherResponse self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, AddVoucherStateEnumSerializer.INSTANCE, self.state);
        output.r(serialDesc, 1, VoucherTypeSerializer.INSTANCE, self.type);
        output.r(serialDesc, 2, BasicVoucherSerializer.INSTANCE, self.voucher);
        output.r(serialDesc, 3, DiscountVoucherDetails$$serializer.INSTANCE, self.discountResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AddVoucherState getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VoucherType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BasicVoucher getVoucher() {
        return this.voucher;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DiscountVoucherDetails getDiscountResponse() {
        return this.discountResponse;
    }

    @NotNull
    public final AddNewVoucherResponse copy(@NotNull AddVoucherState state, @Nullable VoucherType type, @Nullable BasicVoucher voucher, @Nullable DiscountVoucherDetails discountResponse) {
        state.getClass();
        return new AddNewVoucherResponse(state, type, voucher, discountResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddNewVoucherResponse)) {
            return false;
        }
        AddNewVoucherResponse addNewVoucherResponse = (AddNewVoucherResponse) other;
        return this.state == addNewVoucherResponse.state && this.type == addNewVoucherResponse.type && Intrinsics.areEqual(this.voucher, addNewVoucherResponse.voucher) && Intrinsics.areEqual(this.discountResponse, addNewVoucherResponse.discountResponse);
    }

    @Nullable
    public final DiscountVoucherDetails getDiscountResponse() {
        return this.discountResponse;
    }

    @NotNull
    public final AddVoucherState getState() {
        return this.state;
    }

    @Nullable
    public final VoucherType getType() {
        return this.type;
    }

    @Nullable
    public final BasicVoucher getVoucher() {
        return this.voucher;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        VoucherType voucherType = this.type;
        int iHashCode2 = (iHashCode + (voucherType == null ? 0 : voucherType.hashCode())) * 31;
        BasicVoucher basicVoucher = this.voucher;
        int iHashCode3 = (iHashCode2 + (basicVoucher == null ? 0 : basicVoucher.hashCode())) * 31;
        DiscountVoucherDetails discountVoucherDetails = this.discountResponse;
        return iHashCode3 + (discountVoucherDetails != null ? discountVoucherDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddNewVoucherResponse(state=" + this.state + ", type=" + this.type + ", voucher=" + this.voucher + ", discountResponse=" + this.discountResponse + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.state.name());
        VoucherType voucherType = this.type;
        if (voucherType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(voucherType.name());
        }
        dest.writeParcelable(this.voucher, flags);
        DiscountVoucherDetails discountVoucherDetails = this.discountResponse;
        if (discountVoucherDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            discountVoucherDetails.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/AddNewVoucherResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/response/AddNewVoucherResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddNewVoucherResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddNewVoucherResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddNewVoucherResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AddNewVoucherResponse(AddVoucherState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : VoucherType.valueOf(parcel.readString()), (BasicVoucher) parcel.readParcelable(AddNewVoucherResponse.class.getClassLoader()), parcel.readInt() != 0 ? DiscountVoucherDetails.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddNewVoucherResponse[] newArray(int i11) {
            return new AddNewVoucherResponse[i11];
        }
    }

    @g("user_discount")
    public static /* synthetic */ void getDiscountResponse$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("voucher_type")
    public static /* synthetic */ void getType$annotations() {
    }

    @g("voucher")
    public static /* synthetic */ void getVoucher$annotations() {
    }

    public AddNewVoucherResponse(@NotNull AddVoucherState addVoucherState, @Nullable VoucherType voucherType, @Nullable BasicVoucher basicVoucher, @Nullable DiscountVoucherDetails discountVoucherDetails) {
        addVoucherState.getClass();
        this.state = addVoucherState;
        this.type = voucherType;
        this.voucher = basicVoucher;
        this.discountResponse = discountVoucherDetails;
    }
}
