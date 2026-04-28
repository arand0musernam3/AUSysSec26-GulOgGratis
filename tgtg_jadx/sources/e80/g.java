package e80;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends kotlin.collections.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f15860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15861b;

    public g(i iVar) {
        this.f15861b = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f15860a = arrayDeque;
        File file = iVar.f15863a;
        if (file.isDirectory()) {
            arrayDeque.push(a(file));
        } else if (!file.isFile()) {
            done();
        } else {
            file.getClass();
            arrayDeque.push(new d(file));
        }
    }

    public final b a(File file) {
        int i11 = f.$EnumSwitchMapping$0[this.f15861b.f15864b.ordinal()];
        if (i11 == 1) {
            return new e(this, file);
        }
        if (i11 == 2) {
            return new c(this, file);
        }
        e40.a.f();
        return null;
    }

    @Override // kotlin.collections.b
    public final void computeNext() {
        Object obj;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.f15860a;
            h hVar = (h) arrayDeque.peek();
            if (hVar == null) {
                obj = null;
                break;
            }
            fileA = hVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (Intrinsics.areEqual(fileA, hVar.f15862a) || !fileA.isDirectory() || arrayDeque.size() >= this.f15861b.f15868f) {
                break;
            } else {
                arrayDeque.push(a(fileA));
            }
        }
        obj = fileA;
        if (obj != null) {
            setNext(obj);
        } else {
            done();
        }
    }
}
