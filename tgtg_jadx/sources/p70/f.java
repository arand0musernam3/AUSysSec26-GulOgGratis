package p70;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.messaging.a0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements r70.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f34542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentActivity f34543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ag.c f34544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34545d = new Object();

    public f(ComponentActivity componentActivity) {
        this.f34542a = componentActivity;
        this.f34543b = componentActivity;
    }

    @Override // r70.b
    public final Object a() {
        if (this.f34544c == null) {
            synchronized (this.f34545d) {
                try {
                    if (this.f34544c == null) {
                        ComponentActivity componentActivity = this.f34542a;
                        o70.d dVar = new o70.d(this.f34543b, 1);
                        componentActivity.getClass();
                        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                        CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                        viewModelStore.getClass();
                        defaultViewModelCreationExtras.getClass();
                        a0 a0Var = new a0(viewModelStore, dVar, defaultViewModelCreationExtras);
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(d.class);
                        orCreateKotlinClass.getClass();
                        String qualifiedName = orCreateKotlinClass.getQualifiedName();
                        if (qualifiedName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.f34544c = ((d) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass)).f34540a;
                    }
                } finally {
                }
            }
        }
        return this.f34544c;
    }
}
