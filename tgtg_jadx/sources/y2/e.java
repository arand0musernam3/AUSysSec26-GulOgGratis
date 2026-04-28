package y2;

import java.util.List;
import z3.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f45385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f45386c;

    public e(List list, List list2, int i11) {
        this.f45384a = i11;
        if (!(i11 >= 0)) {
            c2.a.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i11)) {
            c2.a.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        r rVar = new r();
        rVar.addAll(list);
        this.f45385b = rVar;
        r rVar2 = new r();
        rVar2.addAll(list2);
        this.f45386c = rVar2;
    }
}
