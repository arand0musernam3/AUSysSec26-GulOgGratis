package n3;

import kotlin.jvm.internal.Reflection;
import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30470b;

    public /* synthetic */ k0(int i11, int i12, int i13) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }

    public abstract void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var);

    public m3.a b(a60.s sVar) {
        return null;
    }

    public final String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public k0(int i11, int i12) {
        this.f30469a = i11;
        this.f30470b = i12;
    }
}
