package g9;

import b5.q2;
import h2.x1;
import h2.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20114b;

    public /* synthetic */ d0(Ref.ObjectRef objectRef, int i11) {
        this.f20113a = i11;
        this.f20114b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, java.lang.Object, n90.n] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T tJ;
        switch (this.f20113a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                T t9 = this.f20114b.element;
                break;
            case 1:
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                z0 z0Var = ((x1) q2Var).f21245o;
                Ref.ObjectRef objectRef = this.f20114b;
                List list = (List) objectRef.element;
                if (list != null) {
                    list.add(z0Var);
                    tJ = list;
                } else {
                    tJ = kotlin.collections.d0.j(z0Var);
                }
                objectRef.element = tJ;
                break;
            case 2:
                ?? r32 = (n90.n) obj;
                r32.getClass();
                this.f20114b.element = r32;
                break;
            default:
                List list2 = (List) obj;
                this.f20114b.element = list2 != null ? new ArrayList(list2) : new ArrayList();
                break;
        }
        return Unit.f26487a;
    }
}
