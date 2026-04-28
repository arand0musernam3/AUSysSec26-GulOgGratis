package p70;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.messaging.a0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements r70.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ag.b f34535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34536b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f34537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f34538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c40.i f34539e;

    public b(Activity activity) {
        this.f34537c = activity;
        this.f34538d = new f((ComponentActivity) activity);
    }

    @Override // r70.b
    public final Object a() {
        if (this.f34535a == null) {
            synchronized (this.f34536b) {
                try {
                    if (this.f34535a == null) {
                        this.f34535a = c();
                    }
                } finally {
                }
            }
        }
        return this.f34535a;
    }

    public final void b() {
        c40.i iVar = this.f34539e;
        if (iVar != null) {
            iVar.f7070b = null;
        }
    }

    public final ag.b c() {
        String str;
        Activity activity = this.f34537c;
        if (activity.getApplication() instanceof r70.b) {
            ag.c cVar = (ag.c) ((a) x0.q(a.class, this.f34538d));
            return new ag.b(cVar.f1291a, cVar.f1292b);
        }
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    public final void d() {
        f fVar = this.f34538d;
        ComponentActivity componentActivity = fVar.f34542a;
        o70.d dVar = new o70.d(fVar.f34543b, 1);
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
            i4.a.f("Local and anonymous classes can not be ViewModels");
            return;
        }
        c40.i iVar = ((d) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass)).f34541b;
        this.f34539e = iVar;
        if (((CreationExtras) iVar.f7070b) == null) {
            CreationExtras defaultViewModelCreationExtras2 = ((ComponentActivity) this.f34537c).getDefaultViewModelCreationExtras();
            ox.h.q(iVar.f7069a, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            iVar.f7070b = defaultViewModelCreationExtras2;
        }
    }
}
