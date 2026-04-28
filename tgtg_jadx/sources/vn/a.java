package vn;

import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ProfileFeatureState.values().length];
        try {
            iArr[ProfileFeatureState.SINGLE_CLAIMED_REWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProfileFeatureState.SINGLE_REWARD_CLOSE_TO_EXPIRE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProfileFeatureState.MULTIPLE_CLAIMED_REWARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
