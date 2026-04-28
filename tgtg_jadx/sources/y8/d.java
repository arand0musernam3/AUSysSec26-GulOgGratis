package y8;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends CreationExtras {
    public d(CreationExtras creationExtras) {
        creationExtras.getClass();
        LinkedHashMap linkedHashMap = creationExtras.f3543a;
        linkedHashMap.getClass();
        this.f3543a.putAll(linkedHashMap);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public final Object a(b bVar) {
        return this.f3543a.get(bVar);
    }

    public /* synthetic */ d(int i11) {
        this(a.f45423b);
    }
}
