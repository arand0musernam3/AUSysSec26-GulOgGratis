package a3;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;
import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase;
import g3.w6;
import g3.x6;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f262e;

    public /* synthetic */ b(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z11) {
        this.f258a = 1;
        this.f260c = userJavascriptInterfaceBase;
        this.f261d = str;
        this.f262e = str2;
        this.f259b = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Matrix matrix;
        SurfaceTexture surfaceTexture;
        switch (this.f258a) {
            case 0:
                Function0 function0 = (Function0) this.f260c;
                i4.f fVar = (i4.f) this.f261d;
                i4.o oVar = (i4.o) this.f262e;
                b5.o0 o0Var = (b5.o0) obj;
                o0Var.b();
                k4.b bVar = o0Var.f5908a;
                if (!((Boolean) function0.invoke()).booleanValue()) {
                    return Unit.f26487a;
                }
                if (this.f259b) {
                    long jT0 = bVar.t0();
                    j30.g gVar = bVar.f25938b;
                    long jO = gVar.o();
                    gVar.i().e();
                    try {
                        ((jd.f) gVar.f24502b).o(-1.0f, 1.0f, jT0);
                        k4.d.a0(o0Var, fVar, 0L, 0.0f, oVar, 0, 46);
                    } finally {
                        r8.k.y(gVar, jO);
                    }
                } else {
                    k4.d.a0(o0Var, fVar, 0L, 0.0f, oVar, 0, 46);
                }
                return Unit.f26487a;
            case 1:
                return UserJavascriptInterfaceBase.setCustomUserAttributeJSON$lambda$18((UserJavascriptInterfaceBase) this.f260c, (String) this.f261d, (String) this.f262e, this.f259b, (BrazeUser) obj);
            case 2:
                Function0 function02 = (Function0) this.f260c;
                Function0 function03 = (Function0) this.f261d;
                Function1 function1 = (Function1) this.f262e;
                x6 x6Var = (x6) obj;
                boolean z11 = this.f259b;
                if (z11 && x6Var == x6.PartiallyExpanded) {
                    x6Var = x6.Expanded;
                }
                return new w6(z11, function02, function03, x6Var, function1);
            case 3:
                ib.v vVar = (ib.v) this.f260c;
                String str = (String) this.f261d;
                jb.d0 d0Var = (jb.d0) this.f262e;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof WorkerStoppedException) {
                    vVar.f23762c.compareAndSet(-256, ((WorkerStoppedException) th2).f4158a);
                }
                if (this.f259b && str != null) {
                    ib.y yVar = d0Var.f24870e.f23703m;
                    int iHashCode = d0Var.f24866a.hashCode();
                    yVar.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        b6.a.l(iHashCode, o00.x0.G(str));
                    } else {
                        String strG = o00.x0.G(str);
                        try {
                            if (o00.x0.f31772g == null) {
                                o00.x0.f31772g = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            Method method = o00.x0.f31772g;
                            if (method == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            method.invoke(null, Long.valueOf(o00.x0.f31769d), strG, Integer.valueOf(iHashCode));
                        } catch (Exception e5) {
                            o00.x0.x("asyncTraceEnd", e5);
                        }
                    }
                }
                return Unit.f26487a;
            case 4:
                k1.e eVar = (k1.e) this.f260c;
                Function1 function12 = (Function1) this.f261d;
                float[] fArr = (float[]) this.f262e;
                k1.d dVar = (k1.d) obj;
                if (!z5.l.a(0L, 0L) && (surfaceTexture = dVar.getSurfaceTexture()) != null) {
                    surfaceTexture.setDefaultBufferSize((int) 0, (int) 0);
                }
                eVar.getClass();
                if (dVar.getSurfaceTextureListener() != eVar) {
                    function12.invoke(eVar);
                    dVar.setSurfaceTextureListener(eVar);
                }
                dVar.setOpaque(this.f259b);
                if (fArr != null) {
                    matrix = eVar.f25723d;
                    i4.g0.v(matrix, fArr);
                } else {
                    matrix = null;
                }
                dVar.setTransform(matrix);
                return Unit.f26487a;
            default:
                List list = (List) this.f261d;
                Function1 function13 = (Function1) this.f262e;
                Function0 function04 = (Function0) this.f260c;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                if (list != null) {
                    if (list.isEmpty()) {
                        f2.l.q(lVar, null, ps.a.f35613a, 3);
                    } else {
                        f2.l.s(lVar, list.size(), null, new u3.d(new ps.b(list, function13, 0), true, 2106801642), 6);
                    }
                }
                if (this.f259b) {
                    f2.l.q(lVar, null, new u3.d(new bm.c(3, function04), true, -404891396), 3);
                }
                f2.l.q(lVar, null, ps.a.f35614b, 3);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ b(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f258a = i11;
        this.f260c = obj;
        this.f259b = z11;
        this.f261d = obj2;
        this.f262e = obj3;
    }

    public /* synthetic */ b(List list, boolean z11, Function1 function1, Function0 function0) {
        this.f258a = 5;
        this.f261d = list;
        this.f259b = z11;
        this.f262e = function1;
        this.f260c = function0;
    }

    public /* synthetic */ b(k1.e eVar, Function1 function1, boolean z11, float[] fArr) {
        this.f258a = 4;
        this.f260c = eVar;
        this.f261d = function1;
        this.f259b = z11;
        this.f262e = fArr;
    }

    public /* synthetic */ b(boolean z11, Function0 function0, Function0 function02, Function1 function1) {
        this.f258a = 2;
        this.f259b = z11;
        this.f260c = function0;
        this.f261d = function02;
        this.f262e = function1;
    }
}
