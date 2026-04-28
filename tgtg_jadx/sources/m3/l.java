package m3;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.b1 f29315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.o0 f29316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1.m f29317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29318d;

    public l(q1.b1 b1Var, q1.o0 o0Var, q1.m mVar, int i11, Exception exc) {
        super(exc);
        this.f29315a = b1Var;
        this.f29316b = o0Var;
        this.f29317c = mVar;
        this.f29318d = i11;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listC;
        StringBuilder sb2 = new StringBuilder("\n            |Failed to execute op number ");
        sb2.append(this.f29318d);
        sb2.append(":\n            |");
        o80.j jVarA = o80.l.a(new k(this, null));
        if (jVarA.hasNext()) {
            Object next = jVarA.next();
            if (jVarA.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (jVarA.hasNext()) {
                    arrayList.add(jVarA.next());
                }
                listC = arrayList;
            } else {
                listC = kotlin.collections.c0.c(next);
            }
        } else {
            listC = kotlin.collections.n0.f26529a;
        }
        sb2.append(CollectionsKt.U(CollectionsKt.n0(50, listC), "\n", null, null, null, 62));
        sb2.append("\n            ");
        return kotlin.text.s.d(sb2.toString());
    }
}
