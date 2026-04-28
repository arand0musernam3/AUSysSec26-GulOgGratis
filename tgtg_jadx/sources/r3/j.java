package r3;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q implements p3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f37599c;

    public /* synthetic */ j(b bVar, int i11) {
        this.f37598b = i11;
        this.f37599c = bVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.f37598b) {
        }
        return this.f37599c.f37579e;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f37598b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    b bVar = this.f37599c;
                    Object obj2 = bVar.get(key);
                    if (obj2 != null) {
                        return Intrinsics.areEqual(obj2, entry.getValue());
                    }
                    if (entry.getValue() == null && bVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f37599c.containsKey(obj);
        }
    }

    @Override // kotlin.collections.q, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f37598b) {
            case 0:
                l lVar = this.f37599c.f37578d;
                m[] mVarArr = new m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new n(0);
                }
                return new k(lVar, mVarArr);
            default:
                l lVar2 = this.f37599c.f37578d;
                m[] mVarArr2 = new m[8];
                for (int i12 = 0; i12 < 8; i12++) {
                    mVarArr2[i12] = new n(1);
                }
                return new k(lVar2, mVarArr2);
        }
    }
}
