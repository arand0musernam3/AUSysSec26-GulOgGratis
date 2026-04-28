package z80;

import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.d0;
import v80.f0;
import w2.l1;
import z1.a2;
import z1.d3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f47360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80.a f47362c;

    public d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        this.f47360a = coroutineContext;
        this.f47361b = i11;
        this.f47362c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // z80.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y80.i a(kotlin.coroutines.CoroutineContext r5, int r6, x80.a r7) {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f47360a
            kotlin.coroutines.CoroutineContext r5 = r5.plus(r0)
            x80.a r1 = x80.a.SUSPEND
            x80.a r2 = r4.f47362c
            int r3 = r4.f47361b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            z80.d r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.d.a(kotlin.coroutines.CoroutineContext, int, x80.a):y80.i");
    }

    public String b() {
        return null;
    }

    public abstract Object c(x80.u uVar, x70.c cVar);

    @Override // y80.i
    public Object collect(y80.j jVar, x70.c cVar) {
        Object objN = f0.n(new d3(jVar, this, (x70.c) null, 4), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public abstract d d(CoroutineContext coroutineContext, int i11, x80.a aVar);

    public y80.i e() {
        return null;
    }

    public x80.w f(b0 b0Var) {
        int i11 = this.f47361b;
        if (i11 == -3) {
            i11 = -2;
        }
        d0 d0Var = d0.ATOMIC;
        Function2 a2Var = new a2(this, null, 5);
        x80.t tVar = new x80.t(v80.v.b(b0Var, this.f47360a), cg.a(i11, this.f47362c, null, 4));
        tVar.k0(d0Var, tVar, a2Var);
        return tVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        CoroutineContext coroutineContext = this.f47360a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i11 = this.f47361b;
        if (i11 != -3) {
            arrayList.add("capacity=" + i11);
        }
        x80.a aVar = x80.a.SUSPEND;
        x80.a aVar2 = this.f47362c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return l1.f(sb2, CollectionsKt.U(arrayList, ", ", null, null, null, 62), ']');
    }
}
