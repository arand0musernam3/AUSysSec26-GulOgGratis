package atd.bc;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.tgtg.model.local.AppConstants;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/util/PublicLogger;", "", "<init>", "()V", "LOGCAT_MAX_LENGTH", "", "TAG_PREFIX", "", "i", "", "sourceTag", InAppMessageBase.MESSAGE, "w", "e", "println", "priority", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPublicLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicLogger.kt\ncom/adyen/threeds2/internal/util/PublicLogger\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,85:1\n108#2:86\n80#2,22:87\n*S KotlinDebug\n*F\n+ 1 PublicLogger.kt\ncom/adyen/threeds2/internal/util/PublicLogger\n*L\n80#1:86\n80#1:87,22\n*E\n"})
public final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;

    @NotNull
    public static final BuildConfig getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, short r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 + 4
            int r9 = 106 - r9
            byte[] r0 = atd.bc.BuildConfig.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r5 = r2
            r0 = r7
            goto L2c
        L13:
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2c:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r0
            r0 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.BuildConfig.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 0;
        getSDKAppID = 1;
        getDeviceData();
        MotionEvent.axisFromString("");
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.lastIndexOf("", '0', 0, 0);
        getSDKReferenceNumber = new BuildConfig();
        int i11 = ChallengeResult + 57;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private BuildConfig() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, char r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.BuildConfig.a(int, char, int, java.lang.Object[]):void");
    }

    private static void getDeviceData(int i11, String str, String str2) throws Throwable {
        int i12;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(str);
        String string = sb2.toString();
        while (str2.length() > 3950) {
            Log.println(i11, string, str2.substring(0, 3950));
            String strSubstring = str2.substring(3950);
            int length = strSubstring.length() - 1;
            int i13 = 0;
            boolean z11 = false;
            while (i13 <= length) {
                if (z11) {
                    i12 = length;
                } else {
                    getSDKAppID = (AuthenticationRequestParameters + 7) % 128;
                    i12 = i13;
                }
                boolean z12 = Intrinsics.compare((int) strSubstring.charAt(i12), 32) <= 0;
                if (z11) {
                    if (z12) {
                        AuthenticationRequestParameters = (getSDKAppID + 37) % 128;
                        length--;
                    }
                } else if (z12) {
                    i13++;
                } else {
                    z11 = true;
                }
            }
            str2 = strSubstring.subSequence(i13, length + 1).toString();
            AuthenticationRequestParameters = (getSDKAppID + 47) % 128;
        }
        Log.println(i11, string, str2);
    }

    public static void init$0() {
        $$a = new byte[]{88, -124, -103, 69};
        $$b = 112;
    }

    public final void getSDKAppID(@NotNull String str, @NotNull String str2) {
        AuthenticationRequestParameters = (getSDKAppID + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        str.getClass();
        str2.getClass();
        getDeviceData(6, str, str2);
        AuthenticationRequestParameters = (getSDKAppID + 5) % 128;
    }

    public final void getSDKTransactionID(@NotNull String str, @NotNull String str2) {
        getSDKAppID = (AuthenticationRequestParameters + 3) % 128;
        str.getClass();
        str2.getClass();
        getDeviceData(5, str, str2);
        int i11 = getSDKAppID + 71;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 79 / 0;
        }
    }

    public static void getDeviceData() {
        getSDKTransactionID = new char[]{62575, 887, 6910, 4515, 10516, 8274};
        getDeviceData = 6782945218634711876L;
    }
}
