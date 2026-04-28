package atd.g;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultError;
import atd.bb.ChallengeResultTimeout;
import atd.e.ChallengeResult;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.app.tgtg.model.local.AppConstants;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import w.a0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "", "Success", "Failure", "UnsupportedDataVersion", "IllegalState", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AuthenticationRequestParameters {

    /* JADX INFO: renamed from: atd.g.AuthenticationRequestParameters$AuthenticationRequestParameters, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$UnsupportedDataVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "<init>", "()V", StatusResponseUtils.RESULT_ERROR, "Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "getError", "()Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C0006AuthenticationRequestParameters implements getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int BuildConfig;

        @NotNull
        private static final atd.aa.getSDKReferenceNumber getDeviceData;
        private static int getMessageVersion;

        @NotNull
        public static final C0006AuthenticationRequestParameters getSDKAppID;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, short r8, int r9) {
            /*
                byte[] r0 = atd.g.AuthenticationRequestParameters.C0006AuthenticationRequestParameters.$$a
                int r8 = r8 * 2
                int r8 = 3 - r8
                int r9 = r9 + 107
                int r7 = r7 * 4
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r9 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2d
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L26:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L2d:
                int r8 = r8 + r0
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.g.AuthenticationRequestParameters.C0006AuthenticationRequestParameters.$$c(int, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getMessageVersion = 0;
            BuildConfig = 1;
            AuthenticationRequestParameters = 0;
            getSDKTransactionID = 1;
            AuthenticationRequestParameters();
            getSDKAppID = new C0006AuthenticationRequestParameters();
            getDeviceData = atd.aa.getSDKReferenceNumber.DEVICE_DATA_FAILURE;
            int i11 = BuildConfig + 59;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        private C0006AuthenticationRequestParameters() {
        }

        public static void AuthenticationRequestParameters() {
            getSDKReferenceNumber = new char[]{63416, 63457, 63459, 63457, 63485, 63460, 63442, 63444, 63461, 63461, 63453, 63451, 63467, 63459, 63484, 63487, 63456, 63487, 63485, 63483, 63487, 63470};
        }

        private static void a(int[] iArr, String str, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            int i12;
            byte[] bArr;
            int i13;
            String str2 = str;
            int i14 = $10 + 75;
            $11 = i14 % 128;
            Object bytes = str2;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (str2 != null) {
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr2 = (byte[]) bytes;
            ChallengeResultError challengeResultError = new ChallengeResultError();
            int i15 = 0;
            int i16 = iArr[0];
            byte b8 = 1;
            int i17 = iArr[1];
            int i18 = iArr[2];
            int i19 = iArr[3];
            char[] cArr = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                i11 = 2;
                int i21 = 0;
                while (i21 < length) {
                    byte b11 = b8;
                    int i22 = $11 + 19;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i21])};
                            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(754517312);
                            if (sDKTransactionID == null) {
                                int i23 = 2944 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                bArr = bArr2;
                                i13 = i21;
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', i15));
                                int iIndexOf = 36 - TextUtils.indexOf((CharSequence) "", '0', i15);
                                byte b12 = (byte) i15;
                                byte b13 = b12;
                                sDKTransactionID = ChallengeResult.getDeviceData(i23, cLastIndexOf, iIndexOf, -258931888, false, $$c(b12, b13, b13), new Class[]{cls});
                            } else {
                                bArr = bArr2;
                                i13 = i21;
                            }
                            cArr2[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                            b8 = b11;
                            bArr2 = bArr;
                            i21 = i13;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr3 = bArr2;
                        int i24 = i21;
                        Object[] objArr3 = {Integer.valueOf(cArr[i24])};
                        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(754517312);
                        if (sDKTransactionID2 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2943, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 37 - (ViewConfiguration.getTapTimeout() >> 16), -258931888, false, $$c(b14, b15, b15), new Class[]{cls});
                        }
                        cArr2[i24] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        i21 = i24 + 1;
                        b8 = b11;
                        bArr2 = bArr3;
                    }
                    i15 = 0;
                }
                cArr = cArr2;
            } else {
                i11 = 2;
            }
            byte[] bArr4 = bArr2;
            byte b16 = b8;
            char[] cArr3 = new char[i17];
            System.arraycopy(cArr, i16, cArr3, 0, i17);
            if (bArr4 != null) {
                char[] cArr4 = new char[i17];
                challengeResultError.AuthenticationRequestParameters = 0;
                char c3 = 0;
                while (true) {
                    int i25 = challengeResultError.AuthenticationRequestParameters;
                    if (i25 >= i17) {
                        break;
                    }
                    $11 = ($10 + 1) % 128;
                    byte b17 = b16;
                    if (bArr4[i25] == b17) {
                        char c7 = cArr3[i25];
                        Object[] objArr4 = new Object[i11];
                        objArr4[b17] = Integer.valueOf(c3);
                        objArr4[0] = Integer.valueOf(c7);
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(788825057);
                        if (sDKTransactionID3 == null) {
                            byte b18 = (byte) 0;
                            byte b19 = b18;
                            sDKTransactionID3 = ChallengeResult.getDeviceData(ImageFormat.getBitsPerPixel(0) + 3096, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 14367), 18 - Color.argb(0, 0, 0, 0), -210991631, false, $$c(b18, b19, (byte) (b19 + 1)), new Class[]{cls, cls});
                        }
                        cArr4[i25] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                    } else {
                        Object[] objArr5 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c3)};
                        Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-565071239);
                        if (sDKTransactionID4 == null) {
                            byte b21 = (byte) 0;
                            byte b22 = b21;
                            sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (Color.alpha(0) + 13060), KeyEvent.normalizeMetaState(0) + 25, 37336169, false, $$c(b21, b22, (byte) (b22 + 3)), new Class[]{cls, cls});
                        }
                        cArr4[i25] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                    }
                    c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                    Object[] objArr6 = {challengeResultError, challengeResultError};
                    Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(2107237619);
                    if (sDKTransactionID5 == null) {
                        sDKTransactionID5 = ChallengeResult.getDeviceData(2277 - MotionEvent.axisFromString(""), (char) (ExpandableListView.getPackedPositionChild(0L) + 65523), KeyEvent.normalizeMetaState(0) + 34, -1577983261, false, "m", new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID5).invoke(null, objArr6);
                    b16 = 1;
                    i11 = 2;
                }
                cArr3 = cArr4;
            }
            if (i19 > 0) {
                $10 = ($11 + 67) % 128;
                char[] cArr5 = new char[i17];
                i12 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i17);
                int i26 = i17 - i19;
                System.arraycopy(cArr5, 0, cArr3, i26, i19);
                System.arraycopy(cArr5, i19, cArr3, 0, i26);
            } else {
                i12 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i17];
                challengeResultError.AuthenticationRequestParameters = i12;
                while (true) {
                    int i27 = challengeResultError.AuthenticationRequestParameters;
                    if (i27 >= i17) {
                        break;
                    }
                    cArr6[i27] = cArr3[(i17 - i27) - 1];
                    challengeResultError.AuthenticationRequestParameters = i27 + 1;
                }
                cArr3 = cArr6;
            }
            if (i18 > 0) {
                int i28 = ($11 + 81) % 128;
                $10 = i28;
                challengeResultError.AuthenticationRequestParameters = 0;
                $11 = (i28 + 63) % 128;
                while (true) {
                    int i29 = challengeResultError.AuthenticationRequestParameters;
                    if (i29 >= i17) {
                        break;
                    }
                    cArr3[i29] = (char) (cArr3[i29] - iArr[2]);
                    challengeResultError.AuthenticationRequestParameters = i29 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public static void init$0() {
            $$a = new byte[]{118, -50, -83, 89};
            $$b = 235;
        }

        public final boolean equals(@Nullable Object other) {
            int i11 = getSDKTransactionID;
            int i12 = i11 + 97;
            int i13 = i12 % 128;
            AuthenticationRequestParameters = i13;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0006AuthenticationRequestParameters)) {
                AuthenticationRequestParameters = (i11 + 109) % 128;
                return false;
            }
            getSDKTransactionID = (i13 + 67) % 128;
            return true;
        }

        @Override // atd.g.AuthenticationRequestParameters.getSDKTransactionID
        @NotNull
        public final atd.aa.getSDKReferenceNumber getSDKTransactionID() {
            int i11 = getSDKTransactionID + 23;
            int i12 = i11 % 128;
            AuthenticationRequestParameters = i12;
            if (i11 % 2 != 0) {
                throw null;
            }
            atd.aa.getSDKReferenceNumber getsdkreferencenumber = getDeviceData;
            getSDKTransactionID = (i12 + 83) % 128;
            return getsdkreferencenumber;
        }

        public final int hashCode() {
            int i11 = getSDKTransactionID + AppConstants.RESULT_CODE_ORDER_CANCELLED;
            int i12 = i11 % 128;
            AuthenticationRequestParameters = i12;
            if (i11 % 2 != 0) {
                throw null;
            }
            getSDKTransactionID = (i12 + 79) % 128;
            return -510112540;
        }

        @NotNull
        public final String toString() throws Throwable {
            getSDKTransactionID = (AuthenticationRequestParameters + 49) % 128;
            Object[] objArr = new Object[1];
            a(new int[]{0, 22, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            AuthenticationRequestParameters = (getSDKTransactionID + 95) % 128;
            return strIntern;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$IllegalState;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "<init>", "()V", StatusResponseUtils.RESULT_ERROR, "Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "getError", "()Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getSDKAppID implements getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static int BuildConfig;
        private static boolean ChallengeResult;
        private static int ChallengeResultCancelled;

        @NotNull
        private static final atd.aa.getSDKReferenceNumber getDeviceData;
        private static int getMessageVersion;
        private static int getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static boolean getSDKReferenceNumber;

        @NotNull
        public static final getSDKAppID getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, short r6, int r7) {
            /*
                byte[] r0 = atd.g.AuthenticationRequestParameters.getSDKAppID.$$a
                int r5 = r5 * 2
                int r1 = 1 - r5
                int r6 = r6 * 2
                int r6 = 3 - r6
                int r7 = r7 * 4
                int r7 = 115 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L19
                r3 = r5
                r7 = r6
                r4 = r2
                goto L2e
            L19:
                r3 = r7
                r7 = r6
                r6 = r3
                r3 = r2
            L1d:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L2a
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L2a:
                int r7 = r7 + 1
                r3 = r0[r7]
            L2e:
                int r3 = -r3
                int r6 = r6 + r3
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.g.AuthenticationRequestParameters.getSDKAppID.$$c(byte, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getMessageVersion = 0;
            getSDKEphemeralPublicKey = 1;
            BuildConfig = 0;
            ChallengeResultCancelled = 1;
            getDeviceData();
            getSDKTransactionID = new getSDKAppID();
            getDeviceData = atd.aa.getSDKReferenceNumber.DEVICE_DATA_FAILURE;
            int i11 = getSDKEphemeralPublicKey + 21;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        private getSDKAppID() {
        }

        private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            char[] cArr;
            int length;
            char[] cArr2;
            int i13;
            int i14;
            boolean z11;
            String str3 = str2;
            Object obj = str3;
            if (str3 != null) {
                byte[] bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
                $10 = ($11 + 55) % 128;
                obj = bytes;
            }
            byte[] bArr = (byte[]) obj;
            int i15 = 2;
            int i16 = 0;
            if (str != null) {
                int i17 = $11 + 77;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    charArray = str.toCharArray();
                    int i18 = 66 / 0;
                } else {
                    charArray = str.toCharArray();
                }
            } else {
                charArray = str;
            }
            char[] cArr3 = charArray;
            ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
            char[] cArr4 = AuthenticationRequestParameters;
            Class cls = Integer.TYPE;
            boolean z12 = true;
            if (cArr4 != null) {
                int i19 = $10 + 1;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    length = cArr4.length;
                    cArr2 = new char[length];
                    i13 = 1;
                } else {
                    length = cArr4.length;
                    cArr2 = new char[length];
                    i13 = 0;
                }
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i13])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            z11 = z12;
                            i14 = i15;
                            byte b8 = (byte) i16;
                            byte b11 = b8;
                            sDKTransactionID = ChallengeResult.getDeviceData(2555 - (CdmaCellLocation.convertQuartSecToDecDegrees(i16) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i16) == 0.0d ? 0 : -1)), (char) (48599 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 31, -390605202, false, $$c(b8, b11, (byte) (b11 + 1)), new Class[]{cls});
                        } else {
                            i14 = i15;
                            z11 = z12;
                        }
                        cArr2[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i13++;
                        $11 = ($10 + 39) % 128;
                        z12 = z11;
                        i15 = i14;
                        i16 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr4 = cArr2;
            }
            int i21 = i15;
            boolean z13 = z12;
            Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = ChallengeResult.getDeviceData(MotionEvent.axisFromString("") + AppConstants.CONTACT_US_REQUEST_FILE, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - Process.getGidForName(""), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            if (ChallengeResult) {
                int i22 = $11 + 59;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    int length2 = bArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length2;
                    cArr = new char[length2];
                    i12 = 0;
                } else {
                    i12 = 0;
                    int length3 = bArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length3;
                    cArr = new char[length3];
                }
                challengeResultTimeout.getSDKAppID = i12;
                while (true) {
                    int i23 = challengeResultTimeout.getSDKAppID;
                    int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i23 >= i24) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    int i25 = $11 + 63;
                    $10 = i25 % 128;
                    if (i25 % 2 != 0) {
                        cArr[i23] = (char) (cArr4[bArr[i24 + i23] >> i11] / iIntValue);
                        Object[] objArr4 = new Object[i21];
                        objArr4[z13 ? 1 : 0] = challengeResultTimeout;
                        objArr4[0] = challengeResultTimeout;
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1124287645);
                        if (sDKTransactionID3 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            sDKTransactionID3 = ChallengeResult.getDeviceData(1696 - MotionEvent.axisFromString(""), (char) KeyEvent.getDeadChar(0, 0), Color.red(0) + 29, -1620360563, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID3).invoke(null, objArr4);
                    } else {
                        cArr[i23] = (char) (cArr4[bArr[(i24 - 1) - i23] + i11] - iIntValue);
                        Object[] objArr5 = new Object[2];
                        objArr5[z13 ? 1 : 0] = challengeResultTimeout;
                        objArr5[0] = challengeResultTimeout;
                        Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                        if (sDKTransactionID4 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            sDKTransactionID4 = ChallengeResult.getDeviceData((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1697, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1620360563, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID4).invoke(null, objArr5);
                    }
                    i21 = 2;
                }
            } else {
                int i26 = 0;
                if (getSDKReferenceNumber) {
                    int length4 = cArr3.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length4;
                    char[] cArr5 = new char[length4];
                    challengeResultTimeout.getSDKAppID = 0;
                    while (true) {
                        int i27 = challengeResultTimeout.getSDKAppID;
                        int i28 = challengeResultTimeout.AuthenticationRequestParameters;
                        if (i27 >= i28) {
                            objArr[0] = new String(cArr5);
                            return;
                        }
                        cArr5[i27] = (char) (cArr4[cArr3[(i28 - 1) - i27] - i11] - iIntValue);
                        Object[] objArr6 = new Object[2];
                        objArr6[z13 ? 1 : 0] = challengeResultTimeout;
                        objArr6[0] = challengeResultTimeout;
                        Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(1124287645);
                        if (sDKTransactionID5 == null) {
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            sDKTransactionID5 = ChallengeResult.getDeviceData(1696 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 29 - TextUtils.getCapsMode("", 0, 0), -1620360563, false, $$c(b16, b17, b17), new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID5).invoke(null, objArr6);
                    }
                } else {
                    int length5 = iArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length5;
                    char[] cArr6 = new char[length5];
                    while (true) {
                        challengeResultTimeout.getSDKAppID = i26;
                        int i29 = challengeResultTimeout.getSDKAppID;
                        int i31 = challengeResultTimeout.AuthenticationRequestParameters;
                        if (i29 >= i31) {
                            objArr[0] = new String(cArr6);
                            return;
                        } else {
                            cArr6[i29] = (char) (cArr4[iArr[(i31 - 1) - i29] - i11] - iIntValue);
                            i26 = i29 + 1;
                        }
                    }
                }
            }
        }

        public static void getDeviceData() {
            AuthenticationRequestParameters = new char[]{21749, 21784, 21777, 21783, 21741, 21731, 21760};
            getSDKAppID = 1286296716;
            getSDKReferenceNumber = true;
            ChallengeResult = true;
        }

        public static void init$0() {
            $$a = new byte[]{60, 58, 23, -117};
            $$b = 230;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                ChallengeResultCancelled = (BuildConfig + 9) % 128;
                return true;
            }
            if (other instanceof getSDKAppID) {
                return true;
            }
            ChallengeResultCancelled = (BuildConfig + 61) % 128;
            return false;
        }

        @Override // atd.g.AuthenticationRequestParameters.getSDKTransactionID
        @NotNull
        public final atd.aa.getSDKReferenceNumber getSDKTransactionID() {
            int i11 = BuildConfig;
            int i12 = i11 + 119;
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            atd.aa.getSDKReferenceNumber getsdkreferencenumber = getDeviceData;
            ChallengeResultCancelled = (i11 + 101) % 128;
            return getsdkreferencenumber;
        }

        public final int hashCode() {
            int i11 = ChallengeResultCancelled + 49;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                return 82294022;
            }
            int i12 = 82 / 0;
            return 82294022;
        }

        @NotNull
        public final String toString() throws Throwable {
            BuildConfig = (ChallengeResultCancelled + 59) % 128;
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) + 127, null, null, "\u0083\u0087\u0085\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i11 = BuildConfig + 99;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 79 / 0;
            }
            return strIntern;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Success;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", Bayeux.KEY_DATA, "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getData", "()Lorg/json/JSONObject;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber implements AuthenticationRequestParameters {
        public static int getDeviceData = 0;
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 1;
        public static int getSDKTransactionID;

        @NotNull
        private final JSONObject AuthenticationRequestParameters;

        public getSDKReferenceNumber(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            this.AuthenticationRequestParameters = jSONObject;
        }

        public static int getDeviceData() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 7986048;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return getDeviceData;
            }
            int iMyPid = Process.myPid();
            getDeviceData = iMyPid;
            return iMyPid;
        }

        @NotNull
        public final JSONObject AuthenticationRequestParameters() {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 & 83;
            int i13 = (i11 | 83) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 & i14) + (i13 | i14);
            int i16 = i15 % 128;
            getSDKAppID = i16;
            int i17 = i15 % 2;
            JSONObject jSONObject = this.AuthenticationRequestParameters;
            if (i17 != 0) {
                throw null;
            }
            getSDKReferenceNumber = a0.d(i16 & 15, ~(-(-(i16 | 15))), 1, 128);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", StatusResponseUtils.RESULT_ERROR, "Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "getError", "()Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$IllegalState;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$UnsupportedDataVersion;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface getSDKTransactionID extends AuthenticationRequestParameters {
        @NotNull
        atd.aa.getSDKReferenceNumber getSDKTransactionID();
    }
}
