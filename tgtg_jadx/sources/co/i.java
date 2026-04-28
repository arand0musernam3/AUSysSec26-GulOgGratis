package co;

import android.content.SharedPreferences;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import m3.g1;
import v80.b0;
import v80.f0;
import z1.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f8753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f8754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f8758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f8759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f8760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b1 f8761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1 f8762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f8763k;

    public i(int i11, long j9, p pVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, g1 g1Var, g1 g1Var2, g1 g1Var3, b0 b0Var) {
        this.f8753a = b1Var;
        this.f8754b = b1Var2;
        this.f8755c = pVar;
        this.f8756d = j9;
        this.f8757e = i11;
        this.f8758f = b0Var;
        this.f8759g = g1Var;
        this.f8760h = g1Var2;
        this.f8761i = b1Var3;
        this.f8762j = b1Var4;
        this.f8763k = g1Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        final b1 b1Var = this.f8753a;
        final b1 b1Var2 = this.f8754b;
        g gVar = new g(b1Var, b1Var2, 0);
        final int i11 = this.f8757e;
        final long j9 = this.f8756d;
        final p pVar = this.f8755c;
        final b1 b1Var3 = this.f8761i;
        final b1 b1Var4 = this.f8762j;
        final g1 g1Var = this.f8759g;
        final g1 g1Var2 = this.f8760h;
        final g1 g1Var3 = this.f8763k;
        final b0 b0Var = this.f8758f;
        Object objE = y0.e(yVar, gVar, new Function0() { // from class: co.h
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                g1 g1Var4 = g1Var;
                float fH = g1Var4.h();
                float fD = d70.b.d(82);
                float fD2 = d70.b.d(23);
                float f11 = lv.t.f28253g;
                long j11 = j9;
                p pVar2 = pVar;
                float fD3 = (((int) (4294967295L & j11)) - pVar2.f8782b) - d70.b.d((80 + f11) + 56);
                float f12 = pVar2.f8781a + fD + fD2;
                if (fH < f12) {
                    g1Var4.i(f12);
                } else if (fH > fD3) {
                    g1Var4.i(fD3);
                }
                a aVar = c.Companion;
                g1 g1Var5 = g1Var2;
                float fH2 = g1Var5.h();
                aVar.getClass();
                c cVar2 = fH2 > ((float) i11) ? c.END : c.START;
                b1 b1Var5 = b1Var3;
                b1Var5.setValue(cVar2);
                c cVar3 = (c) b1Var5.getValue();
                b1 b1Var6 = b1Var4;
                float fA = cVar3.a((q) b1Var6.getValue(), (int) (j11 >> 32));
                g1 g1Var6 = g1Var3;
                g1Var6.i(fA);
                g1Var5.i(g1Var6.h());
                b1 b1Var7 = b1Var;
                p30.b.c(b1Var7, false);
                b1Var2.setValue(f0.B(b0Var, null, null, new o(new d(b1Var7, b1Var6, 1), 0 == true ? 1 : 0, 0), 3));
                c cVar4 = (c) b1Var5.getValue();
                float fH3 = g1Var4.h();
                cVar4.getClass();
                SharedPreferences.Editor editorEdit = ft.c.x().edit();
                String strY = ft.c.y();
                if (strY == null) {
                    strY = null;
                }
                editorEdit.putString(r8.k.l(strY, "_orderBlobAlignment"), cVar4.name());
                editorEdit.apply();
                SharedPreferences.Editor editorEdit2 = ft.c.x().edit();
                String strY2 = ft.c.y();
                editorEdit2.putFloat((strY2 != null ? strY2 : null) + "_orderBlobOffsetY", fH3);
                editorEdit2.apply();
                return Unit.f26487a;
            }
        }, new yu.a(11), new an.d(g1Var, g1Var2, g1Var3, 5), cVar);
        return objE == y70.a.COROUTINE_SUSPENDED ? objE : Unit.f26487a;
    }
}
