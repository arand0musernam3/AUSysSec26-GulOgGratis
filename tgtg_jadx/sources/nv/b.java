package nv;

import android.view.View;
import c5.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.d0;
import m5.j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f31400a = new d0(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f31401b = new d0(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f31402c = new d0(29);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f31403d = new a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31404e = new a(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31405f = new a(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f31406g = new a(3);

    public static final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1924170206);
        if (sVar.R(i11 & 1, i11 != 0)) {
            View view = (View) sVar.j(v0.f7394f);
            Unit unit = Unit.f26487a;
            boolean zH = sVar.h(view);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new d(0, view);
                sVar.k0(objM);
            }
            i.d(unit, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j0(i11);
        }
    }
}
