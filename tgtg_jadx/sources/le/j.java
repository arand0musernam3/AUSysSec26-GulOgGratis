package le;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import he.a0;
import he.j0;
import he.z;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import m3.b1;
import o00.h0;
import z4.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f27709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4.m f27710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.f f27711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f27712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f27713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f27714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f27715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f27716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ he.a f27717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ he.k f27718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Map f27719k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f27720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f27721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f27722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f27723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f27724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f27725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function0 f27726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1 f27727t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Rect rect, z4.m mVar, b4.f fVar, Matrix matrix, z zVar, boolean z11, boolean z12, j0 j0Var, he.a aVar, he.k kVar, Map map, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Context context, Function0 function0, b1 b1Var) {
        super(1);
        this.f27709a = rect;
        this.f27710b = mVar;
        this.f27711c = fVar;
        this.f27712d = matrix;
        this.f27713e = zVar;
        this.f27714f = z11;
        this.f27715g = z12;
        this.f27716h = j0Var;
        this.f27717i = aVar;
        this.f27718j = kVar;
        this.f27719k = map;
        this.l = z13;
        this.f27720m = z14;
        this.f27721n = z15;
        this.f27722o = z16;
        this.f27723p = z17;
        this.f27724q = z18;
        this.f27725r = context;
        this.f27726s = function0;
        this.f27727t = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k4.d dVar = (k4.d) obj;
        dVar.getClass();
        i4.t tVarI = dVar.g0().i();
        Rect rect = this.f27709a;
        long jI = h0.i(rect.width(), rect.height());
        long jC = b0.z.c(j80.c.b(h4.e.d(dVar.d())), j80.c.b(h4.e.b(dVar.d())));
        long jA = this.f27710b.a(jI, dVar.d());
        float fD = h4.e.d(jI);
        int i11 = r1.f47223a;
        int i12 = (int) (jA >> 32);
        int i13 = (int) (jA & 4294967295L);
        long jA2 = this.f27711c.a(b0.z.c((int) (Float.intBitsToFloat(i12) * fD), (int) (Float.intBitsToFloat(i13) * h4.e.b(jI))), jC, dVar.getLayoutDirection());
        Matrix matrix = this.f27712d;
        matrix.reset();
        matrix.preTranslate((int) (jA2 >> 32), (int) (jA2 & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
        a0 a0Var = a0.MergePathsApi19;
        z zVar = this.f27713e;
        zVar.h(a0Var, this.f27714f);
        zVar.f21985e = this.f27715g;
        zVar.f22002w = this.f27716h;
        zVar.e();
        zVar.M = this.f27717i;
        zVar.p(this.f27718j);
        Map map = zVar.f21991k;
        Map map2 = this.f27719k;
        if (map2 != map) {
            zVar.f21991k = map2;
            zVar.invalidateSelf();
        }
        if (this.f27727t.getValue() != null) {
            org.bouncycastle.jce.provider.a.c();
            return null;
        }
        boolean z11 = zVar.f21998s;
        boolean z12 = this.l;
        if (z11 != z12) {
            zVar.f21998s = z12;
            re.d dVar2 = zVar.f21995p;
            if (dVar2 != null) {
                dVar2.q(z12);
            }
        }
        zVar.f21999t = this.f27720m;
        zVar.f22000u = this.f27721n;
        zVar.f21993n = this.f27722o;
        boolean z13 = zVar.f21994o;
        boolean z14 = this.f27723p;
        if (z14 != z13) {
            zVar.f21994o = z14;
            re.d dVar3 = zVar.f21995p;
            if (dVar3 != null) {
                dVar3.L = z14;
            }
            zVar.invalidateSelf();
        }
        boolean z15 = zVar.f22001v;
        boolean z16 = this.f27724q;
        if (z16 != z15) {
            zVar.f22001v = z16;
            zVar.invalidateSelf();
        }
        Iterator it = z.Q.iterator();
        oe.i iVarD = null;
        while (it.hasNext()) {
            iVarD = zVar.f21981a.d((String) it.next());
            if (iVarD != null) {
                break;
            }
        }
        if (zVar.b(this.f27725r) || iVarD == null) {
            zVar.z(((Number) this.f27726s.invoke()).floatValue());
        } else {
            zVar.z(iVarD.f32479b);
        }
        zVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasA = i4.d.a(tVarI);
        d1.e eVar = zVar.O;
        ThreadPoolExecutor threadPoolExecutor = z.T;
        ve.e eVar2 = zVar.f21982b;
        Semaphore semaphore = zVar.N;
        re.d dVar4 = zVar.f21995p;
        he.k kVar = zVar.f21981a;
        if (dVar4 != null && kVar != null) {
            he.a aVar = zVar.M;
            if (aVar == null) {
                aVar = he.e.f21898a;
            }
            boolean z17 = aVar == he.a.ENABLED;
            if (z17) {
                try {
                    semaphore.acquire();
                    if (zVar.A()) {
                        zVar.z(eVar2.a());
                    }
                } catch (InterruptedException unused) {
                    if (z17) {
                        semaphore.release();
                        if (dVar4.K != eVar2.a()) {
                        }
                    }
                    return Unit.f26487a;
                } catch (Throwable th2) {
                    if (z17) {
                        semaphore.release();
                        if (dVar4.K != eVar2.a()) {
                            threadPoolExecutor.execute(eVar);
                        }
                    }
                    throw th2;
                }
            }
            boolean z18 = zVar.f21985e;
            int i14 = zVar.f21996q;
            boolean z19 = zVar.f22003x;
            if (z18) {
                try {
                    if (z19) {
                        canvasA.save();
                        canvasA.concat(matrix);
                        zVar.n(canvasA, dVar4);
                        canvasA.restore();
                    } else {
                        dVar4.b(canvasA, matrix, i14, null);
                    }
                } catch (Throwable unused2) {
                    ve.c.f42247a.getClass();
                    he.a aVar2 = he.e.f21898a;
                }
            } else if (z19) {
                canvasA.save();
                canvasA.concat(matrix);
                zVar.n(canvasA, dVar4);
                canvasA.restore();
            } else {
                dVar4.b(canvasA, matrix, i14, null);
            }
            zVar.L = false;
            if (z17) {
                semaphore.release();
                if (dVar4.K != eVar2.a()) {
                    threadPoolExecutor.execute(eVar);
                }
            }
        }
        return Unit.f26487a;
    }
}
