package wi;

import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.response.ItemType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.MANUFACTURER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemType.CATERING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[DeliveryMethod.values().length];
        try {
            iArr2[DeliveryMethod.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DeliveryMethod.PICKUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DeliveryMethod.HOME_AND_PICKUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[jg.c.values().length];
        try {
            iArr3[jg.c.NL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[jg.c.BE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[jg.c.DE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[jg.c.AT.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[jg.c.PL.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[jg.c.GB.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[jg.c.ES.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
