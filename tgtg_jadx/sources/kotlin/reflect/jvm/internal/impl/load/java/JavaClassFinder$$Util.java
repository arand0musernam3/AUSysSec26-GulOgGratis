package kotlin.reflect.jvm.internal.impl.load.java;

import com.braze.h2;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class JavaClassFinder$$Util {
    public static /* synthetic */ JavaPackage findPackage$default(JavaClassFinder javaClassFinder, FqName fqName, boolean z11, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: findPackage");
            return null;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return javaClassFinder.findPackage(fqName, z11);
    }
}
