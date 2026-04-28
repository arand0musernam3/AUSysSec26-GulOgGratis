package androidx.fragment.app;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.View;
import android.view.inputmethod.InputConnection;
import androidx.core.view.ViewCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONObject;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3329b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, int i11) {
        super(1);
        this.f3328a = i11;
        this.f3329b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f3328a;
        int i12 = 0;
        x70.c cVar = null;
        int i13 = 1;
        Object obj2 = this.f3329b;
        switch (i11) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(CollectionsKt.I((Collection) obj2, ViewCompat.A((View) entry.getValue())));
            case 1:
                ((o3.e) obj2).b((b4.r) obj);
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(((g4.g0) obj).S0(((g4.f) obj2).f19936a));
            case 3:
                b5.r0 r0Var = (b5.r0) obj;
                c5.y yVar = ((c5.m) obj2).f7289p;
                if (yVar.getInsetsListener().f47228g.h() > 0) {
                    q1.g0 g0Var = z4.g2.f47128a;
                    long jU = r0Var.b().u();
                    q1.t0 t0Var = yVar.getInsetsListener().f47227f;
                    int i14 = (int) (jU >> 32);
                    int i15 = (int) (jU & 4294967295L);
                    for (z4.e2 e2Var : z4.g2.f47129b) {
                        Object objD = t0Var.d(e2Var);
                        objD.getClass();
                        z4.h2 h2Var = (z4.h2) objD;
                        z4.f2 f2Var = (z4.f2) e2Var;
                        z4.g2.a(r0Var, f2Var.f47122c, h2Var.f47140h, i14, i15);
                        if (((Boolean) h2Var.f47134b.getValue()).booleanValue()) {
                            z4.g2.a(r0Var, h2Var.f47138f, h2Var.f47142j, i14, i15);
                            z4.g2.a(r0Var, h2Var.f47139g, h2Var.f47143k, i14, i15);
                        }
                        z4.g2.a(r0Var, f2Var.f47123d, h2Var.f47141i, i14, i15);
                    }
                    q1.o0 o0Var = yVar.getInsetsListener().f47229h;
                    if (o0Var.e()) {
                        z3.r rVar = yVar.getInsetsListener().f47230i;
                        Object[] objArr = o0Var.f35721a;
                        int i16 = o0Var.f35722b;
                        while (i12 < i16) {
                            m3.b1 b1Var = (m3.b1) objArr[i12];
                            z4.r rVar2 = (z4.r) rVar.get(i12);
                            Rect rect = (Rect) b1Var.getValue();
                            r0Var.c(rVar2.b(), rect.left);
                            r0Var.c(rVar2.d(), rect.top);
                            r0Var.c(rVar2.c(), rect.right);
                            r0Var.c(rVar2.a(), rect.bottom);
                            i12++;
                        }
                    }
                }
                return Unit.f26487a;
            case 4:
                return Boolean.valueOf(((q1.o) obj2).a(((j5.t) obj).f24699g));
            case 5:
                return Boolean.valueOf(c5.h0.b((j5.t) obj, (Resources) obj2));
            case 6:
                return new a3.v0((c5.b2) obj2, i13);
            case 7:
                if (c5.e2.f7183b.compareAndSet(false, true)) {
                    ((x80.i) obj2).h(Unit.f26487a);
                }
                return Unit.f26487a;
            case 8:
                k4.d dVar = (k4.d) obj;
                i4.t tVarI = dVar.g0().i();
                Function2 function2 = ((c5.f2) obj2).f7221d;
                if (function2 != null) {
                    function2.invoke(tVarI, (l4.b) dVar.g0().f24503c);
                }
                return Unit.f26487a;
            case 9:
                r5.p pVar = (r5.p) obj;
                InputConnection inputConnection = pVar.f37698b;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    pVar.f37698b = null;
                }
                c5.k2 k2Var = (c5.k2) obj2;
                o3.e eVar = k2Var.f7272d;
                Object[] objArr2 = eVar.f31830a;
                int i17 = eVar.f31832c;
                while (true) {
                    if (i12 >= i17) {
                        i12 = -1;
                    } else if (!Intrinsics.areEqual((b5.s2) objArr2[i12], pVar)) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    eVar.l(i12);
                }
                if (eVar.f31832c == 0) {
                    k2Var.f7270b.invoke();
                }
                return Unit.f26487a;
            case 10:
                ((b5.m0) obj2).c0((z5.c) obj);
                return Unit.f26487a;
            case 11:
                h4.c cVar2 = (h4.c) obj;
                c6.t tVar = (c6.t) obj2;
                if (tVar.isAttached()) {
                    v80.f0.B(tVar.getCoroutineScope(), null, null, new a3.x(tVar, cVar2, cVar, 25), 3);
                }
                return Unit.f26487a;
            case 12:
                af.e eVar2 = (af.e) obj;
                eVar2.getClass();
                ((df.b) obj2).f14887h = eVar2;
                return Unit.f26487a;
            case 13:
                e4.i iVar = (e4.i) obj;
                if (!iVar.getNode().isAttached()) {
                    return b5.p2.SkipSubtreeAndContinueTraversal;
                }
                e4.k kVar = iVar.f15744q;
                if (kVar != null) {
                    kVar.I0((e4.d) obj2);
                }
                iVar.f15744q = null;
                iVar.f15743p = null;
                return b5.p2.ContinueTraversal;
            case 14:
                ((ListenableFuture) obj2).cancel(false);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b5.o0 o0Var2 = (b5.o0) obj;
                ((hb0.o) obj2).invoke(o0Var2);
                o0Var2.b();
                return Unit.f26487a;
            case 16:
                i4.s0 s0Var = (i4.s0) obj;
                f4.o oVar = (f4.o) obj2;
                s0Var.q(s0Var.f23298r.a() * oVar.f17315b);
                s0Var.u(oVar.f17316c);
                s0Var.g(oVar.f17317d);
                s0Var.e(oVar.f17318e);
                s0Var.v(oVar.f17319f);
                return Unit.f26487a;
            case 17:
                i4.s0 s0Var2 = (i4.s0) obj;
                k6.n nVar = (k6.n) obj2;
                if (!Float.isNaN(nVar.f26055f) || !Float.isNaN(nVar.f26056g)) {
                    s0Var2.w(i4.g0.h(Float.isNaN(nVar.f26055f) ? 0.5f : nVar.f26055f, Float.isNaN(nVar.f26056g) ? 0.5f : nVar.f26056g));
                }
                if (!Float.isNaN(nVar.f26057h)) {
                    s0Var2.j(nVar.f26057h);
                }
                if (!Float.isNaN(nVar.f26058i)) {
                    s0Var2.k(nVar.f26058i);
                }
                if (!Float.isNaN(nVar.f26059j)) {
                    s0Var2.n(nVar.f26059j);
                }
                if (!Float.isNaN(nVar.f26060k)) {
                    s0Var2.x(nVar.f26060k);
                }
                if (!Float.isNaN(nVar.l)) {
                    s0Var2.y(nVar.l);
                }
                if (!Float.isNaN(nVar.f26061m)) {
                    s0Var2.q(nVar.f26061m);
                }
                if (!Float.isNaN(nVar.f26062n) || !Float.isNaN(nVar.f26063o)) {
                    s0Var2.o(Float.isNaN(nVar.f26062n) ? 1.0f : nVar.f26062n);
                    s0Var2.p(Float.isNaN(nVar.f26063o) ? 1.0f : nVar.f26063o);
                }
                if (!Float.isNaN(nVar.f26064p)) {
                    s0Var2.c(nVar.f26064p);
                }
                return Unit.f26487a;
            case 18:
                i4.s0 s0Var3 = (i4.s0) obj;
                i4.w0 w0Var = (i4.w0) obj2;
                s0Var3.o(w0Var.f23319o);
                s0Var3.p(w0Var.f23320p);
                s0Var3.c(w0Var.f23321q);
                s0Var3.x(0.0f);
                s0Var3.y(0.0f);
                s0Var3.q(w0Var.f23322r);
                s0Var3.j(0.0f);
                s0Var3.k(0.0f);
                s0Var3.n(w0Var.f23323s);
                float f11 = w0Var.f23324t;
                if (s0Var3.f23293m != f11) {
                    s0Var3.f23282a |= NewHope.SENDB_BYTES;
                    s0Var3.f23293m = f11;
                }
                s0Var3.w(w0Var.f23325u);
                s0Var3.u(w0Var.f23326v);
                s0Var3.g(w0Var.f23327w);
                if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                    s0Var3.f23282a |= 131072;
                }
                s0Var3.e(w0Var.f23328x);
                s0Var3.v(w0Var.f23329y);
                int i18 = w0Var.f23330z;
                if (s0Var3.f23300t != i18) {
                    s0Var3.f23282a |= 524288;
                    s0Var3.f23300t = i18;
                }
                if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                    s0Var3.f23282a |= 262144;
                }
                return Unit.f26487a;
            case 19:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return Unit.f26487a;
            case 20:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                i70.a aVar = ((i70.b) obj2).f23480b;
                aVar.addAll(arrayList);
                return aVar;
            case 21:
                String str = (String) obj;
                Object objOpt = ((JSONObject) obj2).opt(str);
                if (objOpt == null) {
                    return null;
                }
                try {
                    return URLEncoder.encode(str, ArticleContentView.UTF_8_ENCODING_TYPE) + '=' + URLEncoder.encode(objOpt.toString(), ArticleContentView.UTF_8_ENCODING_TYPE);
                } catch (Exception unused) {
                    return null;
                }
            case 22:
                j5.z.m((j5.b0) obj, ((j5.j) obj2).f24632a);
                return Unit.f26487a;
            case 23:
                j5.z.h((String) obj2, (j5.b0) obj);
                return Unit.f26487a;
            case 24:
                ((List) obj).add((Float) ((h2.j1) obj2).invoke());
                return true;
            case 25:
                k4.d dVar2 = (k4.d) obj;
                l4.b bVar = (l4.b) obj2;
                i4.h hVar = bVar.l;
                if (bVar.f27285n && bVar.f27294w && hVar != null) {
                    j30.g gVarG0 = dVar2.g0();
                    long jO = gVarG0.o();
                    gVarG0.i().e();
                    try {
                        ((j30.g) ((jd.f) gVarG0.f24502b).f24983b).i().c(hVar);
                        bVar.c(dVar2);
                    } finally {
                        r8.k.y(gVarG0, jO);
                    }
                } else {
                    bVar.c(dVar2);
                }
                return Unit.f26487a;
            case 26:
                ((n4.b) obj2).i((k4.d) obj);
                return Unit.f26487a;
            case 27:
                p4.d0 d0Var = (p4.d0) obj;
                p4.c cVar3 = (p4.c) obj2;
                cVar3.g(d0Var);
                Function1 function1 = cVar3.f34261i;
                if (function1 != null) {
                    function1.invoke(d0Var);
                }
                return Unit.f26487a;
            case 28:
                return obj == ((q1.b1) obj2) ? "(this)" : String.valueOf(obj);
            default:
                return obj == ((q1.d1) obj2) ? "(this)" : String.valueOf(obj);
        }
    }
}
