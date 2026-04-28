package i5;

import com.braze.h2;
import j5.k;
import j5.m;
import j5.w;
import j5.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23367k;
    public /* synthetic */ float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f23368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, x70.c cVar) {
        super(2, cVar);
        this.f23368m = dVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c cVar2 = new c(this.f23368m, cVar);
        cVar2.l = ((Number) obj).floatValue();
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create(Float.valueOf(((Number) obj).floatValue()), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f23367k;
        if (i11 == 0) {
            ba0.g.M(obj);
            float f11 = this.l;
            d dVar = this.f23368m;
            Function2 function2 = (Function2) w.d(dVar.f23369a.f24696d, m.f24661e);
            if (function2 == null) {
                throw b3.i.D("Required value was null.");
            }
            boolean z12 = ((k) dVar.f23369a.f24696d.e(x.f24727v)).f24635c;
            if (z12) {
                f11 = -f11;
            }
            h4.b bVar = new h4.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
            this.f23366j = z12;
            this.f23367k = 1;
            obj = function2.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
            z11 = z12;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z11 = this.f23366j;
            ba0.g.M(obj);
        }
        long j9 = ((h4.b) obj).f21378a;
        return new Float(z11 ? -Float.intBitsToFloat((int) (j9 & 4294967295L)) : Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }
}
