package e70;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m1;
import cp.i;
import f70.g;
import kotlin.jvm.functions.Function1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.b f15848b;

    public c(g gVar, av.b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f15847a = gVar;
        this.f15848b = bVar;
    }

    public static /* synthetic */ void b(c cVar, ComponentActivity componentActivity, Function1 function1, int i11) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        if ((i11 & 4) != 0) {
            function1 = new i(19);
        }
        cVar.a(componentActivity, state, function1);
    }

    public final void a(ComponentActivity componentActivity, Lifecycle.State state, Function1 function1) {
        componentActivity.getClass();
        state.getClass();
        function1.getClass();
        f0.B(m1.c(componentActivity), null, null, new b(componentActivity, state, this, function1, null), 3);
    }
}
