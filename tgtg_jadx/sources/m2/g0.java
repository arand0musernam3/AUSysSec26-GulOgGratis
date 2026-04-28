package m2;

import a3.c3;
import a3.d3;
import a3.e3;
import a3.g3;
import a3.l3;
import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f28857a = new u3.d(new ii.m(23), false, 759698998);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f28858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w4.a f28859c;

    static {
        new u3.d(new ii.m(24), false, 486633673);
        f28858b = new q();
        f28859c = new w4.a(1022);
    }

    public static final boolean A(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static final void B(e1 e1Var, r5.y yVar, r5.s sVar) {
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            a2 a2VarD = e1Var.d();
            if (a2VarD == null) {
                return;
            }
            r5.d0 d0Var = e1Var.f28822e;
            if (d0Var == null) {
                return;
            }
            z4.z zVarC = e1Var.c();
            if (zVarC == null) {
                return;
            }
            n1.a(yVar, e1Var.f28818a, a2VarD.f28762a, zVarC, d0Var, e1Var.b(), sVar);
        } finally {
            z3.v.f(gVarC, gVarD, function1E);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, r5.d0] */
    public static final void C(r5.z zVar, e1 e1Var, r5.y yVar, r5.m mVar, r5.s sVar) {
        r5.h hVar = e1Var.f28821d;
        j0 j0Var = e1Var.f28838v;
        j0 j0Var2 = e1Var.f28839w;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        h0 h0Var = new h0(hVar, j0Var, objectRef, 2);
        r5.t tVar = zVar.f37717a;
        tVar.d(yVar, mVar, h0Var, j0Var2);
        ?? d0Var = new r5.d0(zVar, tVar);
        zVar.f37718b.set(d0Var);
        objectRef.element = d0Var;
        e1Var.f28822e = d0Var;
        B(e1Var, yVar, sVar);
    }

    public static final void D(o2.a aVar, Resources resources, j1 j1Var, boolean z11, Function1 function1) {
        if (z11) {
            aVar.f31809a.g(new p2.d(j1Var.c(), resources.getString(j1Var.d()), j1Var.a(), function1));
        }
    }

    public static final b4.t E(b4.t tVar, m5.h hVar, m5.u0 u0Var, Function1 function1, int i11, boolean z11, int i12, int i13, q5.h hVar2, List list, Function1 function12, z2.i iVar, i4.y yVar, Function1 function13) {
        if (iVar == null) {
            return tVar.then(b4.q.f5711a).then(new z2.m(hVar, u0Var, hVar2, function1, i11, z11, i12, i13, list, function12, yVar, function13));
        }
        return tVar.then(iVar.f46861f).then(new z2.f(hVar, u0Var, hVar2, function1, i11, z11, i12, i13, list, function12, iVar, yVar));
    }

    public static final void F(int i11, int i12) {
        if (!(i11 > 0 && i12 > 0)) {
            c2.a.a("both minLines " + i11 + " and maxLines " + i12 + " must be greater than zero");
        }
        if (i11 <= i12) {
            return;
        }
        c2.a.a("minLines " + i11 + " must be less than or equal to maxLines " + i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final m5.h r26, final b4.t r27, final m5.u0 r28, final kotlin.jvm.functions.Function1 r29, final int r30, final boolean r31, final int r32, int r33, java.util.Map r34, m3.n r35, final int r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.a(m5.h, b4.t, m5.u0, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, m3.n, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024d A[Catch: RejectedExecutionException -> 0x0231, TryCatch #0 {RejectedExecutionException -> 0x0231, blocks: (B:136:0x022a, B:144:0x023b, B:146:0x024d, B:152:0x025a, B:157:0x0271, B:148:0x0253, B:140:0x0234), top: B:179:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0253 A[Catch: RejectedExecutionException -> 0x0231, TryCatch #0 {RejectedExecutionException -> 0x0231, blocks: (B:136:0x022a, B:144:0x023b, B:146:0x024d, B:152:0x025a, B:157:0x0271, B:148:0x0253, B:140:0x0234), top: B:179:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0271 A[Catch: RejectedExecutionException -> 0x0231, TRY_LEAVE, TryCatch #0 {RejectedExecutionException -> 0x0231, blocks: (B:136:0x022a, B:144:0x023b, B:146:0x024d, B:152:0x025a, B:157:0x0271, B:148:0x0253, B:140:0x0234), top: B:179:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r28, final b4.t r29, final m5.u0 r30, kotlin.jvm.functions.Function1 r31, int r32, boolean r33, final int r34, int r35, i4.y r36, m3.n r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.b(java.lang.String, b4.t, m5.u0, kotlin.jvm.functions.Function1, int, boolean, int, int, i4.y, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final m5.h r23, b4.t r24, m5.u0 r25, boolean r26, int r27, int r28, kotlin.jvm.functions.Function1 r29, final kotlin.jvm.functions.Function1 r30, m3.n r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.c(m5.h, b4.t, m5.u0, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void d(a3.j2 j2Var, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-614342087);
        int i12 = (sVar.h(j2Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.a0(-1009319487);
            x70.c cVar = null;
            r2.g.b(s2.h.d(s2.h.c(new a3.b2(j2Var, cVar, 0)), j2Var.f408g, new a3.c2(j2Var, cVar, 0), null, new a3.s0(j2Var, 1)), dVar, sVar, 48);
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.o0(j2Var, dVar, i11, 1);
        }
    }

    public static final void e(l3 l3Var, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        b4.t tVarD;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1533506138);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(l3Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.a0(-885604480);
            if (l3Var.k()) {
                x70.c cVar = null;
                int i13 = 0;
                tVarD = s2.h.d(s2.h.c(new d3(l3Var, cVar, 0)), l3Var.f470x, new a3.c2(l3Var, cVar, 1), new e3(l3Var, cVar, i13), new c3(l3Var, i13));
            } else {
                tVarD = b4.q.f5711a;
            }
            r2.g.b(tVarD, dVar, sVar, i12 & 112);
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e0(l3Var, dVar, i11, 0);
        }
    }

    public static final void f(x2.w wVar, boolean z11, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        b4.t tVarC;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1442752422);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(wVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.a0(-1299459355);
            if (z11) {
                sVar.a0(-1299415211);
                boolean zH = sVar.h(wVar);
                Object objM = sVar.M();
                if (zH || objM == m3.m.f29332a) {
                    objM = new f0(wVar, null, 0);
                    sVar.k0(objM);
                }
                tVarC = s2.h.c((Function2) objM);
                sVar.q(false);
            } else {
                sVar.a0(-1298836224);
                sVar.q(false);
                tVarC = b4.q.f5711a;
            }
            r2.g.b(tVarC, dVar, sVar, (i12 >> 3) & 112);
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d0(wVar, z11, dVar, i11, 0);
        }
    }

    public static final void g(a3.j2 j2Var, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-954926513);
        int i12 = (sVar.h(j2Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d(j2Var, dVar, sVar, i12 & 126);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.o0(j2Var, dVar, i11, 2);
        }
    }

    public static final void h(l3 l3Var, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2080741862);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(l3Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            e(l3Var, dVar, sVar, i12 & 126);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e0(l3Var, dVar, i11, 1);
        }
    }

    public static final void i(x2.w wVar, boolean z11, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-579239002);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(wVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            f(wVar, z11, dVar, sVar, i12 & 1022);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d0(wVar, z11, dVar, i11, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x043c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x058b A[PHI: r12 r26 r27
      0x058b: PHI (r12v26 r5.m) = (r12v20 r5.m), (r12v27 r5.m) binds: [B:273:0x0589, B:270:0x057a] A[DONT_GENERATE, DONT_INLINE]
      0x058b: PHI (r26v9 r5.z) = (r26v4 r5.z), (r26v11 r5.z) binds: [B:273:0x0589, B:270:0x057a] A[DONT_GENERATE, DONT_INLINE]
      0x058b: PHI (r27v4 m2.e1) = (r27v2 m2.e1), (r27v5 m2.e1) binds: [B:273:0x0589, B:270:0x057a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x065c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x085f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0918  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final r5.y r65, final kotlin.jvm.functions.Function1 r66, final b4.t r67, final m5.u0 r68, final r5.g0 r69, final kotlin.jvm.functions.Function1 r70, final b2.l r71, final i4.r r72, final boolean r73, final int r74, final int r75, final r5.m r76, final m2.c1 r77, final boolean r78, final boolean r79, final i80.n r80, m3.n r81, final int r82, final int r83) {
        /*
            Method dump skipped, instruction units count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.j(r5.y, kotlin.jvm.functions.Function1, b4.t, m5.u0, r5.g0, kotlin.jvm.functions.Function1, b2.l, i4.r, boolean, int, int, r5.m, m2.c1, boolean, boolean, i80.n, m3.n, int, int):void");
    }

    public static final void k(b4.t tVar, l3 l3Var, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2036174316);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.h(l3Var) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, true);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            h(l3Var, dVar, sVar, (i12 >> 3) & 126);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar, l3Var, dVar, i11, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fb  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, m3.b1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, m2.e2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final b4.t r31, final m5.h r32, final kotlin.jvm.functions.Function1 r33, final boolean r34, final java.util.Map r35, final m5.u0 r36, final int r37, final boolean r38, final int r39, final int r40, final q5.h r41, final z2.i r42, final kotlin.jvm.functions.Function1 r43, m3.n r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.l(b4.t, m5.h, kotlin.jvm.functions.Function1, boolean, java.util.Map, m5.u0, int, boolean, int, int, q5.h, z2.i, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void m(l3 l3Var, boolean z11, m3.n nVar, int i11) {
        a2 a2VarD;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(626339208);
        int i12 = (sVar.h(l3Var) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (z11) {
            sVar.a0(1530097388);
            e1 e1Var = l3Var.f451d;
            m5.q0 q0Var = null;
            if (e1Var != null && (a2VarD = e1Var.d()) != null) {
                m5.q0 q0Var2 = a2VarD.f28762a;
                e1 e1Var2 = l3Var.f451d;
                if (!(e1Var2 != null ? e1Var2.f28832p : true)) {
                    q0Var = q0Var2;
                }
            }
            if (q0Var == null) {
                sVar.a0(1530097387);
            } else {
                sVar.a0(1530097388);
                if (m5.t0.d(l3Var.n().f37715b)) {
                    sVar.a0(2062097806);
                } else {
                    sVar.a0(2109807302);
                    int iR = l3Var.f449b.r((int) (l3Var.n().f37715b >> 32));
                    int iR2 = l3Var.f449b.r((int) (l3Var.n().f37715b & 4294967295L));
                    x5.j jVarA = q0Var.a(iR);
                    x5.j jVarA2 = q0Var.a(Math.max(iR2 - 1, 0));
                    e1 e1Var3 = l3Var.f451d;
                    if (e1Var3 == null || !((Boolean) e1Var3.f28829m.getValue()).booleanValue()) {
                        sVar.a0(2062097806);
                    } else {
                        sVar.a0(2110225306);
                        lx.u.s(true, jVarA, l3Var, sVar, ((i12 << 6) & 896) | 6);
                    }
                    sVar.q(false);
                    e1 e1Var4 = l3Var.f451d;
                    if (e1Var4 == null || !((Boolean) e1Var4.f28830n.getValue()).booleanValue()) {
                        sVar.a0(2062097806);
                    } else {
                        sVar.a0(2110574459);
                        lx.u.s(false, jVarA2, l3Var, sVar, ((i12 << 6) & 896) | 6);
                    }
                    sVar.q(false);
                }
                sVar.q(false);
                e1 e1Var5 = l3Var.f451d;
                if (e1Var5 != null) {
                    m3.k1 k1Var = e1Var5.l;
                    if (!Intrinsics.areEqual(l3Var.f466t.f37714a.f29538b, l3Var.n().f37714a.f29538b)) {
                        k1Var.setValue(Boolean.FALSE);
                    }
                    if (e1Var5.b()) {
                        if (((Boolean) k1Var.getValue()).booleanValue()) {
                            l3Var.r();
                        } else {
                            l3Var.o();
                        }
                    }
                }
            }
            sVar.q(false);
            sVar.q(false);
        } else {
            sVar.a0(1989076778);
            sVar.q(false);
            l3Var.o();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.b(l3Var, z11, i11, 8);
        }
    }

    public static final void n(l3 l3Var, m3.n nVar, int i11) {
        m5.h hVarM;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1436003720);
        int i12 = 2;
        int i13 = (sVar.h(l3Var) ? 4 : 2) | i11;
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            e1 e1Var = l3Var.f451d;
            if (e1Var == null || !((Boolean) e1Var.f28831o.getValue()).booleanValue() || (hVarM = l3Var.m()) == null || hVarM.f29538b.length() <= 0) {
                sVar.a0(2132946858);
            } else {
                sVar.a0(-2112351432);
                boolean zF = sVar.f(l3Var);
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (zF || objM == fVar) {
                    objM = new g3(l3Var);
                    sVar.k0(objM);
                }
                l1 l1Var = (l1) objM;
                z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
                r5.s sVar2 = l3Var.f449b;
                long j9 = l3Var.n().f37715b;
                int i14 = m5.t0.f29649c;
                int iR = sVar2.r((int) (j9 >> 32));
                e1 e1Var2 = l3Var.f451d;
                a2 a2VarD = e1Var2 != null ? e1Var2.d() : null;
                a2VarD.getClass();
                m5.q0 q0Var = a2VarD.f28762a;
                h4.c cVarC = q0Var.c(n80.p.c(iR, 0, q0Var.f29617a.f29603a.f29538b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((cVar.c0(m1.f29018a) / 2) + cVarC.f21380a)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f21383d)) & 4294967295L);
                boolean zE = sVar.e(jFloatToRawIntBits);
                Object objM2 = sVar.M();
                if (zE || objM2 == fVar) {
                    objM2 = new q0(jFloatToRawIntBits);
                    sVar.k0(objM2);
                }
                a3.t tVar = (a3.t) objM2;
                boolean zH = sVar.h(l1Var) | sVar.h(l3Var);
                Object objM3 = sVar.M();
                if (zH || objM3 == fVar) {
                    objM3 = new a3.h2(i12, l1Var, l3Var);
                    sVar.k0(objM3);
                }
                b4.t tVarA = w4.h0.a(b4.q.f5711a, l1Var, (PointerInputEventHandler) objM3);
                boolean zE2 = sVar.e(jFloatToRawIntBits);
                Object objM4 = sVar.M();
                if (zE2 || objM4 == fVar) {
                    objM4 = new cg.k(jFloatToRawIntBits, 5);
                    sVar.k0(objM4);
                }
                a.a(tVar, j5.r.c(tVarA, false, (Function1) objM4), 0L, sVar, 0, 4);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(l3Var, i11, 10);
        }
    }

    public static final h4.c o(z4.l1 l1Var, int i11, r5.e0 e0Var, m5.q0 q0Var, boolean z11, int i12) {
        h4.c cVarC = q0Var != null ? q0Var.c(e0Var.f37670b.r(i11)) : h4.c.f21379e;
        float f11 = cVarC.f21380a;
        int iQ0 = l1Var.q0(m1.f29018a);
        return h4.c.b(cVarC, z11 ? (i12 - f11) - iQ0 : f11, z11 ? i12 - f11 : iQ0 + f11, 0.0f, 10);
    }

    public static final boolean p(int i11, KeyEvent keyEvent) {
        return ((int) (u4.c.b(keyEvent) >> 32)) == i11;
    }

    public static final ArrayList q(List list, Function0 function0) {
        f2 f2Var;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            z4.t0 t0Var = (z4.t0) list.get(i11);
            Object objG = t0Var.G();
            objG.getClass();
            a50.d dVar = ((g2) objG).f28862a;
            e2 e2Var = (e2) dVar.f824b;
            m5.f fVar = (m5.f) dVar.f825c;
            m5.q0 q0Var = (m5.q0) e2Var.f28843a.getValue();
            if (q0Var == null) {
                f2Var = new f2(0, 0, new lw.p(24));
            } else {
                m5.f fVarC = e2.c(fVar, q0Var);
                if (fVarC == null) {
                    f2Var = new f2(0, 0, new lw.p(25));
                } else {
                    z5.k kVarH = android.support.v4.media.session.a.H(q0Var.k(fVarC.f29530b, fVarC.f29531c).d());
                    f2Var = new f2(kVarH.d(), kVarH.b(), new b2(kVarH, 0));
                }
            }
            int i12 = f2Var.f28852b;
            int i13 = f2Var.f28853c;
            arrayList.add(new Pair(t0Var.D(y9.w.r(i12, i12, i13, i13)), (Function0) f2Var.f28854d));
        }
        return arrayList;
    }

    public static final int r(float f11) {
        return Math.round((float) Math.ceil(f11));
    }

    public static final Object s(w4.y yVar, l1 l1Var, x70.c cVar) {
        Object objN = v80.f0.n(new ao.e1(yVar, l1Var, null, 11), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public static final void t(e1 e1Var) {
        r5.d0 d0Var = e1Var.f28822e;
        if (d0Var != null) {
            e1Var.f28838v.invoke(r5.y.b(e1Var.f28821d.f37674a, null, 0L, 3));
            r5.z zVar = d0Var.f37665a;
            AtomicReference atomicReference = zVar.f37718b;
            while (true) {
                if (atomicReference.compareAndSet(d0Var, null)) {
                    zVar.f37717a.e();
                    break;
                } else if (atomicReference.get() != d0Var) {
                    break;
                }
            }
        }
        e1Var.f28822e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [j30.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int u(int r11, java.lang.String r12) {
        /*
            l8.j r0 = y()
            r1 = 0
            if (r0 == 0) goto L79
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            java.lang.String r2 = "Not initialized yet"
            pd.g.n(r2, r4)
            java.lang.String r2 = "charSequence cannot be null"
            pd.g.m(r12, r2)
            l8.f r0 = r0.f27461e
            java.lang.Object r0 = r0.f27449a
            r4 = r0
            j30.g r4 = (j30.g) r4
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L2e
            int r2 = r12.length()
            if (r11 < r2) goto L30
        L2e:
            r5 = r12
            goto L6f
        L30:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L4c
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<l8.x> r6 = l8.x.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            l8.x[] r5 = (l8.x[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L4c
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L70
        L4c:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            l8.q r10 = new l8.q
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.u(r5, r6, r7, r8, r9, r10)
            l8.q r12 = (l8.q) r12
            int r2 = r12.f27474c
            goto L70
        L6f:
            r2 = r0
        L70:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L77
            goto L7a
        L77:
            r1 = r12
            goto L7a
        L79:
            r5 = r12
        L7a:
            if (r1 == 0) goto L81
            int r11 = r1.intValue()
            return r11
        L81:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.u(int, java.lang.String):int");
    }

    public static final int v(int i11, CharSequence charSequence) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static final int w(int i11, CharSequence charSequence) {
        while (i11 > 0) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
            i11--;
        }
        return 0;
    }

    public static final int x(int i11, String str) {
        l8.j jVarY = y();
        Integer num = null;
        if (jVarY != null) {
            Integer numValueOf = Integer.valueOf(jVarY.b(Math.max(0, i11 - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }

    public static final l8.j y() {
        if (!l8.j.d()) {
            return null;
        }
        l8.j jVarA = l8.j.a();
        if (jVarA.c() == 1) {
            return jVarA;
        }
        return null;
    }

    public static final float z(m5.q0 q0Var, int i11) {
        if (i11 < 0) {
            return 0.0f;
        }
        m5.p0 p0Var = q0Var.f29617a;
        m5.r rVar = q0Var.f29618b;
        if (p0Var.f29603a.f29538b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(rVar.d(i11), Math.min(rVar.f29624b - 1, rVar.f29628f - 1));
        if (i11 > rVar.c(iMin, false)) {
            return 0.0f;
        }
        rVar.m(iMin);
        ArrayList arrayList = rVar.f29630h;
        m5.t tVar = (m5.t) arrayList.get(m5.k0.f(iMin, arrayList));
        m5.b bVar = tVar.f29641a;
        int i12 = iMin - tVar.f29644d;
        n5.i iVar = bVar.f29514d;
        return iVar.e(i12) - iVar.g(i12);
    }
}
