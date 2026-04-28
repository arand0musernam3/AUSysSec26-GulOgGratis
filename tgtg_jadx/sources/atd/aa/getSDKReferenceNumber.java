package atd.aa;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.exception.SDKRuntimeException;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getSDKReferenceNumber[] $VALUES;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    public static final getSDKReferenceNumber CHALLENGE_PRESENTATION_FAILURE;
    public static final getSDKReferenceNumber CRYPTO_FAILURE;
    private static long ChallengeResult;
    private static char[] ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    public static final getSDKReferenceNumber DEVICE_DATA_FAILURE;
    private static getSDKReferenceNumber SECURE_CHANNEL_SETUP_FAILURE;
    private static getSDKReferenceNumber UNKNOWN_DIRECTORY_SERVER;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static short[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String mErrorMessage;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = 106 - r8
            byte[] r0 = atd.aa.getSDKReferenceNumber.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKReferenceNumber.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCompleted = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString("") - 76462803, View.MeasureSpec.getMode(0) - 73, 1401665783 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (KeyEvent.getMaxKeyCode() >> 16), (short) (TextUtils.indexOf((CharSequence) "", '0') - 93), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((-76462803) - View.MeasureSpec.makeMeasureSpec(0, 0), (-72) - KeyEvent.normalizeMetaState(0), 1401665812 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) Color.blue(0), (short) (MotionEvent.axisFromString("") - 49), objArr2);
        CHALLENGE_PRESENTATION_FAILURE = new getSDKReferenceNumber(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 76462803, (-89) - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1401665842, (byte) Color.green(0), (short) ((-103) - ImageFormat.getBitsPerPixel(0)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b((char) (3863 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, View.resolveSizeAndState(0, 0, 0), objArr4);
        CRYPTO_FAILURE = new getSDKReferenceNumber(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((-93240018) - Color.rgb(0, 0, 0), (-83) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1401665855 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-16) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
        DEVICE_DATA_FAILURE = new getSDKReferenceNumber(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a((-76462787) - Color.red(0), (-75) - (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1401665872, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 59), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((Process.myTid() >> 22) - 76462787, (-75) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1401665901 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (short) ((-70) - KeyEvent.keyCodeFromString("")), objArr8);
        SECURE_CHANNEL_SETUP_FAILURE = new getSDKReferenceNumber(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 76462785, TextUtils.indexOf((CharSequence) "", '0', 0) - 78, 1401665927 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) KeyEvent.keyCodeFromString(""), (short) (121 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 25 - Color.red(0), 41 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
        UNKNOWN_DIRECTORY_SERVER = new getSDKReferenceNumber(strIntern5, 4, ((String) objArr10[0]).intern());
        $VALUES = getSDKAppID();
        int i11 = ChallengeResultCompleted + 63;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 87 / 0;
        }
    }

    private getSDKReferenceNumber(String str, int i11, String str2) {
        this.mErrorMessage = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b A[PHI: r3
      0x019b: PHI (r3v10 int) = (r3v9 int), (r3v70 int) binds: [B:44:0x0199, B:41:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e A[PHI: r3
      0x019e: PHI (r3v67 int) = (r3v9 int), (r3v70 int) binds: [B:44:0x0199, B:41:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r27, int r28, int r29, byte r30, short r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKReferenceNumber.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x013d, code lost:
    
        r4[r7] = (char) r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0143, code lost:
    
        r0 = new java.lang.Object[2];
        r0[1] = r1;
        r0[r3] = r1;
        r1 = atd.e.ChallengeResult.getSDKTransactionID(464282390);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x014d, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x014f, code lost:
    
        r1 = (byte) (-1);
        r2 = (byte) (r1 + 1);
        r1 = atd.e.ChallengeResult.getDeviceData((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2646, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(r3)), 25 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -943430394, false, $$c(r1, r2, (byte) (r2 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x017e, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0183, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKReferenceNumber.b(char, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ getSDKReferenceNumber[] getSDKAppID() {
        int i11 = getSDKEphemeralPublicKey;
        getSDKReferenceNumber[] getsdkreferencenumberArr = {CHALLENGE_PRESENTATION_FAILURE, CRYPTO_FAILURE, DEVICE_DATA_FAILURE, SECURE_CHANNEL_SETUP_FAILURE, UNKNOWN_DIRECTORY_SERVER};
        BuildConfig = (i11 + 43) % 128;
        return getsdkreferencenumberArr;
    }

    public static void getSDKReferenceNumber() {
        getSDKTransactionID = -1659350230;
        getDeviceData = 829166660;
        getSDKReferenceNumber = 904048437;
        AuthenticationRequestParameters = new byte[]{114, 120, 68, 66, 69, 122, 102, 76, 126, 71, 112, 82, 104, 71, 68, 115, 79, 114, 67, 108, 91, ByteCompanionObject.MAX_VALUE, 116, 68, 116, 125, 74, 116, 64, -40, 6, 12, 24, 22, 25, 14, 91, -57, 18, 27, 4, 102, 60, 27, 24, 7, 99, 6, 23, -95, -50, 19, 8, 24, 8, 17, 30, 8, 116, 122, 64, 76, 74, 77, 66, 110, 85, 66, 73, 126, 78, 86, 32, 46, 58, 48, 59, 40, -44, 13, -34, 0, 46, -42, 9, 49, 41, 32, 2, 50, 13, 27, 103, 29, 96, 21, 1, 105, 21, 31, 105, 14, 12, 109, 97, 17, 24, 107, 23, 99, 60, 118, 13, 27, 110, 26, 14, 44, 26, 96, 108, 106, 109, 98, -81, -43, 98, 100, 118, 27, -70, -39, 110, 30, 101, 112, 28, 104, -86, 34, 26, 96, 123, 103, 123, -74, 84, -81, -74, 89, 95, -83, -84, -88, -96, -70, -91, 88, -78, -82, 78, -70, 92, -77, -86, -88, -90, -94, 35, 35, 35, 35, 35, 35, 35};
        ChallengeResultCancelled = new char[]{64341, 18694, 40875, 60480, 13034, 32915, 54589, 7114, 26727, 48660, 3242, 20809, 42989, 62924, 14892, 35017, 56671, 9208, 29063, 50722, 5339, 22834, 62538, 17929, 37052, 58177, 15845, 36737, 55906, 5316, 26495, 45320, 955, 24088, 43248, 64149, 13627, 34780, 53851, 11518, 32399, 51558, 62555, 17922, 37025, 58182, 15849, 36755, 55852, 5248, 26490, 45333, 936, 24157, 43253, 64128, 13629, 34754, 53847, 11436, 32409, 51501, 7124, 22130, 40967, 62130, 19728};
        ChallengeResult = 4181251681426032236L;
    }

    public static void init$0() {
        $$a = new byte[]{11, -110, -81, 44};
        $$b = 183;
    }

    public static getSDKReferenceNumber valueOf(String str) {
        getSDKEphemeralPublicKey = (BuildConfig + 15) % 128;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) Enum.valueOf(getSDKReferenceNumber.class, str);
        BuildConfig = (getSDKEphemeralPublicKey + 41) % 128;
        return getsdkreferencenumber;
    }

    public static getSDKReferenceNumber[] values() {
        BuildConfig = (getSDKEphemeralPublicKey + 15) % 128;
        getSDKReferenceNumber[] getsdkreferencenumberArr = (getSDKReferenceNumber[]) $VALUES.clone();
        BuildConfig = (getSDKEphemeralPublicKey + 45) % 128;
        return getsdkreferencenumberArr;
    }

    public final SDKRuntimeException AuthenticationRequestParameters() {
        SDKRuntimeException sDKRuntimeException = new SDKRuntimeException(this.mErrorMessage, null, null);
        int i11 = BuildConfig + 51;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKRuntimeException;
        }
        throw null;
    }

    public final SDKRuntimeException getDeviceData() {
        BuildConfig = (getSDKEphemeralPublicKey + 77) % 128;
        SDKRuntimeException sDKRuntimeExceptionAuthenticationRequestParameters = AuthenticationRequestParameters();
        BuildConfig = (getSDKEphemeralPublicKey + 57) % 128;
        return sDKRuntimeExceptionAuthenticationRequestParameters;
    }
}
