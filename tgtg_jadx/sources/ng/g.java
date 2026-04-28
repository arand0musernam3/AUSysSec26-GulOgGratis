package ng;

import androidx.lifecycle.l1;
import hv.j;
import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
import y80.a2;
import y80.g1;
import y80.h1;
import y80.m1;
import y80.r;
import y80.x1;
import zendesk.android.Zendesk;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lng/g;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.c f30840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv.b f30841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f30842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f30843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f30844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1 f30845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1 f30846g;

    public g(ao.c cVar, mv.b bVar, hv.b bVar2) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f30840a = cVar;
        this.f30841b = bVar;
        j jVar = (j) bVar2;
        hv.g gVar = jVar.f22538j;
        if (gVar != null) {
            Zendesk.INSTANCE.getInstance().removeEventListener(gVar);
        }
        jVar.f22538j = null;
        Zendesk.INSTANCE.invalidate();
        jVar.f22537i.set(false);
        a2 a2VarC = r.c(bVar.f30152c);
        this.f30842c = a2VarC;
        this.f30843d = new h1(a2VarC);
        m1 m1VarB = r.b(0, 0, null, 7);
        this.f30844e = m1VarB;
        this.f30845f = new g1(m1VarB);
        this.f30846g = r.x(cVar.f4198f, androidx.lifecycle.m1.d(this), new x1(0L, LongCompanionObject.MAX_VALUE), null);
    }
}
