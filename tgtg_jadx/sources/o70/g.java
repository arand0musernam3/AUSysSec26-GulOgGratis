package o70;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.l1;
import androidx.lifecycle.viewmodel.CreationExtras;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l20.c f32044d = new l20.c(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s70.b f32045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelProvider$Factory f32046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f32047c;

    public g(s70.b bVar, ViewModelProvider$Factory viewModelProvider$Factory, a8.h hVar) {
        this.f32045a = bVar;
        this.f32046b = viewModelProvider$Factory;
        this.f32047c = new d(hVar, 0);
    }

    public static g a(ComponentActivity componentActivity, ViewModelProvider$Factory viewModelProvider$Factory) {
        ag.b bVar = (ag.b) ((e) x0.q(e.class, componentActivity));
        return new g(bVar.a(), viewModelProvider$Factory, new a8.h(bVar.f1288a, bVar.f1289b));
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls, CreationExtras creationExtras) {
        return this.f32045a.containsKey(cls) ? this.f32047c.create(cls, creationExtras) : this.f32046b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls) {
        if (!this.f32045a.containsKey(cls)) {
            return this.f32046b.create(cls);
        }
        this.f32047c.create(cls);
        throw null;
    }
}
