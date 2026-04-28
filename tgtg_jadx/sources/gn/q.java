package gn;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements vz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f20642b;

    public /* synthetic */ q(int i11, Function2 function2) {
        this.f20641a = i11;
        this.f20642b = function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void a() {
        Function2 function2 = this.f20642b;
        synchronized (z3.l.f47038c) {
            z3.l.f47043h = CollectionsKt.Z(z3.l.f47043h, function2);
        }
    }

    @Override // vz.a
    public void accept(Object obj, Object obj2) {
        switch (this.f20641a) {
            case 0:
                mq.a aVar = (mq.a) obj;
                lq.j jVar = (lq.j) obj2;
                aVar.getClass();
                jVar.getClass();
                this.f20642b.invoke(aVar, jVar);
                break;
            case 1:
                lq.m mVar = (lq.m) obj;
                lq.l lVar = (lq.l) obj2;
                mVar.getClass();
                lVar.getClass();
                this.f20642b.invoke(mVar, lVar);
                break;
            default:
                mq.a aVar2 = (mq.a) obj;
                lq.j jVar2 = (lq.j) obj2;
                aVar2.getClass();
                jVar2.getClass();
                this.f20642b.invoke(aVar2, jVar2);
                break;
        }
    }
}
