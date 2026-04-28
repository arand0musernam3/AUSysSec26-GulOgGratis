package r2;

import a40.q;
import android.view.ActionMode;
import android.view.View;
import b0.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import v1.l1;
import z3.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements t2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f37550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f37551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f37552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f37553d = new l1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f37554e = new x(new a(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f37555f = new a(this, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f37556g = new a(this, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMode f37557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f37558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f37559j;

    public f(View view, Function1 function1, Function0 function0) {
        this.f37550a = view;
        this.f37551b = function1;
        this.f37552c = function0;
    }

    @Override // t2.e
    public final Object a(t2.d dVar, z70.i iVar) {
        Object objB = l1.b(this.f37553d, new r2(this, dVar, null, 5), iVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }
}
