package rk;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import c5.s0;
import kotlin.jvm.functions.Function1;
import m3.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.f f38077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f38078c;

    public /* synthetic */ j(rt.f fVar, LifecycleOwner lifecycleOwner, int i11) {
        this.f38076a = i11;
        this.f38077b = fVar;
        this.f38078c = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f38076a;
        ((l0) obj).getClass();
        switch (i11) {
            case 0:
                rt.f fVar = this.f38077b;
                fVar.b(null);
                fVar.h();
                fVar.f();
                Lifecycle lifecycle = this.f38078c.getLifecycle();
                k kVar = new k(fVar, 0);
                lifecycle.a(kVar);
                return new s0(14, lifecycle, kVar);
            default:
                rt.f fVar2 = this.f38077b;
                fVar2.b(null);
                fVar2.h();
                fVar2.f();
                Lifecycle lifecycle2 = this.f38078c.getLifecycle();
                k kVar2 = new k(fVar2, 1);
                lifecycle2.a(kVar2);
                return new s0(20, lifecycle2, kVar2);
        }
    }
}
