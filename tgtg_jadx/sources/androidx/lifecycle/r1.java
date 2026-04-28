package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n20.f f3508b = new n20.f(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f3509a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, ViewModelProvider$Factory viewModelProvider$Factory) {
        this(s1Var.getViewModelStore(), viewModelProvider$Factory, s1Var instanceof p ? ((p) s1Var).getDefaultViewModelCreationExtras() : y8.a.f45423b);
        s1Var.getClass();
        viewModelProvider$Factory.getClass();
    }

    public final l1 a(KClass kClass) {
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        if (qualifiedName != null) {
            return this.f3509a.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), kClass);
        }
        i4.a.f("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public r1(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras) {
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        this.f3509a = new com.google.firebase.messaging.a0(viewModelStore, viewModelProvider$Factory, creationExtras);
    }
}
