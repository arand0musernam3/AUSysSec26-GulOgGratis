package a0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import b0.d2;
import b0.e1;
import b0.e3;
import b0.f1;
import b0.g2;
import b0.k3;
import b0.l;
import b0.l1;
import b0.l3;
import b0.m1;
import b0.n;
import b0.n3;
import b0.o1;
import b0.w1;
import com.braze.h2;
import dn.k;
import e0.b0;
import e0.q1;
import e0.r;
import e0.v;
import f0.d0;
import f0.k2;
import f0.n1;
import f0.p;
import f0.p0;
import f0.q;
import f0.q3;
import f0.s;
import f0.v0;
import f0.v2;
import h0.m;
import i0.h0;
import i0.y;
import j0.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.LongCompanionObject;
import lh.e0;
import o00.x0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import s0.f0;
import s0.g0;
import s0.y0;
import v80.a0;
import v80.i1;
import v80.x;
import w.c0;
import w.o;
import w.s0;
import w.t0;
import w2.z;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19d;

    public /* synthetic */ b(Object obj, Object obj2, int i11, int i12) {
        this.f16a = i12;
        this.f18c = obj;
        this.f19d = obj2;
        this.f17b = i11;
    }

    @Override // t70.a
    public final Object get() {
        Object jVar;
        Object bVar;
        Object h0Var;
        int i11 = 1;
        switch (this.f16a) {
            case 0:
                a aVar = (a) this.f18c;
                c cVar = (c) this.f19d;
                int i12 = this.f17b;
                switch (i12) {
                    case 0:
                        a50.c cVar2 = cVar.f20a;
                        cVar2.getClass();
                        jVar = new w.j(cVar2, (e3) cVar.H.get(), (g0) cVar.F.get(), (f0) cVar.I.get(), (k3) cVar.f30k.get(), (o) cVar.f43y.get());
                        break;
                    case 1:
                        q2 q2Var = aVar.f14a;
                        q2 q2Var2 = aVar.f14a;
                        b0 b0Var = (b0) q2Var.f48335c;
                        x0.o(b0Var);
                        w.e eVar = (w.e) q2Var2.f48337e;
                        x0.o(eVar);
                        z zVar = new z(i11, aVar, cVar);
                        s0 s0Var = (s0) cVar.f25f.get();
                        o1 o1Var = (o1) cVar.f32n.get();
                        ax.g0 g0Var = new ax.g0(4);
                        g0Var.b(cVar.f34p.get());
                        g0Var.b(cVar.f36r.get());
                        g0Var.b(cVar.f37s.get());
                        g0Var.b(cVar.l.get());
                        g0Var.b(cVar.f38t.get());
                        g0Var.b(cVar.f35q.get());
                        g0Var.b(cVar.f32n.get());
                        g0Var.b(cVar.f39u.get());
                        g0Var.b(cVar.f40v.get());
                        ArrayList arrayList = g0Var.f4909a;
                        Set setSingleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                        d0.a aVar2 = (d0.a) cVar.f42x.get();
                        o oVar = (o) cVar.f43y.get();
                        ag.d dVar = cVar.f44z;
                        s70.c cVar3 = cVar.f30k;
                        s70.c cVar4 = cVar.F;
                        y0 y0Var = (y0) cVar.D.get();
                        n nVar = (n) cVar.f24e.get();
                        m0.z zVar2 = (m0.z) q2Var2.f48338f;
                        l lVar = (l) cVar.G.get();
                        Context context = (Context) q2Var2.f48333a;
                        x0.o(context);
                        Context context2 = (Context) q2Var2.f48333a;
                        x0.o(context2);
                        return new e3(b0Var, eVar, zVar, s0Var, o1Var, setSingleton, aVar2, oVar, dVar, cVar3, cVar4, y0Var, nVar, zVar2, lVar, context, e1.f5134g.a(context2));
                    case 2:
                        n nVar2 = (n) cVar.f24e.get();
                        nVar2.getClass();
                        return new t0(nVar2);
                    case 3:
                        a50.c cVar5 = cVar.f20a;
                        cVar5.getClass();
                        return new n(cVar5, (v) cVar.f23d.get());
                    case 4:
                        b0 b0Var2 = (b0) aVar.f14a.f48335c;
                        x0.o(b0Var2);
                        a50.c cVar6 = cVar.f20a;
                        cVar6.getClass();
                        try {
                            return j0.b.b(b0Var2.b(), (String) cVar6.f822b);
                        } catch (DoNotDisturbException unused) {
                            if (!wd.a.B(6, "CXCP")) {
                                return null;
                            }
                            Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                            return null;
                        }
                    case 5:
                        return new o1((v) cVar.f23d.get(), (w1) cVar.l.get(), (k3) cVar.f30k.get(), (b0.x0) cVar.f31m.get());
                    case 6:
                        n nVar3 = (n) cVar.f24e.get();
                        y.b bVar2 = (y.b) cVar.f29j.get();
                        bVar2.getClass();
                        return new w1(nVar3, (y.c.a().b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !bVar2.a().a(ImageCaptureFailWithAutoFlashQuirk.class)) ? z.a.f46351d : z.a.f46349b, (k3) cVar.f30k.get());
                    case 7:
                        return new y.b((v) cVar.f23d.get(), (x.i) cVar.f28i.get());
                    case 8:
                        return new x.i((StreamConfigurationMap) cVar.f26g.get(), (z.f) cVar.f27h.get());
                    case 9:
                        v vVar = (v) cVar.f23d.get();
                        if (vVar == null) {
                            return null;
                        }
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key.getClass();
                        return (StreamConfigurationMap) ((f0.t0) vVar).c(key);
                    case 10:
                        v vVar2 = (v) cVar.f23d.get();
                        return new z.f(vVar2);
                    case 11:
                        a50.c cVar7 = cVar.f20a;
                        cVar7.getClass();
                        s0.f fVar = (s0.f) aVar.f14a.f48334b;
                        x0.o(fVar);
                        Executor executor = fVar.f38326a;
                        executor.getClass();
                        x xVarQ = v80.f0.q(executor);
                        jVar = new k3(v80.f0.b(kotlin.coroutines.e.c(v80.f0.d(), xVarQ).plus(new a0("CXCP-UseCase-" + ((String) cVar7.f822b)))), executor, xVarQ);
                        break;
                    case 12:
                        return new b0.x0();
                    case 13:
                        return new f1((x.g) cVar.f33o.get());
                    case 14:
                        return new x.g((n) cVar.f24e.get(), (k3) cVar.f30k.get(), (b0.x0) cVar.f31m.get());
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        n nVar4 = (n) cVar.f24e.get();
                        w1 w1Var = (w1) cVar.l.get();
                        k3 k3Var = (k3) cVar.f30k.get();
                        g2 g2Var = (g2) cVar.f35q.get();
                        y.b bVar3 = (y.b) cVar.f29j.get();
                        bVar3.getClass();
                        return new l1(nVar4, w1Var, k3Var, g2Var, bVar3.a().a(TorchFlashRequiredFor3aUpdateQuirk.class) ? z.a.f46357j : z.a.f46355h);
                    case 16:
                        return new g2((n) cVar.f24e.get(), (w1) cVar.l.get(), (k3) cVar.f30k.get());
                    case 17:
                        n nVar5 = (n) cVar.f24e.get();
                        y.b bVar4 = (y.b) cVar.f29j.get();
                        bVar4.getClass();
                        jVar = new m1(nVar5, bVar4.a().a(AfRegionFlipHorizontallyQuirk.class) ? z.a.f46350c : z.a.f46353f, (w1) cVar.l.get(), (k3) cVar.f30k.get(), cVar.b());
                        break;
                    case 18:
                        return new d2((l1) cVar.f36r.get(), (k3) cVar.f30k.get());
                    case 19:
                        return new l3();
                    case 20:
                        return new n3(cVar.b());
                    case 21:
                        x.a aVar3 = (x.a) cVar.f41w.get();
                        k3 k3Var2 = (k3) cVar.f30k.get();
                        b0.x0 x0Var = (b0.x0) cVar.f31m.get();
                        aVar3.getClass();
                        k3Var2.getClass();
                        x0Var.getClass();
                        jVar = new d0.a(aVar3, k3Var2, x0Var);
                        break;
                    case 22:
                        return new x.a();
                    case 23:
                        return new o();
                    case 24:
                        n nVar6 = (n) cVar.f24e.get();
                        a50.c cVar8 = cVar.f20a;
                        cVar8.getClass();
                        return new w.h(nVar6, cVar8, (o) cVar.f43y.get(), (w.d) cVar.A.get(), (b0.j) cVar.B.get(), (m1) cVar.f37s.get(), (y.b) cVar.f29j.get(), (y0) cVar.D.get(), (x.i) cVar.f28i.get(), (c0.e) cVar.E.get(), cVar.f21b);
                    case 25:
                        n3 n3Var = (n3) cVar.f40v.get();
                        f1 f1Var = (f1) cVar.f34p.get();
                        g2 g2Var2 = (g2) cVar.f35q.get();
                        o1 o1Var2 = (o1) cVar.f32n.get();
                        n3Var.getClass();
                        f1Var.getClass();
                        g2Var2.getClass();
                        o1Var2.getClass();
                        return new w.d();
                    case 26:
                        return new b0.j();
                    case 27:
                        String str = (String) cVar.C.get();
                        y.b bVar5 = (y.b) cVar.f29j.get();
                        str.getClass();
                        bVar5.getClass();
                        return new c0(str, bVar5.a());
                    case 28:
                        a50.c cVar9 = cVar.f20a;
                        cVar9.getClass();
                        String str2 = (String) cVar9.f822b;
                        x0.o(str2);
                        return str2;
                    case 29:
                        return new c0.e(aVar.a());
                    case 30:
                        b0.j jVar2 = (b0.j) cVar.B.get();
                        b0.x0 x0Var2 = (b0.x0) cVar.f31m.get();
                        a50.c cVar10 = cVar.f20a;
                        cVar10.getClass();
                        y.b bVar6 = (y.b) cVar.f29j.get();
                        s0 s0Var2 = (s0) cVar.f25f.get();
                        z.j jVarA = cVar.a();
                        v vVar3 = (v) cVar.f23d.get();
                        q2 q2Var3 = aVar.f14a;
                        m0.z zVar3 = (m0.z) q2Var3.f48338f;
                        z zVar4 = (z) q2Var3.f48336d;
                        x0.o(zVar4);
                        return new l(jVar2, x0Var2, cVar10, bVar6, s0Var2, jVarA, vVar3, zVar3, zVar4);
                    case BERTags.DATE /* 31 */:
                        return new w.c((n) cVar.f24e.get(), (f1) cVar.f34p.get(), (l1) cVar.f36r.get(), (m1) cVar.f37s.get(), (d2) cVar.f38t.get(), (g2) cVar.f35q.get(), (o1) cVar.f32n.get(), (n3) cVar.f40v.get(), (s0) cVar.f25f.get(), (d0.a) cVar.f42x.get(), (e3) cVar.H.get(), (k3) cVar.f30k.get(), (l3) cVar.f39u.get());
                    default:
                        throw new AssertionError(i12);
                }
                return jVar;
            case 1:
                ag.i iVar = (ag.i) this.f18c;
                int i13 = this.f17b;
                if (i13 == 0) {
                    return new o70.i();
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new AssertionError(i13);
                    }
                    jt.i iVar2 = (jt.i) iVar.f1335n.get();
                    iVar2.getClass();
                    return new mh.a((mh.b) ((jt.h) iVar2).b(mh.b.class, jt.c.DEFAULT));
                }
                Context context3 = iVar.f1310b.f27469a;
                mh.a aVar4 = (mh.a) ((ag.c) this.f19d).f1294d.get();
                ft.j jVar3 = (ft.j) iVar.f1352w.get();
                e0 e0Var = (e0) iVar.A0.get();
                aVar4.getClass();
                jVar3.getClass();
                e0Var.getClass();
                return new nh.b(context3, aVar4, jVar3, e0Var);
            case 2:
                g0.e eVar2 = (g0.e) this.f18c;
                g0.c cVar11 = (g0.c) this.f19d;
                q2 q2Var4 = (q2) cVar11.f17998a;
                int i14 = this.f17b;
                switch (i14) {
                    case 0:
                        v80.b0 b0Var3 = (v80.b0) ((s70.c) cVar11.f18000c).get();
                        h0.n nVar7 = (h0.n) eVar2.f18032f.get();
                        q1 q1Var = (q1) eVar2.f18040o.get();
                        e0.n nVar8 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar8);
                        i0.v vVar4 = (i0.v) q2Var4.f48335c;
                        h0 h0Var2 = (h0) q2Var4.f48337e;
                        v0 v0Var = (v0) ((s70.c) cVar11.f18001d).get();
                        k2 k2Var = (k2) ((s70.c) cVar11.f18002e).get();
                        g0.e eVar3 = (g0.e) cVar11.f17999b;
                        h0.n nVar9 = (h0.n) eVar3.f18032f.get();
                        e0.n nVar10 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar10);
                        i0.g0 g0Var2 = (i0.g0) q2Var4.f48336d;
                        n1 n1Var = (n1) eVar3.f18041p.get();
                        q1 q1Var2 = (q1) eVar3.f18040o.get();
                        nVar9.getClass();
                        nVar10.getClass();
                        n1Var.getClass();
                        q1Var2.getClass();
                        androidx.lifecycle.n1 n1Var2 = new androidx.lifecycle.n1();
                        n1Var2.f3499a = nVar9;
                        n1Var2.f3500b = nVar10;
                        n1Var2.f3501c = g0Var2;
                        n1Var2.f3502d = n1Var;
                        n1Var2.f3503e = q1Var2;
                        return new p0(b0Var3, nVar7, q1Var, nVar8, vVar4, h0Var2, v0Var, k2Var, n1Var2, (q3) eVar2.f18046u.get(), (e0.h0) eVar2.f18051z.get(), (n1) eVar2.f18041p.get(), (m) eVar2.f18038m.get(), (r) q2Var4.f48333a, (f0.g0) q2Var4.f48338f, (i0.g0) q2Var4.f48336d, (v2) eVar2.A.get());
                    case 1:
                        h0.n nVar11 = (h0.n) eVar2.f18032f.get();
                        i1 i1Var = (i1) eVar2.f18030d.get();
                        nVar11.getClass();
                        i1Var.getClass();
                        return v80.f0.b(kotlin.coroutines.e.c(new v80.d2(i1Var), nVar11.f20988h.plus(new a0("CXCP-Camera2Controller"))));
                    case 2:
                        s70.c cVar12 = eVar2.f18033g;
                        h0.n nVar12 = (h0.n) eVar2.f18032f.get();
                        e0.n nVar13 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar13);
                        i1 i1Var2 = (i1) eVar2.f18030d.get();
                        cVar12.getClass();
                        nVar12.getClass();
                        i1Var2.getClass();
                        return new v0(cVar12, nVar12, nVar13.f15369a, i1Var2);
                    case 3:
                        b bVar7 = (b) cVar11.f18004g;
                        b bVar8 = (b) cVar11.f18005h;
                        b bVar9 = (b) cVar11.f18006i;
                        b bVar10 = (b) cVar11.f18007j;
                        b bVar11 = (b) cVar11.f18008k;
                        e0.n nVar14 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar14);
                        bVar7.getClass();
                        bVar8.getClass();
                        bVar9.getClass();
                        bVar10.getClass();
                        bVar11.getClass();
                        int i15 = nVar14.f15376h;
                        if (i15 != 2) {
                            return Build.VERSION.SDK_INT >= 28 ? (k2) bVar10.get() : i15 == 1 ? (k2) bVar8.get() : (k2) bVar9.get();
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            return (k2) bVar11.get();
                        }
                        h2.b("Cannot use Extension sessions below Android S");
                        return null;
                    case 4:
                        h0.n nVar15 = (h0.n) eVar2.f18032f.get();
                        i0.g0 g0Var3 = (i0.g0) q2Var4.f48336d;
                        e0.n nVar16 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar16);
                        return new q(nVar15, g0Var3, nVar16, 0);
                    case 5:
                        return new p((i0.g0) q2Var4.f48336d, (h0.n) eVar2.f18032f.get());
                    case 6:
                        h0.n nVar17 = (h0.n) eVar2.f18032f.get();
                        i0.g0 g0Var4 = (i0.g0) q2Var4.f48336d;
                        e0.n nVar18 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar18);
                        return new q(nVar17, g0Var4, nVar18, 1);
                    case 7:
                        h0.n nVar19 = (h0.n) eVar2.f18032f.get();
                        e0.n nVar20 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar20);
                        return new s(nVar19, nVar20, (i0.g0) q2Var4.f48336d);
                    case 8:
                        h0.n nVar21 = (h0.n) eVar2.f18032f.get();
                        e0.n nVar22 = (e0.n) q2Var4.f48334b;
                        x0.o(nVar22);
                        return new f0.l(nVar21, nVar22, (i0.g0) q2Var4.f48336d, (f0.l1) eVar2.f18039n.get(), (q1) eVar2.f18040o.get());
                    default:
                        throw new AssertionError(i14);
                }
            default:
                int i16 = this.f17b;
                switch (i16) {
                    case 0:
                        e0.n nVar23 = (e0.n) ((g0.d) this.f19d).f18009a.f15018b;
                        x0.o(nVar23);
                        v vVar5 = (v) ((g0.d) this.f19d).f18011c.get();
                        i0.v vVar6 = (i0.v) ((g0.d) this.f19d).f18013e.get();
                        i0.v vVar7 = (i0.v) ((g0.d) this.f19d).f18013e.get();
                        i0.g0 g0Var5 = (i0.g0) ((g0.d) this.f19d).f18014f.get();
                        h0 h0Var3 = (h0) ((g0.d) this.f19d).f18016h.get();
                        e0.j jVar4 = (e0.j) ((g0.d) this.f19d).f18015g.get();
                        j0.o oVar2 = (j0.o) ((g0.d) this.f19d).f18019k.get();
                        j0.n nVar24 = (j0.n) ((g0.d) this.f19d).f18017i.get();
                        d0 d0Var = (d0) ((g0.e) this.f18c).f18043r.get();
                        g0.d dVar2 = (g0.d) this.f19d;
                        bVar = new i0.b(nVar23, vVar5, vVar6, vVar7, g0Var5, h0Var3, jVar4, oVar2, nVar24, d0Var, (r) dVar2.f18009a.f15019c, (j0.c) dVar2.f18022o.get(), (j0.d) ((g0.d) this.f19d).f18023p.get(), (w) ((g0.d) this.f19d).f18020m.get(), (v80.b0) ((g0.d) this.f19d).f18021n.get(), (i0.h) ((g0.d) this.f19d).f18025r.get());
                        return bVar;
                    case 1:
                        e0.n nVar25 = (e0.n) ((g0.d) this.f19d).f18009a.f15018b;
                        x0.o(nVar25);
                        e0.e eVar4 = (e0.e) ((g0.d) this.f19d).f18010b.get();
                        eVar4.getClass();
                        String str3 = nVar25.f15369a;
                        str3.getClass();
                        return ((f0.g0) eVar4).f16676c.d(str3);
                    case 2:
                        j0.a aVar5 = (j0.a) ((g0.e) this.f18c).f18048w.get();
                        x0.o((e0.n) ((g0.d) this.f19d).f18009a.f15018b);
                        g0.b bVar12 = (g0.b) ((g0.e) this.f18c).f18050y.get();
                        aVar5.getClass();
                        bVar12.getClass();
                        e0.e eVar5 = aVar5.f24281d;
                        x0.o(eVar5);
                        return eVar5;
                    case 3:
                        h0.n nVar26 = (h0.n) ((g0.e) this.f18c).f18032f.get();
                        k kVar = ((g0.d) this.f19d).f18009a;
                        r rVar = (r) kVar.f15019c;
                        e0.n nVar27 = (e0.n) kVar.f15018b;
                        x0.o(nVar27);
                        bVar = new i0.v(nVar26, rVar, nVar27, (i0.z) ((g0.d) this.f19d).f18012d.get(), (List) ((g0.d) this.f19d).l.get(), (n1) ((g0.e) this.f18c).f18041p.get());
                        return bVar;
                    case 4:
                        return new i0.z();
                    case 5:
                        e0.n nVar28 = (e0.n) ((g0.d) this.f19d).f18009a.f15018b;
                        x0.o(nVar28);
                        i0.z zVar5 = (i0.z) ((g0.d) this.f19d).f18012d.get();
                        j0.o oVar3 = (j0.o) ((g0.d) this.f19d).f18019k.get();
                        zVar5.getClass();
                        oVar3.getClass();
                        ArrayList arrayListJ = kotlin.collections.d0.j(zVar5);
                        arrayListJ.add(zVar5);
                        arrayListJ.add(oVar3);
                        arrayListJ.addAll(nVar28.f15379k);
                        h0Var = arrayListJ;
                        return h0Var;
                    case 6:
                        i0.g0 g0Var6 = (i0.g0) ((g0.d) this.f19d).f18014f.get();
                        j0.n nVar29 = (j0.n) ((g0.d) this.f19d).f18017i.get();
                        v vVar8 = (v) ((g0.d) this.f19d).f18011c.get();
                        h0.l lVar2 = (h0.l) ((g0.d) this.f19d).f18018j.get();
                        g0Var6.getClass();
                        nVar29.getClass();
                        vVar8.getClass();
                        lVar2.getClass();
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                        key2.getClass();
                        Integer num = (Integer) ((f0.t0) vVar8).c(key2);
                        if (num != null) {
                            num.intValue();
                        }
                        return new j0.o(g0Var6, nVar29);
                    case 7:
                        v vVar9 = (v) ((g0.d) this.f19d).f18011c.get();
                        e0.n nVar30 = (e0.n) ((g0.d) this.f19d).f18009a.f15018b;
                        x0.o(nVar30);
                        ((h0.n) ((g0.e) this.f18c).f18032f.get()).getClass();
                        return new i0.g0(vVar9, nVar30, new n20.f(27), ((g0.d) this.f19d).f18015g);
                    case 8:
                        k kVar2 = ((g0.d) this.f19d).f18009a;
                        r rVar2 = (r) kVar2.f15019c;
                        e0.n nVar31 = (e0.n) kVar2.f15018b;
                        x0.o(nVar31);
                        e0.e eVar6 = (e0.e) ((g0.d) this.f19d).f18010b.get();
                        g0.b bVar13 = (g0.b) ((g0.e) this.f18c).f18050y.get();
                        i0.v vVar10 = (i0.v) ((g0.d) this.f19d).f18013e.get();
                        i0.g0 g0Var7 = (i0.g0) ((g0.d) this.f19d).f18014f.get();
                        h0 h0Var4 = (h0) ((g0.d) this.f19d).f18016h.get();
                        eVar6.getClass();
                        bVar13.getClass();
                        vVar10.getClass();
                        g0Var7.getClass();
                        h0Var4.getClass();
                        f0.g0 g0Var8 = (f0.g0) eVar6;
                        lz.i iVar3 = g0Var8.f16678e;
                        nVar31.getClass();
                        q2 q2Var5 = new q2();
                        q2Var5.f48333a = rVar2;
                        q2Var5.f48334b = nVar31;
                        q2Var5.f48335c = vVar10;
                        q2Var5.f48336d = g0Var7;
                        q2Var5.f48337e = h0Var4;
                        q2Var5.f48338f = g0Var8;
                        e0.j jVar5 = (e0.j) ((s70.c) new g0.c((g0.e) iVar3.f28446b, q2Var5).f18003f).get();
                        synchronized (g0Var8.f16679f) {
                            g0Var8.f16680g.add(jVar5);
                        }
                        x0.o(jVar5);
                        return jVar5;
                    case 9:
                        i0.g0 g0Var9 = (i0.g0) ((g0.d) this.f19d).f18014f.get();
                        ag.d dVar3 = ((g0.d) this.f19d).f18015g;
                        e0.h0 h0Var5 = (e0.h0) ((g0.e) this.f18c).f18051z.get();
                        g0Var9.getClass();
                        dVar3.getClass();
                        h0Var5.getClass();
                        h0Var = new h0(g0Var9, dVar3, h0Var5, g0Var9.f22656e);
                        return h0Var;
                    case 10:
                        return new j0.n();
                    case 11:
                        long j9 = LongCompanionObject.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        for (int i17 = 0; i17 < 3; i17++) {
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            if (jElapsedRealtimeNanos2 < j11) {
                                j11 = jElapsedRealtimeNanos2;
                            }
                        }
                        for (int i18 = 0; i18 < 3; i18++) {
                            long jNanoTime = System.nanoTime();
                            SystemClock.elapsedRealtimeNanos();
                            long jNanoTime2 = System.nanoTime();
                            long j12 = jNanoTime2 - jNanoTime;
                            if (j12 < j9) {
                                long j13 = (jNanoTime + jNanoTime2) / ((long) 2);
                                j9 = j12;
                            }
                        }
                        return new h0.l();
                    case 12:
                        return new j0.c((w) ((g0.d) this.f19d).f18020m.get(), (i0.v) ((g0.d) this.f19d).f18013e.get(), (v80.b0) ((g0.d) this.f19d).f18021n.get());
                    case 13:
                        return new w();
                    case 14:
                        h0.n nVar32 = (h0.n) ((g0.e) this.f18c).f18032f.get();
                        i1 i1Var3 = (i1) ((g0.e) this.f18c).f18030d.get();
                        nVar32.getClass();
                        i1Var3.getClass();
                        return v80.f0.b(kotlin.coroutines.e.c(new v80.d2(i1Var3), nVar32.f20988h.plus(new a0("CXCP-Graph"))));
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        return new j0.d((w) ((g0.d) this.f19d).f18020m.get(), (i0.v) ((g0.d) this.f19d).f18013e.get(), (v80.b0) ((g0.d) this.f19d).f18021n.get());
                    case 16:
                        return new i0.h((i0.v) ((g0.d) this.f19d).f18013e.get(), (v) ((g0.d) this.f19d).f18011c.get(), (y) ((g0.d) this.f19d).f18024q.get(), (i0.z) ((g0.d) this.f19d).f18012d.get());
                    case 17:
                        return new y();
                    default:
                        throw new AssertionError(i16);
                }
        }
    }
}
