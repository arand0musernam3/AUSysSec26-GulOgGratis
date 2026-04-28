package tc;

import android.webkit.MimeTypeMap;
import androidx.lifecycle.n1;
import com.braze.h2;
import ia0.a0;
import ia0.d0;
import java.io.IOException;
import java.util.Map;
import kotlin.text.StringsKt;
import kotlin.text.y;
import q90.g0;
import q90.z;
import qc.p;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q90.g f39943f = new q90.g(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q90.g f39944g = new q90.g(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.n f39946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f39947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f39948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39949e;

    public m(String str, zc.n nVar, t tVar, t tVar2, boolean z11) {
        this.f39945a = str;
        this.f39946b = nVar;
        this.f39947c = tVar;
        this.f39948d = tVar2;
        this.f39949e = z11;
    }

    public static String d(String str, z zVar) {
        String strB;
        String str2 = zVar != null ? zVar.f36635a : null;
        if ((str2 == null || y.p(str2, "text/plain", false)) && (strB = ed.k.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return StringsKt.Y(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0220 A[Catch: Exception -> 0x021d, TryCatch #1 {Exception -> 0x021d, blocks: (B:92:0x01e9, B:94:0x01ef, B:96:0x0214, B:98:0x0219, B:97:0x0217, B:102:0x0220, B:103:0x0225), top: B:113:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: Exception -> 0x00d9, TRY_ENTER, TryCatch #3 {Exception -> 0x00d9, blocks: (B:104:0x0226, B:105:0x0229, B:66:0x015f, B:106:0x022a, B:107:0x022f, B:36:0x009e, B:38:0x00aa, B:47:0x00dd, B:49:0x00e1, B:52:0x00fa, B:62:0x0146, B:54:0x0112, B:56:0x011e, B:57:0x0127, B:41:0x00bf, B:43:0x00c9, B:59:0x0131, B:60:0x0138, B:61:0x0139), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139 A[Catch: Exception -> 0x00d9, TryCatch #3 {Exception -> 0x00d9, blocks: (B:104:0x0226, B:105:0x0229, B:66:0x015f, B:106:0x022a, B:107:0x022f, B:36:0x009e, B:38:0x00aa, B:47:0x00dd, B:49:0x00e1, B:52:0x00fa, B:62:0x0146, B:54:0x0112, B:56:0x011e, B:57:0x0127, B:41:0x00bf, B:43:0x00c9, B:59:0x0131, B:60:0x0138, B:61:0x0139), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[Catch: Exception -> 0x021d, TryCatch #1 {Exception -> 0x021d, blocks: (B:92:0x01e9, B:94:0x01ef, B:96:0x0214, B:98:0x0219, B:97:0x0217, B:102:0x0220, B:103:0x0225), top: B:113:0x01e9 }] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9, types: [tc.m] */
    /* JADX WARN: Type inference failed for: r17v0, types: [tc.m] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, tc.m] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [rc.g] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [rc.g] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    @Override // tc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x70.c r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.m.a(x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(q90.g0 r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tc.k
            if (r0 == 0) goto L13
            r0 = r7
            tc.k r0 = (tc.k) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            tc.k r0 = new tc.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f39936j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r7)
            goto L9c
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r7)
            android.graphics.Bitmap$Config[] r7 = ed.k.f15927a
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            r2 = 0
            u70.t r4 = r5.f39947c
            if (r7 == 0) goto L6a
            zc.n r7 = r5.f39946b
            zc.b r7 = r7.f47503o
            boolean r7 = r7.a()
            if (r7 != 0) goto L64
            java.lang.Object r7 = r4.getValue()
            q90.d0 r7 = (q90.d0) r7
            r7.getClass()
            r6.getClass()
            u90.n r0 = new u90.n
            r0.<init>(r7, r6, r2)
            q90.p0 r6 = r0.f()
            goto L9f
        L64:
            android.os.NetworkOnMainThreadException r6 = new android.os.NetworkOnMainThreadException
            r6.<init>()
            throw r6
        L6a:
            java.lang.Object r7 = r4.getValue()
            q90.d0 r7 = (q90.d0) r7
            r7.getClass()
            r6.getClass()
            u90.n r4 = new u90.n
            r4.<init>(r7, r6, r2)
            r0.l = r3
            v80.l r6 = new v80.l
            x70.c r7 = y70.f.b(r0)
            r6.<init>(r3, r7)
            r6.t()
            ao.p2 r7 = new ao.p2
            r0 = 7
            r7.<init>(r0, r4, r6)
            r4.d(r7)
            r6.v(r7)
            java.lang.Object r7 = r6.s()
            if (r7 != r1) goto L9c
            return r1
        L9c:
            r6 = r7
            q90.p0 r6 = (q90.p0) r6
        L9f:
            boolean r7 = r6.f36597q
            int r0 = r6.f36585d
            if (r7 != 0) goto Lc7
            r7 = 304(0x130, float:4.26E-43)
            if (r0 == r7) goto Lc7
            q90.r0 r7 = r6.f36588g
            if (r7 == 0) goto Lb0
            ed.k.a(r7)
        Lb0:
            coil.network.HttpException r7 = new coil.network.HttpException
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = org.bouncycastle.jcajce.provider.asymmetric.a.k(r0, r1, r2)
            java.lang.String r6 = r6.f36584c
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.m.b(q90.g0, z70.c):java.lang.Object");
    }

    public final ia0.m c() {
        Object value = this.f39948d.getValue();
        value.getClass();
        return ((rc.h) ((rc.a) value)).f37892a;
    }

    public final g0 e() {
        n1 n1Var = new n1();
        n1Var.D(this.f39945a);
        zc.n nVar = this.f39946b;
        q90.t tVar = nVar.f47499j;
        zc.b bVar = nVar.f47502n;
        tVar.getClass();
        n1Var.f3501c = tVar.e();
        for (Map.Entry entry : nVar.f47500k.f47516a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            n1Var.B((Class) key, entry.getValue());
        }
        boolean zA = bVar.a();
        boolean zA2 = nVar.f47503o.a();
        if (!zA2 && zA) {
            n1Var.h(q90.g.f36492o);
        } else if (!zA2 || zA) {
            if (!zA2 && !zA) {
                n1Var.h(f39944g);
            }
        } else if (bVar.c()) {
            n1Var.h(q90.g.f36491n);
        } else {
            n1Var.h(f39943f);
        }
        return new g0(n1Var);
    }

    public final yc.b f(rc.g gVar) throws Throwable {
        Throwable th2;
        yc.b bVar;
        try {
            ia0.m mVarC = c();
            rc.c cVar = (rc.c) gVar.f37891b;
            if (cVar.f37869b) {
                throw new IllegalStateException("snapshot is closed");
            }
            d0 d0VarC = ia0.b.c(mVarC.J((a0) cVar.f37868a.f37861c.get(0)));
            try {
                bVar = new yc.b(d0VarC);
                try {
                    d0VarC.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    d0VarC.close();
                } catch (Throwable th5) {
                    u70.e.a(th4, th5);
                }
                th2 = th4;
                bVar = null;
            }
            if (th2 == null) {
                return bVar;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final p g(rc.g gVar) {
        rc.c cVar = (rc.c) gVar.f37891b;
        if (cVar.f37869b) {
            h2.b("snapshot is closed");
            return null;
        }
        a0 a0Var = (a0) cVar.f37868a.f37861c.get(1);
        ia0.m mVarC = c();
        String str = this.f39946b.f47498i;
        if (str == null) {
            str = this.f39945a;
        }
        return new p(a0Var, mVarC, str, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rc.g h(rc.g r4, q90.g0 r5, q90.p0 r6, yc.b r7) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.m.h(rc.g, q90.g0, q90.p0, yc.b):rc.g");
    }
}
