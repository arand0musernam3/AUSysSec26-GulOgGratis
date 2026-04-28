package b5;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements z4.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f5983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f5984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f5985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f5986f;

    public t0(int i11, int i12, Map map, Function1 function1, Function1 function12, u0 u0Var) {
        this.f5981a = i11;
        this.f5982b = i12;
        this.f5983c = map;
        this.f5984d = function1;
        this.f5985e = function12;
        this.f5986f = u0Var;
    }

    @Override // z4.v0
    public final void a() {
        this.f5985e.invoke(this.f5986f.l);
    }

    @Override // z4.v0
    public final int b() {
        return this.f5981a;
    }

    @Override // z4.v0
    public final Map c() {
        return this.f5983c;
    }

    @Override // z4.v0
    public final Function1 d() {
        return this.f5984d;
    }

    @Override // z4.v0
    public final int getHeight() {
        return this.f5982b;
    }
}
