package atd.k;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/IpAddress;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "findIpAddress", "()Ljava/lang/String;", "", "areInternetPermissionsGranted", "()Z", "Ljava/net/InetAddress;", "isPhysicalAddress", "(Ljava/net/InetAddress;)Z", "isInet4Or6Address", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIpAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IpAddress.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/IpAddress\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static long getSDKTransactionID;

    @NotNull
    private final PermissionChecker AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = atd.k.BuildConfig.$$a
            int r6 = r6 + 68
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L15:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r8 = r8 + 1
            int r6 = r6 + r0
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.BuildConfig.$$d(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        getDeviceData = 0;
        getMessageVersion = 1;
        getSDKTransactionID();
        SystemClock.currentThreadTimeMillis();
        AndroidCharacter.getMirror('0');
        new getDeviceData((byte) 0);
        BuildConfig = (ChallengeResultCancelled + 27) % 128;
    }

    private BuildConfig(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        application.getClass();
        permissionChecker.getClass();
        this.AuthenticationRequestParameters = permissionChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AuthenticationRequestParameters() throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = atd.k.BuildConfig.getMessageVersion
            int r0 = r0 + 99
            int r0 = r0 % 128
            atd.k.BuildConfig.getDeviceData = r0
            com.adyen.threeds2.internal.deviceinfo.parameter.AuthenticationRequestParameters r0 = r13.AuthenticationRequestParameters
            r1 = 0
            int r2 = android.graphics.ImageFormat.getBitsPerPixel(r1)
            r3 = 885224683(0x34c374eb, float:3.640665E-7)
            int r4 = r2 + r3
            java.lang.String r2 = ""
            int r3 = android.text.TextUtils.indexOf(r2, r2)
            int r3 = r3 + 25417
            char r7 = (char) r3
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r5 = "\uead1썴䤴屣"
            java.lang.String r6 = "暭\udc45ꉖĬ䋮\uf278掫붲칀磙ꀶ꼋埳ᦞFㆼ碥㵘ၗ覄ᾓ쑲᷇衢淉\ue234ꤟ"
            java.lang.String r8 = "\u0000\u0000\u0000\u0000"
            b(r4, r5, r6, r7, r8, r9)
            r4 = r9[r1]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            boolean r0 = r0.getSDKAppID(r4)
            if (r0 == 0) goto L9b
            int r0 = atd.k.BuildConfig.getDeviceData
            int r0 = r0 + 29
            int r4 = r0 % 128
            atd.k.BuildConfig.getMessageVersion = r4
            int r0 = r0 % 2
            com.adyen.threeds2.internal.deviceinfo.parameter.AuthenticationRequestParameters r4 = r13.AuthenticationRequestParameters
            r5 = 62416(0xf3d0, float:8.7463E-41)
            r6 = 1842795964(0x6dd6d5bc, float:8.3110226E27)
            if (r0 != 0) goto L73
            int r0 = android.text.TextUtils.indexOf(r2, r2, r1, r1)
            int r7 = r0 * r6
            r0 = 72
            int r0 = android.text.TextUtils.indexOf(r2, r0, r1, r3)
            int r0 = r0 + r5
            char r10 = (char) r0
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r8 = "볮훕콭泳"
            java.lang.String r9 = "랊鍅㒆࢘屻싿듵样㊦鋸Ὄ곩ⲻ溼疟貿찁ⰼ抮◬꧖拼\ud8b3둍쭬윮籰繻羒뼊\udaf0⪵\uf7bcЫ듴ꄁ\u2d74呤씖"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            b(r7, r8, r9, r10, r11, r12)
            r0 = r12[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r4.getSDKAppID(r0)
            if (r0 == 0) goto L9b
            goto L9a
        L73:
            int r0 = android.text.TextUtils.indexOf(r2, r2, r1, r1)
            int r7 = r6 - r0
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r2, r0, r1, r1)
            int r0 = r0 + r5
            char r10 = (char) r0
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r8 = "볮훕콭泳"
            java.lang.String r9 = "랊鍅㒆࢘屻싿듵样㊦鋸Ὄ곩ⲻ溼疟貿찁ⰼ抮◬꧖拼\ud8b3둍쭬윮籰繻羒뼊\udaf0⪵\uf7bcЫ듴ꄁ\u2d74呤씖"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            b(r7, r8, r9, r10, r11, r12)
            r0 = r12[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r4.getSDKAppID(r0)
            if (r0 == 0) goto L9b
        L9a:
            return r3
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.BuildConfig.AuthenticationRequestParameters():boolean");
    }

    private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        long j9;
        int i12;
        int i13;
        int i14;
        char c7;
        int i15 = $11;
        int i16 = i15 + 83;
        $10 = i16 % 128;
        int i17 = 2;
        Object obj = null;
        if (i16 % 2 != 0) {
            throw null;
        }
        if (str3 != null) {
            int i18 = i15 + 113;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
            $11 = ($10 + 119) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        int i19 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    j9 = 0;
                    byte b8 = (byte) i19;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2068, (char) (44657 - View.MeasureSpec.getSize(i19)), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -397560981, false, $$d((byte) 49, b8, b8), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    i12 = i17;
                    byte b11 = (byte) i19;
                    i13 = i19;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)) + 3094, (char) (TextUtils.getTrimmedLength("") + 14367), 18 - (ViewConfiguration.getTouchSlop() >> 8), -1211924053, false, $$d((byte) 50, b11, b11), new Class[]{Object.class});
                } else {
                    i12 = i17;
                    i13 = i19;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i21 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[1] = Integer.valueOf(i21);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    c7 = 1;
                    i14 = length3;
                    byte b12 = (byte) i13;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1428, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(i13) + 30, -1183253656, false, $$d((byte) 51, b12, b12), new Class[]{Object.class, cls, cls});
                } else {
                    i14 = length3;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i22 = cArr2[iIntValue2] * 32718;
                char c8 = cArr3[iIntValue];
                int i23 = i12;
                Object[] objArr5 = new Object[i23];
                objArr5[c7] = Integer.valueOf(c8);
                objArr5[0] = Integer.valueOf(i22);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "") + 2774, (char) (TextUtils.indexOf((CharSequence) "", '0') + 13061), 25 - (ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)), -320602145, false, $$d(b13, b14, b14), new Class[]{cls, cls});
                }
                cArr3[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i24 = oncompletion.getDeviceData;
                cArr4[i24] = (char) (((((long) (r0 ^ charArray2[i24])) ^ (getSDKTransactionID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKAppID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i24 + 1;
                i17 = i23;
                length3 = i14;
                obj = null;
                i19 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static boolean getDeviceData(InetAddress inetAddress) {
        getDeviceData = (getMessageVersion + 65) % 128;
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress()) {
            return false;
        }
        int i11 = getMessageVersion + 111;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static String getSDKAppID() throws SocketException {
        getMessageVersion = (getDeviceData + 101) % 128;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        getDeviceData = (getMessageVersion + 105) % 128;
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                inetAddressNextElement.getClass();
                if (getDeviceData(inetAddressNextElement)) {
                    getMessageVersion = (getDeviceData + 3) % 128;
                    if (getSDKTransactionID(inetAddressNextElement)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
        }
        return null;
    }

    private static boolean getSDKTransactionID(InetAddress inetAddress) {
        int i11 = getMessageVersion;
        getDeviceData = (i11 + 9) % 128;
        if (inetAddress instanceof Inet4Address) {
            return true;
        }
        int i12 = i11 + 99;
        int i13 = i12 % 128;
        getDeviceData = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (inetAddress instanceof Inet6Address) {
            return true;
        }
        getMessageVersion = (i13 + 85) % 128;
        return false;
    }

    public static void init$0() {
        $$a = new byte[]{82, 88, 59, -83};
        $$b = 153;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws SocketException {
        getDeviceData = (getMessageVersion + 73) % 128;
        if (!AuthenticationRequestParameters()) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            getMessageVersion = (getDeviceData + 45) % 128;
            return failure;
        }
        String sDKAppID = getSDKAppID();
        if (sDKAppID == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getMessageVersion = (getDeviceData + 91) % 128;
        return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(sDKAppID));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/IpAddress$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static long getSDKAppID;
        private static int getSDKReferenceNumber;
        private static char getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r5, int r6, int r7) {
            /*
                byte[] r0 = atd.k.BuildConfig.getDeviceData.$$c
                int r5 = 119 - r5
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r7 = r7 * 4
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r5
                r5 = r7
                r3 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L21
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L21:
                r4 = r0[r6]
                int r3 = r3 + 1
            L25:
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.BuildConfig.getDeviceData.$$e(short, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            AuthenticationRequestParameters = 1;
            getSDKAppID = 1737070750116086135L;
            getSDKReferenceNumber = -2038612665;
            getSDKTransactionID = (char) 15687;
        }

        private getDeviceData() {
        }

        private static void AuthenticationRequestParameters() throws Throwable {
            int i11 = AuthenticationRequestParameters + 31;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                byte b8 = (byte) ($$b & 3);
                Object[] objArr = new Object[1];
                a(b8, b8, $$a[28], objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                throw null;
            }
            int i12 = $$b;
            byte b11 = (byte) (i12 & 3);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b11, b11, bArr[28], objArr2);
            a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            AuthenticationRequestParameters = (getDeviceData + 59) % 128;
            byte b12 = (byte) (i12 & 3);
            try {
                Object[] objArr3 = new Object[1];
                a(b12, b12, bArr[28], objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b13 = bArr[28];
                byte b14 = b13;
                Object[] objArr4 = new Object[1];
                a(b13, b14, (byte) (b14 + 1), objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null)};
                Object[] objArr6 = new Object[1];
                b("㰰吙溅ɩ", "練\uf193᧿鮹", "슍⯷Ꚓ", (-945158) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (47433 - AndroidCharacter.getMirror('0')), objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
                int i13 = getDeviceData + 115;
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 97 / 0;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        private static void a(byte b8, short s7, short s8, Object[] objArr) {
            int i11 = 103 - (b8 * 6);
            int i12 = s8 * 15;
            int i13 = 29 - (s7 * 25);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[26 - i12];
            int i14 = 25 - i12;
            int i15 = -1;
            if (bArr == null) {
                i13++;
                i11 = (i14 + i13) - 5;
            }
            while (true) {
                i15++;
                bArr2[i15] = (byte) i11;
                if (i15 == i14) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b11 = bArr[i13];
                    i13++;
                    i11 = (i11 + b11) - 5;
                }
            }
        }

        private static void b(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
            char[] charArray;
            char[] charArray2;
            int i12;
            char c7;
            int i13;
            char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
            if (str2 != null) {
                charArray = str2.toCharArray();
                $10 = ($11 + 73) % 128;
            } else {
                charArray = str2;
            }
            char[] cArr = charArray;
            if (str != null) {
                $11 = ($10 + 17) % 128;
                charArray2 = str.toCharArray();
                $10 = ($11 + 29) % 128;
            } else {
                charArray2 = str;
            }
            char[] cArr2 = charArray2;
            atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            int i14 = 0;
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c3);
            int i15 = 2;
            cArr4[2] = (char) (cArr4[2] + ((char) i11));
            int length3 = charArray3.length;
            char[] cArr5 = new char[length3];
            oncompletion.getDeviceData = 0;
            while (oncompletion.getDeviceData < length3) {
                $10 = ($11 + 79) % 128;
                try {
                    Object[] objArr2 = {oncompletion};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                    if (sDKTransactionID == null) {
                        int packedPositionChild = 2068 - ExpandableListView.getPackedPositionChild(0L);
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 44657);
                        int maxKeyCode = 32 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b8 = (byte) ($$d & 15);
                        byte b11 = (byte) (b8 - 2);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(packedPositionChild, tapTimeout, maxKeyCode, -397560981, false, $$e(b8, b11, b11), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {oncompletion};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 1;
                        c7 = 1;
                        byte b13 = (byte) (b12 - 1);
                        i12 = i15;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getPressedStateDuration() >> 16) + 3095, (char) (14367 - Color.alpha(i14)), 'B' - AndroidCharacter.getMirror('0'), -1211924053, false, $$e(b12, b13, b13), new Class[]{Object.class});
                    } else {
                        i12 = i15;
                        c7 = 1;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    int i16 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                    objArr4[c7] = Integer.valueOf(i16);
                    objArr4[i14] = oncompletion;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) i14;
                        i13 = i14;
                        byte b15 = b14;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Color.alpha(i14) + 1428, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1183253656, false, $$e(b14, b15, b15), new Class[]{Object.class, cls, cls});
                    } else {
                        i13 = i14;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    int i17 = cArr3[iIntValue2] * 32718;
                    int i18 = i12;
                    Object[] objArr5 = new Object[i18];
                    objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                    objArr5[i13] = Integer.valueOf(i17);
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) i13;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (13060 - Color.green(i13)), ImageFormat.getBitsPerPixel(i13) + 26, -320602145, false, $$e((byte) ($$d | 33), b16, b16), new Class[]{cls, cls});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                    int i19 = oncompletion.getDeviceData;
                    cArr5[i19] = (char) (((((long) (r6 ^ charArray3[i19])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ 1905653906042338631L))));
                    oncompletion.getDeviceData = i19 + 1;
                    i15 = i18;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        public static void init$0() {
            $$a = new byte[]{5, 67, -107, -2, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
            $$b = 237;
        }

        public static void init$1() {
            $$c = new byte[]{81, 50, 24, 73};
            $$d = 18;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = 1905653906042338631L;
        getSDKAppID = -2038612665;
        getSDKReferenceNumber = (char) 33376;
    }
}
