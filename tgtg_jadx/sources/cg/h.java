package cg;

import g3.g6;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7985d;

    public /* synthetic */ h(float f11, int i11, Function0 function0, Function0 function02) {
        this.f7982a = 1;
        this.f7983b = f11;
        this.f7984c = function0;
        this.f7985d = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7982a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                i.b((he.k) this.f7984c, this.f7983b, (ArrayList) this.f7985d, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(1);
                cp.a.j(this.f7983b, (Function0) this.f7984c, (Function0) this.f7985d, (m3.n) obj, iF2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(385);
                g6.c((b4.t) this.f7984c, this.f7983b, (u3.d) this.f7985d, (m3.n) obj, iF3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(Object obj, float f11, Object obj2, int i11, int i12) {
        this.f7982a = i12;
        this.f7984c = obj;
        this.f7983b = f11;
        this.f7985d = obj2;
    }
}
