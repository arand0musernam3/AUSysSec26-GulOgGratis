package e4;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import i4.t;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.d f15731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f15733c;

    public c(z5.d dVar, long j9, Function1 function1) {
        this.f15731a = dVar;
        this.f15732b = j9;
        this.f15733c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        k4.b bVar = new k4.b();
        z5.m mVar = z5.m.Ltr;
        Canvas canvas2 = i4.d.f23233a;
        i4.c cVar = new i4.c();
        cVar.f23230a = canvas;
        k4.a aVar = bVar.f25937a;
        z5.c cVar2 = aVar.f25933a;
        z5.m mVar2 = aVar.f25934b;
        t tVar = aVar.f25935c;
        long j9 = aVar.f25936d;
        aVar.f25933a = this.f15731a;
        aVar.f25934b = mVar;
        aVar.f25935c = cVar;
        aVar.f25936d = this.f15732b;
        cVar.e();
        this.f15733c.invoke(bVar);
        cVar.o();
        aVar.f25933a = cVar2;
        aVar.f25934b = mVar2;
        aVar.f25935c = tVar;
        aVar.f25936d = j9;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j9 = this.f15732b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        z5.d dVar = this.f15731a;
        point.set(dVar.q0(fIntBitsToFloat / dVar.a()), dVar.q0(Float.intBitsToFloat((int) (j9 & 4294967295L)) / dVar.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
