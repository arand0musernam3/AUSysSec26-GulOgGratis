package com.adyen.threeds2.internal.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.r;
import androidx.activity.y;
import androidx.annotation.NonNull;
import atd.ax.AuthenticationRequestParameters;
import atd.ax.getSDKReferenceNumber;
import atd.b.BuildConfig;
import atd.b.ChallengeResultCancelled;
import atd.b.getSDKEphemeralPublicKey;
import atd.e.ChallengeResult;
import atd.e.ChallengeResultError;
import atd.n.ChallengeResultTimeout;
import atd.n.getMessageVersion;
import atd.n.getSDKReferenceNumber;
import atd.x.getDeviceData;
import com.adyen.threeds2.exception.SDKRuntimeException;
import java.lang.reflect.Method;
import java.util.List;
import org.bouncycastle.crypto.signers.PSSSigner;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ChallengeActivity extends getSDKTransactionID implements AuthenticationRequestParameters, atd.ax.getDeviceData, getSDKReferenceNumber, atd.ax.getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static String AuthenticationRequestParameters;
    private static final String BuildConfig;
    private static String ChallengeResult;
    private static char[] ChallengeResultError;
    private static int ChallengeResultKt;
    private static long ChallengeResultTimeout;
    private static int ChallengeStatusHandler;
    private static int ChallengeStatusReceiver;
    private static int completed;
    private static long getAdditionalDetails;
    private static String getDeviceData;
    private static final String getMessageVersion;
    private static String getSDKAppID;
    private static final String getSDKEphemeralPublicKey;
    private static String getSDKReferenceNumber;
    private static String getSDKTransactionID;
    private getSDKAppID ChallengeResultCancelled;
    private boolean ChallengeResultCompleted;
    private atd.c.getSDKTransactionID getTransactionStatus;

    /* JADX INFO: renamed from: com.adyen.threeds2.internal.ui.activity.ChallengeActivity$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public class AnonymousClass4 extends y {
        public static int AuthenticationRequestParameters;
        public static int getSDKAppID;

        public AnonymousClass4() {
            super(true);
        }

        public static int getDeviceData() {
            int i11 = AuthenticationRequestParameters;
            int i12 = i11 % 7819626;
            AuthenticationRequestParameters = i11 + 1;
            if (i12 != 0) {
                return getSDKAppID;
            }
            int iMyPid = Process.myPid();
            getSDKAppID = iMyPid;
            return iMyPid;
        }

        @Override // androidx.activity.y
        public final void handleOnBackPressed() throws Throwable {
            int deviceData = ChallengeResultTimeout.getDeviceData.getDeviceData();
            int i11 = (~deviceData) & ((~deviceData) | deviceData);
            int i12 = (-393958847) & i11;
            int i13 = (~i12) & ((-393958847) | i11);
            int i14 = (i12 & i13) | (i13 ^ i12);
            int i15 = (i14 | (~i14)) & (~i14);
            int i16 = (-2110819910) & i15;
            int i17 = -(-((((i15 | (-2110819910)) & (~i16)) | i16) * (-90)));
            int i18 = (-1666197616) & i17;
            int i19 = ((((-1666197616) ^ i17) | i18) << 1) - ((i17 | (-1666197616)) & (~i18));
            int i21 = (-393958847) ^ deviceData;
            int i22 = (-393958847) & deviceData;
            int i23 = (i21 & i22) | (i21 ^ i22);
            int i24 = (i23 | (~i23)) & (~i23);
            int i25 = i24 & 1753254465;
            int i26 = (i24 | 1753254465) & (~i25);
            int i27 = (i19 - (~(-(-(((i26 & i25) | (i26 ^ i25)) * (-45)))))) - 1;
            int i28 = deviceData | 2110819909;
            int i29 = (i28 | (~i28)) & (~i28);
            int i31 = (-393958847) ^ i29;
            int i32 = i29 & (-393958847);
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = i11 & (-2110819910);
            int i35 = ((i11 | (-2110819910)) & (~i34)) | i34;
            int i36 = (i35 | (~i35)) & (~i35);
            int i37 = ((i33 & i36) | (i33 ^ i36)) * 45;
            int i38 = i27 & i37;
            int i39 = ((i37 | i27) & (~i38)) + (i38 << 1);
            int deviceData2 = ChallengeResultTimeout.getDeviceData.getDeviceData();
            int i41 = ~deviceData2;
            int i42 = (~deviceData2) | deviceData2;
            int i43 = i41 & i42;
            int i44 = (2141034465 & i43) | ((~i43) & (-2141034466));
            int i45 = i43 & (-2141034466);
            int i46 = (~((i45 & i44) | (i44 ^ i45))) * (-560);
            int i47 = (1266394109 & i46) + (i46 | 1266394109);
            int i48 = -(-((~(((-226858658) & deviceData2) | ((-226858658) ^ deviceData2))) * (-560)));
            int i49 = i47 & i48;
            int i51 = ((i48 | i47) & (~i49)) + (i49 << 1);
            int i52 = (~deviceData2) & i42;
            int i53 = (i52 & 226877103) | (i52 ^ 226877103);
            int i54 = (i53 | (~i53)) & (~i53);
            int i55 = -(-(((i54 & (-2141052912)) | ((-2141052912) ^ i54)) * 560));
            int i56 = (((~i55) & i51) | ((~i51) & i55)) + ((i55 & i51) << 1);
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            if (i39 > i56) {
                challengeActivity.getSDKAppID();
            } else {
                challengeActivity.getSDKAppID();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.$$c
            int r7 = 106 - r7
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + 1
            int r7 = r7 + r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.$$g(byte, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        ChallengeStatusReceiver = 0;
        ChallengeResultKt = 1;
        ChallengeStatusHandler = 0;
        completed = 1;
        getSDKTransactionID();
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getGlobalActionKeyTimeout();
        getSDKTransactionID = "ChallengeActivity";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getSDKTransactionID);
        Object[] objArr = new Object[1];
        c((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0', 0) + 71, objArr);
        sb2.append(((String) objArr[0]).intern());
        AuthenticationRequestParameters = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getSDKTransactionID);
        Object[] objArr2 = new Object[1];
        b("\udda5ࣻ瞪ꉌ褆\uf431⋣ঃ瑋ꍻ踥\uf4d5⎘\u0ea6畷ꀛ軘\uf58f₪ཻ稖ꃀ迺", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 54577, objArr2);
        sb3.append(((String) objArr2[0]).intern());
        getSDKReferenceNumber = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getSDKTransactionID);
        Object[] objArr3 = new Object[1];
        c((char) ExpandableListView.getPackedPositionGroup(0L), 22 - TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 93, objArr3);
        sb4.append(((String) objArr3[0]).intern());
        getDeviceData = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getSDKTransactionID);
        Object[] objArr4 = new Object[1];
        c((char) (28645 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 24 - (ViewConfiguration.getEdgeSlop() >> 16), 116 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
        sb5.append(((String) objArr4[0]).intern());
        getSDKAppID = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getSDKTransactionID);
        Object[] objArr5 = new Object[1];
        b("\udda5驿励ૌ쌝뮿珲⠟\ue04b壳ᄭ쥜膂縸㙢\uee91", 18353 - View.MeasureSpec.getSize(0), objArr5);
        sb6.append(((String) objArr5[0]).intern());
        ChallengeResult = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(getSDKTransactionID);
        Object[] objArr6 = new Object[1];
        c((char) (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25, 138 - TextUtils.indexOf((CharSequence) "", '0'), objArr6);
        sb7.append(((String) objArr6[0]).intern());
        BuildConfig = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(getSDKTransactionID);
        Object[] objArr7 = new Object[1];
        c((char) Drawable.resolveOpacity(0, 0), 24 - Color.argb(0, 0, 0, 0), 164 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
        sb8.append(((String) objArr7[0]).intern());
        getMessageVersion = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(getSDKTransactionID);
        Object[] objArr8 = new Object[1];
        c((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 16 - View.resolveSize(0, 0), 188 - View.combineMeasuredStates(0, 0), objArr8);
        sb9.append(((String) objArr8[0]).intern());
        getSDKEphemeralPublicKey = sb9.toString();
        int i11 = ChallengeResultKt + 91;
        ChallengeStatusReceiver = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private void ChallengeResultCancelled() throws Throwable {
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{this}, 961319719, sDKReferenceNumber3, -961319719, sDKReferenceNumber, sDKReferenceNumber2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.$$d
            int r7 = r7 * 2
            int r7 = r7 + 65
            int r1 = r5 + 11
            byte[] r1 = new byte[r1]
            int r5 = r5 + 10
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r7
            r7 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r0[r7]
        L29:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-2)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        r4[r7] = (char) r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0106, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r1 = atd.e.ChallengeResult.getSDKTransactionID(1456884118);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0110, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        r1 = (byte) 0;
        r1 = atd.e.ChallengeResult.getDeviceData((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3095, (char) (14367 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 18, -1967239290, false, $$g(r1, (byte) (r1 | 9), r1), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0140, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0145, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.b(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(char r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.c(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r6 = 156 - r6
            int r0 = r8 + 11
            byte[] r1 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 10
            r2 = 0
            if (r1 != 0) goto L16
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r1 = r1 + r6
            int r6 = r7 + 1
            int r7 = r1 + 1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.d(int, byte, byte, java.lang.Object[]):void");
    }

    private void getDeviceData(Intent intent) throws Throwable {
        String str;
        setIntent(intent);
        if (AuthenticationRequestParameters.equals(intent.getAction())) {
            ChallengeStatusHandler = (completed + 99) % 128;
            this.ChallengeResultCancelled.getDeviceData();
            return;
        }
        if (getSDKReferenceNumber.equals(intent.getAction())) {
            getSDKAppID.AuthenticationRequestParameters(1359784443, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), -1359784443, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), new Object[]{this.ChallengeResultCancelled});
            return;
        }
        if (getDeviceData.equals(intent.getAction())) {
            completed = (ChallengeStatusHandler + 115) % 128;
            atd.c.getSDKTransactionID getsdktransactionid = (atd.c.getSDKTransactionID) intent.getParcelableExtra(ChallengeResult);
            this.getTransactionStatus = getsdktransactionid;
            this.ChallengeResultCancelled.getDeviceData(getsdktransactionid);
            return;
        }
        if (getSDKAppID.equals(intent.getAction())) {
            finish();
            int i11 = ChallengeStatusHandler + 105;
            completed = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 59 / 0;
                return;
            }
            return;
        }
        Object[] objArr = new Object[1];
        b("\uddea\udce4\udfed\udefa\ud9e0\ud8e7\udbe9\udaa2헪퓬ퟵ훥퇩탲펫틥췸쳮쿰컷짱좰쯋쫕엖쓅", 257 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        if (!((String) objArr[0]).intern().equals(intent.getAction()) || intent.getData() == null) {
            throw atd.aa.getSDKReferenceNumber.CHALLENGE_PRESENTATION_FAILURE.getDeviceData();
        }
        if (!getSDKAppID(intent.getData().getScheme())) {
            int i13 = ChallengeStatusHandler + 59;
            completed = i13 % 128;
            if (i13 % 2 != 0) {
                throw atd.aa.getSDKReferenceNumber.CHALLENGE_PRESENTATION_FAILURE.getDeviceData();
            }
            int i14 = 11 / 0;
            throw atd.aa.getSDKReferenceNumber.CHALLENGE_PRESENTATION_FAILURE.getDeviceData();
        }
        atd.au.getDeviceData getdevicedata = (atd.au.getDeviceData) getSDKAppID.AuthenticationRequestParameters(1532928193, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), -1532928191, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), new Object[]{this.ChallengeResultCancelled});
        if (!getSDKReferenceNumber(getdevicedata)) {
            int i15 = ChallengeStatusHandler + 69;
            completed = i15 % 128;
            if (i15 % 2 == 0) {
                getSDKTransactionID(getdevicedata);
                throw null;
            }
            if (getSDKTransactionID(getdevicedata)) {
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                str = (String) atd.au.getSDKAppID.AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber, new Object[]{(atd.au.getSDKAppID) getdevicedata}, sDKReferenceNumber2, 2109937226, -2109937221);
            } else {
                str = null;
            }
            Object[] objArr2 = new Object[1];
            b("\uddbb枒", (Process.myPid() >> 22) + 47659, objArr2);
            getSDKAppID(new getSDKEphemeralPublicKey(((String) objArr2[0]).intern(), null), str);
        }
        int i16 = completed + 47;
        ChallengeStatusHandler = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x13b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getSDKAppID(atd.b.getDeviceData r37, java.lang.String r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.getSDKAppID(atd.b.getDeviceData, java.lang.String):void");
    }

    public static Intent getSDKReferenceNumber(Context context, atd.c.getSDKTransactionID getsdktransactionid) {
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        return (Intent) getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{context, getsdktransactionid}, 398756700, sDKReferenceNumber3, -398756697, sDKReferenceNumber, sDKReferenceNumber2);
    }

    public static void getSDKTransactionID() {
        getAdditionalDetails = -981565205067676573L;
        ChallengeResultError = new char[]{62575, 43744, 18794, 61436, 36449, 11495, 50026, 24992, 'a', 42749, 17696, 64477, 39543, 14589, 57210, 32235, 7267, 45773, 20834, 63457, 38509, 13541, 62575, 43744, 18794, 61436, 36449, 11495, 50026, 24992, 'o', 42750, 17790, 64416, 39503, 14573, 57210, 32231, 7288, 45799, 20858, 63479, 38490, 13542, 60284, 35307, 10351, 52970, 62573, 43771, 18812, 61436, 36459, 11488, 50042, 25039, '~', 42750, 17762, 64487, 39533, 14575, 57210, 32231, 7265, 45792, 40116, 49704, 8616, 34604, 62496, 43727, 18765, 61402, 36423, 11457, 49984, 25041, ']', 42694, 17729, 64473, 39505, 14558, 57180, 32193, 7245, 45771, 20829, 63453, 38471, 13504, 60233, 62496, 43727, 18765, 61402, 36423, 11457, 49984, 25041, ']', 42694, 17729, 64473, 39505, 14541, 57158, 32207, 7234, 45762, 20811, 63424, 38473, 13515, 39876, 50475, 9897, 32830, 57763, 17189, 44196, 3637, 28588, 51491, 10916, 37923, 62905, 22306, 45237, 4649, 29602, 56619, 16038, 38950, 63919, 23332, 33965, 58927, 62496, 43741, 18778, 61391, 36442, 11467, 50001, 25037, '[', 42716, 17756, 64459, 39488, 14554, 57169, 32222, 7260, 45761, 20813, 63435, 38493, 13533, 60241, 35271, 10314, 62496, 43741, 18778, 61391, 36442, 11467, 50001, 25053, 'F', 42689, 17755, 64450, 39498, 14545, 57180, 32203, 7240, 45788, 20811, 63453, 38470, 13521, 60251, 35271, 62496, 43741, 18778, 61391, 36442, 11467, 50001, 25037, 'F', 42703, 17730, 64450, 39499, 14528, 57161, 32203};
        ChallengeResultTimeout = -5654884695516075378L;
    }

    public static void init$0() {
        $$a = new byte[]{121, -69, 41, 13, -3, 14, -34, -16, 6, 6, 18, 0, -2, 12, -14, 8, -12, 1, -24, 38, -9, -12, 2, 12, -3, 14, -34, -16, 6, 8, 29, -18, 12, 4, -19, 1, 16, -12, 5, -2, -38, -6, -3, 14, -34, -16, 6, -11, 46, -1, -40, -6, -3, 14, -49, 32, 16, -14, -7, 1, -34, 28, 18, -20, 51, -2, -13, -4, 8, 5, -12, -7, -3, 18, -12, 5, -2, -29, 18, 11, 3, -17, 13, 0, -37, 16, 16, -18, 11, -9, 14, -16, 12, 0, -3, 14, -34, -16, 6, -7, 42, -9, -4, 7, -9, 12, -18, 10, -29, 36, -20, 9, -4, -7, -25, 25, 19, -3, 14, -40, 23, 13, -1, -19, 5, -3, -16, 14, 12, 0, -11, 5, -2, 36, -8, 10, -1, -8, 8, -8, -3, -20, 18, 13, 1, -10, 7, -50, 29, 12, -12, 1, 6, -1, -8, -2, 36, -8, 10, -1, -8, 8, -8, -3, -20, 18, 13, 1, -10, 7};
        $$b = 61;
    }

    public static void init$1() {
        $$d = new byte[]{10, 8, 71, -64, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, -21, 14, 52, -75, 71, -29, -39, 3, -13, 9, 6, -13, 1, -19, 19, 17, -21, -16, -4, 7, -10, 44, -29, -10, -5, -11, 1, 11, 63, -69, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -21, 14, 52, -77, 73, -23, -39, 5, -13, -2, 5, -11, 5, 0, 17, -21, -16, -4, 7, -10, 39, -43, 78, -69, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, -21, 14, 52, -65, 61, -59, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, 59, -69, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15, -21, 14, 52, -53, -19, 66, -59, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, -21, 14, 52, -53, 49, -59, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, 30, -16, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, -21, 14, 52, PSSSigner.TRAILER_IMPLICIT, 64, -59, 0, -17, 49, -37, -2, -7, -13, 9, -8, -1, 11, -13, 38, -35, -17, 17, -10, -5, -9, 77, -69, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15, -21, 14, 52, -75, 71, -29, -39, 3, -13, 9, 6, -13, 1, -19, 19, 17, -21, -16, -4, 7, -10, 78, -31, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3};
        $$e = 160;
    }

    public static void init$2() {
        $$c = new byte[]{119, 91, -93, 47};
        $$f = 91;
    }

    @Override // atd.ax.getSDKTransactionID
    public final void AuthenticationRequestParameters(@NonNull Uri uri, String str) throws Throwable {
        Object[] objArr = new Object[1];
        b("\uddea\udce4\udfed\udefa\ud9e0\ud8e7\udbe9\udaa2헪퓬ퟵ훥퇩탲펫틥췸쳮쿰컷짱좰쯋쫕엖쓅", Process.getGidForName("") + 258, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        intent.setData(uri);
        try {
            startActivity(intent);
            ChallengeStatusHandler = (completed + 111) % 128;
        } catch (Throwable unused) {
            Object[] objArr2 = new Object[1];
            b("\uddbb枒", 47659 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b("\uddbb陧", Color.green(0) + 19421, objArr3);
            getSDKAppID(new getSDKEphemeralPublicKey(strIntern, ((String) objArr3[0]).intern()), str);
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKTransactionID, k.h, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i11 = completed + 65;
        ChallengeStatusHandler = i11 % 128;
        int i12 = i11 % 2;
        super.attachBaseContext(context);
        if (i12 != 0) {
            int i13 = 20 / 0;
        }
        int i14 = ChallengeStatusHandler + 107;
        completed = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKTransactionID, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        completed = (ChallengeStatusHandler + 33) % 128;
        super.onCreate(bundle);
        r.a(this);
        if (bundle != null && Process.myPid() != bundle.getInt(BuildConfig)) {
            finish();
        }
        this.ChallengeResultCancelled = new getSDKAppID(this, this, getDeviceData().getDeviceData());
        try {
            getDeviceData(getIntent());
        } catch (SDKRuntimeException e5) {
            try {
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(583664806);
                if (sDKTransactionID == null) {
                    int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 34644);
                    int iMyPid = (Process.myPid() >> 22) + 27;
                    byte[] bArr = $$d;
                    byte b8 = (byte) (bArr[184] - 1);
                    short s7 = bArr[12];
                    Object[] objArr = new Object[1];
                    a(b8, s7, (byte) s7, objArr);
                    sDKTransactionID = ChallengeResult.getDeviceData(maximumFlingVelocity, packedPositionChild, iMyPid, -22936906, false, (String) objArr[0], new Class[0]);
                }
                Object objInvoke = ((Method) sDKTransactionID).invoke(null, null);
                Object[] objArr2 = {e5, e5.getMessage()};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1013249253);
                if (sDKTransactionID2 == null) {
                    int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                    char cLastIndexOf = (char) (34642 - TextUtils.lastIndexOf("", '0', 0));
                    int iNormalizeMetaState = 27 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr2 = $$d;
                    byte b11 = (byte) (bArr2[184] - 1);
                    short s8 = bArr2[12];
                    Object[] objArr3 = new Object[1];
                    a(b11, s8, (byte) s8, objArr3);
                    sDKTransactionID2 = ChallengeResult.getDeviceData(scrollBarSize, cLastIndexOf, iNormalizeMetaState, 536022283, false, (String) objArr3[0], new Class[]{Throwable.class, String.class});
                }
                ((Method) sDKTransactionID2).invoke(objInvoke, objArr2);
                finish();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        AuthenticationRequestParameters();
        int i11 = ChallengeStatusHandler + 95;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onDestroy() {
        int i11 = completed + 77;
        ChallengeStatusHandler = i11 % 128;
        if (i11 % 2 != 0) {
            super.onDestroy();
            this.ChallengeResultCancelled.getSDKReferenceNumber();
            int i12 = 7 / 0;
        } else {
            super.onDestroy();
            this.ChallengeResultCancelled.getSDKReferenceNumber();
        }
        int i13 = ChallengeStatusHandler + 35;
        completed = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 98 / 0;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) throws Throwable {
        int i11 = ChallengeStatusHandler + 105;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            super.onNewIntent(intent);
            getDeviceData(intent);
            throw null;
        }
        super.onNewIntent(intent);
        getDeviceData(intent);
        int i12 = ChallengeStatusHandler + 33;
        completed = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 40 / 0;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKTransactionID, androidx.fragment.app.o0, android.app.Activity
    public void onPause() throws Throwable {
        completed = (ChallengeStatusHandler + 59) % 128;
        super.onPause();
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{this}, 961319719, sDKReferenceNumber3, -961319719, sDKReferenceNumber, sDKReferenceNumber2);
        int i11 = ChallengeStatusHandler + 107;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        int i11 = ChallengeStatusHandler + 31;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            super.onRestoreInstanceState(bundle);
            this.ChallengeResultCompleted = bundle.getBoolean(getMessageVersion, true);
            if (!bundle.containsKey(getSDKEphemeralPublicKey)) {
                return;
            }
        } else {
            super.onRestoreInstanceState(bundle);
            this.ChallengeResultCompleted = bundle.getBoolean(getMessageVersion, false);
            if (!bundle.containsKey(getSDKEphemeralPublicKey)) {
                return;
            }
        }
        atd.c.getSDKTransactionID getsdktransactionid = (atd.c.getSDKTransactionID) bundle.getParcelable(getSDKEphemeralPublicKey);
        this.getTransactionStatus = getsdktransactionid;
        if (getsdktransactionid != null) {
            int i12 = ChallengeStatusHandler + 101;
            completed = i12 % 128;
            int i13 = i12 % 2;
            getSDKAppID getsdkappid = this.ChallengeResultCancelled;
            if (i13 != 0) {
                getsdkappid.getDeviceData(getsdktransactionid);
            } else {
                getsdkappid.getDeviceData(getsdktransactionid);
                throw null;
            }
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKTransactionID, androidx.fragment.app.o0, android.app.Activity
    public void onResume() {
        super.onResume();
        getDeviceData(this);
        if (this.ChallengeResultCompleted) {
            int i11 = ChallengeStatusHandler + 27;
            completed = i11 % 128;
            int i12 = i11 % 2;
            atd.c.getSDKTransactionID getsdktransactionid = this.getTransactionStatus;
            if (i12 == 0) {
                throw null;
            }
            if (getsdktransactionid != null) {
                this.ChallengeResultCancelled.getSDKAppID(getsdktransactionid);
            }
        }
        int i13 = completed + 73;
        ChallengeStatusHandler = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 93 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSaveInstanceState(android.os.Bundle r3) {
        /*
            r2 = this;
            int r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.completed
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.ChallengeActivity.ChallengeStatusHandler = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L28
            super.onSaveInstanceState(r3)
            java.lang.String r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.BuildConfig
            int r1 = android.os.Process.myPid()
            r3.putInt(r0, r1)
            java.lang.String r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.getMessageVersion
            boolean r1 = r2.ChallengeResultCompleted
            r3.putBoolean(r0, r1)
            atd.c.getSDKTransactionID r0 = r2.getTransactionStatus
            r1 = 26
            int r1 = r1 / 0
            if (r0 == 0) goto L4e
            goto L3f
        L28:
            super.onSaveInstanceState(r3)
            java.lang.String r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.BuildConfig
            int r1 = android.os.Process.myPid()
            r3.putInt(r0, r1)
            java.lang.String r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.getMessageVersion
            boolean r1 = r2.ChallengeResultCompleted
            r3.putBoolean(r0, r1)
            atd.c.getSDKTransactionID r0 = r2.getTransactionStatus
            if (r0 == 0) goto L4e
        L3f:
            int r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.completed
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.ChallengeActivity.ChallengeStatusHandler = r0
            java.lang.String r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.getSDKEphemeralPublicKey
            atd.c.getSDKTransactionID r1 = r2.getTransactionStatus
            r3.putParcelable(r0, r1)
        L4e:
            int r3 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.ChallengeStatusHandler
            int r3 = r3 + 79
            int r0 = r3 % 128
            com.adyen.threeds2.internal.ui.activity.ChallengeActivity.completed = r0
            int r3 = r3 % 2
            if (r3 != 0) goto L5e
            r3 = 58
            int r3 = r3 / 0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKTransactionID, k.h, androidx.fragment.app.o0, android.app.Activity
    public void onStart() throws Throwable {
        ChallengeStatusHandler = (completed + 43) % 128;
        super.onStart();
        try {
            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(583664806);
            if (sDKTransactionID == null) {
                int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                char windowTouchSlop = (char) (34643 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int iNormalizeMetaState = 27 - KeyEvent.normalizeMetaState(0);
                byte[] bArr = $$d;
                byte b8 = (byte) (bArr[184] - 1);
                short s7 = bArr[12];
                Object[] objArr = new Object[1];
                a(b8, s7, (byte) s7, objArr);
                sDKTransactionID = ChallengeResult.getDeviceData(fadingEdgeLength, windowTouchSlop, iNormalizeMetaState, -22936906, false, (String) objArr[0], new Class[0]);
            }
            Object objInvoke = ((Method) sDKTransactionID).invoke(null, null);
            Object[] objArr2 = {this};
            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1492060771);
            if (sDKTransactionID2 == null) {
                int iIndexOf = TextUtils.indexOf("", "", 0);
                char windowTouchSlop2 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 34643);
                int i11 = 28 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr2 = $$d;
                Object[] objArr3 = new Object[1];
                a(bArr2[12], bArr2[233], bArr2[58], objArr3);
                sDKTransactionID2 = ChallengeResult.getDeviceData(iIndexOf, windowTouchSlop2, i11, 2071524237, false, (String) objArr3[0], new Class[]{ChallengeActivity.class});
            }
            ((Method) sDKTransactionID2).invoke(objInvoke, objArr2);
            int i12 = ChallengeStatusHandler + 111;
            completed = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onStop() {
        boolean z11;
        int i11 = ChallengeStatusHandler + 61;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            super.onStop();
            z11 = false;
        } else {
            super.onStop();
            z11 = true;
        }
        this.ChallengeResultCompleted = z11;
    }

    private static boolean getSDKTransactionID(atd.au.getDeviceData getdevicedata) {
        int i11 = (completed + 71) % 128;
        ChallengeStatusHandler = i11;
        boolean z11 = getdevicedata instanceof atd.au.getSDKAppID;
        completed = (i11 + 5) % 128;
        return z11;
    }

    @Override // atd.ax.getSDKTransactionID
    public final void getSDKTransactionID(String str) throws Throwable {
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{this, str}, 560201027, sDKReferenceNumber3, -560201025, sDKReferenceNumber, sDKReferenceNumber2);
    }

    public static boolean getSDKReferenceNumber() {
        int i11 = ChallengeStatusHandler + 9;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKAppID.getSDKAppID();
            throw null;
        }
        boolean sDKAppID = getSDKAppID.getSDKAppID();
        completed = (ChallengeStatusHandler + 99) % 128;
        return sDKAppID;
    }

    @Override // atd.ax.getSDKAppID
    public final void getSDKReferenceNumber(String str) throws Throwable {
        getSDKAppID(new ChallengeResultCancelled(), str);
        int i11 = completed + 83;
        ChallengeStatusHandler = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static boolean getSDKReferenceNumber(atd.au.getDeviceData getdevicedata) {
        int i11 = (ChallengeStatusHandler + 41) % 128;
        completed = i11;
        boolean z11 = getdevicedata instanceof atd.au.getSDKTransactionID;
        int i12 = i11 + 43;
        ChallengeStatusHandler = i12 % 128;
        if (i12 % 2 == 0) {
            return z11;
        }
        throw null;
    }

    public static Intent getSDKReferenceNumber(Context context) {
        Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
        intent.setAction(getSDKAppID);
        ChallengeStatusHandler = (completed + 13) % 128;
        return intent;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        Context context = (Context) objArr[0];
        atd.c.getSDKTransactionID getsdktransactionid = (atd.c.getSDKTransactionID) objArr[1];
        Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
        intent.setAction(getDeviceData);
        intent.putExtra(ChallengeResult, getsdktransactionid);
        int i11 = ChallengeStatusHandler + 57;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 35 / 0;
        }
        return intent;
    }

    @Override // atd.ax.getSDKAppID
    public final void AuthenticationRequestParameters(String str) throws Throwable {
        getSDKAppID(new atd.b.getMessageVersion(), str);
        int i11 = ChallengeStatusHandler + 125;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // atd.ax.getSDKReferenceNumber
    public final void AuthenticationRequestParameters(@NonNull String str, String str2) throws Throwable {
        getSDKAppID(new BuildConfig(str), str2);
        int i11 = ChallengeStatusHandler + 51;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static Intent AuthenticationRequestParameters(Context context) {
        Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
        intent.setAction(AuthenticationRequestParameters);
        completed = (ChallengeStatusHandler + 47) % 128;
        return intent;
    }

    private void AuthenticationRequestParameters() {
        getOnBackPressedDispatcher().b(new AnonymousClass4(), this);
        int i11 = completed + 15;
        ChallengeStatusHandler = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // atd.ax.getSDKAppID
    public final void getSDKAppID() throws Throwable {
        Object[] objArr = {this, new atd.b.getSDKTransactionID()};
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), objArr, -1340956603, getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), 1340956604, sDKReferenceNumber, sDKReferenceNumber2);
        completed = (ChallengeStatusHandler + 69) % 128;
    }

    public static /* synthetic */ Object getSDKAppID(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) throws Throwable {
        int i17 = ~i14;
        int i18 = (~i15) | i17;
        int i19 = ~i18;
        int i21 = (~(i17 | i12)) | i19;
        int i22 = (~(i17 | (~i12) | i15)) | (~(i18 | i12)) | (~(i14 | i12 | i15));
        int i23 = (~(i15 | i14)) | i12 | i19;
        int i24 = 1256718336 * i16;
        int i25 = ((-1222115328) * i11) + (1616379904 * i13) + i24 + (168349733 * i23) + ((-168349733) * i22) + (i21 * (-168349733)) + (1088368604 * i12) + ((1425068070 * i14) - 1475346432);
        int iC = a0.c(i11, -1076018391, (5090439 * i13) + i14 + i12 + i16);
        int i26 = i22 * (-307);
        int i27 = i23 * 307;
        int i28 = i16 * (-1092730761);
        int i29 = i13 * 1582232257;
        int i31 = i11 * 741505039;
        int iE = a0.e(iC, -1125187584, i31 + i29 + i28 + i27 + i26 + (i21 * (-307)) + (i12 * (-1092731068)) + (i14 * (-1092730454)) + 799718796, -410583040, (1028194304 * iC) + i25);
        if (iE == 1) {
            ChallengeActivity challengeActivity = (ChallengeActivity) objArr[0];
            atd.b.getDeviceData getdevicedata = (atd.b.getDeviceData) objArr[1];
            completed = (ChallengeStatusHandler + 85) % 128;
            challengeActivity.getSDKAppID(getdevicedata, null);
            ChallengeStatusHandler = (completed + 113) % 128;
            return null;
        }
        if (iE == 2) {
            ChallengeActivity challengeActivity2 = (ChallengeActivity) objArr[0];
            String str = (String) objArr[1];
            Object[] objArr2 = new Object[1];
            b("\uddbb陧", 19420 - Process.getGidForName(""), objArr2);
            challengeActivity2.getSDKAppID(new getSDKEphemeralPublicKey(((String) objArr2[0]).intern(), null), str);
            ChallengeStatusHandler = (completed + 77) % 128;
            return null;
        }
        if (iE != 3) {
            ChallengeActivity challengeActivity3 = (ChallengeActivity) objArr[0];
            ChallengeStatusHandler = (completed + 101) % 128;
            atd.au.getDeviceData getdevicedata2 = (atd.au.getDeviceData) getSDKAppID.AuthenticationRequestParameters(1532928193, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), -1532928191, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), new Object[]{challengeActivity3.ChallengeResultCancelled});
            if (getdevicedata2 != null) {
                getdevicedata2.setChallengeListener(null);
                completed = (ChallengeStatusHandler + 49) % 128;
            }
            return null;
        }
        return AuthenticationRequestParameters(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean getSDKAppID(java.lang.String r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.getSDKAppID(java.lang.String):boolean");
    }

    @Override // atd.ax.AuthenticationRequestParameters
    public final void getDeviceData(String str) throws Throwable {
        Object[] objArr = {this, new atd.b.AuthenticationRequestParameters(str)};
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), objArr, -1340956603, getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), 1340956604, sDKReferenceNumber, sDKReferenceNumber2);
        int i11 = ChallengeStatusHandler + 47;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKTransactionID
    public final ChallengeResultError getDeviceData() {
        int i11 = ChallengeStatusHandler + 25;
        completed = i11 % 128;
        if (i11 % 2 == 0) {
            ChallengeResultError challengeResultError = ChallengeResultError.getDeviceData;
            throw null;
        }
        ChallengeResultError challengeResultError2 = ChallengeResultError.getDeviceData;
        ChallengeStatusHandler = (completed + 35) % 128;
        return challengeResultError2;
    }

    @Override // atd.ax.getDeviceData
    public final void getDeviceData(@NonNull List<String> list, String str) throws Throwable {
        getSDKAppID(new atd.b.ChallengeResult(list), str);
        ChallengeStatusHandler = (completed + 99) % 128;
    }

    private void getDeviceData(atd.ax.getSDKAppID getsdkappid) {
        completed = (ChallengeStatusHandler + 29) % 128;
        Object[] objArr = {this.ChallengeResultCancelled};
        atd.au.getDeviceData getdevicedata = (atd.au.getDeviceData) getSDKAppID.AuthenticationRequestParameters(1532928193, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), -1532928191, getMessageVersion.getDeviceData.getSDKAppID(), getMessageVersion.getDeviceData.getSDKAppID(), objArr);
        if (getdevicedata != null) {
            getdevicedata.setChallengeListener(getsdkappid);
            ChallengeStatusHandler = (completed + 63) % 128;
        }
    }

    private void getDeviceData(atd.b.getDeviceData getdevicedata) throws Throwable {
        int sDKReferenceNumber = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getDeviceData.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(getDeviceData.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{this, getdevicedata}, -1340956603, sDKReferenceNumber3, 1340956604, sDKReferenceNumber, sDKReferenceNumber2);
    }
}
