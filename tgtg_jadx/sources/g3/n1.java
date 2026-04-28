package g3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka f19132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.b1 f19133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.s f19134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f19135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f19136e = new m1(this);

    public n1(ka kaVar, t1.b1 b1Var, t1.s sVar, Function0 function0) {
        this.f19132a = kaVar;
        this.f19133b = b1Var;
        this.f19134c = sVar;
        this.f19135d = function0;
    }

    @Override // g3.ja
    public final t1.s a() {
        return this.f19134c;
    }

    @Override // g3.ja
    public final t1.i b() {
        return this.f19133b;
    }

    @Override // g3.ja
    public final boolean c() {
        return false;
    }

    @Override // g3.ja
    public final ka getState() {
        return this.f19132a;
    }
}
