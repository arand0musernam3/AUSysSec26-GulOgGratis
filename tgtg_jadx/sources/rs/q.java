package rs;

import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f38224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f38228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38229g;

    public /* synthetic */ q(t tVar, int i11, int i12, String str, Function2 function2, int i13, int i14) {
        this.f38223a = i14;
        this.f38224b = tVar;
        this.f38225c = i11;
        this.f38226d = i12;
        this.f38227e = str;
        this.f38228f = function2;
        this.f38229g = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38223a) {
            case 0:
                ((Integer) obj2).getClass();
                k.g(this.f38224b, this.f38225c, this.f38226d, this.f38227e, this.f38228f, (m3.n) obj, m3.i.F(this.f38229g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                k.h(this.f38224b, this.f38225c, this.f38226d, this.f38227e, this.f38228f, (m3.n) obj, m3.i.F(this.f38229g | 1));
                break;
        }
        return Unit.f26487a;
    }
}
