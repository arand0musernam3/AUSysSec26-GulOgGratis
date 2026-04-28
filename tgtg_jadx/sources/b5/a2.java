package b5;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a2 f5758b = new a2(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5759a;

    public /* synthetic */ a2(int i11) {
        this.f5759a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5759a) {
            case 0:
                m0 m0Var = (m0) obj;
                m0 m0Var2 = (m0) obj2;
                int iCompare = Intrinsics.compare(m0Var2.f5880q, m0Var.f5880q);
                return iCompare != 0 ? iCompare : Intrinsics.compare(m0Var.hashCode(), m0Var2.hashCode());
            default:
                m0 m0Var3 = (m0) obj;
                m0 m0Var4 = (m0) obj2;
                int iCompare2 = Intrinsics.compare(m0Var3.f5880q, m0Var4.f5880q);
                return iCompare2 != 0 ? iCompare2 : Intrinsics.compare(m0Var3.hashCode(), m0Var4.hashCode());
        }
    }
}
