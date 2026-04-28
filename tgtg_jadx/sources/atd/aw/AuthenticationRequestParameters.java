package atd.aw;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/adyen/threeds2/internal/ui/Paddings;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "component1", "component2", "component3", "component4", "copy", "(IIII)Lcom/adyen/threeds2/internal/ui/Paddings;", "I", "getLeft", "getTop", "getRight", "getBottom", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    @NotNull
    public static final C0004AuthenticationRequestParameters AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private final int getDeviceData;
    private final int getSDKAppID;
    private final int getSDKReferenceNumber;
    private final int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = atd.aw.AuthenticationRequestParameters.$$a
            int r8 = r8 * 2
            int r8 = 100 - r8
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.AuthenticationRequestParameters.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        BuildConfig = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        AuthenticationRequestParameters = new C0004AuthenticationRequestParameters((byte) 0);
        int i11 = ChallengeResult + 109;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 92 / 0;
        }
    }

    public AuthenticationRequestParameters(int i11, int i12, int i13, int i14) {
        this.getSDKAppID = i11;
        this.getSDKTransactionID = i12;
        this.getDeviceData = i13;
        this.getSDKReferenceNumber = i14;
    }

    public static void AuthenticationRequestParameters() {
        getSDKEphemeralPublicKey = 711855177;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r32, int r33, java.lang.String r34, int r35, int r36, java.lang.Object[] r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.AuthenticationRequestParameters.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{69, 1, -84, -84};
        $$b = 225;
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationRequestParameters)) {
            int i11 = getMessageVersion + 3;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            throw null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) other;
        if (this.getSDKAppID != authenticationRequestParameters.getSDKAppID) {
            BuildConfig = (getMessageVersion + 71) % 128;
            return false;
        }
        if (this.getSDKTransactionID != authenticationRequestParameters.getSDKTransactionID) {
            return false;
        }
        if (this.getDeviceData == authenticationRequestParameters.getDeviceData) {
            return this.getSDKReferenceNumber == authenticationRequestParameters.getSDKReferenceNumber;
        }
        int i12 = BuildConfig + 17;
        getMessageVersion = i12 % 128;
        return i12 % 2 == 0;
    }

    public final int getDeviceData() {
        int i11 = BuildConfig + 53;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.getSDKTransactionID;
        if (i12 == 0) {
            int i14 = 32 / 0;
        }
        return i13;
    }

    public final int getSDKAppID() {
        int i11 = BuildConfig + 3;
        int i12 = i11 % 128;
        getMessageVersion = i12;
        int i13 = i11 % 2;
        int i14 = this.getSDKReferenceNumber;
        if (i13 == 0) {
            throw null;
        }
        BuildConfig = (i12 + 3) % 128;
        return i14;
    }

    public final int getSDKReferenceNumber() {
        int i11 = getMessageVersion;
        int i12 = this.getSDKAppID;
        int i13 = i11 + 11;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    public final int getSDKTransactionID() {
        int i11 = BuildConfig;
        int i12 = this.getDeviceData;
        getMessageVersion = (i11 + 81) % 128;
        return i12;
    }

    public final int hashCode() {
        int i11 = BuildConfig + 117;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.getSDKAppID;
        if (i12 == 0) {
            return ((((Integer.hashCode(this.getSDKTransactionID) + (Integer.hashCode(i13) + 94)) - 77) % Integer.hashCode(this.getDeviceData)) - 98) % Integer.hashCode(this.getSDKReferenceNumber);
        }
        return Integer.hashCode(this.getSDKReferenceNumber) + k.b(this.getDeviceData, k.b(this.getSDKTransactionID, Integer.hashCode(i13) * 31, 31), 31);
    }

    @NotNull
    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 236, "\uffde\u0015\u0007\u0006\r\uffc9\u0014\b\u000f\n\u0005\u0005\u0002\ufff1", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.getSDKAppID);
        Object[] objArr2 = new Object[1];
        a(true, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 220, "! %\uffd1\uffdd￮", 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.getSDKTransactionID);
        Object[] objArr3 = new Object[1];
        a(false, 226 - View.MeasureSpec.getMode(0), "\u001e\u0015\u0013\u0014 ￩\uffd8ￌ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, 7 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(this.getDeviceData);
        Object[] objArr4 = new Object[1];
        a(false, 229 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0017\u001c\u001c\u0017\u0015￥ￔ\uffc8\n", TextUtils.lastIndexOf("", '0') + 7, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9, objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(this.getSDKReferenceNumber);
        sb2.append(')');
        String string = sb2.toString();
        getMessageVersion = (BuildConfig + 103) % 128;
        return string;
    }

    /* JADX INFO: renamed from: atd.aw.AuthenticationRequestParameters$AuthenticationRequestParameters, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/ui/Paddings$Companion;", "", "<init>", "()V", "from", "Lcom/adyen/threeds2/internal/ui/Paddings;", "view", "Landroid/view/View;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0004AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;
        private static long getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r5, byte r6, byte r7) {
            /*
                byte[] r0 = atd.aw.AuthenticationRequestParameters.C0004AuthenticationRequestParameters.$$c
                int r7 = r7 * 4
                int r1 = 1 - r7
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r5 = r5 + 68
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r6 = r6 + 1
                int r4 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L26:
                r3 = r0[r6]
            L28:
                int r5 = r5 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aw.AuthenticationRequestParameters.C0004AuthenticationRequestParameters.$$e(byte, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKAppID = 1;
            getSDKTransactionID = -2468361621208396186L;
            getSDKReferenceNumber = -2038612665;
            AuthenticationRequestParameters = (char) 15687;
        }

        private C0004AuthenticationRequestParameters() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 6
                int r8 = 103 - r8
                byte[] r0 = atd.aw.AuthenticationRequestParameters.C0004AuthenticationRequestParameters.$$a
                int r7 = r7 * 25
                int r7 = 29 - r7
                int r6 = r6 * 15
                int r6 = 26 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r0
                r4 = r2
                r0 = r8
                r8 = r7
                goto L30
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L30:
                int r0 = r0 + r7
                int r7 = r8 + 1
                int r8 = r0 + (-5)
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aw.AuthenticationRequestParameters.C0004AuthenticationRequestParameters.a(byte, byte, byte, java.lang.Object[]):void");
        }

        private static void b(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
            char[] charArray;
            char[] charArray2;
            char[] charArray3;
            int i12;
            int i13;
            int i14;
            char c7;
            int i15 = 2;
            Object obj = null;
            if (str3 != null) {
                int i16 = $11 + 45;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    str3.toCharArray();
                    throw null;
                }
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
            char[] cArr = charArray;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
                $11 = ($10 + 55) % 128;
            } else {
                charArray2 = str2;
            }
            char[] cArr2 = charArray2;
            if (str != null) {
                int i17 = $11 + 11;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray3 = str.toCharArray();
            } else {
                charArray3 = str;
            }
            char[] cArr3 = charArray3;
            onCompletion oncompletion = new onCompletion();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i18 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c3);
            cArr5[2] = (char) (cArr5[2] + ((char) i11));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            oncompletion.getDeviceData = 0;
            while (oncompletion.getDeviceData < length3) {
                try {
                    Object[] objArr2 = {oncompletion};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i18;
                        i12 = i15;
                        sDKTransactionID = ChallengeResult.getDeviceData(2069 - KeyEvent.normalizeMetaState(i18), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44657), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31, -397560981, false, $$e((byte) 49, b8, b8), new Class[]{Object.class});
                    } else {
                        i12 = i15;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {oncompletion};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                    if (sDKTransactionID2 == null) {
                        byte b11 = (byte) i18;
                        i13 = i18;
                        sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getPressedStateDuration() >> 16) + 3095, (char) (14367 - View.resolveSize(i18, i18)), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1211924053, false, $$e((byte) 50, b11, b11), new Class[]{Object.class});
                    } else {
                        i13 = i18;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                    int i19 = cArr4[oncompletion.getDeviceData % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i12] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i19);
                    objArr4[i13] = oncompletion;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID3 == null) {
                        c7 = 1;
                        int i21 = i13;
                        i14 = iIntValue;
                        byte b12 = (byte) i21;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(TextUtils.indexOf((CharSequence) "", '0', i21, i21) + 1429, (char) TextUtils.getOffsetAfter("", i21), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30, -1183253656, false, $$e((byte) 51, b12, b12), new Class[]{Object.class, cls, cls});
                    } else {
                        i14 = iIntValue;
                        c7 = 1;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    int i22 = cArr4[iIntValue2] * 32718;
                    int i23 = i12;
                    Object[] objArr5 = new Object[i23];
                    objArr5[c7] = Integer.valueOf(cArr5[i14]);
                    objArr5[0] = Integer.valueOf(i22);
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                    if (sDKTransactionID4 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13060), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 26, -320602145, false, $$e(b13, b14, b14), new Class[]{cls, cls});
                    }
                    obj = null;
                    cArr5[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                    int i24 = oncompletion.getDeviceData;
                    cArr6[i24] = (char) (((((long) (r0 ^ cArr[i24])) ^ (getSDKTransactionID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L))));
                    oncompletion.getDeviceData = i24 + 1;
                    i15 = i23;
                    i18 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public static void getDeviceData(long j9, long j11) throws Throwable {
            getDeviceData = (getSDKAppID + 5) % 128;
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = (byte) (b8 + 1);
            Object[] objArr = new Object[1];
            a(b8, b11, b11, objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            getSDKAppID = (getDeviceData + 115) % 128;
            try {
                byte b12 = bArr[28];
                byte b13 = (byte) (b12 + 1);
                Object[] objArr2 = new Object[1];
                a(b12, b13, b13, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = bArr[28];
                byte b15 = (byte) (b14 + 1);
                byte b16 = b14;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Method method = cls.getMethod((String) objArr3[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr4 = {atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null)};
                Object[] objArr5 = new Object[1];
                b("댡烗ꀏ쟌", "ꦾ듖䜪끬", "ᶬ폕፬", 716494505 + Gravity.getAbsoluteGravity(0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27718), objArr5);
                Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                method2.setAccessible(true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        @NotNull
        public static AuthenticationRequestParameters getSDKTransactionID(@Nullable View view) {
            return new AuthenticationRequestParameters(view != null ? view.getPaddingLeft() : 0, view != null ? view.getPaddingTop() : 0, view != null ? view.getPaddingRight() : 0, view != null ? view.getPaddingBottom() : 0);
        }

        public static void init$0() {
            $$a = new byte[]{79, 112, 3, 57, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
            $$b = 76;
        }

        public static void init$1() {
            $$c = new byte[]{61, 123, 18, -31};
            $$d = 76;
        }

        public /* synthetic */ C0004AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
