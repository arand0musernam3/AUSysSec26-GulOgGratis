package atd.av;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultCompleted;
import atd.d.getAdditionalDetails;
import atd.e.ChallengeResult;
import com.adyen.threeds2.R;
import java.lang.reflect.Method;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData extends View {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled;
    private static final EnumC0003getDeviceData getSDKAppID = EnumC0003getDeviceData.HORIZONTAL;
    private int getDeviceData;
    private int getSDKReferenceNumber;
    private EnumC0003getDeviceData getSDKTransactionID;

    /* JADX INFO: renamed from: atd.av.getDeviceData$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getDeviceData;
        private static int getSDKAppID = 1;
        private static int getSDKReferenceNumber;

        static {
            int[] iArr = new int[EnumC0003getDeviceData.values().length];
            getDeviceData = iArr;
            try {
                iArr[EnumC0003getDeviceData.HORIZONTAL.ordinal()] = 1;
                int i11 = getSDKReferenceNumber;
                getSDKAppID = ((i11 ^ 109) + ((i11 & 109) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getDeviceData[EnumC0003getDeviceData.VERTICAL.ordinal()] = 2;
                int i12 = getSDKAppID;
                getSDKReferenceNumber = ((i12 & 35) + (i12 | 35)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: atd.av.getDeviceData$getDeviceData, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class EnumC0003getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ EnumC0003getDeviceData[] $VALUES;
        private static char AuthenticationRequestParameters;
        private static int BuildConfig;
        private static int ChallengeResult;
        public static final EnumC0003getDeviceData HORIZONTAL;
        public static final EnumC0003getDeviceData VERTICAL;
        private static char getDeviceData;
        private static char getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static int getSDKReferenceNumber;
        private static char getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, byte r8) {
            /*
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r1 = atd.av.getDeviceData.EnumC0003getDeviceData.$$a
                int r8 = r8 + 4
                int r6 = r6 * 3
                int r6 = 69 - r6
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L18
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r7
                goto L30
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r8 = r8 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L30:
                int r6 = -r6
                int r6 = r6 + r8
                r8 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.av.getDeviceData.EnumC0003getDeviceData.$$c(int, int, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKEphemeralPublicKey = 0;
            BuildConfig = 1;
            getSDKReferenceNumber = 0;
            ChallengeResult = 1;
            getSDKAppID();
            Object[] objArr = new Object[1];
            a("愗值⒳\ud9f5袨庾\ue316Ⲍ쇊堨", 10 - (Process.myPid() >> 22), objArr);
            HORIZONTAL = new EnumC0003getDeviceData(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a("㴱脪ꢊ鱤⭛䗽쇊堨", Color.alpha(0) + 8, objArr2);
            VERTICAL = new EnumC0003getDeviceData(((String) objArr2[0]).intern(), 1);
            $VALUES = getDeviceData();
            int i11 = getSDKEphemeralPublicKey + 111;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 23 / 0;
            }
        }

        private EnumC0003getDeviceData(String str, int i11) {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            int i13;
            int i14;
            Object obj = null;
            int i15 = 2;
            if (str != null) {
                int i16 = $11 + 85;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
            char[] cArr2 = new char[cArr.length];
            int i17 = 0;
            challengeResultCompleted.getDeviceData = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i18 = challengeResultCompleted.getDeviceData;
                if (i18 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                $11 = ($10 + 25) % 128;
                cArr3[i17] = cArr[i18];
                char c3 = 1;
                cArr3[1] = cArr[i18 + 1];
                int i19 = 58224;
                int i21 = i17;
                while (i21 < 16) {
                    $10 = ($11 + 61) % 128;
                    char c7 = cArr3[c3];
                    char c8 = cArr3[i17];
                    char c11 = c3;
                    int i22 = (c8 + i19) ^ ((c8 << 4) + ((char) (((long) getDeviceData) ^ 5320350835299930193L)));
                    int i23 = c8 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKAppID);
                        objArr2[i15] = Integer.valueOf(i23);
                        objArr2[c11] = Integer.valueOf(i22);
                        objArr2[i17] = Integer.valueOf(c7);
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(906025703);
                        Class cls = Integer.TYPE;
                        if (sDKTransactionID == null) {
                            int i24 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2827;
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int size = View.MeasureSpec.getSize(i17) + 27;
                            i14 = 906025703;
                            byte b8 = (byte) ($$b & 5);
                            i12 = i15;
                            byte b11 = (byte) (b8 - 1);
                            i13 = i17;
                            sDKTransactionID = ChallengeResult.getDeviceData(i24, packedPositionChild, size, -362226441, false, $$c(b8, b11, (byte) (b11 - 1)), new Class[]{cls, cls, cls, cls});
                        } else {
                            i12 = i15;
                            i13 = i17;
                            i14 = 906025703;
                        }
                        char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(obj, objArr2)).charValue();
                        cArr3[c11] = cCharValue;
                        char c12 = cArr3[i13];
                        int i25 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                        int i26 = cCharValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(getSDKTransactionID);
                        objArr3[i12] = Integer.valueOf(i26);
                        objArr3[c11] = Integer.valueOf(i25);
                        objArr3[i13] = Integer.valueOf(c12);
                        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i14);
                        if (sDKTransactionID2 == null) {
                            int i27 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2827;
                            int i28 = i13;
                            char cArgb = (char) Color.argb(i28, i28, i28, i28);
                            int i29 = 27 - (TypedValue.complexToFloat(i28) > 0.0f ? 1 : (TypedValue.complexToFloat(i28) == 0.0f ? 0 : -1));
                            byte b12 = (byte) ($$b & 5);
                            byte b13 = (byte) (b12 - 1);
                            sDKTransactionID2 = ChallengeResult.getDeviceData(i27, cArgb, i29, -362226441, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{cls, cls, cls, cls});
                        }
                        cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        i19 -= 40503;
                        i21++;
                        c3 = c11;
                        i15 = i12;
                        obj = null;
                        i17 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i31 = i15;
                char c13 = c3;
                int i32 = challengeResultCompleted.getDeviceData;
                cArr2[i32] = cArr3[0];
                cArr2[i32 + 1] = cArr3[c13];
                Object[] objArr4 = new Object[i31];
                objArr4[c13] = challengeResultCompleted;
                objArr4[0] = challengeResultCompleted;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-1859796622);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(3156 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (25798 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 28, 1296942946, false, $$c(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i15 = i31;
                obj = null;
                i17 = 0;
            }
        }

        private static /* synthetic */ EnumC0003getDeviceData[] getDeviceData() {
            int i11 = (getSDKReferenceNumber + 55) % 128;
            ChallengeResult = i11;
            EnumC0003getDeviceData[] enumC0003getDeviceDataArr = {HORIZONTAL, VERTICAL};
            getSDKReferenceNumber = (i11 + 37) % 128;
            return enumC0003getDeviceDataArr;
        }

        public static void getSDKAppID() {
            AuthenticationRequestParameters = (char) 37174;
            getSDKTransactionID = (char) 4131;
            getDeviceData = (char) 22331;
            getSDKAppID = (char) 24650;
        }

        public static void init$0() {
            $$a = new byte[]{36, 103, 52, 113};
            $$b = 219;
        }

        public static EnumC0003getDeviceData valueOf(String str) {
            int i11 = getSDKReferenceNumber + 39;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                return (EnumC0003getDeviceData) Enum.valueOf(EnumC0003getDeviceData.class, str);
            }
            Enum.valueOf(EnumC0003getDeviceData.class, str);
            throw null;
        }

        public static EnumC0003getDeviceData[] values() {
            getSDKReferenceNumber = (ChallengeResult + 45) % 128;
            EnumC0003getDeviceData[] enumC0003getDeviceDataArr = (EnumC0003getDeviceData[]) $VALUES.clone();
            getSDKReferenceNumber = (ChallengeResult + 13) % 128;
            return enumC0003getDeviceDataArr;
        }
    }

    static {
        int i11 = BuildConfig;
        int i12 = ((i11 & (-64)) | ((~i11) & 63)) + ((i11 & 63) << 1);
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 36 / 0;
        }
    }

    public getDeviceData(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.DividerView, i11, 0);
        try {
            int deviceData = getAdditionalDetails.getDeviceData();
            int deviceData2 = getAdditionalDetails.getDeviceData();
            getDeviceData(getAdditionalDetails.getDeviceData(), deviceData, new Object[]{this, typedArrayObtainStyledAttributes}, getAdditionalDetails.getDeviceData(), deviceData2, -1896188337, 1896188338);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        int dimension;
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 35;
        int i13 = (i11 ^ 35) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        ChallengeResult = i14 % 128;
        int i15 = i14 % 2;
        Resources resources = getdevicedata.getContext().getResources();
        if (i15 == 0) {
            dimension = (int) resources.getDimension(R.dimen.a3ds2_divider_thickness);
            int i16 = 36 / 0;
        } else {
            dimension = (int) resources.getDimension(R.dimen.a3ds2_divider_thickness);
        }
        int i17 = AuthenticationRequestParameters;
        ChallengeResult = ((i17 ^ 3) + ((i17 & 3) << 1)) % 128;
        return Integer.valueOf(dimension);
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = (~((~i15) | i16)) | (~(i15 | i12));
        int i18 = ~i16;
        int i19 = (~(i18 | i12)) | i15;
        int i21 = (~(i12 | i16)) | (~(i18 | (~i12))) | i15;
        int i22 = ((-1946157056) * i13) + (1335885824 * i11) + ((-1423441920) * i14) + ((-723770934) * i21) + ((-1447541868) * i19) + (723770934 * i17) + (24099949 * i15) + (((-699670985) * i16) - 818937856);
        int iC = a0.c(i13, -1840598144, ((-737137436) * i11) + i16 + i15 + i14);
        int i23 = i11 * (-1820396076);
        int i24 = i13 * 1320834432;
        int iE = a0.e(iC, -447283200, i24 + i23 + (i14 * 1252407325) + (i21 * 994) + (i19 * 1988) + (i17 * (-994)) + (i15 * 1252405337) + (i16 * 1252406331) + 1981669868, 1511325696, ((-1593638912) * iC) + i22);
        if (iE != 1) {
            return iE != 2 ? iE != 3 ? iE != 4 ? getDeviceData(objArr) : getSDKReferenceNumber(objArr) : getSDKTransactionID(objArr) : AuthenticationRequestParameters(objArr);
        }
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        TypedArray typedArray = (TypedArray) objArr[1];
        ChallengeResult = (AuthenticationRequestParameters + 29) % 128;
        getdevicedata.setColor(typedArray.getColor(R.styleable.DividerView_dividerColor, ((Integer) getDeviceData(getAdditionalDetails.getDeviceData(), getAdditionalDetails.getDeviceData(), new Object[]{getdevicedata}, getAdditionalDetails.getDeviceData(), getAdditionalDetails.getDeviceData(), -341428137, 341428137)).intValue()));
        getdevicedata.setThickness((int) typedArray.getDimension(R.styleable.DividerView_dividerThickness, ((Integer) getDeviceData(getAdditionalDetails.getDeviceData(), getAdditionalDetails.getDeviceData(), new Object[]{getdevicedata}, getAdditionalDetails.getDeviceData(), getAdditionalDetails.getDeviceData(), -1414514077, 1414514079)).intValue()));
        getdevicedata.setOrientation(EnumC0003getDeviceData.values()[typedArray.getInteger(R.styleable.DividerView_dividerOrientation, getSDKAppID.ordinal())]);
        int i25 = ChallengeResult;
        AuthenticationRequestParameters = ((i25 ^ 27) + ((i25 & 27) << 1)) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKReferenceNumber(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            atd.av.getDeviceData r1 = (atd.av.getDeviceData) r1
            r2 = 1
            r3 = r8[r2]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 2
            r8 = r8[r4]
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r5 = atd.av.getDeviceData.ChallengeResult
            int r5 = r5 + 107
            int r5 = r5 % 128
            atd.av.getDeviceData.AuthenticationRequestParameters = r5
            int r5 = r1.getSuggestedMinimumWidth()
            int r3 = android.view.View.getDefaultSize(r5, r3)
            int r5 = r1.getSuggestedMinimumHeight()
            int r8 = android.view.View.getDefaultSize(r5, r8)
            int r5 = r1.getSDKReferenceNumber
            if (r5 <= 0) goto L7d
            int r5 = atd.av.getDeviceData.AuthenticationRequestParameters
            r6 = r5 & 23
            r5 = r5 | 23
            int r5 = -r5
            int r5 = -r5
            r7 = r6 ^ r5
            r5 = r5 & r6
            int r5 = r5 << r2
            int r7 = r7 + r5
            int r5 = r7 % 128
            atd.av.getDeviceData.ChallengeResult = r5
            int r7 = r7 % r4
            if (r7 != 0) goto L59
            int[] r5 = atd.av.getDeviceData.AnonymousClass4.getDeviceData
            atd.av.getDeviceData$getDeviceData r6 = r1.getSDKTransactionID
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 86
            int r6 = r6 / r0
            if (r5 == r2) goto L7b
            if (r5 == r4) goto L68
            goto L7d
        L59:
            int[] r0 = atd.av.getDeviceData.AnonymousClass4.getDeviceData
            atd.av.getDeviceData$getDeviceData r5 = r1.getSDKTransactionID
            int r5 = r5.ordinal()
            r0 = r0[r5]
            if (r0 == r2) goto L7b
            if (r0 == r4) goto L68
            goto L7d
        L68:
            int r3 = r1.getSDKReferenceNumber
            int r0 = atd.av.getDeviceData.ChallengeResult
            r5 = r0 ^ 82
            r0 = r0 & 82
            int r0 = r0 << r2
            int r5 = r5 + r0
            r0 = r5 ^ (-1)
            int r0 = (-2) - r0
            int r0 = r0 % 128
            atd.av.getDeviceData.AuthenticationRequestParameters = r0
            goto L7d
        L7b:
            int r8 = r1.getSDKReferenceNumber
        L7d:
            r1.setMeasuredDimension(r3, r8)
            int r8 = atd.av.getDeviceData.AuthenticationRequestParameters
            r0 = r8 ^ 67
            r1 = r8 & 67
            r0 = r0 | r1
            int r0 = r0 << r2
            r1 = r8 & (-68)
            int r8 = ~r8
            r8 = r8 & 67
            r8 = r8 | r1
            int r0 = r0 - r8
            int r8 = r0 % 128
            atd.av.getDeviceData.ChallengeResult = r8
            int r0 = r0 % r4
            r8 = 0
            if (r0 == 0) goto L98
            return r8
        L98:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.av.getDeviceData.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & 45) + (i11 | 45);
        ChallengeResult = i12 % 128;
        int i13 = i12 % 2;
        EnumC0003getDeviceData enumC0003getDeviceData = getdevicedata.getSDKTransactionID;
        if (i13 != 0) {
            return enumC0003getDeviceData;
        }
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        Object[] objArr = {this, Integer.valueOf(i11), Integer.valueOf(i12)};
        getDeviceData(getAdditionalDetails.getDeviceData(), getAdditionalDetails.getDeviceData(), objArr, getAdditionalDetails.getDeviceData(), getAdditionalDetails.getDeviceData(), 628396204, -628396200);
    }

    public final void setColor(int i11) {
        int i12 = AuthenticationRequestParameters;
        int i13 = (i12 & 38) + (i12 | 38);
        ChallengeResult = ((i13 ^ (-1)) + (i13 << 1)) % 128;
        this.getDeviceData = i11;
        setBackgroundColor(i11);
        int i14 = AuthenticationRequestParameters + 51;
        ChallengeResult = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public final void setOrientation(EnumC0003getDeviceData enumC0003getDeviceData) {
        int i11 = ChallengeResult;
        int i12 = (i11 ^ 15) + ((i11 & 15) << 1);
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            this.getSDKTransactionID = enumC0003getDeviceData;
        } else {
            this.getSDKTransactionID = enumC0003getDeviceData;
            throw null;
        }
    }

    public final void setThickness(int i11) {
        int i12 = ChallengeResult;
        int iD = a0.d(((i12 ^ 37) | (i12 & 37)) << 1, ~(-(((~i12) & 37) | (i12 & (-38)))), 1, 128);
        AuthenticationRequestParameters = iD;
        this.getSDKReferenceNumber = i11;
        int i13 = iD + 43;
        ChallengeResult = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public getDeviceData(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getDeviceData(Context context) {
        this(context, null);
    }

    private void AuthenticationRequestParameters(TypedArray typedArray) {
        int deviceData = getAdditionalDetails.getDeviceData();
        int deviceData2 = getAdditionalDetails.getDeviceData();
        getDeviceData(getAdditionalDetails.getDeviceData(), deviceData, new Object[]{this, typedArray}, getAdditionalDetails.getDeviceData(), deviceData2, -1896188337, 1896188338);
    }

    private int AuthenticationRequestParameters() {
        int deviceData = getAdditionalDetails.getDeviceData();
        int deviceData2 = getAdditionalDetails.getDeviceData();
        return ((Integer) getDeviceData(getAdditionalDetails.getDeviceData(), deviceData, new Object[]{this}, getAdditionalDetails.getDeviceData(), deviceData2, -341428137, 341428137)).intValue();
    }

    private int getSDKReferenceNumber() {
        int deviceData = getAdditionalDetails.getDeviceData();
        int deviceData2 = getAdditionalDetails.getDeviceData();
        return ((Integer) getDeviceData(getAdditionalDetails.getDeviceData(), deviceData, new Object[]{this}, getAdditionalDetails.getDeviceData(), deviceData2, -1414514077, 1414514079)).intValue();
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        TypedValue typedValue = new TypedValue();
        getdevicedata.getContext().getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true);
        int i11 = typedValue.data;
        int i12 = ChallengeResult + 45;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            return Integer.valueOf(i11);
        }
        throw null;
    }

    public final EnumC0003getDeviceData getDeviceData() {
        int deviceData = getAdditionalDetails.getDeviceData();
        int deviceData2 = getAdditionalDetails.getDeviceData();
        return (EnumC0003getDeviceData) getDeviceData(getAdditionalDetails.getDeviceData(), deviceData, new Object[]{this}, getAdditionalDetails.getDeviceData(), deviceData2, -240153089, 240153092);
    }
}
