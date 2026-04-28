package ao;

import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.app.tgtg.model.remote.voucher.response.VoucherType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h3 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[VoucherMode.values().length];
        try {
            iArr[VoucherMode.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoucherMode.DISCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[VoucherType.values().length];
        try {
            iArr2[VoucherType.OTHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
