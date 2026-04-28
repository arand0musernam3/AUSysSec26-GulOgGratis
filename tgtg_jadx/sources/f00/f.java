package f00;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f17036a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f17036a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
