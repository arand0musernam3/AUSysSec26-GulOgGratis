package gn;

import androidx.core.util.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Consumer, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20697b;

    public z(Function1 function1, int i11) {
        this.f20696a = i11;
        switch (i11) {
            case 1:
                function1.getClass();
                this.f20697b = function1;
                break;
            case 2:
                this.f20697b = function1;
                break;
            default:
                function1.getClass();
                this.f20697b = function1;
                break;
        }
    }

    @Override // androidx.core.util.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.f20696a) {
            case 0:
                this.f20697b.invoke(obj);
                break;
            case 1:
                this.f20697b.invoke(obj);
                break;
            default:
                this.f20697b.invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f20696a) {
            case 0:
                if (!(obj instanceof Consumer) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f20697b, ((FunctionAdapter) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof Consumer) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f20697b, ((FunctionAdapter) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof Consumer) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual(this.f20697b, ((FunctionAdapter) obj).getFunctionDelegate());
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        switch (this.f20696a) {
        }
        return this.f20697b;
    }

    public final int hashCode() {
        switch (this.f20696a) {
        }
        return this.f20697b.hashCode();
    }
}
