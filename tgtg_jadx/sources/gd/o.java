package gd;

import a3.y0;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Trace;
import b4.t;
import c5.v0;
import fd.w;
import kotlin.jvm.functions.Function1;
import m3.s;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fd.j f20398a = new fd.j(Boolean.FALSE, 0);

    public static final void a(Object obj, String str, t tVar, z4.m mVar, m3.n nVar, int i11, int i12, int i13) {
        b4.k kVar = b4.d.f5687e;
        z4.m mVar2 = (i13 & 64) != 0 ? z4.l.f47167b : mVar;
        s sVar = (s) nVar;
        int i14 = i11 << 3;
        int i15 = (i11 & 126) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = ((i11 >> 27) & 14) | ((i12 << 3) & 112);
        int i17 = i15 >> 3;
        b(new hd.a(obj, (b) sVar.j(p.f20399a), w.a((Context) sVar.j(v0.f7390b))), str, tVar, i.f20372v, null, kVar, mVar2, 1.0f, null, true, sVar, (i15 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | ((i16 << 27) & 1879048192), (i16 >> 3) & 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final hd.a r18, final java.lang.String r19, final b4.t r20, final kotlin.jvm.functions.Function1 r21, final kotlin.jvm.functions.Function1 r22, final b4.f r23, final z4.m r24, final float r25, final i4.w r26, final boolean r27, m3.n r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.o.b(hd.a, java.lang.String, b4.t, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, b4.f, z4.m, float, i4.w, boolean, m3.n, int, int):void");
    }

    public static final void c(Object obj, String str, t tVar, n4.b bVar, n4.b bVar2, n4.b bVar3, z4.m mVar, float f11, i4.w wVar, m3.n nVar, int i11, int i12, int i13) {
        b4.k kVar = b4.d.f5687e;
        n4.b bVar4 = (i13 & 8) != 0 ? null : bVar;
        n4.b bVar5 = (i13 & 16) != 0 ? null : bVar2;
        n4.b bVar6 = (i13 & 32) != 0 ? bVar5 : bVar3;
        z4.m mVar2 = (i13 & 1024) != 0 ? z4.l.f47167b : mVar;
        float f12 = (i13 & NewHope.SENDB_BYTES) != 0 ? 1.0f : f11;
        i4.w wVar2 = (i13 & 4096) != 0 ? null : wVar;
        s sVar = (s) nVar;
        int i14 = i11 << 3;
        int i15 = (i11 & 126) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016) | (29360128 & i14) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i12 << 3;
        int i17 = ((i11 >> 27) & 14) | (i16 & 112) | (i16 & 7168);
        int i18 = i15 >> 3;
        hd.a aVar = new hd.a(obj, (b) sVar.j(p.f20399a), w.a((Context) sVar.j(v0.f7390b)));
        int i19 = hd.h.f21865b;
        Function1 y0Var = (bVar4 == null && bVar5 == null && bVar6 == null) ? i.f20372v : new y0(bVar4, bVar6, bVar5, 18);
        int i21 = i17 << 15;
        b(aVar, str, tVar, y0Var, null, kVar, mVar2, f12, wVar2, true, sVar, (i15 & 112) | (i18 & 896) | (i21 & 458752) | (i21 & 3670016) | (i21 & 234881024), 0);
    }

    public static final n4.b d(fd.l lVar, Context context, int i11) {
        if (!(lVar instanceof fd.a)) {
            return lVar instanceof fd.f ? new qy.b(fd.o.b(lVar, context.getResources()).mutate()) : new n(lVar);
        }
        Bitmap bitmap = ((fd.a) lVar).f17546a;
        n4.a aVar = new n4.a(new i4.f(bitmap), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.f30498h = i11;
        return aVar;
    }

    public static final i e(Uri uri, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        return f(new hd.a(uri, (b) sVar.j(p.f20399a), w.a((Context) sVar.j(v0.f7390b))), i.f20372v, null, z4.l.f47167b, sVar);
    }

    public static final i f(hd.a aVar, Function1 function1, g2.g gVar, z4.m mVar, m3.n nVar) {
        s sVar = (s) nVar;
        sVar.a0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            td.i iVarC = hd.h.c(aVar.f21837a, sVar);
            hd.h.f(iVarC);
            c cVar = new c(aVar.f21839c, iVarC, aVar.f21838b);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new i(cVar);
                sVar.k0(objM);
            }
            i iVar = (i) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM2);
            }
            iVar.l = (b0) objM2;
            iVar.f20379m = function1;
            iVar.f20380n = gVar;
            iVar.f20381o = mVar;
            iVar.f20382p = 1;
            iVar.f20383q = hd.h.a(sVar);
            iVar.n(cVar);
            sVar.q(false);
            return iVar;
        } finally {
            Trace.endSection();
        }
    }

    public static final i g(String str, n4.b bVar, n4.b bVar2, n4.b bVar3, m3.n nVar) {
        s sVar = (s) nVar;
        hd.a aVar = new hd.a(str, (b) sVar.j(p.f20399a), w.a((Context) sVar.j(v0.f7390b)));
        int i11 = hd.h.f21865b;
        return f(aVar, (bVar == null && bVar2 == null && bVar3 == null) ? i.f20372v : new y0(bVar, bVar3, bVar2, 18), null, z4.l.f47167b, sVar);
    }
}
