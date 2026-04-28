package pd;

import coil3.network.HttpException;
import com.braze.h2;
import ia0.a0;
import ia0.d0;
import java.io.IOException;
import kotlin.collections.x0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements kd.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.o f34699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f34700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f34701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70.j f34702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70.g f34703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70.j f34704g;

    public o(String str, td.o oVar, u70.t tVar, u70.t tVar2, u70.t tVar3, u70.g gVar, u70.t tVar4) {
        this.f34698a = str;
        this.f34699b = oVar;
        this.f34700c = tVar;
        this.f34701d = tVar2;
        this.f34702e = tVar3;
        this.f34703f = gVar;
        this.f34704g = tVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01af, code lost:
    
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: Exception -> 0x00ea, TryCatch #2 {Exception -> 0x00ea, blocks: (B:60:0x0125, B:62:0x012b, B:41:0x009f, B:43:0x00a8, B:45:0x00b6, B:54:0x00ee, B:56:0x00fa, B:48:0x00cc, B:50:0x00d6, B:66:0x014a, B:67:0x0151), top: B:96:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b A[Catch: Exception -> 0x00ea, TryCatch #2 {Exception -> 0x00ea, blocks: (B:60:0x0125, B:62:0x012b, B:41:0x009f, B:43:0x00a8, B:45:0x00b6, B:54:0x00ee, B:56:0x00fa, B:48:0x00cc, B:50:0x00d6, B:66:0x014a, B:67:0x0151), top: B:96:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:15:0x0038, B:83:0x01b2, B:22:0x0048, B:78:0x0190, B:80:0x0194, B:68:0x0152, B:70:0x015a, B:73:0x0169, B:74:0x016e, B:75:0x016f), top: B:93:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11, types: [T, pd.r] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(pd.o r17, x70.c r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.o.b(pd.o, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pd.o r4, pd.s r5, z70.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof pd.m
            if (r0 == 0) goto L16
            r0 = r6
            pd.m r0 = (pd.m) r0
            int r1 = r0.f34692m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f34692m = r1
            goto L1b
        L16:
            pd.m r0 = new pd.m
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f34691k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f34692m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ia0.g r5 = r0.f34690j
            ba0.g.M(r6)
            goto L4a
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L33:
            ba0.g.M(r6)
            ia0.g r6 = new ia0.g
            r6.<init>()
            r0.f34690j = r6
            r0.f34692m = r3
            ia0.i r5 = r5.f34717a
            r5.j0(r6)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            if (r5 != r1) goto L49
            return r1
        L49:
            r5 = r6
        L4a:
            ia0.m r4 = r4.e()
            id.t r6 = new id.t
            r0 = 0
            r6.<init>(r5, r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.o.c(pd.o, pd.s, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(pd.o r22, jd.g r23, pd.r r24, pd.r r25, z70.c r26) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.o.d(pd.o, jd.g, pd.r, pd.r, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lc
            java.lang.String r1 = "text/plain"
            r2 = 0
            boolean r1 = kotlin.text.y.p(r4, r1, r2)
            if (r1 == 0) goto L53
        Lc:
            boolean r1 = kotlin.text.StringsKt.H(r3)
            if (r1 == 0) goto L14
        L12:
            r1 = r0
            goto L50
        L14:
            r1 = 35
            java.lang.String r3 = kotlin.text.StringsKt.a0(r3, r1)
            r1 = 63
            java.lang.String r3 = kotlin.text.StringsKt.a0(r3, r1)
            r1 = 47
            java.lang.String r3 = kotlin.text.StringsKt.W(r1, r3, r3)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r3 = kotlin.text.StringsKt.W(r1, r3, r2)
            boolean r1 = kotlin.text.StringsKt.H(r3)
            if (r1 == 0) goto L35
            goto L12
        L35:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            v70.i r1 = ae.l.f1258a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L50
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)
        L50:
            if (r1 == 0) goto L53
            return r1
        L53:
            if (r4 == 0) goto L5c
            r3 = 59
            java.lang.String r3 = kotlin.text.StringsKt.Y(r4, r3)
            return r3
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.o.f(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void h(r rVar) {
        int i11 = rVar.f34711a;
        if ((200 > i11 || i11 >= 300) && i11 != 304) {
            throw new HttpException(j4.s.f(i11, "HTTP "));
        }
    }

    @Override // kd.i
    public final Object a(ld.e eVar) {
        t tVar = (t) this.f34704g.getValue();
        String str = this.f34699b.f40034e;
        al.d dVar = new al.d(1, this, o.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 22);
        tVar.getClass();
        return dVar.invoke(eVar);
    }

    public final ia0.m e() {
        ia0.m mVar;
        jd.h hVar = (jd.h) this.f34701d.getValue();
        return (hVar == null || (mVar = hVar.f24985a) == null) ? this.f34699b.f40035f : mVar;
    }

    public final q g() {
        fd.j jVar = h.f34673b;
        td.o oVar = this.f34699b;
        p pVar = (p) fd.o.f(oVar, jVar);
        pVar.getClass();
        jb.l lVar = new jb.l(pVar);
        td.b bVar = oVar.f40037h;
        boolean zA = bVar.a();
        boolean z11 = oVar.f40038i.a() && ((e) this.f34703f.f40837a).b();
        if (!z11 && zA) {
            lVar.c("only-if-cached, max-stale=2147483647");
        } else if (!z11 || zA) {
            if (!z11 && !zA) {
                lVar.c("no-cache, only-if-cached");
            }
        } else if (bVar.c()) {
            lVar.c("no-cache");
        } else {
            lVar.c("no-cache, no-store");
        }
        String str = (String) fd.o.f(oVar, h.f34672a);
        p pVar2 = new p(x0.k(lVar.f24902a));
        if (fd.o.f(oVar, h.f34674c) == null) {
            return new q(this.f34698a, str, pVar2, oVar.f40039j);
        }
        org.bouncycastle.jce.provider.a.c();
        return null;
    }

    public final id.q i(jd.g gVar) {
        jd.c cVar = gVar.f24984a;
        if (cVar.f24963b) {
            h2.b("snapshot is closed");
            return null;
        }
        a0 a0Var = (a0) cVar.f24962a.f24955c.get(1);
        ia0.m mVarE = e();
        String str = this.f34699b.f40034e;
        if (str == null) {
            str = this.f34698a;
        }
        return nx.d.e(a0Var, mVarE, str, gVar, 16);
    }

    public final r j(jd.g gVar) throws Throwable {
        Throwable th2;
        r rVarK;
        try {
            ia0.m mVarE = e();
            jd.c cVar = gVar.f24984a;
            if (cVar.f24963b) {
                throw new IllegalStateException("snapshot is closed");
            }
            d0 d0VarC = ia0.b.c(mVarE.J((a0) cVar.f24962a.f24955c.get(0)));
            try {
                rVarK = f0.K(d0VarC);
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
                rVarK = null;
            }
            if (th2 == null) {
                return rVarK;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }
}
