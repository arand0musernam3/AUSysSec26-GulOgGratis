package h2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f21251a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c40.q f21253c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21256f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8.h f21252b = new a8.h(29);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21254d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21255e = -1;

    public z0(Function1 function1) {
        this.f21251a = function1;
    }

    public final x0 a(int i11, long j9, boolean z11, Function1 function1) {
        c40.q qVar = this.f21253c;
        if (qVar == null) {
            return i.f21131a;
        }
        p1 p1Var = (p1) qVar.f7095e;
        boolean z12 = p1Var instanceof b;
        n1 n1Var = new n1(qVar, i11, this.f21252b, function1);
        n1Var.f21187d = new z5.a(j9);
        if (!z12) {
            p1Var.a(n1Var);
        } else if (z11) {
            b bVar = (b) p1Var;
            bVar.f21035b.add(new s1(1, n1Var));
            if (!bVar.f21036c) {
                bVar.f21036c = true;
                bVar.f21034a.post(bVar);
            }
        } else {
            b bVar2 = (b) p1Var;
            bVar2.f21035b.add(new s1(0, n1Var));
            if (!bVar2.f21036c) {
                bVar2.f21036c = true;
                bVar2.f21034a.post(bVar2);
            }
        }
        b6.a.A(i11, "compose:lazy:schedule_prefetch:index");
        return n1Var;
    }
}
