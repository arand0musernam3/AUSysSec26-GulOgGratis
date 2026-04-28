package com.adyen.threeds2.internal.ui.activity;

import android.R;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.o0;
import atd.au.AuthenticationRequestParameters;
import atd.aw.AuthenticationRequestParameters;
import atd.bb.ChallengeResultError;
import atd.c.ChallengeResultCompleted;
import atd.c.getAdditionalDetails;
import atd.c.onCompletion;
import atd.e.ChallengeResult;
import atd.n.getMessageVersion;
import atd.n.getSDKReferenceNumber;
import atd.p.getSDKEphemeralPublicKey;
import atd.y.protocolError;
import atd.z.getErrorDetails;
import com.app.tgtg.model.local.AppConstants;
import h7.h2;
import h7.w;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.i18n.LocalizedMessage;
import w.a0;
import x6.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char[] ChallengeResultCancelled;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static int getTransactionStatus;
    private getDeviceData ChallengeResult;
    final atd.ax.getSDKAppID getDeviceData;
    private final atd.ap.getDeviceData getSDKAppID;
    private final o0 getSDKReferenceNumber;
    final Queue<AnimatorSet> getSDKTransactionID = new ArrayDeque();

    /* JADX INFO: renamed from: com.adyen.threeds2.internal.ui.activity.getSDKAppID$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AuthenticationRequestParameters;
        private static int getDeviceData = 1;
        private static int getSDKReferenceNumber;

        static {
            int[] iArr = new int[atd.h.getSDKTransactionID.values().length];
            AuthenticationRequestParameters = iArr;
            try {
                iArr[atd.h.getSDKTransactionID.SINGLE_TEXT_INPUT.ordinal()] = 1;
                int i11 = getDeviceData;
                int i12 = i11 ^ 5;
                int i13 = ((i11 & 5) | i12) << 1;
                int i14 = -i12;
                getSDKReferenceNumber = (((i13 | i14) << 1) - (i13 ^ i14)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AuthenticationRequestParameters[atd.h.getSDKTransactionID.SINGLE_SELECT.ordinal()] = 2;
                int i15 = getDeviceData;
                getSDKReferenceNumber = ((((i15 | 124) << 1) - (i15 ^ 124)) - 1) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AuthenticationRequestParameters[atd.h.getSDKTransactionID.MULTI_SELECT.ordinal()] = 3;
                int i16 = getSDKReferenceNumber;
                getDeviceData = ((i16 ^ 39) + ((i16 & 39) << 1)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AuthenticationRequestParameters[atd.h.getSDKTransactionID.OUT_OF_BAND.ordinal()] = 4;
                getSDKReferenceNumber = (getDeviceData + 119) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AuthenticationRequestParameters[atd.h.getSDKTransactionID.HTML_UI.ordinal()] = 5;
                int i17 = getDeviceData;
                getSDKReferenceNumber = a0.d((i17 | 68) << 1, i17 ^ 68, 1, 128);
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r6 = r6 + 107
            byte[] r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.getSDKAppID.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getTransactionStatus = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        ChallengeResult();
        int i11 = getSDKEphemeralPublicKey + 117;
        getTransactionStatus = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 44 / 0;
        }
    }

    public getSDKAppID(o0 o0Var, atd.ax.getSDKAppID getsdkappid, atd.ap.getDeviceData getdevicedata) {
        this.getSDKReferenceNumber = o0Var;
        this.getDeviceData = getsdkappid;
        this.getSDKAppID = getdevicedata;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~i11;
        int i18 = ~(i17 | i14);
        int i19 = ~i13;
        int i21 = ~(i19 | i14);
        int i22 = i18 | i21;
        int i23 = ~i14;
        int i24 = ~(i23 | i11);
        int i25 = (~(i13 | i17)) | i24 | i21;
        int i26 = (~(i23 | i19)) | i24 | (~(i19 | i11));
        int i27 = (-1647181824) * i15;
        int i28 = (606601216 * i12) + (1313472512 * i16) + i27 + (768614067 * i26) + (i25 * 768614067) + ((-1537228134) * i22) + ((-878567756) * i11) + ((1110557339 * i14) - 760807424);
        int iC = a0.c(i12, 2055044340, ((-954185507) * i16) + i14 + i11 + i15);
        int i29 = i25 * 621;
        int i31 = i26 * 621;
        int i32 = i15 * 1290136159;
        int i33 = i16 * 826674179;
        int i34 = i12 * 1594648204;
        int iE = a0.e(iC, 572063744, i34 + i33 + i32 + i31 + i29 + (i22 * (-1242)) + (i11 * 1290136780) + (i14 * 1290134917) + 267690129, 607715328, ((-1232666624) * iC) + i28);
        if (iE == 1) {
            return getSDKAppID(objArr);
        }
        if (iE != 2) {
            return getDeviceData(objArr);
        }
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getMessageVersion = (BuildConfig + 31) % 128;
        View viewChallengeResultCancelled = getsdkappid.ChallengeResultCancelled();
        if (!(viewChallengeResultCancelled instanceof atd.au.getDeviceData)) {
            return null;
        }
        getMessageVersion = (BuildConfig + 27) % 128;
        return (atd.au.getDeviceData) viewChallengeResultCancelled;
    }

    private View BuildConfig() {
        int i11;
        int i12 = getMessageVersion + 63;
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            getSDKEphemeralPublicKey().getChildCount();
            throw null;
        }
        ViewGroup sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        int childCount = sDKEphemeralPublicKey.getChildCount();
        if (childCount > 0) {
            i11 = childCount - 1;
            getMessageVersion = (BuildConfig + 105) % 128;
        } else {
            i11 = 0;
        }
        return sDKEphemeralPublicKey.getChildAt(i11);
    }

    public static void ChallengeResult() {
        ChallengeResultCancelled = new char[]{63416, 63484, 63483, 63459, 63459, 63458, 63464, 63459, 63456, 63482, 63481, 63458, 63457, 63462, 63466, 63460};
    }

    private View ChallengeResultCancelled() {
        BuildConfig = (getMessageVersion + 33) % 128;
        View childAt = getSDKEphemeralPublicKey().getChildAt(0);
        int i11 = getMessageVersion + 67;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return childAt;
        }
        throw null;
    }

    private static void a(int[] iArr, String str, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        char[] cArr;
        char[] cArr2;
        char c3;
        byte[] bArr;
        int i13;
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr2 = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i14 = iArr[0];
        int i15 = 1;
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr3 = ChallengeResultCancelled;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            i11 = 2;
            int i19 = 0;
            while (i19 < length) {
                try {
                    int i21 = i15;
                    Object[] objArr2 = {Integer.valueOf(cArr3[i19])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(754517312);
                    if (sDKTransactionID == null) {
                        bArr = bArr2;
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        i13 = i19;
                        sDKTransactionID = ChallengeResult.getDeviceData((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2943, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 36 - Process.getGidForName(""), -258931888, false, $$c(b8, b11, b11), new Class[]{cls});
                    } else {
                        bArr = bArr2;
                        i13 = i19;
                    }
                    cArr4[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i19 = i13 + 1;
                    i15 = i21;
                    bArr2 = bArr;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        } else {
            i11 = 2;
        }
        byte[] bArr3 = bArr2;
        int i22 = i15;
        char[] cArr5 = new char[i16];
        System.arraycopy(cArr3, i14, cArr5, 0, i16);
        if (bArr3 != null) {
            int i23 = $11 + 63;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                cArr2 = new char[i16];
                challengeResultError.AuthenticationRequestParameters = i22;
                c3 = 1;
            } else {
                cArr2 = new char[i16];
                challengeResultError.AuthenticationRequestParameters = 0;
                c3 = 0;
            }
            while (true) {
                int i24 = challengeResultError.AuthenticationRequestParameters;
                if (i24 >= i16) {
                    break;
                }
                int i25 = $10;
                $11 = (i25 + 81) % 128;
                if (bArr3[i24] == 1) {
                    int i26 = i25 + 99;
                    $11 = i26 % 128;
                    if (i26 % 2 == 0) {
                        char c7 = cArr5[i24];
                        Object[] objArr3 = new Object[i11];
                        objArr3[1] = Integer.valueOf(c3);
                        objArr3[0] = Integer.valueOf(c7);
                        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(788825057);
                        if (sDKTransactionID2 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 + 1);
                            sDKTransactionID2 = ChallengeResult.getDeviceData(3095 - ExpandableListView.getPackedPositionType(0L), (char) (14367 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 18 - TextUtils.indexOf("", "", 0), -210991631, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{cls, cls});
                        }
                        cArr2[i24] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        int i27 = 82 / 0;
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr5[i24]), Integer.valueOf(c3)};
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(788825057);
                        if (sDKTransactionID3 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = (byte) (b14 + 1);
                            sDKTransactionID3 = ChallengeResult.getDeviceData(3095 - View.resolveSize(0, 0), (char) (14367 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 17 - TextUtils.lastIndexOf("", '0', 0, 0), -210991631, false, $$c(b14, b15, (byte) (b15 - 1)), new Class[]{cls, cls});
                        }
                        cArr2[i24] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(cArr5[i24]), Integer.valueOf(c3)};
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-565071239);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = (byte) (b16 + 3);
                        sDKTransactionID4 = ChallengeResult.getDeviceData(2773 - Process.getGidForName(""), (char) (13108 - AndroidCharacter.getMirror('0')), MotionEvent.axisFromString("") + 26, 37336169, false, $$c(b16, b17, (byte) (b17 - 3)), new Class[]{cls, cls});
                    }
                    cArr2[i24] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                }
                c3 = cArr2[challengeResultError.AuthenticationRequestParameters];
                Object[] objArr6 = {challengeResultError, challengeResultError};
                Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(2107237619);
                if (sDKTransactionID5 == null) {
                    sDKTransactionID5 = ChallengeResult.getDeviceData(2278 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (65522 - View.MeasureSpec.getSize(0)), 33 - TextUtils.lastIndexOf("", '0', 0), -1577983261, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID5).invoke(null, objArr6);
                i11 = 2;
            }
            $11 = ($10 + 39) % 128;
            cArr5 = cArr2;
        }
        if (i18 > 0) {
            char[] cArr6 = new char[i16];
            System.arraycopy(cArr5, 0, cArr6, 0, i16);
            int i28 = i16 - i18;
            System.arraycopy(cArr6, 0, cArr5, i28, i18);
            System.arraycopy(cArr6, i18, cArr5, 0, i28);
        }
        if (z11) {
            int i29 = $11 + 7;
            $10 = i29 % 128;
            if (i29 % 2 != 0) {
                cArr = new char[i16];
                i12 = 0;
            } else {
                i12 = 0;
                cArr = new char[i16];
            }
            challengeResultError.AuthenticationRequestParameters = i12;
            while (true) {
                int i31 = challengeResultError.AuthenticationRequestParameters;
                if (i31 >= i16) {
                    break;
                }
                cArr[i31] = cArr5[(i16 - i31) - 1];
                challengeResultError.AuthenticationRequestParameters = i31 + 1;
            }
            $10 = ($11 + 21) % 128;
            cArr5 = cArr;
        }
        if (i17 > 0) {
            challengeResultError.AuthenticationRequestParameters = 0;
            while (true) {
                int i32 = challengeResultError.AuthenticationRequestParameters;
                if (i32 >= i16) {
                    break;
                }
                cArr5[i32] = (char) (cArr5[i32] - iArr[2]);
                challengeResultError.AuthenticationRequestParameters = i32 + 1;
            }
        }
        String str3 = new String(cArr5);
        $10 = ($11 + 13) % 128;
        objArr[0] = str3;
    }

    private ViewGroup getSDKEphemeralPublicKey() {
        int i11 = BuildConfig + 109;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        o0 o0Var = this.getSDKReferenceNumber;
        if (i12 == 0) {
            return (ViewGroup) o0Var.findViewById(R.id.content);
        }
        ViewGroup viewGroup = (ViewGroup) o0Var.findViewById(R.id.content);
        int i13 = 46 / 0;
        return viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getSDKTransactionID(final android.view.View r8, final android.view.View r9) {
        /*
            r7 = this;
            int r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.getMessageVersion
            int r0 = r0 + 121
            int r1 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.getSDKAppID.BuildConfig = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 == 0) goto L82
            int r0 = com.adyen.threeds2.R.id.scrollView_content
            android.view.View r0 = r8.findViewById(r0)
            int r3 = com.adyen.threeds2.R.id.scrollView_content
            android.view.View r3 = r9.findViewById(r3)
            if (r3 == 0) goto L1f
            r4 = 0
            r3.setAlpha(r4)
        L1f:
            r7.getSDKAppID(r9)
            if (r0 == 0) goto L30
            android.util.Property r4 = android.view.View.ALPHA
            float[] r5 = new float[r1]
            r5 = {x008e: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r5)
            goto L31
        L30:
            r0 = r2
        L31:
            if (r3 == 0) goto L3e
            android.util.Property r2 = android.view.View.ALPHA
            float[] r4 = new float[r1]
            r4 = {x0096: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r2, r4)
        L3e:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L5b
            int r6 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.getMessageVersion
            int r6 = r6 + 23
            int r6 = r6 % 128
            com.adyen.threeds2.internal.ui.activity.getSDKAppID.BuildConfig = r6
            if (r2 == 0) goto L5b
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r5] = r0
            r1[r4] = r2
            r3.playTogether(r1)
            goto L76
        L5b:
            if (r2 == 0) goto L6d
            android.animation.Animator[] r0 = new android.animation.Animator[r4]
            r0[r5] = r2
            r3.playTogether(r0)
            int r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.BuildConfig
            int r0 = r0 + 53
            int r0 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.getSDKAppID.getMessageVersion = r0
            goto L76
        L6d:
            if (r0 == 0) goto L76
            android.animation.Animator[] r1 = new android.animation.Animator[r4]
            r1[r5] = r0
            r3.playTogether(r1)
        L76:
            com.adyen.threeds2.internal.ui.activity.getSDKAppID$4 r0 = new com.adyen.threeds2.internal.ui.activity.getSDKAppID$4
            r0.<init>()
            r3.addListener(r0)
            r7.getSDKTransactionID(r3)
            return
        L82:
            int r0 = com.adyen.threeds2.R.id.scrollView_content
            r8.findViewById(r0)
            int r8 = com.adyen.threeds2.R.id.scrollView_content
            r9.findViewById(r8)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.getSDKAppID.getSDKTransactionID(android.view.View, android.view.View):void");
    }

    public static void init$0() {
        $$a = new byte[]{121, 73, 61, -82};
        $$b = 125;
    }

    public final void getDeviceData(atd.c.getSDKTransactionID getsdktransactionid) {
        BuildConfig = (getMessageVersion + 101) % 128;
        int sDKAppID = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID2 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID3 = getMessageVersion.getDeviceData.getSDKAppID();
        AuthenticationRequestParameters(1359784443, getMessageVersion.getDeviceData.getSDKAppID(), sDKAppID, -1359784443, sDKAppID2, sDKAppID3, new Object[]{this});
        int i11 = AnonymousClass5.AuthenticationRequestParameters[getsdktransactionid.getSDKTransactionID().ordinal()];
        if (i11 == 1) {
            View challengeResult = new atd.au.ChallengeResult(this.getSDKReferenceNumber);
            getSDKTransactionID(challengeResult);
            int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
            atd.au.ChallengeResult.getSDKTransactionID(-108279692, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 108279695, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), new Object[]{challengeResult, (onCompletion) getsdktransactionid});
        } else if (i11 == 2 || i11 == 3) {
            View getsdkephemeralpublickey = new atd.au.getSDKEphemeralPublicKey(this.getSDKReferenceNumber);
            getSDKTransactionID(getsdkephemeralpublickey);
            int deviceData = protocolError.getSDKTransactionID.getDeviceData();
            int deviceData2 = protocolError.getSDKTransactionID.getDeviceData();
            atd.au.getSDKEphemeralPublicKey.getSDKReferenceNumber(deviceData, protocolError.getSDKTransactionID.getDeviceData(), 1120330753, -1120330751, new Object[]{getsdkephemeralpublickey, (getAdditionalDetails) getsdktransactionid}, deviceData2, protocolError.getSDKTransactionID.getDeviceData());
        } else if (i11 == 4) {
            View getsdkappid = new atd.au.getSDKAppID(this.getSDKReferenceNumber);
            getSDKTransactionID(getsdkappid);
            int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
            int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
            int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
            atd.au.getSDKAppID.AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{getsdkappid, (ChallengeResultCompleted) getsdktransactionid}, sDKReferenceNumber2, -577223693, 577223697);
        } else {
            if (i11 != 5) {
                throw atd.aa.getSDKReferenceNumber.CHALLENGE_PRESENTATION_FAILURE.getDeviceData();
            }
            atd.au.getSDKTransactionID getsdktransactionid2 = new atd.au.getSDKTransactionID(this.getSDKReferenceNumber);
            getSDKTransactionID(getsdktransactionid2);
            getsdktransactionid2.getSDKAppID((atd.c.ChallengeResult) getsdktransactionid);
            getMessageVersion = (BuildConfig + 107) % 128;
        }
        int sDKAppID4 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID5 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID6 = getMessageVersion.getDeviceData.getSDKAppID();
        atd.au.getDeviceData getdevicedata = (atd.au.getDeviceData) AuthenticationRequestParameters(1532928193, getMessageVersion.getDeviceData.getSDKAppID(), sDKAppID4, -1532928191, sDKAppID5, sDKAppID6, new Object[]{this});
        if (getdevicedata != null) {
            getMessageVersion = (BuildConfig + 115) % 128;
            getdevicedata.setOverlayDetectionListener(this.getSDKAppID);
            getMessageVersion = (BuildConfig + 99) % 128;
        }
    }

    public final void getMessageVersion() {
        this.getSDKTransactionID.poll();
        if (!this.getSDKTransactionID.isEmpty()) {
            int i11 = BuildConfig + 101;
            getMessageVersion = i11 % 128;
            int i12 = i11 % 2;
            Queue<AnimatorSet> queue = this.getSDKTransactionID;
            if (i12 != 0) {
                queue.peek();
                throw null;
            }
            AnimatorSet animatorSetPeek = queue.peek();
            if (animatorSetPeek != null) {
                animatorSetPeek.start();
            }
        }
        int i13 = getMessageVersion + 11;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public final void getSDKAppID(atd.c.getSDKTransactionID getsdktransactionid) {
        int sDKAppID = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID2 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID3 = getMessageVersion.getDeviceData.getSDKAppID();
        atd.au.getDeviceData getdevicedata = (atd.au.getDeviceData) AuthenticationRequestParameters(1532928193, getMessageVersion.getDeviceData.getSDKAppID(), sDKAppID, -1532928191, sDKAppID2, sDKAppID3, new Object[]{this});
        if (getdevicedata != null) {
            int i11 = getMessageVersion + 63;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (getdevicedata instanceof AuthenticationRequestParameters) {
                return;
            }
            int i12 = AnonymousClass5.AuthenticationRequestParameters[getsdktransactionid.getSDKTransactionID().ordinal()];
            if (i12 != 4) {
                if (i12 != 5) {
                    return;
                }
                ((atd.au.getSDKTransactionID) getdevicedata).getSDKReferenceNumber((atd.c.ChallengeResult) getsdktransactionid);
            } else {
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                atd.au.getSDKAppID.AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{(atd.au.getSDKAppID) getdevicedata, (ChallengeResultCompleted) getsdktransactionid}, sDKReferenceNumber2, -244795152, 244795158);
                BuildConfig = (getMessageVersion + 27) % 128;
            }
        }
    }

    public final void getSDKReferenceNumber() {
        while (!this.getSDKTransactionID.isEmpty()) {
            AnimatorSet animatorSetPoll = this.getSDKTransactionID.poll();
            if (animatorSetPoll != null) {
                int i11 = getMessageVersion + 41;
                BuildConfig = i11 % 128;
                if (i11 % 2 == 0) {
                    animatorSetPoll.cancel();
                    animatorSetPoll.removeAllListeners();
                    throw null;
                }
                animatorSetPoll.cancel();
                animatorSetPoll.removeAllListeners();
                BuildConfig = (getMessageVersion + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            }
        }
    }

    public final void getSDKReferenceNumber(View view) {
        int sDKAppID = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID2 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID3 = getMessageVersion.getDeviceData.getSDKAppID();
        AuthenticationRequestParameters(1563987288, getMessageVersion.getDeviceData.getSDKAppID(), sDKAppID, -1563987287, sDKAppID2, sDKAppID3, new Object[]{this, view});
    }

    public static boolean getSDKAppID() {
        int i11 = (getMessageVersion + 5) % 128;
        BuildConfig = i11;
        boolean z11 = AuthenticationRequestParameters;
        getMessageVersion = (i11 + 69) % 128;
        return z11;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        View view = (View) objArr[1];
        int i11 = getMessageVersion + 5;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            getsdkappid.getSDKEphemeralPublicKey().removeView(view);
            getMessageVersion = (BuildConfig + 57) % 128;
            return null;
        }
        getsdkappid.getSDKEphemeralPublicKey().removeView(view);
        throw null;
    }

    private void getSDKAppID(View view) {
        ViewGroup sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (view instanceof AuthenticationRequestParameters) {
            int i11 = getMessageVersion + 113;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                sDKEphemeralPublicKey.addView(view, sDKEphemeralPublicKey.getChildCount());
                int i12 = BuildConfig + 95;
                getMessageVersion = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 67 / 0;
                    return;
                }
                return;
            }
            sDKEphemeralPublicKey.addView(view, sDKEphemeralPublicKey.getChildCount());
            throw null;
        }
        sDKEphemeralPublicKey.addView(view, 0);
    }

    private void getSDKTransactionID(View view) {
        View viewBuildConfig = BuildConfig();
        if (viewBuildConfig == null) {
            this.getSDKReferenceNumber.setContentView(view);
        } else if (!viewBuildConfig.equals(view)) {
            int i11 = getMessageVersion + 67;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                getSDKTransactionID(viewBuildConfig, view);
                BuildConfig = (getMessageVersion + 67) % 128;
            } else {
                getSDKTransactionID(viewBuildConfig, view);
                throw null;
            }
        }
        AuthenticationRequestParameters(view);
        BuildConfig = (getMessageVersion + 25) % 128;
    }

    private void getSDKTransactionID(AnimatorSet animatorSet) {
        if (this.getSDKTransactionID.isEmpty()) {
            getMessageVersion = (BuildConfig + 97) % 128;
            this.getSDKTransactionID.add(animatorSet);
            animatorSet.start();
            int i11 = getMessageVersion + 125;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getSDKTransactionID.add(animatorSet);
    }

    public final atd.au.getDeviceData getSDKTransactionID() {
        int sDKAppID = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID2 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID3 = getMessageVersion.getDeviceData.getSDKAppID();
        return (atd.au.getDeviceData) AuthenticationRequestParameters(1532928193, getMessageVersion.getDeviceData.getSDKAppID(), sDKAppID, -1532928191, sDKAppID2, sDKAppID3, new Object[]{this});
    }

    private static void AuthenticationRequestParameters(boolean z11) {
        int i11 = (BuildConfig + 121) % 128;
        getMessageVersion = i11;
        AuthenticationRequestParameters = z11;
        BuildConfig = (i11 + 31) % 128;
    }

    private void AuthenticationRequestParameters(@NonNull View view) {
        final View viewFindViewById = view.findViewById(com.adyen.threeds2.R.id.layout_toolbar);
        AuthenticationRequestParameters.C0004AuthenticationRequestParameters c0004AuthenticationRequestParameters = atd.aw.AuthenticationRequestParameters.AuthenticationRequestParameters;
        final atd.aw.AuthenticationRequestParameters sDKTransactionID = AuthenticationRequestParameters.C0004AuthenticationRequestParameters.getSDKTransactionID(viewFindViewById);
        final View viewFindViewById2 = view.findViewById(com.adyen.threeds2.R.id.scrollView_content);
        final atd.aw.AuthenticationRequestParameters sDKTransactionID2 = AuthenticationRequestParameters.C0004AuthenticationRequestParameters.getSDKTransactionID(viewFindViewById2);
        ViewCompat.k0(view, new w() { // from class: com.adyen.threeds2.internal.ui.activity.getSDKAppID.2
            private static int ChallengeResult = 0;
            private static int ChallengeResultCancelled = 1;

            @Override // h7.w
            @NonNull
            public final WindowInsetsCompat onApplyWindowInsets(@NonNull View view2, @NonNull WindowInsetsCompat windowInsetsCompat) {
                int i11 = ChallengeResult;
                int i12 = (i11 & 83) + (i11 | 83);
                ChallengeResultCancelled = i12 % 128;
                if (i12 % 2 == 0) {
                    int iH = h2.h();
                    int iB = h2.b();
                    int i13 = ((~iB) & iH) | ((~iH) & iB);
                    int i14 = iH & iB;
                    int i15 = (i14 & i13) | (i13 ^ i14);
                    int iC = h2.c();
                    int i16 = i15 ^ iC;
                    int i17 = i15 & iC;
                    windowInsetsCompat.e((i17 & i16) | (i16 ^ i17));
                    throw null;
                }
                int iH2 = h2.h();
                int iB2 = h2.b();
                d dVarE = windowInsetsCompat.e((iH2 & iB2) | (iH2 ^ iB2) | h2.c());
                View view3 = viewFindViewById;
                if (view3 != null) {
                    int sDKReferenceNumber = sDKTransactionID.getSDKReferenceNumber();
                    int i18 = -(-dVarE.f43873a);
                    int i19 = sDKReferenceNumber ^ i18;
                    int i21 = (sDKReferenceNumber & i18) << 1;
                    int i22 = ((i19 | i21) << 1) - (i21 ^ i19);
                    int deviceData = sDKTransactionID.getDeviceData();
                    int i23 = -(-dVarE.f43874b);
                    int i24 = deviceData & i23;
                    int i25 = i24 + ((deviceData ^ i23) | i24);
                    int sDKTransactionID3 = sDKTransactionID.getSDKTransactionID();
                    int i26 = dVarE.f43875c;
                    int iAuthenticationRequestParameters = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int i27 = i26 * 370;
                    int i28 = sDKTransactionID3 * 370;
                    int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                    int i31 = ~sDKTransactionID3;
                    int i32 = ~i26;
                    int i33 = (i26 & i31) | (sDKTransactionID3 & i32);
                    int i34 = i26 & sDKTransactionID3;
                    int i35 = (i33 & i34) | (i33 ^ i34);
                    int i36 = ~iAuthenticationRequestParameters;
                    int i37 = i35 & i36;
                    int i38 = (((i35 | i36) & (~i37)) | i37) * (-369);
                    int i39 = (i29 ^ i38) + ((i38 & i29) << 1);
                    int i41 = (~i26) & (i32 | i26);
                    int i42 = ~iAuthenticationRequestParameters;
                    int i43 = (i42 | iAuthenticationRequestParameters) & i36;
                    int i44 = ~((i41 & i43) | (i41 ^ i43));
                    int i45 = ((~i44) & sDKTransactionID3) | (i44 & i31);
                    int i46 = i44 & sDKTransactionID3;
                    int i47 = ((i46 & i45) | (i45 ^ i46)) * (-369);
                    int i48 = i39 & i47;
                    int i49 = -(-((i47 ^ i39) | i48));
                    int i51 = (i48 ^ i49) + ((i49 & i48) << 1);
                    int i52 = ~sDKTransactionID3;
                    int i53 = i52 & i26;
                    int i54 = (i52 | i26) & (~i53);
                    int i55 = ~((i54 & i53) | (i54 ^ i53));
                    int i56 = ~((iAuthenticationRequestParameters & i26) | (i26 ^ iAuthenticationRequestParameters));
                    int i57 = (i56 & i55) | ((~i56) & i55) | ((~i55) & i56);
                    int i58 = ~i26;
                    int i59 = (i58 & i42) | (i58 ^ i42);
                    int i61 = (i31 & i59) | ((~i59) & sDKTransactionID3);
                    int i62 = sDKTransactionID3 & i59;
                    int i63 = ~((i62 & i61) | (i61 ^ i62));
                    int i64 = i57 & i63;
                    int i65 = (i63 | i57) & (~i64);
                    int i66 = ((i65 & i64) | (i65 ^ i64)) * 369;
                    view3.setPadding(i22, i25, ((i51 | i66) << 1) - (i66 ^ i51), sDKTransactionID.getSDKAppID());
                    int i67 = ChallengeResult;
                    int i68 = i67 & 101;
                    int i69 = -(-((i67 ^ 101) | i68));
                    ChallengeResultCancelled = ((i68 ^ i69) + ((i69 & i68) << 1)) % 128;
                }
                View view4 = viewFindViewById2;
                if (view4 != null) {
                    ChallengeResultCancelled = (ChallengeResult + 45) % 128;
                    int sDKReferenceNumber2 = sDKTransactionID2.getSDKReferenceNumber();
                    int i71 = dVarE.f43873a;
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i72 = i71 * 860;
                    int i73 = -(~(-(-(sDKReferenceNumber2 * (-858)))));
                    int i74 = ((i72 & i73) + (i72 | i73)) - 1;
                    int i75 = ~iIdentityHashCode;
                    int i76 = (i71 & i75) | ((~i71) & iIdentityHashCode);
                    int i77 = i71 & iIdentityHashCode;
                    int i78 = (i74 - (~(-(~(((i76 & i77) | (i76 ^ i77)) * (-859)))))) - 2;
                    int i79 = ~iIdentityHashCode;
                    int i81 = i79 & i71;
                    int i82 = (i79 | i71) & (~i81);
                    int i83 = ~((i82 & i81) | (i82 ^ i81));
                    int i84 = ~i71;
                    int i85 = ~sDKReferenceNumber2;
                    int i86 = i84 ^ i85;
                    int i87 = i84 & i85;
                    int i88 = (i87 & i86) | (i86 ^ i87);
                    int i89 = i88 ^ iIdentityHashCode;
                    int i91 = iIdentityHashCode & i88;
                    int i92 = (i91 & i89) | (i89 ^ i91);
                    int i93 = (i92 | (~i92)) & (~i92);
                    int i94 = i83 & i93;
                    int i95 = (i93 | i83) & (~i94);
                    int i96 = -(-(((i95 & i94) | (i95 ^ i94)) * 859));
                    int i97 = i78 & i96;
                    int i98 = ((i78 ^ i96) | i97) << 1;
                    int i99 = -((i96 | i78) & (~i97));
                    int i100 = (i98 & i99) + (i99 | i98);
                    int i101 = i85 & i75;
                    int i102 = ~(i101 | ((i75 | i85) & (~i101)));
                    int i103 = i85 ^ i71;
                    int i104 = i85 & i71;
                    int i105 = (i104 & i103) | (i103 ^ i104);
                    int i106 = (i105 | (~i105)) & (~i105);
                    int i107 = -(-(((i106 & i102) | (i102 ^ i106)) * 859));
                    int i108 = (((i100 ^ i107) | (i100 & i107)) << 1) - ((i107 & (~i100)) | ((~i107) & i100));
                    int deviceData2 = sDKTransactionID2.getDeviceData();
                    int sDKTransactionID4 = sDKTransactionID2.getSDKTransactionID();
                    int i109 = dVarE.f43875c;
                    int iAuthenticationRequestParameters2 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int i110 = i109 * 193;
                    int i111 = -(-(sDKTransactionID4 * 193));
                    int i112 = (i110 & i111) + (i110 | i111);
                    int i113 = ~iAuthenticationRequestParameters2;
                    int i114 = ~i109;
                    int i115 = ~sDKTransactionID4;
                    int i116 = (i114 & i115) | ((~i114) & sDKTransactionID4);
                    int i117 = i114 & sDKTransactionID4;
                    int i118 = ~((i116 & i117) | (i116 ^ i117));
                    int i119 = i113 ^ i118;
                    int i120 = i118 & i113;
                    int i121 = ((i120 & i119) | (i119 ^ i120)) * (-192);
                    int i122 = i112 & i121;
                    int i123 = (i112 | i121) & (~i122);
                    int i124 = i122 << 1;
                    int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                    int i126 = i114 & i115;
                    int i127 = (i114 | i115) & (~i126);
                    int i128 = ~((i127 & i126) | (i127 ^ i126));
                    int i129 = ~sDKTransactionID4;
                    int i130 = ~iAuthenticationRequestParameters2;
                    int i131 = i129 & i130;
                    int i132 = ~(((~i131) & (i129 | i130)) | i131);
                    int i133 = (i132 & (~i128)) | ((~i132) & i128);
                    int i134 = i128 & i132;
                    int i135 = -(-(((i133 & i134) | (i133 ^ i134)) * (-384)));
                    int i136 = i125 & i135;
                    int i137 = ((i135 | i125) & (~i136)) + (i136 << 1);
                    int i138 = ~i109;
                    int i139 = ~i109;
                    int i140 = i138 & (i139 | i109);
                    int i141 = (i140 & i129) | (i140 ^ i129);
                    int i142 = ((~i141) & iAuthenticationRequestParameters2) | (i141 & i130);
                    int i143 = i141 & iAuthenticationRequestParameters2;
                    int i144 = ~((i142 & i143) | (i142 ^ i143));
                    int i145 = i113 & (i130 | iAuthenticationRequestParameters2);
                    int i146 = i129 ^ i145;
                    int i147 = i145 & i129;
                    int i148 = (i147 & i146) | (i146 ^ i147);
                    int i149 = i148 & i109;
                    int i150 = (i148 | i109) & (~i149);
                    int i151 = ~((i150 & i149) | (i150 ^ i149));
                    int i152 = i144 ^ i151;
                    int i153 = i144 & i151;
                    int i154 = (i153 & i152) | (i152 ^ i153);
                    int i155 = (i109 & sDKTransactionID4) | (i109 & i115) | (sDKTransactionID4 & i139);
                    int i156 = (i155 & i130) | ((~i155) & iAuthenticationRequestParameters2);
                    int i157 = i155 & iAuthenticationRequestParameters2;
                    int i158 = ~((i157 & i156) | (i156 ^ i157));
                    int i159 = ((~i158) & i154) | ((~i154) & i158);
                    int i160 = i154 & i158;
                    int i161 = -(~(((i160 & i159) | (i159 ^ i160)) * BERTags.PRIVATE));
                    int i162 = (((i137 | i161) << 1) - (i137 ^ i161)) - 1;
                    int sDKAppID = sDKTransactionID2.getSDKAppID();
                    int i163 = dVarE.f43876d;
                    int i164 = ((sDKAppID ^ i163) | (sDKAppID & i163)) << 1;
                    int i165 = -((i163 & (~sDKAppID)) | ((~i163) & sDKAppID));
                    view4.setPadding(i108, deviceData2, i162, ((i164 | i165) << 1) - (i165 ^ i164));
                    ChallengeResultCancelled = (ChallengeResult + 25) % 128;
                }
                int i166 = ChallengeResultCancelled;
                int i167 = (i166 & (-108)) | ((~i166) & 107);
                int i168 = -(-((i166 & 107) << 1));
                ChallengeResult = ((i167 & i168) + (i168 | i167)) % 128;
                return windowInsetsCompat;
            }
        });
        view.requestApplyInsets();
        int i11 = getMessageVersion + 3;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public final void AuthenticationRequestParameters() {
        int sDKAppID = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID2 = getMessageVersion.getDeviceData.getSDKAppID();
        int sDKAppID3 = getMessageVersion.getDeviceData.getSDKAppID();
        AuthenticationRequestParameters(1359784443, getMessageVersion.getDeviceData.getSDKAppID(), sDKAppID, -1359784443, sDKAppID2, sDKAppID3, new Object[]{this});
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = BuildConfig + 65;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            if (getSDKAppID()) {
                getMessageVersion = (BuildConfig + 35) % 128;
                AuthenticationRequestParameters(false);
                getDeviceData getdevicedata = getsdkappid.ChallengeResult;
                if (getdevicedata != null && getdevicedata.isAdded()) {
                    int i12 = getMessageVersion + 41;
                    BuildConfig = i12 % 128;
                    int i13 = i12 % 2;
                    getDeviceData getdevicedata2 = getsdkappid.ChallengeResult;
                    if (i13 == 0) {
                        getdevicedata2.dismiss();
                        getsdkappid.ChallengeResult = null;
                        int i14 = 78 / 0;
                    } else {
                        getdevicedata2.dismiss();
                        getsdkappid.ChallengeResult = null;
                    }
                }
            }
            return null;
        }
        getSDKAppID();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        r8.ChallengeResult = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r0 = com.adyen.threeds2.internal.ui.activity.getDeviceData.getSDKReferenceNumber();
        r8.ChallengeResult = r0;
        r6 = r8.getSDKReferenceNumber.getSupportFragmentManager();
        r3 = new java.lang.Object[1];
        a(new int[]{0, 16, 35, 1}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, r3);
        r0.show(r6, ((java.lang.String) r3[0]).intern());
        com.adyen.threeds2.internal.ui.activity.getSDKAppID.BuildConfig = (com.adyen.threeds2.internal.ui.activity.getSDKAppID.getMessageVersion + com.app.tgtg.model.local.AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getDeviceData() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = getSDKAppID()
            if (r0 != 0) goto L8a
            int r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.BuildConfig
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.getSDKAppID.getMessageVersion = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000"
            r2 = 35
            r3 = 16
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L3d
            AuthenticationRequestParameters(r4)
            androidx.fragment.app.o0 r0 = r8.getSDKReferenceNumber
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            int[] r6 = new int[]{r4, r3, r2, r5}
            java.lang.Object[] r7 = new java.lang.Object[r5]
            a(r6, r1, r4, r7)
            r6 = r7[r4]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r6)
            com.adyen.threeds2.internal.ui.activity.getDeviceData r0 = (com.adyen.threeds2.internal.ui.activity.getDeviceData) r0
            if (r0 == 0) goto L62
            goto L5f
        L3d:
            AuthenticationRequestParameters(r5)
            androidx.fragment.app.o0 r0 = r8.getSDKReferenceNumber
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            int[] r6 = new int[]{r4, r3, r2, r5}
            java.lang.Object[] r7 = new java.lang.Object[r5]
            a(r6, r1, r5, r7)
            r6 = r7[r4]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r6)
            com.adyen.threeds2.internal.ui.activity.getDeviceData r0 = (com.adyen.threeds2.internal.ui.activity.getDeviceData) r0
            if (r0 == 0) goto L62
        L5f:
            r8.ChallengeResult = r0
            return
        L62:
            com.adyen.threeds2.internal.ui.activity.getDeviceData r0 = com.adyen.threeds2.internal.ui.activity.getDeviceData.getSDKReferenceNumber()
            r8.ChallengeResult = r0
            androidx.fragment.app.o0 r6 = r8.getSDKReferenceNumber
            androidx.fragment.app.FragmentManager r6 = r6.getSupportFragmentManager()
            int[] r2 = new int[]{r4, r3, r2, r5}
            java.lang.Object[] r3 = new java.lang.Object[r5]
            a(r2, r1, r5, r3)
            r1 = r3[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.show(r6, r1)
            int r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.getMessageVersion
            int r0 = r0 + 123
            int r0 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.getSDKAppID.BuildConfig = r0
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.getSDKAppID.getDeviceData():void");
    }
}
