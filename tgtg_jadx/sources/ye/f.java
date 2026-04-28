package ye;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45885e;

    public f(boolean z11, boolean z12, boolean z13, boolean z14, v70.e eVar) {
        eVar.getClass();
        this.f45881a = z11;
        this.f45882b = z12;
        this.f45883c = z13;
        this.f45884d = z14;
        this.f45885e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f45881a == fVar.f45881a && this.f45882b == fVar.f45882b && this.f45883c == fVar.f45883c && this.f45884d == fVar.f45884d && Intrinsics.areEqual(this.f45885e, fVar.f45885e);
    }

    public final int hashCode() {
        return this.f45885e.hashCode() + r8.k.e(r8.k.e(r8.k.e(Boolean.hashCode(this.f45881a) * 31, 31, this.f45882b), 31, this.f45883c), 31, this.f45884d);
    }

    public final String toString() {
        v70.e eVarB = kotlin.collections.c0.b();
        if (this.f45881a) {
            eVarB.add("sessions");
        }
        if (this.f45882b) {
            eVarB.add("appLifecycles");
        }
        if (this.f45884d) {
            eVarB.add("deepLinks");
        }
        if (this.f45883c) {
            eVarB.add("screenViews");
        }
        List<u> list = this.f45885e;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((u) it.next()) instanceof s) {
                    eVarB.add("elementInteractions");
                    break;
                }
            }
        }
        if (list == null || !list.isEmpty()) {
            for (u uVar : list) {
                if ((uVar instanceof t) || (uVar instanceof r)) {
                    eVarB.add("frustrationInteractions");
                    break;
                }
            }
        }
        v70.e eVarA = kotlin.collections.c0.a(eVarB);
        return eVarA.isEmpty() ? "none" : CollectionsKt.U(eVarA, MessageLogView.COMMA_SEPARATOR, null, null, null, 62);
    }
}
