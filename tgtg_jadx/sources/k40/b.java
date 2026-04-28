package k40;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import d8.f;
import g8.k;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import v80.f0;
import v80.p0;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25951d = {Reflection.property2(new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f25953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f25954c;

    public b(Context context, String str) {
        context.getClass();
        this.f25952a = str;
        this.f25953b = new ThreadLocal();
        final int i11 = 0;
        e8.a aVar = new e8.a(new Function1(this) { // from class: k40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f25950b;

            {
                this.f25950b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        corruptionException.getClass();
                        Log.w(Reflection.getOrCreateKotlinClass(b.class).getSimpleName(), "CorruptionException in " + this.f25950b.f25952a + " DataStore running in process " + Process.myPid(), corruptionException);
                        return e.o();
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        return c0.c(k.a(context2, this.f25950b.f25952a, k.f20094a));
                }
            }
        });
        final int i12 = 1;
        Function1 function1 = new Function1(this) { // from class: k40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f25950b;

            {
                this.f25950b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        corruptionException.getClass();
                        Log.w(Reflection.getOrCreateKotlinClass(b.class).getSimpleName(), "CorruptionException in " + this.f25950b.f25952a + " DataStore running in process " + Process.myPid(), corruptionException);
                        return e.o();
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        return c0.c(k.a(context2, this.f25950b.f25952a, k.f20094a));
                }
            }
        };
        c90.f fVar = p0.f42144a;
        this.f25954c = (f) new g8.a(str, aVar, function1, f0.b(c90.e.f7834b.plus(f0.d()))).getValue(context, f25951d[0]);
    }

    public final void a(Function1 function1) {
    }
}
