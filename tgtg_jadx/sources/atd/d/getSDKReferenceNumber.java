package atd.d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import atd.bb.ChallengeResultKt;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 + 4
            int r8 = r8 + 103
            byte[] r0 = atd.d.getSDKReferenceNumber.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r8 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r9 = r9 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        BuildConfig = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKAppID();
        ViewConfiguration.getMaximumFlingVelocity();
        Process.getGidForName("");
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.getCapsMode("", 0, 0);
        Process.myTid();
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        ExpandableListView.getPackedPositionType(0L);
        Gravity.getAbsoluteGravity(0, 0);
        View.resolveSizeAndState(0, 0, 0);
        SystemClock.currentThreadTimeMillis();
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getMaximumFlingVelocity();
        SystemClock.elapsedRealtime();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        BuildConfig = (getSDKTransactionID + 27) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, char r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.a(int, char, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber getDeviceData(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.getDeviceData(java.util.Map):atd.d.getSDKReferenceNumber$getSDKReferenceNumber");
    }

    public static void getSDKAppID() {
        getDeviceData = new char[]{62541, 55478, 44494, 29439, 18231, 5203, 63856, 52674, 37602, 26616, 13336, 6486, 62517, 7851, 62573, 55473, 44481, 29433, 18209, 5208, 63856, 63901, 54632, 40977, 32572, 19184, 6555};
        AuthenticationRequestParameters = 429730515464280281L;
    }

    private static C0005getSDKReferenceNumber getSDKTransactionID(String... strArr) throws Throwable {
        Charset deviceData;
        getDeviceData getdevicedataAuthenticationRequestParameters;
        int i11 = getSDKReferenceNumber;
        int i12 = i11 + 115;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            int length = strArr.length;
            throw null;
        }
        if (strArr.length > 0) {
            int i13 = i11 + 117;
            getSDKAppID = i13 % 128;
            if (i13 % 2 != 0 ? (getdevicedataAuthenticationRequestParameters = getDeviceData.AuthenticationRequestParameters(strArr[0])) == null : (getdevicedataAuthenticationRequestParameters = getDeviceData.AuthenticationRequestParameters(strArr[0])) == null) {
                return null;
            }
            if (strArr.length > 1) {
                deviceData = getDeviceData(strArr[1]);
                getSDKAppID = (getSDKReferenceNumber + 1) % 128;
            } else {
                deviceData = null;
            }
        } else {
            deviceData = null;
            getdevicedataAuthenticationRequestParameters = null;
        }
        if (getdevicedataAuthenticationRequestParameters == null) {
            return null;
        }
        int i14 = getSDKReferenceNumber + 77;
        getSDKAppID = i14 % 128;
        if (i14 % 2 != 0) {
            return getdevicedataAuthenticationRequestParameters.getSDKAppID(deviceData);
        }
        C0005getSDKReferenceNumber sDKAppID = getdevicedataAuthenticationRequestParameters.getSDKAppID(deviceData);
        int i15 = 68 / 0;
        return sDKAppID;
    }

    public static void init$0() {
        $$a = new byte[]{4, -95, 14, -12};
        $$b = 20;
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
        public static final getDeviceData APPLICATION_JOSE;
        public static final getDeviceData APPLICATION_JSON;
        private static char AuthenticationRequestParameters;
        private static int ChallengeResult;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;
        private final String mValue;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, short r8, int r9) {
            /*
                int r9 = r9 + 65
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r7 = r7 * 3
                int r7 = 1 - r7
                byte[] r0 = atd.d.getSDKReferenceNumber.getDeviceData.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L28
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L28:
                int r3 = -r3
                int r8 = r8 + r3
                int r9 = r9 + 1
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.getDeviceData.$$c(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKAppID = 0;
            ChallengeResult = 1;
            getDeviceData = 0;
            getSDKTransactionID = 1;
            getSDKTransactionID();
            Object[] objArr = new Object[1];
            a("\f\u0005\b\u0011\f\n\r\u0000\u000e\u0001\u0014\u0010\u0012\u0015\u0001\u0018", 16 - Color.alpha(0), (byte) (View.resolveSizeAndState(0, 0, 0) + 42), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("\u0003\f\n\u0017\n\u0007\u0003\u0002\u0011\u0002\u0007\u0013\u000f\u0004\u0018\u0007", ExpandableListView.getPackedPositionChild(0L) + 17, (byte) (48 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
            APPLICATION_JSON = new getDeviceData(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("\f\u0005\b\u0011\f\n\r\u0000\u000e\u0001\u0014\u0010\u0013\u0001\u0003\r", (Process.myTid() >> 22) + 16, (byte) (21 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a("\u0003\f\n\u0017\n\u0007\u0003\u0002\u0011\u0002\u0007\u0013\u0011\u0018\u0001\u0005", 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr4);
            APPLICATION_JOSE = new getDeviceData(strIntern2, 1, ((String) objArr4[0]).intern());
            $VALUES = getSDKAppID();
            ChallengeResult = (getSDKAppID + 75) % 128;
        }

        private getDeviceData(String str, int i11, String str2) {
            this.mValue = str2;
        }

        public static getDeviceData AuthenticationRequestParameters(String str) throws CloneNotSupportedException {
            getDeviceData[] getdevicedataArrValues = values();
            int length = getdevicedataArrValues.length;
            getSDKTransactionID = (getDeviceData + 23) % 128;
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = getDeviceData + 1;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 == 0) {
                    getDeviceData getdevicedata = getdevicedataArrValues[i11];
                    int i13 = 46 / 0;
                    if (getdevicedata.mValue.equalsIgnoreCase(str)) {
                        return getdevicedata;
                    }
                } else {
                    getDeviceData getdevicedata2 = getdevicedataArrValues[i11];
                    if (getdevicedata2.mValue.equalsIgnoreCase(str)) {
                        return getdevicedata2;
                    }
                }
            }
            return null;
        }

        private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            char c3;
            char c7;
            char c8;
            char c11;
            int length;
            char[] cArr;
            int i13;
            int i14;
            char c12;
            char c13;
            if (str != null) {
                $10 = ($11 + 95) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr2 = charArray;
            ChallengeResultKt challengeResultKt = new ChallengeResultKt();
            char[] cArr3 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            int i15 = -317146529;
            char c14 = '\b';
            char c15 = 2;
            int i16 = 0;
            if (cArr3 != null) {
                int i17 = $10 + 97;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                    i13 = 1;
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                    i13 = 0;
                }
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i15);
                        if (sDKTransactionID == null) {
                            i14 = i15;
                            c12 = c14;
                            c13 = c15;
                            byte b11 = (byte) i16;
                            byte b12 = b11;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarSize() >> 8) + 2158, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36, 829471823, false, $$c(b11, b12, b12), new Class[]{cls});
                        } else {
                            i14 = i15;
                            c12 = c14;
                            c13 = c15;
                        }
                        cArr[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i13++;
                        i15 = i14;
                        c14 = c12;
                        c15 = c13;
                        i16 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr;
            }
            int i18 = i15;
            char c16 = c14;
            char c17 = c15;
            Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i18);
            if (sDKTransactionID2 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 36 - (ViewConfiguration.getFadingEdgeLength() >> 16), 829471823, false, $$c(b13, b14, b14), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr2[i12] - b8);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                int i19 = 0;
                while (true) {
                    challengeResultKt.getSDKReferenceNumber = i19;
                    int i21 = challengeResultKt.getSDKReferenceNumber;
                    if (i21 >= i12) {
                        break;
                    }
                    char c18 = cArr2[i21];
                    challengeResultKt.getDeviceData = c18;
                    char c19 = cArr2[i21 + 1];
                    challengeResultKt.getSDKAppID = c19;
                    if (c18 == c19) {
                        cArr4[i21] = (char) (c18 - b8);
                        cArr4[i21 + 1] = (char) (c19 - b8);
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = challengeResultKt;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = challengeResultKt;
                        objArr4[9] = challengeResultKt;
                        objArr4[c16] = Integer.valueOf(cCharValue);
                        objArr4[7] = challengeResultKt;
                        objArr4[6] = challengeResultKt;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = challengeResultKt;
                        objArr4[3] = challengeResultKt;
                        objArr4[c17] = Integer.valueOf(cCharValue);
                        objArr4[1] = challengeResultKt;
                        objArr4[0] = challengeResultKt;
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            c3 = '\t';
                            int iResolveSizeAndState = 1258 - View.resolveSizeAndState(0, 0, 0);
                            c7 = 7;
                            char c21 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34414);
                            int iIndexOf = TextUtils.indexOf("", "") + 41;
                            c8 = 6;
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            c11 = 4;
                            String str$$c = $$c(b15, b16, (byte) (b16 + 2));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iResolveSizeAndState, c21, iIndexOf, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            c3 = '\t';
                            c7 = 7;
                            c8 = 6;
                            c11 = 4;
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i22 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i22) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = challengeResultKt;
                            objArr5[c3] = Integer.valueOf(cCharValue);
                            objArr5[c16] = challengeResultKt;
                            objArr5[c7] = Integer.valueOf(cCharValue);
                            objArr5[c8] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[c11] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[c17] = Integer.valueOf(cCharValue);
                            objArr5[1] = challengeResultKt;
                            objArr5[0] = challengeResultKt;
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2223;
                                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 53070);
                                int touchSlop = 21 - (ViewConfiguration.getTouchSlop() >> 8);
                                byte b17 = (byte) 0;
                                String str$$c2 = $$c(b17, b17, $$a[0]);
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iResolveOpacity, cResolveOpacity, touchSlop, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i23 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i24 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i24] = cArr3[iIntValue2];
                            cArr4[i24 + 1] = cArr3[i23];
                        } else {
                            int i25 = challengeResultKt.AuthenticationRequestParameters;
                            int i26 = challengeResultKt.getSDKTransactionID;
                            if (i25 == i26) {
                                $11 = ($10 + 73) % 128;
                                int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, 1, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i22, cCharValue, 1, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i27 = (i26 * cCharValue) + iC2;
                                int i28 = challengeResultKt.getSDKReferenceNumber;
                                cArr4[i28] = cArr3[(i25 * cCharValue) + iC];
                                cArr4[i28 + 1] = cArr3[i27];
                            } else {
                                int i29 = (i25 * cCharValue) + i22;
                                int i31 = (i26 * cCharValue) + challengeResultKt.getMessageVersion;
                                int i32 = challengeResultKt.getSDKReferenceNumber;
                                cArr4[i32] = cArr3[i29];
                                cArr4[i32 + 1] = cArr3[i31];
                                i19 = challengeResultKt.getSDKReferenceNumber + 2;
                            }
                        }
                    }
                    i19 = challengeResultKt.getSDKReferenceNumber + 2;
                }
            }
            for (int i33 = 0; i33 < i11; i33++) {
                cArr4[i33] = (char) (cArr4[i33] ^ 13722);
            }
            String str2 = new String(cArr4);
            $11 = ($10 + 63) % 128;
            objArr[0] = str2;
        }

        private static /* synthetic */ getDeviceData[] getSDKAppID() {
            int i11 = getDeviceData + 59;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                return new getDeviceData[]{APPLICATION_JSON, APPLICATION_JOSE};
            }
            getDeviceData[] getdevicedataArr = new getDeviceData[4];
            getdevicedataArr[0] = APPLICATION_JSON;
            getdevicedataArr[1] = APPLICATION_JOSE;
            return getdevicedataArr;
        }

        public static void getSDKTransactionID() {
            getSDKReferenceNumber = new char[]{30901, 30898, 30887, 30866, 30857, 30885, 30883, 30870, 30851, 30888, 30855, 30863, 30895, 30902, 30853, 30873, 30860, 30953, 30858, 30892, 30890, 30856, 30889, 30869, 30903};
            AuthenticationRequestParameters = (char) 19801;
        }

        public static void init$0() {
            $$a = new byte[]{57, -81, -39, 15};
            $$b = 51;
        }

        public static getDeviceData valueOf(String str) {
            getSDKTransactionID = (getDeviceData + 119) % 128;
            getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
            int i11 = getSDKTransactionID + 1;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 9 / 0;
            }
            return getdevicedata;
        }

        public static getDeviceData[] values() throws CloneNotSupportedException {
            int i11 = getDeviceData + 17;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                return (getDeviceData[]) $VALUES.clone();
            }
            $VALUES.clone();
            throw null;
        }

        public final String getSDKReferenceNumber() {
            int i11 = getSDKTransactionID;
            String str = this.mValue;
            getDeviceData = (i11 + 85) % 128;
            return str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            int i11 = getSDKTransactionID;
            String str = this.mValue;
            getDeviceData = (i11 + 115) % 128;
            return str;
        }

        public final C0005getSDKReferenceNumber getSDKAppID(Charset charset) {
            C0005getSDKReferenceNumber c0005getSDKReferenceNumber = new C0005getSDKReferenceNumber(this, charset);
            getDeviceData = (getSDKTransactionID + 81) % 128;
            return c0005getSDKReferenceNumber;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0066 A[PHI: r9
      0x0066: PHI (r9v2 java.lang.String[]) = (r9v1 java.lang.String[]), (r9v7 java.lang.String[]) binds: [B:8:0x0064, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.nio.charset.Charset getDeviceData(java.lang.String r9) throws java.lang.Throwable {
        /*
            int r0 = atd.d.getSDKReferenceNumber.getSDKReferenceNumber
            int r0 = r0 + 123
            int r1 = r0 % 128
            atd.d.getSDKReferenceNumber.getSDKAppID = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 14
            r3 = 60056(0xea98, float:8.4156E-41)
            r4 = 1
            java.lang.String r5 = ""
            r6 = 0
            if (r0 != 0) goto L3e
            int r0 = android.text.TextUtils.getOffsetBefore(r5, r4)
            int r0 = r0 + 9
            int r7 = android.text.TextUtils.indexOf(r5, r5, r4)
            int r3 = r3 >> r7
            char r3 = (char) r3
            r7 = 100
            char r8 = android.text.AndroidCharacter.getMirror(r2)
            int r7 = r7 / r8
            java.lang.Object[] r8 = new java.lang.Object[r4]
            a(r0, r3, r7, r8)
            r0 = r8[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            if (r0 <= 0) goto La4
            goto L66
        L3e:
            int r0 = android.text.TextUtils.getOffsetBefore(r5, r6)
            int r0 = r0 + 13
            int r7 = android.text.TextUtils.indexOf(r5, r5, r6)
            int r7 = r7 + r3
            char r3 = (char) r7
            r7 = 48
            char r7 = android.text.AndroidCharacter.getMirror(r7)
            int r7 = 49 - r7
            java.lang.Object[] r8 = new java.lang.Object[r4]
            a(r0, r3, r7, r8)
            r0 = r8[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            if (r0 <= r4) goto La4
        L66:
            int r0 = android.text.TextUtils.getCapsMode(r5, r6, r6)
            int r0 = r0 + r2
            int r2 = android.text.TextUtils.getOffsetAfter(r5, r6)
            char r2 = (char) r2
            r3 = 0
            float r5 = android.graphics.PointF.length(r3, r3)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            int r3 = r3 + 7
            java.lang.Object[] r5 = new java.lang.Object[r4]
            a(r0, r2, r3, r5)
            r0 = r5[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r2 = r9[r6]
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto La4
            int r0 = atd.d.getSDKReferenceNumber.getSDKAppID
            int r0 = r0 + 19
            int r2 = r0 % 128
            atd.d.getSDKReferenceNumber.getSDKReferenceNumber = r2
            int r0 = r0 % 2
            if (r0 == 0) goto La1
            r9 = r9[r6]     // Catch: java.lang.IllegalArgumentException -> La4
        L9c:
            java.nio.charset.Charset r9 = java.nio.charset.Charset.forName(r9)     // Catch: java.lang.IllegalArgumentException -> La4
            return r9
        La1:
            r9 = r9[r4]     // Catch: java.lang.IllegalArgumentException -> La4
            goto L9c
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.getDeviceData(java.lang.String):java.nio.charset.Charset");
    }

    /* JADX INFO: renamed from: atd.d.getSDKReferenceNumber$getSDKReferenceNumber, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class C0005getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static long ChallengeResultCancelled;
        private static char[] getDeviceData;
        private static int getMessageVersion;
        private static int getSDKEphemeralPublicKey;
        private static char[] getSDKTransactionID;
        private final Charset getSDKAppID;
        private final getDeviceData getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, byte r7, int r8) {
            /*
                byte[] r0 = atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber.$$c
                int r6 = 122 - r6
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r6
                r6 = r7
                r4 = r2
                goto L25
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r8]
            L25:
                int r6 = r6 + r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber.$$e(byte, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getMessageVersion = 0;
            getSDKEphemeralPublicKey = 1;
            getSDKTransactionID = new char[]{30901, 30895, 30971, 30889, 30884, 30899, 30955, 30902, 30887, 30894, 30882, 30953, 30880, 30893, 30973, 30855, 30881, 30900, 30952, 30883, 30888, 30885, 30863, 30890, 30898};
            AuthenticationRequestParameters = (char) 19801;
            getDeviceData = new char[]{64332, 4512, 11919, 15350, 20686, 27947, 31259, 38710, 44118, 47801, 55197, 60568, 63980, 5828, 9011, 14414, 21854, 25169, 30901, 38272, 41716, 49098, 54491, 7854, 62530, 52077, 56852, 46380, 35017, 40953, 29396, 18868, 24411, 12927, 2426, 7182, 62246, 50897, 56748, 45199, 34737, 40215, 28759, 18179, 23072, 12577, 1219, 7140, 61061, 50613, 56151, 44660, 34070, 38940, 28636, 17097, 23011, 51693, 8964, 7212, 2373, 25204, 48885, 21515, 27503, 32330, 5486, 10378, 16288, 53973, 59896, 65309, 37435, 43306, 48198, 35892};
            ChallengeResultCancelled = -2759849499743740179L;
        }

        public C0005getSDKReferenceNumber(getDeviceData getdevicedata, Charset charset) {
            this.getSDKReferenceNumber = getdevicedata;
            this.getSDKAppID = charset == null ? atd.e.getSDKAppID.getSDKAppID : charset;
        }

        private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            float f11;
            int i12;
            char c3;
            char c7;
            char c8;
            char c11;
            char c12;
            int i13;
            char c13;
            int i14;
            char[] charArray = str != null ? str.toCharArray() : str;
            ChallengeResultKt challengeResultKt = new ChallengeResultKt();
            char[] cArr = getSDKTransactionID;
            Class cls = Integer.TYPE;
            int i15 = -317146529;
            char c14 = '\b';
            int i16 = 2;
            int i17 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                f11 = 0.0f;
                while (i18 < length) {
                    int i19 = $11 + AppConstants.RESULT_CODE_ORDER_CANCELLED;
                    $10 = i19 % 128;
                    if (i19 % i16 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i15);
                            if (sDKTransactionID == null) {
                                i13 = i15;
                                c13 = c14;
                                i14 = i16;
                                byte b11 = (byte) i17;
                                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(View.getDefaultSize(i17, i17) + 2158, (char) (ViewConfiguration.getScrollBarSize() >> 8), 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 829471823, false, $$e((byte) 57, b11, (byte) (b11 - 1)), new Class[]{cls});
                            } else {
                                i13 = i15;
                                c13 = c14;
                                i14 = i16;
                            }
                            cArr2[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        i13 = i15;
                        c13 = c14;
                        i14 = i16;
                        Object[] objArr3 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                        if (sDKTransactionID2 == null) {
                            byte b12 = (byte) 0;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - (KeyEvent.getMaxKeyCode() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 37 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 829471823, false, $$e((byte) 57, b12, (byte) (b12 - 1)), new Class[]{cls});
                        }
                        cArr2[i18] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        i18++;
                    }
                    c14 = c13;
                    i15 = i13;
                    i16 = i14;
                    i17 = 0;
                }
                cArr = cArr2;
            } else {
                f11 = 0.0f;
            }
            int i21 = i15;
            char c15 = c14;
            int i22 = i16;
            Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i21);
            if (sDKTransactionID3 == null) {
                byte b13 = (byte) 0;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2157 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 829471823, false, $$e((byte) 57, b13, (byte) (b13 - 1)), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
            char[] cArr3 = new char[i11];
            if (i11 % 2 != 0) {
                $10 = ($11 + 43) % 128;
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i23 = challengeResultKt.getSDKReferenceNumber;
                    if (i23 >= i12) {
                        break;
                    }
                    char c16 = charArray[i23];
                    challengeResultKt.getDeviceData = c16;
                    char c17 = charArray[i23 + 1];
                    challengeResultKt.getSDKAppID = c17;
                    if (c16 == c17) {
                        int i24 = $11 + 93;
                        $10 = i24 % 128;
                        if (i24 % 2 != 0) {
                            cArr3[i23] = (char) (c16 / b8);
                            cArr3[i23] = (char) (c17 + b8);
                        } else {
                            cArr3[i23] = (char) (c16 - b8);
                            cArr3[i23 + 1] = (char) (c17 - b8);
                        }
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = challengeResultKt;
                        objArr5[11] = Integer.valueOf(cCharValue);
                        objArr5[10] = challengeResultKt;
                        objArr5[9] = challengeResultKt;
                        objArr5[c15] = Integer.valueOf(cCharValue);
                        objArr5[7] = challengeResultKt;
                        objArr5[6] = challengeResultKt;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = challengeResultKt;
                        objArr5[i22] = Integer.valueOf(cCharValue);
                        objArr5[1] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID4 == null) {
                            c3 = '\n';
                            int i25 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1257;
                            c7 = '\t';
                            char c18 = (char) ((ViewConfiguration.getScrollFriction() > f11 ? 1 : (ViewConfiguration.getScrollFriction() == f11 ? 0 : -1)) + 34413);
                            int pressedStateDuration = 41 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            c8 = 7;
                            c11 = 6;
                            c12 = 4;
                            byte b14 = (byte) 0;
                            String str$$e = $$e((byte) 55, b14, (byte) (b14 - 1));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i25, c18, pressedStateDuration, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            c3 = '\n';
                            c7 = '\t';
                            c8 = 7;
                            c11 = 6;
                            c12 = 4;
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i26 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i26) {
                            Object[] objArr6 = new Object[11];
                            objArr6[c3] = challengeResultKt;
                            objArr6[c7] = Integer.valueOf(cCharValue);
                            objArr6[c15] = challengeResultKt;
                            objArr6[c8] = Integer.valueOf(cCharValue);
                            objArr6[c11] = Integer.valueOf(cCharValue);
                            objArr6[5] = challengeResultKt;
                            objArr6[c12] = challengeResultKt;
                            objArr6[3] = Integer.valueOf(cCharValue);
                            objArr6[i22] = Integer.valueOf(cCharValue);
                            objArr6[1] = challengeResultKt;
                            objArr6[0] = challengeResultKt;
                            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID5 == null) {
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2223;
                                char cIndexOf = (char) (53069 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 21;
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                String str$$e2 = $$e(b15, b16, (byte) (b16 - 1));
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(touchSlop, cIndexOf, iMakeMeasureSpec, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID5).invoke(null, objArr6)).intValue();
                            int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i28 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i28] = cArr[iIntValue2];
                            cArr3[i28 + 1] = cArr[i27];
                        } else {
                            int i29 = challengeResultKt.AuthenticationRequestParameters;
                            int i31 = challengeResultKt.getSDKTransactionID;
                            int i32 = challengeResultKt.getMessageVersion;
                            if (i29 == i31) {
                                int iC = k.c(i32, cCharValue, 1, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i26, cCharValue, 1, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i33 = (i31 * cCharValue) + iC2;
                                int i34 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i34] = cArr[(i29 * cCharValue) + iC];
                                cArr3[i34 + 1] = cArr[i33];
                            } else {
                                int i35 = (i29 * cCharValue) + i26;
                                int i36 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i36] = cArr[i35];
                                cArr3[i36 + 1] = cArr[(i31 * cCharValue) + i32];
                            }
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                }
            }
            $10 = ($11 + 43) % 128;
            for (int i37 = 0; i37 < i11; i37++) {
                cArr3[i37] = (char) (cArr3[i37] ^ 13722);
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x02a3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(char r31, int r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 692
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber.b(char, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = 34 - r7
                int r8 = 104 - r8
                int r0 = r6 + 2
                byte[] r1 = atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber.$$a
                byte[] r0 = new byte[r0]
                int r6 = r6 + 1
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r7 = r7 + r3
                int r7 = r7 + (-2)
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber.c(short, int, int, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r33, int r34, int r35, int r36) {
            /*
                Method dump skipped, instruction units count: 1511
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.C0005getSDKReferenceNumber.getDeviceData(android.content.Context, int, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{63, -107, 81, -105, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 0, 17, -31, -13, 9, 11, 32, -15, 15, 7, -16, 4, 19, -9, 8, 1, -35, -3, 3, -3, 3, -50};
            $$b = 135;
        }

        public static void init$1() {
            $$c = new byte[]{23, 71, -23, -123};
            $$d = 153;
        }

        public final getDeviceData AuthenticationRequestParameters() {
            int i11 = getSDKEphemeralPublicKey + 101;
            getMessageVersion = i11 % 128;
            int i12 = i11 % 2;
            getDeviceData getdevicedata = this.getSDKReferenceNumber;
            if (i12 == 0) {
                return getdevicedata;
            }
            throw null;
        }

        public final String getSDKAppID() throws Throwable {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getSDKReferenceNumber.getSDKReferenceNumber());
            Object[] objArr = new Object[1];
            a("㖾", TextUtils.getTrimmedLength("") + 1, (byte) (TextUtils.lastIndexOf("", '0', 0) + 30), objArr);
            sb2.append(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("\u0018\u0006\u0007\u0012\u0004\u000f㘵", View.MeasureSpec.getSize(0) + 7, (byte) (71 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("㗸", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (byte) ((-16777135) - Color.rgb(0, 0, 0)), objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append(this.getSDKAppID.name());
            String string = sb2.toString();
            getMessageVersion = (getSDKEphemeralPublicKey + 111) % 128;
            return string;
        }

        public final String toString() throws Throwable {
            getSDKEphemeralPublicKey = (getMessageVersion + 83) % 128;
            String sDKAppID = getSDKAppID();
            getMessageVersion = (getSDKEphemeralPublicKey + 107) % 128;
            return sDKAppID;
        }

        public final Charset getDeviceData() {
            int i11 = getMessageVersion;
            Charset charset = this.getSDKAppID;
            getSDKEphemeralPublicKey = (i11 + 99) % 128;
            return charset;
        }
    }
}
