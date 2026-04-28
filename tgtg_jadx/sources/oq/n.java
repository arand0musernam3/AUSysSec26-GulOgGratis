package oq;

import at.c0;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import y80.a2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qq.c f32942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f32943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f32944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f32945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f32946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f32947f;

    public n(qq.c cVar, cv.b bVar, o oVar, c0 c0Var) {
        cVar.getClass();
        bVar.getClass();
        oVar.getClass();
        c0Var.getClass();
        this.f32942a = cVar;
        this.f32943b = bVar;
        this.f32944c = oVar;
        this.f32945d = c0Var;
        this.f32946e = y80.r.a(0, 2, x80.a.DROP_OLDEST);
        this.f32947f = y80.r.c(t.f32954a);
    }

    public final C2CReferralResponse a() {
        u uVar = (u) this.f32947f.getValue();
        if (uVar instanceof s) {
            return ((s) uVar).f32952a;
        }
        if (uVar instanceof r) {
            return ((r) uVar).f32951a;
        }
        if (uVar instanceof p) {
            return ((p) uVar).f32949a;
        }
        return null;
    }
}
