package a0;

import ag.k;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import ao.c0;
import ao.g3;
import ao.m0;
import ao.r1;
import ao.r3;
import ao.y0;
import ao.z1;
import b0.b1;
import b0.c3;
import b0.g2;
import b0.i3;
import b0.k3;
import b0.l1;
import b0.l2;
import b0.l3;
import b0.o2;
import b0.x2;
import bm.p;
import cj.e0;
import cj.q;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.attribution.RequestError;
import et.z;
import f0.f2;
import gl.o;
import go.v;
import ii.j0;
import lh.d0;
import lh.w;
import mr.r;
import mv.u;
import nj.t;
import nk.o0;
import nk.r0;
import nk.u0;
import o00.x0;
import oq.n;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import pi.m;
import qk.l;
import ss.w0;
import ti.s;
import v80.b0;
import w.l0;
import w.s0;
import xg.x;
import xg.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f48d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f49e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f45a = i12;
        this.f47c = obj;
        this.f48d = obj2;
        this.f49e = obj3;
        this.f46b = i11;
    }

    public Object a() {
        k kVar = (k) this.f49e;
        ag.i iVar = (ag.i) this.f47c;
        int i11 = this.f46b;
        switch (i11) {
            case 0:
                return new ir.h((g3) iVar.J.get(), (lr.a) kVar.f1434x.get(), (cv.b) iVar.E.get(), (u) iVar.G.get());
            case 1:
                r40.d dVar = kVar.f1361a;
                f70.g gVar = (f70.g) iVar.f1321f0.get();
                gVar.getClass();
                return new lr.a(gVar);
            case 2:
                return new to.f((cv.b) iVar.E.get(), (kt.j) iVar.K.get());
            case 3:
                return new vo.e((cv.b) iVar.E.get(), (g3) iVar.J.get(), new qb.e());
            case 4:
                return new uo.h((g3) iVar.J.get(), (gs.a) iVar.T.get(), (so.a) kVar.B.get(), (cv.b) iVar.E.get());
            case 5:
                l50.a aVar = kVar.f1365b;
                f70.g gVar2 = (f70.g) iVar.f1321f0.get();
                gVar2.getClass();
                return new so.a(gVar2);
            case 6:
                return new tg.i((tg.c) iVar.f1331k0.get(), (o) iVar.f1332l0.get(), (yk.f) iVar.f1334m0.get(), (ft.j) iVar.f1352w.get(), (g3) iVar.J.get(), (cv.b) iVar.E.get(), kVar.f1369c);
            case 7:
                return new ah.k((x) kVar.F.get(), kVar.f1369c);
            case 8:
                y yVar = (y) kVar.E.get();
                zg.a aVar2 = (zg.a) iVar.f1338o0.get();
                yVar.getClass();
                aVar2.getClass();
                return new x(yVar, aVar2);
            case 9:
                f70.g gVar3 = (f70.g) iVar.f1321f0.get();
                gVar3.getClass();
                return new y(gVar3);
            case 10:
                return new tr.g(kVar.f1369c, (cv.b) iVar.E.get(), (c0) iVar.f1344r0.get(), (z) iVar.O.get(), iVar.b());
            case 11:
                return new ih.i(kVar.f1369c, (hh.a) iVar.t0.get(), (ft.j) iVar.f1352w.get(), (r1) iVar.f1355x0.get(), (g3) iVar.J.get(), (rg.d) iVar.W.get(), (dh.a) kVar.I.get(), (cv.b) iVar.E.get());
            case 12:
                qb.e eVar = kVar.f1373d;
                f70.g gVar4 = (f70.g) iVar.f1321f0.get();
                gVar4.getClass();
                return new dh.a(gVar4);
            case 13:
                return new dq.i((fq.a) kVar.K.get(), (cv.b) iVar.E.get());
            case 14:
                r40.d dVar2 = kVar.f1377e;
                f70.g gVar5 = (f70.g) iVar.f1321f0.get();
                gVar5.getClass();
                return new fq.a(gVar5);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new tm.e((r1) iVar.f1355x0.get(), (cv.b) iVar.E.get(), (ft.j) iVar.f1352w.get(), (m0) iVar.R.get(), (ft.b) iVar.f1353w0.get(), (u) iVar.G.get(), (wj.d) iVar.f1351v0.get(), (rg.d) iVar.W.get(), new rm.c(), (z1) iVar.f1357y0.get(), (g3) iVar.J.get(), (jm.b) kVar.M.get(), (ij.b) kVar.N.get());
            case 16:
                r40.d dVar3 = kVar.f1381f;
                f70.g gVar6 = (f70.g) iVar.f1321f0.get();
                gVar6.getClass();
                return new jm.b(gVar6);
            case 17:
                r40.d dVar4 = kVar.f1385g;
                ij.b bVar = (ij.b) iVar.f1359z0.get();
                bVar.getClass();
                return bVar;
            case 18:
                return new oh.c((w) kVar.R.get(), kVar.f1369c, (d0) kVar.Q.get());
            case 19:
                lh.x xVar = (lh.x) kVar.P.get();
                nh.b bVar2 = (nh.b) ((ag.c) this.f48d).f1295e.get();
                ft.b bVar3 = (ft.b) iVar.f1353w0.get();
                d0 d0Var = (d0) kVar.Q.get();
                u uVar = (u) iVar.G.get();
                xVar.getClass();
                bVar2.getClass();
                bVar3.getClass();
                d0Var.getClass();
                uVar.getClass();
                return new w(xVar, bVar2, bVar3, d0Var, uVar);
            case 20:
                f70.g gVar7 = (f70.g) iVar.f1321f0.get();
                gVar7.getClass();
                return new lh.x(gVar7);
            case 21:
                cv.b bVar4 = (cv.b) iVar.E.get();
                m0 m0Var = (m0) iVar.R.get();
                bVar4.getClass();
                m0Var.getClass();
                return new d0(bVar4, m0Var);
            case 22:
                return new uh.g(kVar.a(), (r1) iVar.f1355x0.get(), kVar.c(), (g3) iVar.J.get(), (th.c) kVar.T.get(), (at.c0) kVar.U.get());
            case 23:
                l50.a aVar3 = kVar.f1388h;
                f70.g gVar8 = (f70.g) iVar.f1321f0.get();
                gVar8.getClass();
                return new th.c(gVar8);
            case 24:
                return new at.c0((f70.g) iVar.f1321f0.get());
            case 25:
                return new hi.e(kVar.f1369c, (c0) iVar.f1344r0.get());
            case 26:
                return new ji.h(kVar.b(), kVar.f1369c, (cv.b) iVar.E.get());
            case 27:
                return new ki.i(kVar.a(), (r1) iVar.f1355x0.get(), (g3) iVar.J.get(), (xh.c) kVar.Y.get(), (at.c0) kVar.U.get());
            case 28:
                f70.g gVar9 = (f70.g) iVar.f1321f0.get();
                gVar9.getClass();
                return new xh.c(gVar9);
            case 29:
                return new v(kVar.f1369c, kVar.b(), (cv.b) iVar.E.get(), (ko.b) kVar.f1362a0.get(), (z) iVar.O.get(), (g3) iVar.J.get(), (gs.a) iVar.T.get(), iVar.b());
            case 30:
                qb.e eVar2 = kVar.f1391i;
                f70.g gVar10 = (f70.g) iVar.f1321f0.get();
                gVar10.getClass();
                return new ko.b(gVar10);
            case BERTags.DATE /* 31 */:
                return new m(kVar.b(), (xh.c) kVar.Y.get(), (d8.f) iVar.C0.get(), (cv.b) iVar.E.get());
            case 32:
                return new ni.e((gs.a) iVar.T.get(), kVar.b(), (g3) iVar.J.get(), (xh.c) kVar.Y.get(), (cv.b) iVar.E.get());
            case 33:
                return new q(kVar.f1369c, (g3) iVar.J.get(), (cv.b) iVar.E.get(), kVar.c(), (at.c0) kVar.U.get(), (d8.f) iVar.C0.get());
            case BERTags.DURATION /* 34 */:
                return new e0(kVar.f1369c, kVar.c(), (g3) iVar.J.get(), new lz.i((kt.g) kVar.f1431w.D0.get()), (cv.b) iVar.E.get(), (u) iVar.G.get(), (mv.x) iVar.H.get());
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                return new uq.e((g3) iVar.J.get(), (cv.b) iVar.E.get());
            case 36:
                return new s(kVar.b(), kVar.f1369c, (d8.f) iVar.C0.get(), (cv.b) iVar.E.get());
            case 37:
                return new ej.c((gj.w) kVar.f1392i0.get());
            case 38:
                r40.d dVar5 = kVar.f1385g;
                return new gj.w((ij.b) kVar.N.get());
            case 39:
                return new ei.a((g3) iVar.J.get(), (ao.v) iVar.f1341q.get(), (ln.i) iVar.E0.get(), (cv.b) iVar.E.get(), (d8.f) iVar.F0.get());
            case 40:
                return new ContactUsViewModel(u00.d.t(iVar.f1310b.f27469a), kVar.f1369c, (z) iVar.O.get(), iVar.b(), (cv.b) iVar.E.get(), (c0) iVar.f1344r0.get(), (g3) iVar.J.get(), (ao.c) iVar.P.get(), (vr.a) kVar.f1400l0.get());
            case RequestError.NO_DEV_KEY /* 41 */:
                l50.a aVar4 = kVar.f1394j;
                f70.g gVar11 = (f70.g) iVar.f1321f0.get();
                gVar11.getClass();
                return new vr.a(gVar11);
            case 42:
                return new oj.a((t) kVar.f1409o0.get(), kVar.f1369c);
            case 43:
                g3 g3Var = (g3) iVar.J.get();
                cv.b bVar5 = (cv.b) iVar.E.get();
                ft.s sVar = (ft.s) iVar.A.get();
                nj.u uVar2 = (nj.u) kVar.f1406n0.get();
                String strE = iVar.e();
                String str = (String) iVar.G0.get();
                g3Var.getClass();
                bVar5.getClass();
                sVar.getClass();
                uVar2.getClass();
                str.getClass();
                return new t(g3Var, bVar5, sVar, uVar2, strE, str);
            case 44:
                f70.g gVar12 = (f70.g) iVar.f1321f0.get();
                gVar12.getClass();
                return new nj.u(gVar12);
            case 45:
                return new qj.i((sj.c) kVar.f1415q0.get(), (sj.c) kVar.f1418r0.get(), (ao.v) iVar.f1341q.get(), (ao.h) iVar.X.get(), (d8.f) iVar.F0.get(), (cv.b) iVar.E.get());
            case 46:
                l20.c cVar = kVar.f1397k;
                f70.g gVar13 = (f70.g) iVar.f1321f0.get();
                gVar13.getClass();
                return new sj.c(gVar13);
            case 47:
                l20.c cVar2 = kVar.f1397k;
                f70.g gVar14 = (f70.g) iVar.f1321f0.get();
                gVar14.getClass();
                return new sj.c(gVar14);
            case 48:
                return new ym.w((r1) iVar.f1355x0.get(), (g3) iVar.J.get(), (cv.b) iVar.E.get(), (m0) iVar.R.get(), (kt.j) iVar.K.get(), (ft.j) iVar.f1352w.get(), new qb.e(), kVar.f1369c);
            case 49:
                return new fn.c((r1) iVar.f1355x0.get(), (g3) iVar.J.get(), (cv.b) iVar.E.get(), (m0) iVar.R.get(), (ft.b) iVar.f1353w0.get(), (rg.d) iVar.W.get(), (u) iVar.G.get(), kVar.f1369c, (gm.b) iVar.I0.get(), (wj.d) iVar.f1351v0.get(), (jm.b) kVar.M.get(), (at.c0) kVar.U.get(), (d8.f) iVar.C0.get());
            case 50:
                return new r(kVar.f1369c, (g3) iVar.J.get(), (cv.b) iVar.E.get(), (ao.c) iVar.P.get(), (r1) iVar.f1355x0.get(), (lr.a) kVar.f1434x.get());
            case 51:
                return new xj.k((r1) iVar.f1355x0.get(), (wj.d) iVar.f1351v0.get(), (rg.d) iVar.W.get(), (gs.a) iVar.T.get(), (ft.j) iVar.f1352w.get(), (u) iVar.G.get(), (uj.a) kVar.f1432w0.get(), new m1.a((cv.b) kVar.f1431w.E.get()));
            case 52:
                l50.a aVar5 = kVar.l;
                f70.g gVar15 = (f70.g) iVar.f1321f0.get();
                gVar15.getClass();
                return new uj.a(gVar15);
            case 53:
                return new zj.j((ft.b) iVar.f1353w0.get(), (cv.b) iVar.E.get(), (u) iVar.G.get());
            case 54:
                return new dk.f((r1) iVar.f1355x0.get(), (m0) iVar.R.get(), (cv.b) iVar.E.get(), (rg.d) iVar.W.get(), (ck.a) kVar.f1441z0.get());
            case 55:
                n20.f fVar = kVar.f1402m;
                f70.g gVar16 = (f70.g) iVar.f1321f0.get();
                gVar16.getClass();
                return new ck.a(gVar16);
            case 56:
                return new hn.c((g3) iVar.J.get(), (cv.b) iVar.E.get(), (rg.d) iVar.W.get(), (jm.b) kVar.M.get(), (at.c0) kVar.U.get());
            case 57:
                return new ek.q(kVar.f1369c, (g3) iVar.J.get(), (cv.b) iVar.E.get(), new se.d((g3) kVar.f1431w.J.get()), (gk.a) kVar.C0.get(), (at.c0) kVar.U.get());
            case 58:
                n20.f fVar2 = kVar.f1405n;
                f70.g gVar17 = (f70.g) iVar.f1321f0.get();
                gVar17.getClass();
                return new gk.a(gVar17);
            case 59:
                return new bs.o((r1) iVar.f1355x0.get(), (as.b) iVar.K0.get());
            case 60:
                return new j0(kVar.b(), (g3) iVar.J.get(), (xh.c) kVar.Y.get(), (cv.b) iVar.E.get(), (d8.f) iVar.C0.get());
            case 61:
                return new rq.d((n) kVar.H0.get());
            case 62:
                return new n((qq.c) iVar.L0.get(), (cv.b) iVar.E.get(), (oq.o) kVar.G0.get(), (at.c0) kVar.U.get());
            case 63:
                return new oq.o((f70.g) iVar.f1321f0.get());
            case 64:
                mk.b bVarA = kVar.a();
                o0 o0Var = (o0) kVar.J0.get();
                ag.i iVar2 = kVar.f1431w;
                pk.i iVar3 = (pk.i) iVar2.M0.get();
                u0 u0Var = (u0) kVar.K0.get();
                m1.a aVar6 = new m1.a((cv.b) iVar2.E.get());
                u uVar3 = (u) iVar2.G.get();
                o0Var.getClass();
                iVar3.getClass();
                u0Var.getClass();
                uVar3.getClass();
                f2 f2Var = new f2();
                f2Var.f16648a = o0Var;
                f2Var.f16649b = iVar3;
                f2Var.f16650c = u0Var;
                f2Var.f16651d = aVar6;
                f2Var.f16652e = uVar3;
                f2Var.f16653f = y80.r.b(0, 2, null, 4);
                f2Var.f16654g = y80.r.c(r0.f31058a);
                return new l(bVarA, f2Var);
            case 65:
                f70.g gVar18 = (f70.g) iVar.f1321f0.get();
                se.d dVar6 = new se.d((g3) kVar.f1431w.J.get());
                gVar18.getClass();
                return new o0(gVar18, dVar6);
            case 66:
                cv.b bVar6 = (cv.b) iVar.E.get();
                m0 m0Var2 = (m0) iVar.R.get();
                mv.e0 e0Var = (mv.e0) iVar.f1327i0.get();
                bVar6.getClass();
                m0Var2.getClass();
                e0Var.getClass();
                return new u0(bVar6, m0Var2, e0Var);
            case 67:
                return new cr.e((g3) iVar.J.get(), (cv.b) iVar.E.get(), (er.a) kVar.M0.get(), (at.c0) kVar.U.get());
            case 68:
                qb.e eVar3 = kVar.f1408o;
                f70.g gVar19 = (f70.g) iVar.f1321f0.get();
                gVar19.getClass();
                return new er.a(gVar19);
            case 69:
                return new uk.r(new se.b((kt.h) kVar.f1431w.f1350v.get()), (g3) iVar.J.get(), (ft.j) iVar.f1352w.get(), (cv.b) iVar.E.get(), kVar.f1369c, (z1) iVar.f1357y0.get(), (u) iVar.G.get());
            case 70:
                ao.c cVar3 = (ao.c) iVar.P.get();
                jt.i iVar4 = (jt.i) kVar.f1431w.f1335n.get();
                iVar4.getClass();
                tl.a aVar7 = (tl.a) ((jt.h) iVar4).b(tl.a.class, jt.c.DEFAULT);
                x0.o(aVar7);
                return new em.j(cVar3, new ky.o(aVar7, 27), (cv.b) iVar.E.get());
            case 71:
                return new yl.i((ao.v) iVar.f1341q.get(), (ao.c) iVar.P.get(), (ao.h) iVar.X.get(), kVar.f1369c, (cv.b) iVar.E.get());
            case 72:
                return new xl.m((cv.b) iVar.E.get(), (d8.f) iVar.F0.get());
            case 73:
                return new zl.g((ao.v) iVar.f1341q.get(), kVar.f1369c, (cv.b) iVar.E.get());
            case 74:
                return new p((g3) iVar.J.get(), iVar.g(), kVar.f1369c, (cv.b) iVar.E.get(), (d8.f) iVar.F0.get());
            case 75:
                return new wl.c((rl.a) kVar.U0.get());
            case 76:
                f70.g gVar20 = (f70.g) iVar.f1321f0.get();
                gVar20.getClass();
                return new rl.a(gVar20);
            case 77:
                return new cm.d((cv.b) iVar.E.get());
            case 78:
                return new al.p((ft.j) iVar.f1352w.get(), (ao.v) iVar.f1341q.get(), (g3) iVar.J.get(), (ao.c) iVar.P.get(), (ao.h) iVar.X.get(), iVar.g(), (cv.b) iVar.E.get(), (ft.s) iVar.A.get(), (jv.e) iVar.f1339p.get(), kVar.f1369c, (u) iVar.G.get(), (String) iVar.G0.get(), (hv.b) iVar.Q0.get(), (el.d) kVar.X0.get(), (at.c0) kVar.U.get());
            case 79:
                n20.f fVar3 = kVar.f1411p;
                f70.g gVar21 = (f70.g) iVar.f1321f0.get();
                gVar21.getClass();
                return new el.d(gVar21);
            case 80:
                return new hm.v((ao.c) iVar.P.get(), (g3) iVar.J.get(), (y0) iVar.N.get(), (ft.j) iVar.f1352w.get(), (z) iVar.O.get(), iVar.f(), (u) iVar.G.get(), (cv.b) iVar.E.get(), (ft.b) iVar.f1353w0.get(), (rg.d) iVar.W.get(), (ln.i) iVar.E0.get(), (r1) iVar.f1355x0.get(), (z1) iVar.f1357y0.get(), (ij.b) kVar.N.get(), (d8.f) iVar.C0.get(), kVar.f1369c, (hv.b) iVar.Q0.get(), (jm.b) kVar.M.get());
            case 81:
                return new ci.c((g3) iVar.J.get(), (xh.c) kVar.Y.get());
            case 82:
                return new hr.i((g3) iVar.J.get(), (cv.b) iVar.E.get(), (ao.v) iVar.f1341q.get(), (rg.d) iVar.W.get(), (r1) iVar.f1355x0.get(), (ln.i) iVar.E0.get(), (mv.b) iVar.f1326i.get(), (b0) iVar.f1343r.get(), (hv.b) iVar.Q0.get(), (yr.a) kVar.f1367b1.get(), (at.c0) kVar.U.get(), (u) iVar.G.get());
            case 83:
                l20.c cVar4 = kVar.f1414q;
                f70.g gVar22 = (f70.g) iVar.f1321f0.get();
                gVar22.getClass();
                return new yr.a(gVar22);
            case 84:
                cv.b bVar7 = (cv.b) iVar.E.get();
                g3 g3Var2 = (g3) iVar.J.get();
                bVar7.getClass();
                g3Var2.getClass();
                return new jg.f();
            case 85:
                return new en.o(kVar.a(), (r1) iVar.f1355x0.get(), (g3) iVar.J.get(), kVar.c(), (xm.a) kVar.f1379e1.get(), (at.c0) kVar.U.get());
            case 86:
                ky.p pVar = kVar.f1417r;
                f70.g gVar23 = (f70.g) iVar.f1321f0.get();
                gVar23.getClass();
                return new xm.a(gVar23);
            case 87:
                return new lo.m(kVar.f1369c, (z) iVar.O.get(), (cv.b) iVar.E.get(), iVar.b(), (kt.j) iVar.K.get(), (g3) iVar.J.get(), (hv.b) iVar.Q0.get(), (at.c0) kVar.U.get(), (ko.b) kVar.f1362a0.get(), new qb.e());
            case 88:
                return new zq.g((g3) iVar.J.get(), (cv.b) iVar.E.get());
            case 89:
                return new eo.h((g3) iVar.J.get(), kVar.f1369c, (rg.d) iVar.W.get(), (cv.b) iVar.E.get());
            case 90:
                return new yk.h((tg.c) iVar.f1331k0.get(), (yk.f) iVar.f1334m0.get(), (g3) iVar.J.get(), (ft.j) iVar.f1352w.get(), (wk.a) kVar.f1396j1.get(), (cv.b) iVar.E.get());
            case 91:
                l20.c cVar5 = kVar.f1420s;
                f70.g gVar24 = (f70.g) iVar.f1321f0.get();
                gVar24.getClass();
                return new wk.a(gVar24);
            case 92:
                return new hq.s((g3) iVar.J.get());
            case 93:
                return new hs.h((g3) iVar.J.get(), (gs.a) iVar.T.get(), (cs.b) kVar.f1404m1.get(), kVar.f1369c, (cs.a) kVar.f1407n1.get());
            case 94:
                cv.b bVar8 = (cv.b) iVar.E.get();
                bVar8.getClass();
                return new cs.b(bVar8);
            case 95:
                f70.g gVar25 = (f70.g) iVar.f1321f0.get();
                gVar25.getClass();
                return new cs.a(gVar25);
            case 96:
                return new li.g(kVar.b(), (g3) iVar.J.get(), (xh.c) kVar.Y.get());
            case 97:
                return new gl.q((o) iVar.f1332l0.get(), (ft.j) iVar.f1352w.get(), (g3) iVar.J.get(), (ao.c) iVar.P.get(), (cv.b) iVar.E.get());
            case 98:
                return new ll.g((ft.j) iVar.f1352w.get(), (g3) iVar.J.get(), (cv.b) iVar.E.get(), iVar.f(), (el.d) kVar.X0.get(), (at.c0) kVar.U.get(), (d8.f) iVar.F0.get());
            case 99:
                return new br.o((z) iVar.O.get(), (g3) iVar.J.get(), (cv.b) iVar.E.get());
            default:
                throw new AssertionError(i11);
        }
    }

    @Override // t70.a
    public final Object get() {
        Object jVar;
        Object xVar;
        Object s0Var;
        Object hVar;
        Object aVar;
        Object iVar;
        switch (this.f45a) {
            case 0:
                a aVar2 = (a) this.f47c;
                e eVar = (e) this.f49e;
                c cVar = (c) this.f48d;
                int i11 = this.f46b;
                switch (i11) {
                    case 0:
                        j jVar2 = (j) ((s70.c) eVar.f51b).get();
                        k3 k3Var = (k3) cVar.f30k.get();
                        if (((s70.c) eVar.f52c).get() == null) {
                            return new l2(jVar2, k3Var, (o2) ((s70.c) eVar.l).get(), (s70.c) eVar.f59j, (s70.c) eVar.f58i, (s70.c) eVar.f57h);
                        }
                        org.bouncycastle.jce.provider.a.c();
                        return null;
                    case 1:
                        h hVar2 = (h) eVar.f50a;
                        w.o oVar = (w.o) cVar.f43y.get();
                        hVar2.getClass();
                        oVar.getClass();
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        jVar = new j(new f(hVar2, 0), oVar, hVar2.f69b, new f(hVar2, 1));
                        return jVar;
                    case 2:
                        ((h) eVar.f50a).getClass();
                        return null;
                    case 3:
                        return new b1((s70.c) eVar.f60k, (k3) cVar.f30k.get());
                    case 4:
                        return new x2((s70.c) eVar.f57h, (s70.c) eVar.f54e, (j) ((s70.c) eVar.f51b).get(), (s70.c) eVar.f59j, (k3) cVar.f30k.get(), (m0.z) aVar2.f14a.f48338f);
                    case 5:
                        s70.c cVar2 = (s70.c) eVar.f55f;
                        s70.c cVar3 = (s70.c) eVar.f56g;
                        cVar2.getClass();
                        cVar3.getClass();
                        if (z.c.f46362f) {
                            Object obj = cVar3.get();
                            obj.getClass();
                            return (b0.o) obj;
                        }
                        Object obj2 = cVar2.get();
                        obj2.getClass();
                        return (b0.o) obj2;
                    case 6:
                        w.x xVar2 = (w.x) ((s70.c) eVar.f53d).get();
                        l1 l1Var = (l1) cVar.f36r.get();
                        g2 g2Var = (g2) cVar.f35q.get();
                        l3 l3Var = (l3) cVar.f39u.get();
                        k3 k3Var2 = (k3) cVar.f30k.get();
                        b0.x0 x0Var = (b0.x0) cVar.f31m.get();
                        y.b bVar = (y.b) cVar.f29j.get();
                        j0.b bVarA = cVar.f22c.a();
                        c0.e eVar2 = (c0.e) cVar.E.get();
                        bVar.getClass();
                        eVar2.getClass();
                        jVar = new b0.r0(xVar2, l1Var, g2Var, l3Var, k3Var2, x0Var, bVar.a().a(UseTorchAsFlashQuirk.class) ? new z.m(bVar, bVarA, eVar2) : z.a.f46356i, (b0.n) cVar.f24e.get(), (s70.c) eVar.f54e, (j) ((s70.c) eVar.f51b).get());
                        return jVar;
                    case 7:
                        xVar = new w.x((b0.n) cVar.f24e.get(), (j) ((s70.c) eVar.f51b).get(), (s0) cVar.f25f.get(), (k3) cVar.f30k.get(), cVar.a());
                        return xVar;
                    case 8:
                        return new c3((j) ((s70.c) eVar.f51b).get(), cVar.a());
                    case 9:
                        return new z.c((b0.n) cVar.f24e.get(), (s70.c) eVar.f55f, (k3) cVar.f30k.get(), (g2) cVar.f35q.get());
                    case 10:
                        k3 k3Var3 = (k3) cVar.f30k.get();
                        e0.b0 b0Var = (e0.b0) aVar2.f14a.f48335c;
                        x0.o(b0Var);
                        y.b bVar2 = (y.b) cVar.f29j.get();
                        bVar2.getClass();
                        s0.r1 r1VarA = bVar2.a();
                        xVar = new i3(k3Var3, b0Var, (r1VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) || r1VarA.a(PreviewOrientationIncorrectQuirk.class) || r1VarA.a(TextureViewIsClosedQuirk.class)) ? new com.google.android.gms.common.internal.q() : z.a.f46352e, (l0) ((s70.c) eVar.f58i).get());
                        return xVar;
                    case 11:
                        return ((h) eVar.f50a).f70c;
                    default:
                        throw new AssertionError(i11);
                }
            default:
                int i12 = this.f46b;
                int i13 = i12 / 100;
                if (i13 == 0) {
                    return a();
                }
                if (i13 != 1) {
                    throw new AssertionError(i12);
                }
                k kVar = (k) this.f49e;
                ag.i iVar2 = (ag.i) this.f47c;
                switch (i12) {
                    case 100:
                        return new um.t(kVar.a(), kVar.c(), (g3) iVar2.J.get(), (r1) iVar2.f1355x0.get(), (xm.a) kVar.f1379e1.get(), (cv.b) iVar2.E.get(), (u) iVar2.G.get());
                    case 101:
                        return new oi.d((g3) iVar2.J.get());
                    case 102:
                        return new ks.h((kt.k) iVar2.B0.get(), iVar2.a());
                    case 103:
                        s0Var = new cj.s0(u00.d.t(iVar2.f1310b.f27469a), kVar.f1369c, kVar.c(), new b70.c(0), (cv.b) iVar2.E.get(), (gs.a) iVar2.T.get(), (g3) iVar2.J.get(), (at.c0) kVar.U.get());
                        return s0Var;
                    case 104:
                        hVar = new qo.h(kVar.f1369c, (cv.b) iVar2.E.get(), (z) iVar2.O.get(), (g3) iVar2.J.get(), (ao.f2) iVar2.S0.get(), (so.a) kVar.B.get());
                        return hVar;
                    case 105:
                        iVar = new fr.i(kVar.f1369c, (g3) iVar2.J.get(), (rg.d) iVar2.W.get(), (r1) iVar2.f1355x0.get(), (er.a) kVar.M0.get());
                        return iVar;
                    case 106:
                        return new mn.l((g3) iVar2.J.get(), (ln.i) iVar2.E0.get(), (z) iVar2.O.get(), (jp.q) iVar2.T0.get(), (gm.b) iVar2.I0.get(), (cv.b) iVar2.E.get(), (mv.b) iVar2.f1326i.get(), (u) iVar2.G.get(), (hv.b) iVar2.Q0.get(), (jn.a) kVar.f1442z1.get(), (at.c0) kVar.U.get(), (d8.f) iVar2.C0.get());
                    case 107:
                        qb.e eVar3 = kVar.f1423t;
                        f70.g gVar = (f70.g) iVar2.f1321f0.get();
                        gVar.getClass();
                        aVar = new jn.a(gVar);
                        return aVar;
                    case 108:
                        s0Var = new fi.i(kVar.f1369c, (ao.c) iVar2.P.get(), (g3) iVar2.J.get(), (xh.c) kVar.Y.get(), (cv.b) iVar2.E.get());
                        return s0Var;
                    case 109:
                        return new yo.d((g3) iVar2.J.get(), (cv.b) iVar2.E.get(), (r1) iVar2.f1355x0.get(), new qb.e());
                    case 110:
                        ap.n nVar = new ap.n(kVar.f1369c, (z) iVar2.O.get(), (cv.b) iVar2.E.get(), (r1) iVar2.f1355x0.get(), (rg.d) iVar2.W.get());
                        nVar.f4564f = new fv.b(kVar.f1431w.f1310b.f27469a);
                        iVar = nVar;
                        return iVar;
                    case 111:
                        return new ep.d0((jp.q) iVar2.T0.get(), new fv.b(kVar.f1431w.f1310b.f27469a), iVar2.g(), (gp.a) kVar.E1.get(), (cv.b) iVar2.E.get(), (u) iVar2.G.get(), kVar.f1369c);
                    case 112:
                        qb.e eVar4 = kVar.f1425u;
                        f70.g gVar2 = (f70.g) iVar2.f1321f0.get();
                        gVar2.getClass();
                        aVar = new gp.a(gVar2);
                        return aVar;
                    case 113:
                        return new zs.d((cv.b) iVar2.E.get(), (g3) iVar2.J.get(), (c0) iVar2.f1344r0.get());
                    case 114:
                        return new si.b((cv.b) iVar2.E.get(), kVar.b());
                    case 115:
                        return new gq.b((g3) iVar2.J.get(), (cv.b) iVar2.E.get());
                    case 116:
                        return new gq.d((fq.a) kVar.K.get(), (cv.b) iVar2.E.get(), (g3) iVar2.J.get());
                    case 117:
                        hVar = new gi.c(kVar.b(), kVar.f1369c, (cv.b) iVar2.E.get(), (g3) iVar2.J.get(), (d8.f) iVar2.F0.get());
                        return hVar;
                    case 118:
                        return new ng.g((ao.c) iVar2.P.get(), (mv.b) iVar2.f1326i.get(), (hv.b) iVar2.Q0.get());
                    case 119:
                        return new hr.n((g3) iVar2.J.get(), (ao.v) iVar2.f1341q.get(), (cv.b) iVar2.E.get(), (rg.d) iVar2.W.get(), (mv.b) iVar2.f1326i.get(), (r1) iVar2.f1355x0.get(), (yr.c) kVar.M1.get());
                    case 120:
                        l20.c cVar4 = kVar.f1414q;
                        f70.g gVar3 = (f70.g) iVar2.f1321f0.get();
                        gVar3.getClass();
                        aVar = new yr.c(gVar3);
                        return aVar;
                    case 121:
                        return new no.j(kVar.b(), kVar.f1369c, (cv.b) iVar2.E.get(), (g3) iVar2.J.get());
                    case 122:
                        return new ns.g(kVar.f1369c, (ao.f2) iVar2.S0.get(), (cv.b) iVar2.E.get());
                    case AppConstants.RESULT_CODE_ORDER_CANCELLED /* 123 */:
                        hVar = new al.c0((b0) iVar2.f1343r.get(), (ao.h) iVar2.X.get(), (ao.v) iVar2.f1341q.get(), (g3) iVar2.J.get(), (cv.b) iVar2.E.get(), kVar.c(), (jt.b) iVar2.U0.get(), (hv.b) iVar2.Q0.get(), (el.d) kVar.X0.get(), (sj.c) kVar.f1418r0.get(), (d8.f) iVar2.F0.get(), kVar.f1369c);
                        return hVar;
                    case 124:
                        return new np.b((sp.f) iVar2.W0.get(), (cv.b) iVar2.E.get(), (mv.x) iVar2.H.get());
                    case 125:
                        return new zs.f(kVar.f1369c, (g3) iVar2.J.get());
                    case 126:
                        return new zs.o(kVar.f1369c, (cv.b) iVar2.E.get(), (g3) iVar2.J.get(), (ys.a) iVar2.Y0.get());
                    case 127:
                        return new zp.g((yp.a) iVar2.f1309a1.get(), (cv.b) iVar2.E.get(), (ft.j) iVar2.f1352w.get(), kVar.f1369c, (vp.a) kVar.U1.get());
                    case 128:
                        l20.c cVar5 = kVar.f1428v;
                        f70.g gVar4 = (f70.g) iVar2.f1321f0.get();
                        gVar4.getClass();
                        aVar = new vp.a(gVar4);
                        return aVar;
                    case 129:
                        return new no.m0(kVar.f1369c, (z) iVar2.O.get(), (g3) iVar2.J.get(), (r1) iVar2.f1355x0.get(), (y0) iVar2.N.get(), (ao.f2) iVar2.S0.get(), (gs.a) iVar2.T.get(), (cv.b) iVar2.E.get(), (gv.b) iVar2.f1329j0.get(), iVar2.c(), iVar2.b(), (hv.b) iVar2.Q0.get(), (ko.b) kVar.f1362a0.get(), (at.c0) kVar.U.get(), (d8.f) iVar2.C0.get());
                    case AppConstants.RESULT_CODE_ORDER_COLLECTED /* 130 */:
                        return new gr.k(kVar.f1369c, (g3) iVar2.J.get(), (cv.b) iVar2.E.get(), (ft.s) iVar2.A.get(), (er.a) kVar.M0.get(), iVar2.e(), (String) iVar2.G0.get());
                    case AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED /* 131 */:
                        return new qs.h(kVar.f1369c, (ss.w) kVar.Y1.get(), new t5.a((ss.w) kVar.Y1.get(), (ss.x) kVar.Z1.get(), (at.c0) kVar.U.get()));
                    case AppConstants.RESULT_CODE_FLASH_SALES_SURVEY /* 132 */:
                        return new ss.w((r3) iVar2.f1315c1.get(), (ao.f2) iVar2.S0.get(), (cv.b) iVar2.E.get());
                    case 133:
                        return new ss.x((f70.g) iVar2.f1321f0.get());
                    case 134:
                        return new qs.i(kVar.f1369c, (w0) kVar.f1368b2.get(), new t5.a((w0) kVar.f1368b2.get(), (ss.x0) kVar.f1372c2.get(), (at.c0) kVar.U.get()));
                    case 135:
                        return new w0((r3) iVar2.f1315c1.get(), (cv.b) iVar2.E.get());
                    case 136:
                        return new ss.x0((f70.g) iVar2.f1321f0.get());
                    case 137:
                        return new dt.c(kVar.f1369c, (at.b0) kVar.f1380e2.get(), (g3) iVar2.J.get());
                    case 138:
                        return new at.b0((at.c0) kVar.U.get());
                    default:
                        throw new AssertionError(i12);
                }
        }
    }
}
