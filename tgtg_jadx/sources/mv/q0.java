package mv;

import com.app.tgtg.model.local.DietPreferenceModel;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.response.ItemState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class q0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[ItemState.values().length];
        try {
            iArr[ItemState.SOLD_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemState.SALES_ENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ItemState.INACTIVE_TODAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ItemState.AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ItemState.FEW_LEFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ItemState.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ItemCategory.values().length];
        try {
            iArr2[ItemCategory.MEAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ItemCategory.GROCERIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ItemCategory.BAKED_GOODS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ItemCategory.PET_FOOD.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ItemCategory.FLOWERS_PLANTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ItemCategory.PERSONAL_CARE.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[DietPreferenceModel.values().length];
        try {
            iArr3[DietPreferenceModel.VEGETARIAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DietPreferenceModel.VEGAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
