package rs;

import com.app.tgtg.model.remote.voucher.AddVoucherState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AddVoucherState.values().length];
        try {
            iArr[AddVoucherState.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddVoucherState.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddVoucherState.NO_SEATS_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AddVoucherState.NO_ITEMS_LEFT_IN_CAMPAIGN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AddVoucherState.CAMPAIGN_NOT_ACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AddVoucherState.USER_NOT_ELIGIBLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AddVoucherState.ALREADY_USED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AddVoucherState.NOT_VALID.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AddVoucherState.USER_REFERRAL_ON_SAME_DEVICE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[AddVoucherState.UNKNOWN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
