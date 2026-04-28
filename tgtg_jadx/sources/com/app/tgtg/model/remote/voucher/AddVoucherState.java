package com.app.tgtg.model.remote.voucher;

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
@h(with = AddVoucherStateEnumSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/AddVoucherState;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "EXPIRED", "NO_SEATS_LEFT", "NO_ITEMS_LEFT_IN_CAMPAIGN", "USER_NOT_ELIGIBLE", "CAMPAIGN_NOT_ACTIVE", "ALREADY_USED", "NOT_VALID", "USER_REFERRAL_ON_SAME_DEVICE", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddVoucherState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddVoucherState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AddVoucherState OK = new AddVoucherState("OK", 0);
    public static final AddVoucherState EXPIRED = new AddVoucherState("EXPIRED", 1);
    public static final AddVoucherState NO_SEATS_LEFT = new AddVoucherState("NO_SEATS_LEFT", 2);
    public static final AddVoucherState NO_ITEMS_LEFT_IN_CAMPAIGN = new AddVoucherState("NO_ITEMS_LEFT_IN_CAMPAIGN", 3);
    public static final AddVoucherState USER_NOT_ELIGIBLE = new AddVoucherState("USER_NOT_ELIGIBLE", 4);
    public static final AddVoucherState CAMPAIGN_NOT_ACTIVE = new AddVoucherState("CAMPAIGN_NOT_ACTIVE", 5);
    public static final AddVoucherState ALREADY_USED = new AddVoucherState("ALREADY_USED", 6);
    public static final AddVoucherState NOT_VALID = new AddVoucherState("NOT_VALID", 7);
    public static final AddVoucherState USER_REFERRAL_ON_SAME_DEVICE = new AddVoucherState("USER_REFERRAL_ON_SAME_DEVICE", 8);
    public static final AddVoucherState UNKNOWN = new AddVoucherState("UNKNOWN", 9);

    private static final /* synthetic */ AddVoucherState[] $values() {
        return new AddVoucherState[]{OK, EXPIRED, NO_SEATS_LEFT, NO_ITEMS_LEFT_IN_CAMPAIGN, USER_NOT_ELIGIBLE, CAMPAIGN_NOT_ACTIVE, ALREADY_USED, NOT_VALID, USER_REFERRAL_ON_SAME_DEVICE, UNKNOWN};
    }

    static {
        AddVoucherState[] addVoucherStateArr$values = $values();
        $VALUES = addVoucherStateArr$values;
        $ENTRIES = n.w(addVoucherStateArr$values);
        INSTANCE = new Companion(null);
    }

    private AddVoucherState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AddVoucherState valueOf(String str) {
        return (AddVoucherState) Enum.valueOf(AddVoucherState.class, str);
    }

    public static AddVoucherState[] values() {
        return (AddVoucherState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/AddVoucherState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/AddVoucherState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddVoucherStateEnumSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
