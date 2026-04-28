package com.app.tgtg.model.remote.voucher;

import a80.a;
import com.app.tgtg.R;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = VoucherFilterTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "", "filterString", "", "<init>", "(Ljava/lang/String;II)V", "getFilterString", "()I", "setFilterString", "(I)V", "WHITELIST", "BLACKLIST", "NONE", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VoucherFilterType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VoucherFilterType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private int filterString;
    public static final VoucherFilterType WHITELIST = new VoucherFilterType("WHITELIST", 0, R.string.voucher_details_list_of_included_stores);
    public static final VoucherFilterType BLACKLIST = new VoucherFilterType("BLACKLIST", 1, R.string.voucher_details_list_of_excluded_stores);
    public static final VoucherFilterType NONE = new VoucherFilterType("NONE", 2, 0);
    public static final VoucherFilterType UNKNOWN = new VoucherFilterType("UNKNOWN", 3, 0);

    private static final /* synthetic */ VoucherFilterType[] $values() {
        return new VoucherFilterType[]{WHITELIST, BLACKLIST, NONE, UNKNOWN};
    }

    static {
        VoucherFilterType[] voucherFilterTypeArr$values = $values();
        $VALUES = voucherFilterTypeArr$values;
        $ENTRIES = n.w(voucherFilterTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private VoucherFilterType(String str, int i11, int i12) {
        this.filterString = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static VoucherFilterType valueOf(String str) {
        return (VoucherFilterType) Enum.valueOf(VoucherFilterType.class, str);
    }

    public static VoucherFilterType[] values() {
        return (VoucherFilterType[]) $VALUES.clone();
    }

    public final int getFilterString() {
        return this.filterString;
    }

    public final void setFilterString(int i11) {
        this.filterString = i11;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/VoucherFilterType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherFilterTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
