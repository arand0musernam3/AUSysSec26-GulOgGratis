package r0;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m0.a0;
import m0.b0;
import s0.s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f37484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f37485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f37486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f37489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f37490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f37491i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ListenableFuture f37493k;
    public int l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f37492j = new ArrayList();

    public n(a0 a0Var, f fVar, o oVar, ListenableFuture listenableFuture, int i11) {
        this.f37483a = i11;
        this.f37484b = fVar;
        this.f37485c = fVar.f37454e;
        this.f37488f = fVar.f37458i;
        this.f37487e = fVar.f37457h;
        this.f37486d = fVar.f37455f;
        this.f37489g = fVar.f37456g;
        this.f37490h = oVar;
        this.f37491i = String.valueOf(a0Var.hashCode());
        List<s0> list = a0Var.f28461a;
        Objects.requireNonNull(list);
        for (s0 s0Var : list) {
            ArrayList arrayList = this.f37492j;
            s0Var.getClass();
            arrayList.add(0);
        }
        this.f37493k = listenableFuture;
        wd.a.p("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.f37483a + ", mTagBundleKey = " + this.f37491i);
    }

    public final void a(int i11) {
        if (this.l != i11) {
            this.l = i11;
            a.a.t();
            o oVar = this.f37490h;
            if (oVar.f37500g) {
                return;
            }
            f fVar = oVar.f37494a;
            fVar.f37452c.execute(new bx.c(fVar, i11));
        }
    }
}
