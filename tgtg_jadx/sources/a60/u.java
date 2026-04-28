package a60;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f919b;

    public /* synthetic */ u(w wVar, int i11) {
        this.f918a = i11;
        this.f919b = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f918a) {
            case 0:
                this.f919b.clear();
                break;
            default:
                this.f919b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        v vVarA;
        Object obj2;
        Object value;
        switch (this.f918a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                w wVar = this.f919b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                v vVar = null;
                if (key != null) {
                    try {
                        vVarA = wVar.a(key, false);
                    } catch (ClassCastException unused) {
                        vVarA = null;
                    }
                    break;
                } else {
                    vVarA = null;
                }
                if (vVarA != null && ((obj2 = vVarA.f927h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    vVar = vVarA;
                }
                return vVar != null;
            default:
                return this.f919b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f918a) {
            case 0:
                return new t(this.f919b, 0);
            default:
                return new t(this.f919b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        v vVarA;
        Object obj2;
        Object value;
        switch (this.f918a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    w wVar = this.f919b;
                    v vVar = null;
                    if (key != null) {
                        try {
                            vVarA = wVar.a(key, false);
                        } catch (ClassCastException unused) {
                            vVarA = null;
                        }
                    } else {
                        vVarA = null;
                    }
                    if (vVarA != null && ((obj2 = vVarA.f927h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        vVar = vVarA;
                    }
                    if (vVar != null) {
                        wVar.d(vVar, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                w wVar2 = this.f919b;
                v vVarA2 = null;
                if (obj != null) {
                    try {
                        vVarA2 = wVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (vVarA2 != null) {
                    wVar2.d(vVarA2, true);
                }
                if (vVarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f918a) {
        }
        return this.f919b.f933d;
    }
}
