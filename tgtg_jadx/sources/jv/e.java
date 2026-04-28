package jv;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import n7.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i30.g f25426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f25427b;

    public e() {
        i10.b bVar = new i10.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        this.f25427b = new s(CollectionsKt.r0(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jv.c
            if (r0 == 0) goto L13
            r0 = r5
            jv.c r0 = (jv.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jv.c r0 = new jv.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25422j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r5)     // Catch: java.lang.Throwable -> L27
            goto L5e
        L27:
            r5 = move-exception
            goto L4c
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            i30.g r5 = r4.f25426a     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L38
            goto L3e
        L38:
            java.lang.String r5 = "credentialManager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L3e:
            n7.a r2 = new n7.a     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            r0.l = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L5e
            return r1
        L4c:
            mv.m0 r0 = sa0.a.f38953a
            java.lang.String r5 = r5.getMessage()
            java.lang.String r1 = "Exception Ignored: "
            java.lang.String r5 = e0.f.k(r1, r5)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.i(r5, r1)
        L5e:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.e.a(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(androidx.fragment.app.o0 r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jv.d
            if (r0 == 0) goto L13
            r0 = r7
            jv.d r0 = (jv.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jv.d r0 = new jv.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25424j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            jv.g r4 = jv.g.f25429a
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            goto L4b
        L29:
            r6 = move-exception
            goto L76
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r7)
            r6.getClass()     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            i30.g r7 = new i30.g     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            r2 = 1
            r7.<init>(r6, r2)     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            r5.f25426a = r7     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            n7.s r7 = r5.f25427b     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            r0.l = r3     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            java.lang.Object r7 = i30.g.c(r6, r7, r0)     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            if (r7 != r1) goto L4b
            return r1
        L4b:
            n7.t r7 = (n7.t) r7     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            c5.b r6 = r7.f30683a     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            boolean r7 = r6 instanceof n7.q     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            if (r7 == 0) goto L56
            n7.q r6 = (n7.q) r6     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L75
            java.lang.Object r7 = r6.f7113a     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            java.lang.String r0 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            if (r7 == 0) goto L75
            jv.h r7 = new jv.h     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            java.lang.Object r6 = r6.f7114b     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            i10.c r6 = a70.a.a(r6)     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            java.lang.String r6 = r6.f22780c     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            r7.<init>(r6)     // Catch: java.lang.Exception -> L29 androidx.credentials.exceptions.GetCredentialCancellationException -> L7c
            return r7
        L75:
            return r4
        L76:
            mv.m0 r7 = sa0.a.f38953a
            r7.d(r6)
            goto L7e
        L7c:
            jv.f r4 = jv.f.f25428a
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.e.b(androidx.fragment.app.o0, z70.c):java.lang.Object");
    }
}
