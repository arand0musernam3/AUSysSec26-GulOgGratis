package h2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3.j f21113b;

    public /* synthetic */ g0(a3.j jVar, int i11) {
        this.f21112a = i11;
        this.f21113b = jVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21112a) {
            case 0:
                Object key = ((r0) obj).getKey();
                a3.j jVar = this.f21113b;
                return w70.a.a(Integer.valueOf(jVar.k(key)), Integer.valueOf(jVar.k(((r0) obj2).getKey())));
            case 1:
                Object key2 = ((r0) obj).getKey();
                a3.j jVar2 = this.f21113b;
                return w70.a.a(Integer.valueOf(jVar2.k(key2)), Integer.valueOf(jVar2.k(((r0) obj2).getKey())));
            case 2:
                Object key3 = ((r0) obj2).getKey();
                a3.j jVar3 = this.f21113b;
                return w70.a.a(Integer.valueOf(jVar3.k(key3)), Integer.valueOf(jVar3.k(((r0) obj).getKey())));
            default:
                Object key4 = ((r0) obj2).getKey();
                a3.j jVar4 = this.f21113b;
                return w70.a.a(Integer.valueOf(jVar4.k(key4)), Integer.valueOf(jVar4.k(((r0) obj).getKey())));
        }
    }
}
