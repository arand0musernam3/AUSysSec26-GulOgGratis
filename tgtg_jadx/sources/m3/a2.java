package m3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f29206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f29207k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q1.u0 f29208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q1.u0 f29209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q1.u0 f29210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Set f29211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q1.u0 f29212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ x0 f29214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b2 f29215t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, x70.c cVar) {
        super(3, cVar);
        this.f29215t = b2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(m3.b2 r22, java.util.List r23, java.util.List r24, java.util.List r25, q1.u0 r26, q1.u0 r27, q1.u0 r28, q1.u0 r29) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a2.a(m3.b2, java.util.List, java.util.List, java.util.List, q1.u0, q1.u0, q1.u0, q1.u0):void");
    }

    public static final void b(List list, b2 b2Var) {
        list.clear();
        synchronized (b2Var.f29227c) {
            try {
                ArrayList arrayList = b2Var.f29235k;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.add((a1) arrayList.get(i11));
                }
                b2Var.f29235k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a2 a2Var = new a2(this.f29215t, (x70.c) obj3);
        a2Var.f29214s = (x0) obj2;
        return a2Var.invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0126 -> B:44:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0224 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
