package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"toBooleanOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "toPositiveIntOrNull", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;

    private static String $$c(byte b8, int i11, short s7) {
        byte[] bArr = $$a;
        int i12 = 99 - (s7 * 2);
        int i13 = b8 * 2;
        int i14 = 3 - (i11 * 4);
        byte[] bArr2 = new byte[i13 + 1];
        int i15 = -1;
        if (bArr == null) {
            i12 = i14 + i13;
            i14 = i14;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i12;
            if (i15 == i13) {
                return new String(bArr2, 0);
            }
            int i16 = i14 + 1;
            i12 += bArr[i16];
            i14 = i16;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKReferenceNumber = 6536117052526687148L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.a(java.lang.String, int, java.lang.Object[]):void");
    }

    @Nullable
    public static final Integer getSDKReferenceNumber(@NotNull String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull == null) {
            getDeviceData = (getSDKAppID + 101) % 128;
            return null;
        }
        getDeviceData = (getSDKAppID + 53) % 128;
        int iIntValue = intOrNull.intValue();
        if (iIntValue >= 0) {
            return Integer.valueOf(iIntValue);
        }
        return null;
    }

    @Nullable
    public static final Boolean getSDKTransactionID(@NotNull String str) throws Throwable {
        int i11 = getSDKAppID + 41;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            lowerCase.hashCode();
            throw null;
        }
        str.getClass();
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        int iHashCode = lowerCase2.hashCode();
        if (iHashCode == 48) {
            Object[] objArr = new Object[1];
            a("\uea74", 60127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            if (lowerCase2.equals(((String) objArr[0]).intern())) {
                return Boolean.FALSE;
            }
        } else if (iHashCode == 49) {
            Object[] objArr2 = new Object[1];
            a("\uea75", Drawable.resolveOpacity(0, 0) + 32621, objArr2);
            if (lowerCase2.equals(((String) objArr2[0]).intern())) {
                return Boolean.TRUE;
            }
        } else if (iHashCode == 3569038) {
            Object[] objArr3 = new Object[1];
            a("\uea30\uf7f3톻덮", 7621 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            if (lowerCase2.equals(((String) objArr3[0]).intern())) {
                return Boolean.TRUE;
            }
            getDeviceData = (getSDKAppID + 57) % 128;
        } else if (iHashCode == 97196323) {
            Object[] objArr4 = new Object[1];
            a("\uea22㩮䪾髖ꬍ", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 53322, objArr4);
            if (lowerCase2.equals(((String) objArr4[0]).intern())) {
                Boolean bool = Boolean.FALSE;
                int i12 = getDeviceData + 71;
                getSDKAppID = i12 % 128;
                if (i12 % 2 != 0) {
                    return bool;
                }
                throw null;
            }
        }
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{45, 58, -109, -84};
        $$b = 69;
    }
}
