package al;

import a3.x0;
import a3.y0;
import androidx.lifecycle.p0;
import g3.q9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements p0, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f1520b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f1519a = i11;
        this.f1520b = function1;
    }

    @Override // androidx.lifecycle.p0
    public final /* synthetic */ void a(Object obj) {
        switch (this.f1519a) {
            case 0:
                ((a) this.f1520b).invoke(obj);
                break;
            case 1:
                ((r) this.f1520b).invoke(obj);
                break;
            case 2:
                ((x0) this.f1520b).invoke(obj);
                break;
            case 3:
                ((br.c) this.f1520b).invoke(obj);
                break;
            case 4:
                ((x0) this.f1520b).invoke(obj);
                break;
            case 5:
                ((gl.b) this.f1520b).invoke(obj);
                break;
            case 6:
                ((q9) this.f1520b).invoke(obj);
                break;
            case 7:
                ((hm.g) this.f1520b).invoke(obj);
                break;
            case 8:
                ((jd.a) this.f1520b).invoke(obj);
                break;
            case 9:
                ((y0) this.f1520b).invoke(obj);
                break;
            case 10:
                ((nm.a) this.f1520b).invoke(obj);
                break;
            case 11:
                ((pl.a) this.f1520b).invoke(obj);
                break;
            default:
                ((sg.c) this.f1520b).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f1519a) {
            case 0:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((a) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((r) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((x0) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((br.c) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((x0) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 5:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((gl.b) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 6:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((q9) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 7:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((hm.g) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 8:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((jd.a) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 9:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((y0) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 10:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((nm.a) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 11:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((pl.a) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof p0) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((sg.c) this.f1520b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        switch (this.f1519a) {
            case 0:
                return (a) this.f1520b;
            case 1:
                return (r) this.f1520b;
            case 2:
                return (x0) this.f1520b;
            case 3:
                return (br.c) this.f1520b;
            case 4:
                return (x0) this.f1520b;
            case 5:
                return (gl.b) this.f1520b;
            case 6:
                return (q9) this.f1520b;
            case 7:
                return (hm.g) this.f1520b;
            case 8:
                return (jd.a) this.f1520b;
            case 9:
                return (y0) this.f1520b;
            case 10:
                return (nm.a) this.f1520b;
            case 11:
                return (pl.a) this.f1520b;
            default:
                return (sg.c) this.f1520b;
        }
    }

    public final int hashCode() {
        switch (this.f1519a) {
            case 0:
                return ((a) this.f1520b).hashCode();
            case 1:
                return ((r) this.f1520b).hashCode();
            case 2:
                return ((x0) this.f1520b).hashCode();
            case 3:
                return ((br.c) this.f1520b).hashCode();
            case 4:
                return ((x0) this.f1520b).hashCode();
            case 5:
                return ((gl.b) this.f1520b).hashCode();
            case 6:
                return ((q9) this.f1520b).hashCode();
            case 7:
                return ((hm.g) this.f1520b).hashCode();
            case 8:
                return ((jd.a) this.f1520b).hashCode();
            case 9:
                return ((y0) this.f1520b).hashCode();
            case 10:
                return ((nm.a) this.f1520b).hashCode();
            case 11:
                return ((pl.a) this.f1520b).hashCode();
            default:
                return ((sg.c) this.f1520b).hashCode();
        }
    }
}
