package atd.ar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.as.BuildConfig;
import atd.as.getSDKEphemeralPublicKey;
import atd.n.AuthenticationRequestParameters;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.i1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/security/SecurityChecks;", "Lcom/adyen/threeds2/internal/security/listener/OverlayDetectionListener;", "Landroid/content/Context;", "applicationContext", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "configParameters", "Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;", "securityChecker", "<init>", "(Landroid/content/Context;Lcom/adyen/threeds2/parameters/ConfigParameters;Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;)V", "", "onOverlayDetected", "()V", "", "Lcom/adyen/threeds2/Warning;", "getSecurityWarnings", "()Ljava/util/List;", "", "securityWarnings", "Ljava/util/Set;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSecurityChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityChecks.kt\ncom/adyen/threeds2/internal/security/SecurityChecks\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1863#2:115\n1864#2:117\n1#3:116\n*S KotlinDebug\n*F\n+ 1 SecurityChecks.kt\ncom/adyen/threeds2/internal/security/SecurityChecks\n*L\n43#1:115\n43#1:117\n*E\n"})
public final class getSDKTransactionID implements atd.ap.getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    @NotNull
    public static final C0001getSDKTransactionID AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static byte[] ChallengeResultCancelled;
    private static int ChallengeResultError;
    private static int ChallengeResultTimeout;
    private static int getDeviceData;
    private static short[] getMessageVersion;

    @NotNull
    private static Set<Warning> getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final Set<Warning> getSDKReferenceNumber;

    private static String $$c(byte b8, byte b11, byte b12) {
        byte[] bArr = $$a;
        int i11 = (b11 * 4) + 101;
        int i12 = b8 * 3;
        int i13 = (b12 * 2) + 4;
        byte[] bArr2 = new byte[i12 + 1];
        int i14 = -1;
        if (bArr == null) {
            int i15 = i13 + (-i12);
            i13++;
            i11 = i15;
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i11;
            if (i14 == i12) {
                return new String(bArr2, 0);
            }
            int i16 = i13;
            i13 = i16 + 1;
            i11 += -bArr[i13];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultTimeout = 0;
        ChallengeResultError = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber();
        AuthenticationRequestParameters = new C0001getSDKTransactionID((byte) 0);
        getSDKAppID = new LinkedHashSet();
        ChallengeResultError = (ChallengeResultTimeout + 97) % 128;
    }

    private getSDKTransactionID(Context context, ConfigParameters configParameters, atd.aq.getDeviceData getdevicedata) {
        this.getSDKReferenceNumber = new LinkedHashSet();
        Iterator it = d0.h(new getSDKReferenceNumber(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.SECURITY_APP_SIGNATURE), AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.SECURITY_TRUSTED_APP_STORES), getdevicedata), new getDeviceData(getdevicedata), new getSDKAppID(getdevicedata)).iterator();
        while (it.hasNext()) {
            Warning sDKTransactionID = ((AuthenticationRequestParameters) it.next()).getSDKTransactionID(context);
            if (sDKTransactionID != null) {
                this.getSDKReferenceNumber.add(sDKTransactionID);
            }
        }
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = ~i11;
        int i18 = ~i12;
        int i19 = ~(i17 | i18 | i14);
        int i21 = ~i14;
        int i22 = i19 | (~(i17 | i21 | i12));
        int i23 = (~(i14 | i18)) | i17 | (~(i21 | i12));
        int i24 = 1305971684 * i23;
        int i25 = (892338176 * i13) + ((-1446510592) * i16) + ((-89653248) * i15) + i24 + ((-1305971684) * i18) + (i22 * (-1305971684)) + ((-1395624931) * i12) + ((1216318437 * i11) - 781189120);
        int iC = a0.c(i13, -1897213938, (1112421973 * i16) + i11 + i12 + i15);
        if (a0.e(iC, 563281920, (i13 * 856652822) + (i16 * (-1378896031)) + (i15 * 2010091741) + (i23 * 980) + (i18 * (-980)) + (i22 * (-980)) + (i12 * 2010090761) + (i11 * 2010092721) + 1217064380, -1077346304, ((-1657864192) * iC) + i25) == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ChallengeResult = (BuildConfig + 25) % 128;
        getsdktransactionid.getSDKReferenceNumber.add(atd.as.getSDKAppID.getSDKTransactionID);
        BuildConfig = (ChallengeResult + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        return null;
    }

    private static void BuildConfig() throws Throwable {
        ChallengeResult = (BuildConfig + 31) % 128;
        Set sDKAppID = getSDKAppID();
        Object obj = getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null);
        ChallengeResult = (BuildConfig + 75) % 128;
        try {
            Object[] objArr = new Object[1];
            a((-1905023865) - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') - 33, (-387179631) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((-119) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) (37 - View.getDefaultSize(0, 0)), objArr);
            Method method = Set.class.getMethod(((String) objArr[0]).intern(), Object.class);
            method.setAccessible(true);
            int i11 = BuildConfig + 15;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 62 / 0;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void ChallengeResult() throws Throwable {
        Set sDKAppID;
        Object obj;
        int i11 = BuildConfig + 23;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            sDKAppID = getSDKAppID();
            obj = atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null);
            int i12 = 78 / 0;
        } else {
            sDKAppID = getSDKAppID();
            obj = atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null);
        }
        BuildConfig = (ChallengeResult + 39) % 128;
        try {
            Object[] objArr = new Object[1];
            a(Color.red(0) - 1905023865, (ViewConfiguration.getEdgeSlop() >> 16) - 34, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 387179631, (byte) ((-119) - Color.argb(0, 0, 0, 0)), (short) (36 - MotionEvent.axisFromString("")), objArr);
            Method method = Set.class.getMethod(((String) objArr[0]).intern(), Object.class);
            method.setAccessible(true);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void ChallengeResultCancelled() throws Throwable {
        BuildConfig = (ChallengeResult + 17) % 128;
        Set sDKAppID = getSDKAppID();
        Object obj = getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null);
        BuildConfig = (ChallengeResult + 37) % 128;
        try {
            Object[] objArr = new Object[1];
            a((-1905023865) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-34) - (Process.myPid() >> 22), (-370402415) + Color.rgb(0, 0, 0), (byte) (ImageFormat.getBitsPerPixel(0) - 118), (short) (TextUtils.lastIndexOf("", '0') + 38), objArr);
            Method method = Set.class.getMethod(((String) objArr[0]).intern(), Object.class);
            method.setAccessible(true);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01f4 A[PHI: r6
      0x01f4: PHI (r6v7 int) = (r6v6 int), (r6v22 int) binds: [B:51:0x01f2, B:48:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7 A[PHI: r6
      0x01f7: PHI (r6v19 int) = (r6v6 int), (r6v22 int) binds: [B:51:0x01f2, B:48:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, int r30, int r31, byte r32, short r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ar.getSDKTransactionID.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    private static void getMessageVersion() throws Throwable {
        Set sDKAppID = getSDKAppID();
        Object obj = atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null);
        ChallengeResult = (BuildConfig + 55) % 128;
        try {
            Object[] objArr = new Object[1];
            a(Drawable.resolveOpacity(0, 0) - 1905023865, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 34, (-387179631) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((-120) - TextUtils.lastIndexOf("", '0', 0, 0)), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36), objArr);
            Method method = Set.class.getMethod(((String) objArr[0]).intern(), Object.class);
            method.setAccessible(true);
            int i11 = BuildConfig + 17;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
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

    public static final /* synthetic */ Set getSDKAppID() {
        int i11 = ChallengeResult;
        int i12 = i11 + 33;
        BuildConfig = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        Set<Warning> set = getSDKAppID;
        int i13 = i11 + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            return set;
        }
        throw null;
    }

    private static void getSDKEphemeralPublicKey() throws Throwable {
        Set sDKAppID = getSDKAppID();
        Object obj = atd.as.getDeviceData.class.getField("getSDKTransactionID").get(null);
        ChallengeResult = (BuildConfig + 65) % 128;
        try {
            Object[] objArr = new Object[1];
            a((-1905023865) - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollBarSize() >> 8) - 34, (-387179631) + View.MeasureSpec.getSize(0), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 119), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36), objArr);
            Method method = Set.class.getMethod(((String) objArr[0]).intern(), Object.class);
            method.setAccessible(true);
            int i11 = ChallengeResult + 93;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 71 / 0;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @NotNull
    public static final getSDKTransactionID getSDKReferenceNumber(@NotNull Context context, @NotNull ConfigParameters configParameters, @NotNull atd.aq.getDeviceData getdevicedata) {
        getSDKTransactionID sDKReferenceNumber;
        int i11 = BuildConfig + 87;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            sDKReferenceNumber = C0001getSDKTransactionID.getSDKReferenceNumber(context, configParameters, getdevicedata);
            int i12 = 44 / 0;
        } else {
            sDKReferenceNumber = C0001getSDKTransactionID.getSDKReferenceNumber(context, configParameters, getdevicedata);
        }
        BuildConfig = (ChallengeResult + 33) % 128;
        return sDKReferenceNumber;
    }

    private static void getSDKTransactionID() throws Throwable {
        int i11 = ChallengeResult + 97;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKAppID();
            BuildConfig.class.getField("getDeviceData").get(null);
            throw null;
        }
        Set sDKAppID = getSDKAppID();
        Object obj = BuildConfig.class.getField("getDeviceData").get(null);
        BuildConfig = (ChallengeResult + 75) % 128;
        try {
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L) - 1905023865, (Process.myPid() >> 22) - 34, TextUtils.indexOf("", "", 0, 0) - 387179631, (byte) ((-119) - View.resolveSizeAndState(0, 0, 0)), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37), objArr);
            Method method = Set.class.getMethod(((String) objArr[0]).intern(), Object.class);
            method.setAccessible(true);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void getTransactionStatus() {
        AuthenticationRequestParameters(new Object[0], 1591942034, -1591942033, AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber(), AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber(), AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber(), AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber());
    }

    public static void init$0() {
        $$a = new byte[]{45, 58, -109, -84};
        $$b = 120;
    }

    @NotNull
    public final List<Warning> getDeviceData() {
        ArrayList arrayList = new ArrayList(i1.h(this.getSDKReferenceNumber, getSDKAppID));
        int i11 = BuildConfig + 109;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 28 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: atd.ar.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/adyen/threeds2/internal/security/SecurityChecks$Companion;", "", "<init>", "()V", "raspWarnings", "", "Lcom/adyen/threeds2/Warning;", "newInstance", "Lcom/adyen/threeds2/internal/security/SecurityChecks;", "context", "Landroid/content/Context;", "configParameters", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "securityChecker", "Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;", "rootCallback", "", "info", "", "hookCallback", "debugCallback", "memoryScanningCallback", "emulatorCallback", "virtualEnvironmentCallback", "hardwareCallback", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0001getSDKTransactionID {
        private static int AuthenticationRequestParameters = 1;
        private static int getDeviceData;

        private C0001getSDKTransactionID() {
        }

        @NotNull
        public static getSDKTransactionID getSDKReferenceNumber(@NotNull Context context, @NotNull ConfigParameters configParameters, @NotNull atd.aq.getDeviceData getdevicedata) {
            context.getClass();
            configParameters.getClass();
            getdevicedata.getClass();
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            getSDKTransactionID getsdktransactionid = new getSDKTransactionID(applicationContext, configParameters, getdevicedata, (byte) 0);
            int i11 = getDeviceData + 49;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 59 / 0;
            }
            return getsdktransactionid;
        }

        public /* synthetic */ C0001getSDKTransactionID(byte b8) {
            this();
        }
    }

    public static void getSDKReferenceNumber() {
        getSDKTransactionID = 645918796;
        getDeviceData = 829166594;
        getSDKEphemeralPublicKey = 1088442361;
        ChallengeResultCancelled = new byte[]{-63, 71, 70};
    }

    public /* synthetic */ getSDKTransactionID(Context context, ConfigParameters configParameters, atd.aq.getDeviceData getdevicedata, byte b8) {
        this(context, configParameters, getdevicedata);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        int i11 = ChallengeResult + 17;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKAppID();
            atd.as.getSDKReferenceNumber.class.getField("getDeviceData").get(null);
            throw null;
        }
        Set sDKAppID = getSDKAppID();
        try {
            Object[] objArr2 = {atd.as.getSDKReferenceNumber.class.getField("getDeviceData").get(null)};
            Object[] objArr3 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) - 1905023865, Color.alpha(0) - 34, (-387179631) - TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getTapTimeout() >> 16) - 119), (short) (ExpandableListView.getPackedPositionChild(0L) + 38), objArr3);
            Method method = Set.class.getMethod(((String) objArr3[0]).intern(), Object.class);
            method.setAccessible(true);
            BuildConfig = (ChallengeResult + 113) % 128;
            return null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // atd.ap.getDeviceData
    public final void AuthenticationRequestParameters() {
        AuthenticationRequestParameters(new Object[]{this}, 1370710540, -1370710540, AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber(), AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber(), AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber(), AuthenticationRequestParameters.getDeviceData.getSDKReferenceNumber());
    }
}
