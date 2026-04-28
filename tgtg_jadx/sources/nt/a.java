package nt;

import androidx.lifecycle.n1;
import c5.a1;
import ft.l;
import ft.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import jt.c;
import jt.h;
import jt.i;
import jt.j;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import mv.d;
import q90.f0;
import q90.g0;
import q90.p0;
import q90.q0;
import q90.r0;
import q90.t;
import q90.v0;
import q90.w;
import q90.x;
import q90.z;
import v90.g;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f31394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f31395b;

    public a(i iVar, o oVar) {
        iVar.getClass();
        oVar.getClass();
        this.f31394a = oVar;
        this.f31395b = (j) ((h) iVar).b(j.class, c.TOKEN);
    }

    public static p0 a(g gVar) {
        q0 q0Var = r0.f36605a;
        ArrayList arrayList = new ArrayList(20);
        g0 g0Var = gVar.f42190e;
        g0Var.getClass();
        f0 f0Var = f0.HTTP_1_1;
        f0Var.getClass();
        Pair pairL = wd.a.l(null);
        Charset charset = (Charset) pairL.f26485a;
        z zVar = (z) pairL.f26486b;
        ia0.g gVar2 = new ia0.g();
        charset.getClass();
        charset.getClass();
        if (23 > "Failed to refresh token".length()) {
            i4.a.c("Failed to refresh token".length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(23, "endIndex > string.length: ", " > "));
        } else if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            gVar2.E0(0, 23, "Failed to refresh token");
        } else {
            byte[] bytes = "Failed to refresh token".substring(0, 23).getBytes(charset);
            bytes.getClass();
            gVar2.write(bytes, 0, bytes.length);
        }
        return new p0(g0Var, f0Var, "Failed to refresh token", 400, null, new t((String[]) arrayList.toArray(new String[0])), new q0(zVar, gVar2.f23643b, gVar2), null, null, null, null, 0L, 0L, null, v0.f36632p0);
    }

    public final g0 b(g gVar) {
        o oVar = this.f31394a;
        if (oVar.f17955e == null) {
            oVar.f17955e = (String) v80.f0.E(kotlin.coroutines.g.f26549a, new l(oVar, null, 0));
        }
        String str = oVar.f17955e;
        String strConcat = str != null ? "Bearer ".concat(str) : null;
        if (strConcat == null) {
            return null;
        }
        n1 n1VarB = gVar.f42190e.b();
        n1VarB.u("Authorization", strConcat);
        ((ax.g0) n1VarB.f3501c).i("withoutAuthorization");
        return new g0(n1VarB);
    }

    @Override // q90.x
    public final p0 intercept(w wVar) {
        p0 p0VarB;
        g0 g0VarB;
        synchronized (this) {
            try {
                g0 g0Var = ((g) wVar).f42190e;
                if (Intrinsics.areEqual(g0Var.f36507c.b("withoutAuthorization"), "true")) {
                    n1 n1VarB = g0Var.b();
                    ((ax.g0) n1VarB.f3501c).i("withoutAuthorization");
                    p0VarB = ((g) wVar).b(new g0(n1VarB));
                } else if (this.f31394a.a()) {
                    o oVar = this.f31394a;
                    oVar.getClass();
                    a1 a1Var = mv.p0.f30209a;
                    long timeInMillis = Calendar.getInstance(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE)).getTimeInMillis() / ((long) 1000);
                    if (oVar.f17957g == null) {
                        oVar.f17957g = (Long) v80.f0.E(kotlin.coroutines.g.f26549a, new l(oVar, null, 1));
                    }
                    Long l = oVar.f17957g;
                    if (timeInMillis > (l != null ? l.longValue() : 0L)) {
                        p0VarB = Intrinsics.areEqual(g0Var.f36505a.b(), "api/token/v1/refresh") ? ((g) wVar).b(g0Var) : (!d.w(this.f31395b, this.f31394a) || (g0VarB = b((g) wVar)) == null) ? a((g) wVar) : ((g) wVar).b(g0VarB);
                    } else {
                        g0 g0VarB2 = b((g) wVar);
                        if (g0VarB2 != null) {
                            g0Var = g0VarB2;
                        }
                        p0VarB = ((g) wVar).b(g0Var);
                    }
                } else {
                    p0VarB = ((g) wVar).b(g0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p0VarB;
    }
}
