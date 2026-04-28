package com.app.tgtg.model.remote.voucher.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.voucher.FilteredStore;
import com.app.tgtg.model.remote.voucher.FilteredStore$$serializer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ4\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001eR(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/voucher/FilteredStore;", "blacklist", "whitelist", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBlacklist", "getBlacklist$annotations", "()V", "getWhitelist", "getWhitelist$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VoucherFilterResponse implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final List<FilteredStore> blacklist;

    @Nullable
    private final List<FilteredStore> whitelist;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<VoucherFilterResponse> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(2)), l.a(mVar, new a(3))};
    }

    public /* synthetic */ VoucherFilterResponse(int i11, List list, List list2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, VoucherFilterResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.blacklist = list;
        this.whitelist = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(FilteredStore$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(FilteredStore$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherFilterResponse copy$default(VoucherFilterResponse voucherFilterResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = voucherFilterResponse.blacklist;
        }
        if ((i11 & 2) != 0) {
            list2 = voucherFilterResponse.whitelist;
        }
        return voucherFilterResponse.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$app(VoucherFilterResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.blacklist);
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.whitelist);
    }

    @Nullable
    public final List<FilteredStore> component1() {
        return this.blacklist;
    }

    @Nullable
    public final List<FilteredStore> component2() {
        return this.whitelist;
    }

    @NotNull
    public final VoucherFilterResponse copy(@Nullable List<FilteredStore> blacklist, @Nullable List<FilteredStore> whitelist) {
        return new VoucherFilterResponse(blacklist, whitelist);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherFilterResponse)) {
            return false;
        }
        VoucherFilterResponse voucherFilterResponse = (VoucherFilterResponse) other;
        return Intrinsics.areEqual(this.blacklist, voucherFilterResponse.blacklist) && Intrinsics.areEqual(this.whitelist, voucherFilterResponse.whitelist);
    }

    @Nullable
    public final List<FilteredStore> getBlacklist() {
        return this.blacklist;
    }

    @Nullable
    public final List<FilteredStore> getWhitelist() {
        return this.whitelist;
    }

    public int hashCode() {
        List<FilteredStore> list = this.blacklist;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FilteredStore> list2 = this.whitelist;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VoucherFilterResponse(blacklist=" + this.blacklist + ", whitelist=" + this.whitelist + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        List<FilteredStore> list = this.blacklist;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FilteredStore) itQ.next()).writeToParcel(dest, flags);
            }
        }
        List<FilteredStore> list2 = this.whitelist;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = i.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            ((FilteredStore) itQ2.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherFilterResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherFilterResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherFilterResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int iC = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int iC2 = 0;
                while (iC2 != i11) {
                    iC2 = i.c(FilteredStore.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                while (iC != i12) {
                    iC = i.c(FilteredStore.CREATOR, parcel, arrayList2, iC, 1);
                }
            }
            return new VoucherFilterResponse(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherFilterResponse[] newArray(int i11) {
            return new VoucherFilterResponse[i11];
        }
    }

    @g("blacklist")
    public static /* synthetic */ void getBlacklist$annotations() {
    }

    @g("whitelist")
    public static /* synthetic */ void getWhitelist$annotations() {
    }

    public VoucherFilterResponse(@Nullable List<FilteredStore> list, @Nullable List<FilteredStore> list2) {
        this.blacklist = list;
        this.whitelist = list2;
    }
}
