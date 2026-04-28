package atd.aw;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import atd.bb.completed;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.ui.activity.ChallengeActivity;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID implements LayoutInflater.Factory2 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static final String[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private final Window AuthenticationRequestParameters;
    private final getDeviceData getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 120 - r8
            byte[] r0 = atd.aw.getSDKAppID.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
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
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.getSDKAppID.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getSDKAppID = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a("䐝먬ᱫ䑼≅Ⰱ蒴⑮䉦谥擌䳓葓\ue27a\uec48쓩摧", KeyEvent.keyCodeFromString("") + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\udc88㔮\udc73\udce9굇\uec19ꓲ볻쵤䰽䒊沕᳇浸ⱑ\ue4bfﲹ贁谿", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("ۙ\uf6f6⟒ڸ溟ី꼎暪ຼ랜佶杩욖꺬ퟶ\uef4f⛤仙瞞", -((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("ꢖᘙ\uec0eꣷ蹰\udc64㬾죥\uee53籀\udb46\uf359棏乖\u1c38笺", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        getDeviceData = new String[]{strIntern, strIntern2, strIntern3, ((String) objArr4[0]).intern()};
        ChallengeResult = (getMessageVersion + 85) % 128;
    }

    public getSDKAppID(Window window, getDeviceData getdevicedata) {
        this.AuthenticationRequestParameters = window;
        this.getSDKTransactionID = getdevicedata;
        getDeviceData.getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, window}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1788541868, 1788541880, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        if (str != null) {
            int i13 = $11 + 85;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        $10 = ($11 + 17) % 128;
        while (true) {
            int i14 = completedVar.getSDKTransactionID;
            if (i14 >= sDKTransactionID.length) {
                String str2 = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                $11 = ($10 + 33) % 128;
                objArr[0] = str2;
                return;
            }
            int i15 = i14 - 4;
            completedVar.getSDKAppID = i15;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i14] ^ sDKTransactionID[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKReferenceNumber)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int i16 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2773;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 13061);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 25;
                    byte b8 = $$a[2];
                    byte b11 = b8;
                    i12 = 0;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(i16, cIndexOf, iNormalizeMetaState, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                } else {
                    i12 = 0;
                }
                sDKTransactionID[i14] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = completedVar;
                objArr3[i12] = completedVar;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(408 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Process.getGidForName("") + 1), 30 - Color.red(i12), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static void getSDKReferenceNumber() {
        getSDKReferenceNumber = -1764678803318038827L;
    }

    public static void init$0() {
        $$a = new byte[]{26, 112, 0, -80};
        $$b = 61;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4 A[PHI: r3
      0x00a4: PHI (r3v10 android.view.LayoutInflater) = (r3v3 android.view.LayoutInflater), (r3v11 android.view.LayoutInflater) binds: [B:8:0x0056, B:5:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[EXC_TOP_SPLITTER, PHI: r3
      0x0058: PHI (r3v4 android.view.LayoutInflater) = (r3v3 android.view.LayoutInflater), (r3v11 android.view.LayoutInflater) binds: [B:8:0x0056, B:5:0x0037] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r25, java.lang.String r26, android.content.Context r27, android.util.AttributeSet r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.getSDKAppID.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) throws Throwable {
        ChallengeResultCancelled = (getSDKAppID + 31) % 128;
        View viewOnCreateView = onCreateView(null, str, context, attributeSet);
        int i11 = getSDKAppID + 101;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return viewOnCreateView;
        }
        throw null;
    }
}
