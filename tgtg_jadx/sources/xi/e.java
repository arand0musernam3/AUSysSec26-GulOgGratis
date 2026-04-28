package xi;

import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.MANUFACTURER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[CreateOrderResponse.CreateOrderState.values().length];
        try {
            iArr2[CreateOrderResponse.CreateOrderState.USER_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.SALE_CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.SOLD_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.OVER_USER_WINDOW_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.INSUFFICIENT_STOCK.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.API_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.TAX_SERVICE_DOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[CreateOrderResponse.CreateOrderState.MISSING_TAX_DATA.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
