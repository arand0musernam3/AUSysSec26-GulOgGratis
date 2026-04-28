package ke;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26295a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public we.a f26297c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26298d = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public we.a f26296b = a(0.0f);

    public c(List list) {
        this.f26295a = list;
    }

    public final we.a a(float f11) {
        List list = this.f26295a;
        we.a aVar = (we.a) list.get(list.size() - 1);
        if (f11 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            we.a aVar2 = (we.a) list.get(size);
            if (this.f26296b != aVar2 && f11 >= aVar2.b() && f11 < aVar2.a()) {
                return aVar2;
            }
        }
        return (we.a) list.get(0);
    }

    @Override // ke.b
    public final boolean b(float f11) {
        we.a aVar = this.f26297c;
        we.a aVar2 = this.f26296b;
        if (aVar == aVar2 && this.f26298d == f11) {
            return true;
        }
        this.f26297c = aVar2;
        this.f26298d = f11;
        return false;
    }

    @Override // ke.b
    public final we.a c() {
        return this.f26296b;
    }

    @Override // ke.b
    public final boolean d(float f11) {
        we.a aVar = this.f26296b;
        if (f11 >= aVar.b() && f11 < aVar.a()) {
            return !this.f26296b.c();
        }
        this.f26296b = a(f11);
        return true;
    }

    @Override // ke.b
    public final float g() {
        return ((we.a) this.f26295a.get(r0.size() - 1)).a();
    }

    @Override // ke.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // ke.b
    public final float l() {
        return ((we.a) this.f26295a.get(0)).b();
    }
}
