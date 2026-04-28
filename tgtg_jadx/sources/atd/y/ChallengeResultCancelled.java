package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/EndButtonBehaviour;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValid", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEndButtonBehaviour.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndButtonBehaviour.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/EndButtonBehaviour\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class ChallengeResultCancelled extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, int r8, byte r9) {
        /*
            int r8 = r8 + 65
            byte[] r0 = atd.y.ChallengeResultCancelled.$$a
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2a:
            int r8 = -r8
            int r8 = r8 + r9
            int r9 = r0 + 1
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultCancelled.$$d(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKAppID();
        ExpandableListView.getPackedPositionForGroup(0);
        View.MeasureSpec.getMode(0);
        new getSDKAppID((byte) 0);
        int i11 = getMessageVersion + 95;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeResultCancelled(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static boolean AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        b(Color.green(0) + 6, (byte) (15 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0017\u000f\u0011\u0002\u0007\t", objArr);
        boolean zE = new Regex(((String) objArr[0]).intern()).e(str);
        getSDKAppID = (getDeviceData + 21) % 128;
        return zE;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char c3;
        int i13;
        char c7;
        char c8;
        char c11;
        long j9;
        int i14;
        $11 = ($10 + 25) % 128;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 93) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        long j11 = 0;
        int i15 = 2;
        int i16 = 0;
        if (cArr2 != null) {
            $11 = ($10 + 115) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = $11 + 71;
                $10 = i18 % 128;
                if (i18 % i15 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
                        if (sDKTransactionID == null) {
                            j9 = j11;
                            byte b11 = (byte) 0;
                            i14 = i15;
                            byte b12 = b11;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2158 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (1 - (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1))), View.resolveSize(0, 0) + 36, 829471823, false, $$d(b11, b12, b12), new Class[]{cls});
                        } else {
                            j9 = j11;
                            i14 = i15;
                        }
                        cArr3[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    j9 = j11;
                    i14 = i15;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i17])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
                    if (sDKTransactionID2 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((Process.myTid() >> 22) + 2158, (char) ExpandableListView.getPackedPositionType(j9), Gravity.getAbsoluteGravity(0, 0) + 36, 829471823, false, $$d(b13, b14, b14), new Class[]{cls});
                    }
                    cArr3[i17] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i17++;
                }
                j11 = j9;
                i15 = i14;
            }
            cArr2 = cArr3;
        }
        long j12 = j11;
        int i19 = i15;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
        char c12 = '0';
        if (sDKTransactionID3 == null) {
            byte b15 = (byte) 0;
            byte b16 = b15;
            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0', 0) + 2159, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j12 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j12 ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > j12 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j12 ? 0 : -1)) + 37, 829471823, false, $$d(b15, b16, b16), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr[i12] - b8);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            $10 = ($11 + 101) % 128;
            while (true) {
                int i21 = challengeResultKt.getSDKReferenceNumber;
                if (i21 >= i12) {
                    break;
                }
                char c13 = cArr[i21];
                challengeResultKt.getDeviceData = c13;
                char c14 = cArr[i21 + 1];
                challengeResultKt.getSDKAppID = c14;
                if (c13 == c14) {
                    int i22 = $10 + 89;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        cArr4[i21] = (char) (c13 % b8);
                        cArr4[i21] = (char) (c14 >>> b8);
                    } else {
                        cArr4[i21] = (char) (c13 - b8);
                        cArr4[i21 + 1] = (char) (c14 - b8);
                    }
                    c11 = c12;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = challengeResultKt;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = challengeResultKt;
                    objArr5[9] = challengeResultKt;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = challengeResultKt;
                    objArr5[6] = challengeResultKt;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = challengeResultKt;
                    objArr5[3] = challengeResultKt;
                    objArr5[i19] = Integer.valueOf(cCharValue);
                    objArr5[1] = challengeResultKt;
                    objArr5[i16] = challengeResultKt;
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID4 == null) {
                        c3 = '\n';
                        int iLastIndexOf = TextUtils.lastIndexOf("", c12, i16, i16) + 1259;
                        c7 = '\t';
                        char cKeyCodeFromString = (char) (34414 - KeyEvent.keyCodeFromString(""));
                        int iLastIndexOf2 = 40 - TextUtils.lastIndexOf("", c12);
                        c8 = 7;
                        byte b17 = (byte) i16;
                        byte b18 = (byte) (b17 + 2);
                        i13 = i16;
                        String str$$d = $$d(b17, b18, (byte) (b18 - 2));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, cKeyCodeFromString, iLastIndexOf2, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = '\n';
                        i13 = i16;
                        c7 = '\t';
                        c8 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    int i23 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i23) {
                        $10 = ($11 + 27) % 128;
                        Object[] objArr6 = new Object[11];
                        objArr6[c3] = challengeResultKt;
                        objArr6[c7] = Integer.valueOf(cCharValue);
                        objArr6[8] = challengeResultKt;
                        objArr6[c8] = Integer.valueOf(cCharValue);
                        objArr6[6] = Integer.valueOf(cCharValue);
                        objArr6[5] = challengeResultKt;
                        objArr6[4] = challengeResultKt;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[i19] = Integer.valueOf(cCharValue);
                        objArr6[1] = challengeResultKt;
                        objArr6[i13] = challengeResultKt;
                        Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID5 == null) {
                            int i24 = i13;
                            int iIndexOf = 2223 - TextUtils.indexOf("", "", i24);
                            char cBlue = (char) (53070 - Color.blue(i24));
                            int iLastIndexOf3 = 20 - TextUtils.lastIndexOf("", '0', i24);
                            byte b19 = (byte) i24;
                            String str$$d2 = $$d(b19, (byte) (b19 | 57), b19);
                            Class cls3 = Integer.TYPE;
                            c11 = '0';
                            sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(iIndexOf, cBlue, iLastIndexOf3, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        } else {
                            c11 = '0';
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID5).invoke(null, objArr6)).intValue();
                        int i25 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i26 = challengeResultKt.getSDKReferenceNumber;
                        cArr4[i26] = cArr2[iIntValue2];
                        cArr4[i26 + 1] = cArr2[i25];
                    } else {
                        c11 = '0';
                        int i27 = challengeResultKt.AuthenticationRequestParameters;
                        int i28 = challengeResultKt.getSDKTransactionID;
                        int i29 = challengeResultKt.getMessageVersion;
                        if (i27 == i28) {
                            int iC = k.c(i29, cCharValue, 1, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i23, cCharValue, 1, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i31 = (i28 * cCharValue) + iC2;
                            int i32 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i32] = cArr2[(i27 * cCharValue) + iC];
                            cArr4[i32 + 1] = cArr2[i31];
                        } else {
                            int i33 = (i27 * cCharValue) + i23;
                            int i34 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i34] = cArr2[i33];
                            cArr4[i34 + 1] = cArr2[(i28 * cCharValue) + i29];
                        }
                        challengeResultKt.getSDKReferenceNumber += 2;
                        c12 = c11;
                        i16 = 0;
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c12 = c11;
                i16 = 0;
            }
        }
        for (int i35 = 0; i35 < i11; i35++) {
            cArr4[i35] = (char) (cArr4[i35] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{30882, 30888, 30895, 30898, 30855, 30884, 30965, 31583, 30875, 30894, 30883, 31581, 30967, 31582, 31580, 30887, 30889, 30900, 30966, 30873, 30877, 30899, 30964, 30896, 30963};
        getSDKReferenceNumber = (char) 19801;
    }

    public static void init$0() {
        $$a = new byte[]{60, 58, 23, -117};
        $$b = 39;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b(19 - TextUtils.indexOf("", "", 0, 0), (byte) (90 - TextUtils.indexOf((CharSequence) "", '0')), "\u000b\u0000\u0004\u000f\u0006\u0014㙉㙉\u0015\u0006\u000f\t\u000e\u0005\u0012\u0014\u0001\u0011㙃", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            int i11 = getSDKAppID + 103;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                AuthenticationRequestParameters(strAuthenticationRequestParameters);
                throw null;
            }
            if (!AuthenticationRequestParameters(strAuthenticationRequestParameters)) {
                strAuthenticationRequestParameters = null;
            }
            if (strAuthenticationRequestParameters != null) {
                int i12 = getDeviceData + 57;
                getSDKAppID = i12 % 128;
                int i13 = i12 % 2;
                DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
                if (i13 == 0) {
                    int i14 = 81 / 0;
                }
                return stringValueM164boximpl;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/EndButtonBehaviour$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultCancelled(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
