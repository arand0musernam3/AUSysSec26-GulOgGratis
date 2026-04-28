package r5;

import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g {
    @Override // r5.g
    public final void a(i iVar) {
        iVar.d(0, ((mv.b0) iVar.f37681f).p(), "");
    }

    public final boolean equals(Object obj) {
        return obj instanceof d;
    }

    public final int hashCode() {
        return Reflection.getOrCreateKotlinClass(d.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
