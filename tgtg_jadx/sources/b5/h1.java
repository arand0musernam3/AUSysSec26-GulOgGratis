package b5;

import c5.k3;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 implements b4.r, c5.l2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c5.o2 f5835a;

    public final c5.o2 a() {
        c5.o2 o2Var = this.f5835a;
        if (o2Var != null) {
            return o2Var;
        }
        c5.o2 o2Var2 = new c5.o2();
        o2Var2.f7307a = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        inspectableProperties(o2Var2);
        this.f5835a = o2Var2;
        return o2Var2;
    }

    public abstract b4.s create();

    @Override // c5.l2
    @NotNull
    public final Sequence<k3> getInspectableElements() {
        return a().f7309c;
    }

    @Override // c5.l2
    @Nullable
    public final String getNameFallback() {
        return a().f7307a;
    }

    @Nullable
    public final Object getValueOverride() {
        return a().f7308b;
    }

    public abstract void inspectableProperties(c5.o2 o2Var);

    public abstract void update(b4.s sVar);
}
