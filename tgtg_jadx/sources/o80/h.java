package o80;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32121d;

    public h(i iVar) {
        this.f32118a = 0;
        this.f32121d = iVar;
        this.f32120c = -2;
    }

    public void a() {
        Object objInvoke;
        int i11 = this.f32120c;
        i iVar = (i) this.f32121d;
        if (i11 == -2) {
            objInvoke = ((Function0) iVar.f32124c).invoke();
        } else {
            Function1 function1 = iVar.f32123b;
            Object obj = this.f32119b;
            obj.getClass();
            objInvoke = function1.invoke(obj);
        }
        this.f32119b = objInvoke;
        this.f32120c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32118a) {
            case 0:
                if (this.f32120c < 0) {
                    a();
                }
                return this.f32120c == 1;
            default:
                return this.f32120c < ((Map) this.f32121d).size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f32118a) {
            case 0:
                if (this.f32120c < 0) {
                    a();
                }
                if (this.f32120c == 0) {
                    i1.c();
                    return null;
                }
                Object obj = this.f32119b;
                obj.getClass();
                this.f32120c = -1;
                return obj;
            default:
                if (!hasNext()) {
                    i1.c();
                    return null;
                }
                Object obj2 = this.f32119b;
                this.f32120c++;
                Object obj3 = ((Map) this.f32121d).get(obj2);
                if (obj3 == null) {
                    throw new ConcurrentModificationException(org.bouncycastle.jcajce.provider.asymmetric.a.c(obj2, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                }
                this.f32119b = ((s3.a) obj3).f38817b;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f32118a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(Object obj, Map map) {
        this.f32118a = 1;
        this.f32119b = obj;
        this.f32121d = map;
    }
}
