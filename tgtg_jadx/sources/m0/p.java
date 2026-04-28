package m0;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.k f28573b;

    public p(ArrayList arrayList, s0.k kVar) {
        this.f28572a = arrayList;
        this.f28573b = kVar;
        pd.g.i("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.f28572a;
        pd.g.n("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) CollectionsKt.O(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f28572a, pVar.f28572a) && Intrinsics.areEqual(this.f28573b, pVar.f28573b);
    }

    public final int hashCode() {
        int iHashCode = this.f28572a.hashCode() * 31;
        s0.k kVar = this.f28573b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CameraIdentifier{cameraIds=");
        sb2.append(CollectionsKt.U(this.f28572a, MessageLogView.COMMA_SEPARATOR, null, null, null, 62));
        s0.k kVar = this.f28573b;
        if (kVar != null) {
            str = ", compatId=" + kVar;
        } else {
            str = "";
        }
        return w2.l1.f(sb2, str, '}');
    }
}
