package b9;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends LoaderManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f6073b;

    public e(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f6072a = lifecycleOwner;
        viewModelStore.getClass();
        y8.a aVar = y8.a.f45423b;
        aVar.getClass();
        a0 a0Var = new a0(viewModelStore, d.f6069c, aVar);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(d.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.f6073b = (d) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            i4.a.f("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public final void a() {
        d dVar = this.f6073b;
        boolean z11 = dVar.f6071b;
        l1 l1Var = dVar.f6070a;
        if (z11) {
            h2.b("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            h2.b("destroyLoader must be called on the main thread");
            return;
        }
        b bVar = (b) l1Var.b(54321);
        if (bVar != null) {
            bVar.l();
            int iA = r1.a.a(l1Var.f35788d, 54321, l1Var.f35786b);
            if (iA >= 0) {
                Object[] objArr = l1Var.f35787c;
                Object obj = objArr[iA];
                Object obj2 = q1.a0.f35712c;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    l1Var.f35785a = true;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.loader.app.LoaderManager
    public final c9.e c(int i11, a aVar) {
        d dVar = this.f6073b;
        boolean z11 = dVar.f6071b;
        l1 l1Var = dVar.f6070a;
        if (z11) {
            h2.b("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            h2.b("initLoader must be called on the main thread");
            return null;
        }
        b bVar = (b) l1Var.b(i11);
        ?? r32 = this.f6072a;
        if (bVar != 0) {
            c9.e eVar = bVar.f6063m;
            c cVar = new c(eVar, aVar);
            bVar.e(r32, cVar);
            c cVar2 = bVar.f6065o;
            if (cVar2 != null) {
                bVar.j(cVar2);
            }
            bVar.f6064n = r32;
            bVar.f6065o = cVar;
            return eVar;
        }
        try {
            dVar.f6071b = true;
            c9.e eVarOnCreateLoader = aVar.onCreateLoader(i11, null);
            if (eVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (eVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(eVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + eVarOnCreateLoader);
            }
            b bVar2 = new b(i11, eVarOnCreateLoader);
            l1Var.d(i11, bVar2);
            dVar.f6071b = false;
            c9.e eVar2 = bVar2.f6063m;
            c cVar3 = new c(eVar2, aVar);
            bVar2.e(r32, cVar3);
            c cVar4 = bVar2.f6065o;
            if (cVar4 != null) {
                bVar2.j(cVar4);
            }
            bVar2.f6064n = r32;
            bVar2.f6065o = cVar3;
            return eVar2;
        } catch (Throwable th2) {
            dVar.f6071b = false;
            throw th2;
        }
    }

    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        l1 l1Var = this.f6073b.f6070a;
        if (l1Var.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i11 = 0; i11 < l1Var.f(); i11++) {
                b bVar = (b) l1Var.h(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(l1Var.c(i11));
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(bVar.l);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                c9.e eVar = bVar.f6063m;
                printWriter.println(eVar);
                eVar.dump(str2.concat("  "), fileDescriptor, printWriter, strArr);
                if (bVar.f6065o != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bVar.f6065o);
                    c cVar = bVar.f6065o;
                    String strConcat = str2.concat("  ");
                    cVar.getClass();
                    printWriter.print(strConcat);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(cVar.f6068c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(eVar.dataToString(bVar.d()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(bVar.f3471c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f6072a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
