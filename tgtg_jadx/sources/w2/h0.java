package w2;

import a3.l3;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c5.u3;
import c5.x2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import t1.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f42911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f42912b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2.e1 f42915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l3 f42916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u3 f42917g;
    public Rect l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f42922m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f42913c = new w1(29);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f42914d = new g0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r5.y f42918h = new r5.y(4, m5.t0.f29648b, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r5.m f42919i = r5.m.f37688g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f42920j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f42921k = u70.l.a(u70.m.NONE, new rv.a(this, 23));

    public h0(View view, a aVar, z zVar) {
        this.f42911a = view;
        this.f42912b = zVar;
        this.f42922m = new d0(aVar, zVar);
    }

    @Override // c5.x2
    public final InputConnection a(EditorInfo editorInfo) {
        r5.y yVar = this.f42918h;
        c0.z(editorInfo, yVar.f37714a.f29538b, yVar.f37715b, this.f42919i);
        e0 e0Var = f0.f42889a;
        if (l8.j.d()) {
            l8.j.a().i(editorInfo);
        }
        l0 l0Var = new l0(this.f42918h, new t10.c(this), this.f42919i.f37691c, this.f42915e, this.f42916f, this.f42917g);
        this.f42920j.add(new WeakReference(l0Var));
        return l0Var;
    }
}
