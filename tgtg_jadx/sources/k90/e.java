package k90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;
import m90.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements SerialDescriptor, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p30.b f26223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f26226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f26227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f26228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f26229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f26230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f26231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SerialDescriptor[] f26232k;
    public final t l;

    public e(String str, p30.b bVar, int i11, List list, a aVar) {
        list.getClass();
        this.f26222a = str;
        this.f26223b = bVar;
        this.f26224c = i11;
        this.f26225d = aVar.f26203b;
        ArrayList arrayList = aVar.f26204c;
        this.f26226e = CollectionsKt.p0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f26227f = strArr;
        this.f26228g = c1.c(aVar.f26206e);
        this.f26229h = (List[]) aVar.f26207f.toArray(new List[0]);
        this.f26230i = CollectionsKt.o0(aVar.f26208g);
        strArr.getClass();
        g gVar = new g(new jt.g(strArr, 9), 2);
        ArrayList arrayList2 = new ArrayList(e0.o(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            r0 r0Var = (r0) it;
            if (!r0Var.f26536b.hasNext()) {
                this.f26231j = x0.j(arrayList2);
                this.f26232k = c1.c(list);
                this.l = u70.l.b(new jt.g(this, 5));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) r0Var.next();
            arrayList2.add(new Pair(indexedValue.f26489b, Integer.valueOf(indexedValue.f26488a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f26222a;
    }

    @Override // m90.l
    public final Set b() {
        return this.f26226e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.f26231j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.f26224c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(this.f26222a, serialDescriptor.a()) && Arrays.equals(this.f26232k, ((e) obj).f26232k)) {
                int iE = serialDescriptor.e();
                int i11 = this.f26224c;
                if (i11 == iE) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        SerialDescriptor[] serialDescriptorArr = this.f26228g;
                        if (Intrinsics.areEqual(serialDescriptorArr[i12].a(), serialDescriptor.h(i12).a()) && Intrinsics.areEqual(serialDescriptorArr[i12].getKind(), serialDescriptor.h(i12).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        return this.f26227f[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        return this.f26229h[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f26225d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return this.f26223b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return this.f26228g[i11];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        return this.f26230i[i11];
    }

    public final String toString() {
        return c1.l(this);
    }
}
