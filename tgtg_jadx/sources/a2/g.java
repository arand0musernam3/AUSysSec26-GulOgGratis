package a2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import t1.s;
import v80.b0;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.FloatRef f205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f206k;
    public final /* synthetic */ j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q2 f209o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, float f11, Function1 function1, q2 q2Var, x70.c cVar) {
        super(2, cVar);
        this.l = jVar;
        this.f207m = f11;
        this.f208n = function1;
        this.f209o = q2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.l, this.f207m, this.f208n, this.f209o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [a2.f] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        final Ref.FloatRef floatRef;
        Object objB;
        j jVar = this.l;
        o oVar = jVar.f214a;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f206k;
        final Function1 function1 = this.f208n;
        if (i11 == 0) {
            ba0.g.M(obj);
            s sVar = jVar.f215b;
            float f11 = this.f207m;
            float fA = oVar.a(f11, t1.c.d(sVar, 0.0f, f11));
            if (Float.isNaN(fA)) {
                c2.a.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new Ref.FloatRef();
            float fSignum = Math.signum(f11) * Math.abs(fA);
            floatRef.element = fSignum;
            function1.invoke(new Float(fSignum));
            float f12 = floatRef.element;
            final int i12 = 0;
            ?? r42 = new Function1() { // from class: a2.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = i12;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (i13) {
                        case 0:
                            Ref.FloatRef floatRef2 = floatRef;
                            float f13 = floatRef2.element - fFloatValue;
                            floatRef2.element = f13;
                            function1.invoke(Float.valueOf(f13));
                            break;
                        default:
                            Ref.FloatRef floatRef3 = floatRef;
                            float f14 = floatRef3.element - fFloatValue;
                            floatRef3.element = f14;
                            function1.invoke(Float.valueOf(f14));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            this.f205j = floatRef;
            this.f206k = 1;
            objB = j.b(jVar, this.f209o, f12, this.f207m, r42, this);
            if (objB != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                ba0.g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref.FloatRef floatRef2 = this.f205j;
        ba0.g.M(obj);
        floatRef = floatRef2;
        objB = obj;
        t1.j jVar2 = (t1.j) objB;
        float fB = oVar.b(((Number) jVar2.b()).floatValue());
        if (Float.isNaN(fB)) {
            c2.a.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.element = fB;
        t1.j jVarF = t1.c.f(jVar2, 0.0f, 0.0f, 30);
        t1.i iVar = jVar.f216c;
        final int i13 = 1;
        Function1 function12 = new Function1() { // from class: a2.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i132 = i13;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i132) {
                    case 0:
                        Ref.FloatRef floatRef22 = floatRef;
                        float f13 = floatRef22.element - fFloatValue;
                        floatRef22.element = f13;
                        function1.invoke(Float.valueOf(f13));
                        break;
                    default:
                        Ref.FloatRef floatRef3 = floatRef;
                        float f14 = floatRef3.element - fFloatValue;
                        floatRef3.element = f14;
                        function1.invoke(Float.valueOf(f14));
                        break;
                }
                return Unit.f26487a;
            }
        };
        this.f205j = null;
        this.f206k = 2;
        Object objB2 = n.b(this.f209o, fB, fB, jVarF, iVar, function12, this);
        return objB2 == aVar ? aVar : objB2;
    }
}
