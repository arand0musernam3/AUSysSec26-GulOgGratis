package ui;

import com.app.tgtg.model.remote.manufacturer.response.BasketPriceSpecificationState;
import com.app.tgtg.model.remote.payment.CreatePriceSpecState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p2 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[CreatePriceSpecState.values().length];
        try {
            iArr[CreatePriceSpecState.SOLD_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreatePriceSpecState.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[BasketPriceSpecificationState.values().length];
        try {
            iArr2[BasketPriceSpecificationState.INSUFFICIENT_STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BasketPriceSpecificationState.MISSING_TAX_DATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BasketPriceSpecificationState.TAX_SERVICE_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BasketPriceSpecificationState.MISSING_ADDRESS_IN_REQUEST.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BasketPriceSpecificationState.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
