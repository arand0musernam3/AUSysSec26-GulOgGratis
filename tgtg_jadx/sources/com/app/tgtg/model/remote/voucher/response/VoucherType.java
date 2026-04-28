package com.app.tgtg.model.remote.voucher.response;

import a80.a;
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
@h(with = VoucherTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "", "<init>", "(Ljava/lang/String;I)V", "EASY", "REGULAR", "LOYALTY", "USER_REFERRAL", "DISCOUNT", "OTHER", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VoucherType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VoucherType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final VoucherType EASY = new VoucherType("EASY", 0);
    public static final VoucherType REGULAR = new VoucherType("REGULAR", 1);
    public static final VoucherType LOYALTY = new VoucherType("LOYALTY", 2);
    public static final VoucherType USER_REFERRAL = new VoucherType("USER_REFERRAL", 3);
    public static final VoucherType DISCOUNT = new VoucherType("DISCOUNT", 4);
    public static final VoucherType OTHER = new VoucherType("OTHER", 5);
    public static final VoucherType UNKNOWN = new VoucherType("UNKNOWN", 6);

    private static final /* synthetic */ VoucherType[] $values() {
        return new VoucherType[]{EASY, REGULAR, LOYALTY, USER_REFERRAL, DISCOUNT, OTHER, UNKNOWN};
    }

    static {
        VoucherType[] voucherTypeArr$values = $values();
        $VALUES = voucherTypeArr$values;
        $ENTRIES = n.w(voucherTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private VoucherType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static VoucherType valueOf(String str) {
        return (VoucherType) Enum.valueOf(VoucherType.class, str);
    }

    public static VoucherType[] values() {
        return (VoucherType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
