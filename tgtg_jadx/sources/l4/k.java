package l4;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import c5.v3;
import i4.t;
import i4.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v3 f27370k = new v3(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4.a f27371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f27372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.b f27373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f27375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z5.c f27377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f27378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function1 f27379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f27380j;

    public k(m4.a aVar, u uVar, k4.b bVar) {
        super(aVar.getContext());
        this.f27371a = aVar;
        this.f27372b = uVar;
        this.f27373c = bVar;
        setOutlineProvider(f27370k);
        this.f27376f = true;
        this.f27377g = k4.c.f25941a;
        this.f27378h = m.Ltr;
        d.f27298a.getClass();
        this.f27379i = c.f27297b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u uVar = this.f27372b;
        i4.c cVar = uVar.f23304a;
        Canvas canvas2 = cVar.f23230a;
        cVar.f23230a = canvas;
        z5.c cVar2 = this.f27377g;
        m mVar = this.f27378h;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.f27380j;
        Function1 function1 = this.f27379i;
        k4.b bVar2 = this.f27373c;
        j30.g gVar = bVar2.f25938b;
        k4.a aVar = ((k4.b) gVar.f24504d).f25937a;
        z5.c cVar3 = aVar.f25933a;
        m mVar2 = aVar.f25934b;
        t tVarI = gVar.i();
        j30.g gVar2 = bVar2.f25938b;
        long jO = gVar2.o();
        b bVar3 = (b) gVar2.f24503c;
        gVar2.y(cVar2);
        gVar2.A(mVar);
        gVar2.x(cVar);
        gVar2.B(jFloatToRawIntBits);
        gVar2.f24503c = bVar;
        cVar.e();
        try {
            function1.invoke(bVar2);
            cVar.o();
            gVar2.y(cVar3);
            gVar2.A(mVar2);
            gVar2.x(tVarI);
            gVar2.B(jO);
            gVar2.f24503c = bVar3;
            uVar.f23304a.f23230a = canvas2;
            this.f27374d = false;
        } catch (Throwable th2) {
            cVar.o();
            gVar2.y(cVar3);
            gVar2.A(mVar2);
            gVar2.x(tVarI);
            gVar2.B(jO);
            gVar2.f24503c = bVar3;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f27376f;
    }

    @NotNull
    public final u getCanvasHolder() {
        return this.f27372b;
    }

    @NotNull
    public final View getOwnerView() {
        return this.f27371a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f27376f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f27374d) {
            return;
        }
        this.f27374d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z11) {
        if (this.f27376f != z11) {
            this.f27376f = z11;
            invalidate();
        }
    }

    public final void setDrawParams(@NotNull z5.c cVar, @NotNull m mVar, @Nullable b bVar, @NotNull Function1<? super k4.d, Unit> function1) {
        this.f27377g = cVar;
        this.f27378h = mVar;
        this.f27379i = function1;
        this.f27380j = bVar;
    }

    public final void setInvalidated(boolean z11) {
        this.f27374d = z11;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
