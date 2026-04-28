package pz;

import com.google.android.gms.common.internal.i0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f35673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f35675c;

    public /* synthetic */ l(boolean z11, String str, k kVar) {
        this.f35673a = z11;
        this.f35674b = str;
        this.f35675c = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z11 = this.f35673a;
        String str = this.f35674b;
        k kVar = this.f35675c;
        String str2 = (z11 || !n.b(str, kVar, true, false).f35691a) ? "not allowed" : "debug cert rejected";
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i11++;
        }
        i0.h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(kVar.f35672i);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i12 = 0;
        for (byte b8 : bArrDigest) {
            char[] cArr2 = vz.c.f42624b;
            cArr[i12] = cArr2[(b8 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b8 & 15];
            i12 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z11 + ", ver=12451000.false";
    }
}
