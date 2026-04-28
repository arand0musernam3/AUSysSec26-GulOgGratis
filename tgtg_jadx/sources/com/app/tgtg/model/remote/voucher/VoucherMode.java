package com.app.tgtg.model.remote.voucher;

import a80.a;
import com.app.tgtg.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BO\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rj\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/VoucherMode;", "", "activeEmptyStateDescription", "", "expiredEmptyStateDescription", "usedAndExpiredTitle", "usedAndExpiredBtn", "addVoucherBtn", "addNewBottomSheetTitle", "addNewBottomSheetHint", "<init>", "(Ljava/lang/String;IIIIIIII)V", "getActiveEmptyStateDescription", "()I", "getExpiredEmptyStateDescription", "getUsedAndExpiredTitle", "getUsedAndExpiredBtn", "getAddVoucherBtn", "getAddNewBottomSheetTitle", "getAddNewBottomSheetHint", "REGULAR", "DISCOUNT", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VoucherMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VoucherMode[] $VALUES;
    private final int activeEmptyStateDescription;
    private final int addNewBottomSheetHint;
    private final int addNewBottomSheetTitle;
    private final int addVoucherBtn;
    private final int expiredEmptyStateDescription;
    private final int usedAndExpiredBtn;
    private final int usedAndExpiredTitle;
    public static final VoucherMode REGULAR = new VoucherMode("REGULAR", 0, R.string.vouchers_list_empty_state_regular, R.string.vouchers_used_expired_empty_state_regular, R.string.vouchers_list_used_and_expired_title_regular, R.string.vouchers_list_used_and_expired_button_regular, R.string.vouchers_add_a_voucher_btn_regular, R.string.voucher_bottom_sheet_title_regular, R.string.voucher_bottom_sheet_hint_regular);
    public static final VoucherMode DISCOUNT = new VoucherMode("DISCOUNT", 1, R.string.vouchers_list_empty_state_discount, R.string.vouchers_used_expired_empty_state_discount, R.string.vouchers_list_used_and_expired_title_discount, R.string.vouchers_list_used_and_expired_button_discount, R.string.vouchers_add_a_voucher_btn_discount, R.string.voucher_bottom_sheet_title_discount, R.string.voucher_bottom_sheet_hint_discount);

    private static final /* synthetic */ VoucherMode[] $values() {
        return new VoucherMode[]{REGULAR, DISCOUNT};
    }

    static {
        VoucherMode[] voucherModeArr$values = $values();
        $VALUES = voucherModeArr$values;
        $ENTRIES = n.w(voucherModeArr$values);
    }

    private VoucherMode(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.activeEmptyStateDescription = i12;
        this.expiredEmptyStateDescription = i13;
        this.usedAndExpiredTitle = i14;
        this.usedAndExpiredBtn = i15;
        this.addVoucherBtn = i16;
        this.addNewBottomSheetTitle = i17;
        this.addNewBottomSheetHint = i18;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static VoucherMode valueOf(String str) {
        return (VoucherMode) Enum.valueOf(VoucherMode.class, str);
    }

    public static VoucherMode[] values() {
        return (VoucherMode[]) $VALUES.clone();
    }

    public final int getActiveEmptyStateDescription() {
        return this.activeEmptyStateDescription;
    }

    public final int getAddNewBottomSheetHint() {
        return this.addNewBottomSheetHint;
    }

    public final int getAddNewBottomSheetTitle() {
        return this.addNewBottomSheetTitle;
    }

    public final int getAddVoucherBtn() {
        return this.addVoucherBtn;
    }

    public final int getExpiredEmptyStateDescription() {
        return this.expiredEmptyStateDescription;
    }

    public final int getUsedAndExpiredBtn() {
        return this.usedAndExpiredBtn;
    }

    public final int getUsedAndExpiredTitle() {
        return this.usedAndExpiredTitle;
    }
}
