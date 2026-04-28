package com.app.tgtg.model.remote.voucher;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import i90.a;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import xh.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00102\u001a\u000203J\u0014\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0083\u0004J\n\u00108\u001a\u000203HÖ\u0081\u0004J\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00000:J\n\u0010;\u001a\u00020\tHÖ\u0081\u0004J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000203R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010'\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007¨\u0006A"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/UnknownVoucher;", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "<init>", "()V", "id", "Lcom/app/tgtg/model/remote/VoucherId;", "getId-VUJ7vw4", "()Ljava/lang/String;", "name", "", "getName", "shortDescription", "getShortDescription", "validFromUtc", "getValidFromUtc", "validToUtc", "getValidToUtc", "countryId", "getCountryId", "state", "Lcom/app/tgtg/model/remote/voucher/VoucherState;", "getState", "()Lcom/app/tgtg/model/remote/voucher/VoucherState;", "storeVoucherFilterType", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "getStoreVoucherFilterType", "()Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "termsLink", "getTermsLink", "version", "Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "getVersion", "()Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "voucherType", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "getVoucherType", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "filterType", "getFilterType", "filterList", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "getFilterList", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "applicableItemTypes", "", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getApplicableItemTypes", "()Ljava/util/List;", "eligiblePlatforms", "getEligiblePlatforms", "describeContents", "", "equals", "", "other", "", "hashCode", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UnknownVoucher extends BasicVoucher {
    public static final int $stable = 0;

    @NotNull
    public static final UnknownVoucher INSTANCE = new UnknownVoucher();

    @NotNull
    public static final Parcelable.Creator<UnknownVoucher> CREATOR = new Creator();
    private static final /* synthetic */ j $cachedSerializer$delegate = l.a(m.PUBLICATION, new d(20));

    private UnknownVoucher() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new a("com.app.tgtg.model.remote.voucher.UnknownVoucher", INSTANCE, new Annotation[]{new CountryBasedVoucher$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("version")});
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return (KSerializer) $cachedSerializer$delegate.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        return this == other || (other instanceof UnknownVoucher);
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public List<ItemType> getApplicableItemTypes() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getCountryId() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getEligiblePlatforms() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public VoucherFilterResponse getFilterList() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public VoucherFilterType getFilterType() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    /* JADX INFO: renamed from: getId-VUJ7vw4 */
    public String mo529getIdVUJ7vw4() {
        return VoucherId.m299constructorimpl("");
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getName() {
        return "";
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getShortDescription() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherState getState() {
        return VoucherState.UNKNOWN;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public VoucherFilterType getStoreVoucherFilterType() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getTermsLink() {
        return null;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getValidFromUtc() {
        return "";
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getValidToUtc() {
        return "";
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherVersion getVersion() {
        return VoucherVersion.UNKNOWN;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherType getVoucherType() {
        return VoucherType.UNKNOWN;
    }

    public int hashCode() {
        return 707803065;
    }

    @NotNull
    public final KSerializer serializer() {
        return get$cachedSerializer();
    }

    @NotNull
    public String toString() {
        return "UnknownVoucher";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(1);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnknownVoucher> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnknownVoucher createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return UnknownVoucher.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnknownVoucher[] newArray(int i11) {
            return new UnknownVoucher[i11];
        }
    }
}
