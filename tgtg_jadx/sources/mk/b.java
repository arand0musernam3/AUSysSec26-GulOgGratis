package mk;

import androidx.lifecycle.c1;
import ao.m0;
import kotlin.jvm.internal.Intrinsics;
import mv.e0;
import mv.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv.b f29973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f29974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f29975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f29976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f29977e;

    public b(cv.b bVar, c1 c1Var, m0 m0Var, e0 e0Var, u uVar) {
        bVar.getClass();
        c1Var.getClass();
        m0Var.getClass();
        e0Var.getClass();
        uVar.getClass();
        this.f29973a = bVar;
        this.f29974b = c1Var;
        this.f29975c = m0Var;
        this.f29976d = e0Var;
        this.f29977e = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f29973a, bVar.f29973a) && Intrinsics.areEqual(this.f29974b, bVar.f29974b) && Intrinsics.areEqual(this.f29975c, bVar.f29975c) && Intrinsics.areEqual(this.f29976d, bVar.f29976d) && Intrinsics.areEqual(this.f29977e, bVar.f29977e);
    }

    public final int hashCode() {
        return this.f29977e.hashCode() + ((this.f29976d.hashCode() + ((this.f29975c.hashCode() + ((this.f29974b.hashCode() + (this.f29973a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BaseItemViewParameters(eventTrackingManager=" + this.f29973a + ", savedStateHandle=" + this.f29974b + ", eventRepository=" + this.f29975c + ", impressionHelper=" + this.f29976d + ", experimentManager=" + this.f29977e + ")";
    }
}
