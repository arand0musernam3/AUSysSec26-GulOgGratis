package d90;

import a90.t;
import a90.v;
import i80.n;
import v80.r0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f14769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f14770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f14772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f14773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f14774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14775h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f14776i;

    public c(e eVar, Object obj, n nVar, n nVar2, v vVar, i iVar, n nVar3) {
        this.f14776i = eVar;
        this.f14768a = obj;
        this.f14769b = nVar;
        this.f14770c = nVar2;
        this.f14771d = vVar;
        this.f14772e = iVar;
        this.f14773f = nVar3;
    }

    public final void a() {
        Object obj = this.f14774g;
        if (obj instanceof t) {
            ((t) obj).h(this.f14775h, this.f14776i.f14781a);
            return;
        }
        r0 r0Var = obj instanceof r0 ? (r0) obj : null;
        if (r0Var != null) {
            r0Var.a();
        }
    }
}
