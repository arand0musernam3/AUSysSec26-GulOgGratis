package m1;

import android.view.Surface;
import com.braze.h2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pair f28698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pair f28699d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f28700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r80.d f28701b = w.b.r(f28698c);

    static {
        Unit unit = Unit.f26487a;
        f28698c = new Pair(unit, -1);
        f28699d = new Pair(unit, 0);
    }

    public c(Function1 function1) {
        this.f28700a = function1;
    }

    public final Object a() {
        Pair pair;
        Object obj;
        if (Intrinsics.areEqual(this.f28701b.f37785a, f28698c)) {
            h2.b("Ref-count managed object has not yet been initialized. Unable to acquire.");
            return null;
        }
        r80.d dVar = this.f28701b;
        do {
            pair = (Pair) dVar.f37785a;
            if (Intrinsics.areEqual(pair, f28699d)) {
                return null;
            }
            obj = pair.f26485a;
        } while (!this.f28701b.a(pair, new Pair(obj, Integer.valueOf(((Number) pair.f26486b).intValue() + 1))));
        return obj;
    }

    public final void b(Surface surface) {
        surface.getClass();
        if (this.f28701b.a(f28698c, new Pair(surface, 1))) {
            return;
        }
        h2.b("Ref-count managed object has already been initialized.");
    }

    public final void c() {
        Pair pair;
        Pair pair2;
        Object obj;
        Pair pair3;
        if (Intrinsics.areEqual(this.f28701b.f37785a, f28698c)) {
            h2.b("Ref-count managed object has not yet been initialized. Unable to release.");
            return;
        }
        r80.d dVar = this.f28701b;
        do {
            pair = (Pair) dVar.f37785a;
            pair2 = f28699d;
            if (Intrinsics.areEqual(pair, pair2)) {
                h2.b("Release called more times than initialize + acquire.");
                return;
            } else {
                obj = pair.f26485a;
                int iIntValue = ((Number) pair.f26486b).intValue();
                pair3 = iIntValue == 1 ? pair2 : new Pair(obj, Integer.valueOf(iIntValue - 1));
            }
        } while (!this.f28701b.a(pair, pair3));
        if (Intrinsics.areEqual(pair3, pair2)) {
            this.f28700a.invoke(obj);
        }
    }
}
