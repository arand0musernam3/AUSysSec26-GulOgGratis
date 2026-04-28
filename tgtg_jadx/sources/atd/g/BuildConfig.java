package atd.g;

import a3.c0;
import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.k.ChallengeResult;
import atd.k.getTransactionStatus;
import atd.n.ChallengeResultCompleted;
import atd.n.getDeviceData;
import atd.p.getMessageVersion;
import atd.w.ChallengeStatusReceiver;
import atd.w.CompletionEvent;
import atd.w.InitializeResult;
import atd.w.InitializeResultFailure;
import atd.w.InitializeResultKt;
import atd.w.ProgressDialog;
import atd.w.cancelled;
import atd.w.getErrorCode;
import atd.w.getErrorDetails;
import atd.w.getTransactionID;
import atd.w.protocolError;
import atd.w.toString;
import atd.x.ChallengeResultError;
import atd.x.ChallengeStatusHandler;
import atd.x.getAdditionalDetails;
import atd.y.ChallengeResultTimeout;
import atd.y.completed;
import atd.y.timedout;
import atd.z.ChallengeResultCancelled;
import atd.z.ChallengeResultKt;
import atd.z.ErrorMessage;
import atd.z.InitializeResultSuccess;
import atd.z.getErrorDescription;
import atd.z.getSDKEphemeralPublicKey;
import atd.z.hashCode;
import atd.z.onCompletion;
import atd.z.runtimeError;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u0010\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u0011\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u0012\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u0013\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u001c\u0010\u0014\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0002J$\u0010\u0015\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u0016\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u0017\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u0018\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u0019\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0002J$\u0010\u001a\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\u001b\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u001c\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0002J$\u0010\u001d\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J6\u0010\u001e\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\n\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\n*\u00060\u0004j\u0002`\u0005H\u0002J$\u0010$\u001a\u00020\u000e*\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceParametersDataVersion17;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameters;", "restrictedParameters", "", "", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/Identifier;", "<init>", "(Ljava/util/Collection;)V", "get", "", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "application", "Landroid/app/Application;", "addCommonParameters", "", "", "addTelephonyParameters", "addWifiParameters", "addBluetoothParameters", "addBuildParameters", "addBuildVersionParameters", "addSettingsSecureParameters", "addSettingsGlobalParameters", "addSettingsSystemParameters", "addPackageManagerParameters", "addEnvironmentParameters", "addLocaleParameters", "addDisplayMetricsParameters", "addStatsFsParameters", "addWebViewParameters", "addFor", "identifier", "parameter", "Lkotlin/Function0;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "getRestrictedFailureResultOrNull", "addLocationResults", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    @Nullable
    private final Collection<String> getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = 106 - r8
            byte[] r1 = atd.g.BuildConfig.$$a
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r8 = r6
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r1
            int r8 = r8 + 1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.BuildConfig.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKReferenceNumber = 1;
        char[] cArr = new char[740];
        ByteBuffer.wrap("ôM+óK¤kX\u001d\u0088Â6¢a\u0082\u009eôM+óK¤kZ\u0083Ê\\t<#\u001cÚôM+óK¤k\\(\u0096÷(\u0097\u007f·\u0084ôM+óK¤kQ£¢|\u001c\u001cK<¿ôM+óK¥kYôM+óK¥kZr~\u00adÀÍ\u0096ínåI:÷Z¡zX3 ì\u001e\u008cH¬²ôM+óK¥k^ôM+óK¥kQôO+óK¤kX[\u0001\u0084½äêÄ\u0015\u0000¿ß\u0003¿T\u009fªã\u0016<ª\\ý|\u0004Æk\u0019×y\u0080Yx&åùY\u0099\u000e¹õÿá ]@\n`ðôO+óK¤kQG@\u0098üø«Ø_0Rïî\u008f¸¯DôO+óK¥kX$ëûW\u009b\u0001»ÿ¥\u0095z)\u001a\u007f:\u0080\n¹Õ\u0005µS\u0095«ôO+óK¥k\\ôO+óK¥k_í\u001f2£Rõr\u000eÜ\u0080\u0003<cjC\u009e\u0092^Mâ-´\rAøE'ùG¬gSe\rº±Úäú\u001aül#ÐC\u0085cxôO+óK¦kZÓÜ\f`l5LÎôO+óK¦k\\ôO+óK¦k_^\u0099\u0081%ápÁ\u0088ôO+òK§kQôO+òK§kPSø\u008cEì\u0017ÌîôO+òK kXôO+òK k[ôO+òK kZ½\u0098b%\u0002w\"\u008bgâ¸_Ø\føò\u0085ôZI:\u0019\u001aëôO+óK¦kQ\u009a½E\u0001%T\u0005¢\\©\u0083\u0015ãAÃ¿ôO+óK§kX1\u0016îª\u008eþ®\u0002\u0015£Ê\u001fªK\u008a¶\u00ad\u0092r.\u0012z2\u0080nc±ßÑ\u008bñpôO+óK§k_N´\u0091\bñ\\Ñ¥ôO+óK§kQôO+òK k_äç;Z[\b{öôO+òK kQ\\û\u0083Fã\u0015Ãêy=¦\u0080ÆÓæ#ôO+òK¡kPôO+òK¢kYTÛ\u008bfë6ËÌê85\u0085UÕu,ôO+òK¢kZ\u0010\u001aÏ§¯÷\u008f\bôO+òK¢k\\ôO+òK¢k_\u0015ÄÊxª,\u008aÛÈw\u0017Ëw\u0098Wa\u0094\u0000K½+ï\u000b\u001fôO+óK kXw\u001d¨ Èðè\f\rÔÒh²;\u0092ÀW\u000e\u0088²èáÈ\u001bF \u0099\u009cùÏÙ2ôO+óK k\\ôO+óK k_Jv\u0095Êõ\u0099Õg,¾ó\u0002\u0093Q³ yÊ¦vÆ%æÕà\\?à_²\u007fJ&\u0085ù9\u0099k¹\u0092Å\u001d\u001a¡zóZ\tôO+óK¡kZôO+òK¡kZôO+òK¡k]¥Czþ\u001a\u00ad:PôO+óK¡k]\u001fªÀ\u0016 D\u0080¹\u0090\u008fO3/a\u000f\u009f\u001d\u008bÂ7¢e\u0082\u009a'uøÉ\u0098\u009b¸kôO+óK¡kPª£u\u001f\u0015N5µôO+óK¢kXð\u008e/2Oco\u009aôO+óK¢kZa!¾\u009dÞÌþ3ôO+óK¢k\\½Êbv\u0002'\"ÚôO+óK¢k^ôO+óK¢kQôO+óK¢kP\u0087UXé8¹\u0018Bè\u008b77Wgw\u009e\u001f~ÀÂ \u0092\u0080l\u0001\u008fÞ3¾c\u009e\u009côO+óK£k_ôO+óK£k^X\u000b\u0087·ççÇ\u0015ÇÌ\u0018px XÓL\u000e\u0093²óíÓ\u0018ôO+óK¬kXôO+óK¬k[ôO+óK¬kZ»Odò\u0004¡$Y\u001d\u0092Â/¢|\u0082\u0085ôO+óK¬k]ôO+óK¬k\\ôO+óK¬k_ÇH\u0018ôx«XYôO+óK¬kQx4§\u0088Ç×ç+\f\u0092Ó.³~\u0093\u0084ôO+óK\u00adkYôO+óK£k[ôO+óK\u00adkXôO+óK\u00adk[ôO+óK\u00adkZôO+óK\u00adk]\u0001?Þ\u0083¾Ý\u009e,\u0086TYè9¶\u0019D=\fâ°\u0082î¢\u001dÀa\u001fÝ\u007f\u0083_\u007fÇ\u0010\u0018\u00adxþX\u0004ôO+óK\u00adkPR\u0098\u008d%ísÍ\u008e\u009e\u0093A.!x\u0001\u0084\u0018\u0099Ç$§r\u0087\u008d\u0097\u000eH³(å\b\u001b\u0011ìÎQ®\u0007\u008eþ:±å\f\u0085Z¥¢ôO+òK¤k_ôO+òK¤k^BG\u009dúý¬ÝY\fÐÓm³;\u0093ÏôO+òK¥kYôO+òK¥kXûª$\u0017D@d¾\u0087ëXV8\u0001\u0018þôO+òK¥k]ôO+òK¥k\\ôO+òK¥k_ôO+òK¥k^\u0085BZÿ:¨\u001a\\\u0001cÞÞ¾\u0089\u009e|ôO+òK¦kYb6½\u008bÝßý!ôO+òK¦k[Öç\tZi\u000eIòôO+òK¦k]¼^cã\u0003·#MôO+òK¦k_ôO+òK¦k^ôO+òK¦kQå\u009f:\"Zrz\u0081/\u001bð¦\u0090ò°\u0004½\u0006b»\u0002î\"\u0010ôO+òK§kXôO+òK§k[³©l\u0014\fA,¼ôO+òK§k]ç\u00808=Xhx\u0093¬ësV\u0013\u00033ûôO+òK§k^ôM+óK¥kXôM+óK¥k[".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asCharBuffer().get(cArr, 0, 740);
        getSDKTransactionID = cArr;
        getSDKAppID = -1039687831163294781L;
    }

    public BuildConfig(@Nullable Collection<String> collection) {
        this.getDeviceData = collection;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) throws Throwable {
        int i17 = ~i15;
        int i18 = ~((~i16) | i17);
        int i19 = ~i14;
        int i21 = ~(i19 | i15);
        int i22 = ~(i17 | i14);
        int i23 = i18 | i21 | i22;
        int i24 = ((-617538080) * i23) + ((-1966771951) * i15) + (i14 * (-1966771951)) + 1000013824;
        int i25 = ~(i19 | i17 | i16);
        int i26 = (~(i16 | i17)) | i21 | i22;
        int i27 = ((-741212160) * i13) + (632946688 * i11) + (2019426304 * i12) + (308769040 * i26) + ((-926307120) * i25) + i24;
        int iC = a0.c(i13, 1687666023, (2052055731 * i11) + i14 + i15 + i12);
        int i28 = i23 * (-800);
        int i29 = i25 * (-1200);
        int i31 = i26 * 400;
        int i32 = i12 * 1533266057;
        int i33 = i11 * 706030027;
        int i34 = i13 * 1023530015;
        switch (a0.e(iC, -2088042496, i34 + i33 + i32 + i31 + i29 + i28 + (i15 * 1533266457) + (i14 * 1533266457) + 1248777597, 1434255360, (2121465856 * iC) + i27)) {
            case 1:
                ChallengeResultError challengeResultError = new ChallengeResultError((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 7) % 128;
                return challengeResultError;
            case 2:
                atd.l.getSDKAppID getsdkappid = new atd.l.getSDKAppID();
                getSDKReferenceNumber = (AuthenticationRequestParameters + 17) % 128;
                return getsdkappid;
            case 3:
                ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
                AuthenticationRequestParameters = (getSDKReferenceNumber + 17) % 128;
                return challengeResultCompleted;
            case 4:
                atd.p.getSDKAppID getsdkappid2 = new atd.p.getSDKAppID((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 119) % 128;
                return getsdkappid2;
            case 5:
                return getSDKReferenceNumber(objArr);
            case 6:
                atd.m.getSDKTransactionID getsdktransactionid = new atd.m.getSDKTransactionID((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 87) % 128;
                return getsdktransactionid;
            case 7:
                return getSDKTransactionID(objArr);
            case 8:
                return AuthenticationRequestParameters(objArr);
            case 9:
                timedout timedoutVar = new timedout((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 119) % 128;
                return timedoutVar;
            case 10:
                return getDeviceData(objArr);
            case 11:
                getAdditionalDetails getadditionaldetails = new getAdditionalDetails((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 67) % 128;
                return getadditionaldetails;
            case 12:
                atd.p.getDeviceData getdevicedata = new atd.p.getDeviceData((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 115) % 128;
                return getdevicedata;
            case 13:
                return ChallengeResult(objArr);
            case 14:
                return getMessageVersion(objArr);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return getSDKEphemeralPublicKey(objArr);
            case 16:
                return BuildConfig(objArr);
            case 17:
                return ChallengeResultCancelled(objArr);
            case 18:
                cancelled cancelledVar = new cancelled((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 57) % 128;
                return cancelledVar;
            case 19:
                BuildConfig buildConfig = (BuildConfig) objArr[0];
                Map<String, DeviceParameterResult> map = (Map) objArr[1];
                Application application = (Application) objArr[2];
                AuthenticationRequestParameters = (getSDKReferenceNumber + 65) % 128;
                Object[] objArr2 = new Object[1];
                a(204 - View.MeasureSpec.getSize(0), (char) TextUtils.getOffsetBefore("", 0), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new d(24));
                Object[] objArr3 = new Object[1];
                a(View.MeasureSpec.getMode(0) + 208, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28402), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, objArr3);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new a(application, 10));
                Object[] objArr4 = new Object[1];
                a(212 - TextUtils.indexOf("", ""), (char) (43238 - KeyEvent.normalizeMetaState(0)), KeyEvent.getDeadChar(0, 0) + 4, objArr4);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new a(application, 15));
                Object[] objArr5 = new Object[1];
                a((ViewConfiguration.getTouchSlop() >> 8) + 216, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "", 0) + 4, objArr5);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new a(application, 16));
                Object[] objArr6 = new Object[1];
                a(220 - TextUtils.indexOf("", "", 0), (char) (50520 - TextUtils.indexOf((CharSequence) "", '0', 0)), 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new a(application, 17));
                Object[] objArr7 = new Object[1];
                a(KeyEvent.getDeadChar(0, 0) + BERTags.FLAGS, (char) (MotionEvent.axisFromString("") + 57837), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr7);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new a(application, 18));
                Object[] objArr8 = new Object[1];
                a(View.resolveSize(0, 0) + 228, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23004), 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new a(application, 19));
                Object[] objArr9 = new Object[1];
                a(TextUtils.indexOf("", "", 0, 0) + 232, (char) (39468 - Drawable.resolveOpacity(0, 0)), Color.alpha(0) + 4, objArr9);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new a(application, 20));
                Object[] objArr10 = new Object[1];
                a(236 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr10);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new a(application, 21));
                Object[] objArr11 = new Object[1];
                a(241 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47867), 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr11);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new a(application, 22));
                Object[] objArr12 = new Object[1];
                a(243 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 4, objArr12);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new a(application, 0));
                Object[] objArr13 = new Object[1];
                a(249 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), 3 - TextUtils.lastIndexOf("", '0'), objArr13);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new a(application, 1));
                Object[] objArr14 = new Object[1];
                a((Process.myTid() >> 22) + 252, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4264), 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr14);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new a(application, 2));
                Object[] objArr15 = new Object[1];
                a(AndroidCharacter.getMirror('0') + 208, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 4 - (ViewConfiguration.getEdgeSlop() >> 16), objArr15);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new a(application, 3));
                Object[] objArr16 = new Object[1];
                a(260 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (43188 - (ViewConfiguration.getTouchSlop() >> 8)), 4 - (ViewConfiguration.getScrollBarSize() >> 8), objArr16);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr16[0]).intern(), new a(application, 4));
                Object[] objArr17 = new Object[1];
                a(264 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (36210 - Color.red(0)), 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr17);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr17[0]).intern(), new a(application, 5));
                Object[] objArr18 = new Object[1];
                a(268 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 3 - TextUtils.lastIndexOf("", '0'), objArr18);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr18[0]).intern(), new a(application, 6));
                Object[] objArr19 = new Object[1];
                a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 272, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr19);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr19[0]).intern(), new a(application, 7));
                Object[] objArr20 = new Object[1];
                a(276 - KeyEvent.getDeadChar(0, 0), (char) (41108 - (Process.myPid() >> 22)), (ViewConfiguration.getEdgeSlop() >> 16) + 4, objArr20);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr20[0]).intern(), new a(application, 8));
                Object[] objArr21 = new Object[1];
                a(Color.rgb(0, 0, 0) + 16777496, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7798), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr21);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr21[0]).intern(), new a(application, 9));
                Object[] objArr22 = new Object[1];
                a((ViewConfiguration.getFadingEdgeLength() >> 16) + 284, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr22);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr22[0]).intern(), new a(application, 11));
                Object[] objArr23 = new Object[1];
                a(TextUtils.indexOf("", "", 0, 0) + 288, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58453), 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr23);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr23[0]).intern(), new a(application, 12));
                Object[] objArr24 = new Object[1];
                a(292 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getTouchSlop() >> 8), 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr24);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr24[0]).intern(), new a(application, 13));
                Object[] objArr25 = new Object[1];
                a(295 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), Color.red(0) + 4, objArr25);
                buildConfig.AuthenticationRequestParameters(map, ((String) objArr25[0]).intern(), new a(application, 14));
                getSDKReferenceNumber = (AuthenticationRequestParameters + 111) % 128;
                return null;
            case 20:
                return ChallengeResultError(objArr);
            case 21:
                return getAdditionalDetails(objArr);
            case 22:
                ErrorMessage errorMessage = new ErrorMessage((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 41) % 128;
                return errorMessage;
            case 23:
                return ChallengeResultTimeout(objArr);
            case 24:
                onCompletion oncompletion = new onCompletion((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 63) % 128;
                return oncompletion;
            case 25:
                atd.y.BuildConfig buildConfig2 = new atd.y.BuildConfig((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 95) % 128;
                return buildConfig2;
            case 26:
                atd.o.getDeviceData getdevicedata2 = new atd.o.getDeviceData((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 71) % 128;
                return getdevicedata2;
            case 27:
                atd.k.onCompletion oncompletion2 = new atd.k.onCompletion((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 61) % 128;
                return oncompletion2;
            case 28:
                toString tostring = new toString((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 69) % 128;
                return tostring;
            case 29:
                return ChallengeResultCompleted(objArr);
            case 30:
                ProgressDialog progressDialog = new ProgressDialog((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 81) % 128;
                return progressDialog;
            case BERTags.DATE /* 31 */:
                atd.z.ChallengeResultError challengeResultError2 = new atd.z.ChallengeResultError((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 19) % 128;
                return challengeResultError2;
            case 32:
                completed completedVar = new completed((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 71) % 128;
                return completedVar;
            case 33:
                atd.l.getSDKReferenceNumber getsdkreferencenumber = new atd.l.getSDKReferenceNumber();
                getSDKReferenceNumber = (AuthenticationRequestParameters + 61) % 128;
                return getsdkreferencenumber;
            case BERTags.DURATION /* 34 */:
                atd.q.getSDKReferenceNumber getsdkreferencenumber2 = new atd.q.getSDKReferenceNumber((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKReferenceNumber + 23) % 128;
                return getsdkreferencenumber2;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout((Application) objArr[0]);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 11) % 128;
                return challengeResultTimeout;
            case 36:
                return getTransactionStatus(objArr);
            case 37:
                return onCompletion(objArr);
            case 38:
                return ChallengeStatusReceiver(objArr);
            case 39:
                return ChallengeStatusHandler(objArr);
            default:
                return getSDKAppID(objArr);
        }
    }

    private final void BuildConfig(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 97) % 128;
        Object[] objArr = new Object[1];
        a(572 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 4 - View.MeasureSpec.getSize(0), objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new c(application, 23));
        Object[] objArr2 = new Object[1];
        a(576 - TextUtils.getOffsetBefore("", 0), (char) (42711 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new e(application, 4));
        Object[] objArr3 = new Object[1];
        a(Color.green(0) + 580, (char) (27355 - ((byte) KeyEvent.getModifierMetaStateMask())), 3 - TextUtils.lastIndexOf("", '0', 0), objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new e(application, 10));
        Object[] objArr4 = new Object[1];
        a(583 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 60631), AndroidCharacter.getMirror('0') - ',', objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new e(application, 11));
        Object[] objArr5 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 589, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 25409), 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new e(application, 12));
        Object[] objArr6 = new Object[1];
        a(592 - View.MeasureSpec.getMode(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58786), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new e(application, 13));
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 596, (char) (View.combineMeasuredStates(0, 0) + 52990), TextUtils.indexOf("", "", 0, 0) + 4, objArr7);
        AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new e(application, 14));
        Object[] objArr8 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 601, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 4, objArr8);
        AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new e(application, 15));
        Object[] objArr9 = new Object[1];
        a(605 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr9);
        AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new e(application, 16));
        Object[] objArr10 = new Object[1];
        a(608 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Color.rgb(0, 0, 0) + 16823816), 3 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
        AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new e(application, 17));
        Object[] objArr11 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 612, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63646), 4 - Color.alpha(0), objArr11);
        AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new c(application, 24));
        Object[] objArr12 = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 616, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr12);
        AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new c(application, 25));
        Object[] objArr13 = new Object[1];
        a(620 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr13);
        AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new c(application, 26));
        Object[] objArr14 = new Object[1];
        a(625 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (4068 - TextUtils.lastIndexOf("", '0', 0, 0)), 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr14);
        AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new c(application, 27));
        Object[] objArr15 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 629, (char) (29604 - TextUtils.indexOf("", "", 0)), (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr15);
        AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new c(application, 28));
        Object[] objArr16 = new Object[1];
        a(632 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.MeasureSpec.getMode(0), 4 - View.MeasureSpec.getSize(0), objArr16);
        AuthenticationRequestParameters(map, ((String) objArr16[0]).intern(), new c(application, 29));
        Object[] objArr17 = new Object[1];
        a(636 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr17);
        AuthenticationRequestParameters(map, ((String) objArr17[0]).intern(), new e(application, 0));
        Object[] objArr18 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 640, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3 - TextUtils.lastIndexOf("", '0', 0), objArr18);
        AuthenticationRequestParameters(map, ((String) objArr18[0]).intern(), new e(application, 1));
        Object[] objArr19 = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 644, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - KeyEvent.getDeadChar(0, 0), objArr19);
        AuthenticationRequestParameters(map, ((String) objArr19[0]).intern(), new e(application, 2));
        Object[] objArr20 = new Object[1];
        a(648 - KeyEvent.normalizeMetaState(0), (char) (28941 - Color.blue(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, objArr20);
        AuthenticationRequestParameters(map, ((String) objArr20[0]).intern(), new e(application, 3));
        Object[] objArr21 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 652, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 62764), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr21);
        AuthenticationRequestParameters(map, ((String) objArr21[0]).intern(), new e(application, 5));
        Object[] objArr22 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 656, (char) View.resolveSize(0, 0), KeyEvent.getDeadChar(0, 0) + 4, objArr22);
        AuthenticationRequestParameters(map, ((String) objArr22[0]).intern(), new e(application, 6));
        Object[] objArr23 = new Object[1];
        a(659 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 38521), (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, objArr23);
        AuthenticationRequestParameters(map, ((String) objArr23[0]).intern(), new e(application, 7));
        Object[] objArr24 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 663, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.blue(0) + 4, objArr24);
        AuthenticationRequestParameters(map, ((String) objArr24[0]).intern(), new e(application, 8));
        Object[] objArr25 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 668, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 8873), 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr25);
        AuthenticationRequestParameters(map, ((String) objArr25[0]).intern(), new e(application, 9));
        int i11 = AuthenticationRequestParameters + 81;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ButtonCustomization(Application application) {
        hashCode hashcode = new hashCode(application);
        int i11 = getSDKReferenceNumber + 25;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return hashcode;
        }
        throw null;
    }

    private final void ChallengeResult(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 63) % 128;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 704, (char) Color.green(0), Color.green(0) + 4, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new e(application, 18));
        Object[] objArr2 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 707, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new e(application, 19));
        Object[] objArr3 = new Object[1];
        a(712 - View.resolveSize(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 18407), ImageFormat.getBitsPerPixel(0) + 5, objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new e(application, 20));
        Object[] objArr4 = new Object[1];
        a(716 - TextUtils.indexOf("", ""), (char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new e(application, 21));
        Object[] objArr5 = new Object[1];
        a(720 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (5070 - ExpandableListView.getPackedPositionChild(0L)), 4 - KeyEvent.normalizeMetaState(0), objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new e(application, 22));
        int i11 = getSDKReferenceNumber + 23;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 86 / 0;
        }
    }

    private final void ChallengeResultCancelled(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 105) % 128;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 501, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 4 - KeyEvent.keyCodeFromString(""), objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new b(application, 29));
        Object[] objArr2 = new Object[1];
        a(Color.red(0) + 504, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new c(application, 8));
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 508, (char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0') + 5, objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new c(application, 9));
        Object[] objArr4 = new Object[1];
        a(512 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (13063 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 5, objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new c(application, 10));
        Object[] objArr5 = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 517, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new c(application, 11));
        Object[] objArr6 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 520, (char) (35963 - ((Process.getThreadPriority(0) + 20) >> 6)), 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new c(application, 12));
        Object[] objArr7 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 524, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63709), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr7);
        AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new c(application, 13));
        Object[] objArr8 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 528, (char) Color.blue(0), 4 - ExpandableListView.getPackedPositionGroup(0L), objArr8);
        AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new c(application, 14));
        Object[] objArr9 = new Object[1];
        a(532 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.indexOf("", "", 0, 0), 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
        AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new c(application, 15));
        Object[] objArr10 = new Object[1];
        a(537 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr10);
        AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new c(application, 16));
        Object[] objArr11 = new Object[1];
        a(540 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.blue(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr11);
        AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new c(application, 0));
        Object[] objArr12 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 545, (char) (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr12);
        AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new c(application, 1));
        Object[] objArr13 = new Object[1];
        a(548 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 4 - View.MeasureSpec.getSize(0), objArr13);
        AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new c(application, 2));
        Object[] objArr14 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 552, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 62832), (ViewConfiguration.getTouchSlop() >> 8) + 4, objArr14);
        AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new c(application, 3));
        Object[] objArr15 = new Object[1];
        a(556 - KeyEvent.normalizeMetaState(0), (char) (29211 - (ViewConfiguration.getTapTimeout() >> 16)), 4 - Color.red(0), objArr15);
        AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new c(application, 4));
        Object[] objArr16 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 561, (char) (51523 - TextUtils.indexOf("", "")), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr16);
        AuthenticationRequestParameters(map, ((String) objArr16[0]).intern(), new c(application, 5));
        Object[] objArr17 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 564, (char) (13357 - TextUtils.lastIndexOf("", '0', 0, 0)), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr17);
        AuthenticationRequestParameters(map, ((String) objArr17[0]).intern(), new c(application, 6));
        Object[] objArr18 = new Object[1];
        a(567 - MotionEvent.axisFromString(""), (char) (13151 - KeyEvent.normalizeMetaState(0)), TextUtils.getCapsMode("", 0, 0) + 4, objArr18);
        AuthenticationRequestParameters(map, ((String) objArr18[0]).intern(), new c(application, 7));
        getSDKReferenceNumber = (AuthenticationRequestParameters + 69) % 128;
    }

    private static /* synthetic */ Object ChallengeResultCompleted(Object[] objArr) {
        atd.z.ChallengeResultCompleted challengeResultCompleted = new atd.z.ChallengeResultCompleted((Application) objArr[0]);
        int i11 = getSDKReferenceNumber + 77;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResultCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object ChallengeResultError(Object[] objArr) throws Throwable {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        Map map = (Map) objArr[1];
        Application application = (Application) objArr[2];
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 733, (char) Gravity.getAbsoluteGravity(0, 0), 4 - TextUtils.getOffsetAfter("", 0), objArr2);
        DeviceParameterResult sDKReferenceNumber = buildConfig.getSDKReferenceNumber(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(737 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), Color.alpha(0) + 4, objArr3);
        DeviceParameterResult sDKReferenceNumber2 = buildConfig.getSDKReferenceNumber(((String) objArr3[0]).intern());
        if (sDKReferenceNumber != null) {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 + 37;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (sDKReferenceNumber2 != null) {
                AuthenticationRequestParameters = (i11 + 99) % 128;
                Object[] objArr4 = new Object[1];
                a(732 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                map.put(((String) objArr4[0]).intern(), sDKReferenceNumber);
                Object[] objArr5 = new Object[1];
                a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 736, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 4 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                map.put(((String) objArr5[0]).intern(), sDKReferenceNumber2);
                return null;
            }
        }
        atd.k.getAdditionalDetails getadditionaldetails = new atd.k.getAdditionalDetails(application);
        Object[] objArr6 = new Object[1];
        a(732 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
        String strIntern = ((String) objArr6[0]).intern();
        if (sDKReferenceNumber == null) {
            sDKReferenceNumber = new ChallengeResult(getadditionaldetails).getDeviceData();
        }
        map.put(strIntern, sDKReferenceNumber);
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 736, (char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        if (sDKReferenceNumber2 == null) {
            sDKReferenceNumber2 = new getTransactionStatus(getadditionaldetails).getDeviceData();
        }
        map.put(strIntern2, sDKReferenceNumber2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultKt(Application application) {
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 25) % 128;
        return challengeStatusReceiver;
    }

    private final void ChallengeResultTimeout(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 41) % 128;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 727, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new e(application, 23));
        getSDKReferenceNumber = (AuthenticationRequestParameters + 81) % 128;
    }

    private static /* synthetic */ Object ChallengeStatusHandler(Object[] objArr) {
        atd.x.getTransactionStatus gettransactionstatus = new atd.x.getTransactionStatus((Application) objArr[0]);
        int i11 = getSDKReferenceNumber + 35;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeStatusReceiver() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1140442696, 1140442732, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter CompletionEvent(Application application) {
        getErrorDetails geterrordetails = new getErrorDetails(application);
        int i11 = AuthenticationRequestParameters + 47;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 66 / 0;
        }
        return geterrordetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter Customization(Application application) {
        atd.x.getDeviceData getdevicedata = new atd.x.getDeviceData(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 3) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ErrorMessage(Application application) {
        InitializeResultFailure initializeResultFailure = new InitializeResultFailure(application);
        int i11 = getSDKReferenceNumber + 83;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return initializeResultFailure;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ExpandableInfoCustomization(Application application) {
        atd.x.completed completedVar = new atd.x.completed(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 59) % 128;
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResult() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1174808082, -1174808080, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultFailure() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1900945809, -1900945776, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultKt(Application application) {
        protocolError protocolerror = new protocolError(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 55) % 128;
        return protocolerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultSuccess() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 2064315342, -2064315337, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InvalidInputException(Application application) {
        atd.m.getSDKReferenceNumber getsdkreferencenumber = new atd.m.getSDKReferenceNumber(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 47) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter LabelCustomization(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1825087996, 1825088013, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ProgressDialog() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -2066669786, 2066669807, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ProtocolErrorEvent(Application application) {
        atd.w.hashCode hashcode = new atd.w.hashCode(application);
        int i11 = getSDKReferenceNumber + 11;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 46 / 0;
        }
        return hashcode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter RuntimeErrorEvent(Application application) {
        atd.w.getTransactionStatus gettransactionstatus = new atd.w.getTransactionStatus(application);
        int i11 = AuthenticationRequestParameters + 79;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter SDKAlreadyInitializedException(Application application) {
        atd.m.BuildConfig buildConfig = new atd.m.BuildConfig(application);
        int i11 = AuthenticationRequestParameters + 49;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return buildConfig;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter SDKNotInitializedException(Application application) {
        atd.v.getSDKTransactionID getsdktransactionid = new atd.v.getSDKTransactionID(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 119) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter SDKRuntimeException(Application application) {
        atd.m.getDeviceData getdevicedata = new atd.m.getDeviceData(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 111) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ScreenCustomization(Application application) {
        atd.y.getDeviceData getdevicedata = new atd.y.getDeviceData(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 31) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter SelectionItemCustomization(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 426936325, -426936321, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter TextBoxCustomization(Application application) {
        atd.y.getSDKTransactionID getsdktransactionid = new atd.y.getSDKTransactionID(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 83) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ThreeDS2Service(Application application) {
        atd.z.getDeviceData getdevicedata = new atd.z.getDeviceData(application);
        int i11 = getSDKReferenceNumber + 3;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ToolbarCustomization(Application application) {
        atd.y.AuthenticationRequestParameters authenticationRequestParameters = new atd.y.AuthenticationRequestParameters(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 41) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter Transaction(Application application) {
        atd.z.ChallengeResult challengeResult = new atd.z.ChallengeResult(application);
        int i11 = AuthenticationRequestParameters + 115;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 57 / 0;
        }
        return challengeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter TransactionResult(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 738540880, -738540849, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter TransactionResultFailure(Application application) {
        atd.z.ChallengeStatusReceiver challengeStatusReceiver = new atd.z.ChallengeStatusReceiver(application);
        int i11 = getSDKReferenceNumber + 97;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeStatusReceiver;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter TransactionResultKt(Application application) {
        atd.z.ChallengeResultTimeout challengeResultTimeout = new atd.z.ChallengeResultTimeout(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        return challengeResultTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter TransactionResultSuccess(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 169807180, -169807156, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter UiCustomization(Application application) {
        atd.y.getTransactionStatus gettransactionstatus = new atd.y.getTransactionStatus(application);
        int i11 = getSDKReferenceNumber + 87;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter UiCustomizationButtonType(Application application) {
        atd.r.getSDKReferenceNumber getsdkreferencenumber = new atd.r.getSDKReferenceNumber(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 67) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter Warning(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 913198034, -913198012, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter WarningSeverity(Application application) {
        atd.z.getErrorDetails geterrordetails = new atd.z.getErrorDetails(application);
        int i11 = getSDKReferenceNumber + 9;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return geterrordetails;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, char r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.BuildConfig.a(int, char, int, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cancelled() {
        atd.n.ChallengeResultError challengeResultError = new atd.n.ChallengeResultError();
        int i11 = AuthenticationRequestParameters + 23;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultError;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cleanup(Application application) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey(application);
        int i11 = AuthenticationRequestParameters + 7;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter close(Application application) {
        atd.z.getAdditionalDetails getadditionaldetails = new atd.z.getAdditionalDetails(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 125) % 128;
        return getadditionaldetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter completed(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 931250019, -931250001, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter createTransaction(Application application) {
        ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled(application);
        int i11 = AuthenticationRequestParameters + 125;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultCancelled;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter describeContents(Application application) {
        atd.y.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.y.getSDKEphemeralPublicKey(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 105) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter doChallenge(Application application) {
        atd.z.getTransactionStatus gettransactionstatus = new atd.z.getTransactionStatus(application);
        int i11 = getSDKReferenceNumber + 7;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter e1(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -104442213, 104442219, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter equals(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1032538207, -1032538179, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getAdditionalDetails() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1423241307, 1423241314, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getAuthenticationRequestParameters(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 722569574, -722569545, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getBackgroundColor(Application application) {
        atd.o.getSDKAppID getsdkappid = new atd.o.getSDKAppID(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getBorderColor(Application application) {
        atd.p.ChallengeResultCancelled challengeResultCancelled = new atd.p.ChallengeResultCancelled(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 75) % 128;
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getBorderWidth(Application application) {
        atd.p.getSDKTransactionID getsdktransactionid = new atd.p.getSDKTransactionID(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 61) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getButtonCustomization(Application application) {
        atd.y.ChallengeResultCompleted challengeResultCompleted = new atd.y.ChallengeResultCompleted(application);
        int i11 = AuthenticationRequestParameters + 81;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 34 / 0;
        }
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getButtonText(Application application) {
        atd.y.ChallengeResultError challengeResultError = new atd.y.ChallengeResultError(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 99) % 128;
        return challengeResultError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getCornerRadius(Application application) {
        getErrorDescription geterrordescription = new getErrorDescription(application);
        int i11 = getSDKReferenceNumber + 75;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return geterrordescription;
        }
        throw null;
    }

    private final void getDeviceData(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 39) % 128;
        Object[] objArr = new Object[1];
        a(300 - ExpandableListView.getPackedPositionGroup(0L), (char) (57739 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.getMode(0) + 4, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new c(application, 17));
        Object[] objArr2 = new Object[1];
        a(View.getDefaultSize(0, 0) + 304, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15416), TextUtils.lastIndexOf("", '0') + 5, objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new c(application, 18));
        Object[] objArr3 = new Object[1];
        a(309 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 24655), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new c(application, 19));
        Object[] objArr4 = new Object[1];
        a(312 - Color.green(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 4, objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new c(application, 20));
        Object[] objArr5 = new Object[1];
        a(316 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (33618 - KeyEvent.getDeadChar(0, 0)), MotionEvent.axisFromString("") + 5, objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new c(application, 21));
        AuthenticationRequestParameters = (getSDKReferenceNumber + 7) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorCode(Application application) {
        InitializeResultKt initializeResultKt = new InitializeResultKt(application);
        int i11 = getSDKReferenceNumber + 41;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return initializeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorDescription(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -2108457012, 2108457042, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorDetails(Application application) {
        atd.w.getSDKTransactionID getsdktransactionid = new atd.w.getSDKTransactionID(application);
        int i11 = getSDKReferenceNumber + 1;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 13 / 0;
        }
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorMessage(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1142407933, -1142407925, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getExpandableInfoCustomization(Application application) {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = new atd.q.AuthenticationRequestParameters(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 113) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getExpandedStateIndicatorColor(Application application) {
        atd.p.AuthenticationRequestParameters authenticationRequestParameters = new atd.p.AuthenticationRequestParameters(application);
        int i11 = AuthenticationRequestParameters + 19;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getHeaderText(Application application) {
        atd.y.ChallengeResultCancelled challengeResultCancelled = new atd.y.ChallengeResultCancelled(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 69) % 128;
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getHeadingTextColor(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1618645031, 1618645042, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getHeadingTextFontName(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1291964891, 1291964892, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getHeadingTextFontSize(Application application) {
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 1) % 128;
        return challengeStatusHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getHighlightedBackgroundColor(Application application) {
        getMessageVersion getmessageversion = new getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 39;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getID(Application application) {
        atd.z.cancelled cancelledVar = new atd.z.cancelled(application);
        int i11 = getSDKReferenceNumber + 43;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 4 / 0;
        }
        return cancelledVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getInputLabelTextColor(Application application) {
        atd.p.BuildConfig buildConfig = new atd.p.BuildConfig(application);
        int i11 = getSDKReferenceNumber + 125;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return buildConfig;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getInputLabelTextFontName(Application application) {
        atd.p.ChallengeStatusHandler challengeStatusHandler = new atd.p.ChallengeStatusHandler(application);
        int i11 = AuthenticationRequestParameters + 101;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 49 / 0;
        }
        return challengeStatusHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getInputLabelTextFontSize(Application application) {
        atd.p.ChallengeResultTimeout challengeResultTimeout = new atd.p.ChallengeResultTimeout(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 91) % 128;
        return challengeResultTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getLabelCustomization(Application application) {
        atd.y.cancelled cancelledVar = new atd.y.cancelled(application);
        int i11 = AuthenticationRequestParameters + 117;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return cancelledVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getMessage(Application application) {
        runtimeError runtimeerror = new runtimeError(application);
        int i11 = getSDKReferenceNumber + 69;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return runtimeerror;
        }
        throw null;
    }

    private final void getMessageVersion(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 35) % 128;
        Object[] objArr = new Object[1];
        a(672 - ExpandableListView.getPackedPositionGroup(0L), (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new f(application, 19));
        Object[] objArr2 = new Object[1];
        a(675 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (18449 - View.combineMeasuredStates(0, 0)), KeyEvent.getDeadChar(0, 0) + 4, objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new d(23));
        Object[] objArr3 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 679, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new f(application, 20));
        Object[] objArr4 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 684, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new f(application, 21));
        Object[] objArr5 = new Object[1];
        a(688 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 4 - TextUtils.indexOf("", ""), objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new f(application, 22));
        Object[] objArr6 = new Object[1];
        a(692 - Color.alpha(0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4561), 4 - KeyEvent.getDeadChar(0, 0), objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new f(application, 23));
        int i11 = getSDKReferenceNumber + 17;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getOrCreateButtonCustomization(Application application) {
        atd.q.getSDKTransactionID getsdktransactionid = new atd.q.getSDKTransactionID(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 53) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getOrCreateCustomization(Application application) {
        atd.q.getSDKAppID getsdkappid = new atd.q.getSDKAppID(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 51) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getProgressView(Application application) {
        atd.z.BuildConfig buildConfig = new atd.z.BuildConfig(application);
        int i11 = AuthenticationRequestParameters + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return buildConfig;
        }
        throw null;
    }

    private final void getSDKAppID(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 87) % 128;
        Object[] objArr = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 60, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new a(application, 23));
        Object[] objArr2 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 64, (char) (Drawable.resolveOpacity(0, 0) + 44878), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new b(application, 4));
        Object[] objArr3 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 68, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62703), Drawable.resolveOpacity(0, 0) + 4, objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new b(application, 15));
        Object[] objArr4 = new Object[1];
        a(72 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 5977), 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new b(application, 22));
        Object[] objArr5 = new Object[1];
        a(75 - Process.getGidForName(""), (char) (12836 - Color.alpha(0)), TextUtils.indexOf("", "") + 4, objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new b(application, 23));
        Object[] objArr6 = new Object[1];
        a(80 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53930), (-16777212) - Color.rgb(0, 0, 0), objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new b(application, 24));
        Object[] objArr7 = new Object[1];
        a(85 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2990), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr7);
        AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new b(application, 25));
        Object[] objArr8 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 88, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, objArr8);
        AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new b(application, 26));
        Object[] objArr9 = new Object[1];
        a(91 - Process.getGidForName(""), (char) (45839 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.getCapsMode("", 0, 0) + 4, objArr9);
        AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new b(application, 27));
        Object[] objArr10 = new Object[1];
        a(96 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((Process.myTid() >> 22) + 50205), 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
        AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new b(application, 28));
        Object[] objArr11 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 100, (char) Color.alpha(0), TextUtils.indexOf("", "", 0, 0) + 4, objArr11);
        AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new a(application, 24));
        Object[] objArr12 = new Object[1];
        a(104 - Drawable.resolveOpacity(0, 0), (char) (53412 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.red(0) + 4, objArr12);
        AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new a(application, 25));
        Object[] objArr13 = new Object[1];
        a(108 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 20954), 4 - View.resolveSize(0, 0), objArr13);
        AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new a(application, 26));
        Object[] objArr14 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 112, (char) (65270 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, objArr14);
        AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new a(application, 27));
        Object[] objArr15 = new Object[1];
        a(Color.alpha(0) + 116, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 4 - (KeyEvent.getMaxKeyCode() >> 16), objArr15);
        AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new a(application, 28));
        Object[] objArr16 = new Object[1];
        a(121 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.blue(0) + 4, objArr16);
        AuthenticationRequestParameters(map, ((String) objArr16[0]).intern(), new a(application, 29));
        Object[] objArr17 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 125, (char) (6479 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr17);
        AuthenticationRequestParameters(map, ((String) objArr17[0]).intern(), new b(application, 0));
        Object[] objArr18 = new Object[1];
        a(128 - KeyEvent.getDeadChar(0, 0), (char) (10447 - KeyEvent.getDeadChar(0, 0)), 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr18);
        AuthenticationRequestParameters(map, ((String) objArr18[0]).intern(), new b(application, 1));
        Object[] objArr19 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0, 0) + 133, (char) (26129 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 4 - Color.argb(0, 0, 0, 0), objArr19);
        AuthenticationRequestParameters(map, ((String) objArr19[0]).intern(), new b(application, 2));
        Object[] objArr20 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 136, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3081), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr20);
        AuthenticationRequestParameters(map, ((String) objArr20[0]).intern(), new b(application, 3));
        Object[] objArr21 = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 140, (char) (37187 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 4 - (ViewConfiguration.getTapTimeout() >> 16), objArr21);
        AuthenticationRequestParameters(map, ((String) objArr21[0]).intern(), new b(application, 5));
        Object[] objArr22 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 144, (char) (2131 - AndroidCharacter.getMirror('0')), Process.getGidForName("") + 5, objArr22);
        AuthenticationRequestParameters(map, ((String) objArr22[0]).intern(), new b(application, 6));
        Object[] objArr23 = new Object[1];
        a(148 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 4 - KeyEvent.keyCodeFromString(""), objArr23);
        AuthenticationRequestParameters(map, ((String) objArr23[0]).intern(), new b(application, 7));
        Object[] objArr24 = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 152, (char) (TextUtils.indexOf("", "") + 10131), KeyEvent.normalizeMetaState(0) + 4, objArr24);
        AuthenticationRequestParameters(map, ((String) objArr24[0]).intern(), new b(application, 8));
        Object[] objArr25 = new Object[1];
        a(155 - Process.getGidForName(""), (char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0') + 5, objArr25);
        AuthenticationRequestParameters(map, ((String) objArr25[0]).intern(), new b(application, 9));
        Object[] objArr26 = new Object[1];
        a(160 - View.MeasureSpec.getMode(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 4 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr26);
        AuthenticationRequestParameters(map, ((String) objArr26[0]).intern(), new b(application, 10));
        Object[] objArr27 = new Object[1];
        a(164 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43734), 4 - TextUtils.getTrimmedLength(""), objArr27);
        AuthenticationRequestParameters(map, ((String) objArr27[0]).intern(), new b(application, 11));
        Object[] objArr28 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 168, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Color.red(0) + 4, objArr28);
        AuthenticationRequestParameters(map, ((String) objArr28[0]).intern(), new b(application, 12));
        Object[] objArr29 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 171, (char) Gravity.getAbsoluteGravity(0, 0), 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr29);
        AuthenticationRequestParameters(map, ((String) objArr29[0]).intern(), new b(application, 13));
        Object[] objArr30 = new Object[1];
        a(176 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (42935 - View.resolveSizeAndState(0, 0, 0)), 4 - KeyEvent.getDeadChar(0, 0), objArr30);
        AuthenticationRequestParameters(map, ((String) objArr30[0]).intern(), new b(application, 14));
        Object[] objArr31 = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 180, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 4 - Gravity.getAbsoluteGravity(0, 0), objArr31);
        AuthenticationRequestParameters(map, ((String) objArr31[0]).intern(), new b(application, 16));
        Object[] objArr32 = new Object[1];
        a(183 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), MotionEvent.axisFromString("") + 5, objArr32);
        AuthenticationRequestParameters(map, ((String) objArr32[0]).intern(), new b(application, 17));
        Object[] objArr33 = new Object[1];
        a(188 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 4 - KeyEvent.normalizeMetaState(0), objArr33);
        AuthenticationRequestParameters(map, ((String) objArr33[0]).intern(), new b(application, 18));
        Object[] objArr34 = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + BERTags.PRIVATE, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18902), ((byte) KeyEvent.getModifierMetaStateMask()) + 5, objArr34);
        AuthenticationRequestParameters(map, ((String) objArr34[0]).intern(), new b(application, 19));
        Object[] objArr35 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 196, (char) (37805 - View.getDefaultSize(0, 0)), TextUtils.indexOf("", "", 0, 0) + 4, objArr35);
        AuthenticationRequestParameters(map, ((String) objArr35[0]).intern(), new b(application, 20));
        Object[] objArr36 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 200, (char) (29115 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr36);
        AuthenticationRequestParameters(map, ((String) objArr36[0]).intern(), new b(application, 21));
        int i11 = AuthenticationRequestParameters + 119;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 3 / 0;
        }
    }

    private final void getSDKEphemeralPublicKey(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        String strIntern;
        c cVar;
        int i11 = AuthenticationRequestParameters + 65;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(21114 / TextUtils.indexOf("", ""), (char) (11348 >>> Color.blue(0)), (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) + 4, objArr);
            strIntern = ((String) objArr[0]).intern();
            cVar = new c(application, 22);
        } else {
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf("", "") + 700, (char) (18761 - Color.blue(0)), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            cVar = new c(application, 22);
        }
        AuthenticationRequestParameters(map, strIntern, cVar);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 29) % 128;
    }

    private final void getSDKReferenceNumber(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 71) % 128;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), 4 - TextUtils.getOffsetBefore("", 0), objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new d(10));
        Object[] objArr2 = new Object[1];
        a(5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 59845), '4' - AndroidCharacter.getMirror('0'), objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new d(15));
        Object[] objArr3 = new Object[1];
        a(9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 4, objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new d(16));
        Object[] objArr4 = new Object[1];
        a(12 - ExpandableListView.getPackedPositionGroup(0L), (char) (30599 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new d(17));
        Object[] objArr5 = new Object[1];
        a(16 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", "", 0, 0), 3 - Process.getGidForName(""), objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new e(application, 26));
        Object[] objArr6 = new Object[1];
        a(19 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Color.red(0) + 56539), TextUtils.getCapsMode("", 0, 0) + 4, objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new d(18));
        Object[] objArr7 = new Object[1];
        a(View.getDefaultSize(0, 0) + 24, (char) ((Process.getThreadPriority(0) + 20) >> 6), 4 - View.resolveSize(0, 0), objArr7);
        AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new e(application, 27));
        Object[] objArr8 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 22511), 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
        AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new e(application, 28));
        Object[] objArr9 = new Object[1];
        a((-16777184) - Color.rgb(0, 0, 0), (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr9);
        AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new e(application, 29));
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{this, map, application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1582616868, -1582616848, sDKTransactionID);
        Object[] objArr10 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 36, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr10);
        AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new f(application, 0));
        Object[] objArr11 = new Object[1];
        a(40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (34355 - KeyEvent.keyCodeFromString("")), 4 - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
        AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new e(application, 24));
        Object[] objArr12 = new Object[1];
        a(44 - TextUtils.getOffsetBefore("", 0), (char) (4356 - TextUtils.getOffsetAfter("", 0)), 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
        AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new d(12));
        Object[] objArr13 = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 48, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51182), View.getDefaultSize(0, 0) + 4, objArr13);
        AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new e(application, 25));
        Object[] objArr14 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr14);
        AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new d(13));
        Object[] objArr15 = new Object[1];
        a(56 - View.resolveSize(0, 0), (char) TextUtils.indexOf("", "", 0), 4 - View.getDefaultSize(0, 0), objArr15);
        AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new d(14));
        AuthenticationRequestParameters = (getSDKReferenceNumber + 33) % 128;
    }

    private final void getSDKTransactionID(Map<String, DeviceParameterResult> map) throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 31) % 128;
        Object[] objArr = new Object[1];
        a(319 - TextUtils.lastIndexOf("", '0'), (char) (Color.alpha(0) + 63899), TextUtils.lastIndexOf("", '0') + 5, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new d(2));
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 324, (char) (TextUtils.getOffsetBefore("", 0) + 41793), 4 - Color.green(0), objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new c0(21));
        Object[] objArr3 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 327, (char) (ExpandableListView.getPackedPositionGroup(0L) + 45679), 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new c0(23));
        Object[] objArr4 = new Object[1];
        a(332 - View.MeasureSpec.getSize(0), (char) Color.alpha(0), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new c0(24));
        Object[] objArr5 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 336, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new c0(25));
        Object[] objArr6 = new Object[1];
        a(340 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48697), (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new c0(27));
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 344, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 55538), 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr7);
        AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new c0(28));
        Object[] objArr8 = new Object[1];
        a(348 - TextUtils.getCapsMode("", 0, 0), (char) (36228 - ExpandableListView.getPackedPositionChild(0L)), View.resolveSizeAndState(0, 0, 0) + 4, objArr8);
        AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new c0(29));
        Object[] objArr9 = new Object[1];
        a(351 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (5140 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 4 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr9);
        AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new d(0));
        Object[] objArr10 = new Object[1];
        a(357 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Color.alpha(0) + 53962), KeyEvent.keyCodeFromString("") + 4, objArr10);
        AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new d(1));
        Object[] objArr11 = new Object[1];
        a(360 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((Process.myPid() >> 22) + 12626), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr11);
        AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new d(3));
        Object[] objArr12 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 364, (char) View.combineMeasuredStates(0, 0), 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
        AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new d(4));
        Object[] objArr13 = new Object[1];
        a(368 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionType(0L), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
        AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new d(11));
        Object[] objArr14 = new Object[1];
        a(373 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 4 - Color.alpha(0), objArr14);
        AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new d(19));
        Object[] objArr15 = new Object[1];
        a(377 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 20748), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr15);
        AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new d(21));
        Object[] objArr16 = new Object[1];
        a(379 - Process.getGidForName(""), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr16);
        AuthenticationRequestParameters(map, ((String) objArr16[0]).intern(), new d(22));
        Object[] objArr17 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 385, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 60390), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr17);
        AuthenticationRequestParameters(map, ((String) objArr17[0]).intern(), new d(25));
        Object[] objArr18 = new Object[1];
        a(387 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 25792), 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr18);
        AuthenticationRequestParameters(map, ((String) objArr18[0]).intern(), new c0(18));
        Object[] objArr19 = new Object[1];
        a(393 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (Color.alpha(0) + 59844), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr19);
        AuthenticationRequestParameters(map, ((String) objArr19[0]).intern(), new c0(19));
        Object[] objArr20 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 396, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 54074), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, objArr20);
        AuthenticationRequestParameters(map, ((String) objArr20[0]).intern(), new c0(20));
        Object[] objArr21 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 400, (char) ((Process.getThreadPriority(0) + 20) >> 6), 4 - View.MeasureSpec.getMode(0), objArr21);
        AuthenticationRequestParameters(map, ((String) objArr21[0]).intern(), new c0(22));
        AuthenticationRequestParameters = (getSDKReferenceNumber + 63) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKVersion(Application application) {
        ChallengeResultKt challengeResultKt = new ChallengeResultKt(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 97) % 128;
        return challengeResultKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getScreenCustomization(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -817688834, 817688866, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSelectionIndicatorTintColor(Application application) {
        atd.p.ChallengeResultKt challengeResultKt = new atd.p.ChallengeResultKt(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 97) % 128;
        return challengeResultKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSelectionItemCustomization(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 205793228, -205793219, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSeverity(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1411054769, -1411054759, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getStatusBarColor(Application application) {
        atd.y.getSDKAppID getsdkappid = new atd.y.getSDKAppID(application);
        int i11 = getSDKReferenceNumber + 29;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 76 / 0;
        }
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTextBoxCustomization(Application application) {
        atd.y.ChallengeStatusReceiver challengeStatusReceiver = new atd.y.ChallengeStatusReceiver(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 115) % 128;
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTextColor(Application application) {
        atd.x.AuthenticationRequestParameters authenticationRequestParameters = new atd.x.AuthenticationRequestParameters(application);
        int i11 = getSDKReferenceNumber + 97;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 27 / 0;
        }
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTextFontName(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 863265422, -863265384, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTextFontSize(Application application) {
        atd.x.getSDKTransactionID getsdktransactionid = new atd.x.getSDKTransactionID(application);
        int i11 = getSDKReferenceNumber + 65;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getToolbarCustomization(Application application) {
        atd.y.getAdditionalDetails getadditionaldetails = new atd.y.getAdditionalDetails(application);
        int i11 = getSDKReferenceNumber + 43;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getadditionaldetails;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransaction(Application application) {
        atd.z.getSDKReferenceNumber getsdkreferencenumber = new atd.z.getSDKReferenceNumber(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 57) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransactionID() {
        atd.n.onCompletion oncompletion = new atd.n.onCompletion();
        int i11 = AuthenticationRequestParameters + 115;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 25 / 0;
        }
        return oncompletion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransactionStatus() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1258647069, -1258647046, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getWarnings(Application application) {
        atd.z.timedout timedoutVar = new atd.z.timedout(application);
        int i11 = AuthenticationRequestParameters + 101;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 44 / 0;
        }
        return timedoutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter hashCode(Application application) {
        atd.w.getMessageVersion getmessageversion = new atd.w.getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 7;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 9 / 0;
        }
        return getmessageversion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter hide(Application application) {
        atd.w.ErrorMessage errorMessage = new atd.w.ErrorMessage(application);
        int i11 = AuthenticationRequestParameters + 63;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return errorMessage;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{9, -55, 81, 14};
        $$b = 117;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter initialize(Application application) {
        CompletionEvent completionEvent = new CompletionEvent(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 35) % 128;
        return completionEvent;
    }

    private static /* synthetic */ Object onCompletion(Object[] objArr) {
        atd.k.ChallengeStatusReceiver challengeStatusReceiver = new atd.k.ChallengeStatusReceiver((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeStatusReceiver;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter parseHexColorCode(Application application) {
        atd.x.getSDKAppID getsdkappid = new atd.x.getSDKAppID(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 67) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter parseTypeface(Application application) {
        atd.o.BuildConfig buildConfig = new atd.o.BuildConfig(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 103) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter protocolError(Application application) {
        getTransactionID gettransactionid = new getTransactionID(application);
        int i11 = AuthenticationRequestParameters + 47;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return gettransactionid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter requireHexColorCode(Application application) {
        atd.x.ChallengeResult challengeResult = new atd.x.ChallengeResult(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 69) % 128;
        return challengeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter requireNonEmpty(Application application) {
        atd.x.ChallengeResultKt challengeResultKt = new atd.x.ChallengeResultKt(application);
        int i11 = AuthenticationRequestParameters + 87;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter requireNonNegative(Application application) {
        atd.x.ChallengeResultCompleted challengeResultCompleted = new atd.x.ChallengeResultCompleted(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 53) % 128;
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter runtimeError() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -2138142357, 2138142357, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setBackgroundColor(Application application) {
        atd.o.AuthenticationRequestParameters authenticationRequestParameters = new atd.o.AuthenticationRequestParameters(application);
        int i11 = getSDKReferenceNumber + 87;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setBorderColor(Application application) {
        atd.p.getSDKReferenceNumber getsdkreferencenumber = new atd.p.getSDKReferenceNumber(application);
        int i11 = getSDKReferenceNumber + 9;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 42 / 0;
        }
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setBorderWidth(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -2010114415, 2010114427, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setButtonCustomization(Application application) {
        atd.y.onCompletion oncompletion = new atd.y.onCompletion(application);
        int i11 = AuthenticationRequestParameters + 29;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return oncompletion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setButtonText(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 640825038, -640825013, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setCornerRadius(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -15153955, 15153981, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setExpandStateIndicatorColor(Application application) {
        atd.p.ChallengeResultError challengeResultError = new atd.p.ChallengeResultError(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 9) % 128;
        return challengeResultError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setExpandableInfoCustomization(Application application) {
        atd.q.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.q.getSDKEphemeralPublicKey(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 93) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setHeaderText(Application application) {
        atd.y.getSDKReferenceNumber getsdkreferencenumber = new atd.y.getSDKReferenceNumber(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 69) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setHeadingTextColor(Application application) {
        atd.x.onCompletion oncompletion = new atd.x.onCompletion(application);
        int i11 = getSDKReferenceNumber + 121;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return oncompletion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setHeadingTextFontName(Application application) {
        atd.x.runtimeError runtimeerror = new atd.x.runtimeError(application);
        int i11 = getSDKReferenceNumber + 1;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 4 / 0;
        }
        return runtimeerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setHeadingTextFontSize(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1945238631, 1945238670, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setHighlightedBackgroundColor(Application application) {
        atd.p.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.p.getSDKEphemeralPublicKey(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 85) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setInputLabelTextColor(Application application) {
        atd.p.ChallengeResultCompleted challengeResultCompleted = new atd.p.ChallengeResultCompleted(application);
        int i11 = getSDKReferenceNumber + 13;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setInputLabelTextFontName(Application application) {
        atd.p.getTransactionStatus gettransactionstatus = new atd.p.getTransactionStatus(application);
        int i11 = AuthenticationRequestParameters + 15;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setInputLabelTextFontSize(Application application) {
        atd.p.getAdditionalDetails getadditionaldetails = new atd.p.getAdditionalDetails(application);
        int i11 = AuthenticationRequestParameters + 65;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getadditionaldetails;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setLabelCustomization(Application application) {
        atd.y.protocolError protocolerror = new atd.y.protocolError(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 67) % 128;
        return protocolerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setScreenBackgroundColor(Application application) {
        atd.m.AuthenticationRequestParameters authenticationRequestParameters = new atd.m.AuthenticationRequestParameters(application);
        int i11 = AuthenticationRequestParameters + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 50 / 0;
        }
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setScreenCustomization(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 844171464, -844171429, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setSelectionIndicatorTintColor(Application application) {
        atd.y.getMessageVersion getmessageversion = new atd.y.getMessageVersion(application);
        int i11 = getSDKReferenceNumber + 41;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setSelectionItemCustomization(Application application) {
        atd.y.CompletionEvent completionEvent = new atd.y.CompletionEvent(application);
        int i11 = AuthenticationRequestParameters + 23;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 81 / 0;
        }
        return completionEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setStatusBarColor(Application application) {
        atd.p.completed completedVar = new atd.p.completed(application);
        int i11 = getSDKReferenceNumber + 41;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 62 / 0;
        }
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setTextBoxCustomization(Application application) {
        atd.y.ChallengeResultKt challengeResultKt = new atd.y.ChallengeResultKt(application);
        int i11 = AuthenticationRequestParameters + 95;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setTextColor(Application application) {
        atd.x.BuildConfig buildConfig = new atd.x.BuildConfig(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 17) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setTextFontName(Application application) {
        atd.x.getMessageVersion getmessageversion = new atd.x.getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 21;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 17 / 0;
        }
        return getmessageversion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setTextFontSize(Application application) {
        atd.x.getSDKReferenceNumber getsdkreferencenumber = new atd.x.getSDKReferenceNumber(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 93) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setTintColor(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 141710800, -141710766, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setToolbarCustomization(Application application) {
        atd.y.ChallengeStatusHandler challengeStatusHandler = new atd.y.ChallengeStatusHandler(application);
        int i11 = AuthenticationRequestParameters + 29;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeStatusHandler;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter setToolbarTitle(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1473782167, -1473782153, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter show() {
        atd.s.AuthenticationRequestParameters authenticationRequestParameters = new atd.s.AuthenticationRequestParameters();
        int i11 = getSDKReferenceNumber + 85;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 34 / 0;
        }
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter timedout(Application application) {
        atd.w.getErrorDescription geterrordescription = new atd.w.getErrorDescription(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 121) % 128;
        return geterrordescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter toString(Application application) {
        atd.w.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.w.getSDKEphemeralPublicKey(application);
        int i11 = getSDKReferenceNumber + 125;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter valueOf(Application application) {
        atd.o.getSDKTransactionID getsdktransactionid = new atd.o.getSDKTransactionID(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 11) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter values(Application application) {
        atd.z.getMessageVersion getmessageversion = new atd.z.getMessageVersion(application);
        int i11 = getSDKReferenceNumber + 95;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter writeToParcel(Application application) {
        atd.y.ChallengeResult challengeResult = new atd.y.ChallengeResult(application);
        int i11 = AuthenticationRequestParameters + 49;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 37 / 0;
        }
        return challengeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultKt() {
        atd.n.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.n.getSDKEphemeralPublicKey();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 91) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultKt() {
        atd.x.ChallengeStatusReceiver challengeStatusReceiver = new atd.x.ChallengeStatusReceiver();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 77) % 128;
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter timedout() {
        atd.n.getTransactionStatus gettransactionstatus = new atd.n.getTransactionStatus();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 13) % 128;
        return gettransactionstatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ErrorMessage() {
        atd.n.ChallengeResultKt challengeResultKt = new atd.n.ChallengeResultKt();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 117) % 128;
        return challengeResultKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter RuntimeErrorEvent() {
        atd.u.getSDKReferenceNumber getsdkreferencenumber = new atd.u.getSDKReferenceNumber();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 65) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cancelled(Application application) {
        getErrorCode geterrorcode = new getErrorCode(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 33) % 128;
        return geterrorcode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorCode() {
        atd.n.protocolError protocolerror = new atd.n.protocolError();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 119) % 128;
        return protocolerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter hide() {
        atd.l.AuthenticationRequestParameters authenticationRequestParameters = new atd.l.AuthenticationRequestParameters();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 125) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter protocolError() {
        atd.n.getAdditionalDetails getadditionaldetails = new atd.n.getAdditionalDetails();
        int i11 = AuthenticationRequestParameters + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getadditionaldetails;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter CompletionEvent() {
        atd.n.ChallengeStatusReceiver challengeStatusReceiver = new atd.n.ChallengeStatusReceiver();
        int i11 = getSDKReferenceNumber + 105;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeStatusReceiver;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorDetails() {
        atd.n.ChallengeStatusHandler challengeStatusHandler = new atd.n.ChallengeStatusHandler();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 77) % 128;
        return challengeStatusHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransactionID(Application application) {
        atd.w.getDeviceData getdevicedata = new atd.w.getDeviceData(application);
        int i11 = getSDKReferenceNumber + 111;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter show(Application application) {
        atd.w.ChallengeResultCompleted challengeResultCompleted = new atd.w.ChallengeResultCompleted(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 79) % 128;
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultCompleted(Application application) {
        atd.w.getSDKAppID getsdkappid = new atd.w.getSDKAppID(application);
        int i11 = AuthenticationRequestParameters + 99;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 21 / 0;
        }
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeStatusHandler() {
        atd.n.BuildConfig buildConfig = new atd.n.BuildConfig();
        int i11 = getSDKReferenceNumber + 89;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 55 / 0;
        }
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter onCompletion(Application application) {
        atd.w.onCompletion oncompletion = new atd.w.onCompletion(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 59) % 128;
        return oncompletion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultCompleted() {
        atd.n.getDeviceData getdevicedata = new atd.n.getDeviceData();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 45) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeStatusHandler(Application application) {
        atd.w.ChallengeResultKt challengeResultKt = new atd.w.ChallengeResultKt(application);
        int i11 = AuthenticationRequestParameters + 25;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter onCompletion() {
        atd.n.getMessageVersion getmessageversion = new atd.n.getMessageVersion();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 21) % 128;
        return getmessageversion;
    }

    private static /* synthetic */ Object ChallengeStatusReceiver(Object[] objArr) {
        atd.x.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.x.getSDKEphemeralPublicKey((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 55;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 83 / 0;
        }
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResult(Application application) {
        atd.w.ChallengeResultCancelled challengeResultCancelled = new atd.w.ChallengeResultCancelled(application);
        int i11 = getSDKReferenceNumber + 67;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 40 / 0;
        }
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultFailure(Application application) {
        atd.w.BuildConfig buildConfig = new atd.w.BuildConfig(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 55) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultSuccess(Application application) {
        atd.w.ChallengeResult challengeResult = new atd.w.ChallengeResult(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 45) % 128;
        return challengeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ProgressDialog(Application application) {
        atd.w.timedout timedoutVar = new atd.w.timedout(application);
        int i11 = getSDKReferenceNumber + 51;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return timedoutVar;
        }
        throw null;
    }

    private static /* synthetic */ Object getAdditionalDetails(Object[] objArr) {
        atd.l.getSDKTransactionID getsdktransactionid = new atd.l.getSDKTransactionID();
        int i11 = getSDKReferenceNumber + 5;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 30 / 0;
        }
        return getsdktransactionid;
    }

    private static /* synthetic */ Object getTransactionStatus(Object[] objArr) {
        atd.n.ChallengeResult challengeResult = new atd.n.ChallengeResult();
        int i11 = AuthenticationRequestParameters + 95;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 39 / 0;
        }
        return challengeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter runtimeError(Application application) {
        atd.w.runtimeError runtimeerror = new atd.w.runtimeError(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 31) % 128;
        return runtimeerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeStatusReceiver(Application application) {
        atd.w.completed completedVar = new atd.w.completed(application);
        int i11 = AuthenticationRequestParameters + 55;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return completedVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter completed() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -2112048712, 2112048715, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter equals() {
        atd.q.getDeviceData getdevicedata = new atd.q.getDeviceData();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 107) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getAdditionalDetails(Application application) {
        atd.w.ChallengeResultError challengeResultError = new atd.w.ChallengeResultError(application);
        int i11 = AuthenticationRequestParameters + 75;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultError;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorDescription() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1913938875, -1913938860, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransactionStatus(Application application) {
        atd.w.getAdditionalDetails getadditionaldetails = new atd.w.getAdditionalDetails(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 57) % 128;
        return getadditionaldetails;
    }

    private final void getAdditionalDetails(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{this, map, application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1582616868, -1582616848, sDKTransactionID);
    }

    private static /* synthetic */ Object ChallengeResultTimeout(Object[] objArr) {
        atd.n.ChallengeResultCancelled challengeResultCancelled = new atd.n.ChallengeResultCancelled();
        int i11 = getSDKReferenceNumber + 55;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultTimeout(Application application) {
        atd.w.ChallengeResultTimeout challengeResultTimeout = new atd.w.ChallengeResultTimeout(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 113) % 128;
        return challengeResultTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultTimeout() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1374286145, -1374286129, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKEphemeralPublicKey() {
        atd.k.completed completedVar = new atd.k.completed();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 11) % 128;
        return completedVar;
    }

    private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
        atd.n.completed completedVar = new atd.n.completed();
        int i11 = AuthenticationRequestParameters + 43;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 24 / 0;
        }
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKEphemeralPublicKey(Application application) {
        atd.k.getSDKAppID getsdkappid = new atd.k.getSDKAppID(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 15) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResult(Application application) {
        atd.w.AuthenticationRequestParameters authenticationRequestParameters = new atd.w.AuthenticationRequestParameters(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 97) % 128;
        return authenticationRequestParameters;
    }

    private static /* synthetic */ Object ChallengeResult(Object[] objArr) {
        atd.n.AuthenticationRequestParameters authenticationRequestParameters = new atd.n.AuthenticationRequestParameters();
        int i11 = AuthenticationRequestParameters + 27;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 24 / 0;
        }
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResult() {
        atd.k.timedout timedoutVar = new atd.k.timedout();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 107) % 128;
        return timedoutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getDeviceData() {
        atd.k.ChallengeResultError challengeResultError = new atd.k.ChallengeResultError();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 27) % 128;
        return challengeResultError;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        atd.z.getSDKAppID getsdkappid = new atd.z.getSDKAppID((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 53;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    @NotNull
    public final Map<String, DeviceParameterResult> getDeviceData(@NotNull Application application) throws Throwable {
        application.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        getSDKReferenceNumber(linkedHashMap, application);
        getSDKAppID(linkedHashMap, application);
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{this, linkedHashMap, application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1479210718, -1479210699, sDKTransactionID);
        getDeviceData(linkedHashMap, application);
        getSDKTransactionID(linkedHashMap);
        AuthenticationRequestParameters(linkedHashMap);
        AuthenticationRequestParameters(linkedHashMap, application);
        ChallengeResultCancelled(linkedHashMap, application);
        BuildConfig(linkedHashMap, application);
        getMessageVersion(linkedHashMap, application);
        getDeviceData(linkedHashMap);
        getSDKEphemeralPublicKey(linkedHashMap, application);
        ChallengeResult(linkedHashMap, application);
        getSDKAppID(linkedHashMap);
        ChallengeResultTimeout(linkedHashMap, application);
        Map<String, DeviceParameterResult> mapK = x0.k(linkedHashMap);
        int i11 = getSDKReferenceNumber + 103;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return mapK;
        }
        throw null;
    }

    private final void getDeviceData(Map<String, DeviceParameterResult> map) throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 117) % 128;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 696, (char) (56148 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Color.green(0) + 4, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new c0(26));
        AuthenticationRequestParameters = (getSDKReferenceNumber + 45) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getMessageVersion() {
        atd.k.getSDKTransactionID getsdktransactionid = new atd.k.getSDKTransactionID((byte) 0);
        int i11 = getSDKReferenceNumber + 105;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 46 / 0;
        }
        return getsdktransactionid;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        atd.y.runtimeError runtimeerror = new atd.y.runtimeError((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 73;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 17 / 0;
        }
        return runtimeerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultError() {
        atd.n.getSDKReferenceNumber getsdkreferencenumber = new atd.n.getSDKReferenceNumber();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 43) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getMessageVersion(Application application) {
        atd.k.ChallengeStatusHandler challengeStatusHandler = new atd.k.ChallengeStatusHandler(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 63) % 128;
        return challengeStatusHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultError(Application application) {
        atd.w.getSDKReferenceNumber getsdkreferencenumber = new atd.w.getSDKReferenceNumber(application);
        int i11 = AuthenticationRequestParameters + 3;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKReferenceNumber() {
        atd.k.protocolError protocolerror = new atd.k.protocolError((byte) 0);
        int i11 = getSDKReferenceNumber + 87;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return protocolerror;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKReferenceNumber(Application application) {
        atd.k.getMessageVersion getmessageversion = new atd.k.getMessageVersion(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 77) % 128;
        return getmessageversion;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        atd.l.getDeviceData getdevicedata = new atd.l.getDeviceData();
        int i11 = getSDKReferenceNumber + 45;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 90 / 0;
        }
        return getdevicedata;
    }

    private final DeviceParameterResult getSDKReferenceNumber(String str) {
        Collection<String> collection = this.getDeviceData;
        if (collection == null) {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 113) % 128;
            return null;
        }
        getSDKReferenceNumber = (AuthenticationRequestParameters + 111) % 128;
        if (collection.contains(str)) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.RESTRICTED);
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        atd.p.ChallengeResult challengeResult = new atd.p.ChallengeResult((Application) objArr[0]);
        int i11 = getSDKReferenceNumber + 31;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResult;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultCancelled() {
        InitializeResultSuccess initializeResultSuccess = new InitializeResultSuccess();
        int i11 = getSDKReferenceNumber + 11;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 69 / 0;
        }
        return initializeResultSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultCancelled(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), -1306420436, 1306420463, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKTransactionID(Application application) {
        atd.k.ChallengeResultCancelled challengeResultCancelled = new atd.k.ChallengeResultCancelled(application);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 19) % 128;
        return challengeResultCancelled;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        atd.n.getSDKAppID getsdkappid = new atd.n.getSDKAppID();
        int i11 = AuthenticationRequestParameters + 89;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKTransactionID() {
        atd.k.ChallengeResultKt challengeResultKt = new atd.k.ChallengeResultKt();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 21) % 128;
        return challengeResultKt;
    }

    private final void getSDKTransactionID(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{this, map, application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 1479210718, -1479210699, sDKTransactionID);
    }

    private static /* synthetic */ Object BuildConfig(Object[] objArr) {
        atd.n.getSDKTransactionID getsdktransactionid = new atd.n.getSDKTransactionID();
        int i11 = getSDKReferenceNumber + 69;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter BuildConfig(Application application) {
        InitializeResult initializeResult = new InitializeResult(application);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 95) % 128;
        return initializeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter BuildConfig() {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[0], sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 434882053, -434882040, sDKTransactionID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKAppID(Application application) {
        atd.k.BuildConfig buildConfig = new atd.k.BuildConfig(application);
        int i11 = AuthenticationRequestParameters + 55;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return buildConfig;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKAppID() {
        atd.k.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.k.getSDKEphemeralPublicKey();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 23) % 128;
        return getsdkephemeralpublickey;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        atd.n.ChallengeResultTimeout challengeResultTimeout = new atd.n.ChallengeResultTimeout();
        int i11 = getSDKReferenceNumber + 79;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResultTimeout;
        }
        throw null;
    }

    private final void getSDKAppID(Map<String, DeviceParameterResult> map) throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 121) % 128;
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 725, (char) (22692 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new c0(17));
        AuthenticationRequestParameters = (getSDKReferenceNumber + 115) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter AuthenticationRequestParameters() {
        atd.k.ChallengeResultTimeout challengeResultTimeout = new atd.k.ChallengeResultTimeout();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 115) % 128;
        return challengeResultTimeout;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        atd.w.ChallengeStatusHandler challengeStatusHandler = new atd.w.ChallengeStatusHandler((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 109;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeStatusHandler;
        }
        throw null;
    }

    private final void AuthenticationRequestParameters(Map<String, DeviceParameterResult> map) throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 11) % 128;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + AppConstants.STATUS_CODE_FORBIDDEN, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24299), 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new d(5));
        Object[] objArr2 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 408, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), AndroidCharacter.getMirror('0') - ',', objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new d(6));
        Object[] objArr3 = new Object[1];
        a(Color.blue(0) + 412, (char) (1217 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new d(7));
        Object[] objArr4 = new Object[1];
        a(416 - View.resolveSize(0, 0), (char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 4, objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new d(8));
        Object[] objArr5 = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 420, (char) (38254 - TextUtils.getCapsMode("", 0, 0)), 3 - TextUtils.lastIndexOf("", '0', 0), objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new d(9));
        int i11 = AuthenticationRequestParameters + 27;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
    }

    private final void AuthenticationRequestParameters(Map<String, DeviceParameterResult> map, Application application) throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 71) % 128;
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 425, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr);
        AuthenticationRequestParameters(map, ((String) objArr[0]).intern(), new f(application, 1));
        Object[] objArr2 = new Object[1];
        a(428 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (18821 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr2);
        AuthenticationRequestParameters(map, ((String) objArr2[0]).intern(), new f(application, 10));
        Object[] objArr3 = new Object[1];
        a(432 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        AuthenticationRequestParameters(map, ((String) objArr3[0]).intern(), new f(application, 11));
        Object[] objArr4 = new Object[1];
        a(436 - View.resolveSizeAndState(0, 0, 0), (char) KeyEvent.getDeadChar(0, 0), 4 - Gravity.getAbsoluteGravity(0, 0), objArr4);
        AuthenticationRequestParameters(map, ((String) objArr4[0]).intern(), new f(application, 12));
        Object[] objArr5 = new Object[1];
        a(441 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 4, objArr5);
        AuthenticationRequestParameters(map, ((String) objArr5[0]).intern(), new f(application, 13));
        Object[] objArr6 = new Object[1];
        a(444 - View.resolveSize(0, 0), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29466), TextUtils.lastIndexOf("", '0') + 5, objArr6);
        AuthenticationRequestParameters(map, ((String) objArr6[0]).intern(), new f(application, 14));
        Object[] objArr7 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 449, (char) (7412 - AndroidCharacter.getMirror('0')), AndroidCharacter.getMirror('0') - ',', objArr7);
        AuthenticationRequestParameters(map, ((String) objArr7[0]).intern(), new f(application, 15));
        Object[] objArr8 = new Object[1];
        a(452 - TextUtils.getCapsMode("", 0, 0), (char) (View.resolveSize(0, 0) + 60209), View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr8);
        AuthenticationRequestParameters(map, ((String) objArr8[0]).intern(), new f(application, 16));
        Object[] objArr9 = new Object[1];
        a(456 - View.combineMeasuredStates(0, 0), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 62912), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr9);
        AuthenticationRequestParameters(map, ((String) objArr9[0]).intern(), new f(application, 17));
        Object[] objArr10 = new Object[1];
        a(460 - TextUtils.indexOf("", "", 0, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 4 - View.combineMeasuredStates(0, 0), objArr10);
        AuthenticationRequestParameters(map, ((String) objArr10[0]).intern(), new f(application, 18));
        Object[] objArr11 = new Object[1];
        a(464 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 4 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr11);
        AuthenticationRequestParameters(map, ((String) objArr11[0]).intern(), new f(application, 2));
        Object[] objArr12 = new Object[1];
        a(468 - TextUtils.indexOf("", ""), (char) (TextUtils.indexOf("", "") + 44100), View.getDefaultSize(0, 0) + 4, objArr12);
        AuthenticationRequestParameters(map, ((String) objArr12[0]).intern(), new f(application, 3));
        Object[] objArr13 = new Object[1];
        a(472 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 13187), (ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr13);
        AuthenticationRequestParameters(map, ((String) objArr13[0]).intern(), new d(20));
        Object[] objArr14 = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 476, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47170), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr14);
        AuthenticationRequestParameters(map, ((String) objArr14[0]).intern(), new f(application, 4));
        Object[] objArr15 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 480, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 4, objArr15);
        AuthenticationRequestParameters(map, ((String) objArr15[0]).intern(), new f(application, 5));
        Object[] objArr16 = new Object[1];
        a(485 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr16);
        AuthenticationRequestParameters(map, ((String) objArr16[0]).intern(), new f(application, 6));
        Object[] objArr17 = new Object[1];
        a(Color.blue(0) + 488, (char) TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr17);
        AuthenticationRequestParameters(map, ((String) objArr17[0]).intern(), new f(application, 7));
        Object[] objArr18 = new Object[1];
        a(492 - View.MeasureSpec.getMode(0), (char) (View.resolveSizeAndState(0, 0, 0) + 20224), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr18);
        AuthenticationRequestParameters(map, ((String) objArr18[0]).intern(), new f(application, 8));
        Object[] objArr19 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 496, (char) (AndroidCharacter.getMirror('0') + 59821), TextUtils.getTrimmedLength("") + 4, objArr19);
        AuthenticationRequestParameters(map, ((String) objArr19[0]).intern(), new f(application, 9));
        AuthenticationRequestParameters = (getSDKReferenceNumber + 1) % 128;
    }

    private final void AuthenticationRequestParameters(Map<String, DeviceParameterResult> map, String str, Function0<? extends DeviceParameter> function0) {
        int i11 = getSDKReferenceNumber + 19;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber(str);
            throw null;
        }
        DeviceParameterResult sDKReferenceNumber = getSDKReferenceNumber(str);
        if (sDKReferenceNumber == null) {
            int i12 = getSDKReferenceNumber + 63;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 == 0) {
                sDKReferenceNumber = ((DeviceParameter) function0.invoke()).getDeviceData();
            } else {
                ((DeviceParameter) function0.invoke()).getDeviceData();
                throw null;
            }
        }
        map.put(str, sDKReferenceNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter AuthenticationRequestParameters(Application application) {
        int sDKTransactionID = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        int sDKTransactionID2 = getDeviceData.AuthenticationRequestParameters.getSDKTransactionID();
        return (DeviceParameter) AuthenticationRequestParameters(getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), new Object[]{application}, sDKTransactionID2, getDeviceData.AuthenticationRequestParameters.getSDKTransactionID(), 43599991, -43599954, sDKTransactionID);
    }
}
