package pz;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f35660c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f35662b;

    public f(Context context) {
        this.f35661a = context.getApplicationContext();
    }

    public static f a(Context context) {
        i0.h(context);
        synchronized (f.class) {
            if (f35660c == null) {
                i iVar = n.f35679a;
                synchronized (n.class) {
                    if (n.f35683e == null) {
                        n.f35683e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f35660c = new f(context);
            }
        }
        return f35660c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.f.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static j d(PackageInfo packageInfo, j... jVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            k kVar = new k(packageInfo.signatures[0].toByteArray());
            for (int i11 = 0; i11 < jVarArr.length; i11++) {
                if (jVarArr[i11].equals(kVar)) {
                    return jVarArr[i11];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.f.b(int):boolean");
    }
}
