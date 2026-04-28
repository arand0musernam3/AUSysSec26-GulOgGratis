package a3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements t, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f608a;

    public w0(Function0 function0) {
        this.f608a = function0;
    }

    @Override // a3.t
    public final /* synthetic */ long a() {
        return ((h4.b) this.f608a.invoke()).f21378a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual(this.f608a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        return this.f608a;
    }

    public final int hashCode() {
        return this.f608a.hashCode();
    }
}
