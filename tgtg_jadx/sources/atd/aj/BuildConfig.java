package atd.aj;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultTimeout;
import com.app.tgtg.model.local.AppConstants;
import com.braze.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandomSpi;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static boolean BuildConfig;
    private static int ChallengeResult;
    private static boolean ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static final byte[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class AuthenticationRequestParameters extends SecureRandomSpi {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final Object AuthenticationRequestParameters;
        private static char[] BuildConfig;
        private static int ChallengeResult;
        private static char ChallengeResultCancelled;
        private static int ChallengeResultError;
        private static final File getDeviceData;
        private static int getMessageVersion;
        private static DataInputStream getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static OutputStream getSDKReferenceNumber;
        private boolean getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r5, int r6, byte r7) {
            /*
                int r6 = r6 + 5
                int r5 = r5 + 65
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r1 = atd.aj.BuildConfig.AuthenticationRequestParameters.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L15
                r5 = r6
                r4 = r7
                r3 = r2
                goto L2a
            L15:
                r3 = r6
                r6 = r5
                r5 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                int r5 = r5 + 1
                int r3 = r3 + 1
                r4 = r1[r5]
            L2a:
                int r4 = -r4
                int r6 = r6 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aj.BuildConfig.AuthenticationRequestParameters.$$c(short, int, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getMessageVersion = 0;
            ChallengeResultError = 1;
            getSDKEphemeralPublicKey = 0;
            ChallengeResult = 1;
            getSDKReferenceNumber();
            Object[] objArr = new Object[1];
            a("\u0002\f\u0000\u000f\u0017\f\u0002\u0013\u0011\u0006\u0012\t", 11 - TextUtils.lastIndexOf("", '0'), (byte) (KeyEvent.keyCodeFromString("") + 104), objArr);
            getDeviceData = new File(((String) objArr[0]).intern());
            AuthenticationRequestParameters = new Object();
            int i11 = getMessageVersion + 121;
            ChallengeResultError = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        private static DataInputStream AuthenticationRequestParameters() {
            DataInputStream dataInputStream;
            synchronized (AuthenticationRequestParameters) {
                if (getSDKAppID == null) {
                    try {
                        getSDKAppID = new DataInputStream(new FileInputStream(getDeviceData));
                    } catch (IOException e5) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        a("\u0016\u0010\u0007\u0000\u0016\u0005\r\u0004\u0018\u0013\u0010\t\u0015\u000f㘸", 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 126), objArr);
                        sb2.append(((String) objArr[0]).intern());
                        sb2.append(getDeviceData);
                        Object[] objArr2 = new Object[1];
                        a("\n\f\u0018\t\u0013\t\u0016\u000f\b\u0006\u000f\u0001", 12 - Color.argb(0, 0, 0, 0), (byte) ((-16777106) - Color.rgb(0, 0, 0)), objArr2);
                        sb2.append(((String) objArr2[0]).intern());
                        throw new SecurityException(sb2.toString(), e5);
                    }
                }
                dataInputStream = getSDKAppID;
            }
            return dataInputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(java.lang.String r48, int r49, byte r50, java.lang.Object[] r51) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 791
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aj.BuildConfig.AuthenticationRequestParameters.a(java.lang.String, int, byte, java.lang.Object[]):void");
        }

        private static OutputStream getSDKAppID() throws IOException {
            OutputStream outputStream;
            synchronized (AuthenticationRequestParameters) {
                try {
                    if (getSDKReferenceNumber == null) {
                        getSDKReferenceNumber = new FileOutputStream(getDeviceData);
                    }
                    outputStream = getSDKReferenceNumber;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return outputStream;
        }

        public static void getSDKReferenceNumber() {
            BuildConfig = new char[]{30881, 31583, 30890, 30898, 30900, 30895, 30902, 30882, 30891, 31580, 30896, 30880, 31582, 30899, 30950, 31577, 30888, 30887, 31576, 30889, 30883, 30848, 30953, 31578, 31581};
            ChallengeResultCancelled = (char) 19801;
        }

        public static void init$0() {
            $$a = new byte[]{0, ByteCompanionObject.MIN_VALUE, -126, 96, -85};
            $$b = 253;
        }

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i11) throws Throwable {
            int i12 = getSDKEphemeralPublicKey + AppConstants.RESULT_CODE_ORDER_CANCELLED;
            ChallengeResult = i12 % 128;
            if (i12 % 2 == 0) {
                engineNextBytes(new byte[i11]);
                throw null;
            }
            byte[] bArr = new byte[i11];
            engineNextBytes(bArr);
            int i13 = ChallengeResult + 17;
            getSDKEphemeralPublicKey = i13 % 128;
            if (i13 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        @Override // java.security.SecureRandomSpi
        @SuppressLint({"SyntheticAccessor"})
        public void engineNextBytes(byte[] bArr) throws Throwable {
            DataInputStream dataInputStreamAuthenticationRequestParameters;
            if (!this.getSDKTransactionID) {
                engineSetSeed(BuildConfig.getSDKAppID());
            }
            try {
                synchronized (AuthenticationRequestParameters) {
                    dataInputStreamAuthenticationRequestParameters = AuthenticationRequestParameters();
                }
                synchronized (dataInputStreamAuthenticationRequestParameters) {
                    dataInputStreamAuthenticationRequestParameters.readFully(bArr);
                }
            } catch (IOException e5) {
                Object[] objArr = new Object[1];
                a("\u0016\u0010\u0007\u0000\u0016\u0005\r\u0004\u0018\u0013\u0000\u0018\u0016\f\n\f\t\u0018\t\r", 21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (47 - View.getDefaultSize(0, 0)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                File file = getDeviceData;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strIntern);
                sb2.append(file);
                throw new SecurityException(sb2.toString(), e5);
            }
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            OutputStream sDKAppID;
            try {
                synchronized (AuthenticationRequestParameters) {
                    sDKAppID = getSDKAppID();
                }
                sDKAppID.write(bArr);
                sDKAppID.flush();
            } catch (IOException unused) {
            } finally {
                this.getSDKTransactionID = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class getSDKTransactionID extends Provider {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static boolean AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static int getSDKAppID;
        private static char[] getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, int r8) {
            /*
                int r6 = r6 * 2
                int r6 = r6 + 1
                int r7 = r7 * 4
                int r7 = r7 + 111
                int r8 = r8 * 3
                int r8 = r8 + 4
                byte[] r0 = atd.aj.BuildConfig.getSDKTransactionID.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r5 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r8]
            L26:
                int r8 = r8 + 1
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aj.BuildConfig.getSDKTransactionID.$$c(int, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKReferenceNumber = new char[]{21653, 21686, 21691, 21666, 21665, 21657, 21663, 21659, 21648, 21614, 21577, 21626, 21692, 21689, 21682, 21644, 21683, 21695, 21646, 21645, 21688, 21690, 21647, 21667, 21693, 21681, 21624, 21660, 21627, 21649, 21630, 21654, 21685, 21664};
            getSDKAppID = 1286296617;
            AuthenticationRequestParameters = true;
            getDeviceData = true;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public getSDKTransactionID() throws Throwable {
            Object[] objArr = new Object[1];
            a(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getSize(0) + 127, null, null, "\u0096\u0095\u0094\u0083\u0093\u0092\u0084\u009b\u0098\u008f\u0094\u009b\u008b\u008d\u008f\u008d\u0084\u008b\u0099\u0093\u009a\u0099\u008b\u0092\u008f\u0094\u0082\u0098\u0095\u0092\u008e\u008b\u0092\u008f\u0097\u0096\u0084\u0083\u008b\u0096\u0095\u0094\u0083\u0093\u0092\u008b\u0090\u0082\u0091\u0082\u0090\u008f\u008e\u008d\u008c\u0085\u0084\u0083\u0082\u0081\u008b\u008a", objArr2);
            super(strIntern, 1.0d, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0089\u0088\u0087\u0086\u009f\u008a\u009e\u009c\u009d\u0096\u0095\u0094\u0083\u0093\u0087\u008f\u0092\u0084\u0090\u008f\u009c", objArr3);
            put(((String) objArr3[0]).intern(), AuthenticationRequestParameters.class.getName());
            Object[] objArr4 = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) + 127, null, null, "\u0083 \u0094\u008f\u0099\u0083\u008f\u0096\u008f¡\u008e\u0096 \u008b\u0089\u0088\u0087\u0086\u009f\u008a\u009e\u009c\u009d\u0096\u0095\u0094\u0083\u0093\u0087\u008f\u0092\u0084\u0090\u008f\u009c", objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, "\u008f\u0092\u0093¢\u0099\u0091\u0095\u009c", objArr5);
            put(strIntern2, ((String) objArr5[0]).intern());
        }

        private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] cArr;
            int i12;
            long j9;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
            char[] cArr2 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            long j11 = 0;
            int i13 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            j9 = j11;
                            byte b8 = (byte) i13;
                            byte b11 = b8;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData((KeyEvent.getMaxKeyCode() >> 16) + 2555, (char) (ExpandableListView.getPackedPositionGroup(j11) + 48598), 31 - (TypedValue.complexToFraction(i13, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i13, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                        } else {
                            j9 = j11;
                        }
                        cArr3[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i14++;
                        $10 = ($11 + 97) % 128;
                        j11 = j9;
                        i13 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            long j12 = j11;
            Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(148 - (ViewConfiguration.getGlobalActionKeyTimeout() > j12 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j12 ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 33 - (SystemClock.uptimeMillis() > j12 ? 1 : (SystemClock.uptimeMillis() == j12 ? 0 : -1)), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            int i15 = 1124287645;
            if (getDeviceData) {
                $10 = ($11 + 59) % 128;
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                char[] cArr4 = new char[length2];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i16 = challengeResultTimeout.getSDKAppID;
                    int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i16 >= i17) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i16] = (char) (cArr2[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID3 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 1);
                        i12 = i15;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1697 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 29 - Gravity.getAbsoluteGravity(0, 0), -1620360563, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i12 = i15;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    i15 = i12;
                }
            } else if (AuthenticationRequestParameters) {
                int i18 = $11 + 7;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    int length3 = charArray.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length3;
                    cArr = new char[length3];
                    challengeResultTimeout.getSDKAppID = 1;
                } else {
                    int length4 = charArray.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length4;
                    cArr = new char[length4];
                    challengeResultTimeout.getSDKAppID = 0;
                }
                while (true) {
                    int i19 = challengeResultTimeout.getSDKAppID;
                    int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i19 >= i21) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i19] = (char) (cArr2[charArray[(i21 - 1) - i19] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 1);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - KeyEvent.normalizeMetaState(0), -1620360563, false, $$c(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
            } else {
                int length5 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length5;
                char[] cArr5 = new char[length5];
                challengeResultTimeout.getSDKAppID = 0;
                $10 = ($11 + 1) % 128;
                while (true) {
                    int i22 = challengeResultTimeout.getSDKAppID;
                    int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i22 >= i23) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        $11 = ($10 + 1) % 128;
                        cArr5[i22] = (char) (cArr2[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                        challengeResultTimeout.getSDKAppID = i22 + 1;
                    }
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{26, -110, -23, -5};
            $$b = 230;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, byte r7) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r5 = 115 - r5
            byte[] r1 = atd.aj.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r6
            r5 = r7
            goto L27
        L12:
            r4 = r7
            r7 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L23:
            int r5 = r5 + 1
            r3 = r1[r5]
        L27:
            int r3 = -r3
            int r7 = r7 + r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.BuildConfig.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCompleted = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber();
        AuthenticationRequestParameters();
        getSDKAppID = getSDKEphemeralPublicKey();
        int i11 = ChallengeResultCompleted + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = 711855293;
        getSDKReferenceNumber = new int[]{1100154426, -1445685275, -988543101, -1477345694, -969043127, -2074533203, 509143154, 1655251087, 730062909, 77551866, 1048242559, 433054249, -897050335, 1821536682, 2137462922, -25633128, -1480474144, 1563680086};
    }

    private static String BuildConfig() throws Throwable {
        ChallengeResult = (getSDKEphemeralPublicKey + 109) % 128;
        try {
            Object[] objArr = new Object[1];
            a(true, 196 - TextUtils.indexOf("", "", 0), "\t\u0002\ufff7\uffff\b\ufffb", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 6, objArr);
            String str = (String) Build.class.getField(((String) objArr[0]).intern()).get(null);
            int i11 = getSDKEphemeralPublicKey + 19;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 66 / 0;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void ChallengeResult() {
        int i11 = ChallengeResult + 99;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 10 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r27, int r28, java.lang.String r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.BuildConfig.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int length;
        int[] iArr2;
        int i13;
        char[] cArr;
        int[] iArr3;
        int length2;
        int[] iArr4;
        int i14;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i15 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr5 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i16 = 16;
        int i17 = 1;
        int i18 = 0;
        if (iArr5 != null) {
            int i19 = $11 + 73;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                length2 = iArr5.length;
                iArr4 = new int[length2];
            } else {
                length2 = iArr5.length;
                iArr4 = new int[length2];
            }
            int i21 = 0;
            i12 = -1667528016;
            while (i21 < length2) {
                int i22 = i15;
                $11 = ($10 + 93) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr5[i21])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID == null) {
                        i14 = i16;
                        byte b8 = (byte) i17;
                        byte b11 = (byte) (b8 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2223, (char) (53070 - TextUtils.indexOf("", "", i18)), 22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1089703072, false, $$c(b8, b11, (byte) (b11 - 1)), new Class[]{cls});
                    } else {
                        i14 = i16;
                    }
                    iArr4[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i21++;
                    i15 = i22;
                    i16 = i14;
                    i17 = 1;
                    i18 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr5 = iArr4;
        } else {
            i12 = -1667528016;
        }
        int i23 = i15;
        int i24 = i16;
        int length3 = iArr5.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getSDKReferenceNumber;
        if (iArr7 != null) {
            int i25 = $11 + 109;
            $10 = i25 % 128;
            if (i25 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i13 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i13 = 0;
            }
            while (i13 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr7[i13])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i12);
                if (sDKTransactionID2 == null) {
                    cArr = cArr2;
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    iArr3 = iArr7;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "", 0) + 2223, (char) (ExpandableListView.getPackedPositionChild(0L) + 53071), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, 1089703072, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr3 = iArr7;
                }
                iArr2[i13] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i13++;
                cArr2 = cArr;
                iArr7 = iArr3;
            }
            iArr7 = iArr2;
        }
        char[] cArr4 = cArr2;
        char c3 = 0;
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i26 = getmessageversion.getSDKAppID;
            if (i26 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i27 = iArr[i26];
            char c7 = (char) (i27 >> 16);
            cArr4[c3] = c7;
            char c8 = (char) i27;
            cArr4[1] = c8;
            char c11 = (char) (iArr[i26 + 1] >> 16);
            cArr4[i23] = c11;
            char c12 = (char) iArr[i26 + 1];
            cArr4[3] = c12;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c11 << 16) + c12;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr6);
            int i28 = 0;
            while (i28 < i24) {
                int i29 = $11 + 17;
                $10 = i29 % 128;
                int i31 = i29 % 2;
                int i32 = getmessageversion.getDeviceData;
                if (i31 != 0) {
                    int i33 = i32 ^ iArr6[i28];
                    getmessageversion.getDeviceData = i33;
                    int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[i23] = getmessageversion;
                    objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 3;
                        byte b15 = (byte) (b14 - 3);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getEdgeSlop() >> 16) + 2386, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.blue(0) + 19, -2040903174, false, $$c(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i28 += 9;
                } else {
                    int i34 = i32 ^ iArr6[i28];
                    getmessageversion.getDeviceData = i34;
                    int sDKReferenceNumber2 = atd.bb.getMessageVersion.getSDKReferenceNumber(i34);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = getmessageversion;
                    objArr5[i23] = getmessageversion;
                    objArr5[1] = Integer.valueOf(sDKReferenceNumber2);
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 3;
                        byte b17 = (byte) (b16 - 3);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2386 - Color.blue(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 19, -2040903174, false, $$c(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue2;
                    i28++;
                }
                i24 = 16;
            }
            int i35 = getmessageversion.getDeviceData;
            int i36 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i36;
            getmessageversion.AuthenticationRequestParameters = i35;
            i24 = 16;
            int i37 = i35 ^ iArr6[16];
            getmessageversion.AuthenticationRequestParameters = i37;
            int i38 = iArr6[17] ^ i36;
            getmessageversion.getDeviceData = i38;
            cArr4[0] = (char) (i38 >>> 16);
            cArr4[1] = (char) i38;
            cArr4[i23] = (char) (i37 >>> 16);
            cArr4[3] = (char) i37;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr6);
            int i39 = getmessageversion.getSDKAppID;
            cArr3[i39 * 2] = cArr4[0];
            cArr3[(i39 * 2) + 1] = cArr4[1];
            cArr3[(i39 * 2) + 2] = cArr4[i23];
            cArr3[(i39 * 2) + 3] = cArr4[3];
            int i41 = i23;
            Object[] objArr6 = new Object[i41];
            objArr6[1] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1861;
                char cBlue = (char) Color.blue(0);
                int gidForName = 39 - Process.getGidForName("");
                byte b18 = (byte) ($$b & 15);
                byte b19 = (byte) (b18 - 2);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(offsetBefore, cBlue, gidForName, -562771681, false, $$c(b18, b19, (byte) (b19 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            $10 = ($11 + 91) % 128;
            i23 = i41;
            c3 = 0;
        }
    }

    private static void c(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        int i12 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int iBlue = Color.blue(i12) + 2555;
                        char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i12) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i12) == 0.0d ? 0 : -1)) + 48598);
                        int iRgb = 16777247 + Color.rgb(i12, i12, i12);
                        byte length2 = (byte) $$a.length;
                        byte b8 = (byte) (length2 - 4);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iBlue, c3, iRgb, -390605202, false, $$c(length2, b8, (byte) (b8 - 1)), new Class[]{cls});
                    }
                    cArr2[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i13++;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(Gravity.getAbsoluteGravity(0, 0) + 147, (char) TextUtils.getTrimmedLength(""), 32 - (KeyEvent.getMaxKeyCode() >> 16), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i14 = 1124287645;
        if (BuildConfig) {
            int length3 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr3 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i15 = challengeResultTimeout.getSDKAppID;
                int i16 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i15] = (char) (cArr[bArr[(i16 - 1) - i15] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1697 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, -1620360563, false, $$c(b11, b12, (byte) (b12 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else if (ChallengeResultCancelled) {
            int length4 = charArray.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr4 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i17 = challengeResultTimeout.getSDKAppID;
                int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i17] = (char) (cArr[charArray[(i18 - 1) - i17] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                if (sDKTransactionID4 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getTouchSlop() >> 8) + 1697, (char) ExpandableListView.getPackedPositionGroup(0L), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), -1620360563, false, $$c(b13, b14, (byte) (b14 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                i14 = 1124287645;
            }
        } else {
            int length5 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr5 = new char[length5];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i19] = (char) (cArr[iArr[(i21 - 1) - i19] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i19 + 1;
                }
            }
        }
    }

    private static void getDeviceData() {
        getSDKEphemeralPublicKey = (ChallengeResult + 59) % 128;
    }

    public static byte[] getSDKAppID() throws Throwable {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(getSDKAppID);
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ChallengeResult = (getSDKEphemeralPublicKey + 89) % 128;
            return byteArray;
        } catch (IOException e5) {
            Object[] objArr = new Object[1];
            a(true, 216 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0007\tￂ\u0011\u0016ￂ\u0006\u0007\u000e\u000b\u0003￨\u0006\u0007\u0007\u0015ￂ\u0007\u0016\u0003\u0014\u0007\u0010", 11 - ((byte) KeyEvent.getModifierMetaStateMask()), 23 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            throw new SecurityException(((String) objArr[0]).intern(), e5);
        }
    }

    private static byte[] getSDKEphemeralPublicKey() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            int i11 = getSDKEphemeralPublicKey + 45;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                sb2.append(str);
                int i12 = 49 / 0;
            } else {
                sb2.append(str);
            }
        }
        String strBuildConfig = BuildConfig();
        if (strBuildConfig != null) {
            sb2.append(strBuildConfig);
            getSDKEphemeralPublicKey = (ChallengeResult + 35) % 128;
        }
        byte[] bytes = sb2.toString().getBytes(atd.e.getSDKAppID.getSDKAppID);
        getSDKEphemeralPublicKey = (ChallengeResult + 93) % 128;
        return bytes;
    }

    public static void getSDKReferenceNumber() {
        getDeviceData = new char[]{21785, 21776, 21765, 21725, 21766, 21780, 21782, 21764, 21761, 21784, 21767, 21768, 21734, 21729, 21789, 21783, 21762, 21788};
        AuthenticationRequestParameters = 1286296755;
        ChallengeResultCancelled = true;
        BuildConfig = true;
    }

    public static void getSDKTransactionID() {
        int i11 = getSDKEphemeralPublicKey + 21;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            getDeviceData();
            ChallengeResult();
            int i12 = 28 / 0;
        } else {
            getDeviceData();
            ChallengeResult();
        }
        ChallengeResult = (getSDKEphemeralPublicKey + 3) % 128;
    }

    public static void init$0() {
        $$a = new byte[]{66, -81, 60, 85};
        $$b = 178;
    }
}
