package v70;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends kotlin.collections.o implements Set, Serializable, KMutableSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final o f42061b = new o(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f42062c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f42063a;

    static {
        i.f42041n.getClass();
        f42062c = new p(i.f42042o);
    }

    public p() {
        this.f42063a = new i();
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42063a.f42054m) {
            return new l(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f42063a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.f42063a.d();
        return super.addAll(collection);
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f42063a.f42051i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f42063a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f42063a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f42063a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.f42063a;
        iVar.getClass();
        return new g(iVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        i iVar = this.f42063a;
        iVar.d();
        int iH = iVar.h(obj);
        if (iH < 0) {
            return false;
        }
        iVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f42063a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f42063a.d();
        return super.retainAll(collection);
    }

    public p(i iVar) {
        iVar.getClass();
        this.f42063a = iVar;
    }

    public p(int i11) {
        this.f42063a = new i(i11);
    }
}
