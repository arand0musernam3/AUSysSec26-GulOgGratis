package oq;

import com.app.tgtg.model.remote.user.response.C2CReferralType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[C2CReferralType.values().length];
        try {
            iArr[C2CReferralType.ALWAYS_ON_PERSON_A_INCENTIVISED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C2CReferralType.PERSON_A_INCENTIVIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
