package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
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
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import uu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J,\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010-\u0012\u0004\b1\u00102\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u00100R.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00103\u0012\u0004\b7\u00102\u001a\u0004\b4\u0010!\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/MoneySavedResponse;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/Price;", "moneySavedTotal", "", "Lcom/app/tgtg/model/remote/user/response/MonthlyMoneySaved;", "moneySavedList", "<init>", "(Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/MoneySavedResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/payment/Price;", "component2", "()Ljava/util/List;", "copy", "(Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;)Lcom/app/tgtg/model/remote/user/response/MoneySavedResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/payment/Price;", "getMoneySavedTotal", "setMoneySavedTotal", "(Lcom/app/tgtg/model/remote/payment/Price;)V", "getMoneySavedTotal$annotations", "()V", "Ljava/util/List;", "getMoneySavedList", "setMoneySavedList", "(Ljava/util/List;)V", "getMoneySavedList$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MoneySavedResponse implements Parcelable {

    @NotNull
    private List<MonthlyMoneySaved> moneySavedList;

    @Nullable
    private Price moneySavedTotal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MoneySavedResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(16))};

    public /* synthetic */ MoneySavedResponse(int i11, Price price, List list, m1 m1Var) {
        this.moneySavedTotal = (i11 & 1) == 0 ? null : price;
        if ((i11 & 2) == 0) {
            this.moneySavedList = new ArrayList();
        } else {
            this.moneySavedList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(MonthlyMoneySaved$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MoneySavedResponse copy$default(MoneySavedResponse moneySavedResponse, Price price, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            price = moneySavedResponse.moneySavedTotal;
        }
        if ((i11 & 2) != 0) {
            list = moneySavedResponse.moneySavedList;
        }
        return moneySavedResponse.copy(price, list);
    }

    public static final /* synthetic */ void write$Self$app(MoneySavedResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.moneySavedTotal != null) {
            output.r(serialDesc, 0, Price$$serializer.INSTANCE, self.moneySavedTotal);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.moneySavedList, new ArrayList())) {
            return;
        }
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.moneySavedList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Price getMoneySavedTotal() {
        return this.moneySavedTotal;
    }

    @NotNull
    public final List<MonthlyMoneySaved> component2() {
        return this.moneySavedList;
    }

    @NotNull
    public final MoneySavedResponse copy(@Nullable Price moneySavedTotal, @NotNull List<MonthlyMoneySaved> moneySavedList) {
        moneySavedList.getClass();
        return new MoneySavedResponse(moneySavedTotal, moneySavedList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoneySavedResponse)) {
            return false;
        }
        MoneySavedResponse moneySavedResponse = (MoneySavedResponse) other;
        return Intrinsics.areEqual(this.moneySavedTotal, moneySavedResponse.moneySavedTotal) && Intrinsics.areEqual(this.moneySavedList, moneySavedResponse.moneySavedList);
    }

    @NotNull
    public final List<MonthlyMoneySaved> getMoneySavedList() {
        return this.moneySavedList;
    }

    @Nullable
    public final Price getMoneySavedTotal() {
        return this.moneySavedTotal;
    }

    public int hashCode() {
        Price price = this.moneySavedTotal;
        return this.moneySavedList.hashCode() + ((price == null ? 0 : price.hashCode()) * 31);
    }

    public final void setMoneySavedList(@NotNull List<MonthlyMoneySaved> list) {
        list.getClass();
        this.moneySavedList = list;
    }

    public final void setMoneySavedTotal(@Nullable Price price) {
        this.moneySavedTotal = price;
    }

    @NotNull
    public String toString() {
        return "MoneySavedResponse(moneySavedTotal=" + this.moneySavedTotal + ", moneySavedList=" + this.moneySavedList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Price price = this.moneySavedTotal;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Iterator itR = i.r(this.moneySavedList, dest);
        while (itR.hasNext()) {
            ((MonthlyMoneySaved) itR.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/MoneySavedResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/MoneySavedResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MoneySavedResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MoneySavedResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoneySavedResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(MonthlyMoneySaved.CREATOR, parcel, arrayList, iC, 1);
            }
            return new MoneySavedResponse(priceCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoneySavedResponse[] newArray(int i11) {
            return new MoneySavedResponse[i11];
        }
    }

    @g("mobile_user_money_saved_in_months")
    public static /* synthetic */ void getMoneySavedList$annotations() {
    }

    @g("money_saved_total")
    public static /* synthetic */ void getMoneySavedTotal$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneySavedResponse() {
        this((Price) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public MoneySavedResponse(@Nullable Price price, @NotNull List<MonthlyMoneySaved> list) {
        list.getClass();
        this.moneySavedTotal = price;
        this.moneySavedList = list;
    }

    public /* synthetic */ MoneySavedResponse(Price price, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : price, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
