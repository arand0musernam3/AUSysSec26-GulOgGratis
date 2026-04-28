package atd.h;

import a80.a;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import atd.bb.ChallengeResultTimeout;
import atd.e.ChallengeResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "", "errorCode", "", "errorDescription", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorDescription", "MESSAGE_RECEIVED_INVALID", "MESSAGE_VERSION_NOT_SUPPORTED", "DATA_ELEMENT_MISSING", "MESSAGE_EXTENSION_MISSING", "DATA_ELEMENT_INVALID_FORMAT", "DUPLICATE_DATA_ELEMENT", "TRANSACTION_ID_NOT_RECOGNIZED", "DATA_DECRYPTION_FAILURE", "ACCESS_DENIED", "ISO_CODE_INVALID", "TRANSACTION_TIMED_OUT", "TRANSIENT_SYSTEM_FAILURE", "SYSTEM_CONNECTION_FAILURE", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ getSDKReferenceNumber[] $VALUES;
    private static getSDKReferenceNumber ACCESS_DENIED;
    private static char[] AuthenticationRequestParameters;

    @NotNull
    private static String COMPONENT;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;

    @NotNull
    private static AuthenticationRequestParameters Companion;
    public static final getSDKReferenceNumber DATA_DECRYPTION_FAILURE;
    public static final getSDKReferenceNumber DATA_ELEMENT_INVALID_FORMAT;
    public static final getSDKReferenceNumber DATA_ELEMENT_MISSING;
    private static getSDKReferenceNumber DUPLICATE_DATA_ELEMENT;
    private static getSDKReferenceNumber ISO_CODE_INVALID;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_MISSING;
    public static final getSDKReferenceNumber MESSAGE_RECEIVED_INVALID;
    public static final getSDKReferenceNumber MESSAGE_VERSION_NOT_SUPPORTED;
    public static final getSDKReferenceNumber SYSTEM_CONNECTION_FAILURE;
    public static final getSDKReferenceNumber TRANSACTION_ID_NOT_RECOGNIZED;
    public static final getSDKReferenceNumber TRANSACTION_TIMED_OUT;
    private static getSDKReferenceNumber TRANSIENT_SYSTEM_FAILURE;

    @NotNull
    private static String TYPE;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    @NotNull
    private final String errorCode;

    @NotNull
    private final String errorDescription;

    private static String $$c(byte b8, short s7, short s8) {
        byte[] bArr = $$a;
        int i11 = s8 + 111;
        int i12 = (s7 * 2) + 4;
        int i13 = b8 * 3;
        byte[] bArr2 = new byte[1 - i13];
        int i14 = 0 - i13;
        int i15 = -1;
        if (bArr == null) {
            i12++;
            i11 = i12 + (-i14);
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i11;
            if (i15 == i14) {
                return new String(bArr2, 0);
            }
            int i16 = bArr[i12];
            i12++;
            i11 += -i16;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber();
        TextUtils.lastIndexOf("", '0');
        TextUtils.getCapsMode("", 0, 0);
        Object[] objArr = new Object[1];
        a(new int[]{1613394226, -399092584, -1644761579, 2145860568, 443380723, 1812269243, 1657135265, 353592181, 1148676011, 1027124727, 572968270, -937264809}, ImageFormat.getBitsPerPixel(0) + 25, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-1167219525, 1411203960}, AndroidCharacter.getMirror('0') - '-', objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{-1698358244, -753221408, 16004382, -1695114751, 2026526426, -248040743, -737177122, 756897487, 328887360, -791960880, 2106534552, -682029076, 1951594816, -1239378852}, 25 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        MESSAGE_RECEIVED_INVALID = new getSDKReferenceNumber(strIntern, 0, strIntern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a(new int[]{1613394226, -399092584, -1644761579, 2145860568, -973149766, -1548496125, -219792222, 1908579156, 2095059601, -49166893, 1671926745, 509805484, -532203016, -929910501, -770141310, 7605077}, TextUtils.getOffsetAfter("", 0) + 29, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{-238699697, 1231089937}, 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{-1698358244, -753221408, 16004382, -1695114751, 1582082959, -293291880, 1542598412, 1784212648, 1395971399, -2034469834, -1130473517, 722458552, 696620177, 1055602661, -1275742390, -1378960524, -1923385274, -1118171735, 1951594816, -1239378852}, (Process.myTid() >> 22) + 37, objArr6);
        MESSAGE_VERSION_NOT_SUPPORTED = new getSDKReferenceNumber(strIntern3, 1, strIntern4, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b(126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, null, "\u008f\u008c\u008d\u008e\u008e\u008d\u008b\u0088\u0087\u008c\u0089\u008b\u0089\u008a\u0089\u0088\u0086\u0087\u0086\u0085", objArr7);
        String strIntern5 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new int[]{474128095, -292339001}, (Process.myTid() >> 22) + 3, objArr8);
        String strIntern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, null, "\u009c\u009b\u009a\u0092\u0084\u0084\u0092\u008b\u0095\u0097\u009a\u0083\u0099\u0083\u0098\u0089\u0095\u0096\u0097\u0096\u0085\u0095\u0094\u0083\u0093\u0092\u0091\u0090\u0083\u0082", objArr9);
        DATA_ELEMENT_MISSING = new getSDKReferenceNumber(strIntern5, 2, strIntern6, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        a(new int[]{1613394226, -399092584, -1644761579, 2145860568, -1651137214, 1778042994, -254319906, -1582029899, -1561974922, 2031095076, 672352868, -1524532351, -1809011422, 1450827282}, 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr10);
        String strIntern7 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u009d\u009e\u009d", objArr11);
        String strIntern8 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(new int[]{465250137, 76208698, -928756876, -856059720, 376646938, -25231505, -1488577394, 198564732, -28315165, 2042514917, -2125946208, -315913923, 1320793243, -1070158112, 1140693749, -697319370, -1617128500, 1606428532, -1462440522, -750633908, -502797020, -1504352000}, 42 - TextUtils.getTrimmedLength(""), objArr12);
        MESSAGE_EXTENSION_MISSING = new getSDKReferenceNumber(strIntern7, 3, strIntern8, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(new int[]{353857248, -2011696292, -1303195391, -1209526013, 1302625690, 670581729, 1148676011, 1027124727, 572968270, -937264809, 1051908456, -543683776, -489414661, -2101440714}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, objArr13);
        String strIntern9 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(TextUtils.indexOf("", "") + 127, null, null, "\u009f\u009e\u009d", objArr14);
        String strIntern10 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        a(new int[]{539903200, -752534576, -1120399736, -1614415317, 67794966, 1876343996, -1466657786, -1670082716, 119802810, 110143762, -1413394883, -1339827123, -1328162223, -1118753825, 1853597159, 60363653, 1767711616, -1369964930, -917115327, 1591054740, -2143617749, -176278469, 148714155, 1796603391}, 47 - View.resolveSizeAndState(0, 0, 0), objArr15);
        DATA_ELEMENT_INVALID_FORMAT = new getSDKReferenceNumber(strIntern9, 4, strIntern10, ((String) objArr15[0]).intern());
        Object[] objArr16 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, null, "\u0087\u008c\u0089\u008b\u0089\u008a\u0089\u0088\u0086\u0087\u0086\u0085\u0088\u0089\u0087\u0086\u0081\u008d\u008a¡ \u0085", objArr16);
        String strIntern11 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 127, null, null, "¢\u009e\u009d", objArr17);
        String strIntern12 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b((-16777089) - Color.rgb(0, 0, 0), null, null, "\u009c\u0097\u009a\u0083\u0099\u0083\u0098\u0089\u0095\u0096\u0097\u0096\u0085\u0095\u0083\u0097\u0096¤\u0092\u0098£\u0091\u0085", objArr18);
        DUPLICATE_DATA_ELEMENT = new getSDKReferenceNumber(strIntern11, 5, strIntern12, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a(new int[]{1637594823, 1078058696, 670571243, -1942498233, -219792222, 1908579156, -1530883150, 2141851493, -1203695510, -1499578655, -1443204305, -1753497019, -1606993148, -1911183921, -770141310, 7605077}, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr19);
        String strIntern13 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b(View.MeasureSpec.getSize(0) + 127, null, null, "¥\u009e\u009f", objArr20);
        String strIntern14 = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        b(126 - ImageFormat.getBitsPerPixel(0), null, null, "\u009c\u0094\u0083\u0084\u0092\u009a\u009b¦¤\u0083\u0082\u0095\u0097¦\u008c\u0095\u0085\u008d\u0095\u009a¦\u0092\u0097¤\u0096\u0084\u009a\u0096\u0093\u0087", objArr21);
        TRANSACTION_ID_NOT_RECOGNIZED = new getSDKReferenceNumber(strIntern13, 6, strIntern14, ((String) objArr21[0]).intern());
        Object[] objArr22 = new Object[1];
        a(new int[]{353857248, -2011696292, 1538401065, 1949730188, -1422452298, 24691256, -219792222, 1908579156, -1316173034, 933188354, 1029952513, 973911335}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, objArr22);
        String strIntern15 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        b(127 - KeyEvent.normalizeMetaState(0), null, null, "\u009d\u009e\u009f", objArr23);
        String strIntern16 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a(new int[]{-2135630903, -1540659051, 1216236946, 1956054087, -357889281, -1002889815, 1542598412, 1784212648, -1465864576, -1834036231, 1437610435, 152085892}, 23 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr24);
        DATA_DECRYPTION_FAILURE = new getSDKReferenceNumber(strIntern15, 7, strIntern16, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        a(new int[]{-1991631637, -36393946, 1556325157, 1643563705, 667746550, 2090212120, -770141310, 7605077}, TextUtils.getOffsetBefore("", 0) + 13, objArr25);
        String strIntern17 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        a(new int[]{2046711206, -153180150}, 3 - TextUtils.indexOf("", ""), objArr26);
        String strIntern18 = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        b(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u009c\u0097\u009a\u0092¦£\u0094\u009a\u0089\u0095\u0094\u0092\u0098\u0096¨\u009a\u008d\u0095§\u0094\u0083\u0092\u009a\u0083\u0085\u0095\u0084\u0084\u0083¤¤\u0086", objArr27);
        ACCESS_DENIED = new getSDKReferenceNumber(strIntern17, 8, strIntern18, ((String) objArr27[0]).intern());
        Object[] objArr28 = new Object[1];
        a(new int[]{-1010022671, 959382693, -1785155196, 1736216363, 1148676011, 1027124727, 572968270, -937264809}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr28);
        String strIntern19 = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, null, "¢\u009e\u009f", objArr29);
        String strIntern20 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        a(new int[]{-415067385, -1665548631, -1138154362, 1816803877, 328887360, -791960880, 2106534552, -682029076, 1951594816, -1239378852}, KeyEvent.keyCodeFromString("") + 17, objArr30);
        ISO_CODE_INVALID = new getSDKReferenceNumber(strIntern19, 9, strIntern20, ((String) objArr30[0]).intern());
        Object[] objArr31 = new Object[1];
        a(new int[]{1637594823, 1078058696, 670571243, -1942498233, -219792222, 1908579156, 1395723944, -886442059, -218292736, -1443557293, 1026894278, -1983252793}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, objArr31);
        String strIntern21 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        a(new int[]{-772322682, -1061959801}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, objArr32);
        String strIntern22 = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        a(new int[]{-1388470400, 391753227, 1195089047, -419911360, 1542598412, 1784212648, -1919039975, 516643141, 1563513620, -1490618226, -1827772231, 737747276}, Color.rgb(0, 0, 0) + 16777238, objArr33);
        TRANSACTION_TIMED_OUT = new getSDKReferenceNumber(strIntern21, 10, strIntern22, ((String) objArr33[0]).intern());
        Object[] objArr34 = new Object[1];
        b(127 - TextUtils.indexOf("", ""), null, null, "\u0089\u0082 \u008a\u008d\u0086ª\u0088\u008b\u0089\u0087\u008e©\u008e\u0088\u0087\u008c\u0089\u008d\u008e\u008c\u0086\u0082\u0087", objArr34);
        String strIntern23 = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        b(KeyEvent.normalizeMetaState(0) + 127, null, null, "\u009f\u009e¢", objArr35);
        String strIntern24 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        b(127 - TextUtils.indexOf("", "", 0, 0), null, null, "\u009c\u0083\u0093\u0091\u0098\u0092\u0096ª\u0095\u0099\u0083\u0097\u0084«\u008e\u0095\u0097\u009a\u0083\u0092\u0084\u009a\u0096\u0093\u0087", objArr36);
        TRANSIENT_SYSTEM_FAILURE = new getSDKReferenceNumber(strIntern23, 11, strIntern24, ((String) objArr36[0]).intern());
        Object[] objArr37 = new Object[1];
        b(128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, null, "\u0089\u0082 \u008a\u008d\u0086ª\u0088\u008c¬\u008d\u0087\u0081\u0089\u008c\u008c¬\u0081\u0088\u008b\u0089\u0087\u008e©\u008e", objArr37);
        String strIntern25 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        a(new int[]{-1943030381, -1649083005}, 3 - TextUtils.getOffsetAfter("", 0), objArr38);
        String strIntern26 = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        a(new int[]{994676771, -640399894, 948685166, 468621901, 1863903931, -327585376, 112861911, 1279445032, 1518437134, -410337194, -2075436892, -1674132479, -647479945, -1504485718}, 25 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr39);
        SYSTEM_CONNECTION_FAILURE = new getSDKReferenceNumber(strIntern25, 12, strIntern26, ((String) objArr39[0]).intern());
        getSDKReferenceNumber[] getsdkreferencenumberArrAuthenticationRequestParameters = AuthenticationRequestParameters();
        $VALUES = getsdkreferencenumberArrAuthenticationRequestParameters;
        n.w(getsdkreferencenumberArrAuthenticationRequestParameters);
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResultCancelled = (ChallengeResult + 27) % 128;
    }

    private getSDKReferenceNumber(String str, int i11, String str2, String str3) {
        this.errorCode = str2;
        this.errorDescription = str3;
    }

    private static final /* synthetic */ getSDKReferenceNumber[] AuthenticationRequestParameters() {
        int i11 = getMessageVersion;
        getSDKReferenceNumber[] getsdkreferencenumberArr = {MESSAGE_RECEIVED_INVALID, MESSAGE_VERSION_NOT_SUPPORTED, DATA_ELEMENT_MISSING, MESSAGE_EXTENSION_MISSING, DATA_ELEMENT_INVALID_FORMAT, DUPLICATE_DATA_ELEMENT, TRANSACTION_ID_NOT_RECOGNIZED, DATA_DECRYPTION_FAILURE, ACCESS_DENIED, ISO_CODE_INVALID, TRANSACTION_TIMED_OUT, TRANSIENT_SYSTEM_FAILURE, SYSTEM_CONNECTION_FAILURE};
        getSDKEphemeralPublicKey = (i11 + 63) % 128;
        return getsdkreferencenumberArr;
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        long j9;
        float f11;
        int length;
        int[] iArr2;
        int i12;
        char[] cArr;
        float f12;
        int i13;
        int i14;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i15 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKTransactionID;
        int i16 = -1667528016;
        Class cls = Integer.TYPE;
        int i17 = 0;
        if (iArr3 != null) {
            $10 = ($11 + 29) % 128;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i18 = 0;
            j9 = 0;
            while (i18 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i18])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i16);
                    if (sDKTransactionID == null) {
                        i14 = i16;
                        byte b8 = (byte) ($$b - 2);
                        i13 = i15;
                        byte b11 = b8;
                        sDKTransactionID = ChallengeResult.getDeviceData((-16774993) - Color.rgb(0, 0, 0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 53070), 22 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1089703072, false, $$c(b8, b11, (byte) (b11 + 3)), new Class[]{cls});
                    } else {
                        i13 = i15;
                        i14 = i16;
                    }
                    iArr4[i18] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i18++;
                    i16 = i14;
                    i15 = i13;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        } else {
            j9 = 0;
        }
        int i19 = i15;
        int i21 = i16;
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getSDKTransactionID;
        float f13 = 0.0f;
        if (iArr6 != null) {
            int i22 = $10 + 85;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i12 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i12 = 0;
            }
            while (i12 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i12])};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i21);
                if (sDKTransactionID2 == null) {
                    int edgeSlop = 2223 - (ViewConfiguration.getEdgeSlop() >> 16);
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53070);
                    int i23 = (TypedValue.complexToFraction(i17, f13, f13) > f13 ? 1 : (TypedValue.complexToFraction(i17, f13, f13) == f13 ? 0 : -1)) + 21;
                    f12 = f13;
                    byte b12 = (byte) ($$b - 2);
                    byte b13 = b12;
                    cArr = cArr2;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(edgeSlop, scrollDefaultDelay, i23, 1089703072, false, $$c(b12, b13, (byte) (b13 + 3)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    f12 = f13;
                }
                iArr2[i12] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i12++;
                f13 = f12;
                cArr2 = cArr;
                i17 = 0;
            }
            iArr6 = iArr2;
        }
        char[] cArr4 = cArr2;
        float f14 = f13;
        int i24 = 16;
        int i25 = i17;
        System.arraycopy(iArr6, i25, iArr5, i25, length3);
        getmessageversion.getSDKAppID = i25;
        while (true) {
            int i26 = getmessageversion.getSDKAppID;
            if (i26 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            $10 = ($11 + 37) % 128;
            int i27 = iArr[i26];
            char c3 = (char) (i27 >> 16);
            cArr4[0] = c3;
            char c7 = (char) i27;
            cArr4[1] = c7;
            char c8 = (char) (iArr[i26 + 1] >> 16);
            cArr4[i19] = c8;
            char c11 = (char) iArr[i26 + 1];
            cArr4[3] = c11;
            getmessageversion.getDeviceData = (c3 << 16) + c7;
            getmessageversion.AuthenticationRequestParameters = (c8 << 16) + c11;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i28 = 0;
            while (i28 < i24) {
                int i29 = $11 + 99;
                $10 = i29 % 128;
                int i31 = i29 % 2;
                int i32 = getmessageversion.getDeviceData;
                if (i31 != 0) {
                    int i33 = iArr5[i28] ^ i32;
                    getmessageversion.getDeviceData = i33;
                    int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[i19] = getmessageversion;
                    objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) ($$b - 2);
                        byte b15 = b14;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(2386 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 19, -2040903174, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i28 += 92;
                } else {
                    int i34 = iArr5[i28] ^ i32;
                    getmessageversion.getDeviceData = i34;
                    int sDKReferenceNumber2 = atd.bb.getMessageVersion.getSDKReferenceNumber(i34);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = getmessageversion;
                    objArr5[i19] = getmessageversion;
                    objArr5[1] = Integer.valueOf(sDKReferenceNumber2);
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) ($$b - 2);
                        byte b17 = b16;
                        sDKTransactionID4 = ChallengeResult.getDeviceData((TypedValue.complexToFloat(0) > f14 ? 1 : (TypedValue.complexToFloat(0) == f14 ? 0 : -1)) + 2386, (char) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > j9 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j9 ? 0 : -1)) + 20, -2040903174, false, $$c(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue2;
                    i28++;
                }
                $10 = ($11 + 113) % 128;
                i24 = 16;
            }
            int i35 = getmessageversion.getDeviceData;
            int i36 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i36;
            getmessageversion.AuthenticationRequestParameters = i35;
            i24 = 16;
            int i37 = i35 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i37;
            int i38 = i36 ^ iArr5[17];
            getmessageversion.getDeviceData = i38;
            cArr4[0] = (char) (i38 >>> 16);
            cArr4[1] = (char) i38;
            cArr4[i19] = (char) (i37 >>> 16);
            cArr4[3] = (char) i37;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i39 = getmessageversion.getSDKAppID;
            cArr3[i39 * 2] = cArr4[0];
            cArr3[(i39 * 2) + 1] = cArr4[1];
            cArr3[(i39 * 2) + 2] = cArr4[i19];
            cArr3[(i39 * 2) + 3] = cArr4[3];
            int i41 = i19;
            Object[] objArr6 = new Object[i41];
            objArr6[1] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                f11 = f14;
                int i42 = 1861 - (TypedValue.complexToFraction(0, f11, f11) > f11 ? 1 : (TypedValue.complexToFraction(0, f11, f11) == f11 ? 0 : -1));
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int scrollBarSize = 40 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i43 = $$b;
                byte b18 = (byte) (i43 - 2);
                sDKTransactionID5 = ChallengeResult.getDeviceData(i42, windowTouchSlop, scrollBarSize, -562771681, false, $$c(b18, b18, (byte) i43), new Class[]{Object.class, Object.class});
            } else {
                f11 = f14;
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i19 = i41;
            f14 = f11;
        }
    }

    private static void b(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i12;
        int length;
        char[] cArr;
        String str3 = str2;
        int i13 = $10 + 25;
        int i14 = i13 % 128;
        $11 = i14;
        int i15 = 2;
        Object bytes = str3;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            $10 = (i14 + 43) % 128;
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            int i16 = $11 + 91;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int i18 = 2556 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48598);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31;
                        byte b8 = (byte) ($$b - i15);
                        byte b11 = b8;
                        sDKTransactionID = ChallengeResult.getDeviceData(i18, c3, keyRepeatTimeout, -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                    }
                    cArr[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i17++;
                    i15 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(getDeviceData)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = ChallengeResult.getDeviceData(Color.alpha(0) + 147, (char) TextUtils.indexOf("", ""), 32 - ((Process.getThreadPriority(0) + 20) >> 6), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i19 = 1124287645;
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr3 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i21] = (char) (cArr2[bArr[(i22 - 1) - i21] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(i19);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) ($$b - 2);
                    i12 = i19;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1697 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1620360563, false, $$c(b12, b12, (byte) $$a.length), new Class[]{Object.class, Object.class});
                } else {
                    i12 = i19;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i19 = i12;
            }
        } else {
            if (getSDKReferenceNumber) {
                $10 = ($11 + 79) % 128;
                int length3 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                char[] cArr4 = new char[length3];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i23 = challengeResultTimeout.getSDKAppID;
                    int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i23 >= i24) {
                        break;
                    }
                    $10 = ($11 + 119) % 128;
                    cArr4[i23] = (char) (cArr2[charArray[(i24 - 1) - i23] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b13 = (byte) ($$b - 2);
                        sDKTransactionID4 = ChallengeResult.getDeviceData(View.resolveSizeAndState(0, 0, 0) + 1697, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (Process.myTid() >> 22) + 29, -1620360563, false, $$c(b13, b13, (byte) $$a.length), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                    $10 = ($11 + 83) % 128;
                }
                String str4 = new String(cArr4);
                int i25 = $11 + 107;
                $10 = i25 % 128;
                if (i25 % 2 == 0) {
                    objArr[0] = str4;
                    return;
                } else {
                    int i26 = 62 / 0;
                    objArr[0] = str4;
                    return;
                }
            }
            int i27 = 0;
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            while (true) {
                challengeResultTimeout.getSDKAppID = i27;
                int i28 = challengeResultTimeout.getSDKAppID;
                int i29 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i28 >= i29) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i28] = (char) (cArr2[iArr[(i29 - 1) - i28] - i11] - iIntValue);
                    i27 = i28 + 1;
                }
            }
        }
    }

    public static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new char[]{21772, 21823, 21842, 21852, 21773, 21774, 21821, 21800, 21810, 21813, 21818, 21819, 21814, 21820, 21808, 21854, 21826, 21846, 21855, 21805, 21737, 21806, 21853, 21845, 21850, 21851, 21840, 21787, 21791, 21785, 21788, 21794, 21817, 21789, 21849, 21804, 21790, 21848, 21781, 21827, 21798, 21811, 21830, 21816};
        getDeviceData = 1286296777;
        getSDKReferenceNumber = true;
        getSDKAppID = true;
        getSDKTransactionID = new int[]{1767264259, 417197921, -2080325962, 517185123, -155843384, -1934867082, 1603603347, 32026917, -1477297816, -2017207791, -2138983574, -1414462903, 684111974, -1848301088, 828180825, 299740233, -1341134009, 289144292};
    }

    public static void init$0() {
        $$a = new byte[]{71, 110, 67, -59};
        $$b = 2;
    }

    public static getSDKReferenceNumber valueOf(String str) {
        getSDKEphemeralPublicKey = (getMessageVersion + 27) % 128;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) Enum.valueOf(getSDKReferenceNumber.class, str);
        int i11 = getSDKEphemeralPublicKey + 111;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    public static getSDKReferenceNumber[] values() {
        getMessageVersion = (getSDKEphemeralPublicKey + 125) % 128;
        getSDKReferenceNumber[] getsdkreferencenumberArr = (getSDKReferenceNumber[]) $VALUES.clone();
        getMessageVersion = (getSDKEphemeralPublicKey + 115) % 128;
        return getsdkreferencenumberArr;
    }

    @NotNull
    public final String getSDKAppID() {
        int i11 = (getMessageVersion + 7) % 128;
        getSDKEphemeralPublicKey = i11;
        String str = this.errorDescription;
        getMessageVersion = (i11 + 3) % 128;
        return str;
    }

    @NotNull
    public final String getSDKTransactionID() {
        int i11 = (getMessageVersion + 37) % 128;
        getSDKEphemeralPublicKey = i11;
        String str = this.errorCode;
        getMessageVersion = (i11 + 97) % 128;
        return str;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType$Companion;", "", "<init>", "()V", "COMPONENT", "", CredentialProviderBaseController.TYPE_TAG, "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
