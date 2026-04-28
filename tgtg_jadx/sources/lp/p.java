package lp;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4.t f28085d;

    public /* synthetic */ p(String str, String str2, b4.t tVar, int i11) {
        this.f28082a = 1;
        this.f28083b = str;
        this.f28084c = str2;
        this.f28085d = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f28082a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                d.u(m3.i.F(1), this.f28085d, this.f28083b, this.f28084c, nVar);
                break;
            case 1:
                oo.a.C(m3.i.F(385), this.f28085d, this.f28083b, this.f28084c, nVar);
                break;
            default:
                e0.e(m3.i.F(1), this.f28085d, this.f28083b, this.f28084c, nVar);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p(int i11, int i12, b4.t tVar, String str, String str2) {
        this.f28082a = i12;
        this.f28085d = tVar;
        this.f28083b = str;
        this.f28084c = str2;
    }
}
