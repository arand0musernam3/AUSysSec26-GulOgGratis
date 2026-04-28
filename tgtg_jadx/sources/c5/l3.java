package c5;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7286b;

    public l3() {
        this.f7285a = 0;
        this.f7286b = new ArrayList();
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.f7286b).add(new k3(str, obj));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.functions.Function2, z70.h] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f7285a) {
            case 0:
                return ((ArrayList) this.f7286b).iterator();
            case 1:
                return new e80.n(this);
            case 2:
                return ArrayIteratorKt.iterator((Object[]) this.f7286b);
            case 3:
                return ((Iterable) this.f7286b).iterator();
            case 4:
                return new kotlin.text.k((CharSequence) this.f7286b);
            case 5:
                return o80.l.a((z70.h) this.f7286b);
            case 6:
                return (Iterator) this.f7286b;
            default:
                return new o80.n(this.f7286b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l3(Function2 function2) {
        this.f7285a = 5;
        this.f7286b = (z70.h) function2;
    }

    public /* synthetic */ l3(Object obj, int i11) {
        this.f7285a = i11;
        this.f7286b = obj;
    }
}
