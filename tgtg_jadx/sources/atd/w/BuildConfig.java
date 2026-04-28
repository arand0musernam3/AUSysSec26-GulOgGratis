package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsTtyModeSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telecom/TelecomManager;", "", "isTtySupportedByDevice", "(Landroid/telecom/TelecomManager;)Z", "areAnyReadPhoneStatePermissionsGranted", "()Z", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIsTtyModeSupported.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsTtyModeSupported.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsTtyModeSupported\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class BuildConfig extends InitializeResultSuccess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 99 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = atd.w.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r6
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = r6 + r1
            int r8 = r8 + 1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.BuildConfig.$$d(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKAppID();
        ViewConfiguration.getWindowTouchSlop();
        new getSDKAppID((byte) 0);
        AuthenticationRequestParameters = (ChallengeResult + 1) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private BuildConfig(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
        this.getSDKTransactionID = application;
    }

    private final boolean AuthenticationRequestParameters() throws Throwable {
        getSDKAppID = (getDeviceData + 67) % 128;
        if (getSDKEphemeralPublicKey()) {
            return true;
        }
        int i11 = getDeviceData + 107;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return getTransactionStatus();
        }
        getTransactionStatus();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.BuildConfig.b(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber = -840908854811762372L;
    }

    public static void init$0() {
        $$a = new byte[]{116, -8, -122, 111};
        $$b = 172;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        TelecomManager telecomManager;
        getDeviceData = (getSDKAppID + 63) % 128;
        Boolean boolValueOf = null;
        if (Build.VERSION.SDK_INT < 28) {
            TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
            if (telephonyManagerChallengeResult != null) {
                boolValueOf = Boolean.valueOf(telephonyManagerChallengeResult.isTtyModeSupported());
            }
        } else {
            if (!AuthenticationRequestParameters()) {
                DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
                getDeviceData = (getSDKAppID + 27) % 128;
                return failure;
            }
            Application application = this.getSDKTransactionID;
            Object[] objArr = new Object[1];
            b("\uf8a0鎴⺲릾咣\uefa2窧", 27396 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            Object systemService = application.getSystemService(((String) objArr[0]).intern());
            if (systemService instanceof TelecomManager) {
                getSDKAppID = (getDeviceData + 39) % 128;
                telecomManager = (TelecomManager) systemService;
            } else {
                telecomManager = null;
            }
            if (telecomManager != null) {
                int i11 = getDeviceData + 85;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    getSDKReferenceNumber(telecomManager);
                    throw null;
                }
                boolValueOf = Boolean.valueOf(getSDKReferenceNumber(telecomManager));
            }
        }
        return boolValueOf != null ? a0.h(boolValueOf) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsTtyModeSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static long getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, byte r7, int r8) {
            /*
                int r6 = r6 * 2
                int r6 = r6 + 98
                byte[] r0 = atd.w.BuildConfig.getSDKAppID.$$c
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r8 = r8 + r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.BuildConfig.getSDKAppID.$$e(int, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKTransactionID = 1;
            getSDKReferenceNumber = 8383283896525920649L;
            AuthenticationRequestParameters = 711855356;
        }

        private getSDKAppID() {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            if (str != null) {
                charArray = str.toCharArray();
                $11 = ($10 + 47) % 128;
            } else {
                charArray = str;
            }
            atd.bb.completed completedVar = new atd.bb.completed();
            char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
            completedVar.getSDKTransactionID = 4;
            while (true) {
                int i12 = completedVar.getSDKTransactionID;
                if (i12 >= sDKTransactionID.length) {
                    objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                    return;
                }
                $10 = ($11 + 63) % 128;
                int i13 = i12 - 4;
                completedVar.getSDKAppID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKReferenceNumber)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2774;
                        char packedPositionType = (char) (13060 - ExpandableListView.getPackedPositionType(0L));
                        int packedPositionGroup = 25 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b8 = (byte) 0;
                        String str$$e = $$e($$c[0], b8, (byte) (b8 - 1));
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(scrollBarFadeDuration, packedPositionType, packedPositionGroup, -1416626223, false, str$$e, new Class[]{cls, cls, cls});
                    }
                    sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr3);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r27, int r28, java.lang.String r29, int r30, boolean r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.BuildConfig.getSDKAppID.b(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = 122 - r8
                int r0 = 19 - r6
                byte[] r1 = atd.w.BuildConfig.getSDKAppID.$$a
                int r7 = 25 - r7
                byte[] r0 = new byte[r0]
                int r6 = 18 - r6
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r7
                goto L2b
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L24:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L2b:
                int r1 = r1 + r7
                int r7 = r1 + (-11)
                int r8 = r8 + 1
                r1 = r8
                r8 = r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.BuildConfig.getSDKAppID.c(byte, byte, byte, java.lang.Object[]):void");
        }

        public static int getSDKTransactionID(List list) throws Throwable {
            long j9;
            int i11;
            char c3;
            char c7;
            char c8;
            char c11;
            int i12;
            Method method;
            Object[] objArr = new Object[1];
            a("ᝐ⽜ᜱ煯♜끩侽\uf83f橓㏲촩紏\uedeb딀䢏ﻁ潱㢭쟡瀧\ue290먺䔧\uf5cd搭㵈샖眐\ue7bfꃚ帜\ue8a4竊≲\udda2樼ﱂ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            Class<?> cls = Class.forName(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("⽊畮⼭ꐢ\ued76\uea50髠㌷則槊ᡫ뙪헵\uef38鷥㗱坨択", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Class cls2 = Integer.TYPE;
            Method method2 = cls.getMethod(strIntern, String.class, cls2);
            Object[] objArr3 = new Object[1];
            b(26 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getTapTimeout() >> 16) + 158, "\u0000\ufffe￭\u000b\f\u0006\u0011\ufffe\u0000\u0006\t\r\r\uffdeￋ\r\r\ufffeￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\u000f\u0002\u0004\ufffe\u000b\ufffe￪\u0002\u0004\ufffe\b", 37 - (ViewConfiguration.getTouchSlop() >> 8), true, objArr3);
            Class<?> cls3 = Class.forName(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a("⽊畮⼭ꐢ\ued76\uea50髠㌷則槊ᡫ뙪헵\uef38鷥㗱坨択", 1 - View.getDefaultSize(0, 0), objArr4);
            Method[] methodArr = {method2, cls3.getMethod(((String) objArr4[0]).intern(), String.class, cls2)};
            int i13 = -1866647183;
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1866647183);
            char c12 = 27;
            char c13 = 17;
            if (sDKTransactionID == null) {
                int doubleTapTimeout = 2774 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                char packedPositionChild = (char) (13059 - ExpandableListView.getPackedPositionChild(0L));
                int absoluteGravity = 25 - Gravity.getAbsoluteGravity(0, 0);
                byte b8 = $$a[17];
                j9 = 0;
                Object[] objArr5 = new Object[1];
                c(b8, (byte) (b8 | 21), r8[27], objArr5);
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout, packedPositionChild, absoluteGravity, 1289043809, false, (String) objArr5[0], null);
            } else {
                j9 = 0;
            }
            String string = null;
            char c14 = '0';
            if (((Field) sDKTransactionID).get(null) == null) {
                Method[] declaredMethods = ((Class) atd.e.ChallengeResult.AuthenticationRequestParameters(2774 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13060), (ViewConfiguration.getTouchSlop() >> 8) + 25)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i14 = 0;
                while (i14 < length) {
                    i11 = i13;
                    Method method3 = declaredMethods[i14];
                    try {
                        c11 = '\r';
                        c3 = c12;
                        Object[] objArr6 = new Object[1];
                        b(View.resolveSize(0, 0) + 21, View.MeasureSpec.getSize(0) + 155, "\u0001ￎ\f\u0001\u000e\u0007ￎ\u0012\u0005\u0006\f\u0005\u0003\u0014ￎ￭\u0005\u0014\b\u000f\u0004\n\u0001\u0016", 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, objArr6);
                        Class<?> cls4 = Class.forName(((String) objArr6[0]).intern());
                        c7 = c13;
                        Object[] objArr7 = new Object[1];
                        b(TextUtils.indexOf("", c14) + 7, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 163, "\u0001\ufffe\u0001�\n\u000b\uffff�\f￥\u0007￼", ImageFormat.getBitsPerPixel(0) + 13, false, objArr7);
                        Object[] objArr8 = {Integer.valueOf(((Integer) cls4.getMethod(((String) objArr7[0]).intern(), null).invoke(method3, null)).intValue())};
                        Object[] objArr9 = new Object[1];
                        b(6 - (ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)), 156 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0003\b\u0005\b\u0004\u0011\t\u0000\u0015\u0000ￍ\u000b\u0000\r\u0006ￍ\u0011\u0004\u0005\u000b\u0004\u0002\u0013ￍ￬\u000e", ((byte) KeyEvent.getModifierMetaStateMask()) + 27, false, objArr9);
                        Class<?> cls5 = Class.forName(((String) objArr9[0]).intern());
                        c8 = c14;
                        Object[] objArr10 = new Object[1];
                        a("ᬁሮ᭨\u1ae1ǀ贆␙\udfb0昙\u0e80ꚵ嫘", ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr10);
                        if (((Boolean) cls5.getMethod(((String) objArr10[0]).intern(), cls2).invoke(null, objArr8)).booleanValue()) {
                            Object[] objArr11 = new Object[1];
                            b(21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 155 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0001ￎ\f\u0001\u000e\u0007ￎ\u0012\u0005\u0006\f\u0005\u0003\u0014ￎ￭\u0005\u0014\b\u000f\u0004\n\u0001\u0016", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, false, objArr11);
                            Class<?> cls6 = Class.forName(((String) objArr11[0]).intern());
                            Object[] objArr12 = new Object[1];
                            b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, 165 - View.resolveSize(0, 0), "\n\u000b\b\u0004￪\u000f\u0006\ufffb�\ufffb\n￨\ufffb", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, false, objArr12);
                            Object objInvoke = cls6.getMethod(((String) objArr12[0]).intern(), null).invoke(method3, null);
                            Class cls7 = Long.TYPE;
                            if (cls7.equals(objInvoke)) {
                                Object[] objArr13 = new Object[1];
                                b(22 - (SystemClock.elapsedRealtimeNanos() > j9 ? 1 : (SystemClock.elapsedRealtimeNanos() == j9 ? 0 : -1)), 155 - (ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)), "\u0001ￎ\f\u0001\u000e\u0007ￎ\u0012\u0005\u0006\f\u0005\u0003\u0014ￎ￭\u0005\u0014\b\u000f\u0004\n\u0001\u0016", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, false, objArr13);
                                Class<?> cls8 = Class.forName(((String) objArr13[0]).intern());
                                Object[] objArr14 = new Object[1];
                                b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, TextUtils.indexOf("", "", 0, 0) + 163, "\n￬\u0011\b�\u000b\uffff�\f￨\ufff9\n\ufff9\u0005�\f�", TextUtils.indexOf("", "") + 17, false, objArr14);
                                Object[] objArr15 = (Object[]) cls8.getMethod(((String) objArr14[0]).intern(), null).invoke(method3, null);
                                if (objArr15.length == 2 && cls7.equals(objArr15[0])) {
                                    Object[] objArr16 = new Object[1];
                                    b((ViewConfiguration.getScrollBarSize() >> 8) + 21, 154 - (ExpandableListView.getPackedPositionForChild(0, 0) > j9 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j9 ? 0 : -1)), "\u0001ￎ\f\u0001\u000e\u0007ￎ\u0012\u0005\u0006\f\u0005\u0003\u0014ￎ￭\u0005\u0014\b\u000f\u0004\n\u0001\u0016", 23 - ExpandableListView.getPackedPositionChild(j9), false, objArr16);
                                    if (Class.forName(((String) objArr16[0]).intern()).equals(objArr15[1])) {
                                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i11);
                                        if (sDKTransactionID2 == null) {
                                            int mirror = 2822 - AndroidCharacter.getMirror(c8);
                                            char cMyTid = (char) ((Process.myTid() >> 22) + 13060);
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 25;
                                            byte b11 = $$a[c7];
                                            Object[] objArr17 = new Object[1];
                                            c(b11, (byte) (b11 | 21), r10[c3], objArr17);
                                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(mirror, cMyTid, iResolveSizeAndState, 1289043809, false, (String) objArr17[0], null);
                                        }
                                        ((Field) sDKTransactionID2).set(null, method3);
                                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i11);
                                        if (sDKTransactionID3 == null) {
                                            int iAlpha = Color.alpha(0) + 2774;
                                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 13060);
                                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 25;
                                            byte b12 = $$a[c7];
                                            Object[] objArr18 = new Object[1];
                                            c(b12, (byte) (b12 | 21), r8[c3], objArr18);
                                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iAlpha, cIndexOf, longPressTimeout, 1289043809, false, (String) objArr18[0], null);
                                        }
                                        try {
                                            Object[] objArr19 = {Long.valueOf(j9), ((Field) sDKTransactionID3).get(null)};
                                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1314787788);
                                            if (sDKTransactionID4 == null) {
                                                int gidForName = 2773 - Process.getGidForName("");
                                                char c15 = (char) (13060 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                int iGreen = 25 - Color.green(0);
                                                byte[] bArr = $$a;
                                                Object[] objArr20 = new Object[1];
                                                c(bArr[13], (byte) 3, bArr[c7], objArr20);
                                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(gidForName, c15, iGreen, -1841948708, false, (String) objArr20[0], new Class[]{cls7, Method.class});
                                            }
                                            ((Long) ((Method) sDKTransactionID4).invoke(null, objArr19)).getClass();
                                            getDeviceData = (getSDKTransactionID + 115) % 128;
                                        } catch (Throwable th2) {
                                            Throwable cause = th2.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i14++;
                        i13 = i11;
                        c14 = c8;
                        c12 = c3;
                        c13 = c7;
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                i11 = i13;
                c3 = c12;
                c7 = c13;
                c8 = c14;
                c11 = '\r';
            } else {
                i11 = i13;
                c3 = c12;
                c7 = c13;
                c8 = c14;
                c11 = '\r';
            }
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(i11);
            if (sDKTransactionID5 == null) {
                int gidForName2 = Process.getGidForName("") + 2775;
                char c16 = (char) (13060 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int edgeSlop = 25 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b13 = $$a[c7];
                Object[] objArr21 = new Object[1];
                c(b13, (byte) (b13 | 21), r8[c3], objArr21);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(gidForName2, c16, edgeSlop, 1289043809, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = {((Field) sDKTransactionID5).get(null)};
            Object sDKTransactionID6 = atd.e.ChallengeResult.getSDKTransactionID(-820980419);
            if (sDKTransactionID6 == null) {
                int iIndexOf = 2774 - TextUtils.indexOf("", "", 0);
                char c17 = (char) (13060 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25;
                byte b14 = $$a[18];
                byte b15 = (byte) (b14 & 7);
                Object[] objArr23 = new Object[1];
                c(b14, b15, (byte) (b15 | 20), objArr23);
                sDKTransactionID6 = atd.e.ChallengeResult.getDeviceData(iIndexOf, c17, scrollBarFadeDuration, 326685485, false, (String) objArr23[0], new Class[]{Object.class});
            }
            ((Method) sDKTransactionID6).invoke(null, objArr22);
            Object[] objArr24 = {0, methodArr, null};
            Object sDKTransactionID7 = atd.e.ChallengeResult.getSDKTransactionID(923113519);
            if (sDKTransactionID7 == null) {
                int size = 3183 - View.MeasureSpec.getSize(0);
                char cMyPid = (char) ((Process.myPid() >> 22) + 23761);
                int iLastIndexOf = TextUtils.lastIndexOf("", c8, 0, 0) + 21;
                byte[] bArr2 = $$a;
                Object[] objArr25 = new Object[1];
                c((byte) (bArr2[c11] - 1), bArr2[c7], (byte) (-bArr2[14]), objArr25);
                sDKTransactionID7 = atd.e.ChallengeResult.getDeviceData(size, cMyPid, iLastIndexOf, -345137601, false, (String) objArr25[0], new Class[]{cls2, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) sDKTransactionID7).invoke(null, objArr24)).longValue();
            long j11 = 1406634576;
            long j12 = -919;
            long j13 = 920;
            long j14 = -1;
            long j15 = j11 ^ j14;
            long j16 = jLongValue ^ j14;
            long j17 = j15 | j16;
            long jA = a0.a();
            long j18 = jA ^ j14;
            long j19 = (j13 * (((jA | (j16 | j11)) ^ j14) | ((j17 | j18) ^ j14) | (((jLongValue | j15) | jA) ^ j14))) + (((j17 ^ j14) | ((j15 | j18) ^ j14)) * j13) + ((((j17 | jA) ^ j14) | (((j16 | j18) | j11) ^ j14)) * j13) + (j12 * jLongValue) + (j12 * j11) + ((long) (-1586248213));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i15 = ~iFreeMemory;
            int i16 = (((int) (j19 >> 32)) & ((((~(iFreeMemory | (-134252553))) | (~((-1379078727) | i15)) | 34669120) * 140) + (((~((-1478662159) | i15)) | 134252552) * (-280)) + ((((-1478662159) | iFreeMemory) * 140) - 946690242))) | (((int) j19) & ((((~((~a0.a()) | (-887982291))) | (-340870150)) * 494) + ((((-339804161) | r3) * 494) - 551096361)));
            int i17 = i16 >>> 24;
            int i18 = i16 & 16777215;
            boolean z11 = i17 != 0;
            if (z11) {
                i12 = 1;
            } else {
                getDeviceData = (getSDKTransactionID + 85) % 128;
                i12 = 0;
            }
            if (z11 && i18 < 2 && (method = methodArr[i18]) != null) {
                string = method.toString();
                getSDKTransactionID = (getDeviceData + 117) % 128;
            }
            list.add(string);
            return (i17 + 6) * i12;
        }

        public static void init$0() {
            $$a = new byte[]{95, 99, -67, 61, 9, 26, -22, -4, 18, 20, 41, -6, 24, 16, -7, 13, 28, 0, 17, 10, -26, 6, -32, 34, -41, 0, 18, 19};
            $$b = 76;
        }

        public static void init$1() {
            $$c = new byte[]{11, -110, -81, 44};
            $$d = 226;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static boolean getSDKReferenceNumber(TelecomManager telecomManager) {
        int i11 = getDeviceData + 49;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            telecomManager.isTtySupported();
            throw null;
        }
        boolean zIsTtySupported = telecomManager.isTtySupported();
        getSDKAppID = (getDeviceData + 115) % 128;
        return zIsTtySupported;
    }
}
