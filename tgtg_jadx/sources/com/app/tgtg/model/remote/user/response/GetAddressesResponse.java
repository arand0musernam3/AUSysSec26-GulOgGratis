package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.AddressFieldSpec;
import com.app.tgtg.model.remote.AddressFieldSpec$$serializer;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.requests.UserAddress$$serializer;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import uu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B-\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB=\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/GetAddressesResponse;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "addresses", "Lcom/app/tgtg/model/remote/AddressFieldSpec;", "addressFieldRequirements", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/GetAddressesResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getAddresses", "()Ljava/util/List;", "getAddresses$annotations", "()V", "getAddressFieldRequirements", "getAddressFieldRequirements$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GetAddressesResponse implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final List<AddressFieldSpec> addressFieldRequirements;

    @Nullable
    private final List<UserAddress> addresses;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GetAddressesResponse> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(13)), l.a(mVar, new a(14))};
    }

    public /* synthetic */ GetAddressesResponse(int i11, List list, List list2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.addresses = null;
        } else {
            this.addresses = list;
        }
        if ((i11 & 2) == 0) {
            this.addressFieldRequirements = null;
        } else {
            this.addressFieldRequirements = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(f0.B(UserAddress$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(AddressFieldSpec$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$app(GetAddressesResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.addresses != null) {
            output.r(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.addresses);
        }
        if (!output.C(serialDesc) && self.addressFieldRequirements == null) {
            return;
        }
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.addressFieldRequirements);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final List<AddressFieldSpec> getAddressFieldRequirements() {
        return this.addressFieldRequirements;
    }

    @Nullable
    public final List<UserAddress> getAddresses() {
        return this.addresses;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        List<UserAddress> list = this.addresses;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                UserAddress userAddress = (UserAddress) itQ.next();
                if (userAddress == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    userAddress.writeToParcel(dest, flags);
                }
            }
        }
        List<AddressFieldSpec> list2 = this.addressFieldRequirements;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = i.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            ((AddressFieldSpec) itQ2.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/GetAddressesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/GetAddressesResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GetAddressesResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetAddressesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetAddressesResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int iC = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readInt() == 0 ? null : UserAddress.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC != i13) {
                    iC = i.c(AddressFieldSpec.CREATOR, parcel, arrayList2, iC, 1);
                }
            }
            return new GetAddressesResponse(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetAddressesResponse[] newArray(int i11) {
            return new GetAddressesResponse[i11];
        }
    }

    @g("address_field_requirements")
    public static /* synthetic */ void getAddressFieldRequirements$annotations() {
    }

    @g("addresses")
    public static /* synthetic */ void getAddresses$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetAddressesResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public GetAddressesResponse(@Nullable List<UserAddress> list, @Nullable List<AddressFieldSpec> list2) {
        this.addresses = list;
        this.addressFieldRequirements = list2;
    }

    public /* synthetic */ GetAddressesResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }
}
