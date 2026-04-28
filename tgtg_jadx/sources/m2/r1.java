package m2;

import a3.l3;
import a3.s3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f29059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f29060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.y f29061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s3 f29064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r5.s f29065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2 f29066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0 f29067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f29068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Function1 f29069k;
    public final int l;

    public r1(e1 e1Var, l3 l3Var, r5.y yVar, boolean z11, boolean z12, s3 s3Var, r5.s sVar, h2 h2Var, s0 s0Var, Function1 function1, int i11) {
        q qVar = g0.f28858b;
        this.f29059a = e1Var;
        this.f29060b = l3Var;
        this.f29061c = yVar;
        this.f29062d = z11;
        this.f29063e = z12;
        this.f29064f = s3Var;
        this.f29065g = sVar;
        this.f29066h = h2Var;
        this.f29067i = s0Var;
        this.f29068j = qVar;
        this.f29069k = function1;
        this.l = i11;
    }

    public final void a(List list) {
        r5.h hVar = this.f29059a.f28821d;
        ArrayList arrayListT0 = CollectionsKt.t0(list);
        arrayListT0.add(0, new r5.j());
        this.f29069k.invoke(hVar.a(arrayListT0));
    }
}
