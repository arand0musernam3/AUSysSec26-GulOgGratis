package g3;

import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f9 implements i4.y, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PropertyReference0Impl f18627a;

    public f9(PropertyReference0Impl propertyReference0Impl) {
        this.f18627a = propertyReference0Impl;
    }

    @Override // i4.y
    public final /* synthetic */ long a() {
        return ((i4.v) this.f18627a.invoke()).f23317a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i4.y) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual(this.f18627a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        return this.f18627a;
    }

    public final int hashCode() {
        return this.f18627a.hashCode();
    }
}
