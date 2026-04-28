package b0;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements r0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5064c;

    public b0(r0 r0Var, int i11, int i12) {
        this.f5062a = r0Var;
        this.f5063b = i11;
        this.f5064c = i12;
    }

    @Override // r0.g
    public final ListenableFuture a() {
        r0 r0Var = this.f5062a;
        a90.d dVar = r0Var.f5384e.f5265a;
        int i11 = this.f5063b;
        int i12 = this.f5064c;
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            iVar.f15776a = v80.f0.B(dVar, null, null, new y(iVar, (x70.c) null, r0Var, i11, i12, 1), 3);
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }

    @Override // r0.g
    public final ListenableFuture b() {
        r0 r0Var = this.f5062a;
        a90.d dVar = r0Var.f5384e.f5265a;
        int i11 = this.f5063b;
        int i12 = this.f5064c;
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = z.class;
        try {
            iVar.f15776a = v80.f0.B(dVar, null, null, new y(iVar, (x70.c) null, r0Var, i11, i12, 0), 3);
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }
}
