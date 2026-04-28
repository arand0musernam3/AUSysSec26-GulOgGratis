package k00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends m implements NavigableMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f25678f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient y f25679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient l f25680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient q f25681e;

    static {
        y yVarO = r.o(u.f25693b);
        i iVar = l.f25666b;
        f25678f = new q(yVarO, w.f25698e, null);
    }

    public q(y yVar, l lVar, q qVar) {
        this.f25679c = yVar;
        this.f25680d = lVar;
        this.f25681e = qVar;
    }

    public static q b(TreeMap treeMap) {
        u uVar = u.f25693b;
        Comparator comparator = treeMap.comparator();
        int i11 = 1;
        boolean zEquals = comparator == null ? true : uVar.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(m.f25668b);
        int length = entryArr.length;
        if (length == 0) {
            return d(uVar);
        }
        int i12 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i13 = 0; i13 < 1; i13++) {
                if (objArr[i13] == null) {
                    c50.w.l(j4.s.f(i13, "at index "));
                    return null;
                }
            }
            y yVar = new y(l.j(1, objArr), uVar);
            Object[] objArr2 = {value};
            while (i12 < 1) {
                if (objArr2[i12] == null) {
                    c50.w.l(j4.s.f(i12, "at index "));
                    return null;
                }
                i12++;
            }
            return new q(yVar, l.j(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i12 < length) {
                Map.Entry entry2 = entryArr[i12];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                a.f(key2, value2);
                objArr3[i12] = key2;
                objArr4[i12] = value2;
                i12++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new a60.r(15));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            a.f(objArr3[0], value3);
            while (i11 < length) {
                Map.Entry entry4 = entryArr[i11 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i11];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                a.f(key4, value4);
                objArr3[i11] = key4;
                objArr4[i11] = value4;
                if (uVar.compare(key3, key4) == 0) {
                    i4.a.f(j4.s.k("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                    return null;
                }
                i11++;
                key3 = key4;
            }
        }
        return new q(new y(l.j(length, objArr3), uVar), l.j(length, objArr4), null);
    }

    public static q d(Comparator comparator) {
        if (u.f25693b.equals(comparator)) {
            return f25678f;
        }
        y yVarO = r.o(comparator);
        i iVar = l.f25666b;
        return new q(yVarO, w.f25698e, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f25679c.f25685d;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f25679c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        q qVar = this.f25681e;
        if (qVar != null) {
            return qVar;
        }
        boolean zIsEmpty = isEmpty();
        y yVar = this.f25679c;
        if (!zIsEmpty) {
            return new q((y) yVar.descendingSet(), this.f25680d.h(), this);
        }
        Comparator comparator = yVar.f25685d;
        return d((comparator instanceof v ? (v) comparator : new g(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final q headMap(Object obj, boolean z11) {
        obj.getClass();
        return h(0, this.f25679c.p(obj, z11));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final q subMap(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        if (this.f25679c.f25685d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z12).tailMap(obj, z11);
        }
        i4.a.f(a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().j().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f25679c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final q tailMap(Object obj, boolean z11) {
        obj.getClass();
        return h(this.f25679c.q(obj, z11), this.f25680d.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // k00.m, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            k00.y r0 = r3.f25679c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            k00.l r2 = r0.f25712f     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f25685d     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            k00.l r0 = r3.f25680d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k00.q.get(java.lang.Object):java.lang.Object");
    }

    public final q h(int i11, int i12) {
        l lVar = this.f25680d;
        if (i11 == 0) {
            if (i12 == lVar.size()) {
                return this;
            }
            i11 = 0;
        }
        y yVar = this.f25679c;
        return i11 == i12 ? d(yVar.f25685d) : new q(yVar.r(i11, i12), lVar.subList(i11, i12), null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f25679c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().j().get(this.f25680d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f25679c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f25679c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f25680d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f25680d;
    }
}
