package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilitySpeakPassword;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessibilitySpeakPassword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilitySpeakPassword.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilitySpeakPassword\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r6 = r6 * 4
            int r6 = r6 + 111
            byte[] r1 = atd.x.AuthenticationRequestParameters.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r5
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.$$d(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getMessageVersion = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        new getSDKTransactionID((byte) 0);
        int i11 = getMessageVersion + 31;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private AuthenticationRequestParameters(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char[] cArr;
        int i13;
        String str3 = str2;
        $10 = ($11 + 11) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $10 = ($11 + 3) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr3 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        float f11 = 0.0f;
        int i14 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i15])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) ($$b - 5);
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2555 - (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)), (char) (48598 - View.MeasureSpec.makeMeasureSpec(i14, i14)), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    }
                    cArr4[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i15++;
                    f11 = 0.0f;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(147 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 32 - (ViewConfiguration.getScrollBarSize() >> 8), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i16 = 1124287645;
        if (getDeviceData) {
            $11 = ($10 + 63) % 128;
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr5 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i17 = challengeResultTimeout.getSDKAppID;
                int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i17] = (char) (cArr3[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i16);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) ($$b - 5);
                    byte b13 = (byte) (b12 + 1);
                    i13 = i16;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Drawable.resolveOpacity(0, 0) + 1697, (char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, -1620360563, false, $$d(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                } else {
                    i13 = i16;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i16 = i13;
            }
        } else if (getSDKAppID) {
            int i19 = $10 + 125;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                int length3 = cArr2.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr = new char[length3];
                i12 = 0;
            } else {
                i12 = 0;
                int length4 = cArr2.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                cArr = new char[length4];
            }
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i21] = (char) (cArr3[cArr2[(i22 - 1) - i21] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) ($$b - 5);
                    byte b15 = (byte) (b14 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(Color.argb(0, 0, 0, 0) + 1697, (char) (ViewConfiguration.getPressedStateDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 30, -1620360563, false, $$d(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int length5 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr6 = new char[length5];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i23] = (char) (cArr3[iArr[(i24 - 1) - i23] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i23 + 1;
                }
            }
        }
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{21812, 21809, 21770, 21766, 21772, 21760, 21816, 21808, 21815, 21765, 21734, 21745, 21755, 21752};
        getSDKReferenceNumber = 1286296737;
        getSDKAppID = true;
        getDeviceData = true;
    }

    public static void init$0() {
        $$a = new byte[]{18, 16, -71, -48};
        $$b = 5;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        ChallengeResultCancelled = (BuildConfig + 33) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u008a\u0089\u0088\u0087\u0081\u0081\u0084\u0082\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            int i11 = ChallengeResultCancelled + 79;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
                throw null;
            }
            Boolean sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
            if (sDKTransactionID != null) {
                DeviceParameterResult.Success.BooleanValue booleanValueH = a0.h(sDKTransactionID);
                BuildConfig = (ChallengeResultCancelled + 55) % 128;
                return booleanValueH;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilitySpeakPassword$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] getDeviceData;
        private static int getSDKAppID;
        private static long getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r5, byte r6, byte r7) {
            /*
                byte[] r0 = atd.x.AuthenticationRequestParameters.getSDKTransactionID.$$c
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = 106 - r6
                int r5 = r5 * 3
                int r1 = r5 + 1
                byte[] r1 = new byte[r1]
                r2 = -1
                if (r0 != 0) goto L14
                r3 = r5
                r6 = r7
                goto L27
            L14:
                r4 = r7
                r7 = r6
                r6 = r4
            L17:
                int r2 = r2 + 1
                byte r3 = (byte) r7
                r1[r2] = r3
                if (r2 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r1, r6)
                return r5
            L25:
                r3 = r0[r6]
            L27:
                int r7 = r7 + r3
                int r6 = r6 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.getSDKTransactionID.$$e(short, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            AuthenticationRequestParameters = 1;
            char[] cArr = new char[2156];
            ByteBuffer.wrap("ô!ÐÎ½#\u0099\u0094f±C]/¹ô\u001eÑJ½¬\u009a\u000fgqCÖ(\u0005ô\u0097Ñö¾*\u009a\u0098gãLQ(\u00adõ%Òe¾Â\u009b\u000f`iLÃ±3\u0095Üø1Ü\u0086#£\u0006Oj«±\f\u0094Xø¾ß\u001d\"c\u0006Äm\u0017±\u0094\u0094éû,ß\u009d\"Ë\tTm¼°\u001a\u0097gûÔÞ\u0018\u0004k \u0084MiiÞ\u0096û³\u0017ßó\u0004T!\u0000MæjE\u0097;³\u009cØO\u0004Ï!¡NjjÃô!ÐÙ½?\u0099\u0091f±CW/¹ô\u0016Ñ[½¦\u009a\u0003g-CÙ(5ô\u009aÑö¾(\u009a\u0083gõLJ(\u0081õ\u0018Òw¾Æ\u009b\u001a`oLÔ);\u0088\u009f¬qÁ\u008cå?\u001a\u000f?àS\u000f\u0088â\u00adàÁ\u0006æ·\u001bÌô!ÐÏ½2\u0099\u0081f±CI/¿ô\u001fÑ\u0000½º\u009a\u0014gmCÎºP\u009e¨óS×ð(\u008e\r9aÃº,\u009f\róýÔZ)\u001c\r¹fNºÃ\u009f\u0082ðKÔúô!ÐÎ½'\u0099\u0096fÿC\u0015/øô\u0011Ñ^½¿\u009a\u000fglCØ(5ô|ÐÅ½h\u0099\u0080fñCU/¢ô\\Ñ\\½¯\u009a\u0002gpCÑ(3ô\u0092ÑÍ¾ \u009a\u008fgòL}(ºõ\u0014Òe¾\u0083qðUI8ä\u001c\fã}ÆÙª.qÐTÐ8#\u001f\u008eâüÆ]\u00ad¿q\u001eTA;¬\u001f\u0003â~Éñ\u00ad6p\u0098Wé;\fô!ÐÙ½?\u0099\u0091fêC_/»ô]ÑB½£\u009a\u0004g-CÒ(3ô\u0094Ñü¾,\u009aÄgõLMôlÐÃ½!\u0099\u008cfñCBôRÐëô!ÐÙ½?\u0099\u0091fêC_/»ô]ÑL½£\u009a\bg-CÐ(?ô\u009bÑç¾\u0018\u009a§g«LL(»õ\u0017Òc¾\u009f\u009b\r`eLÈ)6õ\u008cÒõ¿Zô!ÐÙ½?\u0099\u0091fêC_/»ô]ÑL½£\u009a\bg-CÐ(?ô\u009bÑç¾\u0018\u009a§g«LR(¬õ\u0015Òf\u007fc[\u009b6}\u0012Óí¨È\u001d¤ù\u007f\u001fZ\u00006á\u0011FìoÈ\u0090£q\u007fÖZ¾5i\u0011Åì±Ç6£Ñ~HY&5\u009f\u0010\\ëfÇ\u0097¢o²}\u0096\u0092û\u007fßÈ í\u0005\biï²C\u0097\u0007ûñÜO!;\u0005\u0091nrô|ÐÅ½h\u0099\u0080fëCS/ºô\u0016Ñ\u0000½¢\u009a\tgqCÊÂoæÀ\u008b(¯\u009ePôu\u001b\u0019·Â\u0018çUô!ÐÚ½4\u0099\u008dfýC\u0015/°ô\u001bÑB½¯\u009a\u0015g{CÍ(.ô\u0093Ñÿ¾=\u0090\u008f´ ÙÄýx\u0002\u0002'³\u0093~·ÇÚjþ\u0090\u0001î$WH°\u0093\u0005¶OÚ¼ýJ\u0000m$ÝO6\u0093\u0081¶öÙ-ý\u008b\u0000ð+UO®\u0092\u001dµfôiÐÏ½(\u0099\u009bJEnô\u0003\u000f'ªØÌýr\u0091\u0099Jgof\u0003\u0088$.Ù\u0017ýç\u0096\u0005JãoÍ\u0000\u0010$³ÙÈò~\u0096ËK&l]\u0000ü%{ÞWòü\u0097\u0012K lþ\u0001j%\u0099ÞÀóN\u0097\u008fH<mK\u0001å:\bÞ»óð\u0094\u0003²,\u0096\u009dûfßÃ ¥\u0005\u001bið²\u000e\u0097\u000fûáÜG!~\u0005\u008enl²\u008a\u0097¤øyÜÚ!¡\n\u0017n¢³O\u00944ø\u0095Ý\u0012&>\n\u0095o{³É\u0094\u0097ù\u0003Ýð&©\u000b'oâ°U\u0095\"ù\u008cÂk&Òô~ÐÏ½4\u0099\u0091f÷CI/¢ô\\Ñ]½³\u009a\u0015g,CÜ(>ôØÑö¾+\u009a\u0088góLE(ðõ\bÒy¾\u009c\u009b\r`{LÏô~ÐÏ½4\u0099\u0091f÷CI/¢ô\\Ñ]½³\u009a\u0015g,CÜ(>ôØÑö¾+\u009a\u0088góLE(ðõ\bÒy¾\u009c\u009b\u0002`kLÅô~ÐÏ½4\u0099\u0091f÷CI/¢ô\\Ñ]½³\u009a\u0015g,CÜ(>ôØÑö¾+\u009a\u0088góLE(ðõ\bÒy¾\u009c\u009b\u0003`iLÅV>r\u008f\u001ft;ÑÄ·á\t\u008dâV\u001cs\u001d\u001fó8UÅlá\u009c\u008a~V\u0098s¶\u001ck8ÈÅ³î\u0005\u008a°WHp9\u001cÜ9CÂ$î\u0085ôxÐÈ½)\u0099\u009afíC\\ô!ÐÚ½4\u0099\u008dfýC\u0015/»ô\u001dÑJ½¿\u009a\nggCÍ\u0016(2\u0098_y{Ê\u0084©¡\u001fÍã\u0016Q3\nô!ÐÙ½?\u0099\u0091fêC_/»ô]ÑH½¸\u009a\u0007goCÛ(-ô\u0099Ñà¾%\u009aÅgñLK(°õ\u001eÒy¾Å\u009b\u001d`'LÕ);õ\u008dÒî¿S\u009b¿`ÑMY)£ö\u0010Óh¿ß\u0084$`ÜMÄ*+ö\u0094ô!ÐÜ½#\u0099\u008cfúCU/¤ô]ÑB½£\u009a\u0004g4C\u008a(uô\u009eÑå¾a\u009a\u008bgóLF(·õ\u0015Ò8¾Â\u009b\u001c`cLË)#õ\u008cÒã¿\u0018\u009b¥`çMD)¢ö\rÓi¿É\u0084x`\u0081MÁô!ÐÜ½#\u0099\u008cfúCU/¤ô]ÑB½£\u009a\u0004g4C\u008a(uô\u009eÑå¾a\u009a\u0082gñLA(±õ\u0017Òf¾Ý\u009b\u001d`oLÔ)lõ\u0089Òó¿X\u009b¶`áM])µöLÓm¿Õô!ÐÙ½?\u0099\u0091fêC_/»ô]ÑB½£\u009a\u0004g4C\u008a(uô\u0095Ñþ¾!\u009a\u009fgâL}(¿õ\u0013Òr¾Þ\u009b1`cLÈ)6õ\u009bÒè¿P\u009b³`íMO)ëö\u0001Ón¿Ê\u0084x`\u0081MÁ$Y\u0000·mJIù¶É\u0093+ÿÀ$c\u0001\"m\u009dJw·\u0014\u0093¯øV$ \u0001\u0089nZJý·\u008b\u009c>øÕ%g\u0002\u001cn¼K\u007f°\u0011\u009c»ù\u0014%ô\u0002\u0081«\u0095\u008f\u0013âôÆG9/\u001c\u0089p~«Ç\u008e\u009dâxô{ÐÄ½-\u0099\u008cfñCM/¸âÖÆy«\u008f\u008f6pHUè9\u0018â¤â\rÆ´«\u0019\u008fãp\u009dU$9ÃâvÇ<«Ï\u008c9q\u0017Uª>]âîÇ\u0080¨ZwüSL>\u00ad\u001a\u001eå\"À\u0088¬\"ôiÐÏ½(\u0099\u0087fìCS/µé\u001fÍ¹ ^\u0084ñ{\u009a^%2Ãé[Ì  \u0084\u0087&\u0096T²òß\u0015ûº\u0004Ñ!nM\u0088\u0096\u0010³kßÏøm\u0005`!µJS\u001f\f;µV\u0018râ\u008d\u009c¨%ÄÂ\u001fw:=VÎq8\u008c\u001f¨¡ÃN\u001fã:\u008e\u0098l¼ßÑ<ôkÐÇ½3\u0099\u008efÿCN/¹ô\u0000ôOÐÚ½6\u0099ÂfÌCO/¸ô\u0006ÑG½§\u009a\u0003g\"CØ(5ô\u0084Ñ²¾\r\u009a\u0082gôLM(³õ\u001f\u0095!±ªÜLøþ\u0007\u009f\"=NÜ\u0095<°\u0013ÜàûC\u0006L\"²IA\u0095ñ°\u0090ßTû¤\u0006\u008e-#IÂ\u00944³\u0000ßäú6\u0015~1õ\\\u0013x¡\u0087À¢bÎ\u0083\u0015c0L\\¿{\u001c\u0086\u0013¢íÉ\u001e\u0015®0Ï_\u000b{û\u0086Ñ\u00ad|É\u009d\u0014k3__»zi\u0081d\u00ad¡ÈGô|ÐÅ½h\u0099\u008afÿCH/²ô\u0005ÑO½¸\u009a\u0003ôiÐÅ½*\u0099\u0086føCS/¥ô\u001aôxÐÈ½)\u0099\u009af¦C\fô|ÐË½(\u0099\u0081föCOó1×\u0088º%\u009eßa¡D\u0018(ÿóJÖ\u0000ºó\u009d\u0005`-D\u0081/vóÕÖ»ô|ÐÅ½h\u0099\u0089fûCH/¸ô\u0017ÑB½ä\u009a\u0017ggCÓ(/å\u00179õ\u001dLpáT\u0018«r\u008eÐâ*9\u0089\u001cÂ <WIsð\u001e]:µÅÞàf\u008c\u008fW#r5\u001e\u008f9!ÄXàï\u008b\u001aW rÓôhÐß½*\u0099\u008efÁCB/îôDÁ\u0013åª\u0088\u0007¬ïS\u0084v<\u001aÕÁyäo\u0088Ã¯`R\u0003v¶\u001dPÁëä\u008d\u008bS¯ìR\u0087y9ôiÐÏ½(\u0099\u0087fìCS/µô]Ñ]½®\u009a\rg-CÙ(?ô\u0098Ñ÷¾<\u009a\u0083gå\b\u0087,!AÆei\u009a\u0002¿½Ó[\bÃ-¸A\u001cf¾\u009bÃ¿#ÔÐ\bs-#BØf<\u009b^°ãÔW\tñ.\u0096B9gò\u009c\u008d°+Õó\th.LCîI\u0082m$\u0000Ã$lÛ\u0007þ¸\u0092^I¶l¢\u0000N'âÚ\u008eþ9\u0095ÔIBl\n\u0003Á'jÚBñ®\u0095PHÿo\u0098\u0003+&ìÝ\u0082âÙÆ\u007f«\u0098\u008f7p\\Uã9\u0005âíÇè«\u0018\u008c¹qÊU6>Üâ6Ç\r¨\u0088\u008c8qYZê>VãüÄÖôiÐÅ½)\u0099\u0085fòC_/ùô\u0001ÑJ½¡\u009a9geCÎ(2ô\u0099Ñü¾+\u009aµgþL\u001a(èõUÒq¾×\u009b\u0000`oLÔ)+õ\u009dÒÅ¿N\u009bê`¸æ\u0095Â,¯\u0081\u008bit\u0018Q¼=Kæ÷Ã¨¯B\u0088ëu\u008eQ%\u001aÿ>FSëw\u0003\u0088r\u00adÖÁ!\u001a\u0098?ÀS(t\u0082\u0089ä\u00ad\u0013Æ»\u001a\u0000?xP¡t\r\u0089+¢ÇÆ4\u001b\u0097<òPTu\u009f\u008eù¢WÇ¨\u001b\u0013<m:\u0004\u001e\u008fsiWÛ¨º\u008d\u0018áù:\u0014\u001f\u001ds¹T\u001bg¶C\u000f.¢\nJõ!Ð\u0099¼pgÜBÊ.d\tÅô»Ð\u0004»üg]B!-ª\tIô((?\f\u008aapEÓºö÷\u0081Ó\"¾É\u009apeV@¯,F÷÷Òæ¾]\u0099åd\u0089@-+\u0091÷`Ò\u0006½Ç\u0099|d\u0013ô\u007fÐÏ½+\u0099\u0097f°CR/¡ô\\ÑC½«\u009a\u000fglCÕ(?ô\u008fÑáô\u007fÐÏ½+\u0099\u0097f°CI/°ô\\ÑH½«\u009a\rggCá(9ô\u0097Ñÿ¾+\u009a\u0098gçô\u007fÐÏ½+\u0099\u0097f°CI/°ô\\ÑB½©\u009a\u0002g]CÚ(?ô\u0098Ñá¾'\u009a\u009egÿ°`\u0094ÙùtÝ\u0095\"ç\u0007Tk¤°\u000b\u0095^ùøÞ\u001b#p\u0007Æl4°\u0085\u0095çú6ÞØ#ë\b[l¯±\u0013\u0096nô|ÐÅ½h\u0099\u0080fñCU/¢ô\\Ñ_½¯\u009a\u000bgwC\u0090(;ô\u0080Ñö¾\u0011\u009a\u0084gçLO(»Â\u001dæ¤\u008b\t¯ìP\u009bu6\u0019\u0099Âqç:\u008bÂ¬kQ\u0007uñ\u001e]Âþç\u009d\u0088H¬îQ\u0095z3\u001eÍÃrä\u0019\u0088§ô|ÐÅ½h\u0099\u0092fìCU/²ô\u0007ÑM½¾\u009aHg`CË(3ô\u009aÑö¾`\u009a\u008cgïLL(¹õ\u001fÒd¾Â\u009b\u001c`cLÈ)6ô|ÐÅ½h\u0099\u0091fçCI/¢ô\u0017ÑC½ä\u009a\u0004gwC×(6ô\u0092Ñ¼¾(\u009a\u0083gèLE(»õ\bÒf¾À\u009b\u0007`dLÒô|ÐÅ½h\u0099\u0091fçCI/¢ô\u0017ÑC½\u0095\u009a\u0003gzCÊ(tô\u0094Ñç¾'\u009a\u0086gâL\f(¸õ\u0013Òx¾Õ\u009b\u000b`xLÖ)0õ\u0097Òô¿BñªÕ\u0013¸¾\u009cBc-F\u0082*dñËÔ\u008a¸2\u009fÒb¡F\u0001-àñDÔj»þ\u009fUb>I\u0093-mðÞ×°»\u0016\u009eÑe²I\u0004ë Ï\u0099¢4\u0086Èy§\\\b0îëAÎ\u0000¢É\u0085^x2\\\u00897kë\u0084Î¬¡g\u0085ßx¶S\u001a7¬ê@Í#¡\u0080\u0084U\u007f3S\u00886nêÐÍ¯ \u0004\u0084úô&\u0096\u000f²§BCô'ô!ÐÎ½#\u0099\u0094f±CK/³ô\u001fÑ[½\u0095\u009a\u0016gkCÎ(?ô!ÐÎ½#\u0099\u0094f±CI/¹ô\u0011ÑE½¯\u009a\u0012g-CÜ(;ô\u0085Ñ÷¾,\u009a\u008bgèLF(\u0081õ\u001dÒs¾Ü\u009b\u0017`nô!ÐÎ½#\u0099\u0094f±CI/¹ô\u0011ÑE½¯\u009a\u0012g-CÙ(?ô\u0098Ñë¾*ô!ÐÎ½#\u0099\u0094f±CI/¹ô\u0011ÑE½¯\u009a\u0012g-CÏ(?ô\u009bÑç¾*±v\u0095\u008eøhÜÆ#æ\u0006\u001cjä±H\u0094\føÂßE\"'\u0006\u0088mn±Ä¨\u0005\u008cýá\u001bÅµ:Î\u001f{s\u009f¨y\u008dfá\u0087Æ ;\t\u001föt\u0017¨°\u008dÕâ5Æ£;Ã\u0010jt\u0096©1\u008eQâÉÇ.<K\u0010àu\u0013©½\u008eáãcÇ\u0093<Ç\u0011{uÌª5\u008fU\u008ck¨\u0084ÅiáÞ\u001eû;\u0012Wï\u008cL©;Åçâ\\\u001f;\u008c!¨ÎÅ#á\u0094\u001e±;XW¥\u008c\u0006©qÅ¾â\u000f\u001fo;Ûy\u0004]ë0\u0006\u0014±ë\u0094Îl¢\u009cy4\\`0\u008a\u00177ê\bÎù¥\fy§\\Ñ3\u0004\u0017£êÇÁb¥\u0089x;ô!ÐÙ½?\u0099\u0091fêC_/»ô]ÑB½£\u009a\u0004g-CÒ(3ô\u0094Ñð¾=\u009a\u009egàLM(²õ\u001eÒs¾À\u009b1``LÈ)+õÐÒé¿YE\u009cas\f\u009e()×\fòå\u009e\u0018E»`ò\f\u0014+¸ÖÚô!ÐÎ½#\u0099\u0094f±CX/¥ô\u0006ÑI½³\u009a\u0014gm\u008c$¨ËÅ&á\u0091\u001e´;]W \u008c\u0003©FÅªâ\u0004\u001fi\u0007Ï# NÍjz\u0095_°¶ÜK\u0007è\"¯NViá\u0094\u0089ô!ÐÎ½#\u0099\u0094f±CX/¥ô\u0006ÑX½§\u009a\u0015geô!ÐÎ½#\u0099\u0094f±CX/¥ô\u0006Ñ^½\u00ad\u009a\u0007gkCÎ(9Z\b~ç\u0013\n7½È\u0098íq\u0081\u008cZ/\u007fX\u0013\u008a4\"ÉNô!ÐÎ½'\u0099\u0096fÿC\u0015/²ô\u001dÑY½¤\u009a\ngmCß(>ô\u0085Ñ½¾`\u009a\u0092gäL\r(¼õ\tÒb¾Ùô!ÐÇ½(\u0099\u0096f±CM/¿ô\u001cÑJ½¥\u009a\u0011gqC\u0091(\u0018ô\u0085Ñæ¾\u001d\u009a\u0082gçLP(»õ\u001eÒP¾Ý\u009b\u0002`nLÃ)0ô!ÐÚ½4\u0099\u008dfýC\u0015/¿ô\u001dÑ^½¥\u009a\u0014gvCÍô>ÐÌ½ \u0099Âf¤Bùf\u0002\u000bì/UÐ%õÍ\u0099}BÏg\u009a\u000bt,\u0091Ñ·õ\u0007\u009eòB]ôiÐØ½'\u0099\u008efòCU/µô\\ÑI½¥\u009a\ngfCØ(3ô\u0085Ñú¾`\u009a\u0099géa`EÁ(&\f§óÐÖ}º\u0087a/DN(»\u000f\u0010ò.ÖÏ½7w SN>³\u001a\u0000å0ÀÖ¬2w\u0097RÆ>*\u0019¸äàÀP«¿w\u0012Rp=¼\u0019Eä\u007fÏÎ«3ôlÐÆ½3\u0099\u0087fíCN/·ô\u0011ÑE½¹\u0012|6\u0092[o\u007fÜ\u0080ì¥\nÉä\u0012Z7\u001d[ã|Hô!ÐÎ½'\u0099\u0096fÿC\u0015/²ô\u001dÑY½¤\u009a\ngmCß(>ô\u0085Ñ½¾`\u009a\u008egöL\r(¿õ\nÒf¾Á\u009b@`rLË).ô!ÐÚ½4\u0099\u008dfýC\u0015/µô\u0002Ñ[½£\u009a\bgdCÑèqÌý¡\u0012\u0085¾zÀ_k3\u009dè\"Óý÷\u0012\u009aû¾JA#dÉ\bgÓÇö\u0081\u009au½\u0095@®d\u0010\u000féÓLö'\u0099þ½S@)kÑ\u000faÒÓõ¸\u0099A¼\u0082Gùk\u0019\u000eñÒOõh\u0098\u0087¼gG1j\u0084\u000euÑÈô«\u0098\u0014£þG\u0000j\u001f\róÑWô+\u009f\u008b£kFÏ".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asCharBuffer().get(cArr, 0, 2156);
            getDeviceData = cArr;
            getSDKReferenceNumber = -926256287197114198L;
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x018d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r25, char r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.getSDKTransactionID.a(int, char, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                int r6 = r6 + 101
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r0 = atd.x.AuthenticationRequestParameters.getSDKTransactionID.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r6 = r7
                r3 = r0
                r4 = r2
                r0 = r8
                goto L2d
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r6 = r6 + r8
                int r6 = r6 + (-22)
                r8 = r0
                r0 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.getSDKTransactionID.b(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0de1  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0e87  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x14a7  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x14bb  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x1632  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x1f64  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x1f8d  */
        /* JADX WARN: Removed duplicated region for block: B:376:0x0d8d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0500  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0504  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0748  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x09a8  */
        /* JADX WARN: Type inference failed for: r31v10 */
        /* JADX WARN: Type inference failed for: r31v11 */
        /* JADX WARN: Type inference failed for: r31v12 */
        /* JADX WARN: Type inference failed for: r31v13, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r31v16 */
        /* JADX WARN: Type inference failed for: r31v28 */
        /* JADX WARN: Type inference failed for: r31v29 */
        /* JADX WARN: Type inference failed for: r31v30 */
        /* JADX WARN: Type inference failed for: r31v31 */
        /* JADX WARN: Type inference failed for: r31v32 */
        /* JADX WARN: Type inference failed for: r31v33 */
        /* JADX WARN: Type inference failed for: r31v34 */
        /* JADX WARN: Type inference failed for: r31v35 */
        /* JADX WARN: Type inference failed for: r31v36 */
        /* JADX WARN: Type inference failed for: r31v9 */
        /* JADX WARN: Type inference failed for: r9v258 */
        /* JADX WARN: Type inference failed for: r9v259 */
        /* JADX WARN: Type inference failed for: r9v260, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v265, types: [int] */
        /* JADX WARN: Type inference failed for: r9v267 */
        /* JADX WARN: Type inference failed for: r9v268 */
        /* JADX WARN: Type inference failed for: r9v435 */
        /* JADX WARN: Type inference failed for: r9v436 */
        /* JADX WARN: Type inference failed for: r9v437 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] getDeviceData(android.content.Context r62, int r63, int r64, int r65) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 11517
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.getSDKTransactionID.getDeviceData(android.content.Context, int, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{112, -4, 67, 92, -30, 23, 17, 23, 11, 29, 30};
            $$b = 69;
        }

        public static void init$1() {
            $$c = new byte[]{63, -107, 81, -105};
            $$d = 13;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
