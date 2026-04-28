package hd;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import c5.n2;
import c5.v0;
import fd.o;
import gd.k;
import gd.q;
import m3.m;
import m3.n;
import m3.s;
import td.i;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21864a = z5.b.b(0, 0, 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21865b = 0;

    public static final k a(n nVar) {
        s sVar = (s) nVar;
        if (!((Boolean) sVar.j(n2.f7299a)).booleanValue()) {
            sVar.a0(2019088453);
            sVar.q(false);
            return null;
        }
        sVar.a0(2019030948);
        k kVar = (k) sVar.j(q.f20400a);
        sVar.q(false);
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ud.i b(z4.m r2, m3.n r3) {
        /*
            z4.n r0 = z4.l.f47171f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            m3.s r3 = (m3.s) r3
            boolean r0 = r3.g(r2)
            java.lang.Object r1 = r3.M()
            if (r0 != 0) goto L16
            m3.f r0 = m3.m.f29332a
            if (r1 != r0) goto L30
        L16:
            if (r2 == 0) goto L1c
            ud.e r2 = ud.i.f41062a1
        L1a:
            r1 = r2
            goto L2d
        L1c:
            gd.m r2 = new gd.m
            r2.<init>()
            long r0 = hd.h.f21864a
            r2.f20395a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f20396b = r0
            goto L1a
        L2d:
            r3.k0(r1)
        L30:
            ud.i r1 = (ud.i) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.h.b(z4.m, m3.n):ud.i");
    }

    public static final i c(Object obj, n nVar) {
        s sVar = (s) nVar;
        sVar.a0(1319639034);
        if (obj instanceof i) {
            sVar.a0(1530875884);
            i iVar = (i) obj;
            sVar.q(false);
            sVar.q(false);
            return iVar;
        }
        sVar.a0(1530915130);
        Context context = (Context) sVar.j(v0.f7390b);
        boolean zF = sVar.f(context) | sVar.f(obj);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            td.e eVar = new td.e(context);
            eVar.f39959c = obj;
            objM = eVar.a();
            sVar.k0(objM);
        }
        i iVar2 = (i) objM;
        sVar.q(false);
        sVar.q(false);
        return iVar2;
    }

    public static final long d(long j9) {
        int iB = j80.c.b(Float.intBitsToFloat((int) (j9 >> 32)));
        return (((long) j80.c.b(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
    }

    public static void e(String str) {
        throw new IllegalArgumentException(j4.s.k("Unsupported type: ", str, ". ", a0.p("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void f(i iVar) {
        Object obj = iVar.f39997b;
        if (obj instanceof td.e) {
            i4.a.f("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof i4.f) {
            e("ImageBitmap");
            throw null;
        }
        if (obj instanceof p4.f) {
            e("ImageVector");
            throw null;
        }
        if (obj instanceof n4.b) {
            e("Painter");
            throw null;
        }
        if (iVar.f39998c != null) {
            i4.a.f("request.target must be null.");
        } else {
            if (((Lifecycle) o.e(iVar, td.k.f40024e)) == null) {
                return;
            }
            i4.a.f("request.lifecycle must be null.");
        }
    }
}
