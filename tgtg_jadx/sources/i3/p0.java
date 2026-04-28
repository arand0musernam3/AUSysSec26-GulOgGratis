package i3;

import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements u, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PropertyReference0Impl f23167a;

    public p0(PropertyReference0Impl propertyReference0Impl) {
        this.f23167a = propertyReference0Impl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual(this.f23167a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        return this.f23167a;
    }

    public final int hashCode() {
        return this.f23167a.hashCode();
    }

    @Override // i3.u
    public final /* synthetic */ float invoke() {
        return ((Number) this.f23167a.invoke()).floatValue();
    }
}
