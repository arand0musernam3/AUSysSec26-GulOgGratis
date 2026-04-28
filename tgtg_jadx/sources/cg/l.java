package cg;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8005d;

    public /* synthetic */ l(int i11, int i12, long j9) {
        this.f8002a = 0;
        this.f8004c = j9;
        this.f8003b = i11;
        this.f8005d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f8002a) {
            case 0:
                num.getClass();
                j.b(this.f8004c, m3.i.F(this.f8003b | 1), nVar, this.f8005d);
                break;
            case 1:
                num.intValue();
                r2.h.b(this.f8004c, this.f8003b, nVar, m3.i.F(this.f8005d | 1));
                break;
            default:
                num.intValue();
                r2.h.b(this.f8004c, this.f8003b, nVar, m3.i.F(this.f8005d | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(int i11, int i12, int i13, long j9) {
        this.f8002a = i13;
        this.f8003b = i11;
        this.f8004c = j9;
        this.f8005d = i12;
    }
}
