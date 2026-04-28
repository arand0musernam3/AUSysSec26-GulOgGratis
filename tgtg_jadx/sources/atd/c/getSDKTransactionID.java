package atd.c;

import a40.d0;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.l.getSDKReferenceNumber;
import java.lang.reflect.Method;
import n90.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class getSDKTransactionID implements Parcelable {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    public static final Parcelable.Creator<getSDKTransactionID> CREATOR;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int[] getSDKReferenceNumber;
    private atd.h.getSDKTransactionID getSDKTransactionID;

    /* JADX INFO: renamed from: atd.c.getSDKTransactionID$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass2 {
        private static int AuthenticationRequestParameters = 1;
        private static int getDeviceData;
        static final /* synthetic */ int[] getSDKTransactionID;

        static {
            int[] iArr = new int[atd.h.getSDKTransactionID.values().length];
            getSDKTransactionID = iArr;
            try {
                iArr[atd.h.getSDKTransactionID.SINGLE_TEXT_INPUT.ordinal()] = 1;
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 ^ 69;
                int i13 = ((i11 & 69) | i12) << 1;
                int i14 = -i12;
                getDeviceData = ((i13 & i14) + (i13 | i14)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKTransactionID[atd.h.getSDKTransactionID.SINGLE_SELECT.ordinal()] = 2;
                int i15 = AuthenticationRequestParameters;
                int i16 = ((i15 ^ 27) | (i15 & 27)) << 1;
                int i17 = -(((~i15) & 27) | (i15 & (-28)));
                getDeviceData = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                getSDKTransactionID[atd.h.getSDKTransactionID.MULTI_SELECT.ordinal()] = 3;
                int i18 = getDeviceData + 98;
                AuthenticationRequestParameters = ((i18 ^ (-1)) + (i18 << 1)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                getSDKTransactionID[atd.h.getSDKTransactionID.OUT_OF_BAND.ordinal()] = 4;
                int i19 = AuthenticationRequestParameters;
                int i21 = i19 ^ 3;
                int i22 = ((3 & i19) | i21) << 1;
                int i23 = -i21;
                getDeviceData = (((i22 | i23) << 1) - (i22 ^ i23)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                getSDKTransactionID[atd.h.getSDKTransactionID.HTML_UI.ordinal()] = 5;
                int i24 = AuthenticationRequestParameters;
                int i25 = ((i24 ^ 48) + ((i24 & 48) << 1)) - 1;
                getDeviceData = i25 % 128;
                if (i25 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, int r6, byte r7) {
        /*
            byte[] r0 = atd.c.getSDKTransactionID.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = r5 + 112
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKTransactionID.$$g(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getMessageVersion = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        CREATOR = new Parcelable.Creator<getSDKTransactionID>() { // from class: atd.c.getSDKTransactionID.4
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKAppID;

            private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
                Parcel parcel = (Parcel) objArr[1];
                int i11 = AuthenticationRequestParameters;
                int i12 = ((i11 | 43) << 1) - (((~i11) & 43) | (i11 & (-44)));
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    int iAuthenticationRequestParameters = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters2 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters3 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                    return (getSDKTransactionID) getDeviceData(iAuthenticationRequestParameters, getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, 116993969, new Object[]{parcel}, iAuthenticationRequestParameters2, -116993966);
                }
                int iAuthenticationRequestParameters4 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters5 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters6 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                throw null;
            }

            public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
                int i17 = ~i11;
                int i18 = (~(i17 | i14)) | i16;
                int i19 = ~i16;
                int i21 = ~(i19 | i14 | i11);
                int i22 = (~(i11 | i19)) | i14 | (~(i17 | i16));
                int i23 = (808452096 * i12) + (1454768128 * i13) + (1303248896 * i15) + ((-14360446) * i22) + (14360446 * i21) + (i18 * 14360446) + (1288888451 * i16) + (1317609343 * i14) + 1063714816;
                int iC = a0.c(i12, -2062754392, ((-381402339) * i13) + i14 + i16 + i15);
                int i24 = i13 * (-1583251481);
                int i25 = i12 * 1682205048;
                int iE = a0.e(iC, -427491328, i25 + i24 + (i15 * (-1355236397)) + (i22 * 294) + (i21 * (-294)) + (i18 * (-294)) + (i16 * (-1355236103)) + ((i14 * (-1355236691)) - 921838429), 844169216, ((-1790509056) * iC) + i23);
                return iE != 1 ? iE != 2 ? iE != 3 ? AuthenticationRequestParameters(objArr) : getSDKAppID(objArr) : getSDKTransactionID(objArr) : getSDKReferenceNumber(objArr);
            }

            private static getSDKTransactionID getSDKAppID(Parcel parcel) {
                int iAuthenticationRequestParameters = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters2 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters3 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                return (getSDKTransactionID) getDeviceData(iAuthenticationRequestParameters, getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, 116993969, new Object[]{parcel}, iAuthenticationRequestParameters2, -116993966);
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = AuthenticationRequestParameters;
                getSDKAppID = a0.d((i11 | 124) << 1, i11 ^ 124, 1, 128);
                Object[] objArr2 = {Integer.valueOf(iIntValue)};
                int iAuthenticationRequestParameters = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters2 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                getSDKTransactionID[] getsdktransactionidArr = (getSDKTransactionID[]) getDeviceData(iAuthenticationRequestParameters, getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), -576007784, objArr2, iAuthenticationRequestParameters2, 576007786);
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 107;
                int i14 = ((i12 ^ 107) | i13) << 1;
                int i15 = -((i12 | 107) & (~i13));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                getSDKAppID = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 93 / 0;
                }
                return getsdktransactionidArr;
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getSDKAppID;
                int i12 = ((i11 ^ 66) + ((i11 & 66) << 1)) - 1;
                AuthenticationRequestParameters = i12 % 128;
                getSDKTransactionID[] getsdktransactionidArr = new getSDKTransactionID[iIntValue];
                if (i12 % 2 != 0) {
                    return getsdktransactionidArr;
                }
                throw null;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [atd.c.getSDKTransactionID, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKTransactionID createFromParcel(Parcel parcel) {
                int iAuthenticationRequestParameters = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters2 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters3 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                return getDeviceData(iAuthenticationRequestParameters, getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, 1637292373, new Object[]{this, parcel}, iAuthenticationRequestParameters2, -1637292373);
            }

            /* JADX WARN: Type inference failed for: r8v3, types: [atd.c.getSDKTransactionID[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKTransactionID[] newArray(int i11) {
                Object[] objArr = {this, Integer.valueOf(i11)};
                int iAuthenticationRequestParameters = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters2 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                return (Object[]) getDeviceData(iAuthenticationRequestParameters, getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), 9650903, objArr, iAuthenticationRequestParameters2, -9650902);
            }

            private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
                getSDKTransactionID getsdktransactionid = new getSDKTransactionID((Parcel) objArr[0]);
                int i11 = getSDKAppID;
                int i12 = (i11 ^ 75) + ((i11 & 75) << 1);
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 != 0) {
                    return getsdktransactionid;
                }
                throw null;
            }

            private static getSDKTransactionID[] getDeviceData(int i11) {
                Object[] objArr = {Integer.valueOf(i11)};
                int iAuthenticationRequestParameters = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters2 = getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters();
                return (getSDKTransactionID[]) getDeviceData(iAuthenticationRequestParameters, getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters(), -576007784, objArr, iAuthenticationRequestParameters2, 576007786);
            }
        };
        getMessageVersion = (getSDKAppID + 109) % 128;
    }

    public getSDKTransactionID(b0 b0Var) throws atd.ac.getSDKAppID {
        this.getSDKTransactionID = atd.h.getSDKTransactionID.getSDKReferenceNumber(atd.d.getSDKEphemeralPublicKey.getDeviceData(b0Var, atd.am.getSDKReferenceNumber.ACS_UI_TYPE).getSDKAppID().intValue());
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new int[]{1459513734, 1274047994, 971388429, 2090270686, -223757674, 378174425, -42860728, 977521125, -1763747201, -127011057, 2078226991, -1724346636, -421621399, 725313949, -1971703369, -1334008160, 1834857517, 1918785651};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        long j9;
        int i12;
        char[] cArr;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i17 = 16;
        int i18 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            j9 = 0;
            int[] iArr4 = new int[length];
            int i19 = 0;
            while (i19 < length) {
                int i21 = $10 + 77;
                $11 = i21 % 128;
                if (i21 % i16 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i19])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            int pressedStateDuration = 2223 - (ViewConfiguration.getPressedStateDuration() >> i17);
                            i13 = i16;
                            char cAlpha = (char) (Color.alpha(i18) + 53070);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(i18) + 22;
                            byte b8 = (byte) ($$f & 7);
                            i14 = i17;
                            byte b11 = (byte) (b8 - 2);
                            i15 = i18;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(pressedStateDuration, cAlpha, bitsPerPixel, 1089703072, false, $$g(b8, b11, b11), new Class[]{cls});
                        } else {
                            i13 = i16;
                            i14 = i17;
                            i15 = i18;
                        }
                        iArr4[i19] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i13 = i16;
                    i14 = i17;
                    i15 = i18;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i19])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        int i22 = 2224 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        char size = (char) (View.MeasureSpec.getSize(i15) + 53070);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 21;
                        byte b12 = (byte) ($$f & 7);
                        byte b13 = (byte) (b12 - 2);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i22, size, longPressTimeout, 1089703072, false, $$g(b12, b13, b13), new Class[]{cls});
                    }
                    iArr4[i19] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i19++;
                }
                i16 = i13;
                i17 = i14;
                i18 = i15;
            }
            iArr3 = iArr4;
        } else {
            j9 = 0;
        }
        int i23 = i16;
        int i24 = i17;
        int i25 = i18;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKReferenceNumber;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i26 = i25;
            while (i26 < length3) {
                $10 = ($11 + 69) % 128;
                Object[] objArr4 = {Integer.valueOf(iArr6[i26])};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID3 == null) {
                    int windowTouchSlop = 2223 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(j9) + 53070);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 22;
                    byte b14 = (byte) ($$f & 7);
                    cArr = cArr2;
                    byte b15 = (byte) (b14 - 2);
                    iArr2 = iArr6;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(windowTouchSlop, packedPositionGroup, iLastIndexOf, 1089703072, false, $$g(b14, b15, b15), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i26] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i26++;
                $10 = ($11 + 79) % 128;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        int i27 = i25;
        System.arraycopy(iArr6, i27, iArr5, i27, length2);
        getmessageversion.getSDKAppID = i27;
        while (true) {
            int i28 = getmessageversion.getSDKAppID;
            if (i28 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i29 = iArr[i28];
            char c3 = (char) (i29 >> 16);
            cArr4[i27] = c3;
            char c7 = (char) i29;
            cArr4[1] = c7;
            char c8 = (char) (iArr[i28 + 1] >> 16);
            cArr4[i23] = c8;
            char c11 = (char) iArr[i28 + 1];
            cArr4[3] = c11;
            getmessageversion.getDeviceData = (c3 << 16) + c7;
            getmessageversion.AuthenticationRequestParameters = (c8 << 16) + c11;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i31 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i31 >= i24) {
                    break;
                }
                int i32 = i12 ^ iArr5[i31];
                getmessageversion.getDeviceData = i32;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i32);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i23] = getmessageversion;
                objArr5[1] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2386, (char) (ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)), 19 - TextUtils.getCapsMode("", 0, 0), -2040903174, false, $$g(b16, b17, b17), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i31++;
                i24 = 16;
            }
            int i33 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i33;
            getmessageversion.AuthenticationRequestParameters = i12;
            i24 = 16;
            int i34 = i12 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i34;
            int i35 = i33 ^ iArr5[17];
            getmessageversion.getDeviceData = i35;
            cArr4[0] = (char) (i35 >>> 16);
            cArr4[1] = (char) i35;
            cArr4[i23] = (char) (i34 >>> 16);
            cArr4[3] = (char) i34;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i36 = getmessageversion.getSDKAppID;
            cArr3[i36 * 2] = cArr4[0];
            cArr3[(i36 * 2) + 1] = cArr4[1];
            cArr3[(i36 * 2) + 2] = cArr4[i23];
            cArr3[(i36 * 2) + 3] = cArr4[3];
            int i37 = i23;
            Object[] objArr6 = new Object[i37];
            objArr6[1] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                byte b18 = (byte) 1;
                byte b19 = (byte) (b18 - 1);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(1861 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.blue(0) + 40, -562771681, false, $$g(b18, b19, b19), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i23 = i37;
            i27 = 0;
        }
    }

    public static getSDKTransactionID getSDKAppID(b0 b0Var) throws Throwable {
        int i11 = AuthenticationRequestParameters + 73;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = AnonymousClass2.getSDKTransactionID[atd.h.getSDKTransactionID.getSDKReferenceNumber(atd.d.getSDKEphemeralPublicKey.getDeviceData(b0Var, atd.am.getSDKReferenceNumber.ACS_UI_TYPE).getSDKAppID().intValue()).ordinal()];
            throw null;
        }
        int iIntValue = atd.d.getSDKEphemeralPublicKey.getDeviceData(b0Var, atd.am.getSDKReferenceNumber.ACS_UI_TYPE).getSDKAppID().intValue();
        int i13 = AnonymousClass2.getSDKTransactionID[atd.h.getSDKTransactionID.getSDKReferenceNumber(iIntValue).ordinal()];
        if (i13 == 1) {
            return new onCompletion(b0Var);
        }
        if (i13 == 2 || i13 == 3) {
            getAdditionalDetails getadditionaldetails = new getAdditionalDetails(b0Var);
            int i14 = AuthenticationRequestParameters + 43;
            getDeviceData = i14 % 128;
            if (i14 % 2 == 0) {
                return getadditionaldetails;
            }
            throw null;
        }
        if (i13 == 4) {
            return new ChallengeResultCompleted(b0Var);
        }
        if (i13 == 5) {
            return new ChallengeResult(b0Var);
        }
        Object[] objArr = new Object[1];
        a(new int[]{-301932585, 1428067896, -12159217, 1175733304, -1119528235, -865837606, 2069490334, 22860223, 1665519041, 48478240, -1159955770, -257915455}, TextUtils.getCapsMode("", 0, 0) + 23, objArr);
        String strIntern = ((String) objArr[0]).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strIntern);
        sb2.append(iIntValue);
        throw new RuntimeException(sb2.toString());
    }

    public static void init$0() {
        $$c = new byte[]{63, -107, 81, -105};
        $$f = 186;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i11 = (getDeviceData + 65) % 128;
        AuthenticationRequestParameters = i11;
        getDeviceData = (i11 + 107) % 128;
        return 0;
    }

    public boolean equals(Object obj) {
        int i11 = AuthenticationRequestParameters + 67;
        int i12 = i11 % 128;
        getDeviceData = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            AuthenticationRequestParameters = (i12 + 73) % 128;
            return true;
        }
        if (obj != null) {
            int i13 = i12 + 3;
            AuthenticationRequestParameters = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            if (getClass() != obj.getClass() || this.getSDKTransactionID == ((getSDKTransactionID) obj).getSDKTransactionID) {
                return false;
            }
            int i14 = AuthenticationRequestParameters + 13;
            getDeviceData = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 32 / 0;
            }
            return true;
        }
        return false;
    }

    public void getDeviceData() {
        int i11 = getDeviceData;
        this.getSDKTransactionID = null;
        AuthenticationRequestParameters = (i11 + 55) % 128;
    }

    public final atd.h.getSDKTransactionID getSDKTransactionID() {
        int i11 = getDeviceData + 91;
        AuthenticationRequestParameters = i11 % 128;
        int i12 = i11 % 2;
        atd.h.getSDKTransactionID getsdktransactionid = this.getSDKTransactionID;
        if (i12 == 0) {
            int i13 = 70 / 0;
        }
        return getsdktransactionid;
    }

    public int hashCode() {
        atd.h.getSDKTransactionID getsdktransactionid = this.getSDKTransactionID;
        if (getsdktransactionid != null) {
            getDeviceData = (AuthenticationRequestParameters + 1) % 128;
            return getsdktransactionid.hashCode();
        }
        int i11 = getDeviceData + 39;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = getDeviceData + 55;
        AuthenticationRequestParameters = i12 % 128;
        int i13 = i12 % 2;
        atd.h.getSDKTransactionID getsdktransactionid = this.getSDKTransactionID;
        if (i13 != 0) {
            parcel.writeInt(getsdktransactionid.getSDKReferenceNumber());
        } else {
            parcel.writeInt(getsdktransactionid.getSDKReferenceNumber());
            throw null;
        }
    }

    public getSDKTransactionID(Parcel parcel) {
        try {
            this.getSDKTransactionID = atd.h.getSDKTransactionID.getSDKReferenceNumber(parcel.readInt());
        } catch (atd.ac.getSDKAppID e5) {
            d0.o(e5.getMessage(), e5);
            throw null;
        }
    }
}
