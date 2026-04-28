package sn;

import com.app.tgtg.model.remote.profile.response.LoyaltyCardNotificationType;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[LoyaltyCardNotificationType.values().length];
        try {
            iArr[LoyaltyCardNotificationType.SINGLE_POINT_EARNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoyaltyCardNotificationType.MULTIPLE_POINTS_EARNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ProfileFeatureState.values().length];
        try {
            iArr2[ProfileFeatureState.CLOSE_TO_EXPIRE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ProfileFeatureState.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
