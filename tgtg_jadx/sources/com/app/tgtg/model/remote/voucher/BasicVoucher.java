package com.app.tgtg.model.remote.voucher;

import android.os.Parcelable;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import n90.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i(discriminator = "version")
@h(with = BasicVoucherSerializer.class)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 22\u00020\u0001:\u00012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0012\u0010\r\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0012\u0010\u000f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u0004\u0018\u00010(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007\u0082\u0001\u00043456¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "Landroid/os/Parcelable;", "<init>", "()V", "id", "Lcom/app/tgtg/model/remote/VoucherId;", "getId-VUJ7vw4", "()Ljava/lang/String;", "name", "", "getName", "shortDescription", "getShortDescription", "validFromUtc", "getValidFromUtc", "validToUtc", "getValidToUtc", "countryId", "getCountryId", "state", "Lcom/app/tgtg/model/remote/voucher/VoucherState;", "getState", "()Lcom/app/tgtg/model/remote/voucher/VoucherState;", "storeVoucherFilterType", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "getStoreVoucherFilterType", "()Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "termsLink", "getTermsLink", "version", "Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "getVersion", "()Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "voucherType", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "getVoucherType", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "filterType", "getFilterType", "filterList", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "getFilterList", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "applicableItemTypes", "", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getApplicableItemTypes", "()Ljava/util/List;", "eligiblePlatforms", "getEligiblePlatforms", "Companion", "Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;", "Lcom/app/tgtg/model/remote/voucher/CurrencyBasedVoucher;", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "Lcom/app/tgtg/model/remote/voucher/UnknownVoucher;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BasicVoucher implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ BasicVoucher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract List<ItemType> getApplicableItemTypes();

    @Nullable
    public abstract String getCountryId();

    @Nullable
    public abstract String getEligiblePlatforms();

    @Nullable
    public abstract VoucherFilterResponse getFilterList();

    @Nullable
    public abstract VoucherFilterType getFilterType();

    @NotNull
    /* JADX INFO: renamed from: getId-VUJ7vw4, reason: not valid java name */
    public abstract String mo529getIdVUJ7vw4();

    @NotNull
    public abstract String getName();

    @Nullable
    public abstract String getShortDescription();

    @NotNull
    public abstract VoucherState getState();

    @Nullable
    public abstract VoucherFilterType getStoreVoucherFilterType();

    @Nullable
    public abstract String getTermsLink();

    @NotNull
    public abstract String getValidFromUtc();

    @NotNull
    public abstract String getValidToUtc();

    @NotNull
    public abstract VoucherVersion getVersion();

    @NotNull
    public abstract VoucherType getVoucherType();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/BasicVoucher$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasicVoucherSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private BasicVoucher() {
    }
}
