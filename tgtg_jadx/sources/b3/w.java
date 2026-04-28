package b3;

import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5655a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.t f5657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5665k;
    public final /* synthetic */ u0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5669p;

    public /* synthetic */ w(String str, b4.t tVar, long j9, long j11, long j12, long j13, int i11, boolean z11, int i12, int i13, Function1 function1, u0 u0Var, int i14, int i15, int i16) {
        this.f5656b = str;
        this.f5657c = tVar;
        this.f5658d = j9;
        this.f5659e = j11;
        this.f5660f = j12;
        this.f5661g = j13;
        this.f5662h = i11;
        this.f5663i = z11;
        this.f5664j = i12;
        this.f5665k = i13;
        this.f5669p = function1;
        this.l = u0Var;
        this.f5666m = i14;
        this.f5667n = i15;
        this.f5668o = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5655a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(this.f5666m | 1);
                int iF2 = m3.i.F(this.f5667n);
                z.b(this.f5656b, this.f5657c, this.f5658d, this.f5659e, this.f5660f, this.f5661g, this.f5662h, this.f5663i, this.f5664j, this.f5665k, (Function1) this.f5669p, this.l, (m3.n) obj, iF, iF2, this.f5668o);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(this.f5666m | 1);
                int iF4 = m3.i.F(this.f5667n);
                r9.b(this.f5656b, this.f5657c, this.f5658d, this.f5659e, this.f5660f, (x5.k) this.f5669p, this.f5661g, this.f5662h, this.f5663i, this.f5664j, this.f5665k, this.l, (m3.n) obj, iF3, iF4, this.f5668o);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ w(String str, b4.t tVar, long j9, long j11, long j12, x5.k kVar, long j13, int i11, boolean z11, int i12, int i13, u0 u0Var, int i14, int i15, int i16) {
        this.f5656b = str;
        this.f5657c = tVar;
        this.f5658d = j9;
        this.f5659e = j11;
        this.f5660f = j12;
        this.f5669p = kVar;
        this.f5661g = j13;
        this.f5662h = i11;
        this.f5663i = z11;
        this.f5664j = i12;
        this.f5665k = i13;
        this.l = u0Var;
        this.f5666m = i14;
        this.f5667n = i15;
        this.f5668o = i16;
    }
}
