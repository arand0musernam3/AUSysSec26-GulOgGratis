package ha0;

import java.util.Comparator;
import java.util.TreeSet;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.internal.StringCompanionObject;
import q90.t;
import q90.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f21675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p0 f21676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile a f21677d;

    public c(b bVar) {
        bVar.getClass();
        this.f21674a = bVar;
        p0 p0Var = p0.f26531a;
        this.f21675b = p0Var;
        this.f21676c = p0Var;
        this.f21677d = a.NONE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void a(t tVar, int i11) {
        String strG = this.f21675b.contains(tVar.d(i11)) ? "██" : tVar.g(i11);
        this.f21674a.d(tVar.d(i11) + ": " + strG);
    }

    public final void b() {
        StringCompanionObject.INSTANCE.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        i0.s((Iterable) this.f21675b, treeSet);
        treeSet.add("Authorization");
        this.f21675b = treeSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    @Override // q90.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q90.p0 intercept(q90.w r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.c.intercept(q90.w):q90.p0");
    }
}
