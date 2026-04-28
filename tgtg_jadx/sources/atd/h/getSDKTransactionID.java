package atd.h;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.am.getSDKEphemeralPublicKey;
import atd.bb.completed;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getSDKTransactionID[] $VALUES;
    private static int AuthenticationRequestParameters;
    public static final getSDKTransactionID HTML_UI;
    private static String MESSAGE_FORMAT_INVALID_ID;
    public static final getSDKTransactionID MULTI_SELECT;
    public static final getSDKTransactionID OUT_OF_BAND;
    public static final getSDKTransactionID SINGLE_SELECT;
    public static final getSDKTransactionID SINGLE_TEXT_INPUT;
    private static long getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private int mId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 120
            byte[] r0 = atd.h.getSDKTransactionID.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKTransactionID.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters();
        SystemClock.currentThreadTimeMillis();
        Object[] objArr = new Object[1];
        a("䈁芟䉒⟣八菭◛劝䚡蓽⃞妢䮜觔⯹岽䲌贮㚉䍋凥", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        SINGLE_TEXT_INPUT = new getSDKTransactionID(((String) objArr[0]).intern(), 0, 1);
        Object[] objArr2 = new Object[1];
        a("默\ue034麋쒭뿧\ue146욕밑驸\ue656쎐뜩靅\ueb6b좦눭遈", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        SINGLE_SELECT = new getSDKTransactionID(((String) objArr2[0]).intern(), 1, 2);
        Object[] objArr3 = new Object[1];
        a("Ώ孁ᾶ⦞ᜫ娯⮤ᓎ᭞崹⺯ῳᙯ倗▓\u1af6", -TextUtils.lastIndexOf("", '0', 0), objArr3);
        MULTI_SELECT = new getSDKTransactionID(((String) objArr3[0]).intern(), 2, 3);
        Object[] objArr4 = new Object[1];
        a("ܐ岴ݟꙖ수巚ꑴ쇶γ嫕ꅫ쫇ຉ埩꩜", 1 - View.resolveSizeAndState(0, 0, 0), objArr4);
        OUT_OF_BAND = new getSDKTransactionID(((String) objArr4[0]).intern(), 3, 4);
        Object[] objArr5 = new Object[1];
        a("툹ኰ퉱ꍤ坛Ꮯꅟ咦횊ᓂꑏ", -TextUtils.lastIndexOf("", '0', 0), objArr5);
        HTML_UI = new getSDKTransactionID(((String) objArr5[0]).intern(), 4, 5);
        $VALUES = getSDKTransactionID();
        int i11 = AuthenticationRequestParameters + 113;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private getSDKTransactionID(String str, int i11, int i12) {
        this.mId = i12;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = 9064890904299407337L;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 73) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getDeviceData ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        $11 = ($10 + 67) % 128;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getDeviceData)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int offsetBefore = 2774 - TextUtils.getOffsetBefore("", 0);
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13061);
                    int size = View.MeasureSpec.getSize(0) + 25;
                    byte b8 = (byte) 0;
                    byte b11 = (byte) (b8 - 1);
                    String str$$c = $$c(b8, b11, (byte) (b11 + 1));
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(offsetBefore, packedPositionChild, size, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 408, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 30 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static getSDKTransactionID getSDKReferenceNumber(int i11) throws Throwable {
        getSDKTransactionID[] getsdktransactionidArrValues = values();
        getSDKTransactionID = (getSDKReferenceNumber + 63) % 128;
        for (getSDKTransactionID getsdktransactionid : getsdktransactionidArrValues) {
            if (getsdktransactionid.mId == i11) {
                getSDKTransactionID = (getSDKReferenceNumber + 95) % 128;
                return getsdktransactionid;
            }
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        a("귾ｆ궷䔹䇡︓䜹䈱\ua97e龜䈿䥜ꑯ\uf411䥍䱈ꌟ\uf0ca", 1 - (Process.myTid() >> 22), objArr);
        throw new atd.ac.getSDKAppID(String.format(locale, ((String) objArr[0]).intern(), Integer.valueOf(i11)), getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getSDKEphemeralPublicKey.INVALID_CHALLENGE_TYPE);
    }

    private static /* synthetic */ getSDKTransactionID[] getSDKTransactionID() {
        getSDKTransactionID[] getsdktransactionidArr;
        int i11 = getSDKReferenceNumber + 33;
        int i12 = i11 % 128;
        getSDKTransactionID = i12;
        if (i11 % 2 == 0) {
            getsdktransactionidArr = new getSDKTransactionID[5];
            getsdktransactionidArr[1] = SINGLE_TEXT_INPUT;
            getsdktransactionidArr[0] = SINGLE_SELECT;
            getsdktransactionidArr[2] = MULTI_SELECT;
            getsdktransactionidArr[4] = OUT_OF_BAND;
            getsdktransactionidArr[4] = HTML_UI;
        } else {
            getsdktransactionidArr = new getSDKTransactionID[]{SINGLE_TEXT_INPUT, SINGLE_SELECT, MULTI_SELECT, OUT_OF_BAND, HTML_UI};
        }
        int i13 = i12 + 71;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 82 / 0;
        }
        return getsdktransactionidArr;
    }

    public static void init$0() {
        $$a = new byte[]{9, -85, -40, 20};
        $$b = 167;
    }

    public static getSDKTransactionID valueOf(String str) {
        int i11 = getSDKReferenceNumber + 31;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return (getSDKTransactionID) Enum.valueOf(getSDKTransactionID.class, str);
        }
        Enum.valueOf(getSDKTransactionID.class, str);
        throw null;
    }

    public static getSDKTransactionID[] values() throws CloneNotSupportedException {
        int i11 = getSDKReferenceNumber + 85;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return (getSDKTransactionID[]) $VALUES.clone();
        }
        $VALUES.clone();
        throw null;
    }

    public final int getSDKReferenceNumber() {
        int i11 = getSDKReferenceNumber + 41;
        int i12 = i11 % 128;
        getSDKTransactionID = i12;
        int i13 = i11 % 2;
        int i14 = this.mId;
        if (i13 == 0) {
            throw null;
        }
        getSDKReferenceNumber = (i12 + 17) % 128;
        return i14;
    }
}
