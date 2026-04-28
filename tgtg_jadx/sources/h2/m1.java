package h2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List[] f21175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f21179f;

    public m1(n1 n1Var, List list) {
        this.f21179f = n1Var;
        this.f21174a = list;
        this.f21175b = new List[list.size()];
        if (list.isEmpty()) {
            c2.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
