package t;

import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import androidx.lifecycle.o0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BiometricPrompt$AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f39289a;

    public a(d dVar) {
        this.f39289a = dVar;
    }

    public void onAuthenticationError(int i11, CharSequence charSequence) {
        WeakReference weakReference = ((t) this.f39289a).f39310a;
        if (weakReference.get() == null || ((v) weakReference.get()).f39324m || !((v) weakReference.get()).l) {
            return;
        }
        ((v) weakReference.get()).b(new e(i11, charSequence));
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((t) this.f39289a).f39310a;
        if (weakReference.get() == null || !((v) weakReference.get()).l) {
            return;
        }
        v vVar = (v) weakReference.get();
        if (vVar.f39331t == null) {
            vVar.f39331t = new o0();
        }
        v.d(vVar.f39331t, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult r7) {
        /*
            r6 = this;
            r0 = 30
            r1 = 0
            if (r7 == 0) goto L63
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = t.b.b(r7)
            if (r2 != 0) goto Lc
            goto L63
        Lc:
            javax.crypto.Cipher r3 = t.x.d(r2)
            if (r3 == 0) goto L18
            t.q r1 = new t.q
            r1.<init>(r3)
            goto L63
        L18:
            java.security.Signature r3 = t.x.f(r2)
            if (r3 == 0) goto L24
            t.q r1 = new t.q
            r1.<init>(r3)
            goto L63
        L24:
            javax.crypto.Mac r3 = t.x.e(r2)
            if (r3 == 0) goto L30
            t.q r1 = new t.q
            r1.<init>(r3)
            goto L63
        L30:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r0) goto L40
            android.security.identity.IdentityCredential r4 = t.y.b(r2)
            if (r4 == 0) goto L40
            t.q r1 = new t.q
            r1.<init>(r4)
            goto L63
        L40:
            r4 = 33
            if (r3 < r4) goto L50
            android.security.identity.PresentationSession r4 = t.z.b(r2)
            if (r4 == 0) goto L50
            t.q r1 = new t.q
            r1.<init>(r4)
            goto L63
        L50:
            r4 = 35
            if (r3 < r4) goto L63
            long r2 = t.a0.b(r2)
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L63
            t.q r1 = new t.q
            r1.<init>(r2)
        L63:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 2
            r4 = -1
            if (r2 < r0) goto L70
            if (r7 == 0) goto L74
            int r7 = t.c.a(r7)
            goto L77
        L70:
            r7 = 29
            if (r2 != r7) goto L76
        L74:
            r7 = r4
            goto L77
        L76:
            r7 = r3
        L77:
            t.p r0 = new t.p
            r0.<init>(r1, r7)
            t.d r2 = r6.f39289a
            t.t r2 = (t.t) r2
            java.lang.ref.WeakReference r2 = r2.f39310a
            java.lang.Object r5 = r2.get()
            if (r5 == 0) goto Lc5
            java.lang.Object r5 = r2.get()
            t.v r5 = (t.v) r5
            boolean r5 = r5.l
            if (r5 == 0) goto Lc5
            if (r7 != r4) goto Laf
            t.p r0 = new t.p
            java.lang.Object r7 = r2.get()
            t.v r7 = (t.v) r7
            int r7 = r7.a()
            r5 = r7 & 32767(0x7fff, float:4.5916E-41)
            if (r5 == 0) goto Lab
            boolean r7 = a.a.D(r7)
            if (r7 != 0) goto Lab
            goto Lac
        Lab:
            r3 = r4
        Lac:
            r0.<init>(r1, r3)
        Laf:
            java.lang.Object r7 = r2.get()
            t.v r7 = (t.v) r7
            androidx.lifecycle.o0 r1 = r7.f39328q
            if (r1 != 0) goto Lc0
            androidx.lifecycle.o0 r1 = new androidx.lifecycle.o0
            r1.<init>()
            r7.f39328q = r1
        Lc0:
            androidx.lifecycle.o0 r7 = r7.f39328q
            t.v.d(r7, r0)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt$AuthenticationResult):void");
    }

    public void onAuthenticationHelp(int i11, CharSequence charSequence) {
    }
}
