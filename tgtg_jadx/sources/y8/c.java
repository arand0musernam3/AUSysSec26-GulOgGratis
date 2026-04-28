package y8;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import zc.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f45424a;

    public c(int i11) {
        switch (i11) {
            case 1:
                this.f45424a = new LinkedHashMap();
                break;
            default:
                this.f45424a = new LinkedHashMap();
                break;
        }
    }

    public void a(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        LinkedHashMap linkedHashMap = this.f45424a;
        if (linkedHashMap.containsKey(kClass)) {
            org.bouncycastle.jce.provider.a.g(kClass.getQualifiedName(), 46, "A `initializer` with the same `clazz` has already been added: ");
        } else {
            linkedHashMap.put(kClass, new e(kClass, function1));
        }
    }

    public o70.d b() {
        Collection collectionValues = this.f45424a.values();
        collectionValues.getClass();
        e[] eVarArr = (e[]) collectionValues.toArray(new e[0]);
        return new o70.d((e[]) Arrays.copyOf(eVarArr, eVarArr.length), 2);
    }

    public c(p pVar) {
        this.f45424a = x0.m(pVar.f47507a);
    }
}
