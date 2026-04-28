package g3;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.r f19344b;

    public /* synthetic */ q(z3.r rVar, int i11) {
        this.f19343a = i11;
        this.f19344b = rVar;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f19343a) {
            case 0:
                b2.j jVar = (b2.j) obj;
                boolean z11 = jVar instanceof b2.h;
                z3.r rVar = this.f19344b;
                if (z11) {
                    rVar.add(jVar);
                } else if (jVar instanceof b2.i) {
                    rVar.remove(((b2.i) jVar).f5562a);
                } else if (jVar instanceof b2.d) {
                    rVar.add(jVar);
                } else if (jVar instanceof b2.e) {
                    rVar.remove(((b2.e) jVar).f5555a);
                } else if (jVar instanceof b2.n) {
                    rVar.add(jVar);
                } else if (jVar instanceof b2.o) {
                    rVar.remove(((b2.o) jVar).f5566a);
                } else if (jVar instanceof b2.m) {
                    rVar.remove(((b2.m) jVar).f5564a);
                }
                break;
            case 1:
                b2.j jVar2 = (b2.j) obj;
                boolean z12 = jVar2 instanceof b2.h;
                z3.r rVar2 = this.f19344b;
                if (z12) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof b2.i) {
                    rVar2.remove(((b2.i) jVar2).f5562a);
                } else if (jVar2 instanceof b2.d) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof b2.e) {
                    rVar2.remove(((b2.e) jVar2).f5555a);
                } else if (jVar2 instanceof b2.n) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof b2.o) {
                    rVar2.remove(((b2.o) jVar2).f5566a);
                } else if (jVar2 instanceof b2.m) {
                    rVar2.remove(((b2.m) jVar2).f5564a);
                } else if (jVar2 instanceof b2.b) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof b2.c) {
                    rVar2.remove(((b2.c) jVar2).f5554a);
                } else if (jVar2 instanceof b2.a) {
                    rVar2.remove(((b2.a) jVar2).f5553a);
                }
                break;
            default:
                b2.j jVar3 = (b2.j) obj;
                boolean z13 = jVar3 instanceof b2.h;
                z3.r rVar3 = this.f19344b;
                if (z13) {
                    rVar3.add(jVar3);
                } else if (jVar3 instanceof b2.i) {
                    rVar3.remove(((b2.i) jVar3).f5562a);
                } else if (jVar3 instanceof b2.d) {
                    rVar3.add(jVar3);
                } else if (jVar3 instanceof b2.e) {
                    rVar3.remove(((b2.e) jVar3).f5555a);
                } else if (jVar3 instanceof b2.n) {
                    rVar3.add(jVar3);
                } else if (jVar3 instanceof b2.o) {
                    rVar3.remove(((b2.o) jVar3).f5566a);
                } else if (jVar3 instanceof b2.m) {
                    rVar3.remove(((b2.m) jVar3).f5564a);
                } else if (jVar3 instanceof b2.b) {
                    rVar3.add(jVar3);
                } else if (jVar3 instanceof b2.c) {
                    rVar3.remove(((b2.c) jVar3).f5554a);
                } else if (jVar3 instanceof b2.a) {
                    rVar3.remove(((b2.a) jVar3).f5553a);
                }
                break;
        }
        return Unit.f26487a;
    }
}
