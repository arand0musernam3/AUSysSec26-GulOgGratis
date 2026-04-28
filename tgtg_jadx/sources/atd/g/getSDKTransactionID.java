package atd.g;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultTimeout;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import atd.g.AuthenticationRequestParameters;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformation;", "", "", "Lcom/adyen/threeds2/Warning;", "warnings", "", "", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "deviceParameters", "", "Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;", "supportedDataVersions", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Set;)V", "dataVersion", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "getDeviceData", "(Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;)Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "", "destroy", "()V", "Lorg/json/JSONObject;", "getDeviceDataJson", "(Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;Ljava/util/Map;Ljava/util/List;)Lorg/json/JSONObject;", "getDeviceParametersJson", "(Ljava/util/Map;)Lorg/json/JSONObject;", "securityWarnings", "Lorg/json/JSONArray;", "getSecurityWarnings", "(Ljava/util/List;)Lorg/json/JSONArray;", "Ljava/util/Set;", "deviceData16", "Lorg/json/JSONObject;", "deviceData17", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceInformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInformation.kt\ncom/adyen/threeds2/internal/deviceinfo/DeviceInformation\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n560#2:135\n545#2,6:136\n1#3:142\n1863#4,2:143\n*S KotlinDebug\n*F\n+ 1 DeviceInformation.kt\ncom/adyen/threeds2/internal/deviceinfo/DeviceInformation\n*L\n32#1:135\n32#1:136,6\n107#1:143,2\n*E\n"})
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long BuildConfig;
    private static int ChallengeResult;
    private static boolean ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    private static int ChallengeResultError;
    private static char ChallengeResultTimeout;
    private static int getAdditionalDetails;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static boolean getSDKEphemeralPublicKey;

    @NotNull
    private static final Set<String> getSDKReferenceNumber;
    private static int getTransactionStatus;

    @NotNull
    private final Set<getDeviceData> AuthenticationRequestParameters;

    @Nullable
    private JSONObject getDeviceData;

    @Nullable
    private JSONObject getSDKTransactionID;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class getSDKAppID {
        public static final /* synthetic */ int[] AuthenticationRequestParameters;
        private static int getSDKAppID = 1;
        private static int getSDKTransactionID;

        static {
            int[] iArr = new int[getDeviceData.values().length];
            try {
                iArr[getDeviceData.V1_6.ordinal()] = 1;
                getSDKAppID = (getSDKTransactionID + 13) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getDeviceData.V1_7.ordinal()] = 2;
                int i11 = getSDKTransactionID;
                int i12 = i11 & 57;
                getSDKAppID = (i12 + ((i11 ^ 57) | i12)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            AuthenticationRequestParameters = iArr;
            int i13 = getSDKAppID;
            int i14 = i13 ^ 35;
            int i15 = ((i13 & 35) | i14) << 1;
            int i16 = -i14;
            getSDKTransactionID = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            byte[] r0 = atd.g.getSDKTransactionID.$$a
            int r7 = r7 + 68
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKTransactionID.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getTransactionStatus = 0;
        ChallengeResultCompleted = 1;
        getAdditionalDetails = 0;
        ChallengeResultError = 1;
        getDeviceData();
        Color.argb(0, 0, 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        Color.argb(0, 0, 0, 0);
        ImageFormat.getBitsPerPixel(0);
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getLongPressTimeout();
        new C0007getSDKTransactionID((byte) 0);
        Object[] objArr = new Object[1];
        a(127 - TextUtils.getOffsetBefore("", 0), null, null, " \u009f\u009e\u009d", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b("\u0000\u0000\u0000\u0000", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (51750 - ((Process.getThreadPriority(0) + 20) >> 6)), "▘퓳舆ન", "\ue206ॷ⚪䋊", objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "¡\u009f\u009e\u009d", objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b("\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15466), "ḫ肋㫎ꕆ", "䋹ﲸ檗\ued3c", objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b("\u0000\u0000\u0000\u0000", ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (62342 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "⳩緣稉暭", "㖍惤虺䏳", objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, null, "¡¢\u009e\u009d", objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b("\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 16594), "ⷼࠜຍ푳", "描婩텙ᝀ", objArr7);
        String strIntern7 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b("\u0000\u0000\u0000\u0000", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16558), "൱⛛∃錛", "꣢䉠깫⥀", objArr8);
        String strIntern8 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b("\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, (char) (52708 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "傯ᢧ㭵넫", "냟贆\ue41a諍", objArr9);
        String strIntern9 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, null, "\u009e\u009f\u009e\u009d", objArr10);
        String strIntern10 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 127, null, null, "\u0090\u009f\u009e\u009d", objArr11);
        String strIntern11 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, null, "£¢\u009e\u009d", objArr12);
        String strIntern12 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        b("\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16, (char) (55818 - View.MeasureSpec.getMode(0)), "鮃汥篝ګ", "暺㠀\u0a3a郚", objArr13);
        String strIntern13 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b("\u0000\u0000\u0000\u0000", View.MeasureSpec.getMode(0), (char) (56610 - ((Process.getThreadPriority(0) + 20) >> 6)), "\ue634\ue947\ue377讀", "눛␙⋕\ud8dd", objArr14);
        getSDKReferenceNumber = y.W(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, strIntern12, strIntern13, ((String) objArr14[0]).intern()});
        int i11 = ChallengeResultCompleted + 97;
        getTransactionStatus = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 33 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getSDKTransactionID(@NotNull List<? extends Warning> list, @NotNull Map<String, ? extends DeviceParameterResult> map, @NotNull Set<? extends getDeviceData> set) {
        list.getClass();
        map.getClass();
        set.getClass();
        this.AuthenticationRequestParameters = set;
        getDeviceData getdevicedata = getDeviceData.V1_6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends DeviceParameterResult> entry : map.entrySet()) {
            if (!getSDKReferenceNumber.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.getSDKTransactionID = AuthenticationRequestParameters(getdevicedata, linkedHashMap, list);
        this.getDeviceData = AuthenticationRequestParameters(getDeviceData.V1_7, map, list);
    }

    private static JSONObject AuthenticationRequestParameters(getDeviceData getdevicedata, Map<String, ? extends DeviceParameterResult> map, List<? extends Warning> list) throws Throwable {
        getAdditionalDetails = (ChallengeResultError + 121) % 128;
        JSONObject sDKReferenceNumber = getSDKReferenceNumber(map);
        Object[] objArr = new Object[1];
        a(128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, null, "\u0082\u0081", objArr);
        sDKReferenceNumber.put(((String) objArr[0]).intern(), getdevicedata.getSDKReferenceNumber());
        JSONArray jSONArrayAuthenticationRequestParameters = AuthenticationRequestParameters(list);
        if (jSONArrayAuthenticationRequestParameters.length() > 0) {
            Object[] objArr2 = new Object[1];
            b("\u0000\u0000\u0000\u0000", View.getDefaultSize(0, 0), (char) ((-16741906) - Color.rgb(0, 0, 0)), "\uf1ee\ue08e", "껓蓿\ueeb0悉", objArr2);
            sDKReferenceNumber.put(((String) objArr2[0]).intern(), jSONArrayAuthenticationRequestParameters);
        }
        int i11 = getAdditionalDetails + 29;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 != 0) {
            return sDKReferenceNumber;
        }
        throw null;
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            $11 = ($10 + 9) % 128;
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $10 = ($11 + 65) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        float f11 = 0.0f;
        int i12 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i12;
                        sDKTransactionID = ChallengeResult.getDeviceData((AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)) + 2555, (char) (48598 - ExpandableListView.getPackedPositionGroup(0L)), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), -390605202, false, $$c(b8, (byte) (b8 | 43), b8), new Class[]{cls});
                    }
                    cArr3[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i13++;
                    f11 = 0.0f;
                    i12 = 0;
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
        Object[] objArr3 = {Integer.valueOf(ChallengeResult)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = ChallengeResult.getDeviceData(147 - (ViewConfiguration.getTapTimeout() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 32 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getSDKEphemeralPublicKey) {
            $11 = ($10 + 35) % 128;
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i14 = challengeResultTimeout.getSDKAppID;
                int i15 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b11 = (byte) 0;
                    sDKTransactionID3 = ChallengeResult.getDeviceData((KeyEvent.getMaxKeyCode() >> 16) + 1697, (char) View.resolveSize(0, 0), 16777245 + Color.rgb(0, 0, 0), -1620360563, false, $$c(b11, (byte) (b11 | 47), b11), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else if (ChallengeResultCancelled) {
            int length3 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i16 = challengeResultTimeout.getSDKAppID;
                int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b12 = (byte) 0;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0', 0, 0) + 1698, (char) (Process.getGidForName("") + 1), Color.blue(0) + 29, -1620360563, false, $$c(b12, (byte) (b12 | 47), b12), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i18 = challengeResultTimeout.getSDKAppID;
                int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i18 >= i19) {
                    String str4 = new String(cArr6);
                    $10 = ($11 + 41) % 128;
                    objArr[0] = str4;
                    return;
                }
                cArr6[i18] = (char) (cArr2[iArr[(i19 - 1) - i18] - i11] - iIntValue);
                challengeResultTimeout.getSDKAppID = i18 + 1;
            }
        }
    }

    private static void b(String str, int i11, char c3, String str2, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        long j9;
        int i12;
        int i13;
        $10 = ($11 + 77) % 128;
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        int i14 = 2;
        Object obj = null;
        if (str2 != null) {
            int i15 = $11 + 9;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = charArray3.length;
        char[] cArr3 = new char[length2];
        int i16 = 0;
        System.arraycopy(charArray2, 0, cArr2, 0, length);
        System.arraycopy(charArray3, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i16;
                    j9 = 0;
                    sDKTransactionID = ChallengeResult.getDeviceData(2069 - View.resolveSizeAndState(i16, i16, i16), (char) (44658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31, -397560981, false, $$c(b8, (byte) (b8 | 49), b8), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    i12 = i14;
                    byte b11 = (byte) i16;
                    i13 = i16;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionGroup(j9) + 3095, (char) (TextUtils.indexOf((CharSequence) "", '0') + 14368), Drawable.resolveOpacity(i16, i16) + 18, -1211924053, false, $$c(b11, (byte) (b11 | 50), b11), new Class[]{Object.class});
                } else {
                    i12 = i14;
                    i13 = i16;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i17 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i18 = i13;
                    byte b12 = (byte) i18;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1427 - TextUtils.lastIndexOf("", '0'), (char) Gravity.getAbsoluteGravity(i18, i18), View.MeasureSpec.makeMeasureSpec(i18, i18) + 30, -1183253656, false, $$c(b12, (byte) (b12 | 51), b12), new Class[]{Object.class, cls, cls});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr2[iIntValue2] * 32718;
                int i21 = i12;
                Object[] objArr5 = new Object[i21];
                objArr5[1] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[0] = Integer.valueOf(i19);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getTouchSlop() >> 8), (char) (13060 - TextUtils.getOffsetBefore("", 0)), MotionEvent.axisFromString("") + 26, -320602145, false, $$c(b13, b14, b14), new Class[]{cls, cls});
                }
                cArr3[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr4[i22] = (char) (((((long) (r2 ^ cArr[i22])) ^ (BuildConfig ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getMessageVersion) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) ChallengeResultTimeout) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                $10 = ($11 + 3) % 128;
                obj = null;
                i14 = i21;
                i16 = 0;
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

    public static void getDeviceData() {
        getSDKAppID = new char[]{21788, 21810, 21823, 21803, 21797, 21738, 21817, 21820, 21841, 21821, 21802, 21804, 21792, 21806, 21807, 21742, 21793, 21796, 21842, 21794, 21800, 21768, 21774, 21805, 21756, 21775, 21795, 21764, 21785, 21737, 21778, 21779, 21777, 21741, 21776};
        ChallengeResult = 1286296792;
        ChallengeResultCancelled = true;
        getSDKEphemeralPublicKey = true;
        BuildConfig = 1905653906042338631L;
        getMessageVersion = -2038612665;
        ChallengeResultTimeout = (char) 9558;
    }

    private static JSONObject getSDKReferenceNumber(Map<String, ? extends DeviceParameterResult> map) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, ? extends DeviceParameterResult> entry : map.entrySet()) {
            getAdditionalDetails = (ChallengeResultError + 109) % 128;
            String key = entry.getKey();
            DeviceParameterResult value = entry.getValue();
            if (value instanceof DeviceParameterResult.Failure) {
                int i11 = getAdditionalDetails + 101;
                ChallengeResultError = i11 % 128;
                if (i11 % 2 == 0) {
                    jSONObject.put(key, ((DeviceParameterResult.Failure) value).getReason().getCode());
                    throw null;
                }
                jSONObject.put(key, ((DeviceParameterResult.Failure) value).getReason().getCode());
            } else {
                Object[] objArr = new Object[1];
                a(127 - View.MeasureSpec.getSize(0), null, null, "\u008a\u0098\u0092\u0087\u0082\u008c\u008f\u0091\u009c\u008f\u009b\u008b\u0091\u008e\u008c\u009a\u0099\u008f\u008f\u008a\u0083\u0083\u0098\u009a\u0099\u008c\u0092\u0098\u008f\u008a\u0097\u008e\u008a\u008c\u008a\u0085\u0087\u008e\u0087\u0096\u008a\u0083\u0091\u0093\u008a\u0081\u0086\u008e\u008a\u008c\u008a\u0085\u0087\u008e\u0087\u0095\u0086\u0084\u0094\u008b\u0091\u008a\u0083\u0091\u0093\u008a\u0088\u0086\u0092\u0087\u008b\u008e\u008a\u008c\u008b\u0091\u0086\u0090\u008f\u0088\u008a\u008a\u008e\u008d\u008c\u0086\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083", objArr);
                if (Class.forName(((String) objArr[0]).intern()).isInstance(value)) {
                    jSONObject2.put(key, new JSONArray((Collection) ((DeviceParameterResult.Success.StringsListValue) value).m177unboximpl()));
                } else {
                    if (!(value instanceof DeviceParameterResult.Success)) {
                        e40.a.f();
                        return null;
                    }
                    jSONObject2.put(key, value.toString());
                    getAdditionalDetails = (ChallengeResultError + 1) % 128;
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2.length() != 0) {
            getAdditionalDetails = (ChallengeResultError + 121) % 128;
            Object[] objArr2 = new Object[1];
            b("\u0000\u0000\u0000\u0000", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.red(0) + 25884), "∆\uec6e", "궘䵳᳗\udc65", objArr2);
            jSONObject3.put(((String) objArr2[0]).intern(), jSONObject2);
            ChallengeResultError = (getAdditionalDetails + 29) % 128;
        }
        if (jSONObject.length() != 0) {
            getAdditionalDetails = (ChallengeResultError + 75) % 128;
            Object[] objArr3 = new Object[1];
            b("\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') + 1, (char) (9006 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "\u17fb츟홵⇂", "膹莨⺛霣", objArr3);
            jSONObject3.put(((String) objArr3[0]).intern(), jSONObject);
        }
        return jSONObject3;
    }

    public static void init$0() {
        $$a = new byte[]{18, 16, -71, -48};
        $$b = 186;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getSDKTransactionID() {
        /*
            r18 = this;
            r0 = r18
            int r1 = atd.g.getSDKTransactionID.ChallengeResultError
            int r2 = r1 + 63
            int r3 = r2 % 128
            atd.g.getSDKTransactionID.getAdditionalDetails = r3
            int r2 = r2 % 2
            org.json.JSONObject r3 = r0.getSDKTransactionID
            r4 = 73
            if (r2 == 0) goto L17
            int r2 = r4 / 0
            if (r3 == 0) goto L37
            goto L19
        L17:
            if (r3 == 0) goto L37
        L19:
            java.lang.Object[] r10 = new java.lang.Object[]{r3}
            int r8 = atd.ak.getDeviceData.getDeviceData()
            int r6 = atd.ak.getDeviceData.getDeviceData()
            int r5 = atd.ak.getDeviceData.getDeviceData()
            int r7 = atd.ak.getDeviceData.getDeviceData()
            r11 = 1676234570(0x63e94f4a, float:8.6076095E21)
            r9 = -1676234569(0xffffffff9c16b0b7, float:-4.9859235E-22)
            atd.bc.getDeviceData.getSDKTransactionID(r5, r6, r7, r8, r9, r10, r11)
            goto L3d
        L37:
            int r1 = r1 + 113
            int r1 = r1 % 128
            atd.g.getSDKTransactionID.getAdditionalDetails = r1
        L3d:
            r1 = 0
            r0.getSDKTransactionID = r1
            org.json.JSONObject r2 = r0.getDeviceData
            if (r2 == 0) goto L8b
            int r3 = atd.g.getSDKTransactionID.getAdditionalDetails
            int r3 = r3 + r4
            int r4 = r3 % 128
            atd.g.getSDKTransactionID.ChallengeResultError = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L6d
            java.lang.Object[] r9 = new java.lang.Object[]{r2}
            int r7 = atd.ak.getDeviceData.getDeviceData()
            int r5 = atd.ak.getDeviceData.getDeviceData()
            int r4 = atd.ak.getDeviceData.getDeviceData()
            int r6 = atd.ak.getDeviceData.getDeviceData()
            r10 = 1676234570(0x63e94f4a, float:8.6076095E21)
            r8 = -1676234569(0xffffffff9c16b0b7, float:-4.9859235E-22)
            atd.bc.getDeviceData.getSDKTransactionID(r4, r5, r6, r7, r8, r9, r10)
            goto L8b
        L6d:
            java.lang.Object[] r16 = new java.lang.Object[]{r2}
            int r14 = atd.ak.getDeviceData.getDeviceData()
            int r12 = atd.ak.getDeviceData.getDeviceData()
            int r11 = atd.ak.getDeviceData.getDeviceData()
            int r13 = atd.ak.getDeviceData.getDeviceData()
            r17 = 1676234570(0x63e94f4a, float:8.6076095E21)
            r15 = -1676234569(0xffffffff9c16b0b7, float:-4.9859235E-22)
            atd.bc.getDeviceData.getSDKTransactionID(r11, r12, r13, r14, r15, r16, r17)
            throw r1
        L8b:
            r0.getDeviceData = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKTransactionID.getSDKTransactionID():void");
    }

    /* JADX INFO: renamed from: atd.g.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformation$Companion;", "", "<init>", "()V", "DATA_VERSION", "", "SECURITY_WARNINGS", "DEVICE_DATA", "DEVICE_PARAMETERS_NOT_AVAILABLE", "deviceData17OnlyParameters", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0007getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static long getDeviceData;
        private static int getSDKAppID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, short r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r8 = r8 * 4
                int r0 = r8 + 1
                int r6 = r6 * 2
                int r6 = r6 + 97
                byte[] r1 = atd.g.getSDKTransactionID.C0007getSDKTransactionID.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r1
                r4 = r2
                r1 = r7
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L27:
                r3 = r1[r7]
                r5 = r1
                r1 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKTransactionID.C0007getSDKTransactionID.$$e(byte, short, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKAppID = 1;
            getDeviceData = 4573095256953630354L;
        }

        private C0007getSDKTransactionID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKTransactionID.C0007getSDKTransactionID.a(java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r7 = r7 + 101
                int r0 = 19 - r8
                byte[] r1 = atd.g.getSDKTransactionID.C0007getSDKTransactionID.$$a
                byte[] r0 = new byte[r0]
                int r8 = 18 - r8
                r2 = 0
                if (r1 != 0) goto L14
                r7 = r6
                r3 = r1
                r4 = r2
                r1 = r8
                goto L2e
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L24:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L2e:
                int r1 = r1 + r6
                int r6 = r1 + (-2)
                r1 = r7
                r7 = r6
                r6 = r1
                r1 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKTransactionID.C0007getSDKTransactionID.b(short, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0303  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0527  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0529  */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Type inference failed for: r15v16 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v21 */
        /* JADX WARN: Type inference failed for: r15v22 */
        /* JADX WARN: Type inference failed for: r15v42 */
        /* JADX WARN: Type inference failed for: r15v43 */
        /* JADX WARN: Type inference failed for: r15v44 */
        /* JADX WARN: Type inference failed for: r15v45 */
        /* JADX WARN: Type inference failed for: r15v46 */
        /* JADX WARN: Type inference failed for: r15v47 */
        /* JADX WARN: Type inference failed for: r15v48 */
        /* JADX WARN: Type inference failed for: r15v49 */
        /* JADX WARN: Type inference failed for: r15v50 */
        /* JADX WARN: Type inference failed for: r15v51 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] getSDKReferenceNumber(android.content.Context r35, int r36, int r37, int r38) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1519
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKTransactionID.C0007getSDKTransactionID.getSDKReferenceNumber(android.content.Context, int, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{26, 112, 0, -80, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 0, 17, -31, -13, 9, 11, 32, -15, 15, 7, -16, 4, 19, -9, 8, 1, -35, -3, 3, -3, 3, -50};
            $$b = 233;
        }

        public static void init$1() {
            $$c = new byte[]{47, 95, 67, 92};
            $$d = 217;
        }

        public /* synthetic */ C0007getSDKTransactionID(byte b8) {
            this();
        }
    }

    private static JSONArray AuthenticationRequestParameters(List<? extends Warning> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        getAdditionalDetails = (ChallengeResultError + 77) % 128;
        while (it.hasNext()) {
            ChallengeResultError = (getAdditionalDetails + 125) % 128;
            jSONArray.put(((Warning) it.next()).getID());
        }
        return jSONArray;
    }

    @NotNull
    public final AuthenticationRequestParameters getSDKReferenceNumber(@NotNull getDeviceData getdevicedata) {
        int i11 = ChallengeResultError + 7;
        getAdditionalDetails = i11 % 128;
        if (i11 % 2 == 0) {
            getdevicedata.getClass();
            if (!this.AuthenticationRequestParameters.contains(getdevicedata)) {
                return AuthenticationRequestParameters.C0006AuthenticationRequestParameters.getSDKAppID;
            }
            int i12 = getSDKAppID.AuthenticationRequestParameters[getdevicedata.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    JSONObject jSONObject = this.getDeviceData;
                    return jSONObject != null ? new AuthenticationRequestParameters.getSDKReferenceNumber(jSONObject) : AuthenticationRequestParameters.getSDKAppID.getSDKTransactionID;
                }
                e40.a.f();
                return null;
            }
            JSONObject jSONObject2 = this.getSDKTransactionID;
            if (jSONObject2 != null) {
                AuthenticationRequestParameters.getSDKReferenceNumber getsdkreferencenumber = new AuthenticationRequestParameters.getSDKReferenceNumber(jSONObject2);
                int i13 = getAdditionalDetails + 35;
                ChallengeResultError = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 49 / 0;
                }
                return getsdkreferencenumber;
            }
            return AuthenticationRequestParameters.getSDKAppID.getSDKTransactionID;
        }
        getdevicedata.getClass();
        this.AuthenticationRequestParameters.contains(getdevicedata);
        throw null;
    }
}
