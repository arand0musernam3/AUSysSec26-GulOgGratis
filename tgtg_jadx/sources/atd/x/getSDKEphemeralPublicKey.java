package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledInputMethods;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnabledInputMethods.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnabledInputMethods.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledInputMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1557#2:45\n1628#2,3:46\n774#2:49\n865#2,2:50\n774#2:53\n865#2,2:54\n1#3:52\n*S KotlinDebug\n*F\n+ 1 EnabledInputMethods.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledInputMethods\n*L\n26#1:45\n26#1:46,3\n27#1:49\n27#1:50,2\n34#1:53\n34#1:54,2\n*E\n"})
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int[] getSDKTransactionID;

    @NotNull
    private final Application getSDKAppID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, byte r8, short r9) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = atd.x.getSDKEphemeralPublicKey.$$a
            int r7 = 114 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L13:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = r7 + r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKEphemeralPublicKey.$$d(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarFadeDuration();
        new AuthenticationRequestParameters((byte) 0);
        int i11 = ChallengeResult + 107;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getSDKEphemeralPublicKey(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = application;
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = new int[]{-562333211, -1945974263, -405782050, 246922233, 2143798647, -1908347395, -1836349310, -1491707985, 522933340, -1980762951, -1266839474, 1290073487, -858010379, -771833362, 587284149, 1344169307, -1344349028, -1672260551};
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] cArr;
        int[] iArr2;
        int i14;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i15 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i16 = 16;
        int i17 = 0;
        if (iArr3 != null) {
            $10 = ($11 + 69) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i18 = 0;
            i12 = 53070;
            while (i18 < length) {
                int i19 = $11 + 65;
                int i21 = i15;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            int iCombineMeasuredStates = 2223 - View.combineMeasuredStates(i17, i17);
                            char scrollBarFadeDuration = (char) (53070 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int iGreen = Color.green(i17) + 21;
                            i14 = i16;
                            byte b8 = (byte) i17;
                            byte b11 = (byte) (b8 - 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iCombineMeasuredStates, scrollBarFadeDuration, iGreen, 1089703072, false, $$d(b8, b11, (byte) (b11 + 1)), new Class[]{cls});
                        } else {
                            i14 = i16;
                        }
                        iArr4[i18] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i14 = i16;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i18])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2223 - Drawable.resolveOpacity(0, 0), (char) (Gravity.getAbsoluteGravity(0, 0) + 53070), 20 - TextUtils.indexOf((CharSequence) "", '0'), 1089703072, false, $$d(b12, b13, (byte) (b13 + 1)), new Class[]{cls});
                    }
                    iArr4[i18] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i18++;
                }
                i15 = i21;
                i16 = i14;
                i17 = 0;
            }
            iArr3 = iArr4;
        } else {
            i12 = 53070;
        }
        int i22 = i15;
        int i23 = i16;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKTransactionID;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i24 = 0;
            while (i24 < length3) {
                $11 = ($10 + 39) % 128;
                Object[] objArr4 = {Integer.valueOf(iArr6[i24])};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID3 == null) {
                    cArr = cArr2;
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    iArr2 = iArr6;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2223 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (i12 - KeyEvent.normalizeMetaState(0)), 21 - (ViewConfiguration.getScrollBarSize() >> 8), 1089703072, false, $$d(b14, b15, (byte) (b15 + 1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i24] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i24++;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        char c7 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i25 = getmessageversion.getSDKAppID;
            if (i25 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i26 = iArr[i25];
            char c8 = (char) (i26 >> 16);
            cArr4[c7] = c8;
            char c11 = (char) i26;
            char c12 = 1;
            cArr4[1] = c11;
            char c13 = (char) (iArr[i25 + 1] >> 16);
            cArr4[i22] = c13;
            char c14 = (char) iArr[i25 + 1];
            cArr4[3] = c14;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i27 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i27 >= i23) {
                    break;
                }
                int i28 = i13 ^ iArr5[i27];
                getmessageversion.getDeviceData = i28;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i28);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i22] = getmessageversion;
                objArr5[c12] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    int offsetBefore = 2386 - TextUtils.getOffsetBefore("", 0);
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int maxKeyCode = 19 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b16 = (byte) ($$b & 2);
                    byte b17 = (byte) (b16 - 3);
                    c3 = c12;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(offsetBefore, tapTimeout, maxKeyCode, -2040903174, false, $$d(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c3 = c12;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i27++;
                c12 = c3;
                i23 = 16;
            }
            char c15 = c12;
            int i29 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i29;
            getmessageversion.AuthenticationRequestParameters = i13;
            i23 = 16;
            int i31 = i13 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i31;
            int i32 = i29 ^ iArr5[17];
            getmessageversion.getDeviceData = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[c15] = (char) i32;
            cArr4[i22] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i33 = getmessageversion.getSDKAppID;
            cArr3[i33 * 2] = cArr4[0];
            cArr3[(i33 * 2) + 1] = cArr4[c15];
            cArr3[(i33 * 2) + 2] = cArr4[i22];
            cArr3[(i33 * 2) + 3] = cArr4[3];
            int i34 = i22;
            Object[] objArr6 = new Object[i34];
            objArr6[c15] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                int absoluteGravity = 1861 - Gravity.getAbsoluteGravity(0, 0);
                char cMyTid = (char) (Process.myTid() >> 22);
                int iMakeMeasureSpec = 40 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b18 = (byte) ($$b & 1);
                byte b19 = (byte) (-b18);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(absoluteGravity, cMyTid, iMakeMeasureSpec, -562771681, false, $$d(b18, b19, (byte) (b19 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i22 = i34;
            c7 = 0;
        }
    }

    private final InputMethodManager getSDKTransactionID() throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 99) % 128;
        Application application = this.getSDKAppID;
        Object[] objArr = new Object[1];
        b(new int[]{1739167246, -557983872, -1868823987, -1151207360, 437726095, -491532899}, 12 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        getDeviceData = (AuthenticationRequestParameters + 73) % 128;
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{47, 95, 67, 92};
        $$b = 159;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        List listS;
        if (Build.VERSION.SDK_INT >= 34) {
            InputMethodManager sDKTransactionID = getSDKTransactionID();
            if (sDKTransactionID != null) {
                AuthenticationRequestParameters = (getDeviceData + 79) % 128;
                List<InputMethodInfo> enabledInputMethodList = sDKTransactionID.getEnabledInputMethodList();
                if (enabledInputMethodList != null) {
                    ArrayList arrayList = new ArrayList(e0.o(enabledInputMethodList, 10));
                    Iterator<T> it = enabledInputMethodList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InputMethodInfo) it.next()).getId());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        AuthenticationRequestParameters = (getDeviceData + 71) % 128;
                        String str = (String) obj;
                        str.getClass();
                        if (!StringsKt.H(str)) {
                            AuthenticationRequestParameters = (getDeviceData + 29) % 128;
                            arrayList2.add(obj);
                        }
                    }
                    return DeviceParameterResult.Success.StringsListValue.m171boximpl(DeviceParameterResult.Success.StringsListValue.m172constructorimpl(arrayList2));
                }
            }
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        b(new int[]{468564127, 338390286, -1810310454, -202548581, 1739167246, -557983872, -1868823987, -1151207360, 437726095, -491532899, -1340273039, -1287466300}, 21 - TextUtils.getTrimmedLength(""), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null || (listS = StringsKt.S(strAuthenticationRequestParameters, new char[]{':'}, 6)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        ArrayList arrayList3 = new ArrayList();
        getDeviceData = (AuthenticationRequestParameters + 63) % 128;
        for (Object obj2 : listS) {
            AuthenticationRequestParameters = (getDeviceData + 39) % 128;
            if (!StringsKt.H((String) obj2)) {
                int i11 = AuthenticationRequestParameters + 61;
                getDeviceData = i11 % 128;
                if (i11 % 2 != 0) {
                    arrayList3.add(obj2);
                    throw null;
                }
                arrayList3.add(obj2);
            }
        }
        return DeviceParameterResult.Success.StringsListValue.m171boximpl(DeviceParameterResult.Success.StringsListValue.m172constructorimpl(arrayList3));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledInputMethods$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
