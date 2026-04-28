package z4;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f47160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f47161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f47162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f47163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f47164g;

    public k0(int i11, int i12, Map map, Function1 function1, l0 l0Var, q0 q0Var, Function1 function12) {
        this.f47158a = i11;
        this.f47159b = i12;
        this.f47160c = map;
        this.f47161d = function1;
        this.f47162e = l0Var;
        this.f47163f = q0Var;
        this.f47164g = function12;
    }

    @Override // z4.v0
    public final void a() {
        b5.w wVar;
        b5.m0 m0Var = this.f47163f.f47200a;
        boolean Z = this.f47162e.Z();
        Function1 function1 = this.f47164g;
        if (!Z || (wVar = m0Var.G.f5857c.Z) == null) {
            function1.invoke(m0Var.G.f5857c.l);
        } else {
            function1.invoke(wVar.l);
        }
    }

    @Override // z4.v0
    public final int b() {
        return this.f47158a;
    }

    @Override // z4.v0
    public final Map c() {
        return this.f47160c;
    }

    @Override // z4.v0
    public final Function1 d() {
        return this.f47161d;
    }

    @Override // z4.v0
    public final int getHeight() {
        return this.f47159b;
    }
}
