package atd.av;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import atd.y.CompletionEvent;
import com.adyen.threeds2.R;
import com.app.tgtg.model.local.AppConstants;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID extends LinearLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private static int ChallengeResultCancelled = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private final atd.av.getDeviceData AuthenticationRequestParameters;
    private int BuildConfig;
    private float ChallengeResult;
    private final ImageView getDeviceData;
    private getDeviceData getMessageVersion;
    private final TextView getSDKAppID;
    private final View getSDKReferenceNumber;
    private final TextView getSDKTransactionID;

    /* JADX INFO: renamed from: atd.av.getSDKTransactionID$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass5 {
        private static int AuthenticationRequestParameters = 1;
        private static int getDeviceData;
        static final /* synthetic */ int[] getSDKAppID;

        static {
            int[] iArr = new int[getDeviceData.values().length];
            getSDKAppID = iArr;
            try {
                iArr[getDeviceData.EXPANDED.ordinal()] = 1;
                int i11 = getDeviceData;
                int i12 = i11 & 17;
                int i13 = (i11 ^ 17) | i12;
                AuthenticationRequestParameters = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKAppID[getDeviceData.COLLAPSED.ordinal()] = 2;
                int i14 = AuthenticationRequestParameters;
                int i15 = i14 | 23;
                int i16 = i15 << 1;
                int i17 = -((~(i14 & 23)) & i15);
                getDeviceData = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ getDeviceData[] $VALUES;
        private static int AuthenticationRequestParameters;
        public static final getDeviceData COLLAPSED;
        public static final getDeviceData EXPANDED;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;
        private static long getSDKTransactionID;

        private static String $$c(int i11, int i12, short s7) {
            int i13 = s7 + 4;
            byte[] bArr = $$a;
            int i14 = (i11 * 2) + 97;
            int i15 = i12 * 4;
            byte[] bArr2 = new byte[i15 + 1];
            int i16 = -1;
            if (bArr == null) {
                i14 = i15 + (-i13);
                i13 = i13;
                bArr = bArr;
                i16 = -1;
            }
            while (true) {
                int i17 = i16 + 1;
                bArr2[i17] = (byte) i14;
                if (i17 == i15) {
                    return new String(bArr2, 0);
                }
                int i18 = i13 + 1;
                byte[] bArr3 = bArr;
                i14 += -bArr[i18];
                i13 = i18;
                bArr = bArr3;
                i16 = i17;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKAppID = 0;
            getDeviceData = 1;
            AuthenticationRequestParameters = 0;
            getSDKReferenceNumber = 1;
            getDeviceData();
            Object[] objArr = new Object[1];
            a("\ud7fc暬땳쐟ዃꅼ\uf032\u0ee6", TextUtils.indexOf("", "") + 45389, objArr);
            EXPANDED = new getDeviceData(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a("ퟺ㊽ᵣ研䋔궞蠨鋱ﶥ", 58699 - TextUtils.getOffsetBefore("", 0), objArr2);
            COLLAPSED = new getDeviceData(((String) objArr2[0]).intern(), 1);
            $VALUES = getSDKTransactionID();
            int i11 = getSDKAppID + 113;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        private getDeviceData(String str, int i11) {
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0213  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(java.lang.String r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 542
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.av.getSDKTransactionID.getDeviceData.a(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void getDeviceData() {
            getSDKTransactionID = 1059863014852578897L;
        }

        private static /* synthetic */ getDeviceData[] getSDKTransactionID() {
            int i11 = (AuthenticationRequestParameters + 35) % 128;
            getSDKReferenceNumber = i11;
            getDeviceData[] getdevicedataArr = {EXPANDED, COLLAPSED};
            AuthenticationRequestParameters = (i11 + 45) % 128;
            return getdevicedataArr;
        }

        public static void init$0() {
            $$a = new byte[]{33, 102, -32, 123};
            $$b = 138;
        }

        public static getDeviceData valueOf(String str) {
            getSDKReferenceNumber = (AuthenticationRequestParameters + 57) % 128;
            getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
            int i11 = AuthenticationRequestParameters + 113;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 != 0) {
                return getdevicedata;
            }
            throw null;
        }

        public static getDeviceData[] values() {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 65) % 128;
            getDeviceData[] getdevicedataArr = (getDeviceData[]) $VALUES.clone();
            getSDKReferenceNumber = (AuthenticationRequestParameters + 53) % 128;
            return getdevicedataArr;
        }
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.getMessageVersion = getDeviceData.EXPANDED;
        View.inflate(context, R.layout.a3ds2_widget_expandable_info_text, this);
        View viewFindViewById = findViewById(R.id.viewGroup_header);
        this.getSDKReferenceNumber = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.getDeviceData = (ImageView) findViewById(R.id.imageView_stateIndicator);
        this.getSDKAppID = (TextView) findViewById(R.id.textView_title);
        TextView textView = (TextView) findViewById(R.id.textView_info);
        this.getSDKTransactionID = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.AuthenticationRequestParameters = (atd.av.getDeviceData) findViewById(R.id.dividerView_info);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
        int i17 = ~i12;
        int i18 = ~i14;
        int i19 = ~i16;
        int i21 = (~(i18 | i19)) | i17;
        int i22 = (~(i16 | i14)) | (~(i17 | i19));
        int i23 = ~(i19 | i12 | i14);
        int i24 = (1456996352 * i13) + (1190920192 * i15) + ((-1139933184) * i11) + ((-352114683) * i23) + (i22 * (-352114683)) + (352114683 * i21) + ((-1492047866) * i14) + (((-787818500) * i12) - 443744256);
        int iC = a0.c(i13, 9035316, ((-194346734) * i15) + i12 + i14 + i11);
        switch (a0.e(iC, 168099840, (i13 * 107475828) + (i15 * (-1060063438)) + (i11 * 1174986385) + (i23 * 213) + (i22 * 213) + (i21 * (-213)) + (i14 * 1174986598) + (i12 * 1174986172) + 1294669563, 40566784, ((-1774911488) * iC) + i24)) {
            case 1:
                getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
                getDeviceData getdevicedata = (getDeviceData) objArr[1];
                CompletionEvent.getDeviceData.getDeviceData();
                System.identityHashCode(getsdktransactionid);
                getsdktransactionid.getMessageVersion = getdevicedata;
                int i25 = ChallengeResultCancelled;
                int i26 = ((i25 ^ 119) | (i25 & 119)) << 1;
                int i27 = -(((~i25) & 119) | (i25 & (-120)));
                getSDKEphemeralPublicKey = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
                break;
            case 2:
                break;
            case 3:
                int i28 = getSDKEphemeralPublicKey;
                ChallengeResultCancelled = ((-2) - ((((i28 | 122) << 1) - (i28 ^ 122)) ^ (-1))) % 128;
                break;
            case 4:
                getSDKTransactionID getsdktransactionid2 = (getSDKTransactionID) objArr[0];
                int i29 = ChallengeResultCancelled;
                int iD = a0.d((i29 & (-18)) | ((~i29) & 17), ~((i29 & 17) << 1), 1, 128);
                getSDKEphemeralPublicKey = iD;
                getDeviceData getdevicedata2 = getsdktransactionid2.getMessageVersion;
                int i31 = iD & 11;
                int i32 = ((iD ^ 11) | i31) << 1;
                int i33 = -((iD | 11) & (~i31));
                ChallengeResultCancelled = (((i32 | i33) << 1) - (i33 ^ i32)) % 128;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                ChallengeResultCancelled = ((-2) - ((getSDKEphemeralPublicKey + 60) ^ (-1))) % 128;
                break;
            default:
                getSDKTransactionID getsdktransactionid3 = (getSDKTransactionID) objArr[0];
                int i34 = ChallengeResultCancelled + 22;
                getSDKEphemeralPublicKey = ((i34 ^ (-1)) + (i34 << 1)) % 128;
                getsdktransactionid3.getSDKTransactionID.getViewTreeObserver().removeOnGlobalLayoutListener(getsdktransactionid3);
                getsdktransactionid3.ChallengeResult = getsdktransactionid3.getSDKTransactionID.getAlpha();
                getsdktransactionid3.BuildConfig = getsdktransactionid3.getSDKTransactionID.getMeasuredHeight();
                AuthenticationRequestParameters(CompletionEvent.getDeviceData.getDeviceData(), -602242799, CompletionEvent.getDeviceData.getDeviceData(), 602242806, CompletionEvent.getDeviceData.getDeviceData(), new Object[]{getsdktransactionid3, Boolean.FALSE}, CompletionEvent.getDeviceData.getDeviceData());
                int i35 = ChallengeResultCancelled;
                int i36 = i35 & 41;
                int i37 = -(-((i35 ^ 41) | i36));
                getSDKEphemeralPublicKey = ((i36 & i37) + (i37 | i36)) % 128;
                break;
        }
        return null;
    }

    private static /* synthetic */ Object BuildConfig(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i11 = ChallengeResultCancelled;
        int i12 = ((((i11 ^ 3) | (i11 & 3)) << 1) - (~(-(((~i11) & 3) | (i11 & (-4)))))) - 1;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            getDeviceData getdevicedata = getsdktransactionid.getMessageVersion;
            getDeviceData getdevicedata2 = getDeviceData.EXPANDED;
            throw null;
        }
        getDeviceData getdevicedata3 = getsdktransactionid.getMessageVersion;
        getDeviceData getdevicedata4 = getDeviceData.COLLAPSED;
        if (getdevicedata3 == getdevicedata4) {
            int i13 = getSDKEphemeralPublicKey;
            ChallengeResultCancelled = ((i13 & 1) + (i13 | 1)) % 128;
            return null;
        }
        if (!zBooleanValue) {
            getsdktransactionid.getDeviceData.setRotation(0.0f);
            getsdktransactionid.getSDKTransactionID.setHeight(0);
            getsdktransactionid.getSDKTransactionID.setAlpha(0.0f);
            int deviceData = CompletionEvent.getDeviceData.getDeviceData();
            int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
            int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
            AuthenticationRequestParameters(deviceData2, 721056171, CompletionEvent.getDeviceData.getDeviceData(), -721056170, deviceData3, new Object[]{getsdktransactionid, getdevicedata4}, deviceData);
            int i14 = ChallengeResultCancelled;
            getSDKEphemeralPublicKey = k.c(i14 ^ 112, (i14 & 112) << 1, 1, 128);
            return null;
        }
        int i15 = ChallengeResultCancelled;
        int i16 = i15 & 77;
        int i17 = ((i15 ^ 77) | i16) << 1;
        int i18 = -((i15 | 77) & (~i16));
        getSDKEphemeralPublicKey = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
        getsdktransactionid.getDeviceData.animate().rotation(0.0f).start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getsdktransactionid.getSDKTransactionID.getHeight(), 0);
        valueAnimatorOfInt.addUpdateListener(getsdktransactionid);
        valueAnimatorOfInt.addListener(getsdktransactionid);
        valueAnimatorOfInt.start();
        getsdktransactionid.getSDKTransactionID.animate().alpha(0.0f).start();
        int i19 = getSDKEphemeralPublicKey;
        ChallengeResultCancelled = k.c(i19 ^ 30, (i19 & 30) << 1, 1, 128);
        return null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 9) % 128;
        getDeviceData getdevicedata = getsdktransactionid.getMessageVersion;
        getDeviceData getdevicedata2 = getDeviceData.EXPANDED;
        if (getdevicedata == getdevicedata2) {
            int i11 = ChallengeResultCancelled;
            int i12 = i11 & AppConstants.RESULT_CODE_ORDER_CANCELLED;
            int i13 = -(-((i11 ^ AppConstants.RESULT_CODE_ORDER_CANCELLED) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            getSDKEphemeralPublicKey = i14 % 128;
            if (i14 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (!zBooleanValue) {
            getsdktransactionid.getDeviceData.setRotation(180.0f);
            getsdktransactionid.getSDKTransactionID.setHeight(getsdktransactionid.BuildConfig);
            getsdktransactionid.getSDKTransactionID.setAlpha(getsdktransactionid.ChallengeResult);
            int deviceData = CompletionEvent.getDeviceData.getDeviceData();
            int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
            int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
            AuthenticationRequestParameters(deviceData2, 721056171, CompletionEvent.getDeviceData.getDeviceData(), -721056170, deviceData3, new Object[]{getsdktransactionid, getdevicedata2}, deviceData);
            int i15 = getSDKEphemeralPublicKey;
            ChallengeResultCancelled = a0.d((i15 & (-80)) | ((~i15) & 79), ~((i15 & 79) << 1), 1, 128);
            return null;
        }
        int i16 = ChallengeResultCancelled;
        getSDKEphemeralPublicKey = (((i16 | 115) << 1) - (i16 ^ 115)) % 128;
        getsdktransactionid.getDeviceData.animate().rotation(180.0f).start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, getsdktransactionid.BuildConfig);
        valueAnimatorOfInt.addUpdateListener(getsdktransactionid);
        valueAnimatorOfInt.addListener(getsdktransactionid);
        valueAnimatorOfInt.start();
        getsdktransactionid.getSDKTransactionID.animate().alpha(getsdktransactionid.ChallengeResult).start();
        int i17 = ChallengeResultCancelled;
        int i18 = (i17 ^ 126) + ((i17 & 126) << 1);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        getSDKEphemeralPublicKey = i19 % 128;
        if (i19 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getDeviceData getdevicedata;
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 19) % 128;
        getDeviceData getdevicedata2 = getsdktransactionid.getMessageVersion;
        getDeviceData getdevicedata3 = getDeviceData.COLLAPSED;
        if (getdevicedata2 == getdevicedata3) {
            int i11 = getSDKEphemeralPublicKey + 47;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 != 0) {
                getDeviceData getdevicedata4 = getDeviceData.EXPANDED;
                throw null;
            }
            getdevicedata = getDeviceData.EXPANDED;
        } else {
            int i12 = getSDKEphemeralPublicKey;
            ChallengeResultCancelled = a0.d(i12 ^ 47, ~((i12 & 47) << 1), 1, 128);
            getdevicedata = getdevicedata3;
        }
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, 721056171, CompletionEvent.getDeviceData.getDeviceData(), -721056170, deviceData3, new Object[]{getsdktransactionid, getdevicedata}, deviceData);
        getsdktransactionid.getSDKReferenceNumber.setClickable(true);
        if (getsdktransactionid.getMessageVersion != getdevicedata3) {
            getsdktransactionid.getSDKTransactionID.sendAccessibilityEvent(8);
            int i13 = ChallengeResultCancelled;
            getSDKEphemeralPublicKey = a0.d((i13 & (-74)) | ((~i13) & 73), ~(-(-((i13 & 73) << 1))), 1, 128);
            return null;
        }
        int i14 = ChallengeResultCancelled;
        int i15 = i14 & 115;
        int i16 = (i14 | 115) & (~i15);
        int i17 = -(-(i15 << 1));
        getSDKEphemeralPublicKey = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
        getsdktransactionid.getSDKReferenceNumber.sendAccessibilityEvent(8);
        int i18 = ChallengeResultCancelled;
        int i19 = (((i18 | 126) << 1) - (i18 ^ 126)) - 1;
        getSDKEphemeralPublicKey = i19 % 128;
        if (i19 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i11 = getSDKEphemeralPublicKey + 60;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            getsdktransactionid.getSDKTransactionID.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
            return null;
        }
        getsdktransactionid.getSDKTransactionID.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKReferenceNumber(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.av.getSDKTransactionID.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = (i11 | 51) << 1;
        int i13 = -(((~i11) & 51) | (i11 & (-52)));
        int i14 = (i12 & i13) + (i13 | i12);
        getSDKEphemeralPublicKey = i14 % 128;
        int i15 = i14 % 2;
        getsdktransactionid.getSDKReferenceNumber.setClickable(false);
        int i16 = getSDKEphemeralPublicKey;
        int i17 = ((i16 ^ 83) | (i16 & 83)) << 1;
        int i18 = -(((~i16) & 83) | (i16 & (-84)));
        int i19 = (i17 & i18) + (i18 | i17);
        ChallengeResultCancelled = i19 % 128;
        if (i19 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, -1063652477, CompletionEvent.getDeviceData.getDeviceData(), 1063652488, deviceData3, new Object[]{this, animator}, deviceData);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, 925368018, CompletionEvent.getDeviceData.getDeviceData(), -925368016, deviceData3, new Object[]{this, animator}, deviceData);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, -1408135972, CompletionEvent.getDeviceData.getDeviceData(), 1408135975, deviceData3, new Object[]{this, animator}, deviceData);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, -453840847, CompletionEvent.getDeviceData.getDeviceData(), 453840855, deviceData3, new Object[]{this, animator}, deviceData);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, 165963182, CompletionEvent.getDeviceData.getDeviceData(), -165963173, deviceData3, new Object[]{this, valueAnimator}, deviceData);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, -1569628518, CompletionEvent.getDeviceData.getDeviceData(), 1569628523, deviceData3, new Object[]{this, view}, deviceData);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, 1973972081, CompletionEvent.getDeviceData.getDeviceData(), -1973972081, deviceData3, new Object[]{this}, deviceData);
    }

    public final void setHeaderBackgroundColor(int i11) {
        Drawable background;
        int i12 = ChallengeResultCancelled;
        int i13 = (i12 & (-48)) | ((~i12) & 47);
        int i14 = -(-((i12 & 47) << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        getSDKEphemeralPublicKey = i15 % 128;
        int i16 = i15 % 2;
        View view = this.getSDKReferenceNumber;
        if (i16 == 0) {
            background = view.getBackground();
            if (Build.VERSION.SDK_INT >= 77) {
            }
            background.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
            int i17 = getSDKEphemeralPublicKey;
            int i18 = i17 & 85;
            int i19 = -(-((i17 ^ 85) | i18));
            ChallengeResultCancelled = ((i18 & i19) + (i19 | i18)) % 128;
        }
        background = view.getBackground();
        if (background instanceof RippleDrawable) {
            int i21 = getSDKEphemeralPublicKey;
            int i22 = i21 ^ 39;
            int i23 = (((i21 & 39) | i22) << 1) - i22;
            ChallengeResultCancelled = i23 % 128;
            if (i23 % 2 == 0) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i11));
                return;
            } else {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i11));
                int i24 = 91 / 0;
                return;
            }
        }
        background.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
        int i172 = getSDKEphemeralPublicKey;
        int i182 = i172 & 85;
        int i192 = -(-((i172 ^ 85) | i182));
        ChallengeResultCancelled = ((i182 & i192) + (i192 | i182)) % 128;
    }

    public final void setHorizontalDividerColor(int i11) {
        int i12 = getSDKEphemeralPublicKey;
        int i13 = i12 | 67;
        ChallengeResultCancelled = ((i13 << 1) - ((~(i12 & 67)) & i13)) % 128;
        this.AuthenticationRequestParameters.setColor(i11);
        int i14 = ChallengeResultCancelled;
        int i15 = i14 & 13;
        int i16 = i14 | 13;
        int i17 = (i15 & i16) + (i16 | i15);
        getSDKEphemeralPublicKey = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public final void setHorizontalDividerThickness(int i11) {
        int i12 = getSDKEphemeralPublicKey;
        int i13 = i12 ^ 71;
        int i14 = ((i12 & 71) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        ChallengeResultCancelled = i16 % 128;
        int i17 = i16 % 2;
        atd.av.getDeviceData getdevicedata = this.AuthenticationRequestParameters;
        if (i17 == 0) {
            getdevicedata.setThickness(i11);
        } else {
            getdevicedata.setThickness(i11);
            int i18 = 38 / 0;
        }
    }

    public final void setInfo(String str) {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = (i11 | 73) << 1;
        int i13 = -(i11 ^ 73);
        ChallengeResultCancelled = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        this.getSDKTransactionID.setText(str);
        int i14 = ChallengeResultCancelled;
        int i15 = ((i14 ^ 100) + ((i14 & 100) << 1)) - 1;
        getSDKEphemeralPublicKey = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public final void setInfoFontSize(Integer num) {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = i11 & 55;
        int i13 = -(-((i11 ^ 55) | i12));
        ChallengeResultCancelled = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        this.getSDKTransactionID.setTextSize(num.intValue());
        int i14 = getSDKEphemeralPublicKey;
        int i15 = ((i14 ^ 108) + ((i14 & 108) << 1)) - 1;
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final void setInfoTextColor(int i11) {
        int i12 = getSDKEphemeralPublicKey;
        int i13 = i12 & 63;
        int i14 = ((((i12 ^ 63) | i13) << 1) - (~(-((i12 | 63) & (~i13))))) - 1;
        ChallengeResultCancelled = i14 % 128;
        int i15 = i14 % 2;
        TextView textView = this.getSDKTransactionID;
        if (i15 == 0) {
            textView.setTextColor(i11);
        } else {
            textView.setTextColor(i11);
            int i16 = 66 / 0;
        }
    }

    public final void setInfoTypeface(Typeface typeface) {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = i11 & 71;
        ChallengeResultCancelled = a0.d(i12, ~((i11 ^ 71) | i12), 1, 128);
        this.getSDKTransactionID.setTypeface(typeface);
        int i13 = ChallengeResultCancelled;
        int i14 = i13 & 87;
        int i15 = -(-((i13 ^ 87) | i14));
        getSDKEphemeralPublicKey = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
    }

    public final void setStateIndicatorColor(int i11) {
        int i12 = getSDKEphemeralPublicKey;
        ChallengeResultCancelled = ((i12 & 3) + (i12 | 3)) % 128;
        this.getDeviceData.setColorFilter(i11);
        int i13 = ChallengeResultCancelled;
        int i14 = i13 & 19;
        int i15 = (((i13 ^ 19) | i14) << 1) - ((i13 | 19) & (~i14));
        getSDKEphemeralPublicKey = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public final void setTitle(String str) {
        int i11 = getSDKEphemeralPublicKey;
        ChallengeResultCancelled = k.c(i11 & 8, i11 | 8, 1, 128);
        this.getSDKAppID.setText(str);
        int i12 = ChallengeResultCancelled;
        int i13 = i12 & 59;
        int i14 = ((i12 ^ 59) | i13) << 1;
        int i15 = -((i12 | 59) & (~i13));
        getSDKEphemeralPublicKey = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
    }

    public final void setTitleFontSize(Integer num) {
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 117) % 128;
        this.getSDKAppID.setTextSize(num.intValue());
        int i11 = getSDKEphemeralPublicKey;
        int i12 = (i11 ^ 61) + ((i11 & 61) << 1);
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final void setTitleTextColor(int i11) {
        int i12 = getSDKEphemeralPublicKey;
        int i13 = i12 & 73;
        int i14 = i12 | 73;
        ChallengeResultCancelled = ((i13 & i14) + (i14 | i13)) % 128;
        this.getSDKAppID.setTextColor(i11);
        int i15 = ChallengeResultCancelled;
        getSDKEphemeralPublicKey = (((i15 & 18) + (i15 | 18)) - 1) % 128;
    }

    public final void setTitleTypeface(Typeface typeface) {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = ((i11 | 61) << 1) - (i11 ^ 61);
        ChallengeResultCancelled = i12 % 128;
        int i13 = i12 % 2;
        TextView textView = this.getSDKAppID;
        if (i13 != 0) {
            textView.setTypeface(typeface);
            int i14 = 99 / 0;
        } else {
            textView.setTypeface(typeface);
        }
        int i15 = ChallengeResultCancelled;
        int i16 = i15 & 7;
        int i17 = (i15 | 7) & (~i16);
        int i18 = -(-(i16 << 1));
        getSDKEphemeralPublicKey = (((i17 | i18) << 1) - (i17 ^ i18)) % 128;
    }

    private void getSDKTransactionID(getDeviceData getdevicedata) {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(deviceData2, 721056171, CompletionEvent.getDeviceData.getDeviceData(), -721056170, deviceData3, new Object[]{this, getdevicedata}, deviceData);
    }

    private void getSDKTransactionID(boolean z11) {
        Object[] objArr = {this, Boolean.valueOf(z11)};
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(CompletionEvent.getDeviceData.getDeviceData(), -602242799, CompletionEvent.getDeviceData.getDeviceData(), 602242806, CompletionEvent.getDeviceData.getDeviceData(), objArr, deviceData);
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getSDKTransactionID(Context context) {
        this(context, null);
    }

    private void getDeviceData(boolean z11) {
        Object[] objArr = {this, Boolean.valueOf(z11)};
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(CompletionEvent.getDeviceData.getDeviceData(), 1092871753, CompletionEvent.getDeviceData.getDeviceData(), -1092871747, CompletionEvent.getDeviceData.getDeviceData(), objArr, deviceData);
    }

    private getDeviceData getSDKReferenceNumber() {
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
        int deviceData3 = CompletionEvent.getDeviceData.getDeviceData();
        return (getDeviceData) AuthenticationRequestParameters(deviceData2, 1577361083, CompletionEvent.getDeviceData.getDeviceData(), -1577361079, deviceData3, new Object[]{this}, deviceData);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = getSDKEphemeralPublicKey;
        int i12 = i11 & 25;
        int i13 = -(-(i11 | 25));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 != 0) {
            Object[] objArr2 = {getsdktransactionid, Boolean.TRUE};
            int deviceData = CompletionEvent.getDeviceData.getDeviceData();
            AuthenticationRequestParameters(CompletionEvent.getDeviceData.getDeviceData(), -602242799, CompletionEvent.getDeviceData.getDeviceData(), 602242806, CompletionEvent.getDeviceData.getDeviceData(), objArr2, deviceData);
        } else {
            Object[] objArr3 = {getsdktransactionid, Boolean.TRUE};
            int deviceData2 = CompletionEvent.getDeviceData.getDeviceData();
            AuthenticationRequestParameters(CompletionEvent.getDeviceData.getDeviceData(), -602242799, CompletionEvent.getDeviceData.getDeviceData(), 602242806, CompletionEvent.getDeviceData.getDeviceData(), objArr3, deviceData2);
        }
        int i15 = getSDKEphemeralPublicKey + 105;
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 48 / 0;
        }
        return null;
    }

    private void AuthenticationRequestParameters(boolean z11) {
        Object[] objArr = {this, Boolean.valueOf(z11)};
        int deviceData = CompletionEvent.getDeviceData.getDeviceData();
        AuthenticationRequestParameters(CompletionEvent.getDeviceData.getDeviceData(), -829869376, CompletionEvent.getDeviceData.getDeviceData(), 829869386, CompletionEvent.getDeviceData.getDeviceData(), objArr, deviceData);
    }
}
