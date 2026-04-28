package gt;

import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.order.OrderType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class v {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;
    public static final /* synthetic */ int[] $EnumSwitchMapping$4;

    static {
        int[] iArr = new int[OrderType.values().length];
        try {
            iArr[OrderType.MAGICBAG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderType.MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderType.CHARITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderType.FLASH_SALES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OrderType.CATERING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OrderType.TABLE_RESERVATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OrderType.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ItemCategory.values().length];
        try {
            iArr2[ItemCategory.MEAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ItemCategory.BAKED_GOODS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ItemCategory.GROCERIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ItemCategory.FLOWERS_PLANTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ItemCategory.PET_FOOD.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ItemCategory.PERSONAL_CARE.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ItemCategory.OTHER.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ItemCategory.SHOW_ALL.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[DeliveryMethod.values().length];
        try {
            iArr3[DeliveryMethod.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[DeliveryMethod.PICKUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[DeliveryMethod.HOME_AND_PICKUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[DeliveryMethod.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[DeliveryOptionMethod.values().length];
        try {
            iArr4[DeliveryOptionMethod.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[DeliveryOptionMethod.PICKUP_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[DeliveryOptionMethod.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        $EnumSwitchMapping$3 = iArr4;
        int[] iArr5 = new int[nr.a.values().length];
        try {
            iArr5[nr.a.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[nr.a.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[nr.a.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[nr.a.DELIVERY.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[nr.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused27) {
        }
        $EnumSwitchMapping$4 = iArr5;
    }
}
