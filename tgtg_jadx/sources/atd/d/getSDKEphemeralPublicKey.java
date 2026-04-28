package atd.d;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.am.getSDKTransactionID;
import atd.d.ChallengeResultTimeout;
import com.app.tgtg.model.local.AppConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.x0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import n90.b0;
import n90.e;
import n90.g0;
import n90.n;
import n90.o;
import n90.y;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\u0006\u001a!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u0006\u001a#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u0006\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a#\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0006\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0006\u001a#\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00142\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0019\u001a!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u0019\u001a!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u0019\u001a!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0013\u0010\u001f\u001a\u00020\u0007*\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0015\u0010!\u001a\u00020\u0007*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Ln90/b0;", "Lcom/adyen/threeds2/internal/result/MessageField;", "field", "Lcom/adyen/threeds2/internal/result/Result;", "", "getInt", "(Ln90/b0;Lcom/adyen/threeds2/internal/result/MessageField;)Lcom/adyen/threeds2/internal/result/Result;", "", "getBoolean", "", "getString", "(Ln90/b0;Ljava/lang/String;)Lcom/adyen/threeds2/internal/result/Result;", "getOptString", "getJsonObject", "getOptJsonObject", "getUuid", "getOptUuid", "Ln90/e;", "getJsonArray", "getOptJsonArray", "Ln90/n;", "asJsonObject", "(Ln90/n;Lcom/adyen/threeds2/internal/result/MessageField;)Lcom/adyen/threeds2/internal/result/Result;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "getStringResult", "(Ln90/b0;Ljava/lang/String;)Lcom/adyen/threeds2/internal/api/JsonResult;", "getIntResult", "getBooleanResult", "getJsonObjectResult", "getUuidResult", "getJsonArrayResult", "isValidUUID", "(Ljava/lang/String;)Z", "isEmptyOrNull", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static long getDeviceData;
    private static short[] getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, int r8, short r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = atd.d.getSDKEphemeralPublicKey.$$a
            int r9 = r9 * 2
            int r9 = r9 + 97
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKEphemeralPublicKey.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData = 1806829163920707880L;
        getSDKAppID = 2129752064;
        getSDKTransactionID = 829166650;
        getSDKReferenceNumber = 948647320;
        AuthenticationRequestParameters = new byte[]{33, 90, 106, 84, -69, 80, -65, -6, 98, -65, -123, -6, 98, -127, 82, -66, 77, -70, -71, -59, 16, 87, 81, -121, -89, -124, -103, 33, 51, 19, -40, 61, 0, -56, -46, -109, 69, 0, 6, -48, 48, -29, ByteCompanionObject.MAX_VALUE, -50, -110, 117, -50, -54, -101, 69, 1, -52, 5, -24, 32, -62, -46, -12, -31, -8, -99, -94, 10, -99, -21, -94, 8, -109, -6, -11, -28, -115, -29, -7, -8, -21, -122, 1, -25, -32, -99, -124, 39, 57, 41, 23, -102, 19, -98, 89, 65, -98, -32, 89, 122, -9, 2, -97, -56, 46, 18, 19, -64, -59, 83, 22, 12, -26, 6, -25, -12, -39, -46, -103, -42, -107, 88, 57, -97, -98, -107, -30, 95, 22, -51, -41, -99, -3, -30, -65};
    }

    private static final ChallengeResultTimeout<b0> AuthenticationRequestParameters(b0 b0Var, String str) {
        if (!b0Var.containsKey(str)) {
            getSDKEphemeralPublicKey = (BuildConfig + 13) % 128;
            return ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters;
        }
        n nVar = (n) x0.c(str, b0Var);
        if (nVar instanceof y) {
            getSDKEphemeralPublicKey = (BuildConfig + 35) % 128;
            return ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
        }
        if (!(nVar instanceof b0)) {
            ChallengeResultTimeout.getSDKTransactionID getsdktransactionid = ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
            int i11 = getSDKEphemeralPublicKey + 39;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 80 / 0;
            }
            return getsdktransactionid;
        }
        if (!((b0) nVar).f30747a.isEmpty()) {
            return new ChallengeResultTimeout.getSDKAppID(nVar);
        }
        int i13 = BuildConfig + 65;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 != 0) {
            return ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
        }
        ChallengeResultTimeout.getDeviceData getdevicedata = ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
        throw null;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<b0> BuildConfig(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        getSDKEphemeralPublicKey = (BuildConfig + 97) % 128;
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<b0> challengeResultTimeoutAuthenticationRequestParameters = AuthenticationRequestParameters(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (challengeResultTimeoutAuthenticationRequestParameters instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) challengeResultTimeoutAuthenticationRequestParameters).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(challengeResultTimeoutAuthenticationRequestParameters, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            return new getSDKTransactionID.getDeviceData(null);
        }
        if (Intrinsics.areEqual(challengeResultTimeoutAuthenticationRequestParameters, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("䢆ꀺ馃\uf115\ueae8숿㯛ᒶ౸斎崓뛡깐蟎\uf0f0\ue87d", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59539, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber);
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (!Intrinsics.areEqual(challengeResultTimeoutAuthenticationRequestParameters, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            e40.a.f();
            return null;
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b((byte) ((-31) - Color.green(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 26, (-1335714824) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (Gravity.getAbsoluteGravity(0, 0) - 9), (-166142326) - MotionEvent.axisFromString(""), objArr2);
        sb3.append(((String) objArr2[0]).intern());
        sb3.append(getsdkreferencenumber);
        getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        int i11 = BuildConfig + 11;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 56 / 0;
        }
        return getsdkappid;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<e> ChallengeResult(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<e> challengeResultTimeoutBuildConfig = BuildConfig(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (challengeResultTimeoutBuildConfig instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) challengeResultTimeoutBuildConfig).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(challengeResultTimeoutBuildConfig, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", KeyEvent.getDeadChar(0, 0) + 30971, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (Intrinsics.areEqual(challengeResultTimeoutBuildConfig, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 69), (ViewConfiguration.getScrollBarSize() >> 8) - 26, (-1335714769) - (Process.myTid() >> 22), (short) ((-119) - ExpandableListView.getPackedPositionGroup(0L)), ExpandableListView.getPackedPositionGroup(0L) - 166142322, objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getsdkreferencenumber.getSDKReferenceNumber());
            getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
            int i11 = BuildConfig + 7;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 != 0) {
                return getsdkappid;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(challengeResultTimeoutBuildConfig, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            e40.a.f();
            return null;
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b((byte) (69 - TextUtils.getOffsetAfter("", 0)), (-26) - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) - 1335714769, (short) ((-16777335) - Color.rgb(0, 0, 0)), TextUtils.getOffsetAfter("", 0) - 166142322, objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getsdkreferencenumber.getSDKReferenceNumber());
        getSDKTransactionID.getSDKAppID getsdkappid2 = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey3, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        int i12 = BuildConfig + 11;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            return getsdkappid2;
        }
        throw null;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<String> ChallengeResultCancelled(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        getSDKEphemeralPublicKey = (BuildConfig + 103) % 128;
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<String> messageVersion = getMessageVersion(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (messageVersion instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) messageVersion).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(messageVersion, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("䢅蟀홪⛳甍䗁鐨\ue352㏍ɹ勦ꅕ\uf1fc", 53101 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber);
            getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
            int i11 = getSDKEphemeralPublicKey + 65;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                return getsdkappid;
            }
            throw null;
        }
        if (Intrinsics.areEqual(messageVersion, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30971, objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getsdkreferencenumber);
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (!Intrinsics.areEqual(messageVersion, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            e40.a.f();
            return null;
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a("䢉럑뙈뛜땐뗒둞뒙덭돢뉿닱넔뇕끝냃뼐뿉빇뻈뵀뷏밐벉", 65407 - Color.green(0), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getsdkreferencenumber.getSDKReferenceNumber());
        return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey3, getsdkreferencenumber), getsdkreferencenumber, null, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKEphemeralPublicKey.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[PHI: r5
      0x008b: PHI (r5v24 byte[]) = (r5v8 byte[]), (r5v25 byte[]) binds: [B:20:0x0096, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[PHI: r5
      0x0098: PHI (r5v9 byte[] A[IMMUTABLE_TYPE]) = (r5v8 byte[]), (r5v25 byte[]) binds: [B:20:0x0096, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r29, int r30, int r31, short r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKEphemeralPublicKey.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<Integer> getDeviceData(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        getSDKEphemeralPublicKey = (BuildConfig + 3) % 128;
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<Integer> sDKAppID = getSDKAppID(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (sDKAppID instanceof ChallengeResultTimeout.getSDKAppID) {
            getSDKTransactionID.getDeviceData getdevicedata = new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) sDKAppID).getSDKReferenceNumber());
            int i11 = getSDKEphemeralPublicKey + 57;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 55 / 0;
            }
            return getdevicedata;
        }
        if (Intrinsics.areEqual(sDKAppID, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("䢅䢈䣺䣛䠭䡙䡨䦢䦄䧸䧗䥷䤚䥎䪴䫋䫶䫜䨿䨓䩀䯳䯎", (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (Intrinsics.areEqual(sDKAppID, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b((byte) ((-105) - View.combineMeasuredStates(0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 27, (-1335714851) - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((-8) - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 166142322, objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (!Intrinsics.areEqual(sDKAppID, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            e40.a.f();
            return null;
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", 30971 - KeyEvent.getDeadChar(0, 0), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getsdkreferencenumber.getSDKReferenceNumber());
        return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey3, getsdkreferencenumber), getsdkreferencenumber, null, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if ((r10 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, atd.d.ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r10 = new atd.am.getSDKTransactionID.getDeviceData(null);
        r11 = atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey + 27;
        atd.d.getSDKEphemeralPublicKey.BuildConfig = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if ((r11 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, atd.d.ChallengeResultTimeout.getDeviceData.getSDKTransactionID) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r4 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
        r10 = new java.lang.StringBuilder();
        r1 = new java.lang.Object[1];
        a("䢅蟀홪⛳甍䗁鐨\ue352㏍ɹ勦ꅕ\uf1fc", (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 53100, r1);
        r10.append(((java.lang.String) r1[0]).intern());
        r10.append(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        return new atd.am.getSDKTransactionID.getSDKAppID(r4, new atd.ac.getSDKAppID(r10.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, r4, r11), r11, null, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, atd.d.ChallengeResultTimeout.getSDKTransactionID.getDeviceData) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        r5 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        r10 = new java.lang.StringBuilder();
        r11 = new java.lang.Object[1];
        a("䢉럑뙈뛜땐뗒둞뒙덭돢뉿닱넔뇕끝냃뼐뿉빇뻈뵀뷏밐벉", android.view.View.getDefaultSize(0, 0) + 65407, r11);
        r10.append(((java.lang.String) r11[0]).intern());
        r10.append(r11.getSDKReferenceNumber());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        return new atd.am.getSDKTransactionID.getSDKAppID(r5, new atd.ac.getSDKAppID(r10.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, r5, r11), r11, null, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
    
        e40.a.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if ((r10 instanceof atd.d.ChallengeResultTimeout.getSDKAppID) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if ((r10 instanceof atd.d.ChallengeResultTimeout.getSDKAppID) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r11 = new atd.am.getSDKTransactionID.getDeviceData(((atd.d.ChallengeResultTimeout.getSDKAppID) r10).getSDKReferenceNumber());
        r10 = atd.d.getSDKEphemeralPublicKey.BuildConfig + 9;
        atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey = r10 % 128;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final atd.am.getSDKTransactionID<java.lang.String> getMessageVersion(@org.jetbrains.annotations.NotNull n90.b0 r10, @org.jetbrains.annotations.NotNull atd.am.getSDKReferenceNumber r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKEphemeralPublicKey.getMessageVersion(n90.b0, atd.am.getSDKReferenceNumber):atd.am.getSDKTransactionID");
    }

    public static /* synthetic */ Object getSDKAppID(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~((~i15) | i16 | i14);
        int i18 = ~((~i16) | i15);
        int i19 = ~i14;
        int i21 = i18 | (~(i19 | i15));
        int i22 = ~(i19 | i16);
        int i23 = (1743781888 * i11) + ((-1885339648) * i12) + (557056000 * i13) + (987930861 * i22) + ((-987930861) * i21) + (i17 * 987930861) + (1544986862 * i16) + (((-430874860) * i15) - 739508224);
        int iC = a0.c(i11, 1617068012, ((-1568348280) * i12) + i15 + i16 + i13);
        int i24 = i12 * 424585256;
        int i25 = i11 * 537576796;
        int iE = a0.e(iC, 1078394880, i25 + i24 + (i13 * (-973780651)) + (i22 * 945) + (i21 * (-945)) + (i17 * 945) + (i16 * (-973779706)) + (i15 * (-973781596)) + 539565670, 192741376, (858456064 * iC) + i23);
        return iE != 1 ? iE != 2 ? iE != 3 ? getSDKReferenceNumber(objArr) : getSDKTransactionID(objArr) : getDeviceData(objArr) : getSDKAppID(objArr);
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<e> getSDKEphemeralPublicKey(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<e> challengeResultTimeoutBuildConfig = BuildConfig(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (challengeResultTimeoutBuildConfig instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) challengeResultTimeoutBuildConfig).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(challengeResultTimeoutBuildConfig, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            getSDKTransactionID.getDeviceData getdevicedata = new getSDKTransactionID.getDeviceData(null);
            int i11 = BuildConfig + 107;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 52 / 0;
            }
            return getdevicedata;
        }
        if (!Intrinsics.areEqual(challengeResultTimeoutBuildConfig, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            if (!Intrinsics.areEqual(challengeResultTimeoutBuildConfig, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
                e40.a.f();
                return null;
            }
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b((byte) (View.resolveSizeAndState(0, 0, 0) + 69), (Process.myTid() >> 22) - 26, (-1335714770) - TextUtils.lastIndexOf("", '0', 0, 0), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 119), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 166142323, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b((byte) (69 - View.MeasureSpec.getSize(0)), (-27) - Process.getGidForName(""), View.MeasureSpec.getSize(0) - 1335714769, (short) ((-118) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-166142322) - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        sb3.append(((String) objArr2[0]).intern());
        sb3.append(getsdkreferencenumber.getSDKReferenceNumber());
        getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        int i13 = getSDKEphemeralPublicKey + 61;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<b0> getSDKReferenceNumber(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        int i11 = BuildConfig + 103;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            b0Var.getClass();
            getsdkreferencenumber.getClass();
            AuthenticationRequestParameters(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
            throw null;
        }
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<b0> challengeResultTimeoutAuthenticationRequestParameters = AuthenticationRequestParameters(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (challengeResultTimeoutAuthenticationRequestParameters instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) challengeResultTimeoutAuthenticationRequestParameters).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(challengeResultTimeoutAuthenticationRequestParameters, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 15), (-26) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1335714797) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (ExpandableListView.getPackedPositionType(0L) + 51), (-166142326) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (!Intrinsics.areEqual(challengeResultTimeoutAuthenticationRequestParameters, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            if (!Intrinsics.areEqual(challengeResultTimeoutAuthenticationRequestParameters, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
                e40.a.f();
                return null;
            }
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", TextUtils.indexOf("", "") + 30971, objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a("䢉鸳\ue58c쭶ዘ禸伊隫ﱢ쌖⪭瀱䟓굛\uf43c\udb96ⅳࣙ忪ꔁ賫퉓㦞½嘑뷰荞\uea2b㇖ܩ", 54940 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getsdkreferencenumber.getSDKReferenceNumber());
        getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey3, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        int i12 = getSDKEphemeralPublicKey + 47;
        BuildConfig = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 33 / 0;
        }
        return getsdkappid;
    }

    private static Object getSDKTransactionID(Object[] objArr) throws Throwable {
        b0 b0Var = (b0) objArr[0];
        atd.am.getSDKReferenceNumber getsdkreferencenumber = (atd.am.getSDKReferenceNumber) objArr[1];
        getSDKEphemeralPublicKey = (BuildConfig + 87) % 128;
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<Boolean> sDKReferenceNumber = getSDKReferenceNumber(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (sDKReferenceNumber instanceof ChallengeResultTimeout.getSDKAppID) {
            getSDKTransactionID.getDeviceData getdevicedata = new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) sDKReferenceNumber).getSDKReferenceNumber());
            getSDKEphemeralPublicKey = (BuildConfig + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            return getdevicedata;
        }
        if (Intrinsics.areEqual(sDKReferenceNumber, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a("䢅䢈䣺䣛䠭䡙䡨䦢䦄䧸䧗䥷䤚䥎䪴䫋䫶䫜䨿䨓䩀䯳䯎", KeyEvent.normalizeMetaState(0) + 37, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (!Intrinsics.areEqual(sDKReferenceNumber, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            if (!Intrinsics.areEqual(sDKReferenceNumber, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
                e40.a.f();
                return null;
            }
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", (ViewConfiguration.getEdgeSlop() >> 16) + 30971, objArr3);
            sb3.append(((String) objArr3[0]).intern());
            sb3.append(getsdkreferencenumber.getSDKReferenceNumber());
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr4 = new Object[1];
        a("䢉覻쪜ஞ䳸跀컚ཱི䀊脒쉽͋䑙蚰있ᣛ姶髊\udbc8ᱯ崂鸐\udf6b၏兜鏷퓂", (ViewConfiguration.getPressedStateDuration() >> 16) + 49429, objArr4);
        sb4.append(((String) objArr4[0]).intern());
        sb4.append(getsdkreferencenumber.getSDKReferenceNumber());
        getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey3, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        int i11 = getSDKEphemeralPublicKey + 105;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{ByteCompanionObject.MAX_VALUE, 102, 3, -17};
        $$b = 170;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<Boolean> AuthenticationRequestParameters(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) {
        int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        return (atd.am.getSDKTransactionID) getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID3, new Object[]{b0Var, getsdkreferencenumber}, sDKAppID2, sDKAppID, -489461748, 489461751);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (getDeviceData(r1.b()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final atd.d.ChallengeResultTimeout<java.lang.Integer> getSDKAppID(n90.b0 r2, java.lang.String r3) {
        /*
            int r0 = atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey
            int r0 = r0 + 85
            int r0 = r0 % 128
            atd.d.getSDKEphemeralPublicKey.BuildConfig = r0
            boolean r0 = r2.containsKey(r3)
            r1 = 0
            if (r0 != 0) goto L21
            int r2 = atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey
            int r2 = r2 + 115
            int r3 = r2 % 128
            atd.d.getSDKEphemeralPublicKey.BuildConfig = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L1e
            atd.d.ChallengeResultTimeout$getSDKReferenceNumber r2 = atd.d.ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters
            return r2
        L1e:
            atd.d.ChallengeResultTimeout$getSDKReferenceNumber r2 = atd.d.ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters
            throw r1
        L21:
            java.lang.Object r2 = kotlin.collections.x0.c(r3, r2)
            boolean r3 = r2 instanceof n90.g0
            if (r3 == 0) goto L2c
            r1 = r2
            n90.g0 r1 = (n90.g0) r1
        L2c:
            if (r1 != 0) goto L31
            atd.d.ChallengeResultTimeout$getSDKTransactionID r2 = atd.d.ChallengeResultTimeout.getSDKTransactionID.getDeviceData
            return r2
        L31:
            boolean r2 = r1 instanceof n90.y
            if (r2 != 0) goto L5f
            boolean r2 = r1.d()
            if (r2 == 0) goto L4e
            int r2 = atd.d.getSDKEphemeralPublicKey.BuildConfig
            int r2 = r2 + 73
            int r2 = r2 % 128
            atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey = r2
            java.lang.String r2 = r1.b()
            boolean r2 = getDeviceData(r2)
            if (r2 == 0) goto L4e
            goto L5f
        L4e:
            atd.d.ChallengeResultTimeout$getSDKAppID r2 = new atd.d.ChallengeResultTimeout$getSDKAppID     // Catch: java.lang.NumberFormatException -> L5c
            int r3 = n90.o.e(r1)     // Catch: java.lang.NumberFormatException -> L5c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L5c
            r2.<init>(r3)     // Catch: java.lang.NumberFormatException -> L5c
            return r2
        L5c:
            atd.d.ChallengeResultTimeout$getSDKTransactionID r2 = atd.d.ChallengeResultTimeout.getSDKTransactionID.getDeviceData
            return r2
        L5f:
            atd.d.ChallengeResultTimeout$getDeviceData r2 = atd.d.ChallengeResultTimeout.getDeviceData.getSDKTransactionID
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKEphemeralPublicKey.getSDKAppID(n90.b0, java.lang.String):atd.d.ChallengeResultTimeout");
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        boolean zK = false;
        String str = (String) objArr[0];
        int i11 = BuildConfig + 55;
        getSDKEphemeralPublicKey = i11 % 128;
        try {
            zK = i11 % 2 == 0 ? kotlin.text.y.k(UUID.fromString(str).toString(), str, true) : kotlin.text.y.k(UUID.fromString(str).toString(), str, false);
        } catch (IllegalArgumentException unused) {
        }
        return Boolean.valueOf(zK);
    }

    private static final boolean getSDKAppID(String str) {
        int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        return ((Boolean) getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID3, new Object[]{str}, sDKAppID2, sDKAppID, -127459884, 127459885)).booleanValue();
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<String> getSDKAppID(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) {
        int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        return (atd.am.getSDKTransactionID) getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID3, new Object[]{b0Var, getsdkreferencenumber}, sDKAppID2, sDKAppID, 1505785998, -1505785998);
    }

    private static final ChallengeResultTimeout<e> BuildConfig(b0 b0Var, String str) {
        getSDKEphemeralPublicKey = (BuildConfig + 81) % 128;
        if (!b0Var.containsKey(str)) {
            return ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters;
        }
        n nVar = (n) x0.c(str, b0Var);
        if (nVar instanceof y) {
            getSDKEphemeralPublicKey = (BuildConfig + 33) % 128;
            ChallengeResultTimeout.getDeviceData getdevicedata = ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
            int i11 = getSDKEphemeralPublicKey + 67;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 92 / 0;
            }
            return getdevicedata;
        }
        if (!(nVar instanceof e)) {
            return ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
        }
        if (((e) nVar).f30756a.isEmpty()) {
            return ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
        }
        return new ChallengeResultTimeout.getSDKAppID(nVar);
    }

    private static final ChallengeResultTimeout<String> getMessageVersion(b0 b0Var, String str) {
        ChallengeResultTimeout<String> deviceData = getDeviceData(b0Var, str);
        if (deviceData instanceof ChallengeResultTimeout.getSDKAppID) {
            Object[] objArr = {(String) ((ChallengeResultTimeout.getSDKAppID) deviceData).getSDKReferenceNumber()};
            int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
            int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
            if (!((Boolean) getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr, sDKAppID2, sDKAppID, -127459884, 127459885)).booleanValue()) {
                BuildConfig = (getSDKEphemeralPublicKey + 113) % 128;
                return ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
            }
        }
        int i11 = BuildConfig + 81;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return deviceData;
        }
        throw null;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<String> getSDKTransactionID(@NotNull b0 b0Var, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<String> deviceData = getDeviceData(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (deviceData instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) deviceData).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", 30971 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getsdkreferencenumber);
            getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
            int i11 = getSDKEphemeralPublicKey + 63;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                return getsdkappid;
            }
            throw null;
        }
        if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", 30971 - View.MeasureSpec.getSize(0), objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getsdkreferencenumber);
            getSDKTransactionID.getSDKAppID getsdkappid2 = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
            int i12 = BuildConfig + 83;
            getSDKEphemeralPublicKey = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 39 / 0;
            }
            return getsdkappid2;
        }
        if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30971, objArr3);
            sb4.append(((String) objArr3[0]).intern());
            sb4.append(getsdkreferencenumber);
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey3, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        e40.a.f();
        return null;
    }

    private static Object getDeviceData(Object[] objArr) throws Throwable {
        byte b8 = 0;
        b0 b0Var = (b0) objArr[0];
        String str = (String) objArr[1];
        int i11 = getSDKEphemeralPublicKey + 111;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            b0Var.getClass();
            str.getClass();
            ChallengeResultTimeout<String> deviceData = getDeviceData(b0Var, str);
            if (deviceData instanceof ChallengeResultTimeout.getSDKAppID) {
                return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) deviceData).getSDKReferenceNumber());
            }
            if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
                atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a("䢅蟀홪⛳甍䗁鐨\ue352㏍ɹ勦ꅕ\uf1fc", (ViewConfiguration.getEdgeSlop() >> 16) + 53101, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(str);
                return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey, b8), null, null, 12);
            }
            if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
                atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_MISSING_REQUIRED;
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr3 = new Object[1];
                a("䢆げ륓≝ꭈᐇ鵯ٴ轫ࡠ\uf167穧\ue363汅핚", 30971 - Drawable.resolveOpacity(0, 0), objArr3);
                sb3.append(((String) objArr3[0]).intern());
                sb3.append(str);
                getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, getsdkephemeralpublickey2, b8), null, null, 12);
                BuildConfig = (getSDKEphemeralPublicKey + 3) % 128;
                return getsdkappid;
            }
            if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
                atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey3 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr4 = new Object[1];
                a("䢉嘏痴ፂ㈨톌｢麇붮嬆竸ᡆ✭욙\ue42e菉ꊿ䀃澲ൕⰽ쮐\ue97a裓韢땙", 7841 - Color.argb(0, 0, 0, 0), objArr4);
                sb4.append(((String) objArr4[0]).intern());
                sb4.append(str);
                return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, new atd.ac.getSDKAppID(sb4.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey3, b8), null, null, 12);
            }
            e40.a.f();
            return null;
        }
        b0Var.getClass();
        str.getClass();
        getDeviceData(b0Var, str);
        throw null;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<b0> getSDKTransactionID(@NotNull n nVar, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        b0 b0Var;
        atd.ac.getSDKAppID getsdkappid;
        nVar.getClass();
        getsdkreferencenumber.getClass();
        if (nVar instanceof b0) {
            b0Var = (b0) nVar;
            getSDKEphemeralPublicKey = (BuildConfig + 101) % 128;
        } else {
            BuildConfig = (getSDKEphemeralPublicKey + 49) % 128;
            b0Var = null;
        }
        if (b0Var == null) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            byte b8 = 0;
            if (getsdkreferencenumber == atd.am.getSDKReferenceNumber.NONE) {
                Object[] objArr = new Object[1];
                b((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 30), View.getDefaultSize(0, 0) - 26, (-1335714741) - Process.getGidForName(""), (short) (42 - View.MeasureSpec.getMode(0)), (-166142323) - TextUtils.lastIndexOf("", '0', 0), objArr);
                getsdkappid = new atd.ac.getSDKAppID(((String) objArr[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey, b8);
            } else {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a("䢉滷Є㮪퇈\uf714꺲䒏穭ᆌ㟊\ued67蒕멥偸瞞ⴵ썅\ufae6遡똔", (ViewConfiguration.getTouchSlop() >> 8) + 9817, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
                getsdkappid = new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey, getsdkreferencenumber);
            }
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, getsdkappid, getsdkreferencenumber, null, 8);
        }
        getSDKTransactionID.getDeviceData getdevicedata = new getSDKTransactionID.getDeviceData(b0Var);
        BuildConfig = (getSDKEphemeralPublicKey + 113) % 128;
        return getdevicedata;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<String> getSDKTransactionID(@NotNull b0 b0Var, @NotNull String str) {
        int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        return (atd.am.getSDKTransactionID) getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID3, new Object[]{b0Var, str}, sDKAppID2, sDKAppID, -1165482257, 1165482259);
    }

    private static Object getSDKReferenceNumber(Object[] objArr) throws Throwable {
        b0 b0Var = (b0) objArr[0];
        atd.am.getSDKReferenceNumber getsdkreferencenumber = (atd.am.getSDKReferenceNumber) objArr[1];
        getSDKEphemeralPublicKey = (BuildConfig + 103) % 128;
        b0Var.getClass();
        getsdkreferencenumber.getClass();
        ChallengeResultTimeout<String> deviceData = getDeviceData(b0Var, getsdkreferencenumber.getSDKReferenceNumber());
        if (deviceData instanceof ChallengeResultTimeout.getSDKAppID) {
            return new getSDKTransactionID.getDeviceData(((ChallengeResultTimeout.getSDKAppID) deviceData).getSDKReferenceNumber());
        }
        if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters)) {
            return new getSDKTransactionID.getDeviceData(null);
        }
        if (Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getDeviceData.getSDKTransactionID)) {
            atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a("䢆ꀺ馃\uf115\ueae8숿㯛ᒶ౸斎崓뛡깐蟎\uf0f0\ue87d", ((byte) KeyEvent.getModifierMetaStateMask()) + 59540, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(getsdkreferencenumber);
            return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey, new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        }
        if (!Intrinsics.areEqual(deviceData, ChallengeResultTimeout.getSDKTransactionID.getDeviceData)) {
            e40.a.f();
            return null;
        }
        atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey2 = atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b((byte) (ExpandableListView.getPackedPositionGroup(0L) - 31), (-26) - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 1335714823, (short) ((-9) - Drawable.resolveOpacity(0, 0)), TextUtils.getOffsetBefore("", 0) - 166142325, objArr3);
        sb3.append(((String) objArr3[0]).intern());
        sb3.append(getsdkreferencenumber);
        getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, new atd.ac.getSDKAppID(sb3.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getsdkephemeralpublickey2, getsdkreferencenumber), getsdkreferencenumber, null, 8);
        int i11 = BuildConfig + 67;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    private static final ChallengeResultTimeout<String> getDeviceData(b0 b0Var, String str) {
        g0 g0Var;
        BuildConfig = (getSDKEphemeralPublicKey + 109) % 128;
        if (!b0Var.containsKey(str)) {
            return ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters;
        }
        Object objC = x0.c(str, b0Var);
        if (objC instanceof g0) {
            int i11 = BuildConfig + 111;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 != 0) {
                g0Var = (g0) objC;
            } else {
                throw null;
            }
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            int i12 = BuildConfig + 95;
            getSDKEphemeralPublicKey = i12 % 128;
            if (i12 % 2 != 0) {
                return ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
            }
            ChallengeResultTimeout.getSDKTransactionID getsdktransactionid = ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
            throw null;
        }
        m90.g0 g0Var2 = o.f30779a;
        String strB = g0Var instanceof y ? null : g0Var.b();
        if (strB != null && !getDeviceData(strB)) {
            getSDKEphemeralPublicKey = (BuildConfig + 71) % 128;
            ChallengeResultTimeout.getSDKAppID getsdkappid = new ChallengeResultTimeout.getSDKAppID(g0Var.b());
            int i13 = getSDKEphemeralPublicKey + 111;
            BuildConfig = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 77 / 0;
            }
            return getsdkappid;
        }
        return ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
    }

    private static final boolean getDeviceData(String str) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 75;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (str == null || str.length() == 0) {
            getSDKEphemeralPublicKey = (BuildConfig + 97) % 128;
        } else {
            Object[] objArr = new Object[1];
            a("䢮Ԅ폎ꆿ", 19890 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            if (!kotlin.text.y.k(str, ((String) objArr[0]).intern(), true)) {
                int i12 = getSDKEphemeralPublicKey + 91;
                BuildConfig = i12 % 128;
                if (i12 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    private static final ChallengeResultTimeout<Boolean> getSDKReferenceNumber(b0 b0Var, String str) {
        g0 g0Var;
        if (!b0Var.containsKey(str)) {
            return ChallengeResultTimeout.getSDKReferenceNumber.AuthenticationRequestParameters;
        }
        Object objC = x0.c(str, b0Var);
        if (objC instanceof g0) {
            int i11 = getSDKEphemeralPublicKey + 65;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                g0Var = (g0) objC;
                int i12 = 73 / 0;
            } else {
                g0Var = (g0) objC;
            }
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            return ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
        }
        if (!(g0Var instanceof y)) {
            getSDKEphemeralPublicKey = (BuildConfig + 79) % 128;
            if (!g0Var.d() || !getDeviceData(g0Var.b())) {
                m90.g0 g0Var2 = o.f30779a;
                if (o90.a0.b(g0Var.b()) == null) {
                    int i13 = getSDKEphemeralPublicKey + 3;
                    BuildConfig = i13 % 128;
                    if (i13 % 2 == 0) {
                        return ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
                    }
                    int i14 = 42 / 0;
                    return ChallengeResultTimeout.getSDKTransactionID.getDeviceData;
                }
                return new ChallengeResultTimeout.getSDKAppID(Boolean.valueOf(o.d(g0Var)));
            }
        }
        return ChallengeResultTimeout.getDeviceData.getSDKTransactionID;
    }
}
