package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19438k;
    public final /* synthetic */ t1.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f19439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f19440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b2.j f19441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f19442p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t1.b bVar, float f11, boolean z11, b2.j jVar, m3.b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f19437j = 2;
        this.l = bVar;
        this.f19439m = f11;
        this.f19440n = z11;
        this.f19441o = jVar;
        this.f19442p = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f19437j) {
            case 0:
                return new s(this.l, this.f19439m, this.f19440n, (t) this.f19442p, this.f19441o, cVar, 0);
            case 1:
                return new s(this.l, this.f19439m, this.f19440n, (v) this.f19442p, this.f19441o, cVar, 1);
            default:
                return new s(this.l, this.f19439m, this.f19440n, this.f19441o, (m3.b1) this.f19442p, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f19437j) {
        }
        return ((s) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19437j) {
            case 0:
                t tVar = (t) this.f19442p;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f19438k;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        ba0.g.M(obj);
                    } else {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1.b bVar = this.l;
                    float f11 = ((z5.f) bVar.f39361e.getValue()).f47277a;
                    float f12 = this.f19439m;
                    if (!z5.f.c(f11, f12)) {
                        if (this.f19440n) {
                            float f13 = ((z5.f) bVar.f39361e.getValue()).f47277a;
                            b2.j nVar = z5.f.c(f13, tVar.f19491b) ? new b2.n(0L) : z5.f.c(f13, tVar.f19493d) ? new b2.h() : z5.f.c(f13, tVar.f19492c) ? new b2.d() : null;
                            this.f19438k = 2;
                            if (i3.t.a(bVar, f12, nVar, this.f19441o, this) == aVar) {
                            }
                        } else {
                            z5.f fVar = new z5.f(f12);
                            this.f19438k = 1;
                            if (bVar.f(fVar, this) == aVar) {
                            }
                        }
                    }
                }
                break;
            case 1:
                v vVar = (v) this.f19442p;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f19438k;
                if (i12 != 0) {
                    if (i12 == 1 || i12 == 2) {
                        ba0.g.M(obj);
                    } else {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1.b bVar2 = this.l;
                    float f14 = ((z5.f) bVar2.f39361e.getValue()).f47277a;
                    float f15 = this.f19439m;
                    if (!z5.f.c(f14, f15)) {
                        if (this.f19440n) {
                            float f16 = ((z5.f) bVar2.f39361e.getValue()).f47277a;
                            b2.j nVar2 = z5.f.c(f16, vVar.f19601b) ? new b2.n(0L) : z5.f.c(f16, vVar.f19603d) ? new b2.h() : z5.f.c(f16, vVar.f19602c) ? new b2.d() : z5.f.c(f16, vVar.f19604e) ? new b2.b() : null;
                            this.f19438k = 2;
                            if (i3.t.a(bVar2, f15, nVar2, this.f19441o, this) == aVar2) {
                            }
                        } else {
                            z5.f fVar2 = new z5.f(f15);
                            this.f19438k = 1;
                            if (bVar2.f(fVar2, this) == aVar2) {
                            }
                        }
                    }
                }
                break;
            default:
                m3.b1 b1Var = (m3.b1) this.f19442p;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f19438k;
                b2.j jVar = this.f19441o;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar3 = this.l;
                    float f17 = ((z5.f) bVar3.f39361e.getValue()).f47277a;
                    float f18 = this.f19439m;
                    if (!z5.f.c(f17, f18)) {
                        if (this.f19440n) {
                            b2.j jVar2 = (b2.j) b1Var.getValue();
                            this.f19438k = 2;
                            if (i3.t.a(bVar3, f18, jVar2, jVar, this) == aVar3) {
                            }
                        } else {
                            z5.f fVar3 = new z5.f(f18);
                            this.f19438k = 1;
                            if (bVar3.f(fVar3, this) == aVar3) {
                            }
                        }
                    }
                } else if (i13 == 1 || i13 == 2) {
                    ba0.g.M(obj);
                } else {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                }
                b1Var.setValue(jVar);
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t1.b bVar, float f11, boolean z11, Object obj, b2.j jVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f19437j = i11;
        this.l = bVar;
        this.f19439m = f11;
        this.f19440n = z11;
        this.f19442p = obj;
        this.f19441o = jVar;
    }
}
