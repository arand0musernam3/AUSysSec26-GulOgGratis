package k2;

import b2.l;
import b4.q;
import b4.t;
import i80.n;
import j5.j;
import kotlin.jvm.functions.Function0;
import m3.m;
import m3.s;
import v1.b1;
import v1.e1;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f25762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l5.a f25763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f25765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f25766e;

    public f(e1 e1Var, l5.a aVar, boolean z11, j jVar, Function0 function0) {
        this.f25762a = e1Var;
        this.f25763b = aVar;
        this.f25764c = z11;
        this.f25765d = jVar;
        this.f25766e = function0;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        s sVar = (s) ((m3.n) obj2);
        sVar.a0(-1525724089);
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            objM = a0.g(sVar);
        }
        l lVar = (l) objM;
        t tVarThen = b1.a(q.f5711a, lVar, this.f25762a).then(new h(this.f25763b, lVar, null, this.f25764c, this.f25765d, this.f25766e));
        sVar.q(false);
        return tVarThen;
    }
}
