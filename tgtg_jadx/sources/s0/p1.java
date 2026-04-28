package s0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f38430b = new o1(true, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f38431c = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.j1 f38432a;

    public p1() {
        b5.j1 j1Var = new b5.j1();
        j1Var.f5849c = new Object();
        j1Var.f5847a = 0;
        j1Var.f5848b = false;
        j1Var.f5851e = new HashMap();
        j1Var.f5852f = new CopyOnWriteArraySet();
        j1Var.f5850d = new AtomicReference(f38430b);
        this.f38432a = j1Var;
    }
}
