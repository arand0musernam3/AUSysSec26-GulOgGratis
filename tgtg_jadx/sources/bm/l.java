package bm;

import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6367a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f6369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f6370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6371e;

    public /* synthetic */ l(t tVar, String str, Function1 function1, int i11) {
        this.f6370d = tVar;
        this.f6368b = str;
        this.f6369c = function1;
        this.f6371e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6367a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.b(m3.i.F(this.f6371e | 1), this.f6370d, this.f6368b, this.f6369c, nVar);
                break;
            default:
                tp.b.e(m3.i.F(this.f6371e | 1), this.f6370d, this.f6368b, this.f6369c, nVar);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(String str, Function1 function1, t tVar, int i11) {
        this.f6368b = str;
        this.f6369c = function1;
        this.f6370d = tVar;
        this.f6371e = i11;
    }
}
