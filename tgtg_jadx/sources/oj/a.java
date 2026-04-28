package oj;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import h2.b1;
import kotlin.Metadata;
import nj.t;
import nj.x;
import v80.f0;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loj/a;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f32573b;

    public a(t tVar, c1 c1Var) {
        tVar.getClass();
        c1Var.getClass();
        this.f32572a = tVar;
        this.f32573b = r.c(x.f30964a);
        f0.B(m1.d(this), null, null, new b1(this, null, 23), 3);
        Boolean bool = (Boolean) c1Var.a("IS_FROM_APP_START");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) c1Var.a("IS_LOGGED_IN");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = (Boolean) c1Var.a("IS_FROM_DEEPLINK");
        tVar.f30955g.i(new nj.a(zBooleanValue, zBooleanValue2, bool3 != null ? bool3.booleanValue() : false));
    }
}
