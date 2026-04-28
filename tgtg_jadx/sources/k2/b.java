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
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f25751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f25754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f25755e;

    public b(e1 e1Var, boolean z11, boolean z12, j jVar, Function0 function0) {
        this.f25751a = e1Var;
        this.f25752b = z11;
        this.f25753c = z12;
        this.f25754d = jVar;
        this.f25755e = function0;
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
        t tVarThen = b1.a(q.f5711a, lVar, this.f25751a).then(new a(this.f25752b, lVar, null, this.f25753c, this.f25754d, this.f25755e));
        sVar.q(false);
        return tVarThen;
    }
}
