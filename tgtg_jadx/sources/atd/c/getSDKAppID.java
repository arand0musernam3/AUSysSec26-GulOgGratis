package atd.c;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.z.getSDKAppID;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wd.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R \u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/ChallengeMessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "threeDSRequestorAppURL", "", "messageVersion", "challengeInput", "Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;", "whitelistingDataEntry", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "<init>", "(Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;Lcom/adyen/threeds2/internal/util/DestroyableString;)V", "getChallengeInput", "()Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;", "setChallengeInput", "(Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;)V", "messageExtensions", "", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageExtensionId;", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageExtension;", "requiresEncryption", "", "serialize", "Lorg/json/JSONObject;", "clear", "", "isProtocol", "protocol", "Lcom/adyen/threeds2/internal/Protocol;", "createOutOfBandMessageExtension", "outOfBandChallengeInput", "Lcom/adyen/threeds2/internal/api/challenge/input/OutOfBandChallengeInput;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChallengeMessageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChallengeMessageRequest.kt\ncom/adyen/threeds2/internal/api/challenge/model/ChallengeMessageRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,155:1\n216#2,2:156\n216#2,2:158\n29#3,3:160\n*S KotlinDebug\n*F\n+ 1 ChallengeMessageRequest.kt\ncom/adyen/threeds2/internal/api/challenge/model/ChallengeMessageRequest\n*L\n101#1:156,2\n115#1:158,2\n131#1:160,3\n*E\n"})
public final class getSDKAppID extends ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char BuildConfig;
    private static long ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static long getSDKAppID;

    @Nullable
    private atd.b.getDeviceData<?> getDeviceData;

    @Nullable
    private final atd.bc.AuthenticationRequestParameters getSDKReferenceNumber;

    @NotNull
    private final Map<String, getSDKEphemeralPublicKey> getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r8 = 119 - r8
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = atd.c.getSDKAppID.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKAppID.$$c(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID = 1905653906042338631L;
        AuthenticationRequestParameters = 1040541671;
        BuildConfig = (char) 15687;
        ChallengeResult = -6183472435205215184L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKAppID(@NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber, @Nullable String str, @NotNull String str2, @Nullable atd.b.getDeviceData<?> getdevicedata, @Nullable atd.bc.AuthenticationRequestParameters authenticationRequestParameters) throws Throwable {
        super(atd.h.getSDKAppID.CHALLENGE_REQUEST, getsdkreferencenumber, new atd.bc.AuthenticationRequestParameters(str2), str != null ? new atd.bc.AuthenticationRequestParameters(str) : null);
        getsdkreferencenumber.getClass();
        str2.getClass();
        this.getDeviceData = getdevicedata;
        this.getSDKReferenceNumber = authenticationRequestParameters;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.getSDKTransactionID = linkedHashMap;
        if (getSDKTransactionID(atd.e.AuthenticationRequestParameters.V2_2_0)) {
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", "猐起鈹鐻", "ꀯ㗲ҁ鴊\ue5e7陊얽\uf3d6鷇䋖\uf302\u196f溜䂪", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (15250 - View.combineMeasuredStates(0, 0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            atd.b.getDeviceData<?> getdevicedata2 = this.getDeviceData;
            linkedHashMap.put(strIntern, getDeviceData(getdevicedata2 instanceof atd.b.getSDKEphemeralPublicKey ? (atd.b.getSDKEphemeralPublicKey) getdevicedata2 : null));
        }
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        float f11;
        char c7;
        int i12;
        int i13;
        char[] cArr;
        int i14 = ($11 + 81) % 128;
        $10 = i14;
        if (str3 != null) {
            $11 = (i14 + 19) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr2 = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            charArray2 = str.toCharArray();
            $11 = ($10 + 65) % 128;
        } else {
            charArray2 = str;
        }
        char[] cArr3 = charArray2;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = charArray3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i15 = 0;
        System.arraycopy(charArray3, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c3);
        int i16 = 2;
        cArr5[2] = (char) (cArr5[2] + ((char) i11));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int i17 = 2069 - (TypedValue.complexToFloat(i15) > 0.0f ? 1 : (TypedValue.complexToFloat(i15) == 0.0f ? 0 : -1));
                    char threadPriority = (char) (44657 - ((Process.getThreadPriority(i15) + 20) >> 6));
                    int i18 = (ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)) + 33;
                    byte b8 = (byte) ($$a[3] - 1);
                    f11 = 0.0f;
                    byte b11 = b8;
                    c7 = 1;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i17, threadPriority, i18, -397560981, false, $$c(b8, b11, (byte) (b11 + 2)), new Class[]{Object.class});
                } else {
                    f11 = 0.0f;
                    c7 = 1;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i15) + 3096;
                    i12 = i16;
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 14367);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 18;
                    i13 = i15;
                    byte b12 = $$a[3];
                    byte b13 = (byte) (b12 - 1);
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iIndexOf, touchSlop, tapTimeout, -1211924053, false, $$c(b13, b13, b12), new Class[]{Object.class});
                } else {
                    i12 = i16;
                    i13 = i15;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i19 = cArr4[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[c7] = Integer.valueOf(i19);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i21 = i13;
                    byte b14 = (byte) ($$a[3] - 1);
                    byte b15 = b14;
                    cArr = cArr2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1427 - MotionEvent.axisFromString(""), (char) (TextUtils.lastIndexOf("", '0', i21, i21) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = cArr2;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i22 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[i12];
                objArr5[c7] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[0] = Integer.valueOf(i22);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) ($$a[3] - 1);
                    byte b17 = b16;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (13061 - (AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1))), 25 - TextUtils.indexOf("", ""), -320602145, false, $$c(b16, b17, (byte) (b17 | 51)), new Class[]{cls, cls});
                }
                cArr5[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i23 = oncompletion.getDeviceData;
                cArr6[i23] = (char) (((((long) (r0 ^ cArr[i23])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) BuildConfig) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i23 + 1;
                $10 = ($11 + 119) % 128;
                cArr2 = cArr;
                i16 = 2;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr6);
        int i24 = $10 + 3;
        $11 = i24 % 128;
        if (i24 % 2 != 0) {
            objArr[0] = str4;
        } else {
            int i25 = 94 / 0;
            objArr[0] = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKAppID.b(java.lang.String, int, java.lang.Object[]):void");
    }

    private static getSDKEphemeralPublicKey getDeviceData(atd.b.getSDKEphemeralPublicKey getsdkephemeralpublickey) throws Throwable {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "い偰\u0a3dᝰ", "\uf032✩잃程爼놑㰖묲", View.MeasureSpec.getMode(0), (char) (Process.myPid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "猐起鈹鐻", "ꀯ㗲ҁ鴊\ue5e7陊얽\uf3d6鷇䋖\uf302\u196f溜䂪", ViewConfiguration.getScrollBarSize() >> 8, (char) (15250 - View.MeasureSpec.getSize(0)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        c0 c0Var = new c0();
        String sDKReferenceNumber = atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_VERSION.getSDKReferenceNumber();
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "믕췪짩\ue063", "箹얮뮿", (-372380996) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (25545 - (Process.myPid() >> 22)), objArr3);
        a.D(c0Var, sDKReferenceNumber, ((String) objArr3[0]).intern());
        String sDKReferenceNumber2 = atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_CHALLENGE_DATA.getSDKReferenceNumber();
        sDKReferenceNumber2.getClass();
        c0 c0Var2 = new c0();
        getSDKAppID(getsdkephemeralpublickey, c0Var2);
        c0Var.b(sDKReferenceNumber2, c0Var2.a());
        getSDKEphemeralPublicKey getsdkephemeralpublickey2 = new getSDKEphemeralPublicKey(strIntern, strIntern2, c0Var.a());
        int i11 = getMessageVersion + 63;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 27 / 0;
        }
        return getsdkephemeralpublickey2;
    }

    private static final Unit getSDKAppID(atd.b.getSDKEphemeralPublicKey getsdkephemeralpublickey, c0 c0Var) throws Throwable {
        Object obj;
        ChallengeResultCancelled = (getMessageVersion + 27) % 128;
        c0Var.getClass();
        Object[] objArr = new Object[1];
        b("疷ॢ谐Ϧ蛼ց饳᱙錼᛬闤⢛", 31957 - Color.argb(0, 0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b("痨炞", TextUtils.lastIndexOf("", '0', 0) + 1400, objArr2);
        a.D(c0Var, strIntern, ((String) objArr2[0]).intern());
        if (getsdkephemeralpublickey != null) {
            Object[] objArr3 = new Object[1];
            a("\u0000\u0000\u0000\u0000", "ﳪ瞐\udbc0卵", "\uf343ܠ媸⠝餣柀ꡥ䜼\u31e9꺲襐", (-1065905924) - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr3);
            a.D(c0Var, ((String) objArr3[0]).intern(), getsdkephemeralpublickey.getDeviceData());
            String strChallengeResult = getsdkephemeralpublickey.ChallengeResult();
            if (strChallengeResult != null) {
                int i11 = getMessageVersion + 35;
                ChallengeResultCancelled = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    a("\u0000\u0000\u0000\u0000", "㿵➄\ue1dc惴", "磛횖⥺☴鞡\uea08\uf83a媐嚭㙀ᇱ낳", View.MeasureSpec.getSize(1), (char) TextUtils.getCapsMode("", 1, 1), objArr4);
                    obj = objArr4[0];
                } else {
                    Object[] objArr5 = new Object[1];
                    a("\u0000\u0000\u0000\u0000", "㿵➄\ue1dc惴", "磛횖⥺☴鞡\uea08\uf83a媐嚭㙀ᇱ낳", View.MeasureSpec.getSize(0), (char) TextUtils.getCapsMode("", 0, 0), objArr5);
                    obj = objArr5[0];
                }
                a.D(c0Var, ((String) obj).intern(), strChallengeResult);
            } else {
                getMessageVersion = (ChallengeResultCancelled + 5) % 128;
            }
        }
        return Unit.f26487a;
    }

    private final boolean getSDKTransactionID(atd.e.AuthenticationRequestParameters authenticationRequestParameters) {
        boolean zAreEqual;
        int i11 = getMessageVersion + 35;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        String strAuthenticationRequestParameters = authenticationRequestParameters.AuthenticationRequestParameters();
        if (i12 == 0) {
            Object[] objArr = {getMessageVersion()};
            zAreEqual = Intrinsics.areEqual(strAuthenticationRequestParameters, (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID()));
            int i13 = 14 / 0;
        } else {
            Object[] objArr2 = {getMessageVersion()};
            zAreEqual = Intrinsics.areEqual(strAuthenticationRequestParameters, (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr2, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID()));
        }
        getMessageVersion = (ChallengeResultCancelled + 117) % 128;
        return zAreEqual;
    }

    public static void init$0() {
        $$a = new byte[]{55, 68, 17, 1};
        $$b = 143;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, org.json.JSONObject] */
    @Override // atd.c.ChallengeResultCancelled, atd.i.getDeviceData
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject AuthenticationRequestParameters() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKAppID.AuthenticationRequestParameters():org.json.JSONObject");
    }

    @Override // atd.c.ChallengeResultCancelled
    public final void getSDKReferenceNumber() throws atd.bc.getSDKTransactionID {
        getMessageVersion = (ChallengeResultCancelled + 89) % 128;
        super.getSDKReferenceNumber();
        atd.b.getDeviceData<?> getdevicedata = this.getDeviceData;
        if (getdevicedata != null) {
            ChallengeResultCancelled = (getMessageVersion + 77) % 128;
            getdevicedata.getSDKTransactionID();
        } else {
            ChallengeResultCancelled = (getMessageVersion + 63) % 128;
        }
        this.getDeviceData = null;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        if (authenticationRequestParameters != null) {
            int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
        } else {
            getMessageVersion = (ChallengeResultCancelled + 121) % 128;
        }
        Iterator<Map.Entry<String, getSDKEphemeralPublicKey>> it = this.getSDKTransactionID.entrySet().iterator();
        while (it.hasNext()) {
            ChallengeResultCancelled = (getMessageVersion + 73) % 128;
            it.next().getValue().ChallengeResult();
        }
        this.getSDKTransactionID.clear();
        int i11 = ChallengeResultCancelled + 41;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 52 / 0;
        }
    }

    private /* synthetic */ getSDKAppID(atd.ao.getSDKReferenceNumber getsdkreferencenumber, String str, String str2, byte b8) {
        this(getsdkreferencenumber, str, str2, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSDKAppID(@NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber, @Nullable String str, @NotNull String str2) {
        this(getsdkreferencenumber, str, str2, (byte) 0);
        getsdkreferencenumber.getClass();
        str2.getClass();
    }

    @Override // atd.c.ChallengeResultCancelled
    public final boolean getSDKTransactionID() {
        int i11 = ChallengeResultCancelled + 99;
        getMessageVersion = i11 % 128;
        return i11 % 2 == 0;
    }

    @Nullable
    public final atd.b.getDeviceData<?> getDeviceData() {
        int i11 = ChallengeResultCancelled + 49;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        atd.b.getDeviceData<?> getdevicedata = this.getDeviceData;
        if (i12 != 0) {
            int i13 = 13 / 0;
        }
        return getdevicedata;
    }
}
