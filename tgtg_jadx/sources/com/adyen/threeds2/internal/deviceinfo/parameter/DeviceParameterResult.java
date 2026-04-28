package com.adyen.threeds2.internal.deviceinfo.parameter;

import a80.a;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.as.getSDKEphemeralPublicKey;
import atd.bb.ChallengeResultKt;
import atd.bb.getMessageVersion;
import atd.c.getTransactionStatus;
import atd.e.ChallengeResult;
import atd.w.getTransactionID;
import atd.z.getSDKAppID;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r8.k;
import v0.n;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "Success", "Failure", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceParameterResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "reason", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;)V", "getReason", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;", "Reason", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failure implements DeviceParameterResult {
        private static int AuthenticationRequestParameters = 0;
        private static int getDeviceData = 1;

        @NotNull
        private final Reason reason;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "RESTRICTED", "UNSUPPORTED_OR_DEPRECATED", "MISSING_PERMISSION", "NULL_OR_BLANK", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Reason {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            private static int AuthenticationRequestParameters;
            private static int ChallengeResultCancelled;
            public static final Reason MISSING_PERMISSION;
            public static final Reason NULL_OR_BLANK;
            public static final Reason RESTRICTED;
            public static final Reason UNSUPPORTED_OR_DEPRECATED;
            private static int getDeviceData;
            private static int getSDKAppID;
            private static char[] getSDKReferenceNumber;
            private static char getSDKTransactionID;

            @NotNull
            private final String code;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(byte r6, int r7, byte r8) {
                /*
                    int r6 = r6 + 65
                    byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.$$a
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r8 = r8 * 3
                    int r8 = r8 + 1
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r0
                    r4 = r2
                    r0 = r7
                    r7 = r8
                    goto L2c
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r4 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r0
                    r0 = r5
                L2c:
                    int r6 = -r6
                    int r6 = r6 + r7
                    int r7 = r0 + 1
                    r0 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.$$c(byte, int, byte):java.lang.String");
            }

            private static final /* synthetic */ Reason[] $values() {
                int i11 = (AuthenticationRequestParameters + 27) % 128;
                getSDKAppID = i11;
                Reason[] reasonArr = {RESTRICTED, UNSUPPORTED_OR_DEPRECATED, MISSING_PERMISSION, NULL_OR_BLANK};
                int i12 = i11 + 65;
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 11 / 0;
                }
                return reasonArr;
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                getDeviceData = 0;
                ChallengeResultCancelled = 1;
                getSDKAppID = 0;
                AuthenticationRequestParameters = 1;
                getSDKReferenceNumber();
                Object[] objArr = new Object[1];
                a("\u000f\u0012\u0014\u0012\u0010\t\u0014\u0011\u0010\u0002", 10 - TextUtils.getOffsetBefore("", 0), (byte) (View.resolveSize(0, 0) + 60), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a("\u000f\u0012\u0004\u0000", 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (48 - Color.red(0)), objArr2);
                RESTRICTED = new Reason(strIntern, 0, ((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                a("\u0011\u000b\u0015\u0012㘓㘓\u000e\u0010\u0010\u0012\u0003\u000b\u000e\u0010\u000b\u0003\u000f\u0002\u000f\u0012\u0017\u0016\u0010\u0012㘧", 25 - View.MeasureSpec.getSize(0), (byte) (ExpandableListView.getPackedPositionType(0L) + 73), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a("\u000f\u0012\u0000\r", 4 - Drawable.resolveOpacity(0, 0), (byte) (123 - View.resolveSize(0, 0)), objArr4);
                UNSUPPORTED_OR_DEPRECATED = new Reason(strIntern2, 1, ((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                a("\u0015\t㙄㙄\u0007\u000b\n\u000e\u0002\u000f\u0018\u0004\b\u0015\u0015\b\f\r", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + AppConstants.RESULT_CODE_ORDER_CANCELLED), objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                a("\u000f\u0012\u0004\u0003", TextUtils.indexOf((CharSequence) "", '0', 0) + 5, (byte) (68 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr6);
                MISSING_PERMISSION = new Reason(strIntern3, 2, ((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                a("\u000b\u0011㘔㘔\u000e\f\u0012\u000e\u0000\n\u0016\u000b㘏", ImageFormat.getBitsPerPixel(0) + 14, (byte) (KeyEvent.normalizeMetaState(0) + 62), objArr7);
                String strIntern4 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                a("\u000f\u0012\u0004\b", Color.blue(0) + 4, (byte) (ExpandableListView.getPackedPositionType(0L) + 13), objArr8);
                NULL_OR_BLANK = new Reason(strIntern4, 3, ((String) objArr8[0]).intern());
                Reason[] reasonArr$values = $values();
                $VALUES = reasonArr$values;
                $ENTRIES = n.w(reasonArr$values);
                getDeviceData = (ChallengeResultCancelled + 47) % 128;
            }

            private Reason(String str, int i11, String str2) {
                this.code = str2;
            }

            private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
                char[] charArray;
                double d3;
                int i12;
                int i13;
                char c3;
                int i14;
                char c7;
                char c8;
                int i15;
                int i16;
                int i17;
                int i18 = 2;
                if (str != null) {
                    int i19 = $11 + 59;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        str.toCharArray();
                        throw null;
                    }
                    charArray = str.toCharArray();
                } else {
                    charArray = str;
                }
                char[] cArr = charArray;
                ChallengeResultKt challengeResultKt = new ChallengeResultKt();
                char[] cArr2 = getSDKReferenceNumber;
                Class cls = Integer.TYPE;
                int i21 = -317146529;
                float f11 = 0.0f;
                int i22 = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i23 = 0;
                    d3 = 0.0d;
                    while (i23 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i23])};
                            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i21);
                            if (sDKTransactionID == null) {
                                i17 = i21;
                                byte b11 = (byte) 0;
                                i16 = i18;
                                byte b12 = b11;
                                sDKTransactionID = ChallengeResult.getDeviceData(2157 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, f11, f11) > f11 ? 1 : (TypedValue.complexToFraction(0, f11, f11) == f11 ? 0 : -1)), 36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 829471823, false, $$c(b11, b12, b12), new Class[]{cls});
                            } else {
                                i16 = i18;
                                i17 = i21;
                            }
                            cArr3[i23] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                            i23++;
                            i21 = i17;
                            i18 = i16;
                            f11 = 0.0f;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                } else {
                    d3 = 0.0d;
                }
                int i24 = i18;
                int i25 = i21;
                Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i25);
                int i26 = 1;
                if (sDKTransactionID2 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(2158 - TextUtils.indexOf("", ""), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 829471823, false, $$c(b13, b14, b14), new Class[]{cls});
                }
                char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i11];
                if (i11 % 2 != 0) {
                    $11 = ($10 + 81) % 128;
                    i12 = i11 - 1;
                    cArr4[i12] = (char) (cArr[i12] - b8);
                } else {
                    i12 = i11;
                }
                if (i12 > 1) {
                    challengeResultKt.getSDKReferenceNumber = 0;
                    while (true) {
                        int i27 = challengeResultKt.getSDKReferenceNumber;
                        if (i27 >= i12) {
                            break;
                        }
                        char c11 = cArr[i27];
                        challengeResultKt.getDeviceData = c11;
                        char c12 = cArr[i27 + 1];
                        challengeResultKt.getSDKAppID = c12;
                        if (c11 == c12) {
                            int i28 = $11 + 53;
                            $10 = i28 % 128;
                            if (i28 % 2 != 0) {
                                cArr4[i27] = (char) (c11 + b8);
                                cArr4[i27 << 1] = (char) (c12 - b8);
                            } else {
                                cArr4[i27] = (char) (c11 - b8);
                                cArr4[i27 + 1] = (char) (c12 - b8);
                            }
                            i15 = i26;
                        } else {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = challengeResultKt;
                            objArr4[11] = Integer.valueOf(cCharValue);
                            objArr4[10] = challengeResultKt;
                            objArr4[9] = challengeResultKt;
                            objArr4[8] = Integer.valueOf(cCharValue);
                            objArr4[7] = challengeResultKt;
                            objArr4[6] = challengeResultKt;
                            objArr4[5] = Integer.valueOf(cCharValue);
                            objArr4[4] = challengeResultKt;
                            objArr4[3] = challengeResultKt;
                            objArr4[i24] = Integer.valueOf(cCharValue);
                            objArr4[i26] = challengeResultKt;
                            objArr4[i22] = challengeResultKt;
                            Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(835518319);
                            if (sDKTransactionID3 == null) {
                                c3 = '\n';
                                int iResolveSize = View.resolveSize(i22, i22) + 1258;
                                c7 = '\t';
                                char size = (char) (34414 - View.MeasureSpec.getSize(i22));
                                int trimmedLength = TextUtils.getTrimmedLength("") + 41;
                                i13 = i26;
                                c8 = 7;
                                byte b15 = (byte) i24;
                                byte b16 = (byte) (b15 - 2);
                                i14 = i22;
                                String str$$c = $$c(b15, b16, b16);
                                Class cls2 = Integer.TYPE;
                                sDKTransactionID3 = ChallengeResult.getDeviceData(iResolveSize, size, trimmedLength, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                            } else {
                                i13 = i26;
                                c3 = '\n';
                                i14 = i22;
                                c7 = '\t';
                                c8 = 7;
                            }
                            int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                            int i29 = challengeResultKt.ChallengeResultCancelled;
                            if (iIntValue == i29) {
                                Object[] objArr5 = new Object[11];
                                objArr5[c3] = challengeResultKt;
                                objArr5[c7] = Integer.valueOf(cCharValue);
                                objArr5[8] = challengeResultKt;
                                objArr5[c8] = Integer.valueOf(cCharValue);
                                objArr5[6] = Integer.valueOf(cCharValue);
                                objArr5[5] = challengeResultKt;
                                objArr5[4] = challengeResultKt;
                                objArr5[3] = Integer.valueOf(cCharValue);
                                objArr5[2] = Integer.valueOf(cCharValue);
                                objArr5[i13] = challengeResultKt;
                                objArr5[i14] = challengeResultKt;
                                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-758961112);
                                if (sDKTransactionID4 == null) {
                                    int i31 = (CdmaCellLocation.convertQuartSecToDecDegrees(i14) > d3 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == d3 ? 0 : -1)) + 2223;
                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 53071);
                                    int iAxisFromString = MotionEvent.axisFromString("") + 22;
                                    byte b17 = (byte) i14;
                                    String str$$c2 = $$c((byte) 57, b17, b17);
                                    Class cls3 = Integer.TYPE;
                                    sDKTransactionID4 = ChallengeResult.getDeviceData(i31, cLastIndexOf, iAxisFromString, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                                int i32 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                                int i33 = challengeResultKt.getSDKReferenceNumber;
                                cArr4[i33] = cArr2[iIntValue2];
                                cArr4[i33 + 1] = cArr2[i32];
                                i15 = i13;
                            } else {
                                int i34 = challengeResultKt.AuthenticationRequestParameters;
                                int i35 = challengeResultKt.getSDKTransactionID;
                                int i36 = challengeResultKt.getMessageVersion;
                                if (i34 == i35) {
                                    i15 = i13;
                                    int iC = k.c(i36, cCharValue, i15, cCharValue);
                                    challengeResultKt.getMessageVersion = iC;
                                    int iC2 = k.c(i29, cCharValue, i15, cCharValue);
                                    challengeResultKt.ChallengeResultCancelled = iC2;
                                    int i37 = (i35 * cCharValue) + iC2;
                                    int i38 = challengeResultKt.getSDKReferenceNumber;
                                    cArr4[i38] = cArr2[(i34 * cCharValue) + iC];
                                    cArr4[i38 + i15] = cArr2[i37];
                                } else {
                                    i15 = i13;
                                    int i39 = (i34 * cCharValue) + i29;
                                    int i41 = challengeResultKt.getSDKReferenceNumber;
                                    cArr4[i41] = cArr2[i39];
                                    cArr4[i41 + i15] = cArr2[(i35 * cCharValue) + i36];
                                }
                            }
                        }
                        challengeResultKt.getSDKReferenceNumber += 2;
                        $10 = ($11 + 125) % 128;
                        i26 = i15;
                        i22 = 0;
                        i24 = 2;
                    }
                }
                int i42 = 0;
                while (i42 < i11) {
                    int i43 = $10 + 27;
                    $11 = i43 % 128;
                    if (i43 % 2 == 0) {
                        cArr4[i42] = (char) (cArr4[i42] ^ 3250);
                        i42 += 64;
                    } else {
                        cArr4[i42] = (char) (cArr4[i42] ^ 13722);
                        i42++;
                    }
                }
                objArr[0] = new String(cArr4);
            }

            @NotNull
            public static a getEntries() {
                int i11 = AuthenticationRequestParameters;
                a aVar = $ENTRIES;
                int i12 = i11 + 45;
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    return aVar;
                }
                throw null;
            }

            public static void getSDKReferenceNumber() {
                getSDKReferenceNumber = new char[]{30870, 30850, 30965, 30966, 30967, 30858, 30863, 30871, 30861, 30962, 30964, 30857, 30856, 30873, 30849, 30866, 30867, 30851, 30864, 30868, 30852, 30855, 30853, 30869, 30859};
                getSDKTransactionID = (char) 19801;
            }

            public static void init$0() {
                $$a = new byte[]{39, 64, -52, -10};
                $$b = 196;
            }

            public static Reason valueOf(String str) {
                AuthenticationRequestParameters = (getSDKAppID + 99) % 128;
                Reason reason = (Reason) Enum.valueOf(Reason.class, str);
                int i11 = AuthenticationRequestParameters + 119;
                getSDKAppID = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 98 / 0;
                }
                return reason;
            }

            public static Reason[] values() {
                int i11 = getSDKAppID + 85;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    return (Reason[]) $VALUES.clone();
                }
                throw null;
            }

            @NotNull
            public final String getCode() {
                int i11 = getSDKAppID;
                String str = this.code;
                int i12 = i11 + 95;
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }

        public Failure(@NotNull Reason reason) {
            reason.getClass();
            this.reason = reason;
        }

        @NotNull
        public final Reason getReason() {
            int i11 = getDeviceData;
            Reason reason = this.reason;
            int i12 = ((i11 & 20) + (i11 | 20)) - 1;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 30 / 0;
            }
            return reason;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "IntValue", "LongValue", "DoubleValue", "FloatValue", "BooleanValue", "StringValue", "StringsListValue", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$BooleanValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$DoubleValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringsListValue;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Success extends DeviceParameterResult {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$BooleanValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "equals", "other", "", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BooleanValue implements Success {
            private static int AuthenticationRequestParameters = 0;
            private static int getDeviceData = 1;
            private final boolean value;

            private /* synthetic */ BooleanValue(boolean z11) {
                this.value = z11;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ BooleanValue m129boximpl(boolean z11) {
                BooleanValue booleanValue = new BooleanValue(z11);
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 85;
                int i13 = (i12 - (~(-(-((i11 ^ 85) | i12))))) - 1;
                getDeviceData = i13 % 128;
                if (i13 % 2 != 0) {
                    return booleanValue;
                }
                throw null;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static boolean m130constructorimpl(boolean z11) {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 117;
                int i13 = -(-((i11 ^ 117) | i12));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                int i15 = i14 % 128;
                getDeviceData = i15;
                if (i14 % 2 == 0) {
                    throw null;
                }
                int i16 = i15 & 41;
                int i17 = ((i15 ^ 41) | i16) << 1;
                int i18 = -((i15 | 41) & (~i16));
                AuthenticationRequestParameters = ((i17 & i18) + (i18 | i17)) % 128;
                return z11;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m131equalsimpl(boolean z11, Object obj) {
                int i11 = AuthenticationRequestParameters;
                getDeviceData = ((i11 & 59) + (i11 | 59)) % 128;
                if (!(obj instanceof BooleanValue)) {
                    int i12 = (i11 ^ 2) + ((i11 & 2) << 1);
                    getDeviceData = ((i12 ^ (-1)) + (i12 << 1)) % 128;
                    return false;
                }
                if (z11 == ((BooleanValue) obj).m135unboximpl()) {
                    int i13 = getDeviceData;
                    int i14 = i13 & 59;
                    int i15 = (i13 | 59) & (~i14);
                    int i16 = -(-(i14 << 1));
                    AuthenticationRequestParameters = (((i15 | i16) << 1) - (i15 ^ i16)) % 128;
                    return true;
                }
                int i17 = AuthenticationRequestParameters;
                int i18 = i17 + 39;
                getDeviceData = i18 % 128;
                boolean z12 = i18 % 2 == 0;
                int i19 = i17 ^ 85;
                int i21 = (((i17 & 85) | i19) << 1) - i19;
                getDeviceData = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 92 / 0;
                }
                return z12;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
            
                r4 = r0 ^ 11;
                r5 = (((r0 & 11) | r4) << 1) - r4;
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.getDeviceData = r5 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
            
                if ((r5 % 2) != 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
            
                r4 = 50 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
            
                if (r4 == r5) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
            
                if (r4 == r5) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
            
                r4 = w.a0.d(r0 & 73, ~(r0 | 73), 1, 128);
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.getDeviceData = r4;
                r5 = r4 & 45;
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.AuthenticationRequestParameters = (r5 + ((r4 ^ 45) | r5)) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
            
                return true;
             */
            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final boolean m132equalsimpl0(boolean r4, boolean r5) {
                /*
                    int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.getDeviceData
                    r1 = r0 & 63
                    r0 = r0 ^ 63
                    r0 = r0 | r1
                    int r1 = r1 + r0
                    int r0 = r1 % 128
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.AuthenticationRequestParameters = r0
                    int r1 = r1 % 2
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L18
                    r1 = 92
                    int r1 = r1 / r3
                    if (r4 != r5) goto L31
                    goto L1a
                L18:
                    if (r4 != r5) goto L31
                L1a:
                    r4 = r0 & 73
                    r5 = r0 | 73
                    int r5 = ~r5
                    r0 = 128(0x80, float:1.8E-43)
                    int r4 = w.a0.d(r4, r5, r2, r0)
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.getDeviceData = r4
                    r5 = r4 & 45
                    r4 = r4 ^ 45
                    r4 = r4 | r5
                    int r5 = r5 + r4
                    int r5 = r5 % r0
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.AuthenticationRequestParameters = r5
                    return r2
                L31:
                    r4 = r0 ^ 11
                    r5 = r0 & 11
                    r5 = r5 | r4
                    int r5 = r5 << r2
                    int r5 = r5 - r4
                    int r4 = r5 % 128
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.getDeviceData = r4
                    int r5 = r5 % 2
                    if (r5 != 0) goto L43
                    r4 = 50
                    int r4 = r4 / r3
                L43:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m132equalsimpl0(boolean, boolean):boolean");
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m133hashCodeimpl(boolean z11) {
                int i11 = AuthenticationRequestParameters;
                getDeviceData = ((i11 ^ 21) + ((i11 & 21) << 1)) % 128;
                int iHashCode = Boolean.hashCode(z11);
                int i12 = AuthenticationRequestParameters + 91;
                getDeviceData = i12 % 128;
                if (i12 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m134toStringimpl(boolean z11) {
                int i11 = getDeviceData;
                int i12 = i11 & 47;
                int i13 = ((i11 | 47) & (~i12)) + (i12 << 1);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    return String.valueOf(z11);
                }
                String.valueOf(z11);
                throw null;
            }

            public final boolean equals(Object obj) {
                int i11 = getDeviceData;
                int i12 = i11 ^ 65;
                int i13 = (i11 & 65) << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                AuthenticationRequestParameters = i14 % 128;
                int i15 = i14 % 2;
                boolean zM131equalsimpl = m131equalsimpl(this.value, obj);
                if (i15 != 0) {
                    int i16 = 10 / 0;
                }
                return zM131equalsimpl;
            }

            public final boolean getValue() {
                int i11 = AuthenticationRequestParameters;
                int i12 = ((i11 & (-78)) | ((~i11) & 77)) + ((i11 & 77) << 1);
                getDeviceData = i12 % 128;
                int i13 = i12 % 2;
                boolean z11 = this.value;
                if (i13 != 0) {
                    return z11;
                }
                throw null;
            }

            public final int hashCode() {
                int i11 = getDeviceData;
                int i12 = i11 & 59;
                AuthenticationRequestParameters = a0.d((i11 | 59) & (~i12), ~(i12 << 1), 1, 128);
                int iM133hashCodeimpl = m133hashCodeimpl(this.value);
                getDeviceData = (AuthenticationRequestParameters + 31) % 128;
                return iM133hashCodeimpl;
            }

            @NotNull
            public final String toString() {
                int i11 = getDeviceData;
                int i12 = i11 & 5;
                int i13 = -(-(i11 | 5));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                AuthenticationRequestParameters = i14 % 128;
                int i15 = i14 % 2;
                boolean z11 = this.value;
                if (i15 != 0) {
                    m134toStringimpl(z11);
                    throw null;
                }
                String strM134toStringimpl = m134toStringimpl(z11);
                int i16 = AuthenticationRequestParameters;
                int i17 = (i16 & (-104)) | ((~i16) & 103);
                int i18 = (i16 & 103) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                getDeviceData = i19 % 128;
                if (i19 % 2 != 0) {
                    return strM134toStringimpl;
                }
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m135unboximpl() {
                int i11 = getDeviceData;
                boolean z11 = this.value;
                AuthenticationRequestParameters = a0.d((i11 | 70) << 1, i11 ^ 70, 1, 128);
                return z11;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$DoubleValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(D)D", "getValue", "()D", "toString", "", "toString-impl", "(D)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(DLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(D)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DoubleValue implements Success {
            private static int getSDKAppID = 1;
            private static int getSDKReferenceNumber;
            private final double value;

            private /* synthetic */ DoubleValue(double d3) {
                this.value = d3;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ DoubleValue m136boximpl(double d3) {
                DoubleValue doubleValue = new DoubleValue(d3);
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & AppConstants.RESULT_CODE_ORDER_CANCELLED;
                int i13 = -(-((i11 ^ AppConstants.RESULT_CODE_ORDER_CANCELLED) | i12));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                getSDKAppID = i14 % 128;
                if (i14 % 2 != 0) {
                    return doubleValue;
                }
                throw null;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static double m137constructorimpl(double d3) {
                int i11 = getSDKReferenceNumber;
                int i12 = (((i11 | 120) << 1) - (i11 ^ 120)) - 1;
                getSDKAppID = i12 % 128;
                if (i12 % 2 != 0) {
                    return d3;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m138equalsimpl(double d3, Object obj) {
                int i11 = getSDKAppID;
                int i12 = i11 & 85;
                getSDKReferenceNumber = (((~i12) & (i11 | 85)) + (i12 << 1)) % 128;
                if (!(obj instanceof DoubleValue)) {
                    int i13 = i11 & 105;
                    int i14 = ((i11 ^ 105) | i13) << 1;
                    int i15 = -((~i13) & (i11 | 105));
                    int i16 = (i14 & i15) + (i14 | i15);
                    getSDKReferenceNumber = i16 % 128;
                    boolean z11 = i16 % 2 != 0;
                    int i17 = i11 & 103;
                    getSDKReferenceNumber = a0.d(i17, ~((i11 ^ 103) | i17), 1, 128);
                    return z11;
                }
                if (Double.compare(d3, ((DoubleValue) obj).m142unboximpl()) != 0) {
                    int i18 = getSDKReferenceNumber;
                    int i19 = i18 | 73;
                    getSDKAppID = ((i19 << 1) - ((~(i18 & 73)) & i19)) % 128;
                    return false;
                }
                int i21 = getSDKAppID;
                int i22 = (i21 & (-14)) | ((~i21) & 13);
                int i23 = -(-((i21 & 13) << 1));
                getSDKReferenceNumber = ((i22 ^ i23) + ((i23 & i22) << 1)) % 128;
                return true;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m139equalsimpl0(double d3, double d11) {
                int i11 = getSDKAppID;
                getSDKReferenceNumber = ((i11 & 77) + (i11 | 77)) % 128;
                if (Double.compare(d3, d11) == 0) {
                    getSDKAppID = (getSDKReferenceNumber + 81) % 128;
                    return true;
                }
                int i12 = getSDKReferenceNumber;
                getSDKAppID = (((i12 & 66) + (i12 | 66)) - 1) % 128;
                return false;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m140hashCodeimpl(double d3) {
                int i11 = getSDKAppID;
                getSDKReferenceNumber = a0.d((i11 & (-12)) | ((~i11) & 11), ~((i11 & 11) << 1), 1, 128);
                int iHashCode = Double.hashCode(d3);
                int i12 = getSDKReferenceNumber;
                int i13 = i12 & 119;
                int i14 = ((i12 ^ 119) | i13) << 1;
                int i15 = -((i12 | 119) & (~i13));
                getSDKAppID = ((i14 & i15) + (i15 | i14)) % 128;
                return iHashCode;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m141toStringimpl(double d3) {
                int i11 = getSDKAppID;
                int i12 = i11 + 70;
                getSDKReferenceNumber = ((i12 ^ (-1)) + (i12 << 1)) % 128;
                boolean z11 = false;
                if (d3 % 1.0d == 0.0d) {
                    int i13 = i11 + 69;
                    getSDKReferenceNumber = i13 % 128;
                    if (i13 % 2 == 0) {
                        z11 = true;
                    }
                } else {
                    getSDKReferenceNumber = (i11 + 13) % 128;
                }
                if (z11) {
                    int i14 = getSDKReferenceNumber;
                    getSDKAppID = ((i14 ^ 29) + ((i14 & 29) << 1)) % 128;
                    String strValueOf = String.valueOf((int) d3);
                    int i15 = getSDKAppID;
                    int i16 = i15 & 99;
                    getSDKReferenceNumber = (i16 + ((i15 ^ 99) | i16)) % 128;
                    return strValueOf;
                }
                String plainString = new BigDecimal(String.valueOf(d3)).toPlainString();
                plainString.getClass();
                int i17 = getSDKReferenceNumber;
                int i18 = ((i17 & 6) + (i17 | 6)) - 1;
                getSDKAppID = i18 % 128;
                if (i18 % 2 != 0) {
                    return plainString;
                }
                throw null;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKAppID;
                getSDKReferenceNumber = (((i11 | 51) << 1) - (((~i11) & 51) | (i11 & (-52)))) % 128;
                boolean zM138equalsimpl = m138equalsimpl(this.value, obj);
                int i12 = getSDKReferenceNumber;
                int i13 = (i12 & 52) + (i12 | 52);
                getSDKAppID = ((i13 ^ (-1)) + (i13 << 1)) % 128;
                return zM138equalsimpl;
            }

            public final double getValue() {
                int i11 = getSDKAppID + 39;
                int i12 = i11 % 128;
                getSDKReferenceNumber = i12;
                int i13 = i11 % 2;
                double d3 = this.value;
                if (i13 != 0) {
                    throw null;
                }
                int i14 = i12 + 31;
                getSDKAppID = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 28 / 0;
                }
                return d3;
            }

            public final int hashCode() {
                int i11 = getSDKReferenceNumber;
                int i12 = (i11 & 107) + (i11 | 107);
                getSDKAppID = i12 % 128;
                int i13 = i12 % 2;
                double d3 = this.value;
                if (i13 != 0) {
                    return m140hashCodeimpl(d3);
                }
                m140hashCodeimpl(d3);
                throw null;
            }

            @NotNull
            public final String toString() {
                getSDKReferenceNumber = (getSDKAppID + 37) % 128;
                String strM141toStringimpl = m141toStringimpl(this.value);
                getSDKReferenceNumber = ((-2) - ((getSDKAppID + 112) ^ (-1))) % 128;
                return strM141toStringimpl;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ double m142unboximpl() {
                int i11 = getSDKAppID;
                int i12 = (((i11 & (-110)) | ((~i11) & 109)) + ((i11 & 109) << 1)) % 128;
                getSDKReferenceNumber = i12;
                double d3 = this.value;
                getSDKAppID = ((i12 ^ 37) + ((i12 & 37) << 1)) % 128;
                return d3;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FloatValue implements Success {
            private static int getSDKAppID = 0;
            private static int getSDKTransactionID = 1;
            private final float value;

            private /* synthetic */ FloatValue(float f11) {
                this.value = f11;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ FloatValue m143boximpl(float f11) {
                FloatValue floatValue = new FloatValue(f11);
                int i11 = (-2) - ((getSDKTransactionID + 80) ^ (-1));
                getSDKAppID = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 7 / 0;
                }
                return floatValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static float m144constructorimpl(float f11) {
                int i11 = getSDKAppID;
                int i12 = ((i11 & 75) - (~(i11 | 75))) - 1;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 49 / 0;
                }
                return f11;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m145equalsimpl(float f11, Object obj) {
                int i11 = (getSDKTransactionID + 75) % 128;
                getSDKAppID = i11;
                if (!(obj instanceof FloatValue)) {
                    int i12 = i11 + 59;
                    getSDKTransactionID = i12 % 128;
                    if (i12 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (Float.compare(f11, ((FloatValue) obj).m149unboximpl()) == 0) {
                    int i13 = getSDKAppID;
                    getSDKTransactionID = a0.d((i13 | 98) << 1, i13 ^ 98, 1, 128);
                    return true;
                }
                int i14 = getSDKAppID;
                int i15 = (i14 | 119) << 1;
                int i16 = -(i14 ^ 119);
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                getSDKTransactionID = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 4 / 0;
                }
                return false;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m146equalsimpl0(float f11, float f12) {
                int i11 = getSDKTransactionID;
                getSDKAppID = (((i11 | 111) << 1) - (i11 ^ 111)) % 128;
                if (Float.compare(f11, f12) == 0) {
                    int i12 = getSDKAppID;
                    int iD = a0.d((i12 | 6) << 1, i12 ^ 6, 1, 128);
                    getSDKTransactionID = iD;
                    int i13 = iD ^ 39;
                    int i14 = -(-((iD & 39) << 1));
                    getSDKAppID = ((i13 & i14) + (i14 | i13)) % 128;
                    return true;
                }
                int i15 = getSDKAppID;
                int i16 = i15 ^ 23;
                int i17 = ((i15 & 23) | i16) << 1;
                int i18 = -i16;
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                getSDKTransactionID = i19 % 128;
                if (i19 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m147hashCodeimpl(float f11) {
                int i11 = getSDKTransactionID;
                int i12 = (i11 | 57) << 1;
                int i13 = -(i11 ^ 57);
                getSDKAppID = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                int iHashCode = Float.hashCode(f11);
                getSDKTransactionID = (getSDKAppID + 87) % 128;
                return iHashCode;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m148toStringimpl(float f11) {
                int i11 = getSDKTransactionID;
                int i12 = ((i11 ^ 32) + ((i11 & 32) << 1)) - 1;
                int i13 = i12 % 128;
                getSDKAppID = i13;
                if (i12 % 2 == 0 ? ((double) f11) % 1.0d != 0.0d : ((double) f11) % 0.0d != 0.0d) {
                    int i14 = i13 & 85;
                    getSDKTransactionID = (i14 + ((i13 ^ 85) | i14)) % 128;
                    String plainString = new BigDecimal(String.valueOf(f11)).toPlainString();
                    plainString.getClass();
                    int i15 = getSDKTransactionID;
                    int i16 = (i15 & 18) + (i15 | 18);
                    getSDKAppID = ((i16 ^ (-1)) + (i16 << 1)) % 128;
                    return plainString;
                }
                int i17 = i11 & 109;
                int i18 = (i11 | 109) & (~i17);
                int i19 = -(-(i17 << 1));
                int i21 = (i18 ^ i19) + ((i18 & i19) << 1);
                getSDKAppID = i21 % 128;
                int i22 = (int) f11;
                if (i21 % 2 != 0) {
                    String.valueOf(i22);
                    throw null;
                }
                String strValueOf = String.valueOf(i22);
                int i23 = getSDKAppID;
                int i24 = i23 & 107;
                int i25 = (i23 ^ 107) | i24;
                getSDKTransactionID = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                return strValueOf;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKAppID;
                int i12 = i11 & 69;
                getSDKTransactionID = (i12 + ((i11 ^ 69) | i12)) % 128;
                boolean zM145equalsimpl = m145equalsimpl(this.value, obj);
                int i13 = getSDKAppID;
                int i14 = (i13 ^ 101) + ((i13 & 101) << 1);
                getSDKTransactionID = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 46 / 0;
                }
                return zM145equalsimpl;
            }

            public final float getValue() {
                int i11 = getSDKAppID;
                int i12 = i11 & 99;
                int i13 = -(-((i11 ^ 99) | i12));
                int i14 = (i12 & i13) + (i13 | i12);
                int i15 = i14 % 128;
                getSDKTransactionID = i15;
                int i16 = i14 % 2;
                float f11 = this.value;
                if (i16 == 0) {
                    int i17 = 30 / 0;
                }
                int i18 = i15 & 59;
                int i19 = i15 | 59;
                getSDKAppID = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
                return f11;
            }

            public final int hashCode() {
                int i11 = getSDKAppID;
                int i12 = i11 | 57;
                int i13 = i12 << 1;
                int i14 = -((~(i11 & 57)) & i12);
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                getSDKTransactionID = i15 % 128;
                int i16 = i15 % 2;
                float f11 = this.value;
                if (i16 != 0) {
                    return m147hashCodeimpl(f11);
                }
                m147hashCodeimpl(f11);
                throw null;
            }

            @NotNull
            public final String toString() {
                int i11 = getSDKAppID;
                int i12 = (i11 & (-102)) | ((~i11) & 101);
                int i13 = (i11 & 101) << 1;
                getSDKTransactionID = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                String strM148toStringimpl = m148toStringimpl(this.value);
                int i14 = getSDKTransactionID;
                int i15 = i14 & 107;
                int i16 = -(-(i14 | 107));
                getSDKAppID = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
                return strM148toStringimpl;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ float m149unboximpl() {
                int i11 = getSDKAppID;
                int i12 = ((i11 & (-116)) | ((~i11) & 115)) + ((i11 & 115) << 1);
                int i13 = i12 % 128;
                getSDKTransactionID = i13;
                int i14 = i12 % 2;
                float f11 = this.value;
                if (i14 == 0) {
                    throw null;
                }
                int i15 = i13 & 85;
                int i16 = i15 + ((i13 ^ 85) | i15);
                getSDKAppID = i16 % 128;
                if (i16 % 2 == 0) {
                    return f11;
                }
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IntValue implements Success {
            private static int AuthenticationRequestParameters = 1;
            public static int getDeviceData;
            private static int getSDKReferenceNumber;
            public static int getSDKTransactionID;
            private final int value;

            private /* synthetic */ IntValue(int i11) {
                this.value = i11;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ IntValue m150boximpl(int i11) {
                IntValue intValue = new IntValue(i11);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 61) % 128;
                return intValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static int m151constructorimpl(int i11) {
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 49;
                int i14 = (i12 ^ 49) | i13;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                int i16 = i15 % 128;
                getSDKReferenceNumber = i16;
                if (i15 % 2 != 0) {
                    throw null;
                }
                int i17 = i16 & 5;
                int i18 = (i16 | 5) & (~i17);
                int i19 = -(-(i17 << 1));
                int i21 = (i18 ^ i19) + ((i18 & i19) << 1);
                AuthenticationRequestParameters = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 2 / 0;
                }
                return i11;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
            
                if (r6 == ((com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue) r7).m156unboximpl()) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                r6 = (com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber + 15) % 128;
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters = r6;
                r7 = (((r6 & (-4)) | ((~r6) & 3)) - (~((r6 & 3) << 1))) - 1;
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
            
                if ((r7 % 2) != 0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
            
                r6 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters + 90;
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber = ((r6 ^ (-1)) + (r6 << 1)) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
            
                if ((r7 instanceof com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue) == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            
                if ((r7 instanceof com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue) == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            
                com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters = r8.k.c(r0 ^ 72, (r0 & 72) << 1, 1, 128);
             */
            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static boolean m152equalsimpl(int r6, java.lang.Object r7) {
                /*
                    int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber
                    r1 = r0 & 59
                    r2 = r0 ^ 59
                    r2 = r2 | r1
                    r3 = r1 ^ r2
                    r1 = r1 & r2
                    r2 = 1
                    int r1 = r1 << r2
                    int r3 = r3 + r1
                    int r1 = r3 % 128
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters = r1
                    int r3 = r3 % 2
                    r1 = 0
                    r4 = 128(0x80, float:1.8E-43)
                    if (r3 != 0) goto L1f
                    boolean r3 = r7 instanceof com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue
                    r5 = 6
                    int r5 = r5 / r1
                    if (r3 != 0) goto L2f
                    goto L23
                L1f:
                    boolean r3 = r7 instanceof com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue
                    if (r3 != 0) goto L2f
                L23:
                    r6 = r0 ^ 72
                    r7 = r0 & 72
                    int r7 = r7 << r2
                    int r6 = r8.k.c(r6, r7, r2, r4)
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters = r6
                    return r1
                L2f:
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r7 = (com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue) r7
                    int r7 = r7.m156unboximpl()
                    if (r6 == r7) goto L55
                    int r6 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber
                    int r6 = r6 + 15
                    int r6 = r6 % r4
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters = r6
                    r7 = r6 & (-4)
                    int r0 = ~r6
                    r0 = r0 & 3
                    r7 = r7 | r0
                    r6 = r6 & 3
                    int r6 = r6 << r2
                    int r6 = ~r6
                    int r7 = r7 - r6
                    int r7 = r7 - r2
                    int r6 = r7 % 128
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber = r6
                    int r7 = r7 % 2
                    if (r7 != 0) goto L53
                    return r1
                L53:
                    r6 = 0
                    throw r6
                L55:
                    int r6 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.AuthenticationRequestParameters
                    int r6 = r6 + 90
                    r7 = r6 ^ (-1)
                    int r6 = r6 << r2
                    int r7 = r7 + r6
                    int r7 = r7 % r4
                    com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.getSDKReferenceNumber = r7
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m152equalsimpl(int, java.lang.Object):boolean");
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m153equalsimpl0(int i11, int i12) {
                int i13 = AuthenticationRequestParameters;
                int i14 = i13 & 95;
                int i15 = -(-((i13 ^ 95) | i14));
                int i16 = (((i14 | i15) << 1) - (i14 ^ i15)) % 128;
                getSDKReferenceNumber = i16;
                if (i11 != i12) {
                    int i17 = ((i13 ^ 79) | (i13 & 79)) << 1;
                    int i18 = -((i13 & (-80)) | ((~i13) & 79));
                    getSDKReferenceNumber = ((i17 ^ i18) + ((i17 & i18) << 1)) % 128;
                    return false;
                }
                int i19 = i16 & 11;
                int i21 = ((i16 ^ 11) | i19) << 1;
                int i22 = -((~i19) & (i16 | 11));
                int i23 = ((i21 ^ i22) + ((i21 & i22) << 1)) % 128;
                AuthenticationRequestParameters = i23;
                int i24 = i23 & 99;
                int i25 = (~i24) & (i23 | 99);
                int i26 = i24 << 1;
                getSDKReferenceNumber = (((i25 | i26) << 1) - (i26 ^ i25)) % 128;
                return true;
            }

            public static int getSDKReferenceNumber() {
                int i11 = getDeviceData;
                int i12 = i11 % 8502924;
                getDeviceData = i11 + 1;
                if (i12 != 0) {
                    return getSDKTransactionID;
                }
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                getSDKTransactionID = iFreeMemory;
                return iFreeMemory;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m154hashCodeimpl(int i11) {
                int i12 = AuthenticationRequestParameters;
                int i13 = (i12 ^ 87) + ((i12 & 87) << 1);
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 == 0) {
                    return Integer.hashCode(i11);
                }
                Integer.hashCode(i11);
                throw null;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m155toStringimpl(int i11) {
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 67;
                int i14 = (i12 ^ 67) | i13;
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                getSDKReferenceNumber = i15 % 128;
                if (i15 % 2 == 0) {
                    return String.valueOf(i11);
                }
                String.valueOf(i11);
                throw null;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 113;
                int i13 = i12 + ((i11 ^ 113) | i12);
                AuthenticationRequestParameters = i13 % 128;
                int i14 = i13 % 2;
                int i15 = this.value;
                if (i14 == 0) {
                    m152equalsimpl(i15, obj);
                    throw null;
                }
                boolean zM152equalsimpl = m152equalsimpl(i15, obj);
                int i16 = getSDKReferenceNumber;
                int i17 = i16 & 109;
                AuthenticationRequestParameters = a0.d((i16 | 109) & (~i17), ~(-(-(i17 << 1))), 1, 128);
                return zM152equalsimpl;
            }

            public final int getValue() {
                int i11 = getSDKReferenceNumber;
                int i12 = ((i11 & 73) - (~(-(-(i11 | 73))))) - 1;
                AuthenticationRequestParameters = i12 % 128;
                int i13 = i12 % 2;
                int i14 = this.value;
                if (i13 != 0) {
                    return i14;
                }
                throw null;
            }

            public final int hashCode() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 1;
                int i13 = -(-((i11 ^ 1) | i12));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getSDKReferenceNumber = i14 % 128;
                int i15 = i14 % 2;
                int i16 = this.value;
                if (i15 != 0) {
                    m154hashCodeimpl(i16);
                    throw null;
                }
                int iM154hashCodeimpl = m154hashCodeimpl(i16);
                int i17 = getSDKReferenceNumber;
                int i18 = i17 & 115;
                int i19 = i18 + ((i17 ^ 115) | i18);
                AuthenticationRequestParameters = i19 % 128;
                if (i19 % 2 != 0) {
                    return iM154hashCodeimpl;
                }
                throw null;
            }

            @NotNull
            public final String toString() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 7;
                int i13 = -(-(i11 | 7));
                getSDKReferenceNumber = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                String strM155toStringimpl = m155toStringimpl(this.value);
                int i14 = AuthenticationRequestParameters;
                int i15 = i14 ^ 35;
                int i16 = -(-((i14 & 35) << 1));
                getSDKReferenceNumber = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
                return strM155toStringimpl;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ int m156unboximpl() {
                getSDKAppID.getSDKTransactionID.getSDKAppID();
                System.identityHashCode(this);
                int i11 = this.value;
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 59;
                getSDKReferenceNumber = (((i12 | 59) & (~i13)) + (i13 << 1)) % 128;
                return i11;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(J)J", "getValue", "()J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LongValue implements Success {
            private static int AuthenticationRequestParameters = 1;
            private static int getDeviceData;
            private final long value;

            private /* synthetic */ LongValue(long j9) {
                this.value = j9;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ LongValue m157boximpl(long j9) {
                LongValue longValue = new LongValue(j9);
                int i11 = getDeviceData;
                int i12 = ((i11 ^ 29) | (i11 & 29)) << 1;
                int i13 = -(((~i11) & 29) | (i11 & (-30)));
                AuthenticationRequestParameters = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                return longValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m158constructorimpl(long j9) {
                int i11 = getDeviceData;
                int i12 = (i11 ^ 65) + ((i11 & 65) << 1);
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 9 / 0;
                }
                return j9;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m159equalsimpl(long j9, Object obj) {
                int i11 = getDeviceData;
                int i12 = i11 & 45;
                int i13 = i12 + ((i11 ^ 45) | i12);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                if (obj instanceof LongValue) {
                    if (j9 == ((LongValue) obj).m163unboximpl()) {
                        int i14 = getDeviceData;
                        int i15 = i14 & 63;
                        int i16 = ((i14 ^ 63) | i15) << 1;
                        int i17 = -((i14 | 63) & (~i15));
                        AuthenticationRequestParameters = ((i16 & i17) + (i17 | i16)) % 128;
                        return true;
                    }
                    int i18 = getDeviceData;
                    int i19 = ((i18 & 121) + (i18 | 121)) % 128;
                    AuthenticationRequestParameters = i19;
                    int i21 = i19 & 101;
                    int i22 = ((i19 ^ 101) | i21) << 1;
                    int i23 = -((i19 | 101) & (~i21));
                    getDeviceData = ((i22 & i23) + (i22 | i23)) % 128;
                    return false;
                }
                int sDKAppID = getTransactionID.getDeviceData.getSDKAppID();
                int i24 = ~sDKAppID;
                int i25 = ~sDKAppID;
                int i26 = i24 & (i25 | sDKAppID);
                int i27 = ((i26 & 571479425) | (i26 ^ 571479425)) * 1324;
                int i28 = 1912249952 | i27;
                int i29 = ((i28 << 1) - (~(-((~(i27 & 1912249952)) & i28)))) - 1;
                int i31 = (i25 & 1664146843) | ((-1664146844) & sDKAppID);
                int i32 = 1664146843 & sDKAppID;
                int i33 = ~((i32 & i31) | (i31 ^ i32));
                int i34 = (-1303169659) & sDKAppID;
                int i35 = (sDKAppID | (-1303169659)) & (~i34);
                int i36 = ~((i35 & i34) | (i35 ^ i34));
                int i37 = i33 ^ i36;
                int i38 = i36 & i33;
                int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * (-1324)));
                int i41 = i29 & i39;
                int i42 = ((i29 ^ i39) | i41) << 1;
                int i43 = -((i39 | i29) & (~i41));
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                int i45 = (i44 & 2019179925) + (2019179925 | i44);
                int i46 = (i45 ^ (-1)) + (i45 << 1);
                int sDKAppID2 = getTransactionID.getDeviceData.getSDKAppID();
                int i47 = ~sDKAppID2;
                int i48 = ((-1242729252) & i47) | (sDKAppID2 & 1242729251);
                int i49 = (-1242729252) & sDKAppID2;
                int i51 = ~((i49 & i48) | (i48 ^ i49));
                int i52 = ((~i51) & 1208125441) | ((-1208125442) & i51);
                int i53 = i51 & 1208125441;
                int i54 = (i53 & i52) | (i52 ^ i53);
                int i55 = ~sDKAppID2;
                int i56 = i55 & 1823398993;
                int i57 = (~i56) & (i55 | 1823398993);
                int i58 = (i56 & i57) | (i57 ^ i56);
                int i59 = i58 & 1242729251;
                int i61 = (i58 | 1242729251) & (~i59);
                int i62 = ~((i61 & i59) | (i61 ^ i59));
                int i63 = -(-(((i54 & i62) | ((~i62) & i54) | ((~i54) & i62)) * 886));
                int i64 = (-1527718658) & i63;
                int i65 = (sDKAppID2 | i47) & i55;
                int i66 = i65 & 1242729251;
                int i67 = (i65 | 1242729251) & (~i66);
                int i68 = ~((i67 & i66) | (i67 ^ i66));
                int i69 = ((i64 + ((i63 ^ (-1527718658)) | i64)) - (~(-(~(((i68 & 1823398993) | (1823398993 ^ i68)) * (-1772)))))) - 2;
                int i71 = i55 & 1823398993;
                int i72 = (~i71) & (i55 | 1823398993);
                int i73 = -(-((~((i71 & i72) | (i72 ^ i71))) * 886));
                int i74 = i69 & i73;
                int i75 = ((i69 ^ i73) | i74) << 1;
                int i76 = -((i73 | i69) & (~i74));
                if (i46 > (i75 ^ i76) + ((i76 & i75) << 1)) {
                    return false;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m160equalsimpl0(long j9, long j11) {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 93;
                int i13 = ((i11 ^ 93) | i12) << 1;
                int i14 = -((~i12) & (i11 | 93));
                int i15 = (((i13 | i14) << 1) - (i13 ^ i14)) % 128;
                getDeviceData = i15;
                if (j9 != j11) {
                    int i16 = ((i15 ^ 91) | (i15 & 91)) << 1;
                    int i17 = -((i15 & (-92)) | ((~i15) & 91));
                    AuthenticationRequestParameters = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
                    return false;
                }
                int i18 = i11 & 103;
                int i19 = (i11 ^ 103) | i18;
                int i21 = ((i18 | i19) << 1) - (i18 ^ i19);
                getDeviceData = i21 % 128;
                boolean z11 = i21 % 2 == 0;
                int i22 = i11 & 85;
                int i23 = (i11 ^ 85) | i22;
                getDeviceData = ((i22 ^ i23) + ((i22 & i23) << 1)) % 128;
                return z11;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m161hashCodeimpl(long j9) {
                int i11 = getDeviceData;
                int i12 = i11 & 117;
                int i13 = i12 + ((i11 ^ 117) | i12);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    Long.hashCode(j9);
                    throw null;
                }
                int iHashCode = Long.hashCode(j9);
                int i14 = getDeviceData;
                int i15 = i14 & 101;
                int i16 = (i14 ^ 101) | i15;
                AuthenticationRequestParameters = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
                return iHashCode;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m162toStringimpl(long j9) {
                int i11 = AuthenticationRequestParameters;
                getDeviceData = a0.d(((i11 ^ 23) | (i11 & 23)) << 1, ~(-(((~i11) & 23) | (i11 & (-24)))), 1, 128);
                String strValueOf = String.valueOf(j9);
                int i12 = getDeviceData;
                int i13 = i12 & 71;
                int i14 = (((i12 | 71) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
                AuthenticationRequestParameters = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 76 / 0;
                }
                return strValueOf;
            }

            public final boolean equals(Object obj) {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 13;
                int i13 = (i11 ^ 13) | i12;
                getDeviceData = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                boolean zM159equalsimpl = m159equalsimpl(this.value, obj);
                int i14 = AuthenticationRequestParameters;
                getDeviceData = k.c(i14 & 16, i14 | 16, 1, 128);
                return zM159equalsimpl;
            }

            public final long getValue() {
                int i11 = getDeviceData + 3;
                AuthenticationRequestParameters = i11 % 128;
                int i12 = i11 % 2;
                long j9 = this.value;
                if (i12 != 0) {
                    return j9;
                }
                throw null;
            }

            public final int hashCode() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 77;
                int i13 = (((i11 ^ 77) | i12) << 1) - ((i11 | 77) & (~i12));
                getDeviceData = i13 % 128;
                int i14 = i13 % 2;
                long j9 = this.value;
                if (i14 == 0) {
                    return m161hashCodeimpl(j9);
                }
                m161hashCodeimpl(j9);
                throw null;
            }

            @NotNull
            public final String toString() {
                getDeviceData = (AuthenticationRequestParameters + 5) % 128;
                String strM162toStringimpl = m162toStringimpl(this.value);
                int i11 = AuthenticationRequestParameters;
                int i12 = (i11 & AppConstants.RESULT_CODE_ORDER_CANCELLED) + (i11 | AppConstants.RESULT_CODE_ORDER_CANCELLED);
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    return strM162toStringimpl;
                }
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m163unboximpl() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 97;
                int iD = a0.d(i12, ~(-(-((i11 ^ 97) | i12))), 1, 128);
                getDeviceData = iD;
                long j9 = this.value;
                AuthenticationRequestParameters = ((iD & 29) + (iD | 29)) % 128;
                return j9;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StringValue implements Success {
            private static int AuthenticationRequestParameters = 1;
            private static int getDeviceData;

            @NotNull
            private final String value;

            private /* synthetic */ StringValue(String str) {
                this.value = str;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ StringValue m164boximpl(String str) {
                StringValue stringValue = new StringValue(str);
                getDeviceData = (AuthenticationRequestParameters + 65) % 128;
                return stringValue;
            }

            @NotNull
            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m165constructorimpl(@NotNull String str) {
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                int i11 = ~sDKTransactionID;
                int i12 = (-546532328) | i11;
                int i13 = (((i12 | (~i12)) & (~i12)) | (~(((-869797095) ^ sDKTransactionID) | ((-869797095) & sDKTransactionID)))) * 217;
                int i14 = 677092409 & i13;
                int i15 = (i13 | 677092409) & (~i14);
                int i16 = i14 << 1;
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                int i18 = (-546532328) ^ sDKTransactionID;
                int i19 = (-546532328) & sDKTransactionID;
                int i21 = ~((i19 & i18) | (i18 ^ i19));
                int i22 = ((~i21) & 546310374) | ((-546310375) & i21);
                int i23 = i21 & 546310374;
                int i24 = -(~(-(-(((i23 & i22) | (i22 ^ i23)) * 217))));
                int i25 = (((i17 | i24) << 1) - (i24 ^ i17)) - 1;
                int i26 = (sDKTransactionID | i11) & (~sDKTransactionID);
                int i27 = (i26 & (-869797095)) | ((~i26) & (-869797095)) | (869797094 & i26);
                int i28 = (i27 | (~i27)) & (~i27);
                int i29 = 546532327 & i28;
                int i31 = (i28 | 546532327) & (~i29);
                int i32 = ((i31 & i29) | (i31 ^ i29)) * 217;
                int i33 = (i25 ^ i32) + ((i32 & i25) << 1);
                int sDKTransactionID2 = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                int i34 = ~sDKTransactionID2;
                int i35 = ~sDKTransactionID2;
                int i36 = (sDKTransactionID2 | i35) & i34;
                int i37 = (i36 & (-450171642)) | ((-450171642) ^ i36);
                int i38 = (i37 | (~i37)) & (~i37);
                int i39 = ((i38 & 2010944001) | (2010944001 ^ i38)) * (-983);
                int i41 = (-558071612) & i39;
                int i42 = (i39 | (-558071612)) & (~i41);
                int i43 = -(-(i41 << 1));
                int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                int i45 = 2010944001 & i35;
                int i46 = (2010944001 | i35) & (~i45);
                int i47 = -(~(((~((i45 & i46) | (i46 ^ i45))) | (-2145227514)) * 983));
                int i48 = ((i44 ^ i47) + ((i47 & i44) << 1)) - 1;
                str.getClass();
                if (i33 <= i48) {
                    throw null;
                }
                int i49 = AuthenticationRequestParameters;
                getDeviceData = ((i49 ^ 53) + ((i49 & 53) << 1)) % 128;
                return str;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m166equalsimpl(String str, Object obj) {
                int i11 = AuthenticationRequestParameters;
                getDeviceData = ((i11 ^ 93) + ((i11 & 93) << 1)) % 128;
                if (!(obj instanceof StringValue)) {
                    getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                    getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                    int i12 = AuthenticationRequestParameters;
                    int i13 = i12 | 7;
                    int i14 = i13 << 1;
                    int i15 = -((~(i12 & 7)) & i13);
                    int i16 = (i14 & i15) + (i15 | i14);
                    getDeviceData = i16 % 128;
                    if (i16 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (Intrinsics.areEqual(str, ((StringValue) obj).m170unboximpl())) {
                    int i17 = getDeviceData;
                    int i18 = i17 & 93;
                    int i19 = -(-((i17 ^ 93) | i18));
                    int i21 = ((i18 | i19) << 1) - (i19 ^ i18);
                    AuthenticationRequestParameters = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 8 / 0;
                    }
                    return true;
                }
                int i23 = getDeviceData;
                int i24 = ((i23 ^ 119) | (i23 & 119)) << 1;
                int i25 = -(((~i23) & 119) | (i23 & (-120)));
                int i26 = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
                AuthenticationRequestParameters = i26;
                int i27 = (i26 & 55) + (i26 | 55);
                getDeviceData = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 80 / 0;
                }
                return false;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m167equalsimpl0(String str, String str2) {
                int i11 = AuthenticationRequestParameters;
                int i12 = (i11 & 27) + (i11 | 27);
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    return Intrinsics.areEqual(str, str2);
                }
                Intrinsics.areEqual(str, str2);
                throw null;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m168hashCodeimpl(String str) {
                int i11 = AuthenticationRequestParameters;
                getDeviceData = ((-2) - ((((i11 | 16) << 1) - (i11 ^ 16)) ^ (-1))) % 128;
                int iHashCode = str.hashCode();
                int i12 = AuthenticationRequestParameters + 43;
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m169toStringimpl(String str) {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 13;
                int i13 = (((i11 | 13) & (~i12)) + (i12 << 1)) % 128;
                getDeviceData = i13;
                int i14 = i13 | 9;
                int i15 = (i14 << 1) - ((~(i13 & 9)) & i14);
                AuthenticationRequestParameters = i15 % 128;
                if (i15 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public final boolean equals(Object obj) {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 121;
                int i13 = (i11 ^ 121) | i12;
                int i14 = (i12 & i13) + (i13 | i12);
                getDeviceData = i14 % 128;
                int i15 = i14 % 2;
                String str = this.value;
                if (i15 != 0) {
                    m166equalsimpl(str, obj);
                    throw null;
                }
                boolean zM166equalsimpl = m166equalsimpl(str, obj);
                int i16 = AuthenticationRequestParameters;
                int i17 = i16 & 21;
                int i18 = -(-(i16 | 21));
                getDeviceData = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                return zM166equalsimpl;
            }

            @NotNull
            public final String getValue() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 ^ 93;
                int i13 = ((((i11 & 93) | i12) << 1) - (~(-i12))) - 1;
                int i14 = i13 % 128;
                getDeviceData = i14;
                int i15 = i13 % 2;
                String str = this.value;
                if (i15 != 0) {
                    throw null;
                }
                int i16 = i14 & 35;
                AuthenticationRequestParameters = ((((i14 ^ 35) | i16) << 1) - ((i14 | 35) & (~i16))) % 128;
                return str;
            }

            public final int hashCode() {
                int i11 = getDeviceData;
                int i12 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
                AuthenticationRequestParameters = i12 % 128;
                int i13 = i12 % 2;
                String str = this.value;
                if (i13 != 0) {
                    return m168hashCodeimpl(str);
                }
                m168hashCodeimpl(str);
                throw null;
            }

            @NotNull
            public final String toString() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 59;
                getDeviceData = a0.d(i12, ~((i11 ^ 59) | i12), 1, 128);
                String strM169toStringimpl = m169toStringimpl(this.value);
                int i13 = getDeviceData;
                int i14 = i13 ^ 95;
                int i15 = (i13 & 95) << 1;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                AuthenticationRequestParameters = i16 % 128;
                if (i16 % 2 != 0) {
                    return strM169toStringimpl;
                }
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m170unboximpl() {
                int i11 = getDeviceData;
                int i12 = ((-2) - (((i11 ^ 32) + ((i11 & 32) << 1)) ^ (-1))) % 128;
                AuthenticationRequestParameters = i12;
                String str = this.value;
                int i13 = (((i12 | 18) << 1) - (i12 ^ 18)) - 1;
                getDeviceData = i13 % 128;
                if (i13 % 2 == 0) {
                    return str;
                }
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringsListValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "toString", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StringsListValue implements Success {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;
            private static int[] getDeviceData;
            private static int getSDKReferenceNumber;
            private static int getSDKTransactionID;

            @NotNull
            private final List<String> value;

            private static String $$e(byte b8, byte b11, short s7) {
                int i11 = (b11 * 4) + 4;
                int i12 = b8 * 4;
                byte[] bArr = $$c;
                int i13 = 114 - s7;
                byte[] bArr2 = new byte[i12 + 1];
                int i14 = -1;
                if (bArr == null) {
                    i13 = (-i13) + i12;
                    i11++;
                    bArr = bArr;
                    i14 = -1;
                }
                while (true) {
                    int i15 = i14 + 1;
                    bArr2[i15] = (byte) i13;
                    if (i15 == i12) {
                        return new String(bArr2, 0);
                    }
                    i13 = (-bArr[i11]) + i13;
                    i11++;
                    bArr = bArr;
                    i14 = i15;
                }
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKTransactionID = 0;
                getSDKReferenceNumber = 1;
                getDeviceData = new int[]{1311308657, 697476520, -1005155404, 785204340, 795009126, 512639066, 1501066303, -1018836759, -1957831814, 977978563, 1948805076, -1880473857, 90603194, -825735682, 1579590682, -1332819960, -1356108201, 839355633};
            }

            private /* synthetic */ StringsListValue(List list) {
                this.value = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.$$a
                    int r7 = r7 * 15
                    int r1 = 26 - r7
                    int r5 = r5 * 6
                    int r5 = 103 - r5
                    int r6 = r6 * 25
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    int r7 = 25 - r7
                    r2 = 0
                    if (r0 != 0) goto L19
                    r4 = r5
                    r5 = r7
                    r3 = r2
                    goto L2b
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    if (r3 != r7) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L27:
                    r4 = r0[r6]
                    int r3 = r3 + 1
                L2b:
                    int r6 = r6 + 1
                    int r5 = r5 + r4
                    int r5 = r5 + (-5)
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.a(short, short, byte, java.lang.Object[]):void");
            }

            private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
                int i12;
                int i13;
                long j9;
                int i14;
                int i15;
                char[] cArr;
                int[] iArr2;
                int length;
                int[] iArr3;
                int i16;
                int i17;
                getMessageVersion getmessageversion = new getMessageVersion();
                char[] cArr2 = new char[4];
                int i18 = 2;
                char[] cArr3 = new char[iArr.length * 2];
                int[] iArr4 = getDeviceData;
                Class cls = Integer.TYPE;
                int i19 = 16;
                int i21 = 0;
                if (iArr4 != null) {
                    i13 = 53070;
                    int i22 = $11 + 109;
                    i12 = -1667528016;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        length = iArr4.length;
                        iArr3 = new int[length];
                    } else {
                        length = iArr4.length;
                        iArr3 = new int[length];
                    }
                    int i23 = 0;
                    j9 = 0;
                    while (i23 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr4[i23])};
                            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-1667528016);
                            if (sDKTransactionID == null) {
                                i16 = i18;
                                int i24 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2222;
                                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 53070);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(i21) + 21;
                                i17 = i19;
                                byte b8 = (byte) i21;
                                byte b11 = b8;
                                sDKTransactionID = ChallengeResult.getDeviceData(i24, edgeSlop, iNormalizeMetaState, 1089703072, false, $$e(b8, b11, b11), new Class[]{cls});
                            } else {
                                i16 = i18;
                                i17 = i19;
                            }
                            iArr3[i23] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                            i23++;
                            i18 = i16;
                            i19 = i17;
                            i21 = 0;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    }
                    iArr4 = iArr3;
                } else {
                    i12 = -1667528016;
                    i13 = 53070;
                    j9 = 0;
                }
                int i25 = i18;
                int i26 = i19;
                int length2 = iArr4.length;
                int[] iArr5 = new int[length2];
                int[] iArr6 = getDeviceData;
                if (iArr6 != null) {
                    int length3 = iArr6.length;
                    int[] iArr7 = new int[length3];
                    $11 = ($10 + 39) % 128;
                    int i27 = 0;
                    while (i27 < length3) {
                        Object[] objArr3 = {Integer.valueOf(iArr6[i27])};
                        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i12);
                        if (sDKTransactionID2 == null) {
                            cArr = cArr2;
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            iArr2 = iArr6;
                            sDKTransactionID2 = ChallengeResult.getDeviceData(2223 - ExpandableListView.getPackedPositionType(j9), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + i13), 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1089703072, false, $$e(b12, b13, b13), new Class[]{cls});
                        } else {
                            cArr = cArr2;
                            iArr2 = iArr6;
                        }
                        iArr7[i27] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                        i27++;
                        cArr2 = cArr;
                        iArr6 = iArr2;
                    }
                    iArr6 = iArr7;
                }
                char[] cArr4 = cArr2;
                System.arraycopy(iArr6, 0, iArr5, 0, length2);
                getmessageversion.getSDKAppID = 0;
                while (true) {
                    int i28 = getmessageversion.getSDKAppID;
                    if (i28 >= iArr.length) {
                        objArr[0] = new String(cArr3, 0, i11);
                        return;
                    }
                    $11 = ($10 + 55) % 128;
                    int i29 = iArr[i28];
                    char c3 = (char) (i29 >> 16);
                    cArr4[0] = c3;
                    char c7 = (char) i29;
                    int i31 = 1;
                    cArr4[1] = c7;
                    char c8 = (char) (iArr[i28 + 1] >> 16);
                    cArr4[i25] = c8;
                    char c11 = (char) iArr[i28 + 1];
                    cArr4[3] = c11;
                    getmessageversion.getDeviceData = (c3 << 16) + c7;
                    getmessageversion.AuthenticationRequestParameters = (c8 << 16) + c11;
                    getMessageVersion.getSDKTransactionID(iArr5);
                    $11 = ($10 + 63) % 128;
                    int i32 = 0;
                    while (true) {
                        i14 = getmessageversion.getDeviceData;
                        if (i32 >= i26) {
                            break;
                        }
                        int i33 = i14 ^ iArr5[i32];
                        getmessageversion.getDeviceData = i33;
                        int sDKReferenceNumber = getMessageVersion.getSDKReferenceNumber(i33);
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = getmessageversion;
                        objArr4[i25] = getmessageversion;
                        objArr4[i31] = Integer.valueOf(sDKReferenceNumber);
                        objArr4[0] = getmessageversion;
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1513246698);
                        if (sDKTransactionID3 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            i15 = i31;
                            sDKTransactionID3 = ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0', 0) + 2387, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + i31), 20 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)), -2040903174, false, $$e(b14, b15, (byte) (b15 + 2)), new Class[]{Object.class, cls, Object.class, Object.class});
                        } else {
                            i15 = i31;
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                        getmessageversion.AuthenticationRequestParameters = iIntValue;
                        i32++;
                        i31 = i15;
                        i26 = 16;
                    }
                    int i34 = i31;
                    int i35 = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.getDeviceData = i35;
                    getmessageversion.AuthenticationRequestParameters = i14;
                    int i36 = i14 ^ iArr5[16];
                    getmessageversion.AuthenticationRequestParameters = i36;
                    int i37 = i35 ^ iArr5[17];
                    getmessageversion.getDeviceData = i37;
                    cArr4[0] = (char) (i37 >>> 16);
                    cArr4[i34] = (char) i37;
                    cArr4[i25] = (char) (i36 >>> 16);
                    cArr4[3] = (char) i36;
                    getMessageVersion.getSDKTransactionID(iArr5);
                    int i38 = getmessageversion.getSDKAppID;
                    cArr3[i38 * 2] = cArr4[0];
                    cArr3[(i38 * 2) + 1] = cArr4[i34];
                    cArr3[(i38 * 2) + 2] = cArr4[i25];
                    cArr3[(i38 * 2) + 3] = cArr4[3];
                    int i39 = i25;
                    Object[] objArr5 = new Object[i39];
                    objArr5[i34] = getmessageversion;
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(35442447);
                    if (sDKTransactionID4 == null) {
                        i26 = 16;
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(1861 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSize(0, 0) + 40, -562771681, false, $$e(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i26 = 16;
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                    $10 = ($11 + 31) % 128;
                    i25 = i39;
                }
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ StringsListValue m171boximpl(List list) {
                StringsListValue stringsListValue = new StringsListValue(list);
                getSDKTransactionID = (getSDKReferenceNumber + 95) % 128;
                return stringsListValue;
            }

            @NotNull
            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends String> m172constructorimpl(@NotNull List<String> list) {
                int i11 = getSDKReferenceNumber + 107;
                getSDKTransactionID = i11 % 128;
                int i12 = i11 % 2;
                list.getClass();
                if (i12 == 0) {
                    return list;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m173equalsimpl(List<? extends String> list, Object obj) {
                if (!(obj instanceof StringsListValue)) {
                    int i11 = getSDKTransactionID + 97;
                    getSDKReferenceNumber = i11 % 128;
                    return i11 % 2 == 0;
                }
                if (!Intrinsics.areEqual(list, ((StringsListValue) obj).m177unboximpl())) {
                    int i12 = getSDKReferenceNumber + 3;
                    getSDKTransactionID = i12 % 128;
                    return i12 % 2 != 0;
                }
                int i13 = getSDKTransactionID + 125;
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 66 / 0;
                }
                return true;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m174equalsimpl0(List<? extends String> list, List<? extends String> list2) {
                getSDKReferenceNumber = (getSDKTransactionID + 11) % 128;
                boolean zAreEqual = Intrinsics.areEqual(list, list2);
                getSDKReferenceNumber = (getSDKTransactionID + 115) % 128;
                return zAreEqual;
            }

            public static void getSDKTransactionID(long j9, long j11) throws Throwable {
                int i11 = $$b;
                byte[] bArr = $$a;
                byte b8 = bArr[28];
                Object[] objArr = new Object[1];
                a((byte) (i11 & 3), b8, b8, objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                getSDKReferenceNumber = (getSDKTransactionID + 31) % 128;
                byte b11 = (byte) (i11 & 3);
                try {
                    byte b12 = bArr[28];
                    Object[] objArr2 = new Object[1];
                    a(b11, b12, b12, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    byte b13 = bArr[28];
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr3 = new Object[1];
                    a(b13, b14, b14, objArr3);
                    Method method = cls.getMethod((String) objArr3[0], null);
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(null, null);
                    Object[] objArr4 = {getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null)};
                    Object[] objArr5 = new Object[1];
                    b(new int[]{-396619471, -700083331}, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
                    Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                    method2.setAccessible(true);
                    int i12 = getSDKReferenceNumber + 21;
                    getSDKTransactionID = i12 % 128;
                    if (i12 % 2 != 0) {
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

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m175hashCodeimpl(List<? extends String> list) {
                int i11 = getSDKTransactionID + 61;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 == 0) {
                    list.hashCode();
                    throw null;
                }
                int iHashCode = list.hashCode();
                int i12 = getSDKTransactionID + 73;
                getSDKReferenceNumber = i12 % 128;
                if (i12 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            public static void init$0() {
                $$a = new byte[]{16, 15, -73, -127, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
                $$b = 53;
            }

            public static void init$1() {
                $$c = new byte[]{63, -107, 81, -105};
                $$d = 71;
            }

            @NotNull
            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m176toStringimpl(List<? extends String> list) {
                int i11 = getSDKTransactionID + 23;
                getSDKReferenceNumber = i11 % 128;
                int i12 = i11 % 2;
                String string = list.toString();
                if (i12 == 0) {
                    int i13 = 64 / 0;
                }
                return string;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKReferenceNumber + 43;
                getSDKTransactionID = i11 % 128;
                int i12 = i11 % 2;
                List<String> list = this.value;
                if (i12 != 0) {
                    m173equalsimpl(list, obj);
                    throw null;
                }
                boolean zM173equalsimpl = m173equalsimpl(list, obj);
                getSDKTransactionID = (getSDKReferenceNumber + 107) % 128;
                return zM173equalsimpl;
            }

            @NotNull
            public final List<String> getValue() {
                int i11 = getSDKReferenceNumber + 79;
                int i12 = i11 % 128;
                getSDKTransactionID = i12;
                int i13 = i11 % 2;
                List<String> list = this.value;
                if (i13 != 0) {
                    throw null;
                }
                getSDKReferenceNumber = (i12 + 19) % 128;
                return list;
            }

            public final int hashCode() {
                getSDKReferenceNumber = (getSDKTransactionID + 83) % 128;
                int iM175hashCodeimpl = m175hashCodeimpl(this.value);
                int i11 = getSDKReferenceNumber + 69;
                getSDKTransactionID = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 90 / 0;
                }
                return iM175hashCodeimpl;
            }

            @NotNull
            public final String toString() {
                int i11 = getSDKTransactionID + 5;
                getSDKReferenceNumber = i11 % 128;
                int i12 = i11 % 2;
                List<String> list = this.value;
                if (i12 != 0) {
                    return m176toStringimpl(list);
                }
                String strM176toStringimpl = m176toStringimpl(list);
                int i13 = 13 / 0;
                return strM176toStringimpl;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ List m177unboximpl() {
                int i11 = getSDKTransactionID + 63;
                int i12 = i11 % 128;
                getSDKReferenceNumber = i12;
                int i13 = i11 % 2;
                List<String> list = this.value;
                if (i13 == 0) {
                    int i14 = 12 / 0;
                }
                getSDKTransactionID = (i12 + 49) % 128;
                return list;
            }
        }
    }
}
