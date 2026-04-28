package bm;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.services.user.AuthPolling;
import ib.a0;
import ib.x;
import ib.z;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import jb.s;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;
import y80.g1;
import y80.m1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbm/p;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoginCharityVerifyEmailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginCharityVerifyEmailViewModel.kt\ncom/app/tgtg/feature/logincharity/ui/email/verify/LoginCharityVerifyEmailViewModel\n+ 2 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n*L\n1#1,127:1\n43#2,3:128\n43#2,3:131\n*S KotlinDebug\n*F\n+ 1 LoginCharityVerifyEmailViewModel.kt\ncom/app/tgtg/feature/logincharity/ui/email/verify/LoginCharityVerifyEmailViewModel\n*L\n43#1:128,3\n46#1:131,3\n*E\n"})
public final class p extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f6379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f6381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.b f6382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8.f f6383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1 f6384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f6385g;

    public p(g3 g3Var, s sVar, c1 c1Var, cv.b bVar, d8.f fVar) {
        g3Var.getClass();
        c1Var.getClass();
        bVar.getClass();
        fVar.getClass();
        this.f6379a = g3Var;
        this.f6380b = sVar;
        this.f6381c = c1Var;
        this.f6382d = bVar;
        this.f6383e = fVar;
        m1 m1VarB = r.b(0, 0, null, 7);
        this.f6384f = m1VarB;
        this.f6385g = new g1(m1VarB);
        cv.i iVar = cv.i.SCREEN_CHARITY_LOGIN_VERIFY_EMAIL;
        iVar.getClass();
        bVar.b(iVar);
        z zVar = new z(AuthPolling.class, 0);
        x xVar = x.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        x xVar2 = x.CONNECTED;
        xVar2.getClass();
        ((qb.o) zVar.f23742b).f36837j = new ib.e(new rb.f(null), xVar2, false, false, false, false, -1L, -1L, CollectionsKt.v0(linkedHashSet));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o0 o0Var = o0.f26530a;
        linkedHashMap.put("email", ((am.l) e0.f.f(o0Var, am.l.class, c1Var, o0Var)).f1613b);
        o0Var.getClass();
        linkedHashMap.put("pollingId", ((am.l) a.a.Q(c1Var, Reflection.getOrCreateKotlinClass(am.l.class), o0Var)).f1614c);
        ib.h hVar = new ib.h(linkedHashMap);
        ex.i.L(hVar);
        ((qb.o) zVar.f23742b).f36832e = hVar;
        a0 a0Var = (a0) zVar.a();
        sVar.c("UserPolling2", ib.m.REPLACE, a0Var);
        f0.B(androidx.lifecycle.m1.d(this), null, null, new a3.x(this, a0Var, null, 17), 3);
    }
}
