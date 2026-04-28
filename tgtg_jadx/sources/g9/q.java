package g9;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.l1;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20195a = new LinkedHashMap();

    @Override // androidx.lifecycle.l1
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f20195a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        u70.y yVar = u70.z.f40865b;
        sb2.append(kotlin.text.c0.c(iIdentityHashCode));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f20195a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
