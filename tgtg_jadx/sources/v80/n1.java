package v80;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42134b = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42135c = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42136d = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f42137a;

    public n1(w1 w1Var, Throwable th2) {
        this.f42137a = w1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable thC = c();
        if (thC == null) {
            f42135c.set(this, th2);
            return;
        }
        if (th2 == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42136d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                org.bouncycastle.jce.provider.a.p(obj, "State is ");
                return;
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // v80.e1
    public final w1 b() {
        return this.f42137a;
    }

    public final Throwable c() {
        return (Throwable) f42135c.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final ArrayList e(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42136d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                org.bouncycastle.jce.provider.a.p(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th2 != null && !Intrinsics.areEqual(th2, thC)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, f0.f42090h);
        return arrayList;
    }

    @Override // v80.e1
    public final boolean g() {
        return c() == null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(d());
        sb2.append(", completing=");
        sb2.append(f42134b.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(c());
        sb2.append(", exceptions=");
        sb2.append(f42136d.get(this));
        sb2.append(", list=");
        sb2.append(this.f42137a);
        sb2.append(']');
        return sb2.toString();
    }
}
